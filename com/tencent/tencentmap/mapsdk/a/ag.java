package com.tencent.tencentmap.mapsdk.a;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ag {
    private static ClassLoader a = null;
    private static boolean b = true;

    private static void a(ArrayList<String> arrayList, String str) {
        int length = str.length();
        while (str.charAt(length - 1) == '>') {
            length--;
            if (length == 0) {
                break;
            }
        }
        arrayList.add(0, c(str.substring(0, length)));
    }

    public static ArrayList<String> a(String str) {
        ArrayList<String> arrayList = new ArrayList();
        int indexOf = str.indexOf("<");
        int i = 0;
        while (i < indexOf) {
            a(arrayList, str.substring(i, indexOf));
            i = indexOf + 1;
            indexOf = str.indexOf("<", i);
            int indexOf2 = str.indexOf(",", i);
            if (indexOf == -1) {
                indexOf = indexOf2;
            }
            if (indexOf2 != -1 && indexOf2 < indexOf) {
                indexOf = indexOf2;
            }
        }
        a(arrayList, str.substring(i, str.length()));
        return arrayList;
    }

    public static String a(ArrayList<String> arrayList) {
        int i;
        StringBuffer stringBuffer = new StringBuffer();
        for (i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, b((String) arrayList.get(i)));
        }
        Collections.reverse(arrayList);
        for (i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            if (str.equals("list")) {
                arrayList.set(i - 1, "<" + ((String) arrayList.get(i - 1)));
                arrayList.set(0, ((String) arrayList.get(0)) + ">");
            } else if (str.equals("map")) {
                arrayList.set(i - 1, "<" + ((String) arrayList.get(i - 1)) + ",");
                arrayList.set(0, ((String) arrayList.get(0)) + ">");
            } else if (str.equals("Array")) {
                arrayList.set(i - 1, "<" + ((String) arrayList.get(i - 1)));
                arrayList.set(0, ((String) arrayList.get(0)) + ">");
            }
        }
        Collections.reverse(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append((String) it.next());
        }
        return stringBuffer.toString();
    }

    public static Object a(String str, boolean z, ClassLoader classLoader) {
        Iterator it = a(str).iterator();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (it.hasNext()) {
            Object obj4;
            Object b = b((String) it.next(), z, classLoader);
            if (b instanceof String) {
                if ("Array".equals((String) b)) {
                    if (obj3 == null) {
                        obj = Array.newInstance(Byte.class, 0);
                    }
                } else if (!"?".equals((String) b)) {
                    if (obj3 == null) {
                        obj = b;
                        obj3 = b;
                    } else {
                        obj = b;
                        obj2 = obj3;
                        obj3 = b;
                    }
                }
                obj4 = obj3;
            } else if (b instanceof List) {
                if (obj3 == null || !(obj3 instanceof Byte)) {
                    if (obj3 != null) {
                        ((List) b).add(obj3);
                    }
                    obj = b;
                    obj3 = null;
                } else {
                    b = Array.newInstance(Byte.class, 1);
                    Array.set(b, 0, obj3);
                    obj = b;
                }
            } else if (b instanceof Map) {
                if (((obj2 != null ? 1 : 0) & (obj3 != null ? 1 : 0)) != 0) {
                    ((Map) b).put(obj3, obj2);
                }
                obj = b;
                obj2 = null;
                obj3 = null;
            } else if (obj3 == null) {
                obj = b;
                obj3 = b;
            } else {
                obj2 = obj3;
                obj4 = b;
            }
            obj = b;
            obj3 = obj4;
        }
        return obj;
    }

    public static Object b(String str, boolean z, ClassLoader classLoader) {
        if (str.equals("java.lang.Integer")) {
            return Integer.valueOf(0);
        }
        if (str.equals("java.lang.Boolean")) {
            return Boolean.valueOf(false);
        }
        if (str.equals("java.lang.Byte")) {
            return Byte.valueOf((byte) 0);
        }
        if (str.equals("java.lang.Double")) {
            return Double.valueOf(0.0d);
        }
        if (str.equals("java.lang.Float")) {
            return Float.valueOf(0.0f);
        }
        if (str.equals("java.lang.Long")) {
            return Long.valueOf(0);
        }
        if (str.equals("java.lang.Short")) {
            return Short.valueOf((short) 0);
        }
        if (str.equals("java.lang.Character")) {
            throw new IllegalArgumentException("can not support java.lang.Character");
        } else if (str.equals("java.lang.String")) {
            return "";
        } else {
            if (str.equals("java.util.List")) {
                return new ArrayList();
            }
            if (str.equals("java.util.Map")) {
                return new HashMap();
            }
            if (str.equals("Array")) {
                return "Array";
            }
            if (str.equals("?")) {
                return str;
            }
            Class cls;
            if (classLoader != null) {
                try {
                    cls = Class.forName(str, z, classLoader);
                } catch (Exception e) {
                    throw new bh(e);
                }
            } else if (a != null) {
                cls = Class.forName(str, b, a);
            } else {
                cls = Class.forName(str);
            }
            return cls.getConstructor(new Class[0]).newInstance(new Object[0]);
        }
    }

    public static String b(String str) {
        if (str.equals("java.lang.Integer") || str.equals("int")) {
            return "int32";
        }
        if (str.equals("java.lang.Boolean") || str.equals("boolean")) {
            return "bool";
        }
        if (str.equals("java.lang.Byte") || str.equals("byte")) {
            return "char";
        }
        if (str.equals("java.lang.Double") || str.equals("double")) {
            return "double";
        }
        if (str.equals("java.lang.Float") || str.equals("float")) {
            return "float";
        }
        if (str.equals("java.lang.Long") || str.equals("long")) {
            return "int64";
        }
        if (str.equals("java.lang.Short") || str.equals("short")) {
            return "short";
        }
        if (str.equals("java.lang.Character")) {
            throw new IllegalArgumentException("can not support java.lang.Character");
        } else if (str.equals("java.lang.String")) {
            return "string";
        } else {
            if (str.equals("java.util.List")) {
                return "list";
            }
            if (str.equals("java.util.Map")) {
                return "map";
            }
            return str;
        }
    }

    public static String c(String str) {
        if (str.equals("int32")) {
            return "java.lang.Integer";
        }
        if (str.equals("bool")) {
            return "java.lang.Boolean";
        }
        if (str.equals("char")) {
            return "java.lang.Byte";
        }
        if (str.equals("double")) {
            return "java.lang.Double";
        }
        if (str.equals("float")) {
            return "java.lang.Float";
        }
        if (str.equals("int64")) {
            return "java.lang.Long";
        }
        if (str.equals("short")) {
            return "java.lang.Short";
        }
        if (str.equals("string")) {
            return "java.lang.String";
        }
        if (str.equals("list")) {
            return "java.util.List";
        }
        if (str.equals("map")) {
            return "java.util.Map";
        }
        return str;
    }
}
