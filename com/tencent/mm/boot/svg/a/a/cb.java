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

public final class cb extends c {
    private final int height = 90;
    private final int width = 90;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 90;
            case 1:
                return 90;
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
                i2.setColor(-1);
                canvas.save();
                Paint a = c.a(i2, looper);
                Path j = c.j(looper);
                j.moveTo(14.0f, 0.0f);
                j.cubicTo(12.343145f, 3.043592E-16f, 11.0f, 1.3431457f, 11.0f, 3.0f);
                j.lineTo(11.0f, 87.0f);
                j.cubicTo(11.0f, 88.65685f, 12.343145f, 90.0f, 14.0f, 90.0f);
                j.lineTo(0.0f, 90.0f);
                j.lineTo(0.0f, 0.0f);
                j.lineTo(14.0f, 0.0f);
                j.close();
                j.moveTo(57.0f, 0.0f);
                j.lineTo(90.0f, 0.0f);
                j.lineTo(90.0f, 90.0f);
                j.lineTo(76.0f, 90.0f);
                j.cubicTo(77.65685f, 90.0f, 79.0f, 88.65685f, 79.0f, 87.0f);
                j.lineTo(79.0f, 22.0f);
                j.lineTo(57.0f, 0.0f);
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
