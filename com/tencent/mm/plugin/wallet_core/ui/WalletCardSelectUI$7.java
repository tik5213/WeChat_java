package com.tencent.mm.plugin.wallet_core.ui;

import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import java.util.Comparator;

class WalletCardSelectUI$7 implements Comparator<ElementQuery> {
    final /* synthetic */ WalletCardSelectUI puJ;

    WalletCardSelectUI$7(WalletCardSelectUI walletCardSelectUI) {
        this.puJ = walletCardSelectUI;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((ElementQuery) obj2).pjA - ((ElementQuery) obj).pjA;
    }
}
