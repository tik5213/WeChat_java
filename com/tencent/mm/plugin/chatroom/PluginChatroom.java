package com.tencent.mm.plugin.chatroom;

import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.model.n;
import com.tencent.mm.plugin.chatroom.b.a;
import com.tencent.mm.plugin.chatroom.b.c;

public class PluginChatroom extends f implements c {
    public String name() {
        return "plugin-chatroom";
    }

    public void execute(g gVar) {
        if (gVar.ES()) {
            com.tencent.mm.kernel.g.a(a.class, new n());
        }
    }
}
