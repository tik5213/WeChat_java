package com.tencent.mm.plugin.sns.model;

import android.net.wifi.ScanResult;
import java.util.Comparator;

class ak$1 implements Comparator<ScanResult> {
    ak$1() {
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((ScanResult) obj2).level - ((ScanResult) obj).level;
    }
}
