package com.tencent.mm.plugin.voip;

import com.tencent.mm.model.ar;
import com.tencent.mm.plugin.voip.a.a;
import com.tencent.mm.plugin.voip.model.i;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.n;

public final class Plugin implements c {
    public final n createApplication() {
        return new a();
    }

    public final b getContactWidgetFactory() {
        return null;
    }

    public final ar createSubCore() {
        return new i();
    }
}
