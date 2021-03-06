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

public final class ard extends c {
    private final int height = 36;
    private final int width = 45;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 45;
            case 1:
                return 36;
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
                e = c.a(e, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 0.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                Paint a2 = c.a(a, looper);
                a2.setColor(-9205837);
                a2.setStrokeWidth(3.0f);
                Path j = c.j(looper);
                j.moveTo(0.0f, 19.0f);
                j.lineTo(0.0f, 10.0f);
                j.lineTo(4.0f, 10.0f);
                j.cubicTo(4.0f, 10.0f, 6.2209473f, 10.146362f, 7.607544f, 9.330322f);
                j.cubicTo(10.395386f, 7.628418f, 23.0f, 0.0f, 23.0f, 0.0f);
                j.lineTo(23.0f, 19.0f);
                j.lineTo(23.0f, 36.0f);
                j.cubicTo(23.0f, 36.0f, 10.395386f, 28.371582f, 7.607544f, 26.669678f);
                j.cubicTo(6.2209473f, 25.853638f, 4.0f, 26.0f, 4.0f, 26.0f);
                j.lineTo(0.0f, 26.0f);
                j.lineTo(0.0f, 19.0f);
                j.close();
                canvas.drawPath(j, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(i2, looper);
                a2.setColor(-9205837);
                j = c.j(looper);
                j.moveTo(28.0f, 8.608248f);
                j.cubicTo(31.119555f, 6.412371f, 34.228916f, 4.195876f, 37.338276f, 2.0f);
                j.cubicTo(37.888786f, 2.7938144f, 38.44949f, 3.5876288f, 39.0f, 4.371134f);
                j.cubicTo(35.880444f, 6.587629f, 32.76089f, 8.804124f, 29.641335f, 11.0f);
                j.cubicTo(29.223354f, 10.402061f, 28.407785f, 9.206185f, 28.0f, 8.608248f);
                j.lineTo(28.0f, 8.608248f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(i2, looper);
                a2.setColor(-9205837);
                j = c.j(looper);
                j.moveTo(29.0f, 17.007513f);
                j.cubicTo(32.666668f, 16.997496f, 36.333332f, 16.997496f, 40.0f, 17.007513f);
                j.lineTo(40.0f, 19.992487f);
                j.cubicTo(36.333332f, 20.002504f, 32.666668f, 20.002504f, 29.0f, 19.992487f);
                j.lineTo(29.0f, 17.007513f);
                j.lineTo(29.0f, 17.007513f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(i2, looper);
                a2.setColor(-9205837);
                j = c.j(looper);
                j.moveTo(29.381166f, 26.0f);
                j.cubicTo(32.587444f, 27.870647f, 35.79372f, 29.731344f, 39.0f, 31.61194f);
                j.cubicTo(38.63498f, 32.208954f, 37.9148f, 33.402985f, 37.549774f, 34.0f);
                j.cubicTo(34.363228f, 32.159203f, 31.186546f, 30.298508f, 28.0f, 28.447762f);
                j.cubicTo(28.463676f, 27.631842f, 28.927355f, 26.81592f, 29.381166f, 26.0f);
                j.lineTo(29.381166f, 26.0f);
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
