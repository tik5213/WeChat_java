package com.tencent.mm.ui.base;

import com.tencent.mm.ui.base.MMViewPager.a;

class MMViewPager$h extends a {
    float[] jFk = new float[9];
    final /* synthetic */ MMViewPager tyS;

    public MMViewPager$h(MMViewPager mMViewPager) {
        this.tyS = mMViewPager;
        super(mMViewPager);
    }

    public final void play() {
        MMViewPager.c(this.tyS).post(new 1(this));
    }
}
