package com.tencent.mm.plugin.account.ui;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.tencent.mm.plugin.account.a.c;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.sdk.platformtools.bi;

class RegByMobileRegAIOUI$16 extends ClickableSpan {
    final /* synthetic */ RegByMobileRegAIOUI eVb;

    RegByMobileRegAIOUI$16(RegByMobileRegAIOUI regByMobileRegAIOUI) {
        this.eVb = regByMobileRegAIOUI;
    }

    public final void onClick(View view) {
        bi.L(this.eVb.mController.tml, this.eVb.getString(j.url_agreement));
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.eVb.getResources().getColor(c.link_color));
        textPaint.setUnderlineText(true);
    }
}
