package com.tencent.mm.plugin.appbrand.report;

import android.os.Bundle;
import com.tencent.mm.compatible.util.p;

public final class c {
    public static int h(int i, Bundle bundle) {
        if (bundle == null || !lC(i)) {
            return 0;
        }
        return bundle.getInt("stat_scene");
    }

    public static String i(int i, Bundle bundle) {
        if (bundle == null || !lC(i)) {
            return "";
        }
        String string;
        switch (bundle.getInt("stat_scene")) {
            case 1:
                return bundle.getString("stat_send_msg_user");
            case 2:
                string = bundle.getString("stat_chat_talker_username");
                return string + ":" + bundle.getString("stat_send_msg_user");
            case 3:
                string = bundle.getString("stat_msg_id");
                return string + ":" + bundle.getString("stat_send_msg_user");
            case 4:
                return p.encode(bundle.getString("stat_url"));
            case 6:
                return bundle.getString("stat_app_id") + ":" + p.encode(bundle.getString("stat_url"));
            case 7:
                return bundle.getString("stat_chat_talker_username");
            case 8:
                return "search:" + bundle.getString("stat_search_id");
            case 9:
                string = bundle.getString("stat_chat_talker_username");
                return string + ":" + bundle.getString("stat_send_msg_user");
            default:
                return "";
        }
    }

    private static boolean lC(int i) {
        switch (i) {
            case 1007:
            case 1008:
            case 1012:
            case 1024:
            case 1031:
            case 1036:
            case 1044:
            case 1048:
            case 1088:
                return true;
            default:
                return false;
        }
    }
}
