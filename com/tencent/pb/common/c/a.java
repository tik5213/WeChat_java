package com.tencent.pb.common.c;

import android.content.Context;
import java.io.File;

public final class a {
    public static boolean o(String str, Context context) {
        String file;
        int lastIndexOf;
        try {
            file = context.getCacheDir().toString();
            if (file.endsWith("/")) {
                file = file.substring(0, file.length() - 2);
            }
            lastIndexOf = file.lastIndexOf(47);
            if (lastIndexOf != -1) {
                file = file.substring(0, lastIndexOf) + "/lib/";
            } else {
                file = "";
            }
        } catch (Exception e) {
            file = "/data/data/" + context.getPackageName() + "/lib/";
        }
        if (file.length() != 0) {
            String str2;
            int i;
            if (new File(file + str).exists()) {
                try {
                    c.d("loadLibrary", new Object[]{"try to load library: " + file + str});
                    System.load(file + str);
                    lastIndexOf = 1;
                } catch (UnsatisfiedLinkError e2) {
                    f.u(146, 3, "case1:" + file + str);
                    c.x("loadLibrary", new Object[]{"cannot load library " + file + str});
                }
                if (lastIndexOf == 0 || str.endsWith(".so")) {
                    str2 = str;
                } else {
                    str2 = str + ".so";
                    if (new File(file + str2).exists()) {
                        try {
                            c.d("loadLibrary", new Object[]{"try to load library: " + file + str2});
                            System.load(file + str2);
                            lastIndexOf = 1;
                        } catch (UnsatisfiedLinkError e3) {
                            c.x("loadLibrary", new Object[]{"cannot load library " + file + str2});
                            f.u(146, 3, "case2:" + file + str2);
                        }
                    }
                }
                if (lastIndexOf == 0 && !str2.startsWith("lib")) {
                    str2 = "lib" + str2;
                    if (new File(file + str2).exists()) {
                        try {
                            c.d("loadLibrary", new Object[]{"try to load library: " + file + str2});
                            System.load(file + str2);
                            i = 1;
                        } catch (UnsatisfiedLinkError e4) {
                            c.x("loadLibrary", new Object[]{"cannot load library " + file + str2});
                            f.u(146, 3, "case3:" + file + str2);
                        }
                        if (i == 0) {
                            try {
                                c.d("loadLibrary", new Object[]{"try to load library: " + str + " with default path"});
                                System.loadLibrary(str);
                            } catch (UnsatisfiedLinkError e5) {
                                c.x("loadLibrary", new Object[]{"cannot load library " + str});
                                f.u(146, 3, "case4:" + str);
                                return false;
                            }
                        }
                    }
                }
                i = lastIndexOf;
                if (i == 0) {
                    try {
                        c.d("loadLibrary", new Object[]{"try to load library: " + str + " with default path"});
                        System.loadLibrary(str);
                    } catch (UnsatisfiedLinkError e52) {
                        c.x("loadLibrary", new Object[]{"cannot load library " + str});
                        f.u(146, 3, "case4:" + str);
                        return false;
                    }
                }
            }
            lastIndexOf = 0;
            if (lastIndexOf == 0) {
            }
            str2 = str;
            str2 = "lib" + str2;
            if (new File(file + str2).exists()) {
                try {
                    c.d("loadLibrary", new Object[]{"try to load library: " + file + str2});
                    System.load(file + str2);
                    i = 1;
                } catch (UnsatisfiedLinkError e42) {
                    c.x("loadLibrary", new Object[]{"cannot load library " + file + str2});
                    f.u(146, 3, "case3:" + file + str2);
                }
                if (i == 0) {
                    try {
                        c.d("loadLibrary", new Object[]{"try to load library: " + str + " with default path"});
                        System.loadLibrary(str);
                    } catch (UnsatisfiedLinkError e522) {
                        c.x("loadLibrary", new Object[]{"cannot load library " + str});
                        f.u(146, 3, "case4:" + str);
                        return false;
                    }
                }
            }
            i = lastIndexOf;
            if (i == 0) {
                try {
                    c.d("loadLibrary", new Object[]{"try to load library: " + str + " with default path"});
                    System.loadLibrary(str);
                } catch (UnsatisfiedLinkError e5222) {
                    c.x("loadLibrary", new Object[]{"cannot load library " + str});
                    f.u(146, 3, "case4:" + str);
                    return false;
                }
            }
        }
        try {
            c.d("loadLibrary", new Object[]{"try to load library: " + str + " with default path"});
            System.loadLibrary(str);
        } catch (UnsatisfiedLinkError e6) {
            c.x("loadLibrary", new Object[]{"cannot load library " + str});
            f.u(146, 3, "case5:" + str);
            return false;
        }
        return true;
    }
}
