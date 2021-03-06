package com.tencent.mm.plugin.appbrand.launching.precondition;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;

public final class f extends ContextWrapper implements h {
    public final /* bridge */ /* synthetic */ Context getBaseContext() {
        return (AppBrandLaunchProxyUI) super.getBaseContext();
    }

    public f(AppBrandLaunchProxyUI appBrandLaunchProxyUI) {
        super(appBrandLaunchProxyUI);
    }

    public final void w(Intent intent) {
        e up = e.up(intent.getStringExtra("extra_entry_token"));
        if (up == null) {
            ((AppBrandLaunchProxyUI) super.getBaseContext()).finish();
        } else {
            up.setBaseContext((AppBrandLaunchProxyUI) super.getBaseContext());
        }
    }

    public final void onResume() {
    }

    public final void onPause() {
    }
}
