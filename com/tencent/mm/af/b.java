package com.tencent.mm.af;

import com.tencent.mm.sdk.platformtools.x;
import java.io.InputStream;
import java.io.ObjectInputStream;

public final class b {
    public static Object l(InputStream inputStream) {
        Object readObject;
        Exception e;
        Throwable th;
        ObjectInputStream readObject2 = null;
        ObjectInputStream objectInputStream;
        try {
            objectInputStream = new ObjectInputStream(inputStream);
            try {
                readObject2 = objectInputStream.readObject();
                try {
                    objectInputStream.close();
                } catch (Exception e2) {
                    x.w("MicroMsg.ObjectUtil", "Read close exception:" + e2.getMessage());
                }
            } catch (Exception e3) {
                e2 = e3;
            }
        } catch (Exception e4) {
            e2 = e4;
            objectInputStream = readObject2;
            try {
                x.w("MicroMsg.ObjectUtil", "Read exception:" + e2.getMessage());
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (Exception e22) {
                        x.w("MicroMsg.ObjectUtil", "Read close exception:" + e22.getMessage());
                    }
                }
                return readObject2;
            } catch (Throwable th2) {
                th = th2;
                if (objectInputStream != null) {
                    try {
                        objectInputStream.close();
                    } catch (Exception e5) {
                        x.w("MicroMsg.ObjectUtil", "Read close exception:" + e5.getMessage());
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            objectInputStream = readObject2;
            if (objectInputStream != null) {
                try {
                    objectInputStream.close();
                } catch (Exception e52) {
                    x.w("MicroMsg.ObjectUtil", "Read close exception:" + e52.getMessage());
                }
            }
            throw th;
        }
        return readObject2;
    }
}
