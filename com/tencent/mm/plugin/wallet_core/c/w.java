package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.mm.wallet_core.tenpay.model.i;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class w extends i {
    public String pjE;

    public w(String str, int i, String str2, String str3, String str4, String str5) {
        Map hashMap = new HashMap();
        hashMap.put("passwd", str);
        hashMap.put("check_pwd_scene", String.valueOf(i));
        hashMap.put("package", URLEncoder.encode(str2));
        hashMap.put("sign", str3);
        hashMap.put("sign_type", str4);
        hashMap.put("busi_id", str5);
        F(hashMap);
    }

    public w(String str, int i, String str2, String str3, String str4, String str5, int i2, String str6, String str7) {
        Map hashMap = new HashMap();
        hashMap.put("passwd", str);
        hashMap.put("check_pwd_scene", String.valueOf(i));
        hashMap.put("package", URLEncoder.encode(str2));
        hashMap.put("sign", str3);
        hashMap.put("sign_type", str4);
        hashMap.put("busi_id", str5);
        hashMap.put("use_touch", String.valueOf(i2));
        F(hashMap);
        hashMap = new HashMap();
        hashMap.put("soter_req", str6);
        hashMap.put("fingerData", str7);
        aC(hashMap);
    }

    public final int aBO() {
        return 2704;
    }

    public final int If() {
        return 2704;
    }

    public final String getUri() {
        return "/cgi-bin/mmpay-bin/getpaypwdtoken";
    }

    public final void a(int i, String str, JSONObject jSONObject) {
        this.pjE = jSONObject.optString("usertoken", "");
    }

    public final boolean bOn() {
        return true;
    }
}
