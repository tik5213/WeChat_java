package com.tencent.mm.plugin.fts.b;

import com.tencent.mm.plugin.fts.a.a.a;
import com.tencent.wcdb.database.SQLiteDatabaseCorruptException;

class f$a extends a {
    final /* synthetic */ f juX;

    private f$a(f fVar) {
        this.juX = fVar;
    }

    /* synthetic */ f$a(f fVar, byte b) {
        this(fVar);
    }

    public final boolean execute() {
        throw new SQLiteDatabaseCorruptException("For Test");
    }
}
