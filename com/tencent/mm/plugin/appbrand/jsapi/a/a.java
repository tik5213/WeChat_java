package com.tencent.mm.plugin.appbrand.jsapi.a;

import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.mm.plugin.appbrand.s.d;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class a extends ClickableSpan {
    private String fJM;
    private int fJN = ad.getContext().getResources().getColor(d.green_text_color);

    public a(String str) {
        this.fJM = str;
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setColor(this.fJN);
        textPaint.setUnderlineText(false);
    }

    public final void onClick(View view) {
        if (bi.oW(this.fJM)) {
            x.e("MicroMsg.ExposeSpan", "exposeUrl is null, return");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("rawUrl", this.fJM);
        intent.putExtra("forceHideShare", true);
        com.tencent.mm.bg.d.b(view.getContext(), "webview", ".ui.tools.WebViewUI", intent);
        x.d("MicroMsg.ExposeSpan", "expose click, exposeUrl:%s", new Object[]{this.fJM});
    }
}
