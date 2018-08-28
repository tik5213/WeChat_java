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

public final class cy extends c {
    private final int height = 80;
    private final int width = 80;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 80;
            case 1:
                return 80;
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
                Paint a = c.a(i2, looper);
                a.setColor(-1);
                canvas.save();
                e = c.a(e, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 16.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                canvas.save();
                i2 = c.a(a, looper);
                Path j = c.j(looper);
                j.moveTo(0.0f, 0.0f);
                j.lineTo(5.773585f, 0.0f);
                j.lineTo(21.169811f, 47.908745f);
                j.lineTo(15.396226f, 47.908745f);
                j.lineTo(0.0f, 0.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, i2);
                canvas.restore();
                canvas.save();
                i2 = c.a(a, looper);
                j = c.j(looper);
                j.moveTo(30.792452f, 0.0f);
                j.lineTo(36.566036f, 0.0f);
                j.lineTo(51.962265f, 47.908745f);
                j.lineTo(46.18868f, 47.908745f);
                j.lineTo(30.792452f, 0.0f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, i2);
                canvas.restore();
                canvas.save();
                Paint a2 = c.a(a, looper);
                e = c.a(e, -1.0f, 0.0f, 51.962265f, 0.0f, 1.0f, 0.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                Path j2 = c.j(looper);
                j2.moveTo(15.396226f, 0.0f);
                j2.lineTo(21.169811f, 0.0f);
                j2.lineTo(36.566036f, 47.908745f);
                j2.lineTo(30.792452f, 47.908745f);
                j2.lineTo(15.396226f, 0.0f);
                j2.close();
                WeChatSVGRenderC2Java.setFillType(j2, 2);
                canvas.drawPath(j2, a2);
                canvas.restore();
                canvas.save();
                a = c.a(a, looper);
                e = c.a(e, -1.0f, 0.0f, 113.54717f, 0.0f, 1.0f, 0.0f);
                f.reset();
                f.setValues(e);
                canvas.concat(f);
                Path j3 = c.j(looper);
                j3.moveTo(46.18868f, 0.0f);
                j3.lineTo(51.962265f, 0.0f);
                j3.lineTo(67.35849f, 47.908745f);
                j3.lineTo(61.584908f, 47.908745f);
                j3.lineTo(46.18868f, 0.0f);
                j3.close();
                WeChatSVGRenderC2Java.setFillType(j3, 2);
                canvas.drawPath(j3, a);
                canvas.restore();
                canvas.restore();
                c.h(looper);
                break;
        }
        return 0;
    }
}
