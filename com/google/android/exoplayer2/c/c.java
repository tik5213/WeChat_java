package com.google.android.exoplayer2.c;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.k.a;
import com.google.android.exoplayer2.i.j;
import java.io.EOFException;

public final class c implements k {
    public final void f(Format format) {
    }

    public final int a(e eVar, int i, boolean z) {
        int cj = eVar.cj(i);
        if (cj != -1) {
            return cj;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void a(j jVar, int i) {
        jVar.da(i);
    }

    public final void a(long j, int i, int i2, int i3, a aVar) {
    }
}
