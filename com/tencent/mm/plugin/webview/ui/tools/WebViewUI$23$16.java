package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.mm.plugin.webview.ui.tools.WebViewUI.23;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d.6;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.i.a;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns;
import java.util.HashMap;
import java.util.Map;

class WebViewUI$23$16 implements Runnable {
    final /* synthetic */ 23 pZM;
    final /* synthetic */ boolean pZV;

    WebViewUI$23$16(23 23, boolean z) {
        this.pZM = 23;
        this.pZV = z;
    }

    public final void run() {
        if (this.pZM.pZJ.pNV != null) {
            d dVar = this.pZM.pZJ.pNV;
            boolean z = this.pZV;
            if (dVar.qhq) {
                x.i("MicroMsg.JsApiHandler", "onWXDeviceLanStateChange: state = %s", new Object[]{Boolean.valueOf(z)});
                Map hashMap = new HashMap();
                if (z) {
                    hashMap.put(DownloadInfoColumns.STATE, "on");
                } else {
                    hashMap.put(DownloadInfoColumns.STATE, "off");
                }
                ah.A(new 6(dVar, a.a("onWXDeviceLanStateChange", hashMap, dVar.qhs, dVar.qht)));
                return;
            }
            x.e("MicroMsg.JsApiHandler", "onWXDeviceLanStateChange fail, not ready");
        }
    }
}
