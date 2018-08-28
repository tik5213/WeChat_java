package com.tencent.mm.plugin.product.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.ui.g;

public abstract class MallBaseUI extends MMActivity {
    protected String fGO;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new 1(this));
    }

    protected final void JB(String str) {
        this.fGO = str;
        showDialog(-10001);
    }

    protected Dialog onCreateDialog(int i) {
        switch (i) {
            case -10002:
                return g.a(this.mController.tml, false, new 3(this));
            case -10001:
                if (bi.oW(this.fGO)) {
                    this.fGO = getString(i.mall_product_data_err);
                }
                return h.a((Context) this, this.fGO, null, false, new 2(this));
            default:
                return super.onCreateDialog(i);
        }
    }

    public final void ux(int i) {
        this.mController.contentView.setVisibility(i);
        if (i == 0) {
            this.mController.showTitleView();
        } else {
            this.mController.hideTitleView();
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1) {
            this.mController.callBackMenu();
        }
        return super.onKeyUp(i, keyEvent);
    }
}
