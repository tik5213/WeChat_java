package com.tencent.xweb.x5;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.smtt.sdk.WebViewCallbackClient;
import com.tencent.xweb.o;

public class a$f implements WebViewCallbackClient {
    o vDv;

    public a$f(o oVar) {
        this.vDv = oVar;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent, View view) {
        if (this.vDv != null) {
            return this.vDv.z(motionEvent);
        }
        return false;
    }

    public final boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, View view) {
        if (this.vDv != null) {
            return this.vDv.b(i, i2, i3, i4, i5, i6, i7, i8, z);
        }
        return false;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent, View view) {
        if (this.vDv != null) {
            return this.vDv.A(motionEvent);
        }
        return false;
    }

    public final void computeScroll(View view) {
        if (this.vDv != null) {
            this.vDv.akr();
        }
    }

    public final void onOverScrolled(int i, int i2, boolean z, boolean z2, View view) {
        if (this.vDv != null) {
            this.vDv.c(i, i2, z, z2);
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent, View view) {
        if (this.vDv != null) {
            return this.vDv.B(motionEvent);
        }
        return false;
    }

    public final void onScrollChanged(int i, int i2, int i3, int i4, View view) {
        if (this.vDv != null) {
            this.vDv.onScrollChanged(i, i2, i3, i4, view);
        }
    }

    public final void invalidate() {
    }
}
