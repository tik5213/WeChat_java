package com.tencent.mm.ui.base;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import com.tencent.mm.ui.widget.DrawedCallBackLinearLayout;

public class OnLayoutChangedLinearLayout extends DrawedCallBackLinearLayout {
    public a tAR;

    public OnLayoutChangedLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @TargetApi(11)
    public OnLayoutChangedLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setOnChattingLayoutChangedListener(a aVar) {
        this.tAR = aVar;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.tAR != null) {
            this.tAR.cqO();
        }
    }
}
