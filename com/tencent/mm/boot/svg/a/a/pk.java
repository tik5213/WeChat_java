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

public final class pk extends c {
    private final int height = 192;
    private final int width = 192;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 192;
            case 1:
                return 192;
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
                i3 = c.a(i2, looper);
                i3.setColor(-12206054);
                Path j = c.j(looper);
                j.moveTo(0.0f, 0.0f);
                j.lineTo(192.0f, 0.0f);
                j.lineTo(192.0f, 192.0f);
                j.lineTo(0.0f, 192.0f);
                j.lineTo(0.0f, 0.0f);
                j.close();
                canvas.drawPath(j, i3);
                canvas.restore();
                canvas.save();
                Paint a = c.a(i2, looper);
                a.setColor(-1);
                Path j2 = c.j(looper);
                j2.moveTo(160.65068f, 95.27501f);
                j2.lineTo(168.36555f, 95.27501f);
                j2.cubicTo(169.47209f, 95.27501f, 169.83318f, 94.5596f, 169.1713f, 93.67711f);
                j2.lineTo(156.29543f, 76.50927f);
                j2.cubicTo(155.6316f, 75.62418f, 154.56044f, 75.62678f, 153.89857f, 76.50927f);
                j2.lineTo(141.02269f, 93.67711f);
                j2.cubicTo(140.35887f, 94.562195f, 140.72157f, 95.27501f, 141.82845f, 95.27501f);
                j2.lineTo(148.96237f, 95.27501f);
                j2.cubicTo(148.96115f, 125.298164f, 124.889656f, 149.63637f, 95.19614f, 149.63637f);
                j2.cubicTo(80.87363f, 149.63637f, 67.46696f, 143.96439f, 57.466305f, 134.00328f);
                j2.cubicTo(55.223022f, 136.42978f, 53.46749f, 138.00111f, 49.263695f, 142.4225f);
                j2.cubicTo(61.079872f, 154.19194f, 77.29919f, 161.45454f, 95.19614f, 161.45454f);
                j2.cubicTo(131.34492f, 161.45454f, 160.64946f, 131.82516f, 160.65068f, 95.27501f);
                j2.lineTo(160.65068f, 95.27501f);
                j2.close();
                j2.moveTo(23.204512f, 98.32745f);
                j2.cubicTo(22.542639f, 97.44496f, 22.903711f, 96.72955f, 24.010258f, 96.72955f);
                j2.lineTo(50.547367f, 96.72955f);
                j2.cubicTo(51.654243f, 96.72955f, 52.01693f, 97.44237f, 51.353115f, 98.32745f);
                j2.lineTo(38.477238f, 115.49529f);
                j2.cubicTo(37.815365f, 116.377785f, 36.744205f, 116.38038f, 36.080387f, 115.49529f);
                j2.lineTo(23.204512f, 98.32745f);
                j2.close();
                j2.moveTo(42.250706f, 96.72727f);
                j2.cubicTo(42.250706f, 66.703064f, 66.32267f, 42.363636f, 96.01694f, 42.363636f);
                j2.cubicTo(110.339455f, 42.363636f, 123.74612f, 48.03562f, 133.74677f, 57.99671f);
                j2.cubicTo(135.99005f, 55.570225f, 137.74557f, 53.99889f, 141.94939f, 49.577503f);
                j2.cubicTo(130.13321f, 37.808067f, 113.91389f, 30.545454f, 96.01694f, 30.545454f);
                j2.cubicTo(59.867393f, 30.545454f, 30.562395f, 60.176064f, 30.562395f, 96.72727f);
                j2.lineTo(36.40655f, 96.72727f);
                j2.lineTo(42.250706f, 96.72727f);
                j2.close();
                j2.moveTo(81.12372f, 81.44297f);
                j2.cubicTo(81.12372f, 89.48731f, 83.766464f, 91.53608f, 86.863625f, 96.30573f);
                j2.cubicTo(90.96707f, 102.62398f, 84.63524f, 105.367065f, 81.57996f, 107.10888f);
                j2.cubicTo(70.61376f, 113.363335f, 65.64245f, 115.78745f, 65.64245f, 119.04088f);
                j2.lineTo(65.64245f, 123.10881f);
                j2.cubicTo(65.64245f, 124.62227f, 66.67696f, 125.820465f, 68.29885f, 125.820465f);
                j2.lineTo(124.07696f, 125.820465f);
                j2.cubicTo(125.698845f, 125.820465f, 126.73336f, 124.62227f, 126.73336f, 123.10881f);
                j2.lineTo(126.73336f, 119.04088f);
                j2.cubicTo(126.73336f, 115.78745f, 121.76205f, 113.363335f, 110.795845f, 107.10888f);
                j2.cubicTo(107.74057f, 105.367065f, 101.40874f, 102.62398f, 105.512184f, 96.30573f);
                j2.cubicTo(108.609344f, 91.53608f, 111.25209f, 89.48731f, 111.25209f, 81.44297f);
                j2.cubicTo(111.25209f, 73.09445f, 105.34826f, 64.72955f, 96.187904f, 64.72955f);
                j2.cubicTo(87.02754f, 64.72955f, 81.12372f, 73.09445f, 81.12372f, 81.44297f);
                j2.close();
                WeChatSVGRenderC2Java.setFillType(j2, 2);
                canvas.drawPath(j2, a);
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}
