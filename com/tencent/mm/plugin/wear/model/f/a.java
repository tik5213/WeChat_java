package com.tencent.mm.plugin.wear.model.f;

import com.tencent.mm.plugin.wear.model.e.r;

public final class a extends c {
    public final String getName() {
        return "RequestLogTask";
    }

    protected final void send() {
        com.tencent.mm.plugin.wear.model.a.bSl();
        r.b(20009, null, false);
        com.tencent.mm.plugin.wear.model.a.bSl();
        r.b(20017, null, false);
    }
}
