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

public final class x extends c {
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
                i2 = c.a(i2, looper);
                Path j = c.j(looper);
                j.moveTo(34.5f, 34.5f);
                j.lineTo(10.5f, 34.5f);
                j.lineTo(10.5f, 39.0f);
                j.lineTo(34.5f, 39.0f);
                j.lineTo(34.5f, 63.0f);
                j.lineTo(39.0f, 63.0f);
                j.lineTo(39.0f, 39.0f);
                j.lineTo(63.0f, 39.0f);
                j.lineTo(63.0f, 34.5f);
                j.lineTo(39.0f, 34.5f);
                j.lineTo(39.0f, 10.5f);
                j.lineTo(34.5f, 10.5f);
                j.lineTo(34.5f, 34.5f);
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
