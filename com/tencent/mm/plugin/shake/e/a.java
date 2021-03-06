package com.tencent.mm.plugin.shake.e;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.tmassistantsdk.logreport.BaseReportManager;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class a {
    public LinkedList<a> egs = new LinkedList();

    public static class a {
        public String nbK;
        public List<String> nbL = new ArrayList();
        public String nbM = "";
        public String nbN = "";
        public String summary;
        public String title;
        public int type;

        public a(int i) {
            this.type = i;
        }
    }

    public static LinkedList<a> m(Map<String, String> map, String str) {
        LinkedList<a> linkedList = new LinkedList();
        int i = 0;
        Object obj = null;
        while (i < BaseReportManager.MAX_READ_COUNT) {
            Object obj2;
            a aVar = new a();
            String str2 = str + ".actionlist" + (i > 0 ? Integer.valueOf(i) : "");
            LinkedList linkedList2 = new LinkedList();
            int i2 = 0;
            while (i2 < BaseReportManager.MAX_READ_COUNT) {
                String str3 = str2 + ".action" + (i2 > 0 ? Integer.valueOf(i2) : "");
                if (!bi.oW((String) map.get(str3 + ".type"))) {
                    try {
                        int intValue = Integer.valueOf((String) map.get(str3 + ".type")).intValue();
                        obj2 = null;
                        if (intValue == 2) {
                            a aVar2 = new a(intValue);
                            aVar2.nbK = bi.oV((String) map.get(str3 + ".comment.id"));
                            aVar2.title = bi.oV((String) map.get(str3 + ".comment.title"));
                            obj2 = aVar2;
                        } else if (intValue == 3) {
                            obj2 = a(map, intValue, str3);
                        } else if (intValue == 4) {
                            obj2 = a(map, intValue, str3);
                        } else if (intValue == 5) {
                            obj2 = a(map, intValue, str3);
                        } else if (intValue == 6) {
                            obj2 = a(map, intValue, str3);
                        }
                        if (obj2 != null) {
                            linkedList2.add(obj2);
                        }
                        i2++;
                        obj = null;
                    } catch (Exception e) {
                        new StringBuilder("Exception in parseActionList: ").append(e.getMessage());
                        if (obj != null) {
                            return linkedList;
                        }
                        aVar.egs = linkedList2;
                        int i3 = 1;
                    }
                } else if (obj != null) {
                    return linkedList;
                } else {
                    aVar.egs = linkedList2;
                    obj2 = 1;
                    linkedList.add(aVar);
                    i++;
                    obj = obj2;
                }
            }
            obj2 = obj;
            linkedList.add(aVar);
            i++;
            obj = obj2;
        }
        return linkedList;
    }

    private static a a(Map<String, String> map, int i, String str) {
        a aVar = new a(i);
        aVar.title = bi.oV((String) map.get(str + ".title"));
        aVar.summary = bi.oV((String) map.get(str + ".summary"));
        String str2 = str + ".thumburl";
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= 100) {
                break;
            }
            String str3 = (String) map.get(str2 + (i3 > 0 ? Integer.valueOf(i3) : ""));
            if (bi.oW(str3)) {
                break;
            }
            aVar.nbL.add(str3);
            i2 = i3 + 1;
        }
        switch (i) {
            case 3:
                aVar.nbK = bi.oV((String) map.get(str + ".h5url.link"));
                aVar.nbM = bi.oV((String) map.get(str + ".h5url.title"));
                aVar.nbN = bi.oV((String) map.get(str + ".h5url.username"));
                break;
            case 4:
                aVar.nbK = bi.oV((String) map.get(str + ".bizprofile.username"));
                aVar.nbM = bi.oV((String) map.get(str + ".bizprofile.showchat"));
                break;
            case 5:
                aVar.nbK = bi.oV((String) map.get(str + ".nativepay.wx_pay_url"));
                break;
            case 6:
                aVar.nbK = bi.oV((String) map.get(str + ".product.product_id"));
                break;
        }
        return aVar;
    }
}
