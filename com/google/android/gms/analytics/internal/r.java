package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.common.internal.w;

public final class r {
    final Context aGi;
    final Context aGj;

    public r(Context context) {
        w.ah(context);
        Context applicationContext = context.getApplicationContext();
        w.j(applicationContext, "Application context can't be null");
        this.aGi = applicationContext;
        this.aGj = applicationContext;
    }

    protected static y a(q qVar) {
        return new y(qVar);
    }

    protected static ac b(q qVar) {
        return new ac(qVar);
    }

    public static t d(q qVar) {
        return new t(qVar);
    }

    public static ag e(q qVar) {
        return new ag(qVar);
    }

    public static i f(q qVar) {
        return new i(qVar);
    }

    final w c(q qVar) {
        return new w(qVar, this);
    }
}
