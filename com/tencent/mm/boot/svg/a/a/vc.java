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

public final class vc extends c {
    private final int height = 80;
    private final int width = 120;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 120;
            case 1:
                return 80;
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
                Paint a = c.a(i2, looper);
                a.setColor(-1);
                canvas.save();
                e = c.a(e, 1.0f, 0.0f, 31.0f, 0.0f, 1.0f, 22.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path j = c.j(looper);
                j.moveTo(0.0f, 0.0f);
                j.lineTo(14.0f, 0.0f);
                j.lineTo(14.0f, 14.0f);
                j.lineTo(0.0f, 14.0f);
                j.lineTo(0.0f, 0.0f);
                j.close();
                j.moveTo(22.0f, 0.0f);
                j.lineTo(36.0f, 0.0f);
                j.lineTo(36.0f, 14.0f);
                j.lineTo(22.0f, 14.0f);
                j.lineTo(22.0f, 0.0f);
                j.close();
                j.moveTo(44.0f, 0.0f);
                j.lineTo(58.0f, 0.0f);
                j.lineTo(58.0f, 14.0f);
                j.lineTo(44.0f, 14.0f);
                j.lineTo(44.0f, 0.0f);
                j.close();
                j.moveTo(0.0f, 22.0f);
                j.lineTo(14.0f, 22.0f);
                j.lineTo(14.0f, 36.0f);
                j.lineTo(0.0f, 36.0f);
                j.lineTo(0.0f, 22.0f);
                j.close();
                j.moveTo(22.0f, 22.0f);
                j.lineTo(36.0f, 22.0f);
                j.lineTo(36.0f, 36.0f);
                j.lineTo(22.0f, 36.0f);
                j.lineTo(22.0f, 22.0f);
                j.close();
                j.moveTo(44.0f, 22.0f);
                j.lineTo(58.0f, 22.0f);
                j.lineTo(58.0f, 36.0f);
                j.lineTo(44.0f, 36.0f);
                j.lineTo(44.0f, 22.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a2);
                canvas.restore();
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}
