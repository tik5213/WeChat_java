package com.tencent.mm.ui.chatting;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

class ResourcesExceedUI$1 implements OnMenuItemClickListener {
    final /* synthetic */ ResourcesExceedUI tMI;

    ResourcesExceedUI$1(ResourcesExceedUI resourcesExceedUI) {
        this.tMI = resourcesExceedUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.tMI.finish();
        return true;
    }
}
