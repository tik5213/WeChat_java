package com.d.a.a;

import android.hardware.Sensor;
import android.os.Build;
import android.os.Build.VERSION;

class r$d extends r$a {
    private boolean bjT;

    /* synthetic */ r$d(r rVar, byte b) {
        this(rVar);
    }

    private r$d(r rVar) {
        super(rVar, (byte) 0);
    }

    static /* synthetic */ r$d a(r$d r_d) {
        if (r_d.bjT) {
            throw new Exception("OnlineModule: new-session runnable occupied");
        }
        r_d.bjT = true;
        return r_d;
    }

    public final void run() {
        try {
            r.a(sJ());
            f b = r.b(sJ());
            try {
                b.bgV = Build.MODEL;
                b.bgW = VERSION.RELEASE;
                b.versionName = b.bgT.versionName;
                CharSequence loadLabel = b.mContext.getApplicationInfo().loadLabel(b.bgS);
                b.bgU = loadLabel != null ? loadLabel.toString() : "unknown";
                if (b.bgR != null) {
                    Sensor defaultSensor = b.bgR.getDefaultSensor(1);
                    Sensor defaultSensor2 = b.bgR.getDefaultSensor(4);
                    Sensor defaultSensor3 = b.bgR.getDefaultSensor(2);
                    Sensor defaultSensor4 = b.bgR.getDefaultSensor(11);
                    if (defaultSensor != null) {
                        b.bgZ = 1;
                    }
                    if (defaultSensor2 != null) {
                        b.bha = 1;
                    }
                    if (defaultSensor3 != null) {
                        b.bhb = 1;
                    }
                    if (defaultSensor4 != null) {
                        b.bhc = 1;
                    }
                }
            } catch (Exception e) {
            } catch (Error e2) {
            }
        } catch (Exception e3) {
        }
        this.bjT = false;
    }
}
