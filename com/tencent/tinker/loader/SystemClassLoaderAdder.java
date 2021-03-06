package com.tencent.tinker.loader;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Build.VERSION;
import com.tencent.tinker.loader.shareutil.ShareConstants;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareReflectUtil;
import dalvik.system.DexFile;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.zip.ZipFile;

public class SystemClassLoaderAdder {
    private static int vtj = 0;

    private static final class V14 {
        private V14() {
        }

        static /* synthetic */ void a(ClassLoader classLoader, List list, File file) {
            Object obj = ShareReflectUtil.b(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList(list);
            ShareReflectUtil.c(obj, "dexElements", (Object[]) ShareReflectUtil.b(obj, "makeDexElements", ArrayList.class, File.class).invoke(obj, new Object[]{arrayList, file}));
        }
    }

    private static final class V19 {
        private V19() {
        }

        static /* synthetic */ void b(ClassLoader classLoader, List list, File file) {
            Object obj = ShareReflectUtil.b(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            ShareReflectUtil.c(obj, "dexElements", a(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    throw ((IOException) it.next());
                }
            }
        }

        private static Object[] a(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
            Method b;
            try {
                b = ShareReflectUtil.b(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class);
            } catch (NoSuchMethodException e) {
                try {
                    b = ShareReflectUtil.b(obj, "makeDexElements", List.class, File.class, List.class);
                } catch (NoSuchMethodException e2) {
                    throw e2;
                }
            }
            return (Object[]) b.invoke(obj, new Object[]{arrayList, file, arrayList2});
        }
    }

    private static final class V23 {
        private V23() {
        }

        static /* synthetic */ void c(ClassLoader classLoader, List list, File file) {
            Object obj = ShareReflectUtil.b(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            ShareReflectUtil.c(obj, "dexElements", c(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    throw ((IOException) it.next());
                }
            }
        }

        private static Object[] c(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) {
            Method b;
            try {
                b = ShareReflectUtil.b(obj, "makePathElements", List.class, File.class, List.class);
            } catch (NoSuchMethodException e) {
                try {
                    b = ShareReflectUtil.b(obj, "makePathElements", ArrayList.class, File.class, ArrayList.class);
                } catch (NoSuchMethodException e2) {
                    try {
                        return V19.a(obj, arrayList, file, arrayList2);
                    } catch (NoSuchMethodException e3) {
                        throw e3;
                    }
                }
            }
            return (Object[]) b.invoke(obj, new Object[]{arrayList, file, arrayList2});
        }
    }

    private static final class V4 {
        private V4() {
        }

        static /* synthetic */ void d(ClassLoader classLoader, List list, File file) {
            int size = list.size();
            Field b = ShareReflectUtil.b(classLoader, "path");
            StringBuilder stringBuilder = new StringBuilder((String) b.get(classLoader));
            Object[] objArr = new String[size];
            Object[] objArr2 = new File[size];
            Object[] objArr3 = new ZipFile[size];
            Object[] objArr4 = new DexFile[size];
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File file2 = (File) listIterator.next();
                String absolutePath = file2.getAbsolutePath();
                stringBuilder.append(':').append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                objArr[previousIndex] = absolutePath;
                objArr2[previousIndex] = file2;
                objArr3[previousIndex] = new ZipFile(file2);
                objArr4[previousIndex] = DexFile.loadDex(absolutePath, SharePatchFileUtil.m(file2, file), 0);
            }
            b.set(classLoader, stringBuilder.toString());
            ShareReflectUtil.c((Object) classLoader, "mPaths", objArr);
            ShareReflectUtil.c((Object) classLoader, "mFiles", objArr2);
            ShareReflectUtil.c((Object) classLoader, "mZips", objArr3);
            try {
                ShareReflectUtil.c((Object) classLoader, "mDexs", objArr4);
            } catch (Exception e) {
            }
        }
    }

    @SuppressLint({"NewApi"})
    public static void a(Application application, PathClassLoader pathClassLoader, File file, List<File> list) {
        new StringBuilder("installDexes dexOptDir: ").append(file.getAbsolutePath()).append(", dex size:").append(list.size());
        if (!list.isEmpty()) {
            ClassLoader pathClassLoader2;
            List ek = ek(list);
            if (VERSION.SDK_INT >= 24 && !ej(ek)) {
                pathClassLoader2 = AndroidNClassLoader.a(pathClassLoader2, application);
            }
            if (VERSION.SDK_INT >= 23) {
                V23.c(pathClassLoader2, ek, file);
            } else if (VERSION.SDK_INT >= 19) {
                V19.b(pathClassLoader2, ek, file);
            } else if (VERSION.SDK_INT >= 14) {
                V14.a(pathClassLoader2, ek, file);
            } else {
                V4.d(pathClassLoader2, ek, file);
            }
            vtj = ek.size();
            new StringBuilder("after loaded classloader: ").append(pathClassLoader2).append(", dex size:").append(vtj);
            if (!((Boolean) ShareReflectUtil.d(Class.forName("com.tencent.tinker.loader.TinkerTestDexLoad", true, pathClassLoader2), "isPatch").get(null)).booleanValue()) {
                a(pathClassLoader2);
                throw new TinkerRuntimeException("checkDexInstall failed");
            }
        }
    }

    public static void a(ClassLoader classLoader) {
        if (vtj > 0) {
            if (VERSION.SDK_INT >= 14) {
                ShareReflectUtil.a(ShareReflectUtil.b(classLoader, "pathList").get(classLoader), "dexElements", vtj);
                return;
            }
            ShareReflectUtil.a(classLoader, "mPaths", vtj);
            ShareReflectUtil.a(classLoader, "mFiles", vtj);
            ShareReflectUtil.a(classLoader, "mZips", vtj);
            try {
                ShareReflectUtil.a(classLoader, "mDexs", vtj);
            } catch (Exception e) {
            }
        }
    }

    private static boolean ej(List<File> list) {
        if (!list.isEmpty()) {
            for (File file : list) {
                if (file != null && file.getName().startsWith("changed_classes.dex")) {
                    return true;
                }
            }
        }
        return false;
    }

    private static List<File> ek(List<File> list) {
        List<File> arrayList = new ArrayList(list);
        final Map hashMap = new HashMap();
        for (File name : arrayList) {
            CharSequence name2 = name.getName();
            hashMap.put(name2, Boolean.valueOf(ShareConstants.vuy.matcher(name2).matches()));
        }
        Collections.sort(arrayList, new Comparator<File>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                File file = (File) obj;
                File file2 = (File) obj2;
                if (file == null && file2 == null) {
                    return 0;
                }
                if (file == null) {
                    return -1;
                }
                if (file2 == null) {
                    return 1;
                }
                String name = file.getName();
                String name2 = file2.getName();
                if (name.equals(name2)) {
                    return 0;
                }
                if (name.startsWith("test.dex")) {
                    return 1;
                }
                if (name2.startsWith("test.dex")) {
                    return -1;
                }
                boolean booleanValue = ((Boolean) hashMap.get(name)).booleanValue();
                boolean booleanValue2 = ((Boolean) hashMap.get(name2)).booleanValue();
                if (booleanValue && booleanValue2) {
                    int indexOf = name.indexOf(46);
                    int indexOf2 = name2.indexOf(46);
                    int parseInt = indexOf > 7 ? Integer.parseInt(name.substring(7, indexOf)) : 1;
                    indexOf = indexOf2 > 7 ? Integer.parseInt(name2.substring(7, indexOf2)) : 1;
                    if (parseInt == indexOf) {
                        return 0;
                    }
                    return parseInt < indexOf ? -1 : 1;
                } else if (booleanValue) {
                    return -1;
                } else {
                    return booleanValue2 ? 1 : name.compareTo(name2);
                }
            }
        });
        return arrayList;
    }
}
