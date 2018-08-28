package com.tencent.mm.plugin.game.wepkg.downloader;

import com.tencent.mm.sdk.platformtools.x;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class h extends ThreadPoolExecutor {
    public h(TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory) {
        super(3, 3, 3000, timeUnit, blockingQueue, threadFactory);
    }

    protected final <V> RunnableFuture<V> newTaskFor(Runnable runnable, V v) {
        if (runnable instanceof c) {
            return new e(runnable, v, (c) runnable);
        }
        return super.newTaskFor(runnable, v);
    }

    protected final void terminated() {
        d aVs = d.aVs();
        if (aVs.kei != null) {
            aVs.kei.clear();
        }
        super.terminated();
    }

    protected final void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        x.i("MicroMsg.Wepkg.WePkgThreadPoolExecutor", "beforeExecute");
    }

    protected final void afterExecute(Runnable runnable, Throwable th) {
        if (runnable instanceof e) {
            e eVar = (e) runnable;
            if (!(eVar.keu == null || eVar.keu.kdY == null)) {
                d.aVs().Ee(eVar.keu.kdY.kev);
                x.i("MicroMsg.Wepkg.WePkgThreadPoolExecutor", "remove download task");
            }
        }
        x.i("MicroMsg.Wepkg.WePkgThreadPoolExecutor", "afterExecute");
        super.afterExecute(runnable, th);
    }
}
