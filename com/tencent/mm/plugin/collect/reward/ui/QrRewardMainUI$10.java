package com.tencent.mm.plugin.collect.reward.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.mm.sdk.platformtools.x;

class QrRewardMainUI$10 implements OnEditorActionListener {
    final /* synthetic */ QrRewardMainUI hWf;

    QrRewardMainUI$10(QrRewardMainUI qrRewardMainUI) {
        this.hWf = qrRewardMainUI;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        x.i("MicroMsg.QrRewardMainUI", "action: %s", Integer.valueOf(i));
        this.hWf.YC();
        return false;
    }
}
