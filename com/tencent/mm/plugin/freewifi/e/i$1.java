package com.tencent.mm.plugin.freewifi.e;

import com.tencent.mm.plugin.freewifi.a.a;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.sdk.platformtools.x;

class i$1 implements Runnable {
    final /* synthetic */ i jlb;
    final /* synthetic */ String val$url;

    i$1(i iVar, String str) {
        this.jlb = iVar;
        this.val$url = str;
    }

    public final void run() {
        x.i("MicroMsg.FreeWifi.Protocol33", "sessionKey=%s, step=%d, method=Protocol33.httpAuthentication, desc=it sends http request for authentication. http url=%s", new Object[]{m.E(this.jlb.intent), Integer.valueOf(m.F(this.jlb.intent)), this.val$url});
        a.aOj();
        a.a(this.val$url, new 1(this));
    }
}
