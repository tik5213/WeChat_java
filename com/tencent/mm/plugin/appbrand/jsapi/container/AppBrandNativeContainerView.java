package com.tencent.mm.plugin.appbrand.jsapi.container;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.p;

public class AppBrandNativeContainerView extends FrameLayout implements p {
    public boolean fPF;

    public AppBrandNativeContainerView(Context context) {
        super(context);
    }

    public AppBrandNativeContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AppBrandNativeContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setFullscreenWithChild(boolean z) {
        this.fPF = z;
    }
}
