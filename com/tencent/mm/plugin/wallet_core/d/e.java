package com.tencent.mm.plugin.wallet_core.d;

import com.tencent.mm.plugin.wallet_core.model.t;
import com.tencent.mm.sdk.e.i;

public final class e extends i<t> {
    public static final String[] diD = new String[]{i.a(t.dhO, "WalletFunciontList")};
    public com.tencent.mm.sdk.e.e diF;

    public e(com.tencent.mm.sdk.e.e eVar) {
        super(eVar, t.dhO, "WalletFunciontList", null);
        this.diF = eVar;
    }

    public final void b(int i, String str, String str2, String str3, String str4) {
        t tVar = new t();
        tVar.field_wallet_region = i;
        tVar.field_function_list = str;
        tVar.field_new_list = str2;
        tVar.field_banner_list = str3;
        tVar.field_type_name_list = str4;
        super.a(tVar);
    }
}
