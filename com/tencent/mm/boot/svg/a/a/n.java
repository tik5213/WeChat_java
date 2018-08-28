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

public final class n extends c {
    private final int height = 96;
    private final int width = 96;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 96;
            case 1:
                return 96;
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
                e = c.a(e, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 17.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                e = c.a(e, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.067056f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                Paint a = c.a(i2, looper);
                a.setColor(-1);
                Path j = c.j(looper);
                j.moveTo(57.465305f, 52.295155f);
                j.cubicTo(57.383434f, 52.276527f, 57.30082f, 52.260136f, 57.218204f, 52.246723f);
                j.cubicTo(57.13559f, 52.232567f, 57.052227f, 52.220646f, 56.968124f, 52.211708f);
                j.cubicTo(54.519424f, 51.754982f, 52.177902f, 50.57927f, 50.283695f, 48.68233f);
                j.cubicTo(50.146748f, 48.545986f, 50.014267f, 48.40666f, 49.885506f, 48.265095f);
                j.lineTo(49.884758f, 48.265842f);
                j.cubicTo(49.498474f, 47.878407f, 48.871788f, 47.878407f, 48.485504f, 48.265842f);
                j.cubicTo(48.12378f, 48.627197f, 48.100708f, 49.19941f, 48.41554f, 49.588333f);
                j.cubicTo(48.437126f, 49.615154f, 48.460197f, 49.64123f, 48.485504f, 49.666565f);
                j.cubicTo(48.52867f, 49.709778f, 48.57556f, 49.747032f, 48.62394f, 49.78056f);
                j.cubicTo(48.71995f, 49.871456f, 48.815968f, 49.963844f, 48.909744f, 50.057724f);
                j.cubicTo(50.76227f, 51.91219f, 51.926334f, 54.194324f, 52.404167f, 56.585983f);
                j.cubicTo(52.412354f, 56.72084f, 52.42724f, 56.854954f, 52.448822f, 56.98832f);
                j.cubicTo(52.471897f, 57.135098f, 52.503155f, 57.281128f, 52.542603f, 57.42567f);
                j.cubicTo(52.725697f, 58.09772f, 53.07998f, 58.73326f, 53.607674f, 59.261513f);
                j.cubicTo(55.224262f, 60.879795f, 57.84489f, 60.879795f, 59.460735f, 59.261513f);
                j.cubicTo(61.077324f, 57.64323f, 61.077324f, 55.019855f, 59.460735f, 53.40232f);
                j.cubicTo(58.891357f, 52.8316f, 58.196194f, 52.46354f, 57.465305f, 52.295155f);
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-1);
                j = c.j(looper);
                j.moveTo(71.16499f, 41.71508f);
                j.cubicTo(69.54915f, 40.096798f, 66.92778f, 40.096798f, 65.31119f, 41.71508f);
                j.cubicTo(64.74181f, 42.2858f, 64.37414f, 42.980946f, 64.205925f, 43.7126f);
                j.cubicTo(64.18732f, 43.794556f, 64.170944f, 43.87726f, 64.15681f, 43.95996f);
                j.cubicTo(64.14341f, 44.043407f, 64.1315f, 44.126854f, 64.12257f, 44.210304f);
                j.cubicTo(63.66632f, 46.661568f, 62.491837f, 49.005543f, 60.596886f, 50.902477f);
                j.cubicTo(60.460682f, 51.038826f, 60.32076f, 51.171448f, 60.180088f, 51.300343f);
                j.lineTo(60.180832f, 51.301086f);
                j.cubicTo(59.793804f, 51.68778f, 59.793804f, 52.31512f, 60.180832f, 52.70181f);
                j.cubicTo(60.54181f, 53.06391f, 61.113422f, 53.08701f, 61.50268f, 52.771847f);
                j.cubicTo(61.528732f, 52.75024f, 61.554783f, 52.727142f, 61.58009f, 52.70181f);
                j.cubicTo(61.623257f, 52.658596f, 61.660473f, 52.612404f, 61.69471f, 52.563972f);
                j.cubicTo(61.784767f, 52.467113f, 61.876312f, 52.371746f, 61.970837f, 52.277122f);
                j.cubicTo(63.823364f, 50.422657f, 66.10236f, 49.257374f, 68.49226f, 48.77979f);
                j.cubicTo(68.62698f, 48.77159f, 68.760956f, 48.75669f, 68.89418f, 48.735085f);
                j.cubicTo(69.0408f, 48.711987f, 69.18668f, 48.679947f, 69.33108f, 48.64046f);
                j.cubicTo(70.00317f, 48.457172f, 70.63804f, 48.102524f, 71.16499f, 47.575016f);
                j.cubicTo(72.781586f, 45.956734f, 72.781586f, 43.333363f, 71.16499f, 41.71508f);
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-1);
                j = c.j(looper);
                j.moveTo(53.636925f, 29.998707f);
                j.cubicTo(52.021084f, 31.61699f, 52.021084f, 34.240364f, 53.636925f, 35.858643f);
                j.cubicTo(54.206303f, 36.42862f, 54.901466f, 36.79668f, 55.632355f, 36.965065f);
                j.cubicTo(55.714226f, 36.983692f, 55.79684f, 37.000084f, 55.87946f, 37.01424f);
                j.cubicTo(55.96282f, 37.027653f, 56.046177f, 37.039574f, 56.129536f, 37.04851f);
                j.cubicTo(58.57898f, 37.505238f, 60.919758f, 38.68095f, 62.813965f, 40.57789f);
                j.cubicTo(62.950912f, 40.714233f, 63.083397f, 40.854305f, 63.212902f, 40.995125f);
                j.lineTo(63.212902f, 40.995125f);
                j.cubicTo(63.59993f, 41.381813f, 64.225876f, 41.381813f, 64.6129f, 40.995125f);
                j.cubicTo(64.97388f, 40.633022f, 64.996956f, 40.06081f, 64.68212f, 39.671886f);
                j.cubicTo(64.66054f, 39.645065f, 64.63747f, 39.618988f, 64.6129f, 39.593655f);
                j.cubicTo(64.56973f, 39.55044f, 64.52284f, 39.513187f, 64.474464f, 39.47966f);
                j.cubicTo(64.37771f, 39.388763f, 64.28244f, 39.296375f, 64.18791f, 39.202496f);
                j.cubicTo(62.33539f, 37.34803f, 61.171326f, 35.06664f, 60.693497f, 32.674236f);
                j.cubicTo(60.686054f, 32.53938f, 60.671165f, 32.405266f, 60.649582f, 32.2719f);
                j.cubicTo(60.62651f, 32.125122f, 60.594505f, 31.97909f, 60.5558f, 31.834547f);
                j.cubicTo(60.371964f, 31.162498f, 60.017685f, 30.526958f, 59.49073f, 29.998707f);
                j.cubicTo(57.87414f, 28.380424f, 55.253513f, 28.380424f, 53.636925f, 29.998707f);
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-1);
                j = c.j(looper);
                j.moveTo(48.940784f, 45.300335f);
                j.cubicTo(48.954926f, 45.216885f, 48.966087f, 45.13344f, 48.97502f, 45.04999f);
                j.cubicTo(49.43201f, 42.59873f, 50.606495f, 40.254753f, 52.500698f, 38.357815f);
                j.cubicTo(52.63765f, 38.22147f, 52.77683f, 38.08885f, 52.918243f, 37.959953f);
                j.lineTo(52.9175f, 37.959206f);
                j.cubicTo(53.303783f, 37.572517f, 53.303783f, 36.94517f, 52.9175f, 36.558483f);
                j.cubicTo(52.55578f, 36.19638f, 51.984165f, 36.173286f, 51.59565f, 36.48845f);
                j.cubicTo(51.568855f, 36.510056f, 51.542805f, 36.533154f, 51.51824f, 36.558483f);
                j.cubicTo(51.475075f, 36.601696f, 51.437115f, 36.647892f, 51.40362f, 36.69632f);
                j.cubicTo(51.31282f, 36.79318f, 51.22127f, 36.888546f, 51.126747f, 36.98317f);
                j.cubicTo(49.274967f, 38.83764f, 46.99522f, 40.00292f, 44.60532f, 40.480507f);
                j.cubicTo(44.471348f, 40.4887f, 44.33738f, 40.503605f, 44.203407f, 40.52521f);
                j.cubicTo(44.05678f, 40.54831f, 43.910904f, 40.580345f, 43.767254f, 40.619835f);
                j.cubicTo(43.095165f, 40.80312f, 42.46029f, 41.157772f, 41.93259f, 41.685276f);
                j.cubicTo(40.316006f, 43.30356f, 40.316006f, 45.926933f, 41.93259f, 47.545216f);
                j.cubicTo(43.54918f, 49.163494f, 46.169807f, 49.163494f, 47.786396f, 47.545216f);
                j.cubicTo(48.355774f, 46.97524f, 48.724197f, 46.27935f, 48.892403f, 45.547695f);
                j.cubicTo(48.91101f, 45.465736f, 48.927387f, 45.383034f, 48.940784f, 45.300335f);
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-1);
                j = c.j(looper);
                j.moveTo(53.152695f, 9.709912f);
                j.cubicTo(48.3528f, 4.741073f, 41.63339f, 1.5402732f, 34.232216f, 0.6976045f);
                j.cubicTo(32.903667f, 0.5471013f, 31.587025f, 0.47035962f, 30.318018f, 0.47035962f);
                j.cubicTo(29.108555f, 0.47035962f, 27.84848f, 0.54039574f, 26.570541f, 0.6797229f);
                j.cubicTo(19.135876f, 1.4888637f, 12.379252f, 4.673272f, 7.5443745f, 9.645092f);
                j.cubicTo(5.6360264f, 11.608338f, 4.0812144f, 13.801065f, 2.922362f, 16.162922f);
                j.cubicTo(1.3496871f, 19.367447f, 0.5518132f, 22.770159f, 0.5518132f, 26.2742f);
                j.cubicTo(0.5518132f, 30.786316f, 1.9235312f, 35.2351f, 4.518854f, 39.14073f);
                j.cubicTo(5.8332624f, 41.119625f, 7.9827585f, 43.611122f, 9.960324f, 45.36724f);
                j.lineTo(9.067183f, 52.402145f);
                j.cubicTo(9.031457f, 52.49826f, 8.993498f, 52.59288f, 8.971169f, 52.69421f);
                j.cubicTo(8.951074f, 52.78511f, 8.944375f, 52.880478f, 8.935444f, 52.9751f);
                j.cubicTo(8.929489f, 53.046627f, 8.913859f, 53.11666f, 8.913859f, 53.190426f);
                j.cubicTo(8.913859f, 53.268658f, 8.929489f, 53.343163f, 8.936933f, 53.42065f);
                j.cubicTo(9.054529f, 54.576992f, 10.018379f, 55.483734f, 11.20477f, 55.483734f);
                j.cubicTo(11.618592f, 55.483734f, 12.001155f, 55.36527f, 12.336083f, 55.173042f);
                j.cubicTo(12.417211f, 55.12685f, 12.467078f, 55.101517f, 12.5139675f, 55.068733f);
                j.lineTo(14.648579f, 53.996586f);
                j.lineTo(21.009985f, 50.800255f);
                j.cubicTo(22.838696f, 51.325527f, 24.653263f, 51.660805f, 26.566076f, 51.87166f);
                j.cubicTo(27.809776f, 52.00875f, 29.072084f, 52.07804f, 30.318018f, 52.07804f);
                j.cubicTo(31.588514f, 52.07804f, 32.9059f, 52.0013f, 34.232216f, 51.850796f);
                j.cubicTo(36.84168f, 51.553516f, 39.35141f, 50.951504f, 41.733868f, 50.095425f);
                j.cubicTo(41.476345f, 50.009743f, 41.22329f, 49.89798f, 40.978416f, 49.757908f);
                j.cubicTo(39.520363f, 48.923435f, 38.766403f, 47.33645f, 38.916004f, 45.765106f);
                j.cubicTo(37.21382f, 46.306023f, 35.435726f, 46.694202f, 33.598083f, 46.903564f);
                j.cubicTo(32.4824f, 47.030224f, 31.37937f, 47.095047f, 30.318018f, 47.095047f);
                j.cubicTo(29.275274f, 47.095047f, 28.219133f, 47.03693f, 27.177877f, 46.92219f);
                j.cubicTo(26.96129f, 46.89835f, 26.744703f, 46.864822f, 26.528118f, 46.835762f);
                j.cubicTo(25.098345f, 46.645027f, 23.684946f, 46.352962f, 22.319183f, 45.95286f);
                j.cubicTo(22.041565f, 45.864197f, 21.746084f, 45.81875f, 21.444649f, 45.81875f);
                j.cubicTo(20.973515f, 45.81875f, 20.516523f, 45.94392f, 20.05358f, 46.18383f);
                j.cubicTo(19.993292f, 46.215126f, 19.933748f, 46.241203f, 19.87346f, 46.27622f);
                j.lineTo(14.648579f, 49.358555f);
                j.lineTo(14.422316f, 49.492664f);
                j.cubicTo(14.303229f, 49.56196f, 14.239222f, 49.586544f, 14.181167f, 49.586544f);
                j.cubicTo(13.989141f, 49.586544f, 13.833586f, 49.424118f, 13.833586f, 49.22519f);
                j.lineTo(14.035287f, 48.410088f);
                j.cubicTo(14.091853f, 48.194763f, 14.171492f, 47.892265f, 14.267504f, 47.524204f);
                j.cubicTo(14.380635f, 47.092068f, 14.513863f, 46.58393f, 14.648579f, 46.07207f);
                j.cubicTo(14.796691f, 45.50582f, 14.946292f, 44.9351f, 15.072821f, 44.45081f);
                j.cubicTo(15.125666f, 44.26231f, 15.179254f, 44.03581f, 15.179254f, 43.781742f);
                j.cubicTo(15.179254f, 43.079144f, 14.843581f, 42.41529f, 14.283878f, 42.00774f);
                j.cubicTo(13.999561f, 41.796886f, 13.715244f, 41.576347f, 13.416786f, 41.332714f);
                j.cubicTo(12.95905f, 40.959435f, 12.521411f, 40.571255f, 12.100145f, 40.171154f);
                j.cubicTo(10.916732f, 39.047596f, 9.877709f, 37.82122f, 9.0046625f, 36.506924f);
                j.cubicTo(6.9496903f, 33.41416f, 5.863034f, 29.904903f, 5.863034f, 26.357649f);
                j.cubicTo(5.863034f, 23.604631f, 6.491955f, 20.927614f, 7.731934f, 18.400352f);
                j.cubicTo(8.658569f, 16.513102f, 9.905992f, 14.755493f, 11.440708f, 13.176701f);
                j.cubicTo(15.415193f, 9.089273f, 21.00403f, 6.468134f, 27.177877f, 5.79683f);
                j.cubicTo(28.251883f, 5.6798553f, 29.308767f, 5.6202497f, 30.318018f, 5.6202497f);
                j.cubicTo(31.37788f, 5.6202497f, 32.481655f, 5.6843257f, 33.598083f, 5.811732f);
                j.cubicTo(39.742905f, 6.510603f, 45.298996f, 9.145153f, 49.243706f, 13.228855f);
                j.cubicTo(50.771725f, 14.811374f, 52.012447f, 16.572708f, 52.932384f, 18.464428f);
                j.cubicTo(54.152267f, 20.975298f, 54.77077f, 23.630709f, 54.77077f, 26.357649f);
                j.cubicTo(54.77077f, 26.640772f, 54.752907f, 26.923153f, 54.73951f, 27.206278f);
                j.cubicTo(56.333027f, 26.229496f, 58.439354f, 26.420979f, 59.820004f, 27.80233f);
                j.cubicTo(59.88922f, 27.872366f, 59.94802f, 27.948362f, 60.011284f, 28.022123f);
                j.cubicTo(60.056686f, 27.440973f, 60.082733f, 26.858332f, 60.082733f, 26.2742f);
                j.cubicTo(60.082733f, 22.802197f, 59.297512f, 19.427052f, 57.750145f, 16.24339f);
                j.cubicTo(56.59948f, 13.875571f, 55.05211f, 11.677629f, 53.152695f, 9.709912f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}