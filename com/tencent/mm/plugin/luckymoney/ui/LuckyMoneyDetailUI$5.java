package com.tencent.mm.plugin.luckymoney.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.sdk.platformtools.x;

class LuckyMoneyDetailUI$5 implements OnClickListener {
    final /* synthetic */ LuckyMoneyDetailUI kVo;

    LuckyMoneyDetailUI$5(LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.kVo = luckyMoneyDetailUI;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        x.i("MicroMsg.LuckyMoneyDetailUI", "RealnameGuideHelper dialog click cancel");
        LuckyMoneyDetailUI.r(this.kVo);
    }
}
