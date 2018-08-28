package com.tencent.mm.plugin.appbrand.dynamic.d;

import com.tencent.mm.plugin.appbrand.dynamic.d.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.u.b.b;
import org.json.JSONArray;
import org.json.JSONObject;

public final class k extends a {
    public k(int i) {
        super("reportKeyValue", i);
    }

    protected final void a(com.tencent.mm.u.c.a aVar, JSONObject jSONObject, b.a<JSONObject> aVar2) {
        if (com.tencent.mm.plugin.appbrand.dynamic.k.sA(aVar.Da().getString("__page_view_id", null)) == null) {
            aVar2.aA(a(false, "JsApi Framework Context is null", null));
            return;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("dataArray");
        if (optJSONArray == null) {
            aVar2.aA(a(false, "dataArray is null", null));
            return;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            try {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                int optInt = jSONObject2.optInt("key");
                String optString = jSONObject2.optString("value");
                if (optInt > 0 && !bi.oW(optString)) {
                    h.mEJ.h(optInt, r3.getAppId(), Integer.valueOf(r3.aeZ()), Integer.valueOf(com.tencent.mm.plugin.appbrand.dynamic.k.b.ke(r3.aeY()) + 1), optString);
                }
            } catch (Exception e) {
                x.e("MicroMsg.JsApiFunc_ReportKeyValue", "parse report value failed : %s", e);
            }
        }
        aVar2.aA(a(true, "", null));
    }
}
