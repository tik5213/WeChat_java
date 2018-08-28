package com.google.android.exoplayer2.video;

import com.google.android.exoplayer2.i.h;
import com.google.android.exoplayer2.i.j;
import com.google.android.exoplayer2.o;
import java.util.Collections;
import java.util.List;

public final class b {
    public final List<byte[]> adY;
    public final int alp;

    public static b o(j jVar) {
        try {
            int readUnsignedShort;
            int i;
            int i2;
            jVar.da(21);
            int readUnsignedByte = jVar.readUnsignedByte() & 3;
            int readUnsignedByte2 = jVar.readUnsignedByte();
            int i3 = jVar.position;
            int i4 = 0;
            int i5 = 0;
            while (i4 < readUnsignedByte2) {
                jVar.da(1);
                readUnsignedShort = jVar.readUnsignedShort();
                i = i5;
                for (i2 = 0; i2 < readUnsignedShort; i2++) {
                    i5 = jVar.readUnsignedShort();
                    i += i5 + 4;
                    jVar.da(i5);
                }
                i4++;
                i5 = i;
            }
            jVar.setPosition(i3);
            Object obj = new byte[i5];
            i2 = 0;
            for (i4 = 0; i4 < readUnsignedByte2; i4++) {
                jVar.da(1);
                readUnsignedShort = jVar.readUnsignedShort();
                for (i = 0; i < readUnsignedShort; i++) {
                    int readUnsignedShort2 = jVar.readUnsignedShort();
                    System.arraycopy(h.aBV, 0, obj, i2, h.aBV.length);
                    i2 += h.aBV.length;
                    System.arraycopy(jVar.data, jVar.position, obj, i2, readUnsignedShort2);
                    i2 += readUnsignedShort2;
                    jVar.da(readUnsignedShort2);
                }
            }
            return new b(i5 == 0 ? null : Collections.singletonList(obj), readUnsignedByte + 1);
        } catch (Throwable e) {
            throw new o("Error parsing HEVC config", e);
        }
    }

    private b(List<byte[]> list, int i) {
        this.adY = list;
        this.alp = i;
    }
}
