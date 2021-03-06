package com.tencent.mm.plugin.appbrand.jsapi.bio.soter;

import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.r.c;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class JsApiCheckBioEnrollment extends a {
    public static final int CTRL_INDEX = 344;
    public static final String NAME = "checkIsSoterEnrolledInDevice";
    private GetIsEnrolledTask fKR = null;

    public final void a(l lVar, JSONObject jSONObject, int i) {
        x.i("MicroMsg.JsApiCheckBioEnrollment", "hy: subapp start do check is enrolled");
        this.fKR = new GetIsEnrolledTask(lVar, i, a.tq(jSONObject.optString("checkAuthMode")), this);
        c.br(this.fKR);
        AppBrandMainProcessService.a(this.fKR);
    }
}
