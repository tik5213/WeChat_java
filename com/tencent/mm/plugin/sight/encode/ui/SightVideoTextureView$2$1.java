package com.tencent.mm.plugin.sight.encode.ui;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import com.tencent.mm.plugin.sight.encode.ui.SightVideoTextureView.2;
import com.tencent.mm.sdk.platformtools.x;

class SightVideoTextureView$2$1 implements OnCompletionListener {
    final /* synthetic */ 2 ngV;

    SightVideoTextureView$2$1(2 2) {
        this.ngV = 2;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        x.i("MicroMsg.SightVideoTextureView", "complete playing %s ", new Object[]{this.ngV.ngU});
        this.ngV.ngT.bwB();
    }
}
