package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class ThrowBottleFooter extends LinearLayout {
    private a hnc;

    public ThrowBottleFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.hnc != null) {
            this.hnc.auE();
        }
    }

    public void setOnLayoutChangeListener(a aVar) {
        this.hnc = aVar;
    }
}
