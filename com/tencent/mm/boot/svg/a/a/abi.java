package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;

public final class abi extends c {
    private final int height = 63;
    private final int width = 63;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 63;
            case 1:
                return 63;
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
                Paint a = c.a(i3, looper);
                a.setStrokeWidth(1.0f);
                canvas.save();
                e = c.a(e, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 12.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                Paint a2 = c.a(i2, looper);
                i3 = c.a(a, looper);
                a2.setColor(16777215);
                i3.setColor(-1);
                i3.setStrokeWidth(2.0f);
                canvas.save();
                Paint a3 = c.a(a2, looper);
                a = c.a(i3, looper);
                Path j = c.j(looper);
                j.moveTo(0.0f, 1.5f);
                j.cubicTo(0.0f, 0.6715728f, 0.6715728f, 0.0f, 1.5f, 0.0f);
                j.lineTo(37.5f, 0.0f);
                j.cubicTo(38.328426f, 0.0f, 39.0f, 0.6715728f, 39.0f, 1.5f);
                j.lineTo(39.0f, 37.5f);
                j.cubicTo(39.0f, 38.328426f, 38.328426f, 39.0f, 37.5f, 39.0f);
                j.lineTo(1.5f, 39.0f);
                j.cubicTo(0.6715728f, 39.0f, 0.0f, 38.328426f, 0.0f, 37.5f);
                j.lineTo(0.0f, 1.5f);
                j.close();
                canvas.drawPath(j, a3);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a2 = c.a(i2, looper);
                a2.setColor(-1);
                Path j2 = c.j(looper);
                j2.moveTo(0.0f, 0.0f);
                j2.lineTo(20.0f, 0.0f);
                j2.lineTo(20.0f, 20.0f);
                j2.lineTo(0.0f, 20.0f);
                j2.lineTo(0.0f, 0.0f);
                j2.close();
                canvas.drawPath(j2, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(i2, looper);
                a2.setColor(-1);
                j2 = c.j(looper);
                j2.moveTo(20.0f, 20.0f);
                j2.lineTo(39.5f, 20.0f);
                j2.lineTo(39.5f, 39.5f);
                j2.lineTo(20.0f, 39.5f);
                j2.lineTo(20.0f, 20.0f);
                j2.close();
                canvas.drawPath(j2, a2);
                canvas.restore();
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}
