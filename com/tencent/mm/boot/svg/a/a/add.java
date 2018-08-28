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

public final class add extends c {
    private final int height = 84;
    private final int width = 96;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 96;
            case 1:
                return 84;
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
                e = c.a(e, 1.0f, 0.0f, -897.0f, 0.0f, 1.0f, -151.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                e = c.a(e, 1.0f, 0.0f, 907.0f, 0.0f, 1.0f, 155.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                Path j = c.j(looper);
                j.moveTo(0.0017162571f, 0.0f);
                j.lineTo(76.00172f, 0.0f);
                j.lineTo(76.00172f, 76.0f);
                j.lineTo(0.0017162571f, 76.0f);
                j.lineTo(0.0017162571f, 0.0f);
                j.close();
                canvas.save();
                Paint a = c.a(i2, looper);
                a.setColor(-15028967);
                j = c.j(looper);
                j.moveTo(31.39809f, 8.691818f);
                j.cubicTo(34.19209f, 7.1608176f, 37.52609f, 6.6278176f, 40.65309f, 7.261818f);
                j.cubicTo(43.75709f, 7.862818f, 46.57609f, 9.585818f, 48.71709f, 11.887817f);
                j.cubicTo(51.33509f, 14.700818f, 53.00709f, 18.327818f, 53.66309f, 22.099817f);
                j.cubicTo(54.61809f, 27.525818f, 53.56309f, 33.359818f, 50.44609f, 37.94082f);
                j.cubicTo(49.59409f, 39.19182f, 48.58809f, 40.339817f, 47.44809f, 41.33682f);
                j.cubicTo(46.95309f, 41.790817f, 46.44209f, 42.26682f, 46.15609f, 42.886818f);
                j.cubicTo(45.93809f, 43.359818f, 46.01509f, 43.893818f, 46.00209f, 44.39882f);
                j.cubicTo(46.01009f, 44.775818f, 45.94109f, 45.194817f, 46.17609f, 45.52282f);
                j.cubicTo(46.64909f, 46.227818f, 47.41309f, 46.653816f, 48.12709f, 47.076817f);
                j.cubicTo(53.09209f, 50.178818f, 58.05709f, 53.282818f, 63.02209f, 56.38582f);
                j.cubicTo(63.28809f, 56.554817f, 63.55409f, 56.727818f, 63.84309f, 56.859818f);
                j.cubicTo(65.46709f, 57.622818f, 66.85209f, 58.886818f, 67.75909f, 60.435818f);
                j.cubicTo(68.55409f, 61.778816f, 68.98609f, 63.333817f, 69.00009f, 64.89482f);
                j.cubicTo(69.00509f, 66.26182f, 69.00009f, 67.629814f, 69.00209f, 68.99782f);
                j.lineTo(7.00209f, 68.99782f);
                j.cubicTo(7.0030904f, 67.629814f, 7.00009f, 66.26282f, 7.0030904f, 64.89582f);
                j.cubicTo(7.02009f, 63.070816f, 7.6100903f, 61.257816f, 8.67409f, 59.77482f);
                j.cubicTo(9.61409f, 58.44082f, 10.93609f, 57.39882f, 12.41909f, 56.73082f);
                j.cubicTo(17.53709f, 53.547817f, 22.64309f, 50.34282f, 27.75709f, 47.151817f);
                j.cubicTo(28.44409f, 46.72582f, 29.13409f, 46.276817f, 29.67609f, 45.66882f);
                j.cubicTo(29.89009f, 45.43382f, 30.04109f, 45.12882f, 30.00409f, 44.80282f);
                j.cubicTo(29.96309f, 44.109818f, 30.13109f, 43.354816f, 29.76709f, 42.722816f);
                j.cubicTo(29.33409f, 41.951817f, 28.61309f, 41.41382f, 27.98509f, 40.812817f);
                j.cubicTo(25.50909f, 38.44882f, 23.77509f, 35.36482f, 22.84109f, 32.083817f);
                j.cubicTo(21.23609f, 26.404818f, 21.92609f, 20.047817f, 24.97509f, 14.964818f);
                j.cubicTo(26.53409f, 12.374818f, 28.72209f, 10.126818f, 31.39809f, 8.691818f);
                j.lineTo(31.39809f, 8.691818f);
                j.close();
                j.moveTo(32.60309f, 12.600818f);
                j.cubicTo(30.362091f, 14.013818f, 28.66709f, 16.180819f, 27.57309f, 18.573818f);
                j.cubicTo(26.03009f, 21.970818f, 25.64209f, 25.850819f, 26.33309f, 29.506817f);
                j.cubicTo(26.91309f, 32.527817f, 28.27609f, 35.44182f, 30.44509f, 37.646816f);
                j.cubicTo(31.00609f, 38.229816f, 31.64609f, 38.726818f, 32.28809f, 39.216816f);
                j.cubicTo(33.37609f, 40.061817f, 34.01609f, 41.430817f, 34.00709f, 42.804817f);
                j.cubicTo(33.99409f, 43.903816f, 34.01009f, 45.00382f, 33.99809f, 46.103817f);
                j.cubicTo(33.99009f, 46.929817f, 33.70109f, 47.74482f, 33.20409f, 48.402817f);
                j.cubicTo(32.44209f, 49.431816f, 31.28609f, 50.03882f, 30.23509f, 50.722816f);
                j.cubicTo(25.13109f, 53.958817f, 20.03509f, 57.208817f, 14.89909f, 60.394817f);
                j.cubicTo(14.11409f, 60.902817f, 13.250091f, 61.312817f, 12.58909f, 61.98882f);
                j.cubicTo(11.78909f, 62.76782f, 11.26609f, 63.865818f, 11.32609f, 64.99582f);
                j.cubicTo(29.11009f, 64.99782f, 46.895092f, 65.00082f, 64.67909f, 64.99482f);
                j.cubicTo(64.69909f, 63.208817f, 63.388092f, 61.726818f, 61.91009f, 60.889816f);
                j.cubicTo(56.12909f, 57.32182f, 50.40809f, 53.660816f, 44.67009f, 50.02482f);
                j.cubicTo(43.64909f, 49.38482f, 42.66309f, 48.549816f, 42.24309f, 47.38382f);
                j.cubicTo(41.95709f, 46.65682f, 42.00109f, 45.86482f, 42.00209f, 45.09982f);
                j.cubicTo(42.00009f, 44.33082f, 42.006092f, 43.562817f, 41.99709f, 42.79382f);
                j.cubicTo(41.99609f, 41.66282f, 42.42509f, 40.53182f, 43.19409f, 39.699818f);
                j.cubicTo(43.63009f, 39.223816f, 44.18409f, 38.88382f, 44.67109f, 38.466816f);
                j.cubicTo(46.65009f, 36.806816f, 48.08309f, 34.55882f, 48.95309f, 32.139816f);
                j.cubicTo(50.31809f, 28.298819f, 50.35109f, 23.998817f, 49.05009f, 20.136818f);
                j.cubicTo(48.12509f, 17.408817f, 46.48509f, 14.871818f, 44.16809f, 13.127818f);
                j.cubicTo(42.51209f, 11.878818f, 40.49209f, 11.086818f, 38.41109f, 11.009818f);
                j.cubicTo(36.36909f, 10.913817f, 34.32209f, 11.506818f, 32.60309f, 12.600818f);
                j.lineTo(32.60309f, 12.600818f);
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
