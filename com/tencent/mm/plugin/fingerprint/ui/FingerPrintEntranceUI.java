package com.tencent.mm.plugin.fingerprint.ui;

import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fingerprint.b.e;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.k;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class FingerPrintEntranceUI extends WalletBaseUI {
    public void onCreate(Bundle bundle) {
        boolean z = true;
        super.onCreate(bundle);
        x.i("MicroMsg.FingerPrintEntranceUI", "onCreate");
        if (e.aNC()) {
            x.i("MicroMsg.FingerPrintEntranceUI", "will call showSetFingerPrintGuide()");
            x.i("MicroMsg.FingerPrintEntranceUI", "hy: has standard action starting to fingerprint setting");
            h.a(this, getResources().getString(i.strong_guide_set_fingerprint_text), "", getResources().getString(((k) g.l(k.class)).aNl() ? i.btn_guide_reg_system_fingerprint : i.app_ok), getString(i.app_cancel), true, new 1(this), new 2(this));
            e.aNx();
        } else if (e.aNw()) {
            z = false;
        } else {
            x.i("MicroMsg.FingerPrintEntranceUI", "will showOpenFingerPrintPayGuide()");
            h.a(this, getResources().getString(i.strong_guide_open_fingerprint_pay_text), "", getResources().getString(i.btn_guide_open_fingerprint), getString(i.app_cancel), true, new 3(this), new 4(this));
            e.aNv();
        }
        if (!z) {
            x.e("MicroMsg.FingerPrintEntranceUI", "finish FingerPrintEntranceUI");
            finish();
        }
    }

    public void onResume() {
        super.onResume();
    }

    public final boolean d(int i, int i2, String str, l lVar) {
        return false;
    }

    protected final int getLayoutId() {
        return -1;
    }
}
