package com.tencent.mm.plugin.webview.stub;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.v.a;
import com.tencent.mm.sdk.platformtools.x;

class WebViewStubService$8 implements a {
    final /* synthetic */ WebViewStubService pUR;

    WebViewStubService$8(WebViewStubService webViewStubService) {
        this.pUR = webViewStubService;
    }

    public final int a(int i, int i2, String str, b bVar, l lVar) {
        x.i("MicroMsg.WebViewStubService", "ServiceClick CGI return, errType = %d, errCode = %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        if (!(i == 0 && i2 == 0)) {
            x.e("MicroMsg.WebViewStubService", "ServiceClick CGI fail, errType = %d, errCode = %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        }
        return 0;
    }
}
