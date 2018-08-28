package com.tencent.mm.ui.a;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b {
    private final String TAG = "MicroMsg.Accessibility.Tool";
    private List<String> tqT = new ArrayList();

    public final b ZU(String str) {
        this.tqT.add(str);
        return this;
    }

    public final void dl(View view) {
        if (view != null && this.tqT.size() > 0) {
            String str = "";
            Iterator it = this.tqT.iterator();
            while (true) {
                String str2 = str;
                if (it.hasNext()) {
                    str = str2 + ((String) it.next()) + ",";
                } else {
                    view.setContentDescription(str2);
                    return;
                }
            }
        }
    }
}
