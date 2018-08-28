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

public final class nn extends c {
    private final int height = 162;
    private final int width = 162;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 162;
            case 1:
                return 162;
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
                e = c.a(e, 1.0f, 0.0f, 0.333333f, 0.0f, 1.0f, 0.222222f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                e = c.a(e, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.05f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                Paint a = c.a(i2, looper);
                a.setColor(-1);
                Path j = c.j(looper);
                j.moveTo(0.6666667f, 80.727776f);
                j.cubicTo(0.6666667f, 36.615704f, 36.554333f, 0.7277778f, 80.666664f, 0.7277778f);
                j.cubicTo(124.779f, 0.7277778f, 160.66667f, 36.615704f, 160.66667f, 80.727776f);
                j.cubicTo(160.66667f, 124.83985f, 124.779f, 160.72778f, 80.666664f, 160.72778f);
                j.cubicTo(36.554333f, 160.72778f, 0.6666667f, 124.83985f, 0.6666667f, 80.727776f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-11711155);
                j = c.j(looper);
                j.moveTo(94.666664f, 75.727776f);
                j.lineTo(94.666664f, 72.727776f);
                j.lineTo(94.666664f, 65.727776f);
                j.cubicTo(94.666664f, 57.59596f, 88.18667f, 50.72778f, 80.150536f, 50.72778f);
                j.lineTo(79.18279f, 50.72778f);
                j.cubicTo(71.13917f, 50.72778f, 64.666664f, 57.594822f, 64.666664f, 65.727776f);
                j.lineTo(64.666664f, 72.727776f);
                j.lineTo(64.666664f, 75.727776f);
                j.lineTo(94.666664f, 75.727776f);
                j.close();
                j.moveTo(67.666664f, 66.39445f);
                j.cubicTo(67.666664f, 59.320904f, 72.80921f, 53.72778f, 78.666664f, 53.72778f);
                j.lineTo(80.666664f, 53.72778f);
                j.cubicTo(86.524124f, 53.72778f, 91.666664f, 59.320904f, 91.666664f, 66.39445f);
                j.lineTo(91.666664f, 72.727776f);
                j.lineTo(67.666664f, 72.727776f);
                j.lineTo(67.666664f, 66.39445f);
                j.close();
                j.moveTo(94.666664f, 72.727776f);
                j.lineTo(94.666664f, 75.727776f);
                j.lineTo(101.666664f, 75.727776f);
                j.lineTo(101.666664f, 107.727776f);
                j.lineTo(57.666668f, 107.727776f);
                j.lineTo(57.666668f, 75.727776f);
                j.lineTo(64.666664f, 75.727776f);
                j.lineTo(64.666664f, 72.727776f);
                j.lineTo(57.666668f, 72.727776f);
                j.cubicTo(56.894035f, 72.88537f, 56.49158f, 73.059715f, 55.666668f, 73.727776f);
                j.cubicTo(55.42945f, 73.78284f, 54.912796f, 74.532776f, 54.666668f, 75.727776f);
                j.cubicTo(54.68995f, 75.62584f, 54.666668f, 107.727776f, 54.666668f, 107.727776f);
                j.cubicTo(54.666668f, 108.5316f, 55.248734f, 109.55201f, 55.666668f, 109.727776f);
                j.cubicTo(56.664536f, 110.51654f, 57.305363f, 110.727776f, 57.666668f, 110.727776f);
                j.lineTo(101.666664f, 110.727776f);
                j.cubicTo(103.168816f, 110.727776f, 104.666664f, 109.22566f, 104.666664f, 107.727776f);
                j.lineTo(104.666664f, 75.727776f);
                j.cubicTo(104.666664f, 74.228775f, 103.17769f, 72.727776f, 101.666664f, 72.727776f);
                j.lineTo(94.666664f, 72.727776f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}
