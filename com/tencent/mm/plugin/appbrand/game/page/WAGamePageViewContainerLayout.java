package com.tencent.mm.plugin.appbrand.game.page;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.mm.sdk.platformtools.x;

public class WAGamePageViewContainerLayout extends FrameLayout {
    private b fCS;
    private a fCT;

    public WAGamePageViewContainerLayout(Context context) {
        this(context, null);
    }

    public WAGamePageViewContainerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public void setOnConfigurationChangedListener(a aVar) {
        this.fCT = aVar;
    }

    public WAGamePageViewContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.fCS = null;
        this.fCT = null;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getContext() instanceof Activity) {
            b bVar;
            switch (((Activity) getContext()).getWindowManager().getDefaultDisplay().getRotation()) {
                case 0:
                    bVar = b.fCV;
                    break;
                case 1:
                    bVar = b.fCW;
                    break;
                case 2:
                    bVar = b.fCX;
                    break;
                case 3:
                    bVar = b.fCY;
                    break;
                default:
                    x.e("MicroMsg.WAContainerView", "hy: invalid rotate: %d!", new Object[]{Integer.valueOf(((Activity) getContext()).getWindowManager().getDefaultDisplay().getRotation())});
                    bVar = b.fCU;
                    break;
            }
            if (this.fCT != null) {
                this.fCT.a(this.fCS, bVar);
            }
            this.fCS = bVar;
        }
    }
}
