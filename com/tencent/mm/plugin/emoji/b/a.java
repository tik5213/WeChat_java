package com.tencent.mm.plugin.emoji.b;

import android.content.Context;
import android.text.SpannableString;

public interface a extends com.tencent.mm.kernel.c.a {
    SpannableString a(Context context, CharSequence charSequence, float f);

    SpannableString a(CharSequence charSequence, float f);

    String cp(String str, String str2);

    boolean u(CharSequence charSequence);

    boolean v(CharSequence charSequence);
}
