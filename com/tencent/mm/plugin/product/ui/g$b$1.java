package com.tencent.mm.plugin.product.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.plugin.product.ui.g.b;
import com.tencent.mm.sdk.platformtools.x;

class g$b$1 implements OnClickListener {
    final /* synthetic */ g lSQ;
    final /* synthetic */ b lSR;

    g$b$1(b bVar, g gVar) {
        this.lSR = bVar;
        this.lSQ = gVar;
    }

    public final void onClick(View view) {
        x.i("MicroMsg.MallProductImageAdapter", "henryyr user: clicked the ImageView");
        if (this.lSR.lSP.lSO != null) {
            this.lSR.lSP.lSO.bnd();
        }
    }
}
