package com.tencent.mm.ac.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bek;
import com.tencent.mm.protocal.c.bel;
import com.tencent.mm.sdk.platformtools.x;

public final class v extends l implements k {
    public b diG;
    private e diJ;

    public v(String str, String str2, int i) {
        a aVar = new a();
        aVar.dIG = new bek();
        aVar.dIH = new bel();
        aVar.uri = "/cgi-bin/mmocbiz-bin/qymsgstatenotify";
        aVar.dIF = 1361;
        aVar.dII = 0;
        aVar.dIJ = 0;
        this.diG = aVar.KT();
        bek bek = (bek) this.diG.dID.dIL;
        bek.riK = str;
        bek.riE = str2;
        bek.time_stamp = i;
    }

    public final void a(int i, int i2, int i3, String str, q qVar, byte[] bArr) {
        x.d("MicroMsg.NetSceneQyMsgStateNotify", "onGYNetEnd code(%d, %d)", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)});
        if (this.diJ != null) {
            this.diJ.a(i2, i3, str, this);
        }
    }

    public final int getType() {
        return 1361;
    }

    public final int a(com.tencent.mm.network.e eVar, e eVar2) {
        this.diJ = eVar2;
        x.i("MicroMsg.NetSceneQyMsgStateNotify", "do scene");
        return a(eVar, this.diG, this);
    }
}
