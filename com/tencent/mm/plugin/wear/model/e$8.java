package com.tencent.mm.plugin.wear.model;

import com.tencent.mm.g.a.tr;
import com.tencent.mm.plugin.wear.model.f.l;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.b.c;

class e$8 extends c<tr> {
    final /* synthetic */ e pJo;

    e$8(e eVar) {
        this.pJo = eVar;
        super(0);
        this.sFo = tr.class.getName().hashCode();
    }

    public final /* synthetic */ boolean a(b bVar) {
        switch (((tr) bVar).cfr.bIH) {
            case 5:
                a.bSl().pIS.a(new l(20011, ""));
                break;
            case 6:
            case 7:
                a.bSl().pIS.a(new l(20012, ""));
                break;
        }
        return false;
    }
}
