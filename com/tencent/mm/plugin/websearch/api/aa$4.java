package com.tencent.mm.plugin.websearch.api;

import android.webkit.ValueCallback;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.widget.MMWebView;

class aa$4 implements ValueCallback<String> {
    final /* synthetic */ aa pMf;
    final /* synthetic */ MMWebView pMh;

    aa$4(aa aaVar, MMWebView mMWebView) {
        this.pMf = aaVar;
        this.pMh = mMWebView;
    }

    public final /* synthetic */ void onReceiveValue(Object obj) {
        String str = (String) obj;
        x.i(this.pMf.TAG, "loadJS, sys:init callback %s,view %s", new Object[]{str, this.pMh.toString()});
    }
}
