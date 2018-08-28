package com.tencent.mm.plugin.webview.ui.tools;

import android.content.Context;
import android.os.Bundle;
import com.tencent.mm.R;
import com.tencent.mm.ui.base.h;

public class QRCodeIntroductionWebViewUI extends WebViewUI {
    static /* synthetic */ void a(QRCodeIntroductionWebViewUI qRCodeIntroductionWebViewUI) {
        Context context = qRCodeIntroductionWebViewUI;
        h.a(context, "", new String[]{qRCodeIntroductionWebViewUI.getString(R.l.sns_post_to), qRCodeIntroductionWebViewUI.getString(R.l.qrcode_introduction_share)}, "", false, new 3(qRCodeIntroductionWebViewUI));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addIconOptionMenu(0, R.g.mm_title_btn_menu, new 1(this));
        setBackBtn(new 2(this));
    }
}
