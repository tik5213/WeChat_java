package com.tencent.mm.plugin.fts.b;

import com.tencent.mm.plugin.fts.jni.FTSJNIUtils;
import java.util.Comparator;

class a$9 implements Comparator<String> {
    final /* synthetic */ a jtJ;

    a$9(a aVar) {
        this.jtJ = aVar;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return FTSJNIUtils.stringCompareUtfBinary((String) obj, (String) obj2);
    }
}
