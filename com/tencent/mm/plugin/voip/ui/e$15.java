package com.tencent.mm.plugin.voip.ui;

import android.view.View;
import android.view.View.OnClickListener;

class e$15 implements OnClickListener {
    final /* synthetic */ e oSe;

    e$15(e eVar) {
        this.oSe = eVar;
    }

    public final void onClick(View view) {
        if (this.oSe.oQd != null && this.oSe.oQd.get() != null) {
            ((c) this.oSe.oQd.get()).bKu();
        }
    }
}
