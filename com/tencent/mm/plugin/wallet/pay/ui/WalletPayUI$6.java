package com.tencent.mm.plugin.wallet.pay.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class WalletPayUI$6 implements OnClickListener {
    final /* synthetic */ WalletPayUI pgT;

    WalletPayUI$6(WalletPayUI walletPayUI) {
        this.pgT = walletPayUI;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.pgT.finish();
    }
}
