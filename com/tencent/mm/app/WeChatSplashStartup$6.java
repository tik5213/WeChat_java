package com.tencent.mm.app;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.splash.h;
import com.tencent.mm.vending.c.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class WeChatSplashStartup$6 implements a<Void, Void> {
    final /* synthetic */ WeChatSplashStartup bzp;

    WeChatSplashStartup$6(WeChatSplashStartup weChatSplashStartup) {
        this.bzp = weChatSplashStartup;
    }

    public final /* synthetic */ Object call(Object obj) {
        Iterator it = h.ckd().cVZ.iterator();
        while (it.hasNext()) {
            long[] jArr = (long[]) it.next();
            x.i("MicroMsg.WeChatSplashStartup", "splash %s, %s, %s", new Object[]{Long.valueOf(jArr[0]), Long.valueOf(jArr[1]), Long.valueOf(jArr[2])});
            com.tencent.mm.plugin.report.service.h.mEJ.a(jArr[0], jArr[1], jArr[2], false);
        }
        ArrayList arrayList = h.ckd().sNz;
        Map hashMap = new HashMap();
        String str = "NewSplash";
        hashMap.put("processName", WeChatSplashStartup.b(this.bzp));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            x.i("MicroMsg.WeChatSplashStartup", "splash message %s", new Object[]{(String) it2.next()});
            com.tencent.mm.plugin.report.service.h.mEJ.c(str, r0, hashMap);
        }
        x.i("MicroMsg.WeChatSplashStartup", "report splash info %s %s", new Object[]{Integer.valueOf(r9.size()), Integer.valueOf(arrayList.size())});
        return uQG;
    }
}
