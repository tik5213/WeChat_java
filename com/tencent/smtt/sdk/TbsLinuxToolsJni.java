package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.utils.TbsLog;
import java.io.File;

class TbsLinuxToolsJni {
    private static boolean a = false;
    private static boolean b = false;

    public TbsLinuxToolsJni(Context context) {
        a(context);
    }

    private native int ChmodInner(String str, String str2);

    private void a(Context context) {
        synchronized (TbsLinuxToolsJni.class) {
            if (b) {
                return;
            }
            b = true;
            try {
                File file;
                if (TbsShareManager.isThirdPartyApp(context)) {
                    String a = TbsShareManager.a();
                    file = new File(a == null ? TbsShareManager.c(context) : a);
                } else {
                    file = an.a().q(context);
                }
                if (file != null) {
                    if (!(new File(file.getAbsolutePath() + File.separator + "liblinuxtoolsfortbssdk_jni.so").exists() || TbsShareManager.isThirdPartyApp(context))) {
                        file = an.a().p(context);
                    }
                    if (file != null) {
                        System.load(file.getAbsolutePath() + File.separator + "liblinuxtoolsfortbssdk_jni.so");
                        a = true;
                    }
                }
                ChmodInner("/checkChmodeExists", "700");
            } catch (Throwable th) {
                a = false;
            }
            return;
        }
    }

    public int a(String str, String str2) {
        if (a) {
            return ChmodInner(str, str2);
        }
        TbsLog.e("TbsLinuxToolsJni", "jni not loaded!", true);
        return -1;
    }
}
