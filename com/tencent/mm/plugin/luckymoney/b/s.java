package com.tencent.mm.plugin.luckymoney.b;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class s extends r {
    public s(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Map hashMap = new HashMap();
        hashMap.put("appId", str);
        hashMap.put("timeStamp", str2);
        hashMap.put("nonceStr", str3);
        if (str4 != null) {
            hashMap.put("package", URLEncoder.encode(str4));
        }
        hashMap.put("signType", str5);
        if (str6 != null) {
            hashMap.put("paySign", URLEncoder.encode(str6));
        }
        hashMap.put("way", "3");
        if (str7 != null) {
            hashMap.put("jsapiH5Url", URLEncoder.encode(str7));
        }
        F(hashMap);
    }

    public s(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Map hashMap = new HashMap();
        hashMap.put("appId", str);
        hashMap.put("timeStamp", str2);
        hashMap.put("nonceStr", str3);
        if (str4 != null) {
            hashMap.put("package", URLEncoder.encode(str4));
        }
        hashMap.put("signType", str5);
        if (str6 != null) {
            hashMap.put("paySign", URLEncoder.encode(str6));
        }
        hashMap.put("way", "4");
        if (str7 != null) {
            hashMap.put("androidSign", URLEncoder.encode(str7));
        }
        if (str8 != null) {
            hashMap.put("androidPackage", URLEncoder.encode(str8));
        }
        F(hashMap);
    }

    public final int aBM() {
        return 2;
    }

    public final void a(int i, String str, JSONObject jSONObject) {
    }
}
