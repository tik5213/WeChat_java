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

public final class aab extends c {
    private final int height = 480;
    private final int width = 480;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 480;
            case 1:
                return 480;
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
                a.setColor(-10197916);
                float[] a2 = c.a(e, 1.0f, 0.0f, 129.0f, 0.0f, 1.0f, 40.0f);
                f.reset();
                f.setValues(a2);
                canvas.concat(f);
                canvas.save();
                a = c.a(a, looper);
                Path j = c.j(looper);
                j.moveTo(46.0f, 3.02f);
                j.cubicTo(71.91f, 0.31f, 98.0f, -0.21f, 124.04f, 0.1f);
                j.cubicTo(144.69f, 0.44f, 165.37f, 1.38f, 185.86f, 4.14f);
                j.cubicTo(195.27f, 5.44f, 204.68f, 7.21f, 213.66f, 10.43f);
                j.cubicTo(216.28f, 11.49f, 218.85f, 13.33f, 219.91f, 16.05f);
                j.cubicTo(221.41f, 19.5f, 220.95f, 23.34f, 221.01f, 26.99f);
                j.cubicTo(220.99f, 88.64f, 221.0f, 150.28f, 221.0f, 211.92f);
                j.cubicTo(216.38f, 210.98f, 211.7f, 210.39f, 207.0f, 210.14f);
                j.lineTo(207.0f, 39.0f);
                j.lineTo(15.0f, 39.0f);
                j.lineTo(15.0f, 349.0f);
                j.lineTo(117.8f, 349.0f);
                j.cubicTo(129.92f, 372.38f, 152.18f, 390.21f, 177.67f, 396.86f);
                j.cubicTo(154.52f, 399.26f, 131.24f, 400.06f, 107.98f, 399.99f);
                j.cubicTo(85.99f, 399.85f, 63.96f, 399.12f, 42.11f, 396.51f);
                j.cubicTo(30.89f, 394.98f, 19.42f, 393.55f, 8.92f, 389.1f);
                j.cubicTo(4.08f, 387.2f, 0.57f, 382.32f, 0.99f, 377.03f);
                j.cubicTo(1.01f, 258.68f, 0.99f, 140.34f, 1.01f, 21.99f);
                j.cubicTo(0.73f, 17.3f, 3.14f, 12.48f, 7.65f, 10.71f);
                j.cubicTo(19.99f, 6.32f, 33.03f, 4.46f, 46.0f, 3.02f);
                j.lineTo(46.0f, 3.02f);
                j.close();
                j.moveTo(107.32f, 365.42f);
                j.cubicTo(100.42f, 367.94f, 99.4f, 378.51f, 105.73f, 382.26f);
                j.cubicTo(111.39f, 386.41f, 120.33f, 382.02f, 120.53f, 375.02f);
                j.cubicTo(121.36f, 368.19f, 113.56f, 362.44f, 107.32f, 365.42f);
                j.lineTo(107.32f, 365.42f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.restore();
                canvas.save();
                e = c.a(a2, 1.0f, 0.0f, 129.0f, 0.0f, 1.0f, 40.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-5395027);
                a2 = c.a(e, 1.0f, 0.0f, 236.0f, 0.0f, 1.0f, 250.0f);
                f.reset();
                f.setValues(a2);
                canvas.concat(f);
                canvas.save();
                a = c.a(a, looper);
                j = c.j(looper);
                j.moveTo(42.13f, 16.09f);
                j.cubicTo(59.0f, 4.67f, 79.66f, -0.97f, 100.0f, 0.15f);
                j.cubicTo(104.7f, 0.38f, 109.38f, 0.98f, 113.99f, 1.92f);
                j.cubicTo(135.39f, 6.21f, 155.12f, 18.21f, 168.8f, 35.21f);
                j.cubicTo(183.31f, 52.95f, 190.95f, 76.1f, 189.89f, 98.99f);
                j.cubicTo(189.14f, 118.74f, 181.97f, 138.17f, 169.7f, 153.66f);
                j.cubicTo(159.15f, 167.17f, 144.84f, 177.68f, 128.82f, 183.79f);
                j.cubicTo(110.35f, 190.87f, 89.66f, 191.87f, 70.54f, 186.83f);
                j.cubicTo(45.11f, 180.13f, 22.89f, 162.36f, 10.8f, 139.0f);
                j.cubicTo(1.4210855E-14f, 118.54f, -2.81f, 94.06f, 2.92f, 71.65f);
                j.cubicTo(8.52f, 49.13f, 22.83f, 28.96f, 42.13f, 16.09f);
                j.lineTo(42.13f, 16.09f);
                j.close();
                j.moveTo(76.72f, 53.78f);
                j.cubicTo(71.11f, 58.09f, 68.02f, 65.1f, 67.98f, 72.11f);
                j.cubicTo(72.07f, 72.16f, 76.17f, 72.12f, 80.27f, 72.15f);
                j.cubicTo(80.6f, 67.4f, 82.89f, 62.53f, 87.44f, 60.51f);
                j.cubicTo(93.41f, 57.81f, 101.47f, 57.8f, 106.39f, 62.62f);
                j.cubicTo(111.52f, 68.46f, 111.33f, 77.86f, 107.13f, 84.17f);
                j.cubicTo(102.24f, 91.13f, 94.9f, 96.06f, 90.53f, 103.44f);
                j.cubicTo(87.63f, 108.31f, 87.16f, 114.11f, 87.01f, 119.66f);
                j.cubicTo(91.14f, 119.68f, 95.28f, 119.68f, 99.41f, 119.66f);
                j.cubicTo(99.68f, 114.01f, 100.47f, 107.8f, 104.75f, 103.66f);
                j.cubicTo(110.08f, 98.31f, 115.86f, 93.14f, 119.35f, 86.33f);
                j.cubicTo(123.82f, 78.2f, 123.76f, 67.82f, 119.41f, 59.66f);
                j.cubicTo(116.01f, 53.23f, 109.1f, 49.37f, 102.07f, 48.31f);
                j.cubicTo(93.38f, 46.99f, 83.79f, 48.21f, 76.72f, 53.78f);
                j.lineTo(76.72f, 53.78f);
                j.close();
                j.moveTo(90.38f, 134.5f);
                j.cubicTo(84.53f, 136.88f, 85.46f, 147.17f, 91.98f, 147.86f);
                j.cubicTo(96.85f, 149.28f, 102.23f, 145.17f, 101.18f, 139.97f);
                j.cubicTo(100.85f, 134.8f, 94.68f, 132.56f, 90.38f, 134.5f);
                j.lineTo(90.38f, 134.5f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.restore();
                canvas.save();
                i2 = c.a(i2, looper);
                i2.setColor(-1);
                e = c.a(a2, 1.0f, 0.0f, 303.0f, 0.0f, 1.0f, 297.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                Paint a3 = c.a(i2, looper);
                j = c.j(looper);
                j.moveTo(9.72f, 6.78f);
                j.cubicTo(16.79f, 1.21f, 26.38f, -0.01f, 35.07f, 1.31f);
                j.cubicTo(42.1f, 2.37f, 49.01f, 6.23f, 52.41f, 12.66f);
                j.cubicTo(56.76f, 20.82f, 56.82f, 31.2f, 52.35f, 39.33f);
                j.cubicTo(48.86f, 46.14f, 43.08f, 51.31f, 37.75f, 56.66f);
                j.cubicTo(33.47f, 60.8f, 32.68f, 67.01f, 32.41f, 72.66f);
                j.cubicTo(28.28f, 72.68f, 24.14f, 72.68f, 20.01f, 72.66f);
                j.cubicTo(20.16f, 67.11f, 20.63f, 61.31f, 23.53f, 56.44f);
                j.cubicTo(27.9f, 49.06f, 35.24f, 44.13f, 40.13f, 37.17f);
                j.cubicTo(44.33f, 30.86f, 44.52f, 21.46f, 39.39f, 15.62f);
                j.cubicTo(34.47f, 10.8f, 26.41f, 10.81f, 20.44f, 13.51f);
                j.cubicTo(15.89f, 15.53f, 13.6f, 20.4f, 13.27f, 25.15f);
                j.cubicTo(9.17f, 25.12f, 5.07f, 25.16f, 0.98f, 25.11f);
                j.cubicTo(1.02f, 18.1f, 4.11f, 11.09f, 9.72f, 6.78f);
                j.lineTo(9.72f, 6.78f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(i2, looper);
                j = c.j(looper);
                j.moveTo(23.38f, 87.5f);
                j.cubicTo(27.68f, 85.56f, 33.85f, 87.8f, 34.18f, 92.97f);
                j.cubicTo(35.23f, 98.17f, 29.85f, 102.28f, 24.98f, 100.86f);
                j.cubicTo(18.46f, 100.17f, 17.53f, 89.88f, 23.38f, 87.5f);
                j.lineTo(23.38f, 87.5f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}