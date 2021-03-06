package com.tencent.mm.plugin.webview.ui.tools;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.xweb.h;
import java.util.List;

class b$1 implements OnClickListener {
    final /* synthetic */ String pVN;
    final /* synthetic */ b pVO;

    b$1(b bVar, String str) {
        this.pVO = bVar;
        this.pVN = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        List<h> list = (List) this.pVO.pVL.get(this.pVN);
        if (list == null) {
            x.e("MicroMsg.WebView.MMSslErrorHandler", "onReceivedSslError, continue selected, list should not be null");
            return;
        }
        this.pVO.pVM.put(this.pVN, Boolean.valueOf(true));
        x.i("MicroMsg.WebView.MMSslErrorHandler", "onReceivedSslError, continue selected, list size = %d", new Object[]{Integer.valueOf(list.size())});
        for (h proceed : list) {
            proceed.proceed();
        }
        list.clear();
    }
}
