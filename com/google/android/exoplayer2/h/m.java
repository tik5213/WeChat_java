package com.google.android.exoplayer2.h;

import android.content.Context;
import com.google.android.exoplayer2.h.f.a;

public final class m implements a {
    private final t<? super f> aAB;
    private final a aBl;
    private final Context context;

    public final /* synthetic */ f lO() {
        return new l(this.context, this.aAB, this.aBl.lO());
    }

    public m(Context context, t<? super f> tVar, a aVar) {
        this.context = context.getApplicationContext();
        this.aAB = tVar;
        this.aBl = aVar;
    }
}
