package com.tencent.smtt.export.external.interfaces;

import android.graphics.Bitmap;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase.HitTestResult;

public class IX5WebViewBase$HitTestResult$ImageData {
    public Bitmap mBmp;
    public int mImgHeight;
    public int mImgWidth;
    public String mPicUrl;
    public long mRawDataSize;
    final /* synthetic */ HitTestResult this$0;

    public IX5WebViewBase$HitTestResult$ImageData(HitTestResult hitTestResult) {
        this.this$0 = hitTestResult;
    }

    public Bitmap getBitmap() {
        return this.this$0.getBitmapData();
    }
}
