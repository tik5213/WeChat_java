package com.tencent.mm.plugin.walletlock.gesture.ui;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.v.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.walletlock.b.i;
import com.tencent.mm.plugin.walletlock.gesture.a.d;
import com.tencent.mm.protocal.c.bga;
import com.tencent.mm.sdk.platformtools.x;

class GestureGuardLogicUI$5 implements a {
    final /* synthetic */ a dKp;
    final /* synthetic */ GestureGuardLogicUI pHr;

    GestureGuardLogicUI$5(GestureGuardLogicUI gestureGuardLogicUI, a aVar) {
        this.pHr = gestureGuardLogicUI;
        this.dKp = aVar;
    }

    public final int a(int i, int i2, String str, b bVar, l lVar) {
        x.i("MicroMsg.GestureGuardLogicUI", String.format("Scene doSwitchOn, errType:%d, errCode:%d, errMsg:%s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str}));
        GestureGuardLogicUI.o(this.pHr);
        if (i == 0 && i2 == 0) {
            d.a(((bga) bVar.dIE.dIL).sao);
            GestureGuardLogicUI.bRS();
            ((com.tencent.mm.plugin.walletlock.a.b) g.l(com.tencent.mm.plugin.walletlock.a.b.class)).zw(1);
        }
        i.pIx.bSh();
        if (this.dKp != null) {
            return this.dKp.a(i, i2, str, bVar, lVar);
        }
        return 0;
    }
}
