package com.tencent.mm.plugin.exdevice.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bjh;
import com.tencent.mm.protocal.c.bji;
import com.tencent.mm.sdk.platformtools.x;

public final class u extends l implements k {
    b diG = null;
    private e diJ = null;

    public u(String str) {
        a aVar = new a();
        aVar.dIG = new bjh();
        aVar.dIH = new bji();
        aVar.uri = "/cgi-bin/micromsg-bin/searchharddevice";
        aVar.dIF = 540;
        aVar.dII = 0;
        aVar.dIJ = 0;
        this.diG = aVar.KT();
        ((bjh) this.diG.dID.dIL).sju = str;
    }

    public final void a(int i, int i2, int i3, String str, q qVar, byte[] bArr) {
        x.i("MicroMsg.exdevice.NetSceneSearchHardDevice", "onGYNetEnd netId = " + i + " errType = " + i2 + " errCode = " + i3 + str);
        this.diJ.a(i2, i3, str, this);
    }

    public final int getType() {
        return 540;
    }

    public final int a(com.tencent.mm.network.e eVar, e eVar2) {
        this.diJ = eVar2;
        return a(eVar, this.diG, this);
    }
}
