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

public final class ke extends c {
    private final int height = 96;
    private final int width = 96;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 96;
            case 1:
                return 96;
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
                i3 = c.a(i2, looper);
                i3.setColor(-4284563);
                canvas.save();
                Paint a = c.a(i3, looper);
                Path j = c.j(looper);
                j.moveTo(66.36202f, 28.0f);
                j.lineTo(76.99543f, 28.0f);
                j.cubicTo(79.20043f, 28.0f, 81.0f, 29.79529f, 81.0f, 32.00989f);
                j.lineTo(81.0f, 71.990105f);
                j.cubicTo(81.0f, 74.20595f, 79.20709f, 76.0f, 76.99543f, 76.0f);
                j.lineTo(19.00457f, 76.0f);
                j.cubicTo(16.79957f, 76.0f, 15.0f, 74.20471f, 15.0f, 71.990105f);
                j.lineTo(15.0f, 32.00989f);
                j.cubicTo(15.0f, 29.794052f, 16.792908f, 28.0f, 19.00457f, 28.0f);
                j.lineTo(29.637974f, 28.0f);
                j.lineTo(36.0f, 22.0f);
                j.lineTo(60.0f, 22.0f);
                j.lineTo(66.36202f, 28.0f);
                j.close();
                j.moveTo(48.0f, 70.0f);
                j.cubicTo(59.045696f, 70.0f, 68.0f, 61.045696f, 68.0f, 50.0f);
                j.cubicTo(68.0f, 38.954304f, 59.045696f, 30.0f, 48.0f, 30.0f);
                j.cubicTo(36.954304f, 30.0f, 28.0f, 38.954304f, 28.0f, 50.0f);
                j.cubicTo(28.0f, 61.045696f, 36.954304f, 70.0f, 48.0f, 70.0f);
                j.close();
                j.moveTo(48.0f, 63.0f);
                j.cubicTo(55.179703f, 63.0f, 61.0f, 57.179703f, 61.0f, 50.0f);
                j.cubicTo(61.0f, 42.820297f, 55.179703f, 37.0f, 48.0f, 37.0f);
                j.cubicTo(40.820297f, 37.0f, 35.0f, 42.820297f, 35.0f, 50.0f);
                j.cubicTo(35.0f, 57.179703f, 40.820297f, 63.0f, 48.0f, 63.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                j = c.j(looper);
                j.moveTo(66.36202f, 28.0f);
                j.lineTo(76.99543f, 28.0f);
                j.cubicTo(79.20043f, 28.0f, 81.0f, 29.79529f, 81.0f, 32.00989f);
                j.lineTo(81.0f, 71.990105f);
                j.cubicTo(81.0f, 74.20595f, 79.20709f, 76.0f, 76.99543f, 76.0f);
                j.lineTo(19.00457f, 76.0f);
                j.cubicTo(16.79957f, 76.0f, 15.0f, 74.20471f, 15.0f, 71.990105f);
                j.lineTo(15.0f, 32.00989f);
                j.cubicTo(15.0f, 29.794052f, 16.792908f, 28.0f, 19.00457f, 28.0f);
                j.lineTo(29.637974f, 28.0f);
                j.lineTo(36.0f, 22.0f);
                j.lineTo(60.0f, 22.0f);
                j.lineTo(66.36202f, 28.0f);
                j.close();
                j.moveTo(48.0f, 70.0f);
                j.cubicTo(59.045696f, 70.0f, 68.0f, 61.045696f, 68.0f, 50.0f);
                j.cubicTo(68.0f, 38.954304f, 59.045696f, 30.0f, 48.0f, 30.0f);
                j.cubicTo(36.954304f, 30.0f, 28.0f, 38.954304f, 28.0f, 50.0f);
                j.cubicTo(28.0f, 61.045696f, 36.954304f, 70.0f, 48.0f, 70.0f);
                j.close();
                j.moveTo(48.0f, 63.0f);
                j.cubicTo(55.179703f, 63.0f, 61.0f, 57.179703f, 61.0f, 50.0f);
                j.cubicTo(61.0f, 42.820297f, 55.179703f, 37.0f, 48.0f, 37.0f);
                j.cubicTo(40.820297f, 37.0f, 35.0f, 42.820297f, 35.0f, 50.0f);
                j.cubicTo(35.0f, 57.179703f, 40.820297f, 63.0f, 48.0f, 63.0f);
                j.close();
                Paint i4 = c.i(looper);
                i4.setFlags(385);
                i4.setStyle(Style.FILL);
                Paint i5 = c.i(looper);
                i5.setFlags(385);
                i5.setStyle(Style.STROKE);
                i4.setColor(-16777216);
                i5.setStrokeWidth(1.0f);
                i5.setStrokeCap(Cap.BUTT);
                i5.setStrokeJoin(Join.MITER);
                i5.setStrokeMiter(4.0f);
                i5.setPathEffect(null);
                float[] a2 = c.a(e, 81.0f, 0.0f, 15.0f, 0.0f, 76.0f, 22.0f);
                f.reset();
                f.setValues(a2);
                WeChatSVGRenderC2Java.setLinearGradient(a, 0.7940693f, 0.8090447f, 0.08431214f, 0.07970222f, new int[]{-4679064, -2112619}, new float[]{0.0f, 1.0f}, f, 0);
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}
