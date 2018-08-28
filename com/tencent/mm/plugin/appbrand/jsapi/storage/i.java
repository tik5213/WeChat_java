package com.tencent.mm.plugin.appbrand.jsapi.storage;

import com.samsung.android.sdk.look.airbutton.SlookAirButtonFrequentContactAdapter;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.bi;
import org.json.JSONObject;

public final class i extends a {
    public static final int CTRL_INDEX = 16;
    public static final String NAME = "setStorage";

    public final void a(l lVar, JSONObject jSONObject, int i) {
        String optString = jSONObject.optString("key");
        String optString2 = jSONObject.optString(SlookAirButtonFrequentContactAdapter.DATA);
        String optString3 = jSONObject.optString("dataType");
        if (bi.oW(optString)) {
            lVar.E(i, f("fail", null));
            return;
        }
        if ((optString2 == null ? 0 : optString2.length()) + optString.length() > lVar.fdO.fcu.frn.fpI) {
            lVar.E(i, f("fail:entry size limit reached", null));
            return;
        }
        MainProcessTask jsApiSetStorageTask = new JsApiSetStorageTask();
        jsApiSetStorageTask.appId = lVar.mAppId;
        jsApiSetStorageTask.E(optString, optString2, optString3);
        jsApiSetStorageTask.fFC = new 1(this, lVar, i, jsApiSetStorageTask);
        jsApiSetStorageTask.ahA();
        AppBrandMainProcessService.a(jsApiSetStorageTask);
    }
}
