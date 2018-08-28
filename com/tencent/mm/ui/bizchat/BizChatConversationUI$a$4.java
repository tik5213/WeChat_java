package com.tencent.mm.ui.bizchat;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.bizchat.BizChatConversationUI.a;

class BizChatConversationUI$a$4 implements OnMenuItemClickListener {
    final /* synthetic */ a tEC;

    BizChatConversationUI$a$4(a aVar) {
        this.tEC = aVar;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        x.v("MicroMsg.BizChatConversationFmUI", "search btn was clicked.");
        Intent intent = new Intent(this.tEC.getContext(), BizChatSearchUI.class);
        intent.putExtra("enterprise_biz_name", a.a(this.tEC));
        intent.putExtra("biz_chat_search_scene", 1);
        intent.putExtra("biz_chat_search_text", "");
        intent.addFlags(67108864);
        this.tEC.startActivity(intent);
        return true;
    }
}
