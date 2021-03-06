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

public final class aln extends c {
    private final int height = 60;
    private final int width = 60;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 60;
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
                canvas.save();
                Paint a = c.a(i2, looper);
                a.setColor(-12206054);
                e = c.a(e, 1.0f, 0.0f, 8.0f, 0.0f, 1.0f, 7.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path j = c.j(looper);
                j.moveTo(17.423912f, 0.6996584f);
                j.cubicTo(25.590271f, -1.439277f, 34.747402f, 1.4392903f, 40.2717f, 7.7861314f);
                j.cubicTo(47.177082f, 15.362361f, 47.967697f, 27.696222f, 41.943005f, 36.01208f);
                j.cubicTo(38.270145f, 40.95962f, 29.072983f, 40.249973f, 26.981354f, 34.123024f);
                j.cubicTo(23.368542f, 35.812183f, 18.955105f, 36.791695f, 15.30226f, 34.65276f);
                j.cubicTo(10.628621f, 32.084038f, 9.357632f, 26.037048f, 10.458488f, 21.179464f);
                j.cubicTo(11.289135f, 16.721684f, 13.821107f, 11.594236f, 18.814995f, 10.914575f);
                j.cubicTo(21.547123f, 10.174942f, 24.129133f, 11.32437f, 26.130692f, 13.123475f);
                j.cubicTo(26.36087f, 12.603733f, 26.831238f, 11.564251f, 27.071424f, 11.054504f);
                j.cubicTo(29.283146f, 11.04451f, 31.49487f, 11.004529f, 33.706593f, 10.944559f);
                j.cubicTo(27.351643f, 5.4073153f, 16.833452f, 5.757141f, 11.219081f, 12.183943f);
                j.cubicTo(4.884148f, 18.700699f, 5.924958f, 30.424864f, 13.320717f, 35.71223f);
                j.cubicTo(16.863476f, 38.71074f, 21.60717f, 38.87066f, 25.980576f, 39.360416f);
                j.cubicTo(29.393232f, 39.600296f, 29.303162f, 45.77722f, 25.860481f, 45.85718f);
                j.cubicTo(19.415462f, 46.576824f, 12.670211f, 44.55783f, 7.8064237f, 40.229984f);
                j.cubicTo(1.4314594f, 34.73272f, -1.4507848f, 25.54729f, 0.7108984f, 17.401346f);
                j.cubicTo(2.6424024f, 9.315371f, 9.347624f, 2.6486883f, 17.423912f, 0.6996584f);
                j.lineTo(17.423912f, 0.6996584f);
                j.close();
                j.moveTo(34.088074f, 11.0f);
                j.cubicTo(33.97896f, 17.984352f, 33.959118f, 24.989065f, 34.097996f, 31.983599f);
                j.cubicTo(37.321896f, 32.278854f, 38.15515f, 28.521967f, 38.680897f, 26.027555f);
                j.cubicTo(39.8415f, 20.570395f, 37.728603f, 14.9706955f, 34.088074f, 11.0f);
                j.lineTo(34.088074f, 11.0f);
                j.close();
                j.moveTo(18.826458f, 28.112526f);
                j.cubicTo(21.167404f, 29.596699f, 24.000652f, 29.143202f, 26.0f, 27.318907f);
                j.cubicTo(25.89953f, 23.783693f, 25.92967f, 20.24848f, 25.959812f, 16.713264f);
                j.cubicTo(24.60347f, 16.434982f, 23.257175f, 16.043327f, 21.88074f, 16.0021f);
                j.cubicTo(16.153961f, 15.837192f, 13.632171f, 25.432774f, 18.826458f, 28.112526f);
                j.lineTo(18.826458f, 28.112526f);
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
