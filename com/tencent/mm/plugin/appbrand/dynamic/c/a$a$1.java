package com.tencent.mm.plugin.appbrand.dynamic.c;

import com.tencent.mm.ipcinvoker.e;
import com.tencent.mm.plugin.appbrand.dynamic.c.a.a;
import junit.framework.Assert;

class a$a$1 implements Runnable {
    final /* synthetic */ a fvB;

    a$a$1(a aVar) {
        this.fvB = aVar;
    }

    public final void run() {
        Assert.assertTrue(String.format("execute assert process(%s) command", new Object[]{e.Cs()}), false);
    }
}
