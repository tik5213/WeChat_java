package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class MMFrameLayout extends FrameLayout {
    private boolean tuE = false;

    public MMFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            int i6 = i5;
            if (this.tuE || i6 >= childCount) {
                this.tuE = true;
                super.onLayout(z, i, i2, i3, i4);
            } else {
                View childAt = getChildAt(i6);
                if (childAt != null) {
                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                    if (layoutParams.gravity == -1) {
                        layoutParams.gravity = 51;
                        childAt.setLayoutParams(layoutParams);
                    }
                }
                i5 = i6 + 1;
            }
        }
        this.tuE = true;
        super.onLayout(z, i, i2, i3, i4);
    }
}
