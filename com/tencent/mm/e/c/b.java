package com.tencent.mm.e.c;

import com.tencent.mm.sdk.platformtools.x;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class b {
    DataOutputStream bFA;
    int bFB;
    public String mFilePath;

    public b(String str, int i, int i2) {
        this.mFilePath = str;
        File file = new File(str);
        try {
            file.createNewFile();
            this.bFA = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            ByteBuffer allocate = ByteBuffer.allocate(44);
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            allocate.putInt(1179011410);
            allocate.putInt(0);
            allocate.putInt(1163280727);
            allocate.putInt(544501094);
            allocate.putInt(16);
            allocate.putShort((short) 1);
            allocate.putShort((short) i);
            allocate.putInt(i2);
            allocate.putInt((i2 * i) * 2);
            allocate.putShort((short) (i * 2));
            allocate.putShort((short) 16);
            allocate.putInt(1635017060);
            allocate.putInt(0);
            this.bFB = 44;
            this.bFA.write(allocate.array());
        } catch (IOException e) {
            x.e("MicroMsg.PcmWriter", "create file failed: " + e.getMessage());
        }
    }

    public final boolean w(byte[] bArr, int i) {
        if (this.bFA == null) {
            return false;
        }
        try {
            this.bFA.write(bArr, 0, i);
            this.bFB += i;
            return true;
        } catch (Exception e) {
            x.e("MicroMsg.PcmWriter", "write to file failed: " + e.getMessage());
            return false;
        }
    }

    public final void wC() {
        Throwable e;
        try {
            this.bFA.close();
        } catch (IOException e2) {
            x.e("MicroMsg.PcmWriter", "close file failed: " + e2.getMessage());
        }
        RandomAccessFile randomAccessFile;
        try {
            randomAccessFile = new RandomAccessFile(this.mFilePath, "rw");
            try {
                randomAccessFile.seek(4);
                ByteBuffer allocate = ByteBuffer.allocate(4);
                allocate.order(ByteOrder.LITTLE_ENDIAN);
                allocate.putInt(this.bFB - 8);
                randomAccessFile.write(allocate.array());
                allocate.rewind();
                allocate.putInt(this.bFB - 42);
                randomAccessFile.seek(40);
                randomAccessFile.write(allocate.array());
                try {
                    randomAccessFile.close();
                } catch (Throwable e3) {
                    x.printErrStackTrace("MicroMsg.PcmWriter", e3, "", new Object[0]);
                }
            } catch (FileNotFoundException e4) {
                e3 = e4;
                try {
                    x.printErrStackTrace("MicroMsg.PcmWriter", e3, "", new Object[0]);
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable e32) {
                            x.printErrStackTrace("MicroMsg.PcmWriter", e32, "", new Object[0]);
                        }
                    }
                } catch (Throwable th) {
                    e32 = th;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable e5) {
                            x.printErrStackTrace("MicroMsg.PcmWriter", e5, "", new Object[0]);
                        }
                    }
                    throw e32;
                }
            } catch (IOException e6) {
                e32 = e6;
                x.printErrStackTrace("MicroMsg.PcmWriter", e32, "", new Object[0]);
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable e322) {
                        x.printErrStackTrace("MicroMsg.PcmWriter", e322, "", new Object[0]);
                    }
                }
            }
        } catch (FileNotFoundException e7) {
            e322 = e7;
            randomAccessFile = null;
            x.printErrStackTrace("MicroMsg.PcmWriter", e322, "", new Object[0]);
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (Throwable e3222) {
                    x.printErrStackTrace("MicroMsg.PcmWriter", e3222, "", new Object[0]);
                }
            }
        } catch (IOException e8) {
            e3222 = e8;
            randomAccessFile = null;
            x.printErrStackTrace("MicroMsg.PcmWriter", e3222, "", new Object[0]);
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (Throwable e32222) {
                    x.printErrStackTrace("MicroMsg.PcmWriter", e32222, "", new Object[0]);
                }
            }
        } catch (Throwable th2) {
            e32222 = th2;
            randomAccessFile = null;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (Throwable e52) {
                    x.printErrStackTrace("MicroMsg.PcmWriter", e52, "", new Object[0]);
                }
            }
            throw e32222;
        }
    }
}
