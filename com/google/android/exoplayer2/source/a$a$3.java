package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.h.i;
import com.google.android.exoplayer2.source.a.a;

class a$a$3 implements Runnable {
    final /* synthetic */ int arA;
    final /* synthetic */ Object arB;
    final /* synthetic */ long arC;
    final /* synthetic */ long arD;
    final /* synthetic */ long arE;
    final /* synthetic */ a arF;
    final /* synthetic */ long arG;
    final /* synthetic */ long arH;
    final /* synthetic */ i arw;
    final /* synthetic */ int arx;
    final /* synthetic */ int ary;
    final /* synthetic */ Format arz;

    a$a$3(a aVar, i iVar, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
        this.arF = aVar;
        this.arw = iVar;
        this.arx = i;
        this.ary = i2;
        this.arz = format;
        this.arA = i3;
        this.arB = obj;
        this.arC = j;
        this.arD = j2;
        this.arE = j3;
        this.arG = j4;
        this.arH = j5;
    }

    public final void run() {
        a.a(this.arF, this.arC);
        a.a(this.arF, this.arD);
    }
}
