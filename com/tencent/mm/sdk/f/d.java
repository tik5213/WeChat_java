package com.tencent.mm.sdk.f;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class d implements ThreadFactory {
    private ThreadGroup dWZ = new ThreadGroup("MM_THREAD_POOL_GROUP");
    private final AtomicInteger sKP = new AtomicInteger(1);

    d() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.dWZ, runnable, "MM_Thread_Pool_Thread#" + this.sKP.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        if (thread.getPriority() != 5) {
            thread.setPriority(5);
        }
        return thread;
    }
}
