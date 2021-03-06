package com.tencent.mm.plugin.appbrand.h;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import com.tencent.mm.plugin.appbrand.q.m;
import com.tencent.mm.plugin.appbrand.s.i;
import com.tencent.mm.plugin.messenger.a.e.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class d implements b {
    public final CharSequence a(Map<String, String> map, String str, Bundle bundle, WeakReference<Context> weakReference) {
        if (map == null || map.isEmpty()) {
            x.w("MicroMsg.WxaSysTemplateMsgHandler", "values map is null or nil");
            return null;
        }
        Context context = (Context) weakReference.get();
        if (context == null) {
            x.w("MicroMsg.WxaSysTemplateMsgHandler", "context is null");
            return null;
        }
        String str2 = (String) map.get(str + ".title");
        String str3 = (String) map.get(str + ".username");
        int i = bi.getInt((String) map.get(str + ".type"), 0);
        int i2 = bi.getInt((String) map.get(str + ".wxaapp_type"), 0);
        String str4 = (String) map.get(str + ".path");
        Object obj = bi.getInt((String) map.get(new StringBuilder().append(str).append(".forbids").toString()), 0) == 1 ? 1 : null;
        String string = bundle != null ? bundle.getString("conv_talker_username") : "";
        int i3 = bundle != null ? bundle.getInt("scene") : 0;
        long j = bundle != null ? bundle.getLong("msg_sever_id") : 0;
        String string2 = bundle != null ? bundle.getString("send_msg_username") : "";
        if (bi.oW(str2)) {
            x.w("MicroMsg.WxaSysTemplateMsgHandler", "link title is null or nil");
            return null;
        }
        CharSequence spannableString = new SpannableString(str2);
        spannableString.setSpan(new 1(this, str2, str3, str4, string, weakReference, i3, j, string2, i), 0, str2.length(), 17);
        x.d("MicroMsg.WxaSysTemplateMsgHandler", "handleTemplate(title : %s, username : %s, path : %s, talker : %s)", new Object[]{str2, str3, str4, string});
        if (obj != null) {
            return spannableString;
        }
        int i4 = i.spannable_app_brand_link_logo;
        switch (i2) {
            case 1:
                i4 = i.spannable_wxa_game_link_logo;
                break;
        }
        Drawable drawable = context.getResources().getDrawable(i4);
        drawable.setBounds(0, 0, m.aos(), m.aos());
        new SpannableString("@ ").setSpan(new com.tencent.mm.plugin.appbrand.widget.g.b(drawable), 0, 1, 33);
        return TextUtils.concat(new CharSequence[]{new SpannableString("@ "), spannableString});
    }
}
