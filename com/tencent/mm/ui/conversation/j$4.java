package com.tencent.mm.ui.conversation;

import android.view.View;
import com.tencent.mm.ui.base.MMSlideDelView.c;

class j$4 implements c {
    final /* synthetic */ j ure;

    j$4(j jVar) {
        this.ure = jVar;
    }

    public final int cl(View view) {
        return j.d(this.ure).getPositionForView(view);
    }
}
