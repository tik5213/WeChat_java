package com.tencent.mm.plugin.qqmail.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.plugin.qqmail.b.p;
import com.tencent.mm.plugin.qqmail.stub.ReadMailProxy;
import com.tencent.mm.pluginsdk.ui.tools.s;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.xweb.WebView$b;
import com.tencent.xweb.b;

class ReadMailUI$14 implements OnMenuItemClickListener {
    final /* synthetic */ ReadMailUI miD;
    final /* synthetic */ WebView$b miK;

    ReadMailUI$14(ReadMailUI readMailUI, WebView$b webView$b) {
        this.miD = readMailUI;
        this.miK = webView$b;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        boolean booleanValue;
        String str = this.miK.mExtra;
        if (str.contains("qqmail.weixin.qq.com") && !str.contains("qqmail.weixin.qq.com:443")) {
            str = str.replace("qqmail.weixin.qq.com", "qqmail.weixin.qq.com:443");
        }
        String replaceFirst = str.replaceFirst("%p2p0", "%25p2p0");
        try {
            booleanValue = ((Boolean) new ReadMailProxy(ReadMailUI.l(this.miD), null).REMOTE_CALL("isSDCardAvailable", new Object[0])).booleanValue();
        } catch (Exception e) {
            x.w("MicroMsg.ReadMailUI", "createContextMenu, isSDCardAvailable, ex = %s", new Object[]{e.getMessage()});
            booleanValue = false;
        }
        s.a(this.miD, replaceFirst, b.cIi().getCookie(p.bor()), booleanValue);
        return true;
    }
}
