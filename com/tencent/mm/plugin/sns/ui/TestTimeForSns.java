package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.mm.plugin.report.service.g;

public class TestTimeForSns extends FrameLayout {
    public final boolean DEBUG = true;
    public final String TAG = "MicroMsg.TestTimeForSns";
    public long beginTime;
    private boolean hasDrawed;
    private a listener;

    public TestTimeForSns(Context context) {
        super(context);
    }

    public TestTimeForSns(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (!this.hasDrawed) {
            this.hasDrawed = true;
            if (this.listener != null) {
                this.listener.aRL();
            }
        }
        g.vv(10);
        g.vv(22);
    }

    public void setListener(a aVar) {
        this.listener = aVar;
    }

    public boolean hasDrawed() {
        return this.hasDrawed;
    }
}
