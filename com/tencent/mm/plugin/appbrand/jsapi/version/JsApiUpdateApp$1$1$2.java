package com.tencent.mm.plugin.appbrand.jsapi.version;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.plugin.appbrand.jsapi.version.JsApiUpdateApp.1.1;

class JsApiUpdateApp$1$1$2 implements OnClickListener {
    final /* synthetic */ 1 fZI;

    JsApiUpdateApp$1$1$2(1 1) {
        this.fZI = 1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.fZI.fZH.fCl.E(this.fZI.fZH.doP, this.fZI.fZH.fZG.f("fail user canceled updateApp", null));
    }
}
