package com.tencent.mm.ui.chatting.viewitems;

import android.graphics.Bitmap;
import com.tencent.mm.modelappbrand.b.b.h;
import com.tencent.mm.plugin.appbrand.q.k;
import com.tencent.mm.ui.chatting.viewitems.o.a;
import com.tencent.mm.ui.chatting.viewitems.o.d;

class o$a$1 implements h {
    final /* synthetic */ d ubF;
    final /* synthetic */ a ubG;

    o$a$1(a aVar, d dVar) {
        this.ubG = aVar;
        this.ubF = dVar;
    }

    public final void Kc() {
    }

    public final void n(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            this.ubF.uar.setVisibility(4);
            this.ubF.uas.setVisibility(0);
            return;
        }
        this.ubF.uar.setImageBitmap(bitmap);
        this.ubF.uar.setVisibility(0);
        this.ubF.uas.setVisibility(4);
    }

    public final void Kd() {
    }

    public final String Ke() {
        return "CHAT#" + k.bq(this);
    }
}
