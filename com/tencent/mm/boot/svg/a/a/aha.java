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

public final class aha extends c {
    private final int height = 72;
    private final int width = 72;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 72;
            case 1:
                return 72;
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
                Path j = c.j(looper);
                j.moveTo(0.0f, 16.0f);
                j.cubicTo(0.0f, 7.1634436f, 7.1634436f, 0.0f, 16.0f, 0.0f);
                j.lineTo(56.0f, 0.0f);
                j.cubicTo(64.836555f, 0.0f, 72.0f, 7.1634436f, 72.0f, 16.0f);
                j.lineTo(72.0f, 56.0f);
                j.cubicTo(72.0f, 64.836555f, 64.836555f, 72.0f, 56.0f, 72.0f);
                j.lineTo(16.0f, 72.0f);
                j.cubicTo(7.1634436f, 72.0f, 0.0f, 64.836555f, 0.0f, 56.0f);
                j.lineTo(0.0f, 16.0f);
                j.close();
                canvas.save();
                Paint a = c.a(i2, looper);
                j = c.j(looper);
                j.moveTo(0.0f, 16.0f);
                j.cubicTo(0.0f, 7.1634436f, 7.1634436f, 0.0f, 16.0f, 0.0f);
                j.lineTo(56.0f, 0.0f);
                j.cubicTo(64.836555f, 0.0f, 72.0f, 7.1634436f, 72.0f, 16.0f);
                j.lineTo(72.0f, 56.0f);
                j.cubicTo(72.0f, 64.836555f, 64.836555f, 72.0f, 56.0f, 72.0f);
                j.lineTo(16.0f, 72.0f);
                j.cubicTo(7.1634436f, 72.0f, 0.0f, 64.836555f, 0.0f, 56.0f);
                j.lineTo(0.0f, 16.0f);
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
                float[] a2 = c.a(e, 72.0f, 0.0f, 0.0f, 0.0f, 72.0f, 0.0f);
                f.reset();
                f.setValues(a2);
                WeChatSVGRenderC2Java.setLinearGradient(a, 1.0f, 0.0f, 0.5f, 1.0766466f, new int[]{-5066062, -5066062, -4605511, -4605511}, new float[]{0.0f, 0.40918884f, 0.60456795f, 1.0f}, f, 0);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                float[] a3 = c.a(a2, 1.0f, 0.0f, 13.0f, 0.0f, 1.0f, 19.0f);
                f.reset();
                f.setValues(a3);
                canvas.concat(f);
                i3 = c.a(i2, looper);
                i3.setColor(-1);
                canvas.save();
                Paint a4 = c.a(i3, looper);
                j = c.j(looper);
                j.moveTo(44.0f, 5.9411254f);
                j.lineTo(27.247156f, 22.69397f);
                j.cubicTo(24.901516f, 25.039608f, 21.10245f, 25.043575f, 18.752844f, 22.69397f);
                j.lineTo(0.0f, 3.9411254f);
                j.lineTo(0.0f, 1.005643f);
                j.cubicTo(0.0f, 0.4502417f, 0.4498156f, 0.0f, 1.0016723f, 0.0f);
                j.lineTo(3.1299424f, 0.0f);
                j.lineTo(22.295103f, 19.165161f);
                j.cubicTo(22.679518f, 19.549576f, 23.315594f, 19.554464f, 23.704897f, 19.165161f);
                j.lineTo(42.870056f, 0.0f);
                j.lineTo(42.99833f, 0.0f);
                j.cubicTo(43.551537f, 0.0f, 44.0f, 0.4415441f, 44.0f, 1.005643f);
                j.lineTo(44.0f, 5.9411254f);
                j.lineTo(44.0f, 5.9411254f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a4);
                canvas.restore();
                canvas.restore();
                canvas.save();
                float[] a5 = c.a(a3, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 17.0f);
                f.reset();
                f.setValues(a5);
                canvas.concat(f);
                i3 = c.a(i2, looper);
                i3.setColor(-1);
                canvas.save();
                Paint a6 = c.a(i3, looper);
                j = c.j(looper);
                j.moveTo(0.0f, 6.000244f);
                j.cubicTo(0.0f, 2.686401f, 2.6835413f, 0.0f, 6.0063868f, 0.0f);
                j.lineTo(41.993614f, 0.0f);
                j.cubicTo(45.31085f, 0.0f, 48.0f, 2.6872263f, 48.0f, 6.000244f);
                j.lineTo(48.0f, 31.999756f);
                j.cubicTo(48.0f, 35.3136f, 45.31646f, 38.0f, 41.993614f, 38.0f);
                j.lineTo(6.0063868f, 38.0f);
                j.cubicTo(2.6891508f, 38.0f, 0.0f, 35.312775f, 0.0f, 31.999756f);
                j.lineTo(0.0f, 6.000244f);
                j.lineTo(0.0f, 6.000244f);
                j.close();
                j.moveTo(5.0f, 5.996535f);
                j.cubicTo(5.0f, 5.4461637f, 5.4532304f, 5.0f, 5.9968753f, 5.0f);
                j.lineTo(42.003124f, 5.0f);
                j.cubicTo(42.553684f, 5.0f, 43.0f, 5.439813f, 43.0f, 5.996535f);
                j.lineTo(43.0f, 32.003464f);
                j.cubicTo(43.0f, 32.553837f, 42.54677f, 33.0f, 42.003124f, 33.0f);
                j.lineTo(5.9968753f, 33.0f);
                j.cubicTo(5.4463162f, 33.0f, 5.0f, 32.56019f, 5.0f, 32.003464f);
                j.lineTo(5.0f, 5.996535f);
                j.lineTo(5.0f, 5.996535f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a6);
                canvas.restore();
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}
