package com.tencent.mm.plugin.appbrand.jsapi.b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.os.Bundle;
import android.view.View;
import com.tencent.magicbrush.handler.image.MBCanvasContentHolder;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.mm.plugin.appbrand.canvas.h;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.q.f;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends com.tencent.mm.plugin.appbrand.jsapi.a {
    public static final int CTRL_INDEX = 100;
    public static final String NAME = "canvasToTempFilePath";

    static /* synthetic */ void a(a aVar, l lVar, JSONObject jSONObject, int i) {
        super.a(lVar, jSONObject, i);
        p d = d(lVar);
        if (d == null) {
            x.w("MicroMsg.JsApiCanvasToTempFilePath", "invoke JsApi insertView failed, current page view is null.");
            lVar.E(i, aVar.f("fail", null));
            return;
        }
        try {
            int i2 = jSONObject.getInt("canvasId");
            View lx = d.agU().lx(i2);
            if (lx == null) {
                x.w("MicroMsg.JsApiCanvasToTempFilePath", "get view by viewId(%s) return null.", new Object[]{Integer.valueOf(i2)});
                lVar.E(i, aVar.f("fail:get canvas by canvasId failed", null));
            } else if (lx instanceof CoverViewContainer) {
                View A = ((CoverViewContainer) lx).A(View.class);
                if (A == null) {
                    x.w("MicroMsg.JsApiCanvasToTempFilePath", "getTargetView return null, viewId(%s).", new Object[]{Integer.valueOf(i2)});
                    lVar.E(i, aVar.f("fail:target view is null.", null));
                    return;
                }
                int measuredWidth = A.getMeasuredWidth();
                int measuredHeight = A.getMeasuredHeight();
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Config.ARGB_8888);
                    float g = f.g(jSONObject, "x");
                    float g2 = f.g(jSONObject, "y");
                    float a = f.a(jSONObject, "width", (float) measuredWidth);
                    float a2 = f.a(jSONObject, "height", (float) measuredHeight);
                    float f = g + a > ((float) measuredWidth) ? ((float) measuredWidth) - g : a;
                    float f2 = g2 + a2 > ((float) measuredHeight) ? ((float) measuredHeight) - g2 : a2;
                    float optDouble = (float) jSONObject.optDouble("destWidth", (double) f);
                    float optDouble2 = (float) jSONObject.optDouble("destHeight", (double) f2);
                    if (g < 0.0f || g2 < 0.0f || f <= 0.0f || f2 <= 0.0f || g + f > ((float) measuredWidth) || g2 + f2 > ((float) measuredHeight) || optDouble <= 0.0f || optDouble2 <= 0.0f) {
                        x.e("MicroMsg.JsApiCanvasToTempFilePath", "illegal arguments(x : %s, y : %s, width : %s, height : %s) failed, viewId(%s).", new Object[]{Float.valueOf(g), Float.valueOf(g2), Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i2)});
                        lVar.E(i, aVar.f("fail:illegal arguments", null));
                        return;
                    }
                    Bitmap createBitmap2;
                    if (A instanceof com.tencent.mm.plugin.appbrand.canvas.widget.a) {
                        ((com.tencent.mm.plugin.appbrand.canvas.widget.a) A).d(new h(createBitmap));
                    } else {
                        A.draw(new h(createBitmap));
                    }
                    if (!(f == ((float) measuredWidth) && f2 == ((float) measuredHeight))) {
                        createBitmap2 = Bitmap.createBitmap(createBitmap, (int) g, (int) g2, (int) f, (int) f2, null, false);
                        createBitmap.recycle();
                        createBitmap = createBitmap2;
                    }
                    if (!(f == optDouble && f2 == optDouble2)) {
                        createBitmap2 = Bitmap.createScaledBitmap(createBitmap, (int) optDouble, (int) optDouble2, false);
                        createBitmap.recycle();
                        createBitmap = createBitmap2;
                    }
                    String genMediaFilePath = AppBrandLocalMediaObjectManager.genMediaFilePath(d.mAppId, "canvas_" + i2);
                    CompressFormat p = p(jSONObject);
                    try {
                        c.a(createBitmap, o(jSONObject), p, genMediaFilePath, true);
                        AppBrandLocalMediaObject attach = AppBrandLocalMediaObjectManager.attach(d.mAppId, genMediaFilePath, p == CompressFormat.JPEG ? "jpg" : "png", true);
                        if (attach == null) {
                            x.w("MicroMsg.JsApiCanvasToTempFilePath", "gen temp file failed, canvasId : %s.", new Object[]{Integer.valueOf(i2)});
                            lVar.E(i, aVar.f("fail:gen temp file failed", null));
                            return;
                        }
                        Map hashMap = new HashMap();
                        hashMap.put("tempFilePath", attach.bNH);
                        lVar.E(i, aVar.f("ok", hashMap));
                        x.v("MicroMsg.JsApiCanvasToTempFilePath", "save file(id : %s) to path : %s", new Object[]{attach.bNH, attach.dDG});
                    } catch (IOException e) {
                        x.w("MicroMsg.JsApiCanvasToTempFilePath", "save bitmap to file failed, viewId(%s). exception : %s", new Object[]{Integer.valueOf(i2), e});
                        lVar.E(i, aVar.f("fail:write file failed", null));
                    }
                } catch (Exception e2) {
                    x.w("MicroMsg.JsApiCanvasToTempFilePath", "create bitmap failed, viewId(%s). Exception : %s", new Object[]{Integer.valueOf(i2), e2});
                    lVar.E(i, aVar.f("fail:create bitmap failed", null));
                }
            } else {
                x.w("MicroMsg.JsApiCanvasToTempFilePath", "the view(%s) is not a instance of CoverViewContainer.", new Object[]{Integer.valueOf(i2)});
                lVar.E(i, aVar.f("fail:the view is not a instance of CoverViewContainer", null));
            }
        } catch (JSONException e3) {
            x.w("MicroMsg.JsApiCanvasToTempFilePath", "canvasId do not exist. exception : %s", new Object[]{e3});
            lVar.E(i, aVar.f("fail:canvasId do not exist", null));
        }
    }

    public final void a(l lVar, JSONObject jSONObject, int i) {
        com.tencent.mm.plugin.appbrand.r.c.Em().H(new 1(this, lVar, i, jSONObject));
    }

    public static com.tencent.mm.plugin.appbrand.jsapi.file.f.a a(p pVar, JSONObject jSONObject, boolean z) {
        try {
            int i = jSONObject.getInt("canvasId");
            Bundle bundle = new Bundle();
            bundle.putInt("canvasId", i);
            bundle.putBoolean("sync", z);
            MBCanvasContentHolder mBCanvasContentHolder = (MBCanvasContentHolder) pVar.a(3, bundle, new Object[0]);
            if (mBCanvasContentHolder == null || mBCanvasContentHolder.content == null) {
                x.w("MicroMsg.JsApiCanvasToTempFilePath", "get screenBitmap return null.");
                return new com.tencent.mm.plugin.appbrand.jsapi.file.f.a("fail:get bitmap failed", new Object[0]);
            }
            float width = (float) mBCanvasContentHolder.content.getWidth();
            float height = (float) mBCanvasContentHolder.content.getHeight();
            if (width == 0.0f || height == 0.0f) {
                x.e("MicroMsg.JsApiCanvasToTempFilePath", "illegal bitmap(screenWidth : %f, screenHeight : %f) failed, canvasId(%d).", new Object[]{Float.valueOf(width), Float.valueOf(height), Integer.valueOf(i)});
                return new com.tencent.mm.plugin.appbrand.jsapi.file.f.a("fail:illegal bitmap", new Object[0]);
            }
            float f;
            float f2;
            float f3;
            float f4;
            if (mBCanvasContentHolder.width == 0) {
                f = width;
            } else {
                f = (float) mBCanvasContentHolder.width;
            }
            if (mBCanvasContentHolder.height == 0) {
                f2 = height;
            } else {
                f2 = (float) mBCanvasContentHolder.height;
            }
            x.i("MicroMsg.JsApiCanvasToTempFilePath", "screenWidth:%f,screenHeight:%f,canvasWidth:%f,canvasHeight:%f", new Object[]{Float.valueOf(width), Float.valueOf(height), Float.valueOf(f), Float.valueOf(f2)});
            float optDouble = (float) jSONObject.optDouble("x", 0.0d);
            float optDouble2 = (float) jSONObject.optDouble("y", 0.0d);
            float optDouble3 = (float) jSONObject.optDouble("width", (double) f);
            float optDouble4 = (float) jSONObject.optDouble("height", (double) f2);
            x.i("MicroMsg.JsApiCanvasToTempFilePath", "x:%f,y:%f,width:%f,height:%f", new Object[]{Float.valueOf(optDouble), Float.valueOf(optDouble2), Float.valueOf(optDouble3), Float.valueOf(optDouble4)});
            if (f <= 0.0f || f2 <= 0.0f || (width == f && height == f2)) {
                f = optDouble4;
                f2 = optDouble3;
                f3 = optDouble;
            } else {
                if (optDouble > 0.0f) {
                    optDouble = (optDouble / f) * width;
                }
                if (optDouble2 > 0.0f) {
                    optDouble2 = (optDouble2 / f2) * height;
                }
                optDouble3 = (optDouble3 / f) * width;
                f = (optDouble4 / f2) * height;
                f2 = optDouble3;
                f3 = optDouble;
            }
            if (f3 + f2 > width) {
                f4 = width - f3;
            } else {
                f4 = f2;
            }
            if (optDouble2 + f > height) {
                optDouble = height - optDouble2;
            } else {
                optDouble = f;
            }
            float optDouble5 = (float) jSONObject.optDouble("destWidth", (double) f4);
            float optDouble6 = (float) jSONObject.optDouble("destHeight", (double) optDouble);
            x.i("MicroMsg.JsApiCanvasToTempFilePath", "x:%f,y:%f,screenWidth:%f,screenHeight:%f,width:%f,height:%f,imgWidth:%f,imgHeight:%f", new Object[]{Float.valueOf(f3), Float.valueOf(optDouble2), Float.valueOf(width), Float.valueOf(height), Float.valueOf(f4), Float.valueOf(optDouble), Float.valueOf(optDouble5), Float.valueOf(optDouble6)});
            if (f3 < 0.0f || optDouble2 < 0.0f || f4 <= 0.0f || optDouble <= 0.0f || f3 + f4 > width || optDouble2 + optDouble > height || optDouble5 <= 0.0f || optDouble6 <= 0.0f) {
                x.e("MicroMsg.JsApiCanvasToTempFilePath", "illegal arguments(x : %s, y : %s, width : %s, height : %s) failed, canvasId(%s).", new Object[]{Float.valueOf(f3), Float.valueOf(optDouble2), Float.valueOf(f4), Float.valueOf(optDouble), Integer.valueOf(i)});
                return new com.tencent.mm.plugin.appbrand.jsapi.file.f.a("fail:illegal arguments", new Object[0]);
            }
            Bitmap createBitmap;
            if (!(f4 == width && optDouble == height)) {
                createBitmap = Bitmap.createBitmap(mBCanvasContentHolder.content, (int) f3, (int) optDouble2, (int) f4, (int) optDouble, null, false);
                mBCanvasContentHolder.content.recycle();
                mBCanvasContentHolder.content = createBitmap;
            }
            if (!(f4 == optDouble5 && optDouble == optDouble6)) {
                createBitmap = Bitmap.createScaledBitmap(mBCanvasContentHolder.content, (int) optDouble5, (int) optDouble6, false);
                mBCanvasContentHolder.content.recycle();
                mBCanvasContentHolder.content = createBitmap;
            }
            String genMediaFilePath = AppBrandLocalMediaObjectManager.genMediaFilePath(pVar.mAppId, "canvas_" + i);
            CompressFormat p = p(jSONObject);
            try {
                c.a(mBCanvasContentHolder.content, o(jSONObject), p, genMediaFilePath, true);
                AppBrandLocalMediaObject attach = AppBrandLocalMediaObjectManager.attach(pVar.mAppId, genMediaFilePath, p == CompressFormat.JPEG ? "jpg" : "png", true);
                if (attach == null) {
                    x.w("MicroMsg.JsApiCanvasToTempFilePath", "gen temp file failed, canvasId : %s.", new Object[]{Integer.valueOf(i)});
                    return new com.tencent.mm.plugin.appbrand.jsapi.file.f.a("fail:gen temp file failed", new Object[0]);
                }
                Map hashMap = new HashMap();
                hashMap.put("tempFilePath", attach.bNH);
                x.v("MicroMsg.JsApiCanvasToTempFilePath", "save file(id : %s) to path : %s", new Object[]{attach.bNH, attach.dDG});
                return new com.tencent.mm.plugin.appbrand.jsapi.file.f.a("ok", new Object[0]).z(hashMap);
            } catch (IOException e) {
                x.w("MicroMsg.JsApiCanvasToTempFilePath", "save bitmap to file failed, viewId(%s). exception : %s", new Object[]{Integer.valueOf(i), e});
                return new com.tencent.mm.plugin.appbrand.jsapi.file.f.a("fail:write file failed", new Object[0]);
            }
        } catch (JSONException e2) {
            x.w("MicroMsg.JsApiCanvasToTempFilePath", "canvasId do not exist. exception : %s", new Object[]{e2});
            return new com.tencent.mm.plugin.appbrand.jsapi.file.f.a("fail:canvasId do not exist", new Object[0]);
        }
    }

    private static int o(JSONObject jSONObject) {
        float f = 0.0f;
        float optDouble = (float) jSONObject.optDouble("quality", 1.0d);
        if (optDouble >= 0.0f) {
            if (optDouble > 1.0f) {
                f = 100.0f;
            } else {
                f = optDouble * 100.0f;
            }
        }
        return (int) f;
    }

    private static CompressFormat p(JSONObject jSONObject) {
        CompressFormat compressFormat = CompressFormat.PNG;
        if ("jpg".equalsIgnoreCase(jSONObject.optString("fileType"))) {
            return CompressFormat.JPEG;
        }
        return compressFormat;
    }
}
