package com.tencent.mm.pluginsdk.ui.websearch;

import android.telephony.PhoneStateListener;
import com.tencent.mm.sdk.platformtools.x;

class a$4 extends PhoneStateListener {
    final /* synthetic */ a qUH;

    a$4(a aVar) {
        this.qUH = aVar;
    }

    public final void onCallStateChanged(int i, String str) {
        super.onCallStateChanged(i, str);
        int i2 = -1;
        if (a.f(this.qUH) != null) {
            i2 = a.f(this.qUH).getCurrentState();
        }
        x.d("MicroMsg.VoiceInputPanel", "onCallStateChanged :%s, currentState: %s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        if (i2 == 2) {
            this.qUH.pause();
        }
    }
}
