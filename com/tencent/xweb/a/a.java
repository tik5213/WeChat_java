package com.tencent.xweb.a;

import android.os.Bundle;
import com.tencent.xweb.l;

public final class a {
    l vAV;

    public final Bundle getBundle() {
        int i;
        if (!(this.vAV == null || this.vAV.getRequestHeaders() == null || this.vAV.isForMainFrame() || !this.vAV.getRequestHeaders().containsKey("Accept"))) {
            String str = (String) this.vAV.getRequestHeaders().get("Accept");
            if (str != null && str.startsWith("text/html")) {
                i = 1;
                if (i != 0) {
                    return null;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("resourceType", 1);
                return bundle;
            }
        }
        i = 0;
        if (i != 0) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putInt("resourceType", 1);
        return bundle2;
    }

    public a(l lVar) {
        this.vAV = lVar;
    }
}
