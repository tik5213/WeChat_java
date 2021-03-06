package com.tencent.mm.plugin.wallet_core.model;

import android.text.TextUtils;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;

public final class ad {
    public ArrayList<Bankcard> prv = new ArrayList();
    public String prw;

    public final Bankcard OZ(String str) {
        if (this.prv.size() > 0) {
            Bankcard bankcard;
            Iterator it = this.prv.iterator();
            while (it.hasNext()) {
                bankcard = (Bankcard) it.next();
                if (bankcard.field_bindSerial.equals(str)) {
                    break;
                }
            }
            bankcard = null;
            if (bankcard == null) {
                x.e("MicroMsg.WalletRepaymentBankcardMgr", "getBankcardBySerialNo return null");
                return bankcard;
            }
            x.i("MicroMsg.WalletRepaymentBankcardMgr", "getBankcardBySerialNo succ");
            return bankcard;
        }
        x.e("MicroMsg.WalletRepaymentBankcardMgr", "repayment bankcard list size is 0");
        return null;
    }

    public final boolean bPh() {
        return this.prv.size() > 0;
    }

    public final Bankcard bPi() {
        if (!bPh()) {
            x.e("MicroMsg.WalletRepaymentBankcardMgr", "Repayment card list is null");
            return null;
        } else if (!TextUtils.isEmpty(this.prw)) {
            return OZ(this.prw);
        } else {
            x.i("MicroMsg.WalletRepaymentBankcardMgr", "last_use_card_serialno is empty,return the first one");
            return (Bankcard) this.prv.get(0);
        }
    }
}
