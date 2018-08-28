package com.tencent.mm.sdk.platformtools;

import java.io.FileInputStream;
import java.io.FilterInputStream;

public final class i extends FilterInputStream {
    private long eey = 0;

    public i(FileInputStream fileInputStream) {
        super(fileInputStream);
    }

    public final boolean markSupported() {
        return true;
    }

    public final void mark(int i) {
        try {
            this.eey = ((FileInputStream) this.in).getChannel().position();
        } catch (Throwable e) {
            x.printErrStackTrace("MicroMsg.FileSeekingInputStream", e, "Failed seeking FileChannel.", new Object[0]);
        }
    }

    public final void reset() {
        ((FileInputStream) this.in).getChannel().position(this.eey);
    }
}
