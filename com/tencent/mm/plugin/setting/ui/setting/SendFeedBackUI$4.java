package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class SendFeedBackUI$4 implements OnClickListener {
    final /* synthetic */ SendFeedBackUI mQD;

    SendFeedBackUI$4(SendFeedBackUI sendFeedBackUI) {
        this.mQD = sendFeedBackUI;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.mQD.finish();
    }
}
