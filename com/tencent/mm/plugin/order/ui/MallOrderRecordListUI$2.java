package com.tencent.mm.plugin.order.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.mm.plugin.wxpay.a$i;
import com.tencent.mm.ui.base.h;

class MallOrderRecordListUI$2 implements OnItemLongClickListener {
    final /* synthetic */ MallOrderRecordListUI lPQ;

    MallOrderRecordListUI$2(MallOrderRecordListUI mallOrderRecordListUI) {
        this.lPQ = mallOrderRecordListUI;
    }

    public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i < this.lPQ.lPM.size()) {
            h.a(this.lPQ, this.lPQ.getResources().getString(a$i.wallet_order_list_delete_order), null, this.lPQ.getResources().getString(a$i.app_delete), new 1(this, i));
        }
        return true;
    }
}
