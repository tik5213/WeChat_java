package com.tencent.mm.plugin.wallet_core.id_verify.model;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.tenpay.model.i;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a extends i {
    public a(int i) {
        Map hashMap = new HashMap();
        hashMap.put("scene", String.valueOf(i));
        F(hashMap);
    }

    public final int aBO() {
        return 1584;
    }

    public final void a(int i, String str, JSONObject jSONObject) {
        x.i("MicroMsg.NetSceneAgreeDisclaimer", "errCode = " + i + ";errMsg = " + str);
    }

    public final int If() {
        return 1584;
    }

    public final String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/realnamesetduty";
    }
}
