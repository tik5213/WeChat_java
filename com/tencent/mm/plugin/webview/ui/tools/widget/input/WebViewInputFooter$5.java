package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.text.Editable;
import android.text.TextWatcher;

class WebViewInputFooter$5 implements TextWatcher {
    final /* synthetic */ WebViewInputFooter qlJ;

    WebViewInputFooter$5(WebViewInputFooter webViewInputFooter) {
        this.qlJ = webViewInputFooter;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        if (WebViewInputFooter.d(this.qlJ).getText() != null) {
            WebViewInputFooter.d(this.qlJ).requestFocus();
            boolean z = editable.length() > 0 && editable.toString().trim().length() > 0;
            WebViewInputFooter.a(this.qlJ, z);
        }
    }
}
