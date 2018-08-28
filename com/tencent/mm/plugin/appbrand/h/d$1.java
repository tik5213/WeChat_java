package com.tencent.mm.plugin.appbrand.h;

import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.n.d;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.c;
import com.tencent.mm.plugin.messenger.a.a;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;

class d$1 extends a {
    final /* synthetic */ int bpX;
    final /* synthetic */ String dEt;
    final /* synthetic */ long dUM;
    final /* synthetic */ String dat;
    final /* synthetic */ String dhF;
    final /* synthetic */ int eeg;
    final /* synthetic */ String gjQ;
    final /* synthetic */ String gjR;
    final /* synthetic */ WeakReference gjU;
    final /* synthetic */ d gjY;

    d$1(d dVar, String str, String str2, String str3, String str4, WeakReference weakReference, int i, long j, String str5, int i2) {
        this.gjY = dVar;
        this.dEt = str;
        this.dhF = str2;
        this.dat = str3;
        this.gjQ = str4;
        this.gjU = weakReference;
        this.eeg = i;
        this.dUM = j;
        this.gjR = str5;
        this.bpX = i2;
    }

    public final void onClickImp(View view) {
        x.i("MicroMsg.WxaSysTemplateMsgHandler", "On Span clicked(title : %s, username : %s, path : %s, talker : %s)", new Object[]{this.dEt, this.dhF, this.dat, this.gjQ});
        this.gjU.get();
        Bundle bundle = new Bundle();
        bundle.putInt("stat_scene", this.eeg);
        bundle.putString("stat_msg_id", "msg_" + Long.toString(this.dUM));
        bundle.putString("stat_chat_talker_username", this.gjQ);
        bundle.putString("stat_send_msg_user", this.gjR);
        AppBrandStatObject appBrandStatObject = new AppBrandStatObject();
        appBrandStatObject.scene = 1088;
        appBrandStatObject.bGG = "";
        appBrandStatObject.cbB = c.h(appBrandStatObject.scene, bundle);
        appBrandStatObject.cbC = c.i(appBrandStatObject.scene, bundle);
        String str = "";
        if (this.dat != null && this.dat.length() > 0) {
            byte[] decode = Base64.decode(this.dat, 2);
            if (decode != null) {
                str = new String(decode);
            }
        }
        ((d) g.l(d.class)).a(view.getContext(), this.dhF, null, this.bpX, 0, str, appBrandStatObject);
    }
}
