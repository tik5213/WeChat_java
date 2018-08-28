package android.support.v7.view;

import android.content.Context;
import android.support.v7.a.a.b;

public final class a {
    public Context mContext;

    public static a R(Context context) {
        return new a(context);
    }

    private a(Context context) {
        this.mContext = context;
    }

    public final boolean dr() {
        if (this.mContext.getApplicationInfo().targetSdkVersion >= 16) {
            return this.mContext.getResources().getBoolean(b.abc_action_bar_embed_tabs);
        }
        return this.mContext.getResources().getBoolean(b.abc_action_bar_embed_tabs_pre_jb);
    }

    public final boolean ds() {
        return this.mContext.getApplicationInfo().targetSdkVersion < 14;
    }
}
