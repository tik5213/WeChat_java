package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.plugin.appbrand.s$l;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class ss extends c {
    private final int height = s$l.AppCompatTheme_ratingBarStyleSmall;
    private final int width = s$l.AppCompatTheme_ratingBarStyleSmall;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return s$l.AppCompatTheme_ratingBarStyleSmall;
            case 1:
                return s$l.AppCompatTheme_ratingBarStyleSmall;
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
                e = c.a(e, 1.0f, 0.0f, 21.0f, 0.0f, 1.0f, 21.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                Paint a = c.a(i2, looper);
                a.setColor(-499359);
                Path j = c.j(looper);
                j.moveTo(42.462597f, 24.958805f);
                j.cubicTo(42.750237f, 25.252054f, 43.02305f, 25.55946f, 43.284f, 25.879f);
                j.lineTo(43.284f, 2.4524336f);
                j.cubicTo(40.165432f, 1.4371847f, 36.847195f, 0.879f, 33.399467f, 0.879f);
                j.cubicTo(29.116503f, 0.879f, 25.031225f, 1.7344787f, 21.284f, 3.2694867f);
                j.lineTo(42.474457f, 24.947681f);
                j.lineTo(42.462597f, 24.958805f);
                j.lineTo(42.462597f, 24.958805f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-16384);
                j = c.j(looper);
                j.moveTo(33.085453f, 20.821308f);
                j.cubicTo(33.09332f, 20.821308f, 33.101185f, 20.820332f, 33.10905f, 20.820332f);
                j.cubicTo(33.505287f, 20.820332f, 33.89661f, 20.843798f, 34.284f, 20.879f);
                j.lineTo(18.196526f, 4.879f);
                j.cubicTo(11.553879f, 8.305266f, 6.2513633f, 13.943353f, 3.284f, 20.819353f);
                j.lineTo(33.085453f, 20.819353f);
                j.lineTo(33.085453f, 20.821308f);
                j.lineTo(33.085453f, 20.821308f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-9676047);
                j = c.j(looper);
                j.moveTo(46.343616f, 3.879f);
                j.lineTo(46.343616f, 33.680458f);
                j.cubicTo(46.343616f, 34.085213f, 46.32114f, 34.48407f, 46.284f, 34.879f);
                j.lineTo(62.284f, 18.795938f);
                j.cubicTo(58.860386f, 12.149923f, 53.222122f, 6.8458834f, 46.343616f, 3.879f);
                j.lineTo(46.343616f, 3.879f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-5117108);
                j = c.j(looper);
                j.moveTo(4.284f, 48.968616f);
                j.cubicTo(7.704265f, 55.60768f, 13.332067f, 60.90832f, 20.198982f, 63.879f);
                j.lineTo(20.198982f, 34.101467f);
                j.lineTo(20.22439f, 34.101467f);
                j.cubicTo(20.22439f, 34.09361f, 20.223412f, 34.086727f, 20.223412f, 34.07985f);
                j.cubicTo(20.223412f, 33.673996f, 20.245888f, 33.274044f, 20.284f, 32.879f);
                j.lineTo(4.284f, 48.968616f);
                j.lineTo(4.284f, 48.968616f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-10818218);
                j = c.j(looper);
                j.moveTo(24.129469f, 42.824417f);
                j.cubicTo(23.832813f, 42.52342f, 23.550991f, 42.20828f, 23.284f, 41.879f);
                j.lineTo(23.284f, 65.29926f);
                j.cubicTo(26.411741f, 66.31842f, 29.739231f, 66.879f, 33.19725f, 66.879f);
                j.cubicTo(37.469097f, 66.879f, 41.54416f, 66.02954f, 45.284f, 64.50435f);
                j.lineTo(24.09387f, 42.86078f);
                j.lineTo(24.129469f, 42.824417f);
                j.lineTo(24.129469f, 42.824417f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-12799249);
                j = c.j(looper);
                j.moveTo(63.902184f, 21.879f);
                j.lineTo(42.240566f, 43.067806f);
                j.lineTo(42.21834f, 43.04607f);
                j.cubicTo(41.921375f, 43.337547f, 41.608242f, 43.61519f, 41.284f, 43.879f);
                j.lineTo(64.705215f, 43.879f);
                j.cubicTo(65.7244f, 40.754776f, 66.284f, 37.429974f, 66.284f, 33.97475f);
                j.cubicTo(66.284f, 29.698456f, 65.43147f, 25.61977f, 63.902184f, 21.879f);
                j.lineTo(63.902184f, 21.879f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-11083026);
                j = c.j(looper);
                j.moveTo(33.506523f, 46.939556f);
                j.cubicTo(33.094105f, 46.939556f, 32.686596f, 46.91709f, 32.284f, 46.879f);
                j.lineTo(48.36924f, 62.879f);
                j.cubicTo(55.011116f, 59.461384f, 60.313618f, 53.83242f, 63.284f, 46.963978f);
                j.lineTo(33.506523f, 46.963978f);
                j.lineTo(33.506523f, 46.939556f);
                j.lineTo(33.506523f, 46.939556f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-1124019);
                j = c.j(looper);
                j.moveTo(24.35268f, 24.71294f);
                j.cubicTo(24.648964f, 24.42111f, 24.961426f, 24.143131f, 25.284f, 23.879f);
                j.lineTo(1.8574337f, 23.879f);
                j.cubicTo(0.84218466f, 27.000093f, 0.284f, 30.321016f, 0.284f, 33.77153f);
                j.cubicTo(0.284f, 38.05203f, 1.136445f, 42.134678f, 2.6674082f, 45.879f);
                j.lineTo(24.3274f, 24.68821f);
                j.lineTo(24.35268f, 24.71294f);
                j.lineTo(24.35268f, 24.71294f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}
