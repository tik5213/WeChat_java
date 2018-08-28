package com.tencent.mm.plugin.ipcall.ui;

import android.support.v4.view.u;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.LinkedList;

public class i$b extends u {
    OnClickListener kyW;
    LinkedList<Integer> kzb;
    ArrayList<View> kzc = new ArrayList();
    final /* synthetic */ i kzd;
    int mCount = 0;

    public i$b(i iVar) {
        this.kzd = iVar;
    }

    public final int getCount() {
        return this.mCount;
    }

    public final boolean a(View view, Object obj) {
        return view == obj;
    }

    public final void a(ViewGroup viewGroup, int i, Object obj) {
        x.v("MicroMsg.IPCallShareDialog", "destroy item: %d", new Object[]{Integer.valueOf(i)});
        viewGroup.removeView((View) obj);
    }

    public final Object b(ViewGroup viewGroup, int i) {
        View view;
        if (this.kzc.get(i) != null) {
            view = (View) this.kzc.get(i);
        } else {
            view = null;
        }
        if (view != null) {
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.addView(view, 0);
            }
        }
        return view;
    }

    public final int k(Object obj) {
        return super.k(obj);
    }
}
