package com.tencent.mm.plugin.clean.ui.newui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.sdk.platformtools.x;

class CleanNewUI$3 implements OnClickListener {
    final /* synthetic */ CleanNewUI hTB;

    CleanNewUI$3(CleanNewUI cleanNewUI) {
        this.hTB = cleanNewUI;
    }

    public final void onClick(View view) {
        x.i("MicroMsg.CleanNewUI", "clean wechat cache");
    }
}
