package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class i {
    public Map<String, Object> mcy;
    public String qkj;
    Map<String, Object> qkk = new HashMap();
    public String qkl;
    public String type;

    public final Map<String, Object> bYt() {
        return this.qkk;
    }

    public static Bundle aq(Map<String, Object> map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj instanceof String[]) {
                bundle.putStringArray(str, (String[]) obj);
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else {
                bundle.putString(str, String.valueOf(obj));
            }
        }
        return bundle;
    }

    public static Map<String, Object> ac(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        Set<String> keySet = bundle.keySet();
        if (keySet == null) {
            return null;
        }
        Map<String, Object> hashMap = new HashMap();
        for (String str : keySet) {
            hashMap.put(str, bundle.get(str));
        }
        return hashMap;
    }
}
