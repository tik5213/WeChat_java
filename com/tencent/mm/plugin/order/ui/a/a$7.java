package com.tencent.mm.plugin.order.ui.a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.plugin.order.model.MallOrderDetailObject.HelpCenter;
import com.tencent.mm.plugin.order.model.MallTransactionObject;

class a$7 implements OnClickListener {
    final /* synthetic */ MallTransactionObject lNC;
    final /* synthetic */ a lQe;
    final /* synthetic */ Context val$context;

    a$7(a aVar, Context context, MallTransactionObject mallTransactionObject) {
        this.lQe = aVar;
        this.val$context = context;
        this.lNC = mallTransactionObject;
    }

    public final void onClick(View view) {
        if (view.getTag() != null && (view.getTag() instanceof HelpCenter)) {
            a.a(this.val$context, ((HelpCenter) view.getTag()).url, this.lNC);
        }
    }
}
