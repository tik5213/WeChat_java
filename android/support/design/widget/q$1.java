package android.support.design.widget;

import android.os.Handler.Callback;
import android.os.Message;
import android.support.design.widget.q.b;

class q$1 implements Callback {
    final /* synthetic */ q gP;

    q$1(q qVar) {
        this.gP = qVar;
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                q qVar = this.gP;
                b bVar = (b) message.obj;
                synchronized (qVar.mLock) {
                    if (qVar.gN == bVar || qVar.gO == bVar) {
                        qVar.a(bVar);
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
