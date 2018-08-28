package com.tencent.mm.plugin.appbrand.canvas.a;

import android.graphics.Canvas;
import android.graphics.Paint.Cap;
import com.tencent.mm.plugin.appbrand.canvas.f;
import org.json.JSONArray;

public final class x implements d {
    public final String getMethod() {
        return "setLineCap";
    }

    public final boolean a(f fVar, Canvas canvas, JSONArray jSONArray) {
        if (jSONArray.length() <= 0) {
            return false;
        }
        String optString = jSONArray.optString(0);
        if ("butt".equalsIgnoreCase(optString)) {
            fVar.fng.setStrokeCap(Cap.BUTT);
            fVar.fnf.setStrokeCap(Cap.BUTT);
        } else if ("round".equalsIgnoreCase(optString)) {
            fVar.fng.setStrokeCap(Cap.ROUND);
            fVar.fnf.setStrokeCap(Cap.ROUND);
        } else if ("square".equalsIgnoreCase(optString)) {
            fVar.fng.setStrokeCap(Cap.SQUARE);
            fVar.fnf.setStrokeCap(Cap.SQUARE);
        }
        return true;
    }
}
