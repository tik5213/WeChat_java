package com.tencent.mm.plugin.emoji.ui.v2;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.widget.MMLoadScrollView$a;

class EmojiStoreV2RewardDetailUI$2 implements MMLoadScrollView$a {
    final /* synthetic */ EmojiStoreV2RewardDetailUI iqc;

    EmojiStoreV2RewardDetailUI$2(EmojiStoreV2RewardDetailUI emojiStoreV2RewardDetailUI) {
        this.iqc = emojiStoreV2RewardDetailUI;
    }

    public final void aGo() {
        x.i("MicroMsg.emoji.EmojiStoreV2RewardDetailUI", "onBottom");
        EmojiStoreV2RewardDetailUI.b(this.iqc);
    }
}
