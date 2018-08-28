package com.tencent.mm.app.plugin;

import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import com.tencent.mm.pluginsdk.o.d;
import com.tencent.mm.pluginsdk.ui.applet.m;
import com.tencent.mm.pluginsdk.ui.d.a;
import com.tencent.mm.pluginsdk.ui.d.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Collections;
import java.util.Iterator;

public final class c implements d {
    public final String t(Context context, String str) {
        Object bm = a.bm(context, str);
        if (bm.size() != 0) {
            Collections.sort(bm, new 1(this));
            Iterator it = bm.iterator();
            String str2 = str;
            while (it.hasNext()) {
                String format;
                m mVar = (m) it.next();
                String str3 = null;
                int i = mVar.start;
                int i2 = mVar.end;
                switch (mVar.type) {
                    case 1:
                        str3 = "<a href=\"%s\">%s</a>";
                        break;
                    case 24:
                        str3 = "<a href=\"%s@mailto@\">%s</a>";
                        break;
                    case 25:
                        str3 = "<a href=\"%s@tel@\">%s</a>";
                        break;
                }
                if (str3 != null) {
                    String str4 = mVar.url;
                    if (mVar.type != 1 || str4.startsWith("http://")) {
                        format = String.format(str3, new Object[]{str4.trim(), str4.trim()});
                    } else {
                        format = String.format(str3, new Object[]{"http://" + str4.trim(), str4.trim()});
                    }
                    format = a(str2, i, i2, format);
                    if (format.length() == 0) {
                        x.d("MicroMsg.QrCodeURLHelper", "formatQRString, result:%s", new Object[]{str});
                    }
                } else {
                    format = str2;
                }
                str2 = format;
            }
            str = str2;
            x.d("MicroMsg.QrCodeURLHelper", "formatQRString, result:%s", new Object[]{str});
        }
        return str;
    }

    private static String a(String str, int i, int i2, String str2) {
        if (bi.oW(str) || bi.oW(str2) || i >= i2) {
            return str;
        }
        StringBuilder stringBuilder = new StringBuilder();
        try {
            stringBuilder.append(str.subSequence(0, i + 0));
            stringBuilder.append(str2);
            stringBuilder.append(str.subSequence(i2 + 0, str.length()));
            str2.length();
            return stringBuilder.toString();
        } catch (Exception e) {
            x.e("MicroMsg.QrCodeURLHelper", e.getMessage());
            return "";
        }
    }

    public final boolean a(Context context, String str, OnDismissListener onDismissListener) {
        x.d("MicroMsg.QrCodeURLHelper", "tryHandleEvents, url:%s", new Object[]{str});
        if (bi.oW(str)) {
            return false;
        }
        if (str.endsWith("@mailto@")) {
            l.b(context, str.substring(0, str.length() - 8), onDismissListener);
        } else if (!str.endsWith("@tel@")) {
            return false;
        } else {
            String substring = str.substring(0, str.length() - 5);
            Bundle bundle = new Bundle();
            bundle.putInt("fromScene", 3);
            l.a(context, substring, onDismissListener, bundle);
        }
        return true;
    }

    public final boolean da(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (str.endsWith("@mailto@") || str.endsWith("@tel@")) {
            return true;
        }
        return false;
    }
}
