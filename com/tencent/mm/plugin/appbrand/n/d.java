package com.tencent.mm.plugin.appbrand.n;

import android.content.Context;
import com.tencent.mm.kernel.c.a;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.y.g;

public interface d extends a {
    void a(Context context, String str, String str2, int i, int i2, String str3, AppBrandStatObject appBrandStatObject);

    void a(Context context, String str, String str2, int i, int i2, String str3, AppBrandStatObject appBrandStatObject, String str4);

    void a(Context context, String str, String str2, String str3, int i, String str4);

    void a(Context context, String str, String str2, boolean z, g.a aVar);
}
