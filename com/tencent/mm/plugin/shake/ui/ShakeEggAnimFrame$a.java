package com.tencent.mm.plugin.shake.ui;

import android.view.View;
import android.view.animation.Animation;

abstract class ShakeEggAnimFrame$a extends Animation {
    protected int duration = 100;
    final /* synthetic */ ShakeEggAnimFrame mZl;
    View targetView;

    ShakeEggAnimFrame$a(ShakeEggAnimFrame shakeEggAnimFrame) {
        this.mZl = shakeEggAnimFrame;
    }
}
