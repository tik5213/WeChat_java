package com.tencent.mm.plugin.websearch.api;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Pair;
import com.jg.EType;
import com.jg.JgClassChecked;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.e;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.xweb.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import junit.framework.Assert;

@JgClassChecked(author = 20, fComment = "checked", lastDate = "20140429", reviewer = 20, vComment = {EType.JSEXECUTECHECK})
public final class y {
    private static at ewg = null;
    private static final Pattern pLQ = Pattern.compile("data:(image|img)/\\S+;base64,\\S+");
    private static final Map<String, String> pLR;
    private static final Map<String, String> pLS;

    public static String aV(Context context, String str) {
        String str2;
        Assert.assertTrue("MicroMsg.WebSearch.WebSearchPreloadApiLogic, appendUserAgent fail, context is null, stack = " + bi.cjd(), context != null);
        if (str == null) {
            str2 = " MicroMessenger/";
        } else {
            str2 = str + " MicroMessenger/";
        }
        PackageInfo packageInfo = getPackageInfo(context, ad.getPackageName());
        if (packageInfo != null) {
            str2 = (str2 + e.aj(null, d.qVN)) + "." + packageInfo.versionCode;
        }
        str2 = (str2 + " NetType/" + ao.fH(ad.getContext())) + " Language/" + w.fD(ad.getContext());
        x.i("MicroMsg.WebSearch.WebSearchPreloadApiLogic", "appendUserAgent, uaStr = " + str2);
        return str2;
    }

    public static boolean fj(String str, String str2) {
        x.i("MicroMsg.WebSearch.WebSearchPreloadApiLogic", "url %s,prefix %s", new Object[]{str, str2});
        if (str == null || str.length() < 0 || str2.length() < 0 || str2.length() > str.length()) {
            return false;
        }
        if (str2.equalsIgnoreCase(str.substring(0, str2.length()))) {
            x.i("MicroMsg.WebSearch.WebSearchPreloadApiLogic", "true url %s,prefix %s", new Object[]{str, str2});
            return true;
        }
        x.i("MicroMsg.WebSearch.WebSearchPreloadApiLogic", "false %s,prefix %s", new Object[]{str, str2});
        return false;
    }

    private static PackageInfo getPackageInfo(Context context, String str) {
        PackageInfo packageInfo = null;
        if (str == null) {
            x.e("MicroMsg.WebSearch.WebSearchPreloadApiLogic", "getPackageInfo fail, packageName is null");
            return packageInfo;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable e) {
            x.printErrStackTrace("MicroMsg.WebSearch.WebSearchPreloadApiLogic", e, "", new Object[0]);
            return packageInfo;
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("silk", "audio/silk"));
        arrayList.add(new Pair("jpg", "image/jpg"));
        Map hashMap = new HashMap();
        Map hashMap2 = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            hashMap.put(pair.first, pair.second);
            hashMap2.put(pair.second, pair.first);
        }
        pLR = Collections.unmodifiableMap(hashMap);
        pLS = Collections.unmodifiableMap(hashMap2);
    }

    public static void a(WebView webView) {
        x.d("MicroMsg.WebSearch.WebSearchPreloadApiLogic", "initIFrame");
        webView.evaluateJavascript("javascript:var edw_iframe = document.getElementById('_edw_iframe_');if (edw_iframe === null) {edw_iframe = document.createElement('iframe');edw_iframe.id = '_edw_iframe_';edw_iframe.style.display = 'none';document.documentElement.appendChild(edw_iframe); console.log('init frame')}", new 1());
    }
}
