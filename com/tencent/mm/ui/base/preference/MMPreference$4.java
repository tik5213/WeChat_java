package com.tencent.mm.ui.base.preference;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

class MMPreference$4 implements OnScrollListener {
    final /* synthetic */ MMPreference tCP;

    MMPreference$4(MMPreference mMPreference) {
        this.tCP = mMPreference;
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (1 == i) {
            View currentFocus = this.tCP.getCurrentFocus();
            if (currentFocus != null) {
                currentFocus.clearFocus();
            }
        }
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
