package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.plugin.game.gamewebview.ui.e;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class bb extends a {
    public static final int CTRL_BYTE = 14;
    public static final String NAME = "showOptionMenu";

    public final void a(d dVar, JSONObject jSONObject, int i) {
        x.i("MicroMsg.GameJsApiShowOptionMenu", "invoke");
        e actionBar = dVar.getActionBar();
        if (actionBar == null) {
            x.i("MicroMsg.GameJsApiShowOptionMenu", "actionBar is null");
            return;
        }
        if (actionBar.jKe != null) {
            actionBar.jKe.jKr.clear();
        }
        dVar.E(i, a.f("showOptionMenu:ok", null));
    }
}
