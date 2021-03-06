package com.tencent.xweb.x5;

import android.content.Context;
import com.tencent.smtt.sdk.X5JsCore;
import com.tencent.smtt.utils.TbsLog;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.c;
import com.tencent.xweb.c.b;
import com.tencent.xweb.c.h;
import com.tencent.xweb.c.i.a;
import com.tencent.xweb.x5.sdk.d;
import com.tencent.xweb.x5.sdk.e;
import com.tencent.xweb.x5.sdk.f;
import com.tencent.xweb.x5.sdk.g;
import com.tencent.xweb.x5.sdk.i;
import org.xwalk.core.Log;
import org.xwalk.core.WebViewExtensionListener;

public class X5WebFactory implements a {
    private static final String TAG = "MicroMsg.X5WebFactory";
    static X5WebFactory sInstance;

    public static X5WebFactory getInstance() {
        if (sInstance == null) {
            sInstance = new X5WebFactory();
        }
        return sInstance;
    }

    private X5WebFactory() {
    }

    public Object excute(String str, Object[] objArr) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        if (str.equals("STR_CMD_GET_TBS_QBSDK_IMP")) {
            return new e();
        }
        if (str.equals("STR_CMD_GET_TBS_DOWNLOADER_IMP")) {
            return new g();
        }
        return null;
    }

    public h createWebView(WebView webView) {
        return new j(webView);
    }

    public void initInterface() {
        d.a(new e());
        f.a(new g());
        WebView.setX5Interface(new i());
    }

    public void initEnviroment(Context context) {
        TbsLog.setTbsLogClient(new a(this, context));
    }

    public com.tencent.xweb.c.g getJsCore(com.tencent.xweb.g.a aVar, Context context) {
        com.tencent.xweb.c.g gVar = null;
        switch (aVar) {
            case RT_TYPE_X5:
                boolean canUseX5JsCore = X5JsCore.canUseX5JsCore(context);
                Log.i(TAG, "canUseX5JsCore : " + canUseX5JsCore);
                if (canUseX5JsCore) {
                    if (X5JsCore.canUseX5JsCoreNewAPI(context)) {
                        gVar = new h(context);
                    } else {
                        gVar = new f(context);
                    }
                    gVar.init(0);
                    break;
                }
                break;
        }
        return gVar;
    }

    public boolean initWebviewCore(Context context, c cVar) {
        b.a(context, cVar);
        return true;
    }

    public void initCallback(WebViewExtensionListener webViewExtensionListener) {
    }

    public boolean hasInited() {
        return b.hasInited();
    }

    public boolean hasInitedCallback() {
        return true;
    }

    public boolean isCoreReady() {
        return b.isCoreReady();
    }

    public b.a getCookieManager() {
        return new d();
    }

    public b.b getCookieSyncManager() {
        return new e();
    }
}
