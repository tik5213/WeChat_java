package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.support.v4.app.a.a;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

class JsApiChooseMedia$3 implements a {
    final /* synthetic */ int doP;
    final /* synthetic */ l fCl;
    final /* synthetic */ JSONObject fHi;
    final /* synthetic */ JsApiChooseMedia fUy;

    JsApiChooseMedia$3(JsApiChooseMedia jsApiChooseMedia, l lVar, JSONObject jSONObject, int i) {
        this.fUy = jsApiChooseMedia;
        this.fCl = lVar;
        this.fHi = jSONObject;
        this.doP = i;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 120) {
            x.e("MicroMsg.JsApiChooseMedia", "requestAudioPermission requestCode is not for choose media");
        } else if (iArr == null || iArr.length <= 0 || iArr[0] != 0) {
            x.e("MicroMsg.JsApiChooseMedia", "requestAudioPermission sys perm denied for choose media");
            this.fCl.E(this.doP, this.fUy.f("fail:system permission denied", null));
        } else {
            x.i("MicroMsg.JsApiChooseMedia", "requestAudioPermission permission is grant for choose media");
            this.fUy.a(this.fCl, this.fHi, this.doP);
        }
    }
}
