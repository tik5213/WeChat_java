package com.tencent.mm.plugin.appbrand.config;

import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.sdk.platformtools.x;

public enum i {
    ;

    public static int rP(String str) {
        int i;
        WxaAttributes f = e.aba().f(str, new String[]{"dynamicInfo"});
        String str2 = "MicroMsg.AppServiceSettingMMManager";
        String str3 = "readAppFileStorageMaxSizeInBytes, appId = %s, MaxLocalstorageSize = %d";
        Object[] objArr = new Object[2];
        objArr[0] = str;
        if (f == null) {
            i = -1;
        } else {
            i = f.aek().fsb.fsd;
        }
        objArr[1] = Integer.valueOf(i);
        x.i(str2, str3, objArr);
        if (f != null) {
            i = f.aek().fsb.fsd;
        } else {
            i = 5;
        }
        return i * 1048576;
    }
}
