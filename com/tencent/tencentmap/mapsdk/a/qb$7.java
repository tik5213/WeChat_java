package com.tencent.tencentmap.mapsdk.a;

import com.tencent.tencentmap.mapsdk.map.CancelableCallback;

class qb$7 implements tt {
    final /* synthetic */ CancelableCallback a;
    final /* synthetic */ qb b;

    qb$7(qb qbVar, CancelableCallback cancelableCallback) {
        this.b = qbVar;
        this.a = cancelableCallback;
    }

    public void a() {
        if (this.a != null) {
            this.a.onFinish();
        }
    }

    public void b() {
        if (this.a != null) {
            this.a.onCancel();
        }
    }
}
