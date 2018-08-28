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

public final class fh extends c {
    private final int height = 60;
    private final int width = 96;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 96;
            case 1:
                return 60;
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
                i3 = c.a(i2, looper);
                i3.setColor(-1158579);
                canvas.save();
                Paint a = c.a(i3, looper);
                Path j = c.j(looper);
                j.moveTo(27.7f, 0.0f);
                j.lineTo(68.03f, 0.0f);
                j.cubicTo(82.91f, 0.55f, 95.85f, 13.7f, 96.0f, 28.61f);
                j.lineTo(96.0f, 31.89f);
                j.cubicTo(95.56f, 46.57f, 82.84f, 59.33f, 68.21f, 60.0f);
                j.lineTo(28.17f, 60.0f);
                j.cubicTo(13.55f, 59.57f, 0.77f, 47.01f, 0.0f, 32.42f);
                j.lineTo(0.0f, 27.87f);
                j.cubicTo(0.59f, 13.32f, 13.19f, 0.72f, 27.7f, 0.0f);
                j.lineTo(27.7f, 0.0f);
                j.close();
                j.moveTo(15.010215f, 18.0f);
                j.cubicTo(15.0f, 25.663305f, 15.0f, 33.32661f, 15.0f, 40.989918f);
                j.cubicTo(16.634409f, 40.97983f, 18.268818f, 40.989918f, 19.903225f, 40.989918f);
                j.cubicTo(19.91344f, 35.94827f, 19.893011f, 30.90662f, 19.903225f, 25.864971f);
                j.cubicTo(23.059677f, 30.886454f, 26.073118f, 35.998684f, 29.260216f, 41.0f);
                j.cubicTo(30.833334f, 40.989918f, 32.416668f, 40.97983f, 34.0f, 40.97983f);
                j.cubicTo(33.989784f, 33.32661f, 34.0f, 25.663305f, 33.989784f, 18.0f);
                j.cubicTo(32.42688f, 18.010084f, 30.874193f, 18.010084f, 29.31129f, 18.0f);
                j.cubicTo(29.301075f, 23.243315f, 29.290861f, 28.48663f, 29.321505f, 33.71986f);
                j.cubicTo(26.154839f, 28.48663f, 23.008602f, 23.243315f, 19.85215f, 18.0f);
                j.cubicTo(18.238173f, 18.010084f, 16.624193f, 18.010084f, 15.010215f, 18.0f);
                j.lineTo(15.010215f, 18.0f);
                j.close();
                j.moveTo(39.010136f, 18.010086f);
                j.cubicTo(39.0f, 25.664986f, 39.0f, 33.32997f, 39.0f, 40.98487f);
                j.cubicTo(44.006756f, 41.005043f, 49.00338f, 41.005043f, 54.0f, 40.98487f);
                j.cubicTo(54.0f, 39.784695f, 53.989864f, 38.584522f, 53.989864f, 37.394432f);
                j.cubicTo(50.614864f, 37.384346f, 47.239864f, 37.384346f, 43.875f, 37.384346f);
                j.cubicTo(43.864864f, 35.226048f, 43.864864f, 33.06775f, 43.864864f, 30.90945f);
                j.cubicTo(46.682434f, 30.919535f, 49.489864f, 30.899364f, 52.307434f, 30.899364f);
                j.cubicTo(52.2973f, 30.001755f, 52.2973f, 28.21662f, 52.287163f, 27.31901f);
                j.cubicTo(49.47973f, 27.308924f, 46.6723f, 27.288752f, 43.864864f, 27.298838f);
                j.lineTo(43.864864f, 21.630783f);
                j.lineTo(54.0f, 21.630783f);
                j.lineTo(54.0f, 18.0f);
                j.cubicTo(49.00338f, 18.0f, 44.006756f, 18.0f, 39.010136f, 18.010086f);
                j.lineTo(39.010136f, 18.010086f);
                j.close();
                j.moveTo(57.0f, 18.040298f);
                j.cubicTo(58.732273f, 25.706964f, 60.575977f, 33.343407f, 62.36903f, 41.0f);
                j.cubicTo(63.837917f, 40.97985f, 65.3068f, 40.97985f, 66.77569f, 40.97985f);
                j.cubicTo(68.153404f, 35.90232f, 69.672935f, 30.855015f, 70.97974f, 25.767412f);
                j.cubicTo(72.31693f, 30.86509f, 73.77569f, 35.94262f, 75.2547f, 41.0f);
                j.cubicTo(76.713455f, 40.989925f, 78.18234f, 40.989925f, 79.65123f, 40.97985f);
                j.cubicTo(81.373375f, 33.323257f, 83.2272f, 25.686815f, 85.0f, 18.030224f);
                j.cubicTo(83.37916f, 18.030224f, 81.75832f, 18.030224f, 80.13748f, 18.02015f);
                j.cubicTo(79.09406f, 23.248795f, 78.04052f, 28.467367f, 77.09841f, 33.716164f);
                j.cubicTo(75.70043f, 28.477442f, 74.32272f, 23.228647f, 72.843704f, 18.010075f);
                j.cubicTo(71.587555f, 18.010075f, 70.34154f, 18.02015f, 69.09551f, 18.02015f);
                j.cubicTo(67.65702f, 23.238722f, 66.24892f, 28.477442f, 64.92185f, 33.72624f);
                j.cubicTo(63.88857f, 28.487516f, 62.916065f, 23.228647f, 61.791607f, 18.0f);
                j.cubicTo(60.201157f, 18.02015f, 58.60058f, 18.030224f, 57.0f, 18.040298f);
                j.lineTo(57.0f, 18.040298f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                i2 = c.a(i2, looper);
                i2.setColor(-1);
                float[] a2 = c.a(e, 1.0f, 0.0f, 15.0f, 0.0f, 1.0f, 18.0f);
                f.reset();
                f.setValues(a2);
                canvas.concat(f);
                canvas.save();
                Paint a3 = c.a(i2, looper);
                j = c.j(looper);
                j.moveTo(0.010215053f, -3.5527137E-15f);
                j.cubicTo(1.6241935f, 0.010083296f, 3.238172f, 0.010083296f, 4.8521504f, -3.5527137E-15f);
                j.cubicTo(8.008602f, 5.2433143f, 11.154839f, 10.486629f, 14.321506f, 15.71986f);
                j.cubicTo(14.29086f, 10.486629f, 14.301075f, 5.2433143f, 14.311291f, -3.5527137E-15f);
                j.cubicTo(15.874193f, 0.010083296f, 17.426882f, 0.010083296f, 18.989784f, -3.5527137E-15f);
                j.cubicTo(19.0f, 7.6633058f, 18.989784f, 15.3266115f, 19.0f, 22.979834f);
                j.cubicTo(17.416666f, 22.979834f, 15.833333f, 22.989916f, 14.260215f, 23.0f);
                j.cubicTo(11.073118f, 17.998684f, 8.059677f, 12.886454f, 4.903226f, 7.8649716f);
                j.cubicTo(4.8930106f, 12.90662f, 4.9134407f, 17.948269f, 4.903226f, 22.989916f);
                j.cubicTo(3.2688172f, 22.989916f, 1.6344086f, 22.979834f, 1.7763568E-15f, 22.989916f);
                j.cubicTo(1.7763568E-15f, 15.3266115f, 1.7763568E-15f, 7.6633058f, 0.010215053f, -3.5527137E-15f);
                j.lineTo(0.010215053f, -3.5527137E-15f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(i2, looper);
                j = c.j(looper);
                j.moveTo(24.010136f, 0.010085507f);
                j.cubicTo(29.006758f, 3.5527137E-15f, 34.00338f, 3.5527137E-15f, 39.0f, 3.5527137E-15f);
                j.lineTo(39.0f, 3.6307826f);
                j.lineTo(28.864864f, 3.6307826f);
                j.lineTo(28.864864f, 9.298838f);
                j.cubicTo(31.672297f, 9.288753f, 34.47973f, 9.308924f, 37.287163f, 9.319009f);
                j.cubicTo(37.2973f, 10.2166195f, 37.2973f, 12.001754f, 37.307434f, 12.899364f);
                j.cubicTo(34.489864f, 12.899364f, 31.682432f, 12.919536f, 28.864864f, 12.90945f);
                j.cubicTo(28.864864f, 15.067748f, 28.864864f, 17.226048f, 28.875f, 19.384346f);
                j.cubicTo(32.239864f, 19.384346f, 35.614864f, 19.384346f, 38.989864f, 19.39443f);
                j.cubicTo(38.989864f, 20.58452f, 39.0f, 21.784697f, 39.0f, 22.98487f);
                j.cubicTo(34.00338f, 23.005043f, 29.006758f, 23.005043f, 24.0f, 22.98487f);
                j.cubicTo(24.0f, 15.329971f, 24.0f, 7.6649857f, 24.010136f, 0.010085507f);
                j.lineTo(24.010136f, 0.010085507f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(i2, looper);
                j = c.j(looper);
                j.moveTo(42.0f, 0.040297855f);
                j.cubicTo(43.60058f, 0.03022339f, 45.201157f, 0.020148927f, 46.791607f, 0.0f);
                j.cubicTo(47.916065f, 5.2286468f, 48.88857f, 10.487516f, 49.921852f, 15.726237f);
                j.cubicTo(51.248913f, 10.477442f, 52.65702f, 5.238721f, 54.095512f, 0.020148927f);
                j.cubicTo(55.341534f, 0.020148927f, 56.587555f, 0.010074464f, 57.843704f, 0.010074464f);
                j.cubicTo(59.32272f, 5.2286468f, 60.700436f, 10.477442f, 62.098408f, 15.716163f);
                j.cubicTo(63.04052f, 10.467367f, 64.09406f, 5.2487955f, 65.13748f, 0.020148927f);
                j.cubicTo(66.75832f, 0.03022339f, 68.37916f, 0.03022339f, 70.0f, 0.03022339f);
                j.cubicTo(68.2272f, 7.6868157f, 66.373375f, 15.323259f, 64.65123f, 22.97985f);
                j.cubicTo(63.182343f, 22.989925f, 61.71346f, 22.989925f, 60.254704f, 23.0f);
                j.cubicTo(58.77569f, 17.94262f, 57.316933f, 12.865089f, 55.97974f, 7.767411f);
                j.cubicTo(54.67294f, 12.855016f, 53.1534f, 17.90232f, 51.77569f, 22.97985f);
                j.cubicTo(50.3068f, 22.97985f, 48.837917f, 22.97985f, 47.36903f, 23.0f);
                j.cubicTo(45.575977f, 15.343408f, 43.732273f, 7.7069645f, 42.0f, 0.040297855f);
                j.lineTo(42.0f, 0.040297855f);
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
