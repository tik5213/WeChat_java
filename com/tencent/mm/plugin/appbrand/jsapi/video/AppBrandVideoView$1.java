package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.view.View;
import android.view.View.OnClickListener;

class AppBrandVideoView$1 implements OnClickListener {
    final /* synthetic */ AppBrandVideoView gaM;

    AppBrandVideoView$1(AppBrandVideoView appBrandVideoView) {
        this.gaM = appBrandVideoView;
    }

    public final void onClick(View view) {
        this.gaM.start();
    }
}
