package com.google.android.gms.iid;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class InstanceIDListenerService$1 extends Handler {
    final /* synthetic */ InstanceIDListenerService aRe;

    InstanceIDListenerService$1(InstanceIDListenerService instanceIDListenerService, Looper looper) {
        this.aRe = instanceIDListenerService;
        super(looper);
    }

    public final void handleMessage(Message message) {
        InstanceIDListenerService.a(this.aRe, message, MessengerCompat.g(message));
    }
}
