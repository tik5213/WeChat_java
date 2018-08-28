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
import com.tencent.smtt.sdk.WebView;

public final class bx extends c {
    private final int height = 180;
    private final int width = 180;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 180;
            case 1:
                return 180;
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
                i2.setColor(WebView.NIGHT_MODE_COLOR);
                i3.setStrokeWidth(1.0f);
                i3.setStrokeCap(Cap.BUTT);
                i3.setStrokeJoin(Join.MITER);
                i3.setStrokeMiter(4.0f);
                i3.setPathEffect(null);
                c.a(i3, looper).setStrokeWidth(1.0f);
                canvas.save();
                i3 = c.a(i2, looper);
                i3.setColor(-13917627);
                Path j = c.j(looper);
                j.moveTo(0.0f, 0.0f);
                j.lineTo(180.0f, 0.0f);
                j.lineTo(180.0f, 180.0f);
                j.lineTo(0.0f, 180.0f);
                j.lineTo(0.0f, 0.0f);
                j.close();
                canvas.drawPath(j, i3);
                canvas.restore();
                canvas.save();
                Paint a = c.a(i2, looper);
                a.setColor(-1);
                Path j2 = c.j(looper);
                j2.moveTo(49.799175f, 34.8f);
                j2.cubicTo(48.142776f, 34.8f, 46.8f, 36.136326f, 46.8f, 37.79583f);
                j2.lineTo(46.8f, 142.20418f);
                j2.cubicTo(46.8f, 143.85872f, 48.139797f, 145.2f, 49.799175f, 145.2f);
                j2.lineTo(130.20082f, 145.2f);
                j2.cubicTo(131.85722f, 145.2f, 133.2f, 143.86368f, 133.2f, 142.20418f);
                j2.lineTo(133.2f, 37.79583f);
                j2.cubicTo(133.2f, 36.141277f, 131.8602f, 34.8f, 130.20082f, 34.8f);
                j2.lineTo(49.799175f, 34.8f);
                j2.close();
                j2.moveTo(88.8f, 84.0f);
                j2.lineTo(88.8f, 90.0f);
                j2.lineTo(57.6f, 90.0f);
                j2.lineTo(57.6f, 84.0f);
                j2.lineTo(88.8f, 84.0f);
                j2.close();
                j2.moveTo(108.0f, 67.2f);
                j2.lineTo(108.0f, 73.2f);
                j2.lineTo(57.6f, 73.2f);
                j2.lineTo(57.6f, 67.2f);
                j2.lineTo(108.0f, 67.2f);
                j2.close();
                j2.moveTo(122.4f, 51.6f);
                j2.lineTo(122.4f, 57.6f);
                j2.lineTo(57.6f, 57.6f);
                j2.lineTo(57.6f, 51.6f);
                j2.lineTo(122.4f, 51.6f);
                j2.close();
                WeChatSVGRenderC2Java.setFillType(j2, 2);
                canvas.drawPath(j2, a);
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}
