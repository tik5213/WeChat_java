package com.tencent.mm.plugin.account.ui;

import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.ab;
import com.tencent.mm.sdk.platformtools.al.a;

class FacebookFriendUI$9 implements a {
    final /* synthetic */ FacebookFriendUI eQm;
    final /* synthetic */ ab eQo;

    FacebookFriendUI$9(FacebookFriendUI facebookFriendUI, ab abVar) {
        this.eQm = facebookFriendUI;
        this.eQo = abVar;
    }

    public final boolean vD() {
        g.Ei().DT().set(65829, Integer.valueOf(1));
        g.DF().a(this.eQo, 0);
        return false;
    }
}
