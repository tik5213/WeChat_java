package com.tencent.mm.plugin.gallery.view;

import com.tencent.mm.plugin.gallery.view.MultiGestureImageView.a;
import com.tencent.mm.ui.base.MultiTouchImageView;

class MultiGestureImageView$h extends a {
    final /* synthetic */ MultiGestureImageView jFj;
    float[] jFk = new float[9];
    MultiTouchImageView jFl;

    public MultiGestureImageView$h(MultiGestureImageView multiGestureImageView, MultiTouchImageView multiTouchImageView) {
        this.jFj = multiGestureImageView;
        super(multiGestureImageView);
        this.jFl = multiTouchImageView;
    }

    public final void play() {
        MultiGestureImageView.h(this.jFj).getHandler().post(new 1(this));
    }
}
