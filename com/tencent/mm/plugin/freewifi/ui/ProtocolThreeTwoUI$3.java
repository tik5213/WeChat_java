package com.tencent.mm.plugin.freewifi.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.sdk.platformtools.x;

class ProtocolThreeTwoUI$3 implements OnCancelListener {
    final /* synthetic */ ProtocolThreeTwoUI joB;

    ProtocolThreeTwoUI$3(ProtocolThreeTwoUI protocolThreeTwoUI) {
        this.joB = protocolThreeTwoUI;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        d.a(this.joB.ssid, 4, this.joB.getIntent());
        x.i("MicroMsg.FreeWifi.Protocol32UI", "sessionKey=%s, step=%d, method=Protocol32UI.toConnecting.ProgressDlg.onCancel, desc=it changes the connect state of the model to CONNECT_STATE_WAIT_START because the user cancles the connect process in progress. state=%d", new Object[]{m.E(this.joB.getIntent()), Integer.valueOf(m.F(this.joB.getIntent())), Integer.valueOf(4)});
    }
}
