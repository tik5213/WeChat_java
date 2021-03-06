package com.tencent.mm.ipcinvoker.g;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public final class b {
    public static <T> T e(String str, Class<?> cls) {
        T t = null;
        if (str == null || str.length() == 0) {
            com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "newInstance failed, class is null or nil.", new Object[0]);
            return t;
        } else if (cls == null) {
            com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "newInstance failed, parent class is null.", new Object[0]);
            return t;
        } else {
            try {
                Class cls2 = Class.forName(str);
                if (cls.isAssignableFrom(cls2)) {
                    Constructor declaredConstructor = cls2.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    return declaredConstructor.newInstance(new Object[0]);
                }
                com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "%s isAssignableFrom %s return false", cls, cls2);
                return t;
            } catch (ClassNotFoundException e) {
                com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", e);
                return t;
            } catch (IllegalAccessException e2) {
                com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", e2);
                return t;
            } catch (InstantiationException e3) {
                com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", e3);
                return t;
            } catch (NoSuchMethodException e4) {
                com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", e4);
                return t;
            } catch (InvocationTargetException e5) {
                com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", e5);
                return t;
            }
        }
    }

    public static <T> T b(Class<?> cls, Class<?> cls2) {
        T t = null;
        if (cls == null) {
            com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "newInstance failed, class is null or nil.", new Object[0]);
            return t;
        } else if (cls2 == null) {
            com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "newInstance failed, parent class is null.", new Object[0]);
            return t;
        } else {
            try {
                if (cls2.isAssignableFrom(cls)) {
                    Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    return declaredConstructor.newInstance(new Object[0]);
                }
                com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "%s isAssignableFrom %s return false", cls2, cls);
                return t;
            } catch (IllegalAccessException e) {
                com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", e);
                return t;
            } catch (InstantiationException e2) {
                com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", e2);
                return t;
            } catch (NoSuchMethodException e3) {
                com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", e3);
                return t;
            } catch (InvocationTargetException e4) {
                com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", e4);
                return t;
            }
        }
    }

    public static <T> T i(Class<?> cls) {
        T t = null;
        if (cls == null) {
            com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "newInstance failed, class is null or nil.", new Object[0]);
            return t;
        }
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", e);
            return t;
        } catch (InstantiationException e2) {
            com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", e2);
            return t;
        } catch (NoSuchMethodException e3) {
            com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", e3);
            return t;
        } catch (InvocationTargetException e4) {
            com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", e4);
            return t;
        }
    }
}
