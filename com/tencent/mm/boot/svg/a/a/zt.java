package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class zt extends c {
    private final int height = 56;
    private final int width = 40;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 40;
            case 1:
                return 56;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                c.f(looper);
                c.e(looper);
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
                i2.setColor(-7105645);
                canvas.save();
                Paint a = c.a(i2, looper);
                Path j = c.j(looper);
                j.moveTo(40.0f, 0.0f);
                j.lineTo(40.0f, 0.0f);
                j.lineTo(40.0f, 56.0f);
                j.lineTo(40.0f, 56.0f);
                j.cubicTo(28.04299f, 47.66f, 16.135965f, 39.26f, 4.0f, 31.0f);
                j.cubicTo(2.9492626f, 29.86f, 1.6795801f, 28.79f, 0.0f, 29.0f);
                j.lineTo(0.0f, 27.0f);
                j.cubicTo(0.179955f, 27.41f, 0.52986753f, 27.41f, 1.0f, 27.0f);
                j.cubicTo(13.886528f, 18.41f, 26.88328f, 9.13f, 40.0f, 0.0f);
                j.lineTo(40.0f, 0.0f);
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
