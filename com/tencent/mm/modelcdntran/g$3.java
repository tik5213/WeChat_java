package com.tencent.mm.modelcdntran;

import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

class g$3 implements e {
    final /* synthetic */ g dPN;

    g$3(g gVar) {
        this.dPN = gVar;
    }

    public final void a(int i, int i2, String str, l lVar) {
        if (lVar instanceof e) {
            x.i("MicroMsg.SubCoreCdnTransport", "%d get cdn dns on scene end errType[%d] errCode[%d] errMsg[%s] lastGetDnsErrorTime[%d]", new Object[]{Integer.valueOf(hashCode()), Integer.valueOf(i), Integer.valueOf(i2), str, Long.valueOf(g.a(this.dPN))});
            if ("doScene failed".equals(str)) {
                x.d("MicroMsg.SubCoreCdnTransport", "%d get cdn dns cache do nothing.", new Object[]{Integer.valueOf(hashCode())});
                return;
            }
            h.mEJ.a(546, (long) (i + 10), 1, true);
            if (i == 0) {
                if (g.a(this.dPN) > 0) {
                    h.mEJ.a(546, 52, 1, true);
                    g.a(this.dPN, 0);
                    return;
                }
                return;
            } else if (i == 4) {
                return;
            } else {
                if (g.a(this.dPN) == 0) {
                    int i3 = ((e) lVar).scene;
                    g.a(this.dPN, bi.VF());
                    g.b(this.dPN).removeMessages(1);
                    g.b(this.dPN).sendMessageDelayed(g.b(this.dPN).obtainMessage(1, i3, 0), 30000);
                    h.mEJ.a(546, 50, 1, true);
                    return;
                }
                g.a(this.dPN, 0);
                h.mEJ.a(546, 51, 1, true);
                return;
            }
        }
        x.w("MicroMsg.SubCoreCdnTransport", "get cdn dns on scene end but is not [NetSceneGetCdnDns]");
    }
}
