package com.tencent.mm.plugin.luckymoney.ui;

import android.support.v7.app.ActionBarActivity;
import com.tencent.mm.g.a.hg;
import com.tencent.mm.plugin.luckymoney.b.f;
import com.tencent.mm.plugin.luckymoney.b.o;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

class LuckyMoneyBusiDetailUI$3 implements Runnable {
    final /* synthetic */ LuckyMoneyBusiDetailUI kUw;
    final /* synthetic */ hg kUx;
    final /* synthetic */ f kUy;

    LuckyMoneyBusiDetailUI$3(LuckyMoneyBusiDetailUI luckyMoneyBusiDetailUI, hg hgVar, f fVar) {
        this.kUw = luckyMoneyBusiDetailUI;
        this.kUx = hgVar;
        this.kUy = fVar;
    }

    public final void run() {
        if (this.kUx.bQy.bQA) {
            x.i("MicroMsg.LuckyMoneyDetailUI", "Get res Ok, path=" + this.kUx.bQy.bQB);
            ActionBarActivity actionBarActivity = this.kUw.mController.tml;
            o.e(LuckyMoneyBusiDetailUI.i(this.kUw), this.kUx.bQy.bQB, e.lucky_money_busi_default_avatar);
            return;
        }
        x.i("MicroMsg.LuckyMoneyDetailUI", "Get res fail & load from url.");
        if (!bi.oW(this.kUy.kPM)) {
            o.a(LuckyMoneyBusiDetailUI.i(this.kUw), this.kUy.kPM, this.kUy.kQg);
        }
    }
}
