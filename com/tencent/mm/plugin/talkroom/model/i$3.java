package com.tencent.mm.plugin.talkroom.model;

import com.tencent.mm.ax.d;

class i$3 implements Runnable {
    final /* synthetic */ i oxm;

    i$3(i iVar) {
        this.oxm = iVar;
    }

    public final void run() {
        synchronized (this.oxm.cWy) {
            for (d Sx : this.oxm.cWy) {
                Sx.Sx();
            }
        }
    }
}
