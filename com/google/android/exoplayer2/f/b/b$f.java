package com.google.android.exoplayer2.f.b;

import android.util.SparseArray;
import com.google.android.exoplayer2.f.b.b.g;

final class b$f {
    public final boolean axX;
    public final int axY;
    public final int axZ;
    public final int aya;
    public final int ayb;
    public final int ayc;
    public final int ayd;
    public final SparseArray<g> aye;
    public final int height;
    public final int id;
    public final int width;

    public b$f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray<g> sparseArray) {
        this.id = i;
        this.axX = z;
        this.width = i2;
        this.height = i3;
        this.axY = i4;
        this.axZ = i5;
        this.aya = i6;
        this.ayb = i7;
        this.ayc = i8;
        this.ayd = i9;
        this.aye = sparseArray;
    }

    public final void a(b$f b_f) {
        if (b_f != null) {
            SparseArray sparseArray = b_f.aye;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.aye.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
            }
        }
    }
}
