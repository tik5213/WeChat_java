package com.tencent.mm.plugin.appbrand.widget.f;

import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.TimeUnit;

public interface c {
    public static final long gOS = TimeUnit.SECONDS.toMillis(4);

    void a(FrameLayout frameLayout);

    View getView();

    void wp(String str);
}
