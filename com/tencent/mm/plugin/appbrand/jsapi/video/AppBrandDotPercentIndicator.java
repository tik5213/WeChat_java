package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.mm.plugin.appbrand.s.f;
import com.tencent.mm.plugin.appbrand.s.h;
import com.tencent.mm.sdk.platformtools.x;

public class AppBrandDotPercentIndicator extends LinearLayout {
    private LayoutInflater Bc;
    private int fZR;

    public AppBrandDotPercentIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    public AppBrandDotPercentIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    private void init(Context context) {
        this.Bc = LayoutInflater.from(context);
    }

    public void setDotsNum(int i) {
        if (i <= 1) {
            i = 8;
        }
        this.fZR = i;
        removeAllViews();
        for (int i2 = 0; i2 < this.fZR; i2++) {
            addView((ImageView) this.Bc.inflate(h.app_brand_dot_percent_indicator_dot, this, false));
        }
    }

    public void setPercent(float f) {
        float f2 = 1.0f;
        float f3 = 0.0f;
        if (f >= 0.0f) {
            f3 = f;
        }
        if (f3 <= 1.0f) {
            f2 = f3;
        }
        x.v("MicroMsg.AppBrandDotPercentIndicator", "setPercent percent:%s dotsOnNum:%d", new Object[]{Float.valueOf(f2), Integer.valueOf((int) Math.rint((double) (((float) this.fZR) * f2)))});
        int i = 0;
        while (i < r3 && i < getChildCount()) {
            ((ImageView) getChildAt(i)).setImageResource(f.app_brand_dot_percent_indicator_dot_on_shape);
            i++;
        }
        while (i < getChildCount()) {
            ((ImageView) getChildAt(i)).setImageResource(f.app_brand_dot_percent_indicator_dot_off_shape);
            i++;
        }
    }
}
