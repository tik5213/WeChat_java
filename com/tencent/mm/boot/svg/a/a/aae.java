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

public final class aae extends c {
    private final int height = 246;
    private final int width = 171;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 171;
            case 1:
                return 246;
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
                float[] a2 = c.a(e, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, -0.5f);
                f.reset();
                f.setValues(a2);
                canvas.concat(f);
                canvas.save();
                Paint a3 = c.a(a, looper);
                a3.setColor(-7503);
                a3.setStrokeWidth(6.0f);
                Path j = c.j(looper);
                j.moveTo(87.5f, 105.5f);
                j.cubicTo(124.77922f, 105.5f, 155.0f, 135.72078f, 155.0f, 173.0f);
                j.cubicTo(155.0f, 210.27922f, 124.77922f, 240.5f, 87.5f, 240.5f);
                j.cubicTo(50.22078f, 240.5f, 20.0f, 210.27922f, 20.0f, 173.0f);
                j.cubicTo(20.0f, 135.72078f, 50.22078f, 105.5f, 87.5f, 105.5f);
                j.close();
                canvas.drawPath(j, a3);
                canvas.restore();
                canvas.save();
                a = c.a(a, looper);
                a.setColor(-7503);
                a.setStrokeWidth(5.0f);
                j = c.j(looper);
                j.moveTo(108.01473f, 90.5f);
                j.cubicTo(111.320305f, 90.5f, 114.0f, 93.432076f, 114.0f, 97.04933f);
                j.lineTo(114.0f, 108.5f);
                j.lineTo(60.0f, 108.5f);
                j.lineTo(60.0f, 108.5f);
                j.lineTo(60.0f, 97.04933f);
                j.cubicTo(60.0f, 93.432236f, 62.677868f, 90.5f, 65.98527f, 90.5f);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-7503);
                j = c.j(looper);
                j.moveTo(93.507645f, 222.5f);
                j.lineTo(95.01077f, 222.5f);
                j.cubicTo(95.83834f, 222.5f, 96.17029f, 223.17647f, 95.7646f, 223.98616f);
                j.lineTo(92.744606f, 230.01384f);
                j.cubicTo(92.333374f, 230.83463f, 91.336006f, 231.5f, 90.501564f, 231.5f);
                j.lineTo(88.998436f, 231.5f);
                j.cubicTo(88.170876f, 231.5f, 87.83892f, 230.82353f, 88.244606f, 230.01384f);
                j.lineTo(91.2646f, 223.98616f);
                j.cubicTo(91.67584f, 223.16537f, 92.6732f, 222.5f, 93.507645f, 222.5f);
                j.close();
                j.moveTo(85.075386f, 222.8139f);
                j.lineTo(86.55568f, 223.07492f);
                j.cubicTo(87.370674f, 223.21863f, 87.58011f, 223.94246f, 87.03999f, 224.66942f);
                j.lineTo(83.01917f, 230.08109f);
                j.cubicTo(82.471664f, 230.818f, 81.37391f, 231.30008f, 80.55215f, 231.15518f);
                j.lineTo(79.071846f, 230.89417f);
                j.cubicTo(78.25686f, 230.75046f, 78.04742f, 230.02663f, 78.58754f, 229.29967f);
                j.lineTo(82.60835f, 223.888f);
                j.cubicTo(83.15587f, 223.1511f, 84.253624f, 222.669f, 85.075386f, 222.8139f);
                j.close();
                j.moveTo(76.64395f, 221.65056f);
                j.lineTo(78.065186f, 222.13992f);
                j.cubicTo(78.847664f, 222.40935f, 78.94129f, 223.15703f, 78.2941f, 223.79054f);
                j.lineTo(73.47622f, 228.5066f);
                j.cubicTo(72.82017f, 229.14879f, 71.660515f, 229.4532f, 70.87154f, 229.18153f);
                j.lineTo(69.450294f, 228.69217f);
                j.cubicTo(68.667816f, 228.42273f, 68.57419f, 227.67506f, 69.22138f, 227.04155f);
                j.lineTo(74.03927f, 222.32549f);
                j.cubicTo(74.69532f, 221.6833f, 75.854965f, 221.37889f, 76.64395f, 221.65056f);
                j.close();
                j.moveTo(68.593285f, 219.13254f);
                j.lineTo(69.90796f, 219.86127f);
                j.cubicTo(70.63176f, 220.26248f, 70.59413f, 221.01506f, 69.84676f, 221.52657f);
                j.lineTo(64.28314f, 225.33435f);
                j.cubicTo(63.52554f, 225.85286f, 62.330647f, 225.95128f, 61.600826f, 225.54674f);
                j.lineTo(60.28616f, 224.81801f);
                j.cubicTo(59.562355f, 224.4168f, 59.599983f, 223.66422f, 60.34735f, 223.15271f);
                j.lineTo(65.91097f, 219.34492f);
                j.cubicTo(66.66857f, 218.82642f, 67.863464f, 218.72798f, 68.593285f, 219.13254f);
                j.close();
                j.moveTo(61.080887f, 215.29256f);
                j.lineTo(62.24904f, 216.2385f);
                j.cubicTo(62.892174f, 216.75931f, 62.724438f, 217.49391f, 61.8996f, 217.86787f);
                j.lineTo(55.759285f, 220.6517f);
                j.cubicTo(54.923157f, 221.03078f, 53.729324f, 220.92021f, 53.08084f, 220.39508f);
                j.lineTo(51.91269f, 219.44913f);
                j.cubicTo(51.26955f, 218.92833f, 51.43729f, 218.19371f, 52.262127f, 217.81976f);
                j.lineTo(58.402443f, 215.03593f);
                j.cubicTo(59.23857f, 214.65686f, 60.4324f, 214.76741f, 61.080887f, 215.29256f);
                j.close();
                j.moveTo(54.32205f, 210.24f);
                j.lineTo(55.308193f, 211.37444f);
                j.cubicTo(55.851124f, 211.99901f, 55.55837f, 212.69333f, 54.681126f, 212.91837f);
                j.lineTo(48.15069f, 214.59366f);
                j.cubicTo(47.26144f, 214.82178f, 46.104942f, 214.50558f, 45.5575f, 213.87582f);
                j.lineTo(44.571358f, 212.7414f);
                j.cubicTo(44.028427f, 212.11682f, 44.321182f, 211.4225f, 45.19842f, 211.19746f);
                j.lineTo(51.72886f, 209.52219f);
                j.cubicTo(52.61811f, 209.29405f, 53.774605f, 209.61024f, 54.32205f, 210.24f);
                j.close();
                j.moveTo(48.49193f, 204.0384f);
                j.lineTo(49.288467f, 205.31314f);
                j.cubicTo(49.72701f, 206.01495f, 49.329243f, 206.65492f, 48.427597f, 206.73997f);
                j.lineTo(41.71549f, 207.37303f);
                j.cubicTo(40.801502f, 207.45924f, 39.708706f, 206.96603f, 39.266518f, 206.25838f);
                j.lineTo(38.46998f, 204.98366f);
                j.cubicTo(38.031437f, 204.28185f, 38.429207f, 203.64186f, 39.330853f, 203.55682f);
                j.lineTo(46.042957f, 202.92375f);
                j.cubicTo(46.956947f, 202.83754f, 48.04974f, 203.33076f, 48.49193f, 204.0384f);
                j.close();
                j.moveTo(43.80894f, 197.02188f);
                j.lineTo(44.37202f, 198.41557f);
                j.cubicTo(44.682034f, 199.18286f, 44.179176f, 199.74405f, 43.276463f, 199.67123f);
                j.lineTo(36.556396f, 199.12914f);
                j.cubicTo(35.641323f, 199.05533f, 34.650776f, 198.37984f, 34.33819f, 197.60616f);
                j.lineTo(33.775105f, 196.21248f);
                j.cubicTo(33.465096f, 195.44518f, 33.96795f, 194.88399f, 34.870667f, 194.95682f);
                j.lineTo(41.590733f, 195.4989f);
                j.cubicTo(42.505802f, 195.57272f, 43.49635f, 196.2482f, 43.80894f, 197.02188f);
                j.close();
                j.moveTo(40.375206f, 189.31477f);
                j.lineTo(40.687725f, 190.78505f);
                j.cubicTo(40.859787f, 191.59453f, 40.26712f, 192.05988f, 39.390766f, 191.8314f);
                j.lineTo(32.866924f, 190.13062f);
                j.cubicTo(31.978573f, 189.89903f, 31.12037f, 189.0618f, 30.94688f, 188.24559f);
                j.lineTo(30.634361f, 186.7753f);
                j.cubicTo(30.462301f, 185.96582f, 31.054966f, 185.50049f, 31.931322f, 185.72896f);
                j.lineTo(38.455162f, 187.42975f);
                j.cubicTo(39.343513f, 187.66133f, 40.201717f, 188.49857f, 40.375206f, 189.31477f);
                j.close();
                j.moveTo(38.28955f, 181.13745f);
                j.lineTo(38.34201f, 182.63966f);
                j.cubicTo(38.37089f, 183.46672f, 37.706425f, 183.82208f, 36.883057f, 183.4449f);
                j.lineTo(30.753666f, 180.6371f);
                j.cubicTo(29.919025f, 180.25476f, 29.219244f, 179.28123f, 29.190123f, 178.4473f);
                j.lineTo(29.137665f, 176.94508f);
                j.cubicTo(29.108782f, 176.11803f, 29.773249f, 175.76266f, 30.596617f, 176.13985f);
                j.lineTo(36.72601f, 178.94765f);
                j.cubicTo(37.560646f, 179.32999f, 38.26043f, 180.30351f, 38.28955f, 181.13745f);
                j.close();
                j.moveTo(37.648495f, 172.6494f);
                j.lineTo(37.46531f, 174.14133f);
                j.cubicTo(37.364456f, 174.96272f, 36.65258f, 175.20976f, 35.89835f, 174.70842f);
                j.lineTo(30.283659f, 170.97635f);
                j.cubicTo(29.519108f, 170.46815f, 28.980234f, 169.39714f, 29.081928f, 168.56891f);
                j.lineTo(29.265114f, 167.07698f);
                j.cubicTo(29.365969f, 166.25558f, 30.077843f, 166.00856f, 30.832071f, 166.50989f);
                j.lineTo(36.446762f, 170.24197f);
                j.cubicTo(37.211315f, 170.75017f, 37.750187f, 171.82118f, 37.648495f, 172.6494f);
                j.close();
                j.moveTo(38.41187f, 164.24776f);
                j.lineTo(37.972397f, 165.68521f);
                j.cubicTo(37.730442f, 166.47661f, 36.986485f, 166.59628f, 36.330772f, 165.97159f);
                j.lineTo(31.449448f, 161.32123f);
                j.cubicTo(30.784758f, 160.68799f, 30.440052f, 159.53967f, 30.684021f, 158.74168f);
                j.lineTo(31.123493f, 157.30423f);
                j.cubicTo(31.36545f, 156.51283f, 32.109406f, 156.39317f, 32.76512f, 157.01785f);
                j.lineTo(37.646442f, 161.66821f);
                j.cubicTo(38.311134f, 162.30145f, 38.655838f, 163.44978f, 38.41187f, 164.24776f);
                j.close();
                j.moveTo(40.581177f, 156.09344f);
                j.lineTo(39.89877f, 157.43275f);
                j.cubicTo(39.523064f, 158.17012f, 38.76963f, 158.15877f, 38.232353f, 157.42972f);
                j.lineTo(34.232716f, 152.00237f);
                j.cubicTo(33.688084f, 151.26332f, 33.54802f, 150.0726f, 33.92685f, 149.3291f);
                j.lineTo(34.609257f, 147.9898f);
                j.cubicTo(34.984962f, 147.25244f, 35.738396f, 147.26378f, 36.275673f, 147.99284f);
                j.lineTo(40.27531f, 153.42018f);
                j.cubicTo(40.819942f, 154.15923f, 40.960007f, 155.34996f, 40.581177f, 156.09344f);
                j.close();
                j.moveTo(44.162678f, 148.37251f);
                j.lineTo(43.279163f, 149.58858f);
                j.cubicTo(42.792732f, 150.25809f, 42.050346f, 150.12903f, 41.633736f, 149.32489f);
                j.lineTo(38.532364f, 143.33868f);
                j.cubicTo(38.11005f, 142.52354f, 38.15798f, 141.32556f, 38.648457f, 140.65048f);
                j.lineTo(39.531975f, 139.43442f);
                j.cubicTo(40.018402f, 138.76491f, 40.760788f, 138.89397f, 41.1774f, 139.6981f);
                j.lineTo(44.27877f, 145.68431f);
                j.cubicTo(44.701084f, 146.49945f, 44.653152f, 147.69743f, 44.162678f, 148.37251f);
                j.close();
                j.moveTo(48.92794f, 141.41241f);
                j.lineTo(47.84668f, 142.45657f);
                j.cubicTo(47.25138f, 143.03145f, 46.542686f, 142.77544f, 46.27204f, 141.91116f);
                j.lineTo(44.25728f, 135.47736f);
                j.cubicTo(43.98293f, 134.60127f, 44.23816f, 133.42981f, 44.83841f, 132.85016f);
                j.lineTo(45.91967f, 131.80598f);
                j.cubicTo(46.51497f, 131.23112f, 47.223663f, 131.48714f, 47.49431f, 132.3514f);
                j.lineTo(49.50907f, 138.7852f);
                j.cubicTo(49.78342f, 139.6613f, 49.52819f, 140.83275f, 48.92794f, 141.41241f);
                j.close();
                j.moveTo(54.799545f, 135.3541f);
                j.lineTo(53.553394f, 136.19464f);
                j.cubicTo(52.867313f, 136.65741f, 52.21384f, 136.28223f, 52.097385f, 135.3841f);
                j.lineTo(51.230453f, 128.69817f);
                j.cubicTo(51.1124f, 127.78774f, 51.567177f, 126.6784f, 52.25896f, 126.211784f);
                j.lineTo(53.50511f, 125.37125f);
                j.cubicTo(54.191193f, 124.90848f, 54.844666f, 125.28367f, 54.96112f, 126.1818f);
                j.lineTo(55.828056f, 132.86772f);
                j.cubicTo(55.946106f, 133.77815f, 55.49133f, 134.88748f, 54.799545f, 135.3541f);
                j.close();
                j.moveTo(61.60983f, 130.37141f);
                j.lineTo(60.23665f, 130.98279f);
                j.cubicTo(59.480633f, 131.31938f, 58.90224f, 130.83643f, 58.943512f, 129.93172f);
                j.lineTo(59.250748f, 123.19682f);
                j.cubicTo(59.292583f, 122.27973f, 59.933086f, 121.26622f, 60.69539f, 120.92682f);
                j.lineTo(62.068565f, 120.31544f);
                j.cubicTo(62.82458f, 119.97884f, 63.402973f, 120.46181f, 63.361702f, 121.36651f);
                j.lineTo(63.054466f, 128.1014f);
                j.cubicTo(63.01263f, 129.0185f, 62.37213f, 130.03201f, 61.60983f, 130.37141f);
                j.close();
                j.moveTo(69.24679f, 126.61317f);
                j.lineTo(67.794876f, 127.002205f);
                j.cubicTo(66.995514f, 127.21639f, 66.499794f, 126.648895f, 66.68208f, 125.76178f);
                j.lineTo(68.03911f, 119.15787f);
                j.cubicTo(68.22389f, 118.25861f, 69.01506f, 117.35777f, 69.82107f, 117.1418f);
                j.lineTo(71.27298f, 116.75276f);
                j.cubicTo(72.07235f, 116.538574f, 72.56806f, 117.10607f, 72.38577f, 117.99319f);
                j.lineTo(71.028755f, 124.5971f);
                j.cubicTo(70.84396f, 125.49635f, 70.0528f, 126.397194f, 69.24679f, 126.61317f);
                j.close();
                j.moveTo(77.32698f, 124.19043f);
                j.lineTo(75.829575f, 124.321434f);
                j.cubicTo(75.00516f, 124.39356f, 74.61552f, 123.748604f, 74.94908f, 122.906624f);
                j.lineTo(77.43224f, 116.63868f);
                j.cubicTo(77.77038f, 115.78518f, 78.705956f, 115.03541f, 79.537224f, 114.96268f);
                j.lineTo(81.03463f, 114.83167f);
                j.cubicTo(81.85905f, 114.759544f, 82.24869f, 115.4045f, 81.91512f, 116.24648f);
                j.lineTo(79.43196f, 122.51442f);
                j.cubicTo(79.09383f, 123.36793f, 78.15826f, 124.1177f, 77.32698f, 124.19043f);
                j.close();
                j.moveTo(85.70162f, 123.1644f);
                j.lineTo(84.20421f, 123.03339f);
                j.cubicTo(83.3798f, 122.961266f, 83.10807f, 122.258446f, 83.58278f, 121.487175f);
                j.lineTo(87.11663f, 115.74566f);
                j.cubicTo(87.59784f, 114.96384f, 88.64939f, 114.38792f, 89.48067f, 114.46064f);
                j.lineTo(90.97807f, 114.591644f);
                j.cubicTo(91.80249f, 114.66377f, 92.07422f, 115.36659f, 91.59951f, 116.13786f);
                j.lineTo(88.06565f, 121.87938f);
                j.cubicTo(87.58445f, 122.6612f, 86.53289f, 123.23712f, 85.70162f, 123.1644f);
                j.close();
                j.moveTo(94.13105f, 123.56501f);
                j.lineTo(92.67914f, 123.17597f);
                j.cubicTo(91.879776f, 122.961784f, 91.734215f, 122.22246f, 92.33564f, 121.54534f);
                j.lineTo(96.81281f, 116.50469f);
                j.cubicTo(97.42247f, 115.81831f, 98.55806f, 115.43374f, 99.364075f, 115.64971f);
                j.lineTo(100.81599f, 116.03875f);
                j.cubicTo(101.61535f, 116.25294f, 101.7609f, 116.99226f, 101.15948f, 117.66938f);
                j.lineTo(96.682304f, 122.71002f);
                j.cubicTo(96.072655f, 123.39641f, 94.937065f, 123.78098f, 94.13105f, 123.56501f);
                j.close();
                j.moveTo(102.43453f, 125.43782f);
                j.lineTo(101.061356f, 124.82645f);
                j.cubicTo(100.305336f, 124.489845f, 100.27723f, 123.73685f, 100.97717f, 123.162155f);
                j.lineTo(106.18776f, 118.88395f);
                j.cubicTo(106.89728f, 118.30139f, 108.07905f, 118.0992f, 108.841354f, 118.4386f);
                j.lineTo(110.21453f, 119.04997f);
                j.cubicTo(110.97055f, 119.38657f, 110.99866f, 120.13957f, 110.29871f, 120.714264f);
                j.lineTo(105.08813f, 124.99247f);
                j.cubicTo(104.37861f, 125.57503f, 103.19684f, 125.77722f, 102.43453f, 125.43782f);
                j.close();
                j.moveTo(110.24409f, 128.62819f);
                j.lineTo(108.99793f, 127.78765f);
                j.cubicTo(108.31185f, 127.32489f, 108.41493f, 126.57845f, 109.20403f, 126.134026f);
                j.lineTo(115.078354f, 122.82563f);
                j.cubicTo(115.878265f, 122.37513f, 117.07719f, 122.38122f, 117.768974f, 122.84783f);
                j.lineTo(119.01513f, 123.68838f);
                j.cubicTo(119.7012f, 124.15114f, 119.59813f, 124.897575f, 118.80903f, 125.341995f);
                j.lineTo(112.9347f, 128.65039f);
                j.cubicTo(112.134796f, 129.1009f, 110.93587f, 129.0948f, 110.24409f, 128.62819f);
                j.close();
                j.moveTo(117.40541f, 133.0904f);
                j.lineTo(116.32415f, 132.04623f);
                j.cubicTo(115.72885f, 131.47136f, 115.95998f, 130.75415f, 116.81427f, 130.4535f);
                j.lineTo(123.17384f, 128.21544f);
                j.cubicTo(124.039825f, 127.91068f, 125.21948f, 128.12488f, 125.81973f, 128.70453f);
                j.lineTo(126.90099f, 129.74869f);
                j.cubicTo(127.49629f, 130.32356f, 127.26517f, 131.04076f, 126.41087f, 131.3414f);
                j.lineTo(120.0513f, 133.57948f);
                j.cubicTo(119.18532f, 133.88423f, 118.00566f, 133.67004f, 117.40541f, 133.0904f);
                j.close();
                j.moveTo(123.71322f, 138.69717f);
                j.lineTo(122.8297f, 137.48111f);
                j.cubicTo(122.34327f, 136.8116f, 122.69543f, 136.14543f, 123.58894f, 135.9977f);
                j.lineTo(130.24054f, 134.89796f);
                j.cubicTo(131.14629f, 134.74821f, 132.27083f, 135.16399f, 132.76129f, 135.83907f);
                j.lineTo(133.64482f, 137.05513f);
                j.cubicTo(134.13124f, 137.72464f, 133.77908f, 138.39081f, 132.88557f, 138.53854f);
                j.lineTo(126.23398f, 139.63828f);
                j.cubicTo(125.32823f, 139.78802f, 124.20369f, 139.37225f, 123.71322f, 138.69717f);
                j.close();
                j.moveTo(128.99811f, 145.37045f);
                j.lineTo(128.3157f, 144.03116f);
                j.cubicTo(127.94f, 143.2938f, 128.39203f, 142.69092f, 129.29765f, 142.68478f);
                j.lineTo(136.0394f, 142.63913f);
                j.cubicTo(136.95743f, 142.6329f, 138.00307f, 143.21948f, 138.3819f, 143.96298f);
                j.lineTo(139.0643f, 145.30228f);
                j.cubicTo(139.44002f, 146.03964f, 138.98798f, 146.64252f, 138.08235f, 146.64865f);
                j.lineTo(131.3406f, 146.69432f);
                j.cubicTo(130.42259f, 146.70053f, 129.37694f, 146.11395f, 128.99811f, 145.37045f);
                j.close();
                j.moveTo(133.07114f, 152.75873f);
                j.lineTo(132.63167f, 151.32127f);
                j.cubicTo(132.38971f, 150.52988f, 132.93956f, 150.01465f, 133.83249f, 150.16586f);
                j.lineTo(140.47974f, 151.2916f);
                j.cubicTo(141.3849f, 151.44489f, 142.3128f, 152.20413f, 142.55676f, 153.0021f);
                j.lineTo(142.99625f, 154.43956f);
                j.cubicTo(143.2382f, 155.23096f, 142.68835f, 155.74619f, 141.79541f, 155.59497f);
                j.lineTo(135.14816f, 154.46924f);
                j.cubicTo(134.24301f, 154.31595f, 133.31511f, 153.5567f, 133.07114f, 152.75873f);
                j.close();
                j.moveTo(135.84082f, 160.72949f);
                j.lineTo(135.65764f, 159.23756f);
                j.cubicTo(135.5568f, 158.41617f, 136.18776f, 158.00426f, 137.04086f, 158.30824f);
                j.lineTo(143.39165f, 160.57114f);
                j.cubicTo(144.25642f, 160.87927f, 145.03839f, 161.78812f, 145.14009f, 162.61635f);
                j.lineTo(145.32327f, 164.10828f);
                j.cubicTo(145.42413f, 164.92966f, 144.79317f, 165.34158f, 143.94006f, 165.0376f);
                j.lineTo(137.58928f, 162.77469f);
                j.cubicTo(136.72449f, 162.46655f, 135.94252f, 161.55772f, 135.84082f, 160.72949f);
                j.close();
                j.moveTo(137.19772f, 169.13211f);
                j.lineTo(137.25018f, 167.6299f);
                j.cubicTo(137.27907f, 166.80284f, 137.96669f, 166.49469f, 138.76175f, 166.92839f);
                j.lineTo(144.68034f, 170.1569f);
                j.cubicTo(145.48628f, 170.59654f, 146.11646f, 171.61652f, 146.08733f, 172.45045f);
                j.lineTo(146.03487f, 173.95267f);
                j.cubicTo(146.00598f, 174.77972f, 145.31836f, 175.08786f, 144.5233f, 174.65417f);
                j.lineTo(138.6047f, 171.42564f);
                j.cubicTo(137.79877f, 170.98602f, 137.1686f, 169.96605f, 137.19772f, 169.13211f);
                j.close();
                j.moveTo(137.14784f, 177.56738f);
                j.lineTo(137.46036f, 176.0971f);
                j.cubicTo(137.63242f, 175.28763f, 138.36311f, 175.10358f, 139.07079f, 175.66873f);
                j.lineTo(144.33884f, 179.87596f);
                j.cubicTo(145.05618f, 180.44887f, 145.49966f, 181.56277f, 145.32617f, 182.37898f);
                j.lineTo(145.01366f, 183.84926f);
                j.cubicTo(144.8416f, 184.65874f, 144.1109f, 184.84279f, 143.40323f, 184.27763f);
                j.lineTo(138.13518f, 180.0704f);
                j.cubicTo(137.41783f, 179.4975f, 136.97435f, 178.38359f, 137.14784f, 177.56738f);
                j.close();
                j.moveTo(135.6763f, 185.87515f);
                j.lineTo(136.23938f, 184.48148f);
                j.cubicTo(136.5494f, 183.71417f, 137.30095f, 183.6598f, 137.89972f, 184.33926f);
                j.lineTo(142.35716f, 189.39737f);
                j.cubicTo(142.96414f, 190.08612f, 143.20744f, 191.26012f, 142.89485f, 192.0338f);
                j.lineTo(142.33177f, 193.42747f);
                j.cubicTo(142.02176f, 194.19478f, 141.2702f, 194.24915f, 140.67143f, 193.56969f);
                j.lineTo(136.21399f, 188.5116f);
                j.cubicTo(135.60703f, 187.82283f, 135.36371f, 186.64883f, 135.6763f, 185.87515f);
                j.close();
                j.moveTo(132.82465f, 193.8175f);
                j.lineTo(133.62119f, 192.54277f);
                j.cubicTo(134.05972f, 191.84096f, 134.8093f, 191.91792f, 135.28099f, 192.69104f);
                j.lineTo(138.79239f, 198.44632f);
                j.cubicTo(139.27054f, 199.23003f, 139.30629f, 200.42844f, 138.86409f, 201.13608f);
                j.lineTo(138.06757f, 202.4108f);
                j.cubicTo(137.62901f, 203.11261f, 136.87944f, 203.03566f, 136.40775f, 202.26254f);
                j.lineTo(132.89636f, 196.50726f);
                j.cubicTo(132.41821f, 195.72356f, 132.38246f, 194.52515f, 132.82465f, 193.8175f);
                j.close();
                j.moveTo(128.60228f, 201.20833f);
                j.lineTo(129.58841f, 200.0739f);
                j.cubicTo(130.13135f, 199.44933f, 130.85965f, 199.64261f, 131.20459f, 200.48f);
                j.lineTo(133.77243f, 206.71371f);
                j.cubicTo(134.1221f, 207.56256f, 133.96994f, 208.75182f, 133.4225f, 209.38158f);
                j.lineTo(132.43636f, 210.516f);
                j.cubicTo(131.89342f, 211.14058f, 131.16512f, 210.9473f, 130.82018f, 210.10991f);
                j.lineTo(128.25233f, 203.87619f);
                j.cubicTo(127.90267f, 203.02734f, 128.05482f, 201.83809f, 128.60228f, 201.20833f);
                j.close();
                j.moveTo(123.26476f, 207.741f);
                j.lineTo(124.432915f, 206.79504f);
                j.cubicTo(125.07605f, 206.27425f, 125.759735f, 206.59105f, 125.954025f, 207.47562f);
                j.lineTo(127.400375f, 214.06053f);
                j.cubicTo(127.59733f, 214.95721f, 127.24097f, 216.10196f, 126.59248f, 216.62709f);
                j.lineTo(125.42433f, 217.57304f);
                j.cubicTo(124.7812f, 218.09386f, 124.09751f, 217.77704f, 123.90322f, 216.89249f);
                j.lineTo(122.45687f, 210.30756f);
                j.cubicTo(122.25992f, 209.41089f, 122.61628f, 208.26613f, 123.26476f, 207.741f);
                j.close();
                j.moveTo(116.901054f, 213.28142f);
                j.lineTo(118.21572f, 212.55267f);
                j.cubicTo(118.93952f, 212.15147f, 119.55781f, 212.58218f, 119.59554f, 213.48705f);
                j.lineTo(119.876465f, 220.22308f);
                j.cubicTo(119.91472f, 221.14034f, 119.36499f, 222.20583f, 118.63516f, 222.61037f);
                j.lineTo(117.320496f, 223.3391f);
                j.cubicTo(116.596695f, 223.74031f, 115.97841f, 223.30959f, 115.940674f, 222.40472f);
                j.lineTo(115.65976f, 215.66869f);
                j.cubicTo(115.621506f, 214.75145f, 116.171234f, 213.68596f, 116.901054f, 213.28142f);
                j.close();
                j.moveTo(109.69293f, 217.67055f);
                j.lineTo(111.114174f, 217.18117f);
                j.cubicTo(111.896645f, 216.91174f, 112.43075f, 217.44328f, 112.31078f, 218.34094f);
                j.lineTo(111.41773f, 225.02344f);
                j.cubicTo(111.29613f, 225.9334f, 110.569725f, 226.88722f, 109.78075f, 227.15889f);
                j.lineTo(108.359505f, 227.64827f);
                j.cubicTo(107.57703f, 227.9177f, 107.04293f, 227.38615f, 107.162895f, 226.4885f);
                j.lineTo(108.05595f, 219.806f);
                j.cubicTo(108.17755f, 218.89606f, 108.90395f, 217.94221f, 109.69293f, 217.67055f);
                j.close();
                j.moveTo(101.76464f, 220.76935f);
                j.lineTo(103.244934f, 220.50833f);
                j.cubicTo(104.05993f, 220.36462f, 104.504295f, 220.97316f, 104.245384f, 221.84102f);
                j.lineTo(102.317955f, 228.30153f);
                j.cubicTo(102.0555f, 229.18126f, 101.188835f, 230.0097f, 100.367065f, 230.15462f);
                j.lineTo(98.88677f, 230.41563f);
                j.cubicTo(98.071785f, 230.55933f, 97.62741f, 229.95079f, 97.88632f, 229.08295f);
                j.lineTo(99.81375f, 222.62244f);
                j.cubicTo(100.07621f, 221.7427f, 100.94288f, 220.91425f, 101.76464f, 220.76935f);
                j.close();
                j.moveTo(90.16729f, 188.08673f);
                j.cubicTo(88.76674f, 187.20149f, 86.49051f, 187.20497f, 85.09546f, 188.08673f);
                j.lineTo(71.929306f, 196.40857f);
                j.cubicTo(70.52876f, 197.2938f, 69.71234f, 196.70279f, 70.10228f, 195.10294f);
                j.lineTo(74.10692f, 178.67233f);
                j.cubicTo(74.49843f, 177.06602f, 73.74612f, 174.96655f, 72.406166f, 173.9678f);
                j.lineTo(60.531338f, 165.11676f);
                j.cubicTo(59.20053f, 164.12483f, 59.46825f, 163.25899f, 61.110046f, 163.18372f);
                j.lineTo(77.4633f, 162.43404f);
                j.cubicTo(79.11372f, 162.35838f, 80.895355f, 161.03532f, 81.44996f, 159.45824f);
                j.lineTo(86.633064f, 144.7195f);
                j.cubicTo(87.18442f, 143.15166f, 88.07508f, 143.14241f, 88.629684f, 144.7195f);
                j.lineTo(93.81278f, 159.45824f);
                j.cubicTo(94.364136f, 161.02606f, 96.157646f, 162.35878f, 97.79944f, 162.43404f);
                j.lineTo(114.1527f, 163.18372f);
                j.cubicTo(115.803116f, 163.25938f, 116.07136f, 164.11801f, 114.73141f, 165.11676f);
                j.lineTo(102.85658f, 173.9678f);
                j.cubicTo(101.52577f, 174.95973f, 100.76589f, 177.07248f, 101.15583f, 178.67233f);
                j.lineTo(105.16047f, 195.10294f);
                j.cubicTo(105.55198f, 196.70924f, 104.728485f, 197.29031f, 103.33344f, 196.40857f);
                j.lineTo(90.16729f, 188.08673f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-7503);
                e = c.a(a2, 1.0f, 0.0f, 68.0f, 0.0f, 1.0f, 0.479982f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                i3 = c.a(a, looper);
                Path j2 = c.j(looper);
                j2.moveTo(12.300404f, 99.02002f);
                j2.lineTo(39.0f, 99.02002f);
                j2.lineTo(72.20081f, 1.364242E-12f);
                j2.lineTo(33.200817f, 1.364242E-12f);
                j2.lineTo(24.020575f, 27.379679f);
                j2.lineTo(29.69593f, 46.24266f);
                j2.lineTo(45.200817f, 1.364242E-12f);
                j2.lineTo(60.200817f, 1.364242E-12f);
                j2.lineTo(27.0f, 99.02002f);
                j2.lineTo(12.300404f, 99.02002f);
                j2.lineTo(12.300404f, 99.02002f);
                j2.close();
                j2.moveTo(11.911922f, 99.02002f);
                j2.lineTo(1.364242E-12f, 99.02002f);
                j2.lineTo(4.143844f, 86.66118f);
                j2.lineTo(11.911922f, 99.02002f);
                j2.close();
                WeChatSVGRenderC2Java.setFillType(j2, 2);
                canvas.drawPath(j2, i3);
                canvas.restore();
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-7503);
                a2 = c.a(e, -1.0f, 0.0f, 107.0f, 0.0f, 1.0f, 0.479982f);
                f.reset();
                f.setValues(a2);
                canvas.concat(f);
                canvas.save();
                Paint a4 = c.a(a, looper);
                Path j3 = c.j(looper);
                j3.moveTo(72.20081f, 1.364242E-12f);
                j3.lineTo(39.0f, 99.02002f);
                j3.lineTo(1.364242E-12f, 99.02002f);
                j3.lineTo(33.200817f, 1.364242E-12f);
                j3.lineTo(72.20081f, 1.364242E-12f);
                j3.close();
                j3.moveTo(60.200817f, 1.364242E-12f);
                j3.lineTo(27.0f, 99.02002f);
                j3.lineTo(12.0f, 99.02002f);
                j3.lineTo(45.200817f, 1.364242E-12f);
                j3.lineTo(60.200817f, 1.364242E-12f);
                j3.close();
                WeChatSVGRenderC2Java.setFillType(j3, 2);
                canvas.drawPath(j3, a4);
                canvas.restore();
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-7503);
                j = c.j(looper);
                j.moveTo(155.5278f, 99.618286f);
                j.cubicTo(156.33043f, 101.297264f, 158.49493f, 102.646454f, 160.35056f, 102.63188f);
                j.lineTo(166.84683f, 102.580864f);
                j.cubicTo(169.6444f, 102.55889f, 169.86624f, 103.51918f, 167.34206f, 104.72587f);
                j.lineTo(161.48087f, 107.527794f);
                j.cubicTo(159.8019f, 108.33043f, 158.4527f, 110.49494f, 158.46727f, 112.350555f);
                j.lineTo(158.5183f, 118.84683f);
                j.cubicTo(158.54025f, 121.644394f, 157.57997f, 121.86624f, 156.37329f, 119.34205f);
                j.lineTo(153.57135f, 113.480865f);
                j.cubicTo(152.76872f, 111.80189f, 150.60422f, 110.4527f, 148.7486f, 110.46727f);
                j.lineTo(142.25232f, 110.51829f);
                j.cubicTo(139.45476f, 110.54026f, 139.23291f, 109.57997f, 141.7571f, 108.37328f);
                j.lineTo(147.61829f, 105.57136f);
                j.cubicTo(149.29726f, 104.76872f, 150.64645f, 102.60421f, 150.63188f, 100.7486f);
                j.lineTo(150.58086f, 94.25231f);
                j.cubicTo(150.5589f, 91.45476f, 151.51918f, 91.23291f, 152.72586f, 93.7571f);
                j.lineTo(155.5278f, 99.618286f);
                j.lineTo(155.5278f, 99.618286f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                a = c.a(i2, looper);
                a.setColor(-7503);
                a2 = c.a(a2, 0.83867055f, -0.54463905f, 124.35805f, 0.54463905f, 0.83867055f, 28.770912f);
                f.reset();
                f.setValues(a2);
                canvas.concat(f);
                j = c.j(looper);
                j.moveTo(14.264637f, 219.69206f);
                j.cubicTo(14.798034f, 220.80785f, 16.23648f, 221.70445f, 17.469648f, 221.69478f);
                j.lineTo(21.786816f, 221.66087f);
                j.cubicTo(23.645962f, 221.64627f, 23.793392f, 222.28444f, 22.115915f, 223.08635f);
                j.lineTo(18.220808f, 224.9484f);
                j.cubicTo(17.105028f, 225.4818f, 16.20841f, 226.92024f, 16.218094f, 228.15341f);
                j.lineTo(16.251999f, 232.47058f);
                j.cubicTo(16.266598f, 234.32973f, 15.628429f, 234.47716f, 14.826514f, 232.79968f);
                j.lineTo(12.964465f, 228.90457f);
                j.cubicTo(12.431068f, 227.78879f, 10.992621f, 226.89218f, 9.759454f, 226.90186f);
                j.lineTo(5.442286f, 226.93576f);
                j.cubicTo(3.5831401f, 226.95036f, 3.43571f, 226.3122f, 5.1131873f, 225.51028f);
                j.lineTo(9.008294f, 223.64822f);
                j.cubicTo(10.124075f, 223.11484f, 11.020692f, 221.67639f, 11.011008f, 220.44322f);
                j.lineTo(10.977104f, 216.12605f);
                j.cubicTo(10.962503f, 214.2669f, 11.600673f, 214.11948f, 12.402588f, 215.79695f);
                j.lineTo(14.264637f, 219.69206f);
                j.lineTo(14.264637f, 219.69206f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                canvas.save();
                i2 = c.a(i2, looper);
                i2.setColor(-7503);
                e = c.a(a2, 0.83867055f, -0.54463905f, 148.5328f, 0.54463905f, 0.83867055f, -44.311714f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                j = c.j(looper);
                j.moveTo(149.50385f, 225.44205f);
                j.cubicTo(149.86528f, 226.19812f, 150.84f, 226.8057f, 151.67561f, 226.79912f);
                j.lineTo(154.60098f, 226.77615f);
                j.cubicTo(155.86078f, 226.76625f, 155.96068f, 227.19868f, 154.82399f, 227.74208f);
                j.lineTo(152.1846f, 229.00385f);
                j.cubicTo(151.42853f, 229.36528f, 150.82097f, 230.34f, 150.82753f, 231.17561f);
                j.lineTo(150.85051f, 234.10098f);
                j.cubicTo(150.8604f, 235.36078f, 150.42796f, 235.46068f, 149.88458f, 234.32399f);
                j.lineTo(148.62282f, 231.6846f);
                j.cubicTo(148.26138f, 230.92853f, 147.28667f, 230.32097f, 146.45105f, 230.32753f);
                j.lineTo(143.52567f, 230.35051f);
                j.cubicTo(142.26588f, 230.3604f, 142.16599f, 229.92796f, 143.30266f, 229.38458f);
                j.lineTo(145.94205f, 228.12282f);
                j.cubicTo(146.69812f, 227.76138f, 147.3057f, 226.78667f, 147.29912f, 225.95105f);
                j.lineTo(147.27615f, 223.02567f);
                j.cubicTo(147.26625f, 221.76588f, 147.69868f, 221.66599f, 148.24208f, 222.80266f);
                j.lineTo(149.50385f, 225.44205f);
                j.lineTo(149.50385f, 225.44205f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, i2);
                canvas.restore();
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}
