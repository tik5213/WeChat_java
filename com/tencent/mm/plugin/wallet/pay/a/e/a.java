package com.tencent.mm.plugin.wallet.pay.a.e;

import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.p;

public final class a extends f {
    public a(p pVar, Orders orders) {
        super(pVar, orders);
    }

    public final String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/sns_aa_verifyreg";
    }

    public final int If() {
        return 1507;
    }
}
