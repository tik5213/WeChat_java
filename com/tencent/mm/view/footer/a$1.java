package com.tencent.mm.view.footer;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class a$1 implements AnimationListener {
    final /* synthetic */ a uUU;

    a$1(a aVar) {
        this.uUU = aVar;
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        this.uUU.setVisibility(0);
    }

    public final void onAnimationRepeat(Animation animation) {
    }
}
