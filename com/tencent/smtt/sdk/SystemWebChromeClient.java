package com.tencent.smtt.sdk;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import com.tencent.smtt.sdk.WebView.WebViewTransport;

class SystemWebChromeClient extends WebChromeClient {
    private WebView a;
    private WebChromeClient b;

    SystemWebChromeClient(WebView webView, WebChromeClient webChromeClient) {
        this.a = webView;
        this.b = webChromeClient;
    }

    @TargetApi(7)
    public Bitmap getDefaultVideoPoster() {
        Bitmap defaultVideoPoster = this.b.getDefaultVideoPoster();
        if (defaultVideoPoster != null) {
            return defaultVideoPoster;
        }
        try {
            return VERSION.SDK_INT >= 24 ? BitmapFactory.decodeResource(this.a.getResources(), 17301540) : defaultVideoPoster;
        } catch (Exception e) {
            return defaultVideoPoster;
        }
    }

    @TargetApi(7)
    public View getVideoLoadingProgressView() {
        return this.b.getVideoLoadingProgressView();
    }

    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
        this.b.getVisitedHistory(new y(this, valueCallback));
    }

    public void onCloseWindow(WebView webView) {
        this.a.a(webView);
        this.b.onCloseWindow(this.a);
    }

    public void onConsoleMessage(String str, int i, String str2) {
        this.b.onConsoleMessage(new a(str, str2, i));
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        return this.b.onConsoleMessage(new a(consoleMessage));
    }

    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView webView2 = this.a;
        webView2.getClass();
        WebViewTransport webViewTransport = new WebViewTransport(webView2);
        Message obtain = Message.obtain(message.getTarget(), new z(this, webViewTransport, message));
        obtain.obj = webViewTransport;
        return this.b.onCreateWindow(this.a, z, z2, obtain);
    }

    @TargetApi(5)
    @Deprecated
    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, QuotaUpdater quotaUpdater) {
        this.b.onExceededDatabaseQuota(str, str2, j, j2, j3, new f(this, quotaUpdater));
    }

    @TargetApi(5)
    public void onGeolocationPermissionsHidePrompt() {
        this.b.onGeolocationPermissionsHidePrompt();
    }

    @TargetApi(5)
    public void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
        this.b.onGeolocationPermissionsShowPrompt(str, new c(this, callback));
    }

    @TargetApi(7)
    public void onHideCustomView() {
        this.b.onHideCustomView();
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        this.a.a(webView);
        return this.b.onJsAlert(this.a, str, str2, new e(this, jsResult));
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        this.a.a(webView);
        return this.b.onJsBeforeUnload(this.a, str, str2, new e(this, jsResult));
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        this.a.a(webView);
        return this.b.onJsConfirm(this.a, str, str2, new e(this, jsResult));
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        this.a.a(webView);
        return this.b.onJsPrompt(this.a, str, str2, str3, new d(this, jsPromptResult));
    }

    @TargetApi(7)
    public boolean onJsTimeout() {
        return this.b.onJsTimeout();
    }

    public void onProgressChanged(WebView webView, int i) {
        this.a.a(webView);
        this.b.onProgressChanged(this.a, i);
    }

    @TargetApi(7)
    @Deprecated
    public void onReachedMaxAppCacheSize(long j, long j2, QuotaUpdater quotaUpdater) {
        this.b.onReachedMaxAppCacheSize(j, j2, new f(this, quotaUpdater));
    }

    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        this.a.a(webView);
        this.b.onReceivedIcon(this.a, bitmap);
    }

    public void onReceivedTitle(WebView webView, String str) {
        this.a.a(webView);
        this.b.onReceivedTitle(this.a, str);
    }

    @TargetApi(7)
    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        this.a.a(webView);
        this.b.onReceivedTouchIconUrl(this.a, str, z);
    }

    public void onRequestFocus(WebView webView) {
        this.a.a(webView);
        this.b.onRequestFocus(this.a);
    }

    @TargetApi(14)
    @Deprecated
    public void onShowCustomView(View view, int i, CustomViewCallback customViewCallback) {
        this.b.onShowCustomView(view, i, new b(this, customViewCallback));
    }

    @TargetApi(7)
    public void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        this.b.onShowCustomView(view, new b(this, customViewCallback));
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, FileChooserParams fileChooserParams) {
        ab abVar = new ab(this, valueCallback);
        ac acVar = new ac(this, fileChooserParams);
        this.a.a(webView);
        return this.b.onShowFileChooser(this.a, abVar, acVar);
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback) {
        openFileChooser(valueCallback, null, null);
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
        openFileChooser(valueCallback, str, null);
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        this.b.openFileChooser(new aa(this, valueCallback), str, str2);
    }

    public void setupAutoFill(Message message) {
    }
}
