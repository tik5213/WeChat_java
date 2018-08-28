package com.tencent.mm.plugin.gallery.ui;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.mm.plugin.gallery.stub.a$a;
import com.tencent.mm.sdk.platformtools.x;

class ImagePreviewUI$1 implements ServiceConnection {
    final /* synthetic */ ImagePreviewUI jEa;

    ImagePreviewUI$1(ImagePreviewUI imagePreviewUI) {
        this.jEa = imagePreviewUI;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        x.d("MicroMsg.ImagePreviewUI", "onServiceConnected");
        ImagePreviewUI.a(this.jEa, a$a.Q(iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        x.d("MicroMsg.ImagePreviewUI", "onServiceDisconnected");
        ImagePreviewUI.a(this.jEa, null);
    }
}
