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
import com.tencent.smtt.sdk.WebView;

public final class aix extends c {
    private final int height = 78;
    private final int width = 78;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 78;
            case 1:
                return 78;
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
                i2.setColor(WebView.NIGHT_MODE_COLOR);
                i3.setStrokeWidth(1.0f);
                i3.setStrokeCap(Cap.BUTT);
                i3.setStrokeJoin(Join.MITER);
                i3.setStrokeMiter(4.0f);
                i3.setPathEffect(null);
                Paint a = c.a(i3, looper);
                a.setStrokeWidth(1.0f);
                canvas.save();
                e = c.a(e, 1.0f, 0.0f, -223.0f, 0.0f, 1.0f, -362.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                e = c.a(e, 1.0f, 0.0f, 98.0f, 0.0f, 1.0f, 362.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                e = c.a(e, 1.0f, 0.0f, 125.0f, 0.0f, 1.0f, 0.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                e = c.a(e, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 3.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                Paint a2 = c.a(a, looper);
                a2.setColor(-11184811);
                a2.setStrokeWidth(3.0f);
                Path j = c.j(looper);
                j.moveTo(2.9959373f, 0.0f);
                j.cubicTo(1.3413268f, 0.0f, 0.0f, 1.3424077f, 0.0f, 3.002084f);
                j.lineTo(0.0f, 68.99792f);
                j.cubicTo(0.0f, 70.65592f, 1.3373097f, 72.0f, 2.9959373f, 72.0f);
                j.lineTo(57.004063f, 72.0f);
                j.cubicTo(58.658672f, 72.0f, 60.0f, 70.65759f, 60.0f, 68.99792f);
                j.lineTo(60.0f, 3.002084f);
                j.cubicTo(60.0f, 1.3440788f, 58.66269f, 0.0f, 57.004063f, 0.0f);
                j.lineTo(2.9959373f, 0.0f);
                j.close();
                canvas.drawPath(j, a2);
                canvas.restore();
                canvas.save();
                Paint a3 = c.a(i2, looper);
                a3.setColor(-11184811);
                Path j2 = c.j(looper);
                j2.moveTo(8.0f, 27.0f);
                j2.lineTo(40.0f, 27.0f);
                j2.lineTo(40.0f, 30.0f);
                j2.lineTo(8.0f, 30.0f);
                j2.lineTo(8.0f, 27.0f);
                j2.close();
                canvas.drawPath(j2, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(i2, looper);
                a3.setColor(-11184811);
                j2 = c.j(looper);
                j2.moveTo(8.0f, 36.0f);
                j2.lineTo(25.0f, 36.0f);
                j2.lineTo(25.0f, 39.0f);
                j2.lineTo(8.0f, 39.0f);
                j2.lineTo(8.0f, 36.0f);
                j2.close();
                canvas.drawPath(j2, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(i2, looper);
                a3.setColor(-11184811);
                j2 = c.j(looper);
                j2.moveTo(8.0f, 45.0f);
                j2.lineTo(28.0f, 45.0f);
                j2.lineTo(28.0f, 48.0f);
                j2.lineTo(8.0f, 48.0f);
                j2.lineTo(8.0f, 45.0f);
                j2.close();
                canvas.drawPath(j2, a3);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                a2.setColor(-11184811);
                a2.setStrokeWidth(3.0f);
                j = c.j(looper);
                j.moveTo(14.0f, 8.0f);
                j.cubicTo(17.31371f, 8.0f, 20.0f, 10.686291f, 20.0f, 14.0f);
                j.cubicTo(20.0f, 17.31371f, 17.31371f, 20.0f, 14.0f, 20.0f);
                j.cubicTo(10.686291f, 20.0f, 8.0f, 17.31371f, 8.0f, 14.0f);
                j.cubicTo(8.0f, 10.686291f, 10.686291f, 8.0f, 14.0f, 8.0f);
                j.close();
                canvas.drawPath(j, a2);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}
