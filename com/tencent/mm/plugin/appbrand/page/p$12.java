package com.tencent.mm.plugin.appbrand.page;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.tencent.mm.plugin.appbrand.page.u.b;

class p$12 extends RelativeLayout {
    final /* synthetic */ p gnH;

    p$12(p pVar, Context context) {
        this.gnH = pVar;
        super(context);
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u uVar = this.gnH.gnq;
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        obtain.setSource(4098);
        for (b bVar : uVar.goM) {
            View view = (View) bVar.gpb.get();
            if (view != null) {
                view.dispatchTouchEvent(obtain);
            }
        }
        obtain.recycle();
    }
}
