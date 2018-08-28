package com.tencent.mm.wallet_core.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.bg.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.protocal.f;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c.v;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class e {
    private static SimpleDateFormat hZW = null;
    private static final String[] pup = new String[]{"ABC_DEBIT", "ABC_CREDIT", "CITIC_CREDIT", "CMBC_DEBIT", "COMM_DEBIT", "HSBC_DEBIT"};
    protected static final Pattern qPR = Pattern.compile("((?:(http|https|Http|Https):\\/\\/(?:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,64}(?:\\:(?:[a-zA-Z0-9\\$\\-\\_\\.\\+\\!\\*\\'\\(\\)\\,\\;\\?\\&\\=]|(?:\\%[a-fA-F0-9]{2})){1,25})?\\@)?)?((?:(?:[a-zA-Z0-9][a-zA-Z0-9\\-\\_]{0,64}\\.)+(?:(?:aero|arpa|asia|a[cdefgilmnoqrstuwxz])|(?:biz|b[abdefghijmnorstvwyz])|(?:cat|com|coop|c[acdfghiklmnoruvxyz])|d[ejkmoz]|(?:edu|e[cegrstu])|f[ijkmor]|(?:gov|g[abdefghilmnpqrstuwy])|h[kmnrtu]|(?:info|int|i[delmnoqrst])|(?:jobs|j[emop])|k[eghimnrwyz]|l[abcikrstuvy]|(?:mil|mobi|museum|m[acdeghklmnopqrstuvwxyz])|(?:name|net|n[acefgilopruz])|(?:org|om)|(?:pro|p[aefghklmnrstwy])|qa|r[eouw]|s[abcdeghijklmnortuvyz]|(?:tel|travel|t[cdfghjklmnoprtvwz])|u[agkmsyz]|v[aceginu]|w[fs]|y[etu]|z[amw]))|(?:(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(?:25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9])))(?:\\:\\d{1,5})?)(\\/(?:(?:[a-zA-Z0-9\\;\\/\\?\\:\\@\\&\\=\\#\\~\\-\\.\\+\\!\\*\\'\\(\\)\\,\\_])|(?:\\%[a-fA-F0-9]{2}))*)?");
    private static final aa<Integer, Typeface> uYW = new aa(4);

    public static class c {
        public String aAL = null;
        public Object sIy = null;

        public c(String str, Object obj) {
            this.aAL = str;
            this.sIy = obj;
        }
    }

    static /* synthetic */ byte[] cB(Object obj) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new ObjectOutputStream(byteArrayOutputStream).writeObject(obj);
        return byteArrayOutputStream.toByteArray();
    }

    public static Typeface dR(Context context) {
        if (VERSION.SDK_INT > 23) {
            return Typeface.createFromAsset(context.getAssets(), Hc(4));
        }
        Typeface typeface = (Typeface) uYW.get(Integer.valueOf(4));
        if (typeface != null) {
            return typeface;
        }
        typeface = Typeface.createFromAsset(context.getAssets(), Hc(4));
        uYW.put(Integer.valueOf(4), typeface);
        return typeface;
    }

    public static String Hc(int i) {
        switch (i) {
            case 0:
                return "fonts/WeChatSansSS-Medium.ttf";
            case 1:
                return "fonts/WeChatSansSS-Bold.ttf";
            case 2:
                return "fonts/WeChatSansSS-Light.ttf";
            case 3:
                return "fonts/WeChatSansSS-Regular.ttf";
            case 4:
                return "fonts/WeChatSansStd-Medium.ttf";
            case 5:
                return "fonts/WeChatSansStd-Bold.ttf";
            case 6:
                return "fonts/WeChatSansStd-Light.ttf";
            case 7:
                return "fonts/WeChatSansStd-Regular.ttf";
            default:
                return "fonts/WeChatSansSS-Medium.ttf";
        }
    }

    public static void setNoSystemInputOnEditText(EditText editText) {
        if (VERSION.SDK_INT < 11) {
            editText.setInputType(0);
            return;
        }
        Class cls = EditText.class;
        try {
            Method method = cls.getMethod("setShowSoftInputOnFocus", new Class[]{Boolean.TYPE});
            method.setAccessible(false);
            method.invoke(editText, new Object[]{Boolean.valueOf(false)});
        } catch (NoSuchMethodException e) {
            x.e("erik", "setShowSoftInputOnFocus exception!");
            try {
                Method method2 = cls.getMethod("setSoftInputShownOnFocus", new Class[]{Boolean.TYPE});
                method2.setAccessible(false);
                method2.invoke(editText, new Object[]{Boolean.valueOf(false)});
            } catch (Throwable e2) {
                editText.setInputType(0);
                x.printErrStackTrace("MicroMsg.WalletBaseUtil ", e2, "", new Object[0]);
            }
        } catch (Throwable e22) {
            x.printErrStackTrace("MicroMsg.WalletBaseUtil ", e22, "", new Object[0]);
        }
    }

    public static void cDN() {
    }

    public static String e(double d, String str) {
        if ("CNY".equals(str)) {
            return String.format("¥%.2f", new Object[]{Double.valueOf(d)});
        } else if ("ZAR".equals(str)) {
            return String.format("R%.2f", new Object[]{Double.valueOf(d)});
        } else if ("1".equals(str) || bi.oW(str)) {
            return String.format(v.cDm() + "%.2f", new Object[]{Double.valueOf(d)});
        } else {
            return String.format(str + "%.2f", new Object[]{Double.valueOf(d)});
        }
    }

    public static String abW(String str) {
        if ("CNY".equals(str)) {
            return "¥";
        }
        if ("ZAR".equals(str)) {
            return "R";
        }
        if ("1".equals(str) || bi.oW(str)) {
            return v.cDm();
        }
        return str;
    }

    public static String B(double d) {
        return e(d, "");
    }

    public static String A(double d) {
        return String.format("%.2f", new Object[]{Double.valueOf(d)});
    }

    public static String abX(String str) {
        if ("CNY".equals(str) || "1".equals(str) || bi.oW(str)) {
            return "¥";
        }
        return str;
    }

    public static String hb(int i) {
        if (hZW == null) {
            hZW = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        }
        return hZW.format(new Date(((long) i) * 1000));
    }

    public static String Hd(int i) {
        return a(i, new SimpleDateFormat("MM-dd HH:mm"), new SimpleDateFormat("yyyy-MM-dd HH:mm"));
    }

    public static String a(int i, SimpleDateFormat simpleDateFormat, SimpleDateFormat simpleDateFormat2) {
        long j = ((long) i) * 1000;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.setTimeInMillis(j);
        if (gregorianCalendar.get(1) == gregorianCalendar2.get(1)) {
            return simpleDateFormat.format(new Date(j));
        }
        return simpleDateFormat2.format(new Date(j));
    }

    public static void ac(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            x.v("MicroMsg.WalletBaseUtil ", "username is null");
        } else if (s.he(str)) {
            bD(context, str);
        } else {
            ab(context, str);
        }
    }

    public static void l(Context context, String str, boolean z) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", z);
        d.b(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent);
    }

    public static void r(Context context, String str, int i) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        d.b(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, i);
    }

    public static void ab(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            x.v("MicroMsg.WalletBaseUtil ", "username is null");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("Contact_User", str);
        intent.putExtra("force_get_contact", true);
        d.b(context, "profile", ".ui.ContactInfoUI", intent);
    }

    public static void hh(Context context) {
        if (context == null) {
            x.e("MicroMsg.WalletBaseUtil ", "hy: jump to preference error. context is null");
            return;
        }
        Intent intent = new Intent();
        intent.addFlags(67108864);
        intent.putExtra("preferred_tab", 3);
        d.e(context, "com.tencent.mm.ui.LauncherUI", intent);
    }

    public static void bD(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            x.v("MicroMsg.WalletBaseUtil ", "username is null");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("Chat_User", str);
        intent.putExtra("finish_direct", true);
        d.e(context, ".ui.chatting.ChattingUI", intent);
    }

    public static boolean abY(String str) {
        if (qPR.matcher(str).matches()) {
            return true;
        }
        return false;
    }

    public static String abZ(String str) {
        if (bi.oW(str)) {
            return str;
        }
        String str2 = "";
        for (int i = 0; i < str.length() - 1; i++) {
            str2 = str2 + "*";
        }
        return str2 + str.substring(str.length() - 1, str.length());
    }

    public static boolean k(JSONObject jSONObject, String str) {
        return "1".equals(jSONObject.optString(str, "0"));
    }

    public static String getUsername() {
        g.Eg().Ds();
        return q.GF();
    }

    public static String aca(String str) {
        if (str == null || str.length() <= 8) {
            return str;
        }
        int length = str.length();
        String substring = str.substring(0, length - 8);
        return substring + "****" + str.substring(length - 4);
    }

    public static String acb(String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        String substring = str.substring(1, str.length());
        x.d("MicroMsg.WalletBaseUtil ", "tail : " + substring);
        String substring2 = str.substring(0, 1);
        x.d("MicroMsg.WalletBaseUtil ", "head : " + substring2);
        x.d("MicroMsg.WalletBaseUtil ", "after : " + substring2);
        return "*" + substring;
    }

    public static String acc(String str) {
        if (str == null || str.length() < 2) {
            return acb(str);
        }
        return "**" + str.substring(str.length() - 1, str.length());
    }

    public static void a(Context context, String str, String str2, boolean z, boolean z2) {
        List linkedList = new LinkedList();
        List linkedList2 = new LinkedList();
        linkedList.add(context.getString(i.wallet_card_aggreement_user));
        linkedList2.add(Integer.valueOf(0));
        if (str != null && z2) {
            linkedList.add(context.getString(i.wallet_card_aggreement_bank));
            linkedList2.add(Integer.valueOf(1));
        }
        if (z && !bi.oW(str2)) {
            linkedList.add(context.getString(i.wallet_card_agreemnet_wxcredit_bank, new Object[]{str2}));
            linkedList2.add(Integer.valueOf(2));
            linkedList.add(context.getString(i.wallet_card_agreemnet_wxcredit_get, new Object[]{str2}));
            linkedList2.add(Integer.valueOf(3));
        }
        h.a(context, "", linkedList, linkedList2, "", new 1(context, str));
    }

    public static void e(MMActivity mMActivity, String str) {
        Intent intent = new Intent();
        intent.putExtra("BaseScanUI_select_scan_mode", 7);
        intent.putExtra("bank_card_owner", str);
        d.b((Context) mMActivity, "scanner", ".ui.BaseScanUI", intent);
    }

    public static String gT(String str) {
        String BL;
        g.Ek();
        ab Yf = ((com.tencent.mm.plugin.messenger.foundation.a.i) g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yf(str);
        if (Yf != null) {
            BL = Yf.BL();
        } else {
            BL = null;
        }
        return bi.oW(BL) ? str : BL;
    }

    public static void bE(Context context, String str) {
        if (!bi.oW(str)) {
            Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + str));
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static long C(double d) {
        return Math.round(100.0d * d);
    }

    public static void a(c... cVarArr) {
        g.Ek();
        g.Eh().dpP.a(new bg(new 2(cVarArr)), 0);
    }

    public static void a(String str, b bVar) {
        g.Ek();
        g.Eh().dpP.a(new bg(new 3(str, bVar)), 0);
    }

    public static void cDO() {
        g.Ek();
        g.Eh().dpP.a(new bg(new 4()), 0);
    }

    public static String acd(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        int length = str.length() / 4;
        for (int i = 0; i < length + 1; i++) {
            int min = Math.min((i + 1) * 4, str.length());
            stringBuilder.append(go(str.substring(i * 4, min), ""));
            if (min - (i * 4) == 4) {
                for (min = 0; min < 4; min++) {
                    stringBuilder.append(" ");
                }
            }
        }
        return stringBuilder.toString();
    }

    public static String ace(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        int length = str.length() / 4;
        for (int i = 0; i < length; i++) {
            int min = Math.min((i + 1) * 4, str.length());
            if (min + 4 > str.length()) {
                min = str.length();
            }
            stringBuilder.append(go(str.substring(i * 4, min), " "));
            if (min - (i * 4) == 4) {
                for (min = 0; min < 6; min++) {
                    stringBuilder.append(" ");
                }
            }
        }
        return stringBuilder.toString();
    }

    public static void ai(ArrayList<Bitmap> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            for (int size = arrayList.size() - 1; size > 0; size--) {
                x((Bitmap) arrayList.remove(size));
            }
        }
    }

    public static void x(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    public static Bitmap w(Bitmap bitmap) {
        boolean z = true;
        Matrix matrix = new Matrix();
        matrix.reset();
        matrix.setRotate(90.0f, (float) (bitmap.getWidth() / 2), (float) (bitmap.getHeight() / 2));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        String str = "MicroMsg.WalletBaseUtil ";
        StringBuilder stringBuilder = new StringBuilder("resultBmp is null: ");
        if (createBitmap != null) {
            z = false;
        }
        x.d(str, stringBuilder.append(z).append("  degree:90.0").toString());
        return createBitmap;
    }

    private static String go(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(str.substring(i, i + 1));
            if (i != str.length() - 1) {
                stringBuilder.append(str2);
            }
        }
        return stringBuilder.toString();
    }

    public static void bF(Context context, String str) {
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("pay_channel", 1);
        d.b(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent);
    }

    public static void a(String[] strArr, a aVar) {
        g.Ek();
        g.Eh().dpP.a(new bg(new 5(strArr, aVar)), 0);
    }

    public static void He(int i) {
        com.tencent.mm.plugin.report.service.h.mEJ.h(12719, new Object[]{Integer.valueOf(i), Integer.valueOf(1)});
    }

    public static void a(TextView textView, String str, String str2, String str3) {
        if (textView == null) {
            x.e("MicroMsg.WalletBaseUtil ", "hy: text view is null.");
        } else if (bi.oW(str2)) {
            x.w("MicroMsg.WalletBaseUtil ", "hy: msg is null. set text view to gone");
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str2);
            f.eA(acf(str), 0);
            if (!bi.oW(str3)) {
                textView.setOnClickListener(new 6(str3, textView, str));
            }
        }
    }

    private static int acf(String str) {
        if ("1".equals(str)) {
            return 0;
        }
        if ("2".equals(str)) {
            return 4;
        }
        if ("3".equals(str)) {
            return 12;
        }
        if ("4".equals(str)) {
            return 2;
        }
        if ("5".equals(str)) {
            return 8;
        }
        if ("6".equals(str)) {
            return 14;
        }
        if ("7".equals(str)) {
            return 16;
        }
        if ("8".equals(str)) {
            return 10;
        }
        return -1;
    }

    public static void a(int i, long j, int i2) {
        com.tencent.mm.plugin.report.service.h.mEJ.h(13375, new Object[]{Integer.valueOf(i), Integer.valueOf(1), Long.valueOf(j), Integer.valueOf(i2)});
    }

    public static String acg(String str) {
        if (!bi.oW(str) && str.length() > 14) {
            return str.substring(0, 14) + "...";
        }
        return str;
    }

    public static String dx(String str, int i) {
        if (!bi.oW(str) && str.length() > i) {
            return str.substring(0, i) + "...";
        }
        return str;
    }

    public static String dy(String str, int i) {
        return dx(gT(str), i);
    }

    public static void f(TextView textView, String str) {
        textView.setText(j.a(textView.getContext(), dy(str, 10), textView.getTextSize()));
    }

    public static double a(String str, String str2, RoundingMode roundingMode) {
        return b(str, str2, roundingMode).doubleValue();
    }

    public static BigDecimal b(String str, String str2, RoundingMode roundingMode) {
        try {
            return new BigDecimal(bi.getDouble(str, 0.0d) == 0.0d ? "0" : str.trim()).divide(new BigDecimal(str2.trim())).setScale(2, roundingMode);
        } catch (Throwable e) {
            x.printErrStackTrace("MicroMsg.WalletBaseUtil ", e, "", new Object[0]);
            return new BigDecimal(0);
        }
    }

    public static int gp(String str, String str2) {
        return c(str, str2, RoundingMode.HALF_UP).intValue();
    }

    public static long gq(String str, String str2) {
        return c(str, str2, RoundingMode.HALF_UP).longValue();
    }

    public static BigDecimal c(String str, String str2, RoundingMode roundingMode) {
        try {
            return new BigDecimal(bi.getDouble(str, 0.0d) == 0.0d ? "0" : str.trim()).multiply(new BigDecimal(bi.getDouble(str2, 0.0d) == 0.0d ? "0" : str2.trim())).setScale(0, roundingMode);
        } catch (Throwable e) {
            x.printErrStackTrace("MicroMsg.WalletBaseUtil ", e, "", new Object[0]);
            return new BigDecimal(0);
        }
    }
}
