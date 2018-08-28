package com.tencent.qbar;

import android.graphics.Bitmap;
import android.graphics.Point;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.plugin.appbrand.jsapi.p.h;
import com.tencent.mm.sdk.platformtools.x;

public class QbarNative {
    public static QbarPossibleInfo vgB = new QbarPossibleInfo(null);
    public byte[] data = new byte[3000];
    public byte[] type = new byte[100];
    public byte[] vgC = new byte[100];
    public int[] vgD = new int[4];
    public byte[] vgE = new byte[h.CTRL_INDEX];
    public int[] vgF = new int[2];
    private int vgG = -1;

    private native int DetectCode(byte[] bArr, int i, int i2, int i3, int i4);

    private static native int Encode(byte[] bArr, int[] iArr, String str, int i, int i2, String str2, int i3);

    private static native int EncodeBitmap(String str, Bitmap bitmap, int i, int i2, int i3, int i4, String str2, int i5);

    public static native int FocusInit(int i, int i2, boolean z, int i3, int i4);

    public static native boolean FocusPro(byte[] bArr, boolean z, boolean[] zArr);

    public static native int FocusRelease();

    private native int GetOneResult(byte[] bArr, byte[] bArr2, byte[] bArr3, int[] iArr, int i);

    private native int GetOneResultReport(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int[] iArr, int[] iArr2, int i);

    private native int GetPossibleInfo(QbarPossibleInfo qbarPossibleInfo, int i);

    private native int GetResults(byte[] bArr, byte[] bArr2, byte[] bArr3, Point[] pointArr, int[] iArr, a aVar, int i);

    private static native String GetVersion();

    private native int Init(int i, int i2, int i3, String str, String str2);

    public static native int QIPUtilYUVCrop(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, int i5, int i6);

    private native int Release(int i);

    private native int ScanImage(byte[] bArr, int i, int i2, int i3, int i4);

    private native int SetReaders(int[] iArr, int i, int i2);

    public static native int focusedEngineForBankcardInit(int i, int i2, int i3, boolean z);

    public static native int focusedEngineGetVersion();

    public static native int focusedEngineProcess(byte[] bArr);

    public static native int focusedEngineRelease();

    private static native int nativeArrayConvert(int i, int i2, byte[] bArr, int[] iArr);

    private static native int nativeCropGray2(byte[] bArr, byte[] bArr2, int i, int i2, int i3);

    private static native int nativeGrayRotateCropSub(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr2, int[] iArr, int i7, int i8);

    public static native int nativeRelease();

    private static native int nativeTransBytes(int[] iArr, byte[] bArr, int i, int i2);

    private static native int nativeTransPixels(int[] iArr, byte[] bArr, int i, int i2);

    private static native int nativeYUVrotate(byte[] bArr, byte[] bArr2, int i, int i2);

    private static native int nativeYUVrotateLess(byte[] bArr, int i, int i2);

    private static native int nativeYuvToCropIntArray(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6);

    static {
        k.b("wechatQrMod", QbarNative.class.getClassLoader());
    }

    public static String getVersion() {
        return GetVersion();
    }

    public static int a(byte[] bArr, int[] iArr, String str, int i, int i2, String str2) {
        return Encode(bArr, iArr, str, i, i2, str2, -1);
    }

    public final int E(int i, String str, String str2) {
        if (this.vgG < 0) {
            this.vgG = Init(2, 0, i, str, str2);
        }
        if (this.vgG < 0) {
            return -1;
        }
        return 1;
    }

    public final int g(int[] iArr, int i) {
        return SetReaders(iArr, i, this.vgG);
    }

    public final int u(byte[] bArr, int i, int i2) {
        return ScanImage(bArr, i, i2, 0, this.vgG);
    }

    public final int release() {
        int Release = Release(this.vgG);
        this.vgG = -1;
        return Release;
    }

    public final int a(StringBuilder stringBuilder, StringBuilder stringBuilder2, StringBuilder stringBuilder3, StringBuilder stringBuilder4, int[] iArr) {
        int GetOneResultReport = GetOneResultReport(this.type, this.data, this.vgC, this.vgE, this.vgF, this.vgD, this.vgG);
        try {
            iArr[0] = this.vgF[0];
            iArr[1] = this.vgF[1];
            String str = new String(this.vgC, 0, this.vgD[2], "UTF-8");
            stringBuilder3.append(str);
            if (str.equals("ANY")) {
                stringBuilder.append(new String(this.type, 0, this.vgD[0], "UTF-8"));
                stringBuilder2.append(new String(this.data, 0, this.vgD[1], "UTF-8"));
                stringBuilder4.append(new String(this.vgE, 0, this.vgD[3], "UTF-8"));
                if (stringBuilder2.length() == 0) {
                    stringBuilder.append(new String(this.type, 0, this.vgD[0], "ASCII"));
                    stringBuilder2.append(new String(this.data, 0, this.vgD[1], "ASCII"));
                    stringBuilder4.append(new String(this.vgE, 0, this.vgD[3], "ASCII"));
                }
            } else {
                stringBuilder.append(new String(this.type, 0, this.vgD[0], str));
                stringBuilder2.append(new String(this.data, 0, this.vgD[1], str));
                stringBuilder4.append(new String(this.vgE, 0, this.vgD[3], str));
            }
        } catch (Throwable e) {
            x.printErrStackTrace("MicroMsg.QbarNative", e, "", new Object[0]);
        }
        return GetOneResultReport;
    }

    public final float cEK() {
        if (GetPossibleInfo(vgB, this.vgG) != 0) {
            return vgB.qrcodeAreaRatio;
        }
        return 0.0f;
    }

    public final int cEL() {
        if (GetPossibleInfo(vgB, this.vgG) != 0) {
            return vgB.hasQrcode;
        }
        return 0;
    }

    public static int a(byte[] bArr, int[] iArr, byte[] bArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (bArr == null || bArr2 == null) {
            return -1;
        }
        return nativeGrayRotateCropSub(bArr2, i, i2, i3, i4, i5, i6, bArr, iArr, i7, 0);
    }

    public static int a(byte[] bArr, byte[] bArr2, int i, int i2) {
        if (bArr2 == null) {
            return -1;
        }
        return nativeYUVrotate(bArr, bArr2, i, i2);
    }

    public static int a(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        if (bArr == null || bArr2 == null) {
            return -1;
        }
        return nativeCropGray2(bArr, bArr2, i, i2, i3);
    }

    public static int a(byte[] bArr, int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        if (bArr == null) {
            return -1;
        }
        return nativeYuvToCropIntArray(bArr, iArr, i, i2, i3, i4, i5, i6);
    }
}