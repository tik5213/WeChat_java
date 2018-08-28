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

public final class amt extends c {
    private final int height = 42;
    private final int width = 42;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 42;
            case 1:
                return 42;
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
                e = c.a(e, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                Paint a2 = c.a(a, looper);
                a2.setColor(-4210753);
                a2.setStrokeWidth(2.3841698f);
                Path j = c.j(looper);
                j.moveTo(13.255814f, 19.44186f);
                j.cubicTo(15.75252f, 23.571234f, 11.813965f, 25.277498f, 9.72093f, 26.511627f);
                j.cubicTo(3.0922725f, 30.251368f, 0.0f, 31.759228f, 0.0f, 33.581394f);
                j.lineTo(0.0f, 36.23256f);
                j.cubicTo(0.0f, 37.254696f, 0.64349174f, 38.0f, 1.7674419f, 38.0f);
                j.lineTo(36.23256f, 38.0f);
                j.cubicTo(37.356506f, 38.0f, 38.0f, 37.254696f, 38.0f, 36.23256f);
                j.lineTo(38.0f, 33.581394f);
                j.cubicTo(38.0f, 31.759228f, 34.907726f, 30.251368f, 28.27907f, 26.511627f);
                j.cubicTo(26.186035f, 25.277498f, 22.24748f, 23.571234f, 24.744186f, 19.44186f);
                j.cubicTo(26.726433f, 16.674295f, 28.370281f, 15.399918f, 28.27907f, 10.604651f);
                j.cubicTo(28.370281f, 5.2031674f, 24.697962f, 0.0f, 19.44186f, 0.0f);
                j.cubicTo(13.302039f, 0.0f, 9.629718f, 5.2031674f, 9.72093f, 10.604651f);
                j.cubicTo(9.629718f, 15.399918f, 11.273568f, 16.674295f, 13.255814f, 19.44186f);
                j.close();
                canvas.drawPath(j, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(i2, looper);
                a2.setColor(-4737097);
                j = c.j(looper);
                j.moveTo(16.347082f, 34.10343f);
                j.lineTo(18.393309f, 36.05255f);
                j.lineTo(18.393309f, 36.05255f);
                j.cubicTo(18.723711f, 36.36727f, 19.241936f, 36.370655f, 19.57642f, 36.060276f);
                j.lineTo(21.677546f, 34.110565f);
                j.lineTo(21.677546f, 34.110565f);
                j.cubicTo(22.181849f, 33.642605f, 22.36036f, 32.91999f, 22.131973f, 32.27103f);
                j.lineTo(18.981232f, 23.318182f);
                j.lineTo(15.904492f, 32.292583f);
                j.lineTo(15.904492f, 32.292583f);
                j.cubicTo(15.6856785f, 32.930836f, 15.858533f, 33.63807f, 16.347082f, 34.10343f);
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
