package com.tencent.mm.plugin.account.bind.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class AutoBottomScrollView extends ScrollView {
    public AutoBottomScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AutoBottomScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        postDelayed(new 1(this), 100);
    }
}
