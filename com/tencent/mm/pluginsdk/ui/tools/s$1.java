package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.xweb.WebView;

class s$1 implements Runnable {
    final /* synthetic */ WebView qUt;

    s$1(WebView webView) {
        this.qUt = webView;
    }

    public final void run() {
        this.qUt.evaluateJavascript("javascript:var edw_iframe = document.getElementById('_edw_iframe_');if (edw_iframe === null) {edw_iframe = document.createElement('iframe');edw_iframe.id = '_edw_iframe_';edw_iframe.style.display = 'none';document.documentElement.appendChild(edw_iframe);}", null);
    }
}
