package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;
import com.tencent.mm.R;
import com.tencent.mm.ui.base.h;

class UploadMediaFileHelp$9 implements OnKeyListener {
    final /* synthetic */ Context val$context;

    UploadMediaFileHelp$9(Context context) {
        this.val$context = context;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        h.a(this.val$context, true, this.val$context.getString(R.l.webview_jssdk_video_uploading_tips), "", this.val$context.getString(R.l.webview_jssdk_upload_video_cancel), this.val$context.getString(R.l.webview_jssdk_upload_video_continue), new 1(this), new 2(this));
        return true;
    }
}
