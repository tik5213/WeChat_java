package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import org.xwalk.core.Log;

public final class c extends a {
    public c(Context context, View view, View view2, View view3, View view4, View view5, View view6, View view7, View view8, View view9) {
        super(context, view, view2, view3, view4, view5, view6, view7, view8, view9);
    }

    protected final void bXC() {
        Log.i("MicroMsg.FTS.SosAnimatorController", "search to init");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        if (this.qff[0][0] - ((float) this.qeU) >= 0.0f) {
            ofFloat.addUpdateListener(this.qfk);
        } else {
            ofFloat.addUpdateListener(this.qfl);
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.qfd, "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.qeY, "alpha", new float[]{0.0f, 1.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        animatorSet.setDuration(300);
        animatorSet.addListener(new 1(this));
        animatorSet.start();
    }

    protected final void bXD() {
        Log.i("MicroMsg.FTS.SosAnimatorController", "init to search");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        if (this.qff[0][0] - ((float) this.qeU) >= 0.0f) {
            ofFloat.addUpdateListener(this.qfi);
        } else {
            ofFloat.addUpdateListener(this.qfj);
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.qfd, "alpha", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.qeY, "alpha", new float[]{1.0f, 0.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        animatorSet.setDuration(300);
        animatorSet.addListener(new 2(this));
        animatorSet.start();
    }

    protected final boolean bXE() {
        return false;
    }
}
