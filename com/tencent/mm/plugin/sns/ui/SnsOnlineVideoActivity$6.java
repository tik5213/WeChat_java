package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.g.a.gk;
import com.tencent.mm.plugin.sns.c.a;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.e;
import com.tencent.mm.protocal.c.av;
import com.tencent.mm.protocal.c.bsu;

class SnsOnlineVideoActivity$6 implements OnClickListener {
    final /* synthetic */ av nTI;
    final /* synthetic */ bsu nTJ;
    final /* synthetic */ SnsOnlineVideoActivity nZl;

    SnsOnlineVideoActivity$6(SnsOnlineVideoActivity snsOnlineVideoActivity, av avVar, bsu bsu) {
        this.nZl = snsOnlineVideoActivity;
        this.nTI = avVar;
        this.nTJ = bsu;
    }

    public final void onClick(View view) {
        if (this.nTI.raS != null) {
            SnsOnlineVideoActivity.k(this.nZl);
            String cS = a.ezo.cS(this.nTI.raS.jQb);
            int i = 0;
            if (this.nTJ.sqc.ruz == 1) {
                i = 2;
            } else if (this.nTJ.sqc.ruz == 3) {
                i = 5;
            } else if (this.nTJ.sqc.ruz == 15) {
                i = 38;
            }
            if (e.a(this.nTJ, this.nZl)) {
                a.ezo.a(this.nZl, this.nTI.raS.jQb, cS, this.nTJ.hbL, i, 19, 9, this.nTI.raS.raM, this.nTJ.ksA);
                return;
            }
            gk gkVar;
            switch (this.nTI.hcE) {
                case 4:
                    Intent intent = new Intent();
                    intent.putExtra("rawUrl", this.nTI.jPK);
                    a.ezn.j(intent, this.nZl);
                    a.ezo.a(this.nZl, this.nTI.raS.jQb, cS, this.nTJ.hbL, i, 19, 1, this.nTI.raS.raM, this.nTJ.ksA);
                    return;
                case 5:
                    if (this.nTI.otY == 1) {
                        gkVar = new gk();
                        gkVar.bPB.actionCode = 2;
                        gkVar.bPB.scene = 3;
                        gkVar.bPB.appId = this.nTI.raS.jQb;
                        gkVar.bPB.context = this.nZl;
                        com.tencent.mm.sdk.b.a.sFg.m(gkVar);
                        a.ezo.a(this.nZl, this.nTI.raS.jQb, cS, this.nTJ.hbL, i, 19, 6, this.nTI.raS.raM, this.nTJ.ksA);
                        return;
                    }
                    return;
                case 6:
                    int a = ag.a(this.nZl, this.nTI);
                    if (a == 1) {
                        gkVar = new gk();
                        gkVar.bPB.context = this.nZl;
                        gkVar.bPB.actionCode = 2;
                        gkVar.bPB.appId = this.nTI.raS.jQb;
                        gkVar.bPB.messageAction = this.nTI.raS.raO;
                        gkVar.bPB.messageExt = this.nTI.raS.raN;
                        gkVar.bPB.scene = 3;
                        com.tencent.mm.sdk.b.a.sFg.m(gkVar);
                        a.ezo.a(this.nZl, this.nTI.raS.jQb, cS, this.nTJ.hbL, i, 19, 6, this.nTI.raS.raM, this.nTJ.ksA);
                        return;
                    } else if (a == 2) {
                        gk gkVar2 = new gk();
                        gkVar2.bPB.context = this.nZl;
                        gkVar2.bPB.actionCode = 1;
                        gkVar2.bPB.appId = this.nTI.raS.jQb;
                        gkVar2.bPB.messageAction = this.nTI.raS.raO;
                        gkVar2.bPB.messageExt = this.nTI.raS.raN;
                        gkVar2.bPB.scene = 3;
                        com.tencent.mm.sdk.b.a.sFg.m(gkVar2);
                        a.ezo.a(this.nZl, this.nTI.raS.jQb, cS, this.nTJ.hbL, i, 19, 3, this.nTI.raS.raM, this.nTJ.ksA);
                        return;
                    } else {
                        return;
                    }
                default:
                    return;
            }
        }
    }
}
