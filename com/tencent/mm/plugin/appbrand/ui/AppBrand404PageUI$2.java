package com.tencent.mm.plugin.appbrand.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;

class AppBrand404PageUI$2 implements OnMenuItemClickListener {
    final /* synthetic */ AppBrand404PageUI gtV;

    AppBrand404PageUI$2(AppBrand404PageUI appBrand404PageUI) {
        this.gtV = appBrand404PageUI;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        this.gtV.finish();
        return true;
    }
}
