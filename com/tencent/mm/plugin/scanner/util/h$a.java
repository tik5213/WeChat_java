package com.tencent.mm.plugin.scanner.util;

import android.hardware.Camera.Size;
import java.util.Comparator;

class h$a implements Comparator<Size> {
    private h$a() {
    }

    /* synthetic */ h$a(byte b) {
        this();
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        int i = size.height * size.width;
        int i2 = size2.height * size2.width;
        if (i2 < i) {
            return -1;
        }
        return i2 > i ? 1 : 0;
    }
}
