package com.d.a.a;

import java.lang.ref.WeakReference;

abstract class r$a implements Runnable {
    private final WeakReference<r> bjN;

    private r$a(r rVar) {
        this.bjN = new WeakReference(rVar);
    }

    /* synthetic */ r$a(r rVar, byte b) {
        this(rVar);
    }

    final r sJ() {
        r rVar = (r) this.bjN.get();
        if (rVar != null) {
            return rVar;
        }
        throw new Exception("OnlineModule.AbstractOnlineModuleRunnable: online module not available");
    }
}
