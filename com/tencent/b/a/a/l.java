package com.tencent.b.a.a;

final class l {
    static byte[] encrypt(byte[] bArr, byte[] bArr2) {
        int i = 0;
        int[] iArr = new int[256];
        int[] iArr2 = new int[256];
        int length = bArr2.length;
        if (length <= 0 || length > 256) {
            throw new IllegalArgumentException("key must be between 1 and 256 bytes");
        }
        int i2;
        for (i2 = 0; i2 < 256; i2++) {
            iArr[i2] = i2;
            iArr2[i2] = bArr2[i2 % length];
        }
        i2 = 0;
        for (length = 0; length < 256; length++) {
            i2 = ((i2 + iArr[length]) + iArr2[length]) & 255;
            int i3 = iArr[length];
            iArr[length] = iArr[i2];
            iArr[i2] = i3;
        }
        byte[] bArr3 = new byte[bArr.length];
        i2 = 0;
        length = 0;
        while (true) {
            int i4 = i;
            if (i2 >= bArr.length) {
                return bArr3;
            }
            i = (length + 1) & 255;
            i4 = (iArr[i] + i4) & 255;
            length = iArr[i];
            iArr[i] = iArr[i4];
            iArr[i4] = length;
            length = (byte) (iArr[(iArr[i] + iArr[i4]) & 255] ^ bArr[i2]);
            bArr3[i2] = length;
            i2++;
        }
    }
}
