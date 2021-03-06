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

public final class qf extends c {
    private final int height = 48;
    private final int width = 48;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 48;
            case 1:
                return 48;
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
                i2.setColor(-3355444);
                canvas.save();
                i3 = c.a(i2, looper);
                Path j = c.j(looper);
                j.moveTo(0.0f, 0.0f);
                j.lineTo(48.0f, 0.0f);
                j.lineTo(48.0f, 8.0f);
                j.lineTo(0.0f, 8.0f);
                j.lineTo(0.0f, 0.0f);
                j.lineTo(0.0f, 0.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, i3);
                canvas.restore();
                canvas.save();
                i3 = c.a(i2, looper);
                j = c.j(looper);
                j.moveTo(0.0f, 20.0f);
                j.lineTo(48.0f, 20.0f);
                j.lineTo(48.0f, 28.0f);
                j.lineTo(0.0f, 28.0f);
                j.lineTo(0.0f, 20.0f);
                j.lineTo(0.0f, 20.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, i3);
                canvas.restore();
                canvas.save();
                i2 = c.a(i2, looper);
                Path j2 = c.j(looper);
                j2.moveTo(0.0f, 40.0f);
                j2.lineTo(48.0f, 40.0f);
                j2.lineTo(48.0f, 48.0f);
                j2.lineTo(0.0f, 48.0f);
                j2.lineTo(0.0f, 40.0f);
                j2.lineTo(0.0f, 40.0f);
                j2.close();
                WeChatSVGRenderC2Java.setFillType(j2, 2);
                canvas.drawPath(j2, i2);
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}
