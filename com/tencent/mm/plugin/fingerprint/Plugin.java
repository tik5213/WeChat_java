package com.tencent.mm.plugin.fingerprint;

import com.tencent.mm.model.ar;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.n;

public class Plugin implements c {
    public n createApplication() {
        return null;
    }

    public b getContactWidgetFactory() {
        return null;
    }

    public ar createSubCore() {
        return new a();
    }
}
