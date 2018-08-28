package com.tencent.mm.plugin.brandservice.ui.base;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.tencent.mm.plugin.brandservice.b.c;
import com.tencent.mm.sdk.platformtools.ad;

public class b$a {
    public static void a(ImageView imageView, String str, String str2) {
        Bitmap decodeResource = BitmapFactory.decodeResource(ad.getContext().getResources(), c.brand_default_head);
        Drawable drawable = imageView.getDrawable();
        if (drawable == null || !(drawable instanceof b)) {
            drawable = (decodeResource == null || decodeResource.isRecycled()) ? new b(str, str2, (byte) 0) : new b(str, str2, decodeResource, (byte) 0);
            imageView.setImageDrawable(drawable);
            return;
        }
        ((b) drawable).bX(str, str2);
    }
}
