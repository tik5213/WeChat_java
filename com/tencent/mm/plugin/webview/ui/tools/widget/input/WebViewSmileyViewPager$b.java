package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.support.v4.view.u;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.SoftReference;

class WebViewSmileyViewPager$b extends u {
    SparseArray<SoftReference<View>> gLf = new SparseArray();
    private boolean gLg = false;
    c qlL;

    WebViewSmileyViewPager$b() {
    }

    public final int k(Object obj) {
        if (this.gLg) {
            return -2;
        }
        return super.k(obj);
    }

    public final void notifyDataSetChanged() {
        this.gLg = true;
        super.notifyDataSetChanged();
        this.gLg = false;
    }

    public final int getCount() {
        return this.qlL.bYC().getPageCount();
    }

    public final boolean a(View view, Object obj) {
        return view == obj;
    }

    public final void a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final Object b(ViewGroup viewGroup, int i) {
        View view = null;
        if (this.gLf.get(i) != null) {
            view = (View) ((SoftReference) this.gLf.get(i)).get();
        }
        if (view == null) {
            Object mk = this.qlL.bYC().mk(i);
            if (mk != null) {
                viewGroup.addView(mk, 0);
                this.gLf.put(i, new SoftReference(mk));
                return mk;
            }
            x.e("MicroMsg.WebViewSmileyViewPagerAdapter", "contentView == null!");
            return mk;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        viewGroup.addView(view, 0);
        return view;
    }
}
