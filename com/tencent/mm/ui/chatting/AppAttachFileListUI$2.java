package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.mm.ui.chatting.AppAttachFileListUI.c;

class AppAttachFileListUI$2 implements OnItemClickListener {
    final /* synthetic */ AppAttachFileListUI tGA;

    AppAttachFileListUI$2(AppAttachFileListUI appAttachFileListUI) {
        this.tGA = appAttachFileListUI;
    }

    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Intent intent = new Intent();
        intent.setClassName(this.tGA, "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
        intent.putExtra("app_msg_id", ((c) AppAttachFileListUI.a(this.tGA).get(i)).bXQ.field_msgId);
        intent.setFlags(67108864);
        this.tGA.startActivity(intent);
    }
}
