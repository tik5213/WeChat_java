package org.b.f;

import java.security.Key;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.b.g.c;
import org.b.g.d;

public final class a implements b {
    public final String aw(String str, String str2, String str3) {
        try {
            d.gE(str, "Base string cant be null or empty string");
            d.gE(str2, "Api secret cant be null or empty string");
            Key secretKeySpec = new SecretKeySpec((c.encode(str2) + '&' + c.encode(str3)).getBytes("UTF-8"), "HmacSHA1");
            Mac instance = Mac.getInstance("HmacSHA1");
            instance.init(secretKeySpec);
            return new String(org.b.g.a.ci(instance.doFinal(str.getBytes("UTF-8")))).replace("\r\n", "");
        } catch (Exception e) {
            throw new org.b.b.d(str, e);
        }
    }

    public final String cKD() {
        return "HMAC-SHA1";
    }
}
