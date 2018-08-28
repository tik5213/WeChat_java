package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.plugin.appbrand.jsapi.audio.j;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;

public final class ny extends c {
    private final int height = j.CTRL_INDEX;
    private final int width = 428;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 428;
            case 1:
                return j.CTRL_INDEX;
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
                a.setColor(-13158344);
                float[] a2 = c.a(e, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f);
                f.reset();
                f.setValues(a2);
                canvas.concat(f);
                canvas.save();
                a = c.a(a, looper);
                Path j = c.j(looper);
                j.moveTo(256.0002f, 279.7305f);
                j.lineTo(256.0002f, 285.0005f);
                j.lineTo(118.0002f, 285.0005f);
                j.lineTo(118.0002f, 279.7305f);
                j.lineTo(171.0002f, 274.7305f);
                j.lineTo(171.0002f, 241.0005f);
                j.lineTo(203.0002f, 241.0005f);
                j.lineTo(203.0002f, 274.7305f);
                j.lineTo(256.0002f, 279.7305f);
                j.close();
                j.moveTo(206.0002f, 240.9995f);
                j.lineTo(318.9852f, 240.9995f);
                j.lineTo(318.9852f, 238.0005f);
                j.lineTo(206.0002f, 238.0005f);
                j.lineTo(168.0002f, 237.9995f);
                j.lineTo(14.0062f, 238.0005f);
                j.cubicTo(7.9382f, 238.0005f, 3.0002f, 233.0625f, 3.0002f, 226.9935f);
                j.lineTo(3.0002f, 15.0065f);
                j.cubicTo(3.0002f, 8.9375f, 7.9382f, 4.0005f, 14.0062f, 4.0005f);
                j.lineTo(359.9932f, 4.0005f);
                j.cubicTo(366.0632f, 4.0005f, 371.0002f, 8.9375f, 371.0002f, 15.0065f);
                j.lineTo(371.0002f, 98.3895f);
                j.lineTo(374.0002f, 98.3895f);
                j.lineTo(374.0002f, 15.0065f);
                j.cubicTo(374.0002f, 7.2655f, 367.7292f, 0.9995f, 359.9932f, 0.9995f);
                j.lineTo(14.0072f, 0.9995f);
                j.cubicTo(6.2762f, 0.9995f, 2.0E-4f, 7.2705f, 2.0E-4f, 15.0065f);
                j.lineTo(2.0E-4f, 226.9935f);
                j.cubicTo(2.0E-4f, 234.7345f, 6.2712f, 240.9995f, 14.0072f, 240.9995f);
                j.lineTo(168.0002f, 240.9995f);
                j.lineTo(168.0002f, 271.9995f);
                j.lineTo(115.0002f, 276.9995f);
                j.lineTo(115.0002f, 287.9995f);
                j.lineTo(259.0002f, 287.9995f);
                j.lineTo(259.0002f, 276.9995f);
                j.lineTo(206.0002f, 271.9995f);
                j.lineTo(206.0002f, 240.9995f);
                j.close();
                j.moveTo(317.9856f, 227.0001f);
                j.lineTo(14.0006f, 227.0001f);
                j.lineTo(14.0006f, 15.0001f);
                j.lineTo(360.0006f, 15.0001f);
                j.lineTo(360.0006f, 96.3901f);
                j.cubicTo(360.0006f, 96.3901f, 360.9996f, 98.02189f, 360.9996f, 96.01725f);
                j.lineTo(360.9996f, 14.0001f);
                j.lineTo(12.9996f, 14.0001f);
                j.lineTo(12.9996f, 228.0001f);
                j.lineTo(317.9856f, 228.0001f);
                j.lineTo(317.9856f, 227.0001f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.restore();
                canvas.save();
                float[] a3 = c.a(a2, 1.0f, 0.0f, 318.0f, 0.0f, 1.0f, 98.0f);
                f.reset();
                f.setValues(a3);
                canvas.concat(f);
                canvas.save();
                Paint a4 = c.a(i2, looper);
                a4.setColor(-13092808);
                j = c.j(looper);
                j.moveTo(3.0f, 183.006f);
                j.lineTo(3.0f, 7.994f);
                j.cubicTo(3.0f, 5.24f, 5.243f, 3.0f, 8.0f, 3.0f);
                j.lineTo(98.0f, 3.0f);
                j.cubicTo(100.757f, 3.0f, 103.0f, 5.24f, 103.0f, 7.994f);
                j.lineTo(103.0f, 183.006f);
                j.cubicTo(103.0f, 185.76f, 100.757f, 188.0f, 98.0f, 188.0f);
                j.lineTo(8.0f, 188.0f);
                j.cubicTo(5.243f, 188.0f, 3.0f, 185.76f, 3.0f, 183.006f);
                j.lineTo(3.0f, 183.006f);
                j.close();
                j.moveTo(98.0f, 191.0f);
                j.cubicTo(102.418f, 191.0f, 106.0f, 187.418f, 106.0f, 183.006f);
                j.lineTo(106.0f, 7.994f);
                j.cubicTo(106.0f, 3.579f, 102.412f, 0.0f, 98.0f, 0.0f);
                j.lineTo(8.0f, 0.0f);
                j.cubicTo(3.582f, 0.0f, 0.0f, 3.582f, 0.0f, 7.994f);
                j.lineTo(0.0f, 183.006f);
                j.cubicTo(0.0f, 187.421f, 3.588f, 191.0f, 8.0f, 191.0f);
                j.lineTo(98.0f, 191.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a4);
                canvas.restore();
                canvas.save();
                e = c.a(a3, 1.0f, 0.0f, 35.0f, 0.0f, 1.0f, 77.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-13092808);
                a2 = c.a(e, 1.0f, 0.0f, 7.0f, 0.0f, 1.0f, 10.0f);
                f.reset();
                f.setValues(a2);
                canvas.concat(f);
                canvas.save();
                Paint a5 = c.a(a, looper);
                j = c.j(looper);
                j.moveTo(37.6973f, 77.1417f);
                j.lineTo(38.0463f, 76.6867f);
                j.cubicTo(39.3783f, 74.9527f, 41.1253f, 73.8087f, 43.2393f, 73.2887f);
                j.lineTo(44.0003f, 73.1007f);
                j.lineTo(44.0003f, 69.4957f);
                j.cubicTo(44.0003f, 68.6717f, 44.6733f, 67.9997f, 45.5003f, 67.9997f);
                j.cubicTo(46.3273f, 67.9997f, 47.0003f, 68.6717f, 47.0003f, 69.4957f);
                j.lineTo(47.0003f, 73.0587f);
                j.lineTo(47.7853f, 73.2317f);
                j.cubicTo(51.3673f, 74.0207f, 55.7253f, 76.9507f, 56.1413f, 86.3337f);
                j.cubicTo(55.9003f, 91.3737f, 56.7243f, 94.8457f, 57.6673f, 97.1117f);
                j.lineTo(37.6973f, 77.1417f);
                j.lineTo(37.6973f, 77.1417f);
                j.close();
                j.moveTo(57.1403f, 86.3817f);
                j.cubicTo(56.6993f, 76.3377f, 51.8463f, 73.1027f, 48.0003f, 72.2557f);
                j.lineTo(48.0003f, 69.4957f);
                j.cubicTo(48.0003f, 68.1157f, 46.8803f, 66.9997f, 45.5003f, 66.9997f);
                j.cubicTo(44.1093f, 66.9997f, 43.0003f, 68.1177f, 43.0003f, 69.4957f);
                j.lineTo(43.0003f, 72.3177f);
                j.cubicTo(41.0833f, 72.7897f, 38.9513f, 73.8667f, 37.2533f, 76.0777f);
                j.lineTo(29.5703f, 68.3957f);
                j.lineTo(28.5533f, 69.4127f);
                j.lineTo(61.2383f, 102.0977f);
                j.lineTo(61.1303f, 102.2057f);
                j.lineTo(61.3463f, 102.2057f);
                j.lineTo(63.5873f, 104.4457f);
                j.lineTo(64.6043f, 103.4287f);
                j.lineTo(59.2253f, 98.0497f);
                j.cubicTo(58.0323f, 95.8927f, 56.8603f, 92.2417f, 57.1403f, 86.3817f);
                j.lineTo(57.1403f, 86.3817f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a5);
                canvas.restore();
                canvas.save();
                a5 = c.a(a, looper);
                j = c.j(looper);
                j.moveTo(35.123f, 86.4254f);
                j.cubicTo(35.186f, 84.9914f, 35.346f, 83.6534f, 35.599f, 82.4274f);
                j.lineTo(54.377f, 101.2054f);
                j.lineTo(30.86f, 101.2054f);
                j.cubicTo(32.193f, 100.0154f, 35.584f, 96.0194f, 35.123f, 86.4254f);
                j.lineTo(35.123f, 86.4254f);
                j.close();
                j.moveTo(35.063f, 80.4774f);
                j.cubicTo(34.56f, 82.1204f, 34.225f, 84.0714f, 34.124f, 86.3814f);
                j.cubicTo(34.663f, 97.6774f, 29.808f, 100.7664f, 29.808f, 100.7664f);
                j.lineTo(29.808f, 102.2054f);
                j.lineTo(56.791f, 102.2054f);
                j.lineTo(35.063f, 80.4774f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a5);
                canvas.restore();
                canvas.save();
                Paint a6 = c.a(a, looper);
                Path j2 = c.j(looper);
                j2.moveTo(1.0f, 157.0f);
                j2.lineTo(91.0f, 157.0f);
                j2.lineTo(91.0f, 11.0f);
                j2.lineTo(1.0f, 11.0f);
                j2.lineTo(1.0f, 157.0f);
                j2.close();
                j2.moveTo(0.0f, 158.0f);
                j2.lineTo(92.0f, 158.0f);
                j2.lineTo(92.0f, 10.0f);
                j2.lineTo(0.0f, 10.0f);
                j2.lineTo(0.0f, 158.0f);
                j2.close();
                WeChatSVGRenderC2Java.setFillType(j2, 2);
                canvas.drawPath(j2, a6);
                canvas.restore();
                canvas.save();
                a5 = c.a(a, looper);
                j = c.j(looper);
                j.moveTo(46.0f, 174.0001f);
                j.cubicTo(42.691f, 174.0001f, 40.0f, 171.3091f, 40.0f, 168.0001f);
                j.cubicTo(40.0f, 164.6911f, 42.691f, 162.0001f, 46.0f, 162.0001f);
                j.cubicTo(49.309f, 162.0001f, 52.0f, 164.6911f, 52.0f, 168.0001f);
                j.cubicTo(52.0f, 171.3091f, 49.309f, 174.0001f, 46.0f, 174.0001f);
                j.moveTo(46.0f, 161.0001f);
                j.cubicTo(42.134f, 161.0001f, 39.0f, 164.1341f, 39.0f, 168.0001f);
                j.cubicTo(39.0f, 171.8661f, 42.134f, 175.0001f, 46.0f, 175.0001f);
                j.cubicTo(49.866f, 175.0001f, 53.0f, 171.8661f, 53.0f, 168.0001f);
                j.cubicTo(53.0f, 164.1341f, 49.866f, 161.0001f, 46.0f, 161.0001f);
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a5);
                canvas.restore();
                canvas.save();
                a6 = c.a(a, looper);
                j2 = c.j(looper);
                j2.moveTo(39.0f, 3.0f);
                j2.lineTo(53.0f, 3.0f);
                j2.lineTo(53.0f, 0.0f);
                j2.lineTo(39.0f, 0.0f);
                j2.close();
                WeChatSVGRenderC2Java.setFillType(j2, 1);
                WeChatSVGRenderC2Java.setFillType(j2, 2);
                canvas.drawPath(j2, a6);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.save();
                e = c.a(a2, 1.0f, 0.0f, 166.0f, 0.0f, 1.0f, 93.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                Paint a7 = c.a(i2, looper);
                a7.setColor(-13158344);
                j = c.j(looper);
                j.moveTo(43.0895f, 21.9691f);
                j.lineTo(43.0895f, 49.9671f);
                j.lineTo(3.0895f, 49.9651f);
                j.lineTo(3.0895f, 21.9691f);
                j.lineTo(3.0905f, 21.9671f);
                j.lineTo(8.9995f, 21.9671f);
                j.lineTo(8.9995f, 18.9671f);
                j.lineTo(3.0905f, 18.9671f);
                j.cubicTo(1.4415f, 18.9671f, 0.0895f, 20.3111f, 0.0895f, 21.9691f);
                j.lineTo(0.0895f, 49.9651f);
                j.cubicTo(0.0895f, 51.6241f, 1.4335f, 52.9671f, 3.0905f, 52.9671f);
                j.lineTo(43.0895f, 52.9671f);
                j.cubicTo(44.7385f, 52.9671f, 46.0895f, 51.6231f, 46.0895f, 49.9651f);
                j.lineTo(46.0895f, 21.9691f);
                j.cubicTo(46.0895f, 20.3101f, 44.7465f, 18.9671f, 43.0895f, 18.9671f);
                j.lineTo(36.9995f, 18.9671f);
                j.lineTo(36.9995f, 21.9691f);
                j.lineTo(43.0895f, 21.9691f);
                j.lineTo(43.0895f, 21.9691f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a7);
                canvas.restore();
                canvas.save();
                a6 = c.a(i2, looper);
                a6.setColor(-13158344);
                j2 = c.j(looper);
                j2.moveTo(12.0f, 19.0f);
                j2.lineTo(34.0f, 19.0f);
                j2.lineTo(34.0f, 18.967f);
                j2.lineTo(12.0f, 18.967f);
                j2.close();
                WeChatSVGRenderC2Java.setFillType(j2, 1);
                WeChatSVGRenderC2Java.setFillType(j2, 2);
                canvas.drawPath(j2, a6);
                canvas.restore();
                canvas.save();
                a7 = c.a(i2, looper);
                a7.setColor(-13158344);
                j = c.j(looper);
                j.moveTo(9.0f, 13.4978f);
                j.lineTo(9.0f, 18.9668f);
                j.lineTo(12.0f, 18.9668f);
                j.lineTo(12.0f, 13.4978f);
                j.cubicTo(12.0f, 7.7088f, 16.714f, 3.0008f, 22.508f, 3.0008f);
                j.lineTo(23.492f, 3.0008f);
                j.cubicTo(29.286f, 3.0008f, 34.0f, 7.7088f, 34.0f, 13.4978f);
                j.lineTo(34.0f, 18.9668f);
                j.lineTo(37.0f, 18.9668f);
                j.lineTo(37.0f, 13.4978f);
                j.cubicTo(37.0f, 6.0438f, 30.952f, -2.0E-4f, 23.492f, -2.0E-4f);
                j.lineTo(22.508f, -2.0E-4f);
                j.cubicTo(15.041f, -2.0E-4f, 9.0f, 6.0428f, 9.0f, 13.4978f);
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a7);
                canvas.restore();
                canvas.save();
                a6 = c.a(i2, looper);
                a6.setColor(-13158344);
                j2 = c.j(looper);
                j2.moveTo(37.0f, 22.0f);
                j2.lineTo(37.0f, 21.969f);
                j2.lineTo(9.0f, 21.967f);
                j2.lineTo(9.0f, 22.0f);
                j2.close();
                WeChatSVGRenderC2Java.setFillType(j2, 1);
                WeChatSVGRenderC2Java.setFillType(j2, 2);
                canvas.drawPath(j2, a6);
                canvas.restore();
                canvas.save();
                a6 = c.a(i2, looper);
                a6.setColor(-13158344);
                j2 = c.j(looper);
                j2.moveTo(33.9997f, 19.0003f);
                j2.lineTo(11.9997f, 19.0003f);
                j2.lineTo(11.9997f, 18.9673f);
                j2.lineTo(8.9997f, 18.9673f);
                j2.lineTo(8.9997f, 21.9673f);
                j2.lineTo(36.9997f, 21.9683f);
                j2.lineTo(36.9997f, 18.9673f);
                j2.lineTo(33.9997f, 18.9673f);
                j2.close();
                WeChatSVGRenderC2Java.setFillType(j2, 1);
                WeChatSVGRenderC2Java.setFillType(j2, 2);
                canvas.drawPath(j2, a6);
                canvas.restore();
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}
