package com.tencent.mm.plugin.account.friend.ui;

import com.tencent.mm.a.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.ao;
import com.tencent.mm.plugin.account.friend.a.ap;
import com.tencent.mm.plugin.account.friend.ui.e.1;
import com.tencent.mm.pluginsdk.ui.applet.a.a;
import com.tencent.mm.sdk.platformtools.x;

class e$1$2 implements a {
    final /* synthetic */ 1 eMH;

    e$1$2(1 1) {
        this.eMH = 1;
    }

    public final void a(boolean z, boolean z2, String str, String str2) {
        x.i("MicroMsg.QQFriendAdapter", "cpan ok:%b hasSendVerify:%b  username:%s gitemId:%s", new Object[]{Boolean.valueOf(z), Boolean.valueOf(z2), str, str2});
        long longValue = new o(o.cx(str2)).longValue();
        ao bK = ((ap) ((com.tencent.mm.plugin.account.a.a.a) g.n(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg()).bK(longValue);
        if (bK != null && z) {
            bK.username = str;
        }
        if (bK != null) {
            bK.dHO = 2;
            x.d("MicroMsg.QQFriendAdapter", "f :%s", new Object[]{bK.toString()});
            ((ap) ((com.tencent.mm.plugin.account.a.a.a) g.n(com.tencent.mm.plugin.account.a.a.a.class)).getQQListStg()).a(longValue, bK);
            this.eMH.eMG.WT();
        } else {
            x.w("MicroMsg.QQFriendAdapter", "cpan qq friend is null. qq:%s", new Object[]{str2});
        }
        if (z && bK != null) {
            e.pC(str);
        }
    }
}
