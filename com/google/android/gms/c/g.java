package com.google.android.gms.c;

import com.google.android.gms.common.internal.w;
import java.util.HashMap;
import java.util.Map;

public final class g extends af<g> {
    public final Map<String, Object> aFa = new HashMap();

    public static String br(String str) {
        w.bg(str);
        if (str != null && str.startsWith("&")) {
            str = str.substring(1);
        }
        w.i(str, "Name can not be empty or \"&\"");
        return str;
    }

    public final /* synthetic */ void a(af afVar) {
        g gVar = (g) afVar;
        w.ah(gVar);
        gVar.aFa.putAll(this.aFa);
    }

    public final String toString() {
        return af.n(this.aFa, 0);
    }
}
