package com.tencent.mm.plugin.mmsight.segment;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.k;

class RecyclerThumbSeekBar$5 extends k {
    final /* synthetic */ RecyclerThumbSeekBar llX;

    RecyclerThumbSeekBar$5(RecyclerThumbSeekBar recyclerThumbSeekBar) {
        this.llX = recyclerThumbSeekBar;
    }

    public final void e(RecyclerView recyclerView, int i) {
        if (i == 0 && RecyclerThumbSeekBar.p(this.llX) != null) {
            RecyclerThumbSeekBar.p(this.llX).K(this.llX.beM(), this.llX.beN());
        }
    }
}
