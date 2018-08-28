package com.google.android.gms.common.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.lang.ref.WeakReference;

class o$c extends BroadcastReceiver {
    private WeakReference<o> aLK;

    o$c(o oVar) {
        this.aLK = new WeakReference(oVar);
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        String str = null;
        if (data != null) {
            str = data.getSchemeSpecificPart();
        }
        if (str != null && str.equals("com.google.android.gms")) {
            o oVar = (o) this.aLK.get();
            if (oVar != null) {
                o.a(oVar);
            }
        }
    }
}
