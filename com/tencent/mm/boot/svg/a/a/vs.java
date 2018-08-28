package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;

public final class vs extends c {
    private final int height = 180;
    private final int width = 180;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 180;
            case 1:
                return 180;
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
                Paint a = c.a(i3, looper);
                a.setStrokeWidth(1.0f);
                canvas.save();
                float[] a2 = c.a(e, 1.0f, 0.0f, 30.0f, 0.0f, 1.0f, 24.0f);
                f.reset();
                f.setValues(a2);
                canvas.concat(f);
                canvas.save();
                Paint a3 = c.a(a, looper);
                a3.setColor(-16074);
                a3.setStrokeWidth(4.5f);
                Path j = c.j(looper);
                j.moveTo(79.795166f, 69.0f);
                j.cubicTo(80.84132f, 69.0f, 81.68458f, 69.0f, 82.27852f, 69.0f);
                j.cubicTo(88.17543f, 69.0f, 93.0f, 63.923756f, 93.0f, 57.719162f);
                j.lineTo(93.0f, 31.08488f);
                j.cubicTo(92.99973f, 9.443161f, 77.23633f, 6.1085777f, 77.23633f, 6.1085777f);
                j.cubicTo(64.17073f, -3.16201f, 46.449528f, -1.8522556f, 34.69421f, 9.8445635f);
                j.cubicTo(28.109148f, 16.402514f, 24.0f, 25.684708f, 24.0f, 35.978374f);
                j.cubicTo(24.0f, 43.025726f, 24.0f, 51.499718f, 24.0f, 57.719162f);
                j.cubicTo(24.0f, 63.923756f, 28.824574f, 69.0f, 34.72148f, 69.0f);
                j.cubicTo(35.315956f, 69.0f, 36.093964f, 69.0f, 37.02466f, 69.0f);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                a2 = c.a(a2, 1.0f, 0.0f, 90.0f, 0.0f, 1.0f, 36.0f);
                f.reset();
                f.setValues(a2);
                canvas.concat(f);
                canvas.restore();
                canvas.save();
                a3 = c.a(a, looper);
                a3.setColor(-16074);
                a3.setStrokeWidth(4.5f);
                j = c.j(looper);
                j.moveTo(112.03832f, 129.37389f);
                j.cubicTo(111.18502f, 125.1752f, 109.58488f, 117.436f, 106.5941f, 102.82027f);
                j.cubicTo(104.8089f, 94.19127f, 99.69263f, 94.09959f, 80.07527f, 88.468895f);
                j.lineTo(73.16765f, 83.92315f);
                j.cubicTo(73.16765f, 82.2035f, 73.16765f, 79.714485f, 73.16765f, 78.0f);
                j.moveTo(47.912327f, 78.0f);
                j.cubicTo(47.82817f, 80.086105f, 47.82817f, 81.855f, 47.82817f, 83.92315f);
                j.lineTo(40.92027f, 88.46862f);
                j.cubicTo(24.830534f, 93.08673f, 52.997284f, 85.00266f, 24.00238f, 93.324234f);
                j.cubicTo(18.86542f, 95.22453f, 15.611796f, 96.862564f, 14.401439f, 102.82f);
                j.cubicTo(14.397038f, 102.8412f, 10.798364f, 120.13192f, 9.0f, 129.40842f);
                canvas.drawPath(j, a3);
                canvas.restore();
                j = c.j(looper);
                j.moveTo(0.0f, 129.0f);
                j.lineTo(120.0f, 129.0f);
                j.lineTo(120.0f, 156.0f);
                j.lineTo(0.0f, 156.0f);
                j.lineTo(0.0f, 129.0f);
                j.close();
                canvas.save();
                a3 = c.a(a, looper);
                a3.setColor(-16074);
                a3.setStrokeWidth(4.5f);
                a3.setStrokeCap(Cap.ROUND);
                a3.setStrokeJoin(Join.MITER);
                a2 = c.a(a2, 1.0f, 0.0f, 39.0f, 0.0f, 1.0f, 84.0f);
                f.reset();
                f.setValues(a2);
                canvas.concat(f);
                canvas.save();
                Paint a4 = c.a(a3, looper);
                j = c.j(looper);
                j.moveTo(1.5817388f, 4.7485895f);
                j.cubicTo(-0.6547393f, 6.723633f, -1.5753936f, 17.91504f, 6.1705556f, 21.007137f);
                j.lineTo(21.0f, 24.0f);
                j.lineTo(8.367464f, 0.0f);
                j.cubicTo(5.861647f, 1.3836222f, 3.5997386f, 2.9664853f, 1.5817388f, 4.7485895f);
                j.close();
                canvas.drawPath(j, a4);
                canvas.restore();
                canvas.save();
                a3 = c.a(a3, looper);
                e = c.a(a2, -1.0f, 0.0f, 64.542946f, 0.0f, 1.0f, 0.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                j = c.j(looper);
                j.moveTo(22.58174f, 4.7485895f);
                j.cubicTo(20.34526f, 6.723633f, 19.424606f, 17.91504f, 27.170555f, 21.007137f);
                j.lineTo(43.542942f, 24.0f);
                j.lineTo(29.367464f, 0.0f);
                j.cubicTo(26.861647f, 1.3836222f, 24.59974f, 2.9664853f, 22.58174f, 4.7485895f);
                j.close();
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.restore();
                canvas.save();
                Paint a5 = c.a(a, looper);
                a5.setColor(-16074);
                a5.setStrokeWidth(4.5f);
                j = c.j(looper);
                j.moveTo(34.500023f, 36.49006f);
                j.cubicTo(34.504597f, 48.431625f, 34.48657f, 55.138245f, 34.529358f, 55.76485f);
                j.cubicTo(35.96001f, 75.170944f, 53.725014f, 85.20811f, 68.90725f, 79.32616f);
                j.cubicTo(78.674225f, 75.54389f, 85.479774f, 65.79335f, 85.479774f, 54.535385f);
                j.lineTo(85.479774f, 36.49006f);
                j.cubicTo(85.479774f, 36.49006f, 85.92921f, 29.304337f, 82.59075f, 23.124592f);
                j.cubicTo(81.47551f, 21.060392f, 78.91831f, 20.371489f, 76.98925f, 21.632803f);
                j.cubicTo(73.35449f, 24.009048f, 66.35759f, 27.091797f, 56.498043f, 24.820032f);
                j.cubicTo(41.507687f, 21.365734f, 34.500023f, 36.49006f, 34.500023f, 36.49006f);
                j.close();
                canvas.drawPath(j, a5);
                canvas.restore();
                canvas.restore();
                j = c.j(looper);
                j.moveTo(75.0f, 132.0f);
                j.lineTo(105.0f, 132.0f);
                j.lineTo(105.0f, 141.0f);
                j.lineTo(75.0f, 141.0f);
                j.lineTo(75.0f, 132.0f);
                j.close();
                c.h(looper);
                break;
        }
        return 0;
    }
}
