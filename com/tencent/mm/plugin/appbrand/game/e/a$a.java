package com.tencent.mm.plugin.appbrand.game.e;

import com.tencent.magicbrush.engine.c;
import com.tencent.magicbrush.handler.image.MBCanvasContentHolder;
import com.tencent.mm.sdk.platformtools.x;
import java.util.concurrent.Callable;

class a$a implements Callable<MBCanvasContentHolder> {
    private int fDh;

    /* synthetic */ a$a(int i, byte b) {
        this(i);
    }

    private a$a(int i) {
        this.fDh = i;
    }

    /* renamed from: ahl */
    public final MBCanvasContentHolder call() {
        x.i("MicroMsg.WAGameCanvasSnapshotHandler", "hy: before");
        long currentTimeMillis = System.currentTimeMillis();
        MBCanvasContentHolder ek = c.ek(this.fDh);
        x.i("MicroMsg.WAGameCanvasSnapshotHandler", "hy: capture using : %d", new Object[]{Long.valueOf(System.currentTimeMillis() - currentTimeMillis)});
        return ek;
    }
}
