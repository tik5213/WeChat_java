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

public final class lv extends c {
    private final int height = 117;
    private final int width = 117;

    protected final int b(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 117;
            case 1:
                return 117;
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
                i3 = c.a(i3, looper);
                i3.setStrokeWidth(1.0f);
                Paint a = c.a(i3, looper);
                a.setStrokeWidth(6.0f);
                canvas.save();
                Paint a2 = c.a(a, looper);
                a2.setColor(-16139513);
                Path j = c.j(looper);
                j.moveTo(3.0f, 58.5f);
                j.cubicTo(3.0f, 27.848194f, 27.848194f, 3.0f, 58.5f, 3.0f);
                j.lineTo(58.5f, 3.0f);
                j.cubicTo(89.15181f, 3.0f, 114.0f, 27.848194f, 114.0f, 58.5f);
                j.lineTo(114.0f, 58.5f);
                j.cubicTo(114.0f, 89.15181f, 89.15181f, 114.0f, 58.5f, 114.0f);
                j.lineTo(58.5f, 114.0f);
                j.cubicTo(27.848194f, 114.0f, 3.0f, 89.15181f, 3.0f, 58.5f);
                j.lineTo(3.0f, 58.5f);
                j.close();
                canvas.drawPath(j, a2);
                canvas.restore();
                canvas.save();
                a = c.a(a, looper);
                a.setColor(419430400);
                j = c.j(looper);
                j.moveTo(3.0f, 58.5f);
                j.cubicTo(3.0f, 27.848194f, 27.848194f, 3.0f, 58.5f, 3.0f);
                j.lineTo(58.5f, 3.0f);
                j.cubicTo(89.15181f, 3.0f, 114.0f, 27.848194f, 114.0f, 58.5f);
                j.lineTo(114.0f, 58.5f);
                j.cubicTo(114.0f, 89.15181f, 89.15181f, 114.0f, 58.5f, 114.0f);
                j.lineTo(58.5f, 114.0f);
                j.cubicTo(27.848194f, 114.0f, 3.0f, 89.15181f, 3.0f, 58.5f);
                j.lineTo(3.0f, 58.5f);
                j.close();
                canvas.drawPath(j, a);
                canvas.restore();
                i3 = c.a(i2, looper);
                i3.setColor(-16139513);
                canvas.save();
                a = c.a(i3, looper);
                j = c.j(looper);
                j.moveTo(66.90184f, 87.84637f);
                j.lineTo(61.993694f, 82.93822f);
                j.cubicTo(67.705605f, 76.6448f, 71.20168f, 68.19263f, 71.20168f, 58.899788f);
                j.cubicTo(71.20168f, 49.63003f, 67.722946f, 41.196777f, 62.03622f, 34.908302f);
                j.lineTo(66.94452f, 30.0f);
                j.cubicTo(73.8277f, 37.557686f, 78.04291f, 47.721935f, 78.04291f, 58.899788f);
                j.cubicTo(78.04291f, 70.10072f, 73.810265f, 80.28387f, 66.90184f, 87.84637f);
                j.close();
                j.moveTo(55.513187f, 76.45771f);
                j.lineTo(50.604183f, 71.548706f);
                j.cubicTo(53.81384f, 68.347855f, 55.808926f, 63.863693f, 55.808926f, 58.899788f);
                j.cubicTo(55.808926f, 53.958973f, 53.83236f, 49.49345f, 50.6489f, 46.295624f);
                j.lineTo(55.557533f, 41.386986f);
                j.cubicTo(59.93729f, 45.85434f, 62.65015f, 52.050896f, 62.65015f, 58.899788f);
                j.cubicTo(62.65015f, 65.77177f, 59.918972f, 71.98701f, 55.513187f, 76.45771f);
                j.close();
                j.moveTo(44.464256f, 65.40878f);
                j.cubicTo(46.18042f, 63.798565f, 47.25739f, 61.47866f, 47.25739f, 58.899788f);
                j.cubicTo(47.25739f, 56.34403f, 46.19964f, 54.04262f, 44.510254f, 52.43427f);
                j.lineTo(38.0f, 58.944523f);
                j.lineTo(44.464256f, 65.40878f);
                j.close();
                WeChatSVGRenderC2Java.setFillType(j, 2);
                canvas.drawPath(j, a);
                canvas.restore();
                i3 = c.a(i2, looper);
                i3.setColor(419430400);
                canvas.save();
                i2 = c.a(i3, looper);
                j = c.j(looper);
                j.moveTo(66.90184f, 87.84637f);
                j.lineTo(61.993694f, 82.93822f);
                j.cubicTo(67.705605f, 76.6448f, 71.20168f, 68.19263f, 71.20168f, 58.899788f);
                j.cubicTo(71.20168f, 49.63003f, 67.722946f, 41.196777f, 62.03622f, 34.908302f);
                j.lineTo(66.94452f, 30.0f);
                j.cubicTo(73.8277f, 37.557686f, 78.04291f, 47.721935f, 78.04291f, 58.899788f);
                j.cubicTo(78.04291f, 70.10072f, 73.810265f, 80.28387f, 66.90184f, 87.84637f);
                j.close();
                j.moveTo(55.513187f, 76.45771f);
                j.lineTo(50.604183f, 71.548706f);
                j.cubicTo(53.81384f, 68.347855f, 55.808926f, 63.863693f, 55.808926f, 58.899788f);
                j.cubicTo(55.808926f, 53.958973f, 53.83236f, 49.49345f, 50.6489f, 46.295624f);
                j.lineTo(55.557533f, 41.386986f);
                j.cubicTo(59.93729f, 45.85434f, 62.65015f, 52.050896f, 62.65015f, 58.899788f);
                j.cubicTo(62.65015f, 65.77177f, 59.918972f, 71.98701f, 55.513187f, 76.45771f);
                j.close();
                j.moveTo(44.464256f, 65.40878f);
                j.cubicTo(46.18042f, 63.798565f, 47.25739f, 61.47866f, 47.25739f, 58.899788f);
                j.cubicTo(47.25739f, 56.34403f, 46.19964f, 54.04262f, 44.510254f, 52.43427f);
                j.lineTo(38.0f, 58.944523f);
                j.lineTo(44.464256f, 65.40878f);
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
