package com.tencent.mm.plugin.wallet_payu.security_question.model;

import com.tencent.mm.wallet_core.e.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d extends a {
    public ArrayList<PayUSecurityQuestion> pGk;

    public d() {
        F(new HashMap());
    }

    public final int bOo() {
        return 11;
    }

    public final void a(int i, String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            this.pGk = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("security_question_list");
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        this.pGk.add(new PayUSecurityQuestion(optJSONObject.optString("id"), optJSONObject.optString("description")));
                    }
                }
            }
        }
    }
}
