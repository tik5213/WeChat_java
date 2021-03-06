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

public final class amr extends c {
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
                i3 = c.a(i3, looper);
                i3.setStrokeWidth(1.0f);
                Paint a = c.a(i2, looper);
                Paint a2 = c.a(i3, looper);
                a.setColor(-4210753);
                a2.setColor(-4210753);
                a2.setStrokeWidth(0.5f);
                canvas.save();
                e = c.a(e, 1.0f, 0.0f, 3.230769f, 0.0f, 1.0f, 0.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                Paint a3 = c.a(a, looper);
                a = c.a(a2, looper);
                Path j = c.j(looper);
                j.moveTo(32.76171f, 34.3179f);
                j.cubicTo(32.04974f, 35.220024f, 30.931181f, 35.92615f, 29.615654f, 36.305027f);
                j.cubicTo(28.96241f, 36.48965f, 28.304647f, 36.586777f, 27.65592f, 36.586777f);
                j.cubicTo(25.783825f, 36.585026f, 24.27043f, 35.773026f, 23.889143f, 34.563774f);
                j.cubicTo(23.36239f, 32.88115f, 25.090826f, 30.836275f, 27.663147f, 30.09515f);
                j.cubicTo(28.315489f, 29.90965f, 28.973251f, 29.814276f, 29.622883f, 29.814276f);
                j.cubicTo(31.494074f, 29.814276f, 33.006565f, 30.626276f, 33.386948f, 31.836401f);
                j.cubicTo(33.6318f, 32.61515f, 33.408634f, 33.496277f, 32.76171f, 34.3179f);
                j.moveTo(10.807075f, 37.917652f);
                j.cubicTo(10.0951f, 38.820652f, 8.976542f, 39.526775f, 7.65921f, 39.904778f);
                j.cubicTo(7.005965f, 40.091152f, 6.348202f, 40.1874f, 5.701282f, 40.1874f);
                j.cubicTo(3.8282845f, 40.184776f, 2.3157916f, 39.37365f, 1.9345062f, 38.164402f);
                j.cubicTo(1.4059469f, 36.481777f, 3.1352844f, 34.4369f, 5.70851f, 33.695774f);
                j.cubicTo(6.360852f, 33.510277f, 7.0186143f, 33.414024f, 7.6682453f, 33.414024f);
                j.cubicTo(9.539435f, 33.414024f, 11.051025f, 34.226902f, 11.432311f, 35.437027f);
                j.cubicTo(11.677165f, 36.2149f, 11.453995f, 37.0969f, 10.807075f, 37.917652f);
                j.moveTo(13.23393f, 12.986276f);
                j.lineTo(13.23393f, 6.130651f);
                j.lineTo(33.484528f, 1.9674009f);
                j.lineTo(33.484528f, 8.598151f);
                j.lineTo(33.484528f, 10.402401f);
                j.lineTo(33.484528f, 29.16415f);
                j.cubicTo(32.48162f, 28.465025f, 31.146217f, 28.053776f, 29.622883f, 28.053776f);
                j.cubicTo(28.795258f, 28.053776f, 27.957695f, 28.174526f, 27.134588f, 28.411652f);
                j.cubicTo(23.545807f, 29.4424f, 21.298752f, 32.42965f, 22.12728f, 35.06865f);
                j.cubicTo(22.753418f, 37.059277f, 24.922771f, 38.34465f, 27.65592f, 38.3464f);
                j.cubicTo(28.482641f, 38.3464f, 29.320204f, 38.226524f, 30.144215f, 37.988525f);
                j.cubicTo(31.833797f, 37.50465f, 33.28485f, 36.578026f, 34.23174f, 35.3784f);
                j.cubicTo(35.081047f, 34.3004f, 35.41535f, 33.114777f, 35.259945f, 31.9729f);
                j.cubicTo(35.298798f, 31.875776f, 35.325f, 31.774277f, 35.325f, 31.664026f);
                j.lineTo(35.325f, 0.8789008f);
                j.cubicTo(35.325f, 0.61202586f, 35.19941f, 0.36090085f, 34.983467f, 0.19465084f);
                j.cubicTo(34.76572f, 0.026650846f, 34.48382f, -0.033724155f, 34.21096f, 0.017900845f);
                j.lineTo(12.118986f, 4.5582757f);
                j.cubicTo(11.695235f, 4.645776f, 11.392555f, 5.0054007f, 11.392555f, 5.4192758f);
                j.lineTo(11.392555f, 32.667652f);
                j.cubicTo(10.405911f, 32.02715f, 9.121106f, 31.653526f, 7.6682453f, 31.653526f);
                j.cubicTo(6.838814f, 31.653526f, 6.0030575f, 31.77515f, 5.1799507f, 32.011402f);
                j.cubicTo(1.5875543f, 33.043026f, -0.6576933f, 36.0294f, 0.17264175f, 38.67015f);
                j.cubicTo(0.7978777f, 40.659027f, 2.9663262f, 41.9444f, 5.699475f, 41.947025f);
                j.lineTo(5.701282f, 41.947025f);
                j.cubicTo(6.5280027f, 41.947025f, 7.363759f, 41.826275f, 8.18777f, 41.58915f);
                j.cubicTo(9.877353f, 41.1044f, 11.329309f, 40.177776f, 12.275295f, 38.979027f);
                j.cubicTo(13.228509f, 37.77065f, 13.550162f, 36.424026f, 13.23393f, 35.160526f);
                j.lineTo(13.23393f, 14.789651f);
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a3);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}
