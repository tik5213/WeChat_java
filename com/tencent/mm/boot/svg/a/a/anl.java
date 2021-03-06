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

public final class anl extends c {
    private final int height = 49;
    private final int width = 48;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 48;
            case 1:
                return 49;
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
                Paint a = c.a(i2, looper);
                a.setColor(-6381921);
                e = c.a(e, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path j = c.j(looper);
                j.moveTo(26.0f, 0.0f);
                j.cubicTo(27.716187f, -0.38932037f, 29.024296f, 0.74794596f, 30.0f, 2.0f);
                j.cubicTo(35.235313f, 7.012887f, 40.407833f, 12.2004175f, 46.0f, 17.0f);
                j.cubicTo(46.718708f, 18.575094f, 48.416252f, 19.832073f, 48.0f, 22.0f);
                j.cubicTo(47.178043f, 23.263824f, 45.800037f, 24.361187f, 45.0f, 26.0f);
                j.cubicTo(37.232426f, 32.78095f, 30.132692f, 40.32282f, 23.0f, 47.0f);
                j.cubicTo(17.980267f, 48.602917f, 12.877645f, 47.56541f, 8.0f, 48.0f);
                j.cubicTo(5.478345f, 47.61529f, 1.5440342f, 48.99198f, 0.0f, 46.0f);
                j.cubicTo(-0.07362649f, 39.285313f, -0.06364093f, 32.591404f, 0.0f, 26.0f);
                j.cubicTo(5.857796f, 19.403105f, 12.418309f, 13.626988f, 18.0f, 7.0f);
                j.cubicTo(21.025862f, 4.9977307f, 23.172756f, 2.1046848f, 26.0f, 0.0f);
                j.lineTo(26.0f, 0.0f);
                j.close();
                j.moveTo(4.0f, 27.0f);
                j.cubicTo(4.0197816f, 32.796772f, 4.0098906f, 38.393444f, 4.0f, 44.0f);
                j.cubicTo(8.945341f, 43.990112f, 13.880792f, 43.980225f, 19.0f, 44.0f);
                j.cubicTo(26.560646f, 36.504814f, 34.285267f, 28.979963f, 42.0f, 21.0f);
                j.cubicTo(36.856846f, 16.30341f, 31.7038f, 11.151705f, 27.0f, 6.0f);
                j.cubicTo(19.033836f, 13.069998f, 11.507028f, 20.120218f, 4.0f, 27.0f);
                j.lineTo(4.0f, 27.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                j = c.j(looper);
                j.moveTo(12.0f, 31.0f);
                j.cubicTo(14.287206f, 29.916079f, 17.727032f, 32.54695f, 17.0f, 35.0f);
                j.cubicTo(16.355257f, 37.92308f, 12.759549f, 38.921356f, 11.0f, 37.0f);
                j.cubicTo(9.3509f, 35.43779f, 9.828942f, 32.505356f, 12.0f, 31.0f);
                j.lineTo(12.0f, 31.0f);
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
