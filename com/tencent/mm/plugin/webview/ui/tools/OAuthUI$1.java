package com.tencent.mm.plugin.webview.ui.tools;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

class OAuthUI$1 implements OnMenuItemClickListener {
    final /* synthetic */ OAuthUI pVZ;

    OAuthUI$1(OAuthUI oAuthUI) {
        this.pVZ = oAuthUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.pVZ.finish();
        return true;
    }
}
