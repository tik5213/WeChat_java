package com.tencent.mm.plugin.appbrand.widget.sms;

import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

class EditVerifyCodeView$3 implements OnKeyListener {
    final /* synthetic */ EditVerifyCodeView gQj;

    EditVerifyCodeView$3(EditVerifyCodeView editVerifyCodeView) {
        this.gQj = editVerifyCodeView;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i != 67 || keyEvent.getAction() != 1) {
            return false;
        }
        EditVerifyCodeView.c(this.gQj);
        return true;
    }
}
