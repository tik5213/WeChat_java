package com.tencent.mm.ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.widget.EditText;
import com.tencent.mm.sdk.platformtools.x;

public class AutoMatchKeywordEditText extends MMEditText {
    private a uFU;
    private int uFV;
    private int uFW;

    public interface a {
        void b(EditText editText, int i, int i2);
    }

    public AutoMatchKeywordEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    public AutoMatchKeywordEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    private void init() {
        this.uFV = getSelectionStart();
        this.uFW = getSelectionEnd();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (this.uFV != selectionStart || this.uFW != selectionEnd) {
            this.uFV = selectionStart;
            this.uFW = selectionEnd;
            if (this.uFU != null) {
                this.uFU.b(this, getSelectionStart(), getSelectionEnd());
            }
        }
    }

    public void setSelection(int i) {
        x.d("MicroMsg.AutoMatchKeywordEditText", "setSelection");
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        super.setSelection(i);
        this.uFV = getSelectionStart();
        this.uFW = getSelectionEnd();
        if ((selectionStart != getSelectionStart() || selectionEnd != getSelectionEnd()) && this.uFU != null) {
            this.uFU.b(this, getSelectionStart(), getSelectionEnd());
        }
    }

    public void setSelection(int i, int i2) {
        x.d("MicroMsg.AutoMatchKeywordEditText", "setSelection.");
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        super.setSelection(i, i2);
        this.uFV = getSelectionStart();
        this.uFW = getSelectionEnd();
        if ((selectionStart != getSelectionStart() || selectionEnd != getSelectionEnd()) && this.uFU != null) {
            this.uFU.b(this, getSelectionStart(), getSelectionEnd());
        }
    }

    public void extendSelection(int i) {
        x.d("MicroMsg.AutoMatchKeywordEditText", "extendSelection");
        super.extendSelection(i);
        this.uFV = getSelectionStart();
        this.uFW = getSelectionEnd();
    }

    public boolean moveCursorToVisibleOffset() {
        x.d("MicroMsg.AutoMatchKeywordEditText", "moveCursorToVisibleOffset");
        return super.moveCursorToVisibleOffset();
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        x.d("MicroMsg.AutoMatchKeywordEditText", "performAccessibilityAction");
        return super.performAccessibilityAction(i, bundle);
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        x.d("MicroMsg.AutoMatchKeywordEditText", "onDragEvent");
        return super.onDragEvent(dragEvent);
    }

    public a getOnSelectionChangeListener() {
        return this.uFU;
    }

    public void setOnSelectionChangeListener(a aVar) {
        this.uFU = aVar;
    }
}
