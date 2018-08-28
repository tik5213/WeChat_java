package c.t.m.g;

import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.tmassistantsdk.logreport.BaseReportManager;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class k {
    protected i a;
    public String b;
    public String c;
    protected AtomicInteger d = new AtomicInteger(0);
    protected ae e;
    private int f;
    private long g;
    private int h = 0;

    public k(i iVar) {
        this.a = iVar;
        this.b = iVar.a;
        this.c = iVar.a;
        this.f = iVar.e;
    }

    public aj a() {
        try {
            aj a;
            this.g = SystemClock.elapsedRealtime();
            w.a("app_http_proxy_timeout", 0, 20000, 5000);
            if (this.f <= 0) {
                this.f = w.a("app_req_timeout", BaseReportManager.MAX_READ_COUNT, 1000000, 15000);
            }
            if (this.a.h > 0 && this.a.h < this.f) {
                this.f = this.a.h;
            }
            int i = this.f;
            while (true) {
                a = a(i);
                int a2 = ci.a((int) (((long) this.f) - (SystemClock.elapsedRealtime() - this.g)), this.f);
                if (a.a != 0 || a.c < 300 || a.c >= 400 || !this.a.d || a2 <= 200) {
                    break;
                }
                Object a3 = a.a("location");
                if (TextUtils.isEmpty(a3)) {
                    a.a = -6;
                    break;
                }
                this.c = a3;
                this.h++;
                if (this.h > 5) {
                    a.a = -5;
                    break;
                }
                this.e.a(true);
                i = a2;
            }
            boolean z = this.a.g;
            if (this.a.k) {
                this.e.j = true;
                this.e.i = true;
                this.e.k = (long) this.a.h;
            } else {
                this.e.k = SystemClock.elapsedRealtime() - this.g;
            }
            this.e.a(false);
            return a;
        } catch (Throwable th) {
            return new aj(-1, ci.a(th));
        }
    }

    protected abstract aj a(int i);
}
