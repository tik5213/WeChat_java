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

public final class ak extends c {
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
                canvas.save();
                Paint a = c.a(i2, looper);
                a.setColor(-1);
                e = c.a(e, 1.0f, 0.0f, 24.0f, 0.0f, 1.0f, 20.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path j = c.j(looper);
                j.moveTo(24.0f, 9.0f);
                j.cubicTo(24.057f, 5.94928f, 23.56735f, 2.849655f, 25.0f, 0.0f);
                j.cubicTo(29.882835f, 3.9195254f, 35.1091f, 7.7990556f, 40.0f, 12.0f);
                j.cubicTo(41.234722f, 12.54848f, 40.78504f, 14.168284f, 40.0f, 15.0f);
                j.cubicTo(34.779335f, 18.527756f, 29.752928f, 22.337296f, 25.0f, 26.0f);
                j.cubicTo(23.3575f, 22.54727f, 24.216885f, 18.627745f, 24.0f, 15.0f);
                j.cubicTo(19.050577f, 15.228156f, 14.094121f, 17.067934f, 11.0f, 21.0f);
                j.cubicTo(5.9099708f, 26.006851f, 4.630885f, 34.115868f, 8.0f, 41.0f);
                j.cubicTo(10.586628f, 47.15429f, 17.861427f, 51.53376f, 25.0f, 51.0f);
                j.cubicTo(32.39104f, 50.643867f, 39.086258f, 45.364506f, 41.0f, 38.0f);
                j.cubicTo(42.224014f, 35.5057f, 41.57448f, 32.356083f, 42.0f, 29.0f);
                j.cubicTo(43.61302f, 27.286695f, 47.230434f, 27.696646f, 48.0f, 30.0f);
                j.cubicTo(48.989178f, 39.06527f, 44.592323f, 48.344147f, 37.0f, 53.0f);
                j.cubicTo(30.132656f, 57.72301f, 20.819313f, 58.252945f, 13.0f, 55.0f);
                j.cubicTo(6.329671f, 51.103813f, 1.1633635f, 43.974674f, 3.5527137E-15f, 36.0f);
                j.cubicTo(-1.0650437f, 27.176708f, 3.3018348f, 17.767849f, 11.0f, 13.0f);
                j.cubicTo(14.773635f, 10.288754f, 19.420313f, 9.2188835f, 24.0f, 9.0f);
                j.lineTo(24.0f, 9.0f);
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
