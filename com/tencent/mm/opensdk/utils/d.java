package com.tencent.mm.opensdk.utils;

public final class d {
    public static boolean a(String str) {
        return str == null || str.length() <= 0;
    }

    public static int b(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return str.length() <= 0 ? 0 : Integer.parseInt(str);
        } catch (Exception e) {
            return 0;
        }
    }
}
