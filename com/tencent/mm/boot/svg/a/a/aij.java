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

public final class aij extends c {
    private final int height = 270;
    private final int width = 270;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 270;
            case 1:
                return 270;
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
                i2 = c.a(i2, looper);
                i2.setColor(-2206378);
                canvas.save();
                Paint a = c.a(i2, looper);
                Path j = c.j(looper);
                j.moveTo(132.38f, 0.0f);
                j.lineTo(139.11f, 0.0f);
                j.cubicTo(170.03f, 0.97f, 200.5f, 12.81f, 223.73f, 33.29f);
                j.cubicTo(252.25f, 57.88f, 269.48f, 94.88f, 270.0f, 132.53f);
                j.lineTo(270.0f, 137.41f);
                j.cubicTo(269.51f, 169.65f, 256.95f, 201.48f, 235.3f, 225.36f);
                j.cubicTo(210.51f, 253.12f, 173.83f, 269.77f, 136.59f, 270.0f);
                j.lineTo(131.83f, 270.0f);
                j.cubicTo(100.09f, 269.31f, 68.8f, 256.99f, 45.18f, 235.78f);
                j.cubicTo(17.51f, 211.35f, 0.78f, 175.18f, 0.0f, 138.28f);
                j.lineTo(0.0f, 132.6f);
                j.cubicTo(0.51f, 95.16f, 17.51f, 58.35f, 45.74f, 33.75f);
                j.cubicTo(69.41f, 12.69f, 100.71f, 0.55f, 132.38f, 0.0f);
                j.lineTo(132.38f, 0.0f);
                j.close();
                j.moveTo(129.28561f, 66.398506f);
                j.cubicTo(127.909935f, 67.02799f, 128.00961f, 68.716606f, 128.00961f, 69.97557f);
                j.cubicTo(128.0495f, 101.339806f, 127.989685f, 132.69405f, 128.02956f, 164.05827f);
                j.cubicTo(127.830185f, 165.34721f, 128.65758f, 166.64615f, 129.96349f, 166.88596f);
                j.cubicTo(133.33289f, 167.0758f, 136.72224f, 166.97588f, 140.09164f, 166.9559f);
                j.cubicTo(141.71654f, 167.17572f, 143.26169f, 165.72691f, 142.96263f, 164.05827f);
                j.cubicTo(142.98256f, 132.36432f, 142.9726f, 100.67036f, 142.96263f, 68.9664f);
                j.cubicTo(143.24174f, 67.27779f, 141.6667f, 65.818985f, 140.0119f, 66.07877f);
                j.cubicTo(136.45308f, 66.19867f, 132.77464f, 65.65912f, 129.28561f, 66.398506f);
                j.lineTo(129.28561f, 66.398506f);
                j.close();
                j.moveTo(132.43211f, 189.68253f);
                j.cubicTo(127.108795f, 191.74556f, 126.39702f, 199.80829f, 131.29929f, 202.72841f);
                j.cubicTo(135.77048f, 206.00732f, 142.81812f, 202.52908f, 142.95847f, 197.03766f);
                j.cubicTo(143.56999f, 191.69572f, 137.3043f, 187.25075f, 132.43211f, 189.68253f);
                j.lineTo(132.43211f, 189.68253f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}
