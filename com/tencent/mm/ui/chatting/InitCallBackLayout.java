package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class InitCallBackLayout extends FrameLayout {
    private boolean hasDrawed;
    private ap tqv;

    public InitCallBackLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.hasDrawed) {
            this.hasDrawed = true;
            if (this.tqv != null) {
                this.tqv.aRL();
            }
        }
    }

    public void setListener(ap apVar) {
        this.tqv = apVar;
    }
}
