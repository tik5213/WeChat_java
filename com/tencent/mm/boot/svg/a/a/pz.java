package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class pz extends c {
    private final int height = 21;
    private final int width = 36;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 36;
            case 1:
                return 21;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix f = c.f(looper);
                float[] e = c.e(looper);
                Paint i2 = c.i(looper);
                i2.setFlags(385);
                i2.setStyle(Style.FILL);
                Paint i3 = c.i(looper);
                i3.setFlags(385);
                i3.setStyle(Style.STROKE);
                i2.setColor(-16777216);
                i3.setStrokeWidth(1.0f);
                i3.setStrokeCap(Cap.BUTT);
                i3.setStrokeJoin(Join.MITER);
                i3.setStrokeMiter(4.0f);
                i3.setPathEffect(null);
                c.a(i3, looper).setStrokeWidth(1.0f);
                i2 = c.a(i2, looper);
                i2.setColor(-6710887);
                canvas.save();
                Paint a = c.a(i2, looper);
                e = c.a(e, 0.70710677f, 0.70710677f, 2.4558444f, -0.70710677f, 0.70710677f, 13.870058f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                Path j = c.j(looper);
                j.moveTo(10.970563f, 10.970563f);
                j.lineTo(29.970562f, 10.970563f);
                j.lineTo(29.970562f, 15.970563f);
                j.lineTo(5.970563f, 15.970563f);
                j.lineTo(5.970563f, 13.470563f);
                j.lineTo(5.970563f, -8.029437f);
                j.lineTo(10.970563f, -8.029437f);
                j.lineTo(10.970563f, 10.970563f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}
