package com.tencent.mm.plugin.appbrand.widget.sms;

import android.text.Editable;
import android.text.TextWatcher;
import com.tencent.mm.sdk.platformtools.x;

class EditVerifyCodeView$1 implements TextWatcher {
    final /* synthetic */ EditVerifyCodeView gQj;

    EditVerifyCodeView$1(EditVerifyCodeView editVerifyCodeView) {
        this.gQj = editVerifyCodeView;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        if (editable != null && editable.length() != 0) {
            x.i("MicroMsg.EditVerifyCodeView", "afterTextChanged:%s", new Object[]{editable.toString()});
            if (EditVerifyCodeView.a(this.gQj).length() < 6) {
                EditVerifyCodeView.a(this.gQj).append(editable.toString());
                EditVerifyCodeView.b(this.gQj);
            }
            editable.delete(0, editable.length());
        }
    }
}
