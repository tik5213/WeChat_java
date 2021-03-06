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

public final class ti extends c {
    private final int height = 120;
    private final int width = 120;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 120;
            case 1:
                return 120;
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
                canvas.save();
                float[] a = c.a(e, 1.0f, 0.0f, 15.0f, 0.0f, 1.0f, 0.0f);
                f.reset();
                f.setValues(a);
                canvas.concat(f);
                Paint a2 = c.a(i2, looper);
                a2.setColor(-1);
                canvas.save();
                Paint a3 = c.a(a2, looper);
                Path j = c.j(looper);
                j.moveTo(60.0f, 0.0f);
                j.lineTo(90.0f, 30.0f);
                j.lineTo(90.0f, 116.0f);
                j.cubicTo(90.0f, 118.20914f, 88.20914f, 120.0f, 86.0f, 120.0f);
                j.lineTo(4.0f, 120.0f);
                j.cubicTo(1.790861f, 120.0f, 2.705415E-16f, 118.20914f, 0.0f, 116.0f);
                j.lineTo(0.0f, 4.0f);
                j.cubicTo(-2.705415E-16f, 1.790861f, 1.790861f, 4.0581224E-16f, 4.0f, 0.0f);
                j.lineTo(60.0f, 0.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                a2 = c.a(i2, looper);
                a2.setColor(201326592);
                canvas.save();
                a3 = c.a(a2, looper);
                j = c.j(looper);
                j.moveTo(60.0f, 0.0f);
                j.lineTo(90.0f, 30.0f);
                j.lineTo(90.0f, 116.0f);
                j.cubicTo(90.0f, 118.20914f, 88.20914f, 120.0f, 86.0f, 120.0f);
                j.lineTo(4.0f, 120.0f);
                j.cubicTo(1.790861f, 120.0f, 2.705415E-16f, 118.20914f, 0.0f, 116.0f);
                j.lineTo(0.0f, 4.0f);
                j.cubicTo(-2.705415E-16f, 1.790861f, 1.790861f, 4.0581224E-16f, 4.0f, 0.0f);
                j.lineTo(60.0f, 0.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                a3 = c.a(i2, looper);
                a3.setColor(-16777216);
                j = c.j(looper);
                j.moveTo(90.0f, 30.0f);
                j.lineTo(64.0f, 30.0f);
                j.cubicTo(61.79086f, 30.0f, 60.0f, 28.209139f, 60.0f, 26.0f);
                j.lineTo(60.0f, 0.0f);
                j.lineTo(90.0f, 30.0f);
                j.close();
                canvas.saveLayerAlpha(null, 25, 4);
                i3 = c.a(a3, looper);
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, i3);
                canvas.restore();
                canvas.save();
                i2 = c.a(i2, looper);
                i2.setColor(-10461088);
                e = c.a(a, 1.0f, 0.0f, 21.0f, 0.0f, 1.0f, 58.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.saveLayerAlpha(null, 204, 4);
                canvas.save();
                i3 = c.a(i2, looper);
                Path j2 = c.j(looper);
                j2.moveTo(-3.5527137E-15f, 13.20906f);
                j2.lineTo(13.891402f, 3.9411764f);
                j2.lineTo(13.891402f, 7.1200304f);
                j2.lineTo(3.5791855f, 14.0f);
                j2.lineTo(13.891402f, 20.87997f);
                j2.lineTo(13.891402f, 24.058823f);
                j2.lineTo(-1.5543122E-15f, 14.79094f);
                j2.lineTo(0.0f, 13.20906f);
                j2.close();
                WeChatSVGRenderC2Java.setFillType(j2, 2);
                canvas.drawPath(j2, i3);
                canvas.restore();
                canvas.save();
                Paint a4 = c.a(i2, looper);
                e = c.a(e, -1.0f, 0.0f, 76.23529f, 0.0f, 1.0f, 0.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                j = c.j(looper);
                j.moveTo(31.235294f, 13.20906f);
                j.lineTo(45.126698f, 3.9411764f);
                j.lineTo(45.126698f, 7.1200304f);
                j.lineTo(34.81448f, 14.0f);
                j.lineTo(45.126698f, 20.87997f);
                j.lineTo(45.126698f, 24.058823f);
                j.lineTo(31.235294f, 14.79094f);
                j.lineTo(31.235294f, 13.20906f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a4);
                canvas.restore();
                canvas.save();
                a2 = c.a(i2, looper);
                Path j3 = c.j(looper);
                j3.moveTo(26.200712f, 0.0f);
                j3.lineTo(29.377182f, 0.0f);
                j3.lineTo(19.588236f, 28.0f);
                j3.lineTo(16.411764f, 28.0f);
                j3.close();
                WeChatSVGRenderC2Java.setFillType(j3, 1);
                WeChatSVGRenderC2Java.setFillType(j3, 2);
                canvas.drawPath(j3, a2);
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
