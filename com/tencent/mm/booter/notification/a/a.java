package com.tencent.mm.booter.notification.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import com.tencent.mm.R;
import com.tencent.mm.a.g;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.h;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.FileInputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public final class a {
    public Bitmap cZd;

    public static Bitmap b(Context context, Bitmap bitmap) {
        if (context == null || bitmap == null) {
            return null;
        }
        if (VERSION.SDK_INT < 11) {
            return bitmap;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(17104902) - context.getResources().getDimensionPixelSize(R.f.mmnotification_chatroom_avatar_margin);
        return c.a(c.a(bitmap, dimensionPixelSize, dimensionPixelSize, false, false), false, (float) context.getResources().getDimensionPixelSize(R.f.mmnotification_chatroom_avatar_corner));
    }

    public static Bitmap D(String str, String str2) {
        Exception e;
        OutOfMemoryError e2;
        if (ai.oW(str)) {
            return null;
        }
        String str3 = h.b(str2, "user_", g.u(str.getBytes()), ".png", 1) + ".bm";
        boolean z = true;
        FileChannel fileChannel = null;
        FileInputStream fileInputStream;
        try {
            File file = new File(str3);
            if (file.exists()) {
                int length = (int) file.length();
                if (length <= 0 || !(length == 36864 || length == 36880)) {
                    x.e("MicroMsg.NotificationAvatar", "SmallBM get bm invalid size:%d file:%s", new Object[]{Integer.valueOf(length), str3});
                    return null;
                }
                fileInputStream = new FileInputStream(str3);
                try {
                    fileChannel = fileInputStream.getChannel();
                    Buffer allocateDirect = ByteBuffer.allocateDirect(36864);
                    fileChannel.read(allocateDirect);
                    allocateDirect.position(0);
                    if (length == 36880) {
                        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(16);
                        fileChannel.read(allocateDirect2);
                        if (allocateDirect2.getLong(0) != 1) {
                            x.e("MicroMsg.NotificationAvatar", "SmallBM get bm header invalid flag:%d size:%d file:%s", new Object[]{Long.valueOf(allocateDirect2.getLong(0)), Integer.valueOf(length), str3});
                            fileChannel.close();
                            fileInputStream.close();
                            return null;
                        }
                        z = false;
                    }
                    x.d("MicroMsg.NotificationAvatar", "SmallBM get bm size:%d shouldRemoveCorner:%b file:%s", new Object[]{Integer.valueOf(length), Boolean.valueOf(z), str3});
                    fileChannel.close();
                    try {
                        fileInputStream.close();
                        Bitmap createBitmap = Bitmap.createBitmap(96, 96, Config.ARGB_8888);
                        createBitmap.copyPixelsFromBuffer(allocateDirect);
                        if (!z) {
                            return createBitmap;
                        }
                        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 9, 9, 78, 78);
                        x.i("MicroMsg.NotificationAvatar", "recycle bitmap:%s", new Object[]{createBitmap.toString()});
                        createBitmap.recycle();
                        return createBitmap2;
                    } catch (Exception e3) {
                        e = e3;
                        fileChannel = null;
                        x.e("MicroMsg.NotificationAvatar", "SmallBM get exception e:%s file:%s", new Object[]{e.getMessage(), str3});
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (Exception e4) {
                                return null;
                            }
                        }
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return null;
                    } catch (OutOfMemoryError e5) {
                        e2 = e5;
                        fileChannel = null;
                        x.e("MicroMsg.NotificationAvatar", "SmallBM get OutOfMemoryError e:%s file:%s", new Object[]{e2.getMessage(), str3});
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (Exception e42) {
                                return null;
                            }
                        }
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return null;
                    }
                } catch (Exception e6) {
                    e = e6;
                    x.e("MicroMsg.NotificationAvatar", "SmallBM get exception e:%s file:%s", new Object[]{e.getMessage(), str3});
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (Exception e422) {
                            return null;
                        }
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return null;
                } catch (OutOfMemoryError e7) {
                    e2 = e7;
                    x.e("MicroMsg.NotificationAvatar", "SmallBM get OutOfMemoryError e:%s file:%s", new Object[]{e2.getMessage(), str3});
                    if (fileChannel != null) {
                        try {
                            fileChannel.close();
                        } catch (Exception e4222) {
                            return null;
                        }
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return null;
                }
            }
            x.w("MicroMsg.NotificationAvatar", "SmallBM get bm file not exsit:%s", new Object[]{str3});
            return null;
        } catch (Exception e8) {
            e = e8;
            fileInputStream = null;
            x.e("MicroMsg.NotificationAvatar", "SmallBM get exception e:%s file:%s", new Object[]{e.getMessage(), str3});
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (Exception e42222) {
                    return null;
                }
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return null;
        } catch (OutOfMemoryError e9) {
            e2 = e9;
            fileInputStream = null;
            x.e("MicroMsg.NotificationAvatar", "SmallBM get OutOfMemoryError e:%s file:%s", new Object[]{e2.getMessage(), str3});
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (Exception e422222) {
                    return null;
                }
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return null;
        }
    }
}
