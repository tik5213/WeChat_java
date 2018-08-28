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
import com.tencent.smtt.sdk.WebView;

public final class aw extends c {
    private final int height = 108;
    private final int width = 108;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 108;
            case 1:
                return 108;
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
                i2.setColor(WebView.NIGHT_MODE_COLOR);
                i3.setStrokeWidth(1.0f);
                i3.setStrokeCap(Cap.BUTT);
                i3.setStrokeJoin(Join.MITER);
                i3.setStrokeMiter(4.0f);
                i3.setPathEffect(null);
                c.a(i3, looper).setStrokeWidth(1.0f);
                i3 = c.a(i2, looper);
                i3.setColor(-11636293);
                canvas.save();
                Paint a = c.a(i3, looper);
                Path j = c.j(looper);
                j.moveTo(0.0f, 0.0f);
                j.lineTo(108.0f, 0.0f);
                j.lineTo(108.0f, 108.0f);
                j.lineTo(0.0f, 108.0f);
                j.lineTo(0.0f, 0.0f);
                j.lineTo(0.0f, 0.0f);
                j.close();
                j.moveTo(29.43f, 32.22f);
                j.cubicTo(18.24f, 43.78f, 18.24f, 64.19f, 29.41f, 75.77f);
                j.cubicTo(31.97f, 78.35f, 36.24f, 73.99f, 33.42f, 71.57f);
                j.cubicTo(27.48f, 64.4f, 25.27f, 54.24f, 28.43f, 45.39f);
                j.cubicTo(29.51f, 41.46f, 32.28f, 38.39f, 34.33f, 34.97f);
                j.cubicTo(34.83f, 32.38f, 31.36f, 30.33f, 29.43f, 32.22f);
                j.lineTo(29.43f, 32.22f);
                j.close();
                j.moveTo(74.52f, 32.45f);
                j.cubicTo(72.31f, 34.58f, 75.06f, 36.92f, 76.2f, 38.79f);
                j.cubicTo(83.31f, 48.44f, 82.23f, 62.62f, 74.54f, 71.62f);
                j.cubicTo(71.79f, 74.04f, 76.04f, 78.3f, 78.57f, 75.79f);
                j.cubicTo(89.59f, 64.39f, 89.7f, 44.59f, 79.2f, 32.79f);
                j.cubicTo(78.13f, 31.32f, 75.74f, 30.98f, 74.52f, 32.45f);
                j.lineTo(74.52f, 32.45f);
                j.close();
                j.moveTo(39.35f, 41.1f);
                j.cubicTo(32.96f, 48.11f, 32.95f, 59.82f, 39.31f, 66.86f);
                j.cubicTo(41.25f, 68.68f, 44.79f, 66.47f, 44.03f, 63.95f);
                j.cubicTo(43.06f, 61.58f, 41.43f, 59.5f, 40.83f, 56.99f);
                j.cubicTo(39.64f, 52.69f, 41.5f, 48.54f, 43.64f, 44.92f);
                j.cubicTo(45.57f, 42.36f, 41.66f, 39.04f, 39.35f, 41.1f);
                j.lineTo(39.35f, 41.1f);
                j.close();
                j.moveTo(65.25f, 40.95f);
                j.cubicTo(63.98f, 41.76f, 63.38f, 43.61f, 64.35f, 44.89f);
                j.cubicTo(65.81f, 47.76f, 67.71f, 50.62f, 67.49f, 54.0f);
                j.cubicTo(67.74f, 57.8f, 65.42f, 60.92f, 63.67f, 64.05f);
                j.cubicTo(63.06f, 66.69f, 66.69f, 68.67f, 68.58f, 66.77f);
                j.cubicTo(75.19f, 59.95f, 74.97f, 48.09f, 68.67f, 41.13f);
                j.cubicTo(67.58f, 40.34f, 66.44f, 40.28f, 65.25f, 40.95f);
                j.lineTo(65.25f, 40.95f);
                j.close();
                j.moveTo(52.35f, 48.24f);
                j.cubicTo(48.06f, 49.27f, 46.49f, 55.32f, 49.79f, 58.27f);
                j.cubicTo(52.75f, 61.47f, 58.72f, 59.92f, 59.75f, 55.69f);
                j.cubicTo(61.25f, 51.39f, 56.65f, 46.78f, 52.35f, 48.24f);
                j.lineTo(52.35f, 48.24f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                i2 = c.a(i2, looper);
                i2.setColor(-1);
                float[] a2 = c.a(e, 1.0f, 0.0f, 21.0f, 0.0f, 1.0f, 31.0f);
                f.reset();
                f.setValues(a2);
                canvas.concat(f);
                canvas.save();
                Paint a3 = c.a(i2, looper);
                j = c.j(looper);
                j.moveTo(8.43f, 1.22f);
                j.cubicTo(10.36f, -0.67f, 13.83f, 1.38f, 13.33f, 3.97f);
                j.cubicTo(11.28f, 7.39f, 8.51f, 10.46f, 7.43f, 14.39f);
                j.cubicTo(4.27f, 23.24f, 6.48f, 33.4f, 12.42f, 40.57f);
                j.cubicTo(15.24f, 42.99f, 10.97f, 47.35f, 8.41f, 44.77f);
                j.cubicTo(-2.76f, 33.19f, -2.76f, 12.78f, 8.43f, 1.22f);
                j.lineTo(8.43f, 1.22f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(i2, looper);
                j = c.j(looper);
                j.moveTo(53.52f, 1.45f);
                j.cubicTo(54.74f, -0.02f, 57.13f, 0.32f, 58.2f, 1.79f);
                j.cubicTo(68.7f, 13.59f, 68.59f, 33.39f, 57.57f, 44.79f);
                j.cubicTo(55.04f, 47.3f, 50.79f, 43.04f, 53.54f, 40.62f);
                j.cubicTo(61.23f, 31.62f, 62.31f, 17.44f, 55.2f, 7.79f);
                j.cubicTo(54.06f, 5.92f, 51.31f, 3.58f, 53.52f, 1.45f);
                j.lineTo(53.52f, 1.45f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(i2, looper);
                j = c.j(looper);
                j.moveTo(18.35f, 10.1f);
                j.cubicTo(20.66f, 8.04f, 24.57f, 11.36f, 22.64f, 13.92f);
                j.cubicTo(20.5f, 17.54f, 18.64f, 21.69f, 19.83f, 25.99f);
                j.cubicTo(20.43f, 28.5f, 22.06f, 30.58f, 23.03f, 32.95f);
                j.cubicTo(23.79f, 35.47f, 20.25f, 37.68f, 18.31f, 35.86f);
                j.cubicTo(11.95f, 28.82f, 11.96f, 17.11f, 18.35f, 10.1f);
                j.lineTo(18.35f, 10.1f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(i2, looper);
                j = c.j(looper);
                j.moveTo(44.25f, 9.95f);
                j.cubicTo(45.44f, 9.28f, 46.58f, 9.34f, 47.67f, 10.13f);
                j.cubicTo(53.97f, 17.09f, 54.19f, 28.95f, 47.58f, 35.77f);
                j.cubicTo(45.69f, 37.67f, 42.06f, 35.69f, 42.67f, 33.05f);
                j.cubicTo(44.42f, 29.92f, 46.74f, 26.8f, 46.49f, 23.0f);
                j.cubicTo(46.71f, 19.62f, 44.81f, 16.76f, 43.35f, 13.89f);
                j.cubicTo(42.38f, 12.61f, 42.98f, 10.76f, 44.25f, 9.95f);
                j.lineTo(44.25f, 9.95f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(i2, looper);
                j = c.j(looper);
                j.moveTo(31.35f, 17.24f);
                j.cubicTo(35.65f, 15.78f, 40.25f, 20.39f, 38.75f, 24.69f);
                j.cubicTo(37.72f, 28.92f, 31.75f, 30.47f, 28.79f, 27.27f);
                j.cubicTo(25.49f, 24.32f, 27.06f, 18.27f, 31.35f, 17.24f);
                j.lineTo(31.35f, 17.24f);
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
