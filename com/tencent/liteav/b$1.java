package com.tencent.liteav;

class b$1 implements Runnable {
    final /* synthetic */ b a;

    b$1(b bVar) {
        this.a = bVar;
    }

    public void run() {
        if (b.a(this.a) != null) {
            b.a(this.a).setVisibility(0);
        }
    }
}
