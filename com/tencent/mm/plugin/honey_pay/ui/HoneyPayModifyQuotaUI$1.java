package com.tencent.mm.plugin.honey_pay.ui;

import android.text.Editable;
import android.text.TextWatcher;

class HoneyPayModifyQuotaUI$1 implements TextWatcher {
    final /* synthetic */ HoneyPayModifyQuotaUI klK;

    HoneyPayModifyQuotaUI$1(HoneyPayModifyQuotaUI honeyPayModifyQuotaUI) {
        this.klK = honeyPayModifyQuotaUI;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void afterTextChanged(Editable editable) {
        if (editable.toString().startsWith(".")) {
            editable.insert(0, "0");
        }
        String obj = editable.toString();
        int indexOf = obj.indexOf(".");
        int length = obj.length();
        if (indexOf >= 0 && length - indexOf > 2) {
            editable.delete(indexOf + 3, length);
        }
        HoneyPayModifyQuotaUI.a(this.klK);
    }
}
