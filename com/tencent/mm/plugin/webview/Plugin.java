package com.tencent.mm.plugin.webview;

import com.tencent.mm.model.ar;
import com.tencent.mm.plugin.webview.a.a;
import com.tencent.mm.plugin.webview.modeltools.e;
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
        return new e();
    }
}
