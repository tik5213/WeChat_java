package com.tencent.mm.plugin.sns.ui;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

class SnsOnlineVideoActivity$4 extends SimpleOnGestureListener {
    final /* synthetic */ SnsOnlineVideoActivity nZl;

    SnsOnlineVideoActivity$4(SnsOnlineVideoActivity snsOnlineVideoActivity) {
        this.nZl = snsOnlineVideoActivity;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float rawX = motionEvent2.getRawX() - motionEvent.getRawX();
        float rawY = motionEvent2.getRawY() - motionEvent.getRawY();
        if (Math.abs(rawX) <= ((float) SnsOnlineVideoActivity.a(this.nZl).getWidth()) && Math.abs(rawY) <= ((float) SnsOnlineVideoActivity.a(this.nZl).getHeight()) && SnsOnlineVideoActivity.b(this.nZl)) {
            SnsOnlineVideoActivity.c(this.nZl).setTranslationX(rawX);
            SnsOnlineVideoActivity.c(this.nZl).setTranslationY(rawY);
        }
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        SnsOnlineVideoActivity.a(this.nZl, true);
        super.onLongPress(motionEvent);
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.nZl.ayH();
        return super.onSingleTapUp(motionEvent);
    }
}
