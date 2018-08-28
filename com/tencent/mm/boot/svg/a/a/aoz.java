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

public final class aoz extends c {
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
                i3.setColor(-14046139);
                Path j = c.j(looper);
                j.moveTo(0.0f, 0.0f);
                j.lineTo(96.0f, 0.0f);
                j.lineTo(96.0f, 96.0f);
                j.lineTo(0.0f, 96.0f);
                j.lineTo(0.0f, 0.0f);
                j.close();
                canvas.saveLayerAlpha(null, 0, 4);
                canvas.drawPath(j, c.a(i3, looper));
                canvas.restore();
                canvas.saveLayerAlpha(null, 204, 4);
                canvas.restore();
                canvas.save();
                Paint a = c.a(i2, looper);
                a.setColor(-1);
                e = c.a(e, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 12.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.saveLayerAlpha(null, 204, 4);
                canvas.save();
                Paint a2 = c.a(a, looper);
                e = c.a(e, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 53.63604f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                Path j2 = c.j(looper);
                j2.moveTo(37.79998f, 15.784549f);
                j2.lineTo(37.79998f, 43.5f);
                j2.lineTo(34.19998f, 43.5f);
                j2.lineTo(34.19998f, 15.784586f);
                j2.lineTo(27.938982f, 22.045584f);
                j2.lineTo(25.393398f, 19.5f);
                j2.lineTo(33.87868f, 11.014719f);
                j2.cubicTo(35.05025f, 9.843145f, 36.94975f, 9.843145f, 38.12132f, 11.014719f);
                j2.lineTo(38.545586f, 11.438983f);
                j2.lineTo(46.6066f, 19.5f);
                j2.lineTo(44.061016f, 22.045584f);
                j2.lineTo(37.79998f, 15.784549f);
                j2.close();
                WeChatSVGRenderC2Java.setFillType(j2, 1);
                canvas.drawPath(j2, a2);
                canvas.restore();
                canvas.save();
                Paint a3 = c.a(a, looper);
                j2 = c.j(looper);
                j2.moveTo(56.4f, 24.6f);
                j2.lineTo(48.0f, 24.6f);
                j2.lineTo(48.0f, 21.0f);
                j2.lineTo(57.00313f, 21.0f);
                j2.cubicTo(58.65261f, 21.0f, 60.0f, 22.337517f, 60.0f, 23.987425f);
                j2.lineTo(60.0f, 63.012573f);
                j2.cubicTo(60.0f, 64.65324f, 58.662483f, 66.0f, 57.012573f, 66.0f);
                j2.lineTo(14.987426f, 66.0f);
                j2.cubicTo(13.346761f, 66.0f, 12.0f, 64.66248f, 12.0f, 63.012573f);
                j2.lineTo(12.0f, 23.987425f);
                j2.cubicTo(12.0f, 22.34676f, 13.341744f, 21.0f, 14.99687f, 21.0f);
                j2.lineTo(24.0f, 21.0f);
                j2.lineTo(24.0f, 24.6f);
                j2.lineTo(15.6f, 24.6f);
                j2.lineTo(15.6f, 62.4f);
                j2.lineTo(56.4f, 62.4f);
                j2.lineTo(56.4f, 24.6f);
                j2.close();
                WeChatSVGRenderC2Java.setFillType(j2, 1);
                canvas.drawPath(j2, a3);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}
