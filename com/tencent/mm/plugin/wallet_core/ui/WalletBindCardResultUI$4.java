package com.tencent.mm.plugin.wallet_core.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.sdk.platformtools.x;

class WalletBindCardResultUI$4 implements OnClickListener {
    final /* synthetic */ WalletBindCardResultUI ptz;

    WalletBindCardResultUI$4(WalletBindCardResultUI walletBindCardResultUI) {
        this.ptz = walletBindCardResultUI;
    }

    public final void onClick(View view) {
        x.i("MicroMsg.WalletBindCardResultUI", "click activity layout");
        WalletBindCardResultUI.b(this.ptz);
    }
}
