package com.tencent.mm.plugin.wallet.bind.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.wallet_core.c.a;

class WalletUnbindBankCardProxyUI$1 implements a {
    final /* synthetic */ WalletUnbindBankCardProxyUI pdL;

    WalletUnbindBankCardProxyUI$1(WalletUnbindBankCardProxyUI walletUnbindBankCardProxyUI) {
        this.pdL = walletUnbindBankCardProxyUI;
    }

    public final Intent n(int i, Bundle bundle) {
        switch (i) {
            case -1:
                this.pdL.setResult(-1);
                break;
            case 0:
                this.pdL.setResult(0);
                break;
            case 1:
                this.pdL.setResult(1);
                break;
        }
        return null;
    }
}
