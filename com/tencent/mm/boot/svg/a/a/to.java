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

public final class to extends c {
    private final int height = 46;
    private final int width = 66;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 66;
            case 1:
                return 46;
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
                i3 = c.a(i2, looper);
                i3.setColor(-4547478);
                canvas.save();
                Paint a = c.a(i3, looper);
                Path j = c.j(looper);
                j.moveTo(12.0f, 31.470589f);
                j.lineTo(12.0f, 46.0f);
                j.lineTo(66.0f, 46.0f);
                j.lineTo(66.0f, 0.0f);
                j.lineTo(12.0f, 0.0f);
                j.lineTo(12.0f, 14.529412f);
                j.lineTo(0.0f, 23.0f);
                j.lineTo(12.0f, 31.470589f);
                j.close();
                j.moveTo(27.0f, 29.0f);
                j.cubicTo(30.31371f, 29.0f, 33.0f, 26.31371f, 33.0f, 23.0f);
                j.cubicTo(33.0f, 19.68629f, 30.31371f, 17.0f, 27.0f, 17.0f);
                j.cubicTo(23.68629f, 17.0f, 21.0f, 19.68629f, 21.0f, 23.0f);
                j.cubicTo(21.0f, 26.31371f, 23.68629f, 29.0f, 27.0f, 29.0f);
                j.close();
                j.moveTo(51.0f, 29.0f);
                j.cubicTo(54.31371f, 29.0f, 57.0f, 26.31371f, 57.0f, 23.0f);
                j.cubicTo(57.0f, 19.68629f, 54.31371f, 17.0f, 51.0f, 17.0f);
                j.cubicTo(47.68629f, 17.0f, 45.0f, 19.68629f, 45.0f, 23.0f);
                j.cubicTo(45.0f, 26.31371f, 47.68629f, 29.0f, 51.0f, 29.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                i3 = c.a(i2, looper);
                i3.setColor(436207616);
                canvas.save();
                i2 = c.a(i3, looper);
                j = c.j(looper);
                j.moveTo(12.0f, 31.470589f);
                j.lineTo(12.0f, 46.0f);
                j.lineTo(66.0f, 46.0f);
                j.lineTo(66.0f, 0.0f);
                j.lineTo(12.0f, 0.0f);
                j.lineTo(12.0f, 14.529412f);
                j.lineTo(0.0f, 23.0f);
                j.lineTo(12.0f, 31.470589f);
                j.close();
                j.moveTo(27.0f, 29.0f);
                j.cubicTo(30.31371f, 29.0f, 33.0f, 26.31371f, 33.0f, 23.0f);
                j.cubicTo(33.0f, 19.68629f, 30.31371f, 17.0f, 27.0f, 17.0f);
                j.cubicTo(23.68629f, 17.0f, 21.0f, 19.68629f, 21.0f, 23.0f);
                j.cubicTo(21.0f, 26.31371f, 23.68629f, 29.0f, 27.0f, 29.0f);
                j.close();
                j.moveTo(51.0f, 29.0f);
                j.cubicTo(54.31371f, 29.0f, 57.0f, 26.31371f, 57.0f, 23.0f);
                j.cubicTo(57.0f, 19.68629f, 54.31371f, 17.0f, 51.0f, 17.0f);
                j.cubicTo(47.68629f, 17.0f, 45.0f, 19.68629f, 45.0f, 23.0f);
                j.cubicTo(45.0f, 26.31371f, 47.68629f, 29.0f, 51.0f, 29.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, i2);
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}
