package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tencent.mm.sdk.platformtools.x;

public class SnsAdNativeLandingPagesScrollView extends NestedScrollView {
    private int nRP = 0;
    private int nRQ = 0;
    private int nRR = 50;
    private an nRS = null;
    private long nRT = System.currentTimeMillis();
    private Runnable nRU = new 1(this);

    public SnsAdNativeLandingPagesScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SnsAdNativeLandingPagesScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setScrollViewListener(an anVar) {
        this.nRS = anVar;
    }

    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        x.w("SnsAdNativeLandingPagesScrollView", "onScrollChanged x %d,y %d,oldx %d,oldy %d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
    }

    public void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
    }

    public void scrollBy(int i, int i2) {
        super.scrollBy(i, i2);
    }

    public final void fling(int i) {
        super.fling(i / 3);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }
}
