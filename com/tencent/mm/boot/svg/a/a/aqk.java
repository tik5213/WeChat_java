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

public final class aqk extends c {
    private final int height = 70;
    private final int width = 120;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 120;
            case 1:
                return 70;
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
                i2 = c.a(i3, looper);
                i2.setStrokeWidth(1.0f);
                canvas.saveLayerAlpha(null, 153, 4);
                i2 = c.a(i2, looper);
                i2.setColor(-9473160);
                i2.setStrokeWidth(5.0f);
                canvas.save();
                i2 = c.a(i2, looper);
                Path j = c.j(looper);
                j.moveTo(24.0f, 17.0f);
                j.lineTo(60.0f, 53.0f);
                j.lineTo(96.0f, 17.0f);
                WeChatSVGRenderC2Java.setFillType(j, 1);
                canvas.drawPath(j, i2);
                canvas.restore();
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}
