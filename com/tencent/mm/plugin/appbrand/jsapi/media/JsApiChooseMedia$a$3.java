package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.a;
import com.tencent.mm.sdk.platformtools.x;

class JsApiChooseMedia$a$3 implements OnCancelListener {
    final /* synthetic */ a fUI;

    JsApiChooseMedia$a$3(a aVar) {
        this.fUI = aVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        x.e("MicroMsg.JsApiChooseMedia", "cancel chooseMedia, and finish process!");
        a.e(this.fUI).bjW = 0;
        a.a(this.fUI, a.e(this.fUI));
    }
}
