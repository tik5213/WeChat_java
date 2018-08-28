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

public final class apx extends c {
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
                canvas.save();
                e = c.a(e, 1.0f, 0.0f, 14.0f, 0.0f, 1.0f, 14.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                Paint a = c.a(i2, looper);
                a.setColor(-499359);
                Path j = c.j(looper);
                j.moveTo(44.308483f, 25.29576f);
                j.cubicTo(44.61065f, 25.603817f, 44.89724f, 25.926746f, 45.171368f, 26.262423f);
                j.lineTo(45.171368f, 1.6528872f);
                j.cubicTo(41.89532f, 0.5863713f, 38.409523f, 0.0f, 34.787697f, 0.0f);
                j.cubicTo(30.288454f, 0.0f, 25.996883f, 0.89867777f, 22.060434f, 2.5111988f);
                j.lineTo(44.320946f, 25.284075f);
                j.lineTo(44.308483f, 25.29576f);
                j.lineTo(44.308483f, 25.29576f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-16384);
                j = c.j(looper);
                j.moveTo(34.457825f, 20.949333f);
                j.cubicTo(34.466087f, 20.949333f, 34.47435f, 20.948307f, 34.482613f, 20.948307f);
                j.cubicTo(34.89886f, 20.948307f, 35.309944f, 20.97296f, 35.716896f, 21.00994f);
                j.lineTo(18.817053f, 4.2019877f);
                j.cubicTo(11.838973f, 7.80127f, 6.268697f, 13.724062f, 3.1514907f, 20.947279f);
                j.lineTo(34.457825f, 20.947279f);
                j.lineTo(34.457825f, 20.949333f);
                j.lineTo(34.457825f, 20.949333f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-9676047);
                j = c.j(looper);
                j.moveTo(48.385487f, 3.1514907f);
                j.lineTo(48.385487f, 34.45783f);
                j.cubicTo(48.385487f, 34.883022f, 48.361874f, 35.30202f, 48.322857f, 35.716896f);
                j.lineTo(65.130806f, 18.82169f);
                j.cubicTo(61.534313f, 11.840071f, 55.611336f, 6.2681923f, 48.385487f, 3.1514907f);
                j.lineTo(48.385487f, 3.1514907f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-5117108);
                j = c.j(looper);
                j.moveTo(4.2019877f, 50.517994f);
                j.cubicTo(7.7949657f, 57.492313f, 13.706954f, 63.06062f, 20.920628f, 66.181305f);
                j.lineTo(20.920628f, 34.9001f);
                j.lineTo(20.947317f, 34.9001f);
                j.cubicTo(20.947317f, 34.89184f, 20.946291f, 34.884617f, 20.946291f, 34.87739f);
                j.cubicTo(20.946291f, 34.451042f, 20.969902f, 34.03089f, 21.00994f, 33.615902f);
                j.lineTo(4.2019877f, 50.517994f);
                j.lineTo(4.2019877f, 50.517994f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-10818218);
                j = c.j(looper);
                j.moveTo(25.049591f, 44.06353f);
                j.cubicTo(24.737955f, 43.747334f, 24.441902f, 43.41628f, 24.161428f, 43.070374f);
                j.lineTo(24.161428f, 67.673294f);
                j.cubicTo(27.447113f, 68.743904f, 30.94263f, 69.332794f, 34.575268f, 69.332794f);
                j.cubicTo(39.062828f, 69.332794f, 43.34367f, 68.44044f, 47.27236f, 66.838234f);
                j.lineTo(25.012196f, 44.10173f);
                j.lineTo(25.049591f, 44.06353f);
                j.lineTo(25.049591f, 44.06353f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-12799249);
                j = c.j(looper);
                j.moveTo(66.8307f, 22.060434f);
                j.lineTo(44.07524f, 44.319214f);
                j.lineTo(44.0519f, 44.29638f);
                j.cubicTo(43.739933f, 44.602573f, 43.410988f, 44.894234f, 43.070374f, 45.171368f);
                j.lineTo(67.674286f, 45.171368f);
                j.cubicTo(68.74494f, 41.889378f, 69.332794f, 38.396687f, 69.332794f, 34.766983f);
                j.cubicTo(69.332794f, 30.27475f, 68.43722f, 25.990103f, 66.8307f, 22.060434f);
                j.lineTo(66.8307f, 22.060434f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-11083026);
                j = c.j(looper);
                j.moveTo(34.900158f, 48.386475f);
                j.cubicTo(34.466915f, 48.386475f, 34.03883f, 48.362873f, 33.615902f, 48.322857f);
                j.lineTo(50.513397f, 65.130806f);
                j.cubicTo(57.490665f, 61.54061f, 63.06093f, 55.627407f, 66.181305f, 48.412125f);
                j.lineTo(34.900158f, 48.412125f);
                j.lineTo(34.900158f, 48.386475f);
                j.lineTo(34.900158f, 48.386475f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-1124019);
                j = c.j(looper);
                j.moveTo(25.284075f, 25.037481f);
                j.cubicTo(25.59532f, 24.730915f, 25.92356f, 24.438898f, 26.262423f, 24.161428f);
                j.lineTo(1.6528872f, 24.161428f);
                j.cubicTo(0.5863713f, 27.440128f, 0.0f, 30.928747f, 0.0f, 34.5535f);
                j.cubicTo(0.0f, 39.05015f, 0.89549094f, 43.338963f, 2.503763f, 47.27236f);
                j.lineTo(25.257519f, 25.011501f);
                j.lineTo(25.284075f, 25.037481f);
                j.lineTo(25.284075f, 25.037481f);
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
