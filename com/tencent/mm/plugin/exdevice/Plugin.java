package com.tencent.mm.plugin.exdevice;

import com.tencent.mm.model.ar;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.pluginsdk.b.c;
import com.tencent.mm.pluginsdk.n;

public class Plugin implements c {
    public n createApplication() {
        return new a();
    }

    public b getContactWidgetFactory() {
        return null;
    }

    public ar createSubCore() {
        return new ad();
    }
}
