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

public final class ano extends c {
    private final int height = 60;
    private final int width = 60;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 60;
            case 1:
                return 60;
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
                canvas.save();
                Paint a = c.a(i2, looper);
                a.setColor(-1);
                Path j = c.j(looper);
                j.moveTo(0.0f, 3.0f);
                j.cubicTo(0.0f, 1.3431456f, 1.3431456f, 0.0f, 3.0f, 0.0f);
                j.lineTo(55.5f, 0.0f);
                j.cubicTo(57.156853f, 0.0f, 58.5f, 1.3431456f, 58.5f, 3.0f);
                j.lineTo(58.5f, 55.5f);
                j.cubicTo(58.5f, 57.156853f, 57.156853f, 58.5f, 55.5f, 58.5f);
                j.lineTo(3.0f, 58.5f);
                j.cubicTo(1.3431456f, 58.5f, 0.0f, 57.156853f, 0.0f, 55.5f);
                j.lineTo(0.0f, 3.0f);
                j.close();
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                i2 = c.a(i2, looper);
                i2.setColor(-16777216);
                j = c.j(looper);
                j.moveTo(31.5f, 18.0f);
                j.lineTo(31.5f, 46.5f);
                j.cubicTo(31.5f, 47.328426f, 30.828426f, 48.0f, 30.0f, 48.0f);
                j.lineTo(27.0f, 48.0f);
                j.cubicTo(26.171574f, 48.0f, 25.5f, 47.328426f, 25.5f, 46.5f);
                j.lineTo(25.5f, 18.0f);
                j.lineTo(13.5f, 18.0f);
                j.cubicTo(12.671573f, 18.0f, 12.0f, 17.328426f, 12.0f, 16.5f);
                j.lineTo(12.0f, 13.5f);
                j.cubicTo(12.0f, 12.671573f, 12.671573f, 12.0f, 13.5f, 12.0f);
                j.lineTo(45.0f, 12.0f);
                j.cubicTo(45.828426f, 12.0f, 46.5f, 12.671573f, 46.5f, 13.5f);
                j.lineTo(46.5f, 16.5f);
                j.cubicTo(46.5f, 17.328426f, 45.828426f, 18.0f, 45.0f, 18.0f);
                j.lineTo(31.5f, 18.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, i2);
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}
