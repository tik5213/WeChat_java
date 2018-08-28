package com.tencent.mm.plugin.game.gamewebview.model;

import android.os.Bundle;
import com.tencent.mm.plugin.webview.model.d.a;
import com.tencent.mm.sdk.platformtools.x;

public final class d implements a {
    public final void a(boolean z, int i, int i2, String str, String str2) {
        x.i("MicroMsg.GameWebViewCdnProgressCallback", "onWebView cdn callback progress, upload : %b, mediaType : %d, percent : %d, localid : %s, mediaId : %s", new Object[]{Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), str, str2});
        if (z) {
            Bundle bundle = new Bundle();
            bundle.putInt("mm_to_client_notify_type", 1);
            bundle.putString("js_event_name", "onMediaFileUploadProgress");
            bundle.putString("webview_jssdk_file_item_local_id", str);
            bundle.putInt("webview_jssdk_file_item_progreess", i2);
            com.tencent.mm.plugin.game.gamewebview.ipc.a.z(bundle);
        }
    }
}
