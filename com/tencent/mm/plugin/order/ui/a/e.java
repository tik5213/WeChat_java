package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.ui.base.preference.Preference;

public final class e extends Preference {
    public String lQl;
    public OnClickListener mOnClickListener = null;
    private View mView = null;

    public e(Context context) {
        super(context);
        setLayoutResource(g.mall_order_button_pref);
    }

    public final View getView(View view, ViewGroup viewGroup) {
        if (this.mView == null) {
            this.mView = onCreateView(viewGroup);
        }
        onBindView(this.mView);
        return this.mView;
    }

    protected final void onBindView(View view) {
        super.onBindView(view);
        TextView textView = (TextView) view.findViewById(f.mall_order_button_pref_btn);
        textView.setText(this.lQl);
        textView.setOnClickListener(this.mOnClickListener);
    }
}
