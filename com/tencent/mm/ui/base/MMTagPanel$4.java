package com.tencent.mm.ui.base;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.sdk.platformtools.x;

class MMTagPanel$4 implements OnClickListener {
    final /* synthetic */ MMTagPanel txS;

    MMTagPanel$4(MMTagPanel mMTagPanel) {
        this.txS = mMTagPanel;
    }

    public final void onClick(View view) {
        x.d("MicroMsg.MMTagPanel", "on edittext click");
        this.txS.crR();
        if (MMTagPanel.e(this.txS) != null) {
            MMTagPanel.e(this.txS).aGt();
        }
    }
}
