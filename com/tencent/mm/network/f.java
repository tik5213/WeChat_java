package com.tencent.mm.network;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.tencent.mm.network.a.b;
import com.tencent.mm.protocal.x;
import java.util.ArrayList;
import java.util.List;

public interface f extends IInterface {

    public static abstract class a extends Binder implements f {

        private static class a implements f {
            private IBinder mRemote;

            a(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            public final IBinder asBinder() {
                return this.mRemote;
            }

            public final int a(r rVar, l lVar) {
                IBinder iBinder = null;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeStrongBinder(rVar != null ? rVar.asBinder() : null);
                    if (lVar != null) {
                        iBinder = lVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void cancel(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeInt(i);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final d Ux() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    d A = com.tencent.mm.network.d.a.A(obtain2.readStrongBinder());
                    return A;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void reset() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(x xVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeStrongBinder(xVar != null ? xVar.asBinder() : null);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(boolean z, String str, String str2, int[] iArr, int[] iArr2, int i, int i2, String str3, String str4) {
                int i3 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    if (z) {
                        i3 = 1;
                    }
                    obtain.writeInt(i3);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeIntArray(iArr);
                    obtain.writeIntArray(iArr2);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final String[] getIPsString(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    String[] createStringArray = obtain2.createStringArray();
                    return createStringArray;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final String getNetworkServerIp() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void bC(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void d(String str, String str2, String str3, String str4) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeString(str3);
                    obtain.writeString(str4);
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void setNewDnsDebugHost(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void Uy() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    this.mRemote.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean Lh() {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    this.mRemote.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(b bVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    this.mRemote.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void kg(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeString(str);
                    this.mRemote.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final i Uz() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    this.mRemote.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    i C = com.tencent.mm.network.i.a.C(obtain2.readStrongBinder());
                    return C;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final int getHostByName(String str, List<String> list) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeString(str);
                    this.mRemote.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.readStringList(list);
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final int a(boolean z, List<String> list) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.mRemote.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                    i = obtain2.readInt();
                    obtain2.readStringList(list);
                    return i;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final int a(String str, boolean z, List<String> list) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeString(str);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.mRemote.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                    i = obtain2.readInt();
                    obtain2.readStringList(list);
                    return i;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void reportFailIp(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeString(str);
                    this.mRemote.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void setHostInfo(String[] strArr, String[] strArr2, int[] iArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeStringArray(strArr);
                    obtain.writeStringArray(strArr2);
                    obtain.writeIntArray(iArr);
                    this.mRemote.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(int i, String str, int i2, boolean z) {
                int i3 = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeInt(i);
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    if (z) {
                        i3 = 1;
                    }
                    obtain.writeInt(i3);
                    this.mRemote.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void Lt() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    this.mRemote.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final String getIspId() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    this.mRemote.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final int h(int i, byte[] bArr) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeInt(i);
                    obtain.writeByteArray(bArr);
                    this.mRemote.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void setSignallingStrategy(long j, long j2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeLong(j);
                    obtain.writeLong(j2);
                    this.mRemote.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void keepSignalling() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    this.mRemote.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void stopSignalling() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    this.mRemote.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(o oVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    this.mRemote.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(s sVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeStrongBinder(sVar != null ? sVar.asBinder() : null);
                    this.mRemote.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(g gVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    this.mRemote.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void kh(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeString(str);
                    this.mRemote.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void bD(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.mRemote.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void bE(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.mRemote.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void bF(boolean z) {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.mRemote.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void Lu() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    this.mRemote.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(h hVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.tencent.mm.network.IDispatcher_AIDL");
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    this.mRemote.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.tencent.mm.network.IDispatcher_AIDL");
        }

        public static f B(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.network.IDispatcher_AIDL");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof f)) {
                return new a(iBinder);
            }
            return (f) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            h hVar = null;
            boolean z = false;
            IInterface queryLocalInterface;
            int a;
            IBinder asBinder;
            IBinder readStrongBinder;
            String networkServerIp;
            int i3;
            switch (i) {
                case 1:
                    l aVar;
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    r F = com.tencent.mm.network.r.a.F(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        queryLocalInterface = readStrongBinder2.queryLocalInterface("com.tencent.mm.network.IOnGYNetEnd_AIDL");
                        aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof l)) ? new a(readStrongBinder2) : (l) queryLocalInterface;
                    }
                    a = a(F, aVar);
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    return true;
                case 2:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    cancel(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    d Ux = Ux();
                    parcel2.writeNoException();
                    if (Ux != null) {
                        asBinder = Ux.asBinder();
                    }
                    parcel2.writeStrongBinder(asBinder);
                    return true;
                case 4:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    reset();
                    parcel2.writeNoException();
                    return true;
                case 5:
                    x aVar2;
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.protocal.MMSyncCheckCoder_AIDL");
                        aVar2 = (queryLocalInterface == null || !(queryLocalInterface instanceof x)) ? new a(readStrongBinder) : (x) queryLocalInterface;
                    }
                    a(aVar2);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(z, parcel.readString(), parcel.readString(), parcel.createIntArray(), parcel.createIntArray(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    String[] iPsString = getIPsString(z);
                    parcel2.writeNoException();
                    parcel2.writeStringArray(iPsString);
                    return true;
                case 8:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    networkServerIp = getNetworkServerIp();
                    parcel2.writeNoException();
                    parcel2.writeString(networkServerIp);
                    return true;
                case 9:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    bC(z);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    setNewDnsDebugHost(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    Uy();
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    boolean Lh = Lh();
                    parcel2.writeNoException();
                    if (Lh) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 14:
                    b aVar3;
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.network.connpool.IConnPoolMoniter_AIDL");
                        aVar3 = (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new a(readStrongBinder) : (b) queryLocalInterface;
                    }
                    a(aVar3);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    kg(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    i Uz = Uz();
                    parcel2.writeNoException();
                    if (Uz != null) {
                        asBinder = Uz.asBinder();
                    }
                    parcel2.writeStrongBinder(asBinder);
                    return true;
                case 17:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    networkServerIp = parcel.readString();
                    List arrayList = new ArrayList();
                    a = getHostByName(networkServerIp, arrayList);
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    parcel2.writeStringList(arrayList);
                    return true;
                case 18:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    List arrayList2 = new ArrayList();
                    i3 = a(z, arrayList2);
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    parcel2.writeStringList(arrayList2);
                    return true;
                case 19:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    networkServerIp = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    List arrayList3 = new ArrayList();
                    a = a(networkServerIp, z, arrayList3);
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    parcel2.writeStringList(arrayList3);
                    return true;
                case 20:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    reportFailIp(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    setHostInfo(parcel.createStringArray(), parcel.createStringArray(), parcel.createIntArray());
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    a = parcel.readInt();
                    String readString = parcel.readString();
                    int readInt = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(a, readString, readInt, z);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    Lt();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    networkServerIp = getIspId();
                    parcel2.writeNoException();
                    parcel2.writeString(networkServerIp);
                    return true;
                case 25:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    a = h(parcel.readInt(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    return true;
                case 26:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    setSignallingStrategy(parcel.readLong(), parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    keepSignalling();
                    parcel2.writeNoException();
                    return true;
                case 28:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    stopSignalling();
                    parcel2.writeNoException();
                    return true;
                case 29:
                    o aVar4;
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.network.IOnReportKV_AIDL");
                        aVar4 = (queryLocalInterface == null || !(queryLocalInterface instanceof o)) ? new a(readStrongBinder) : (o) queryLocalInterface;
                    }
                    a(aVar4);
                    parcel2.writeNoException();
                    return true;
                case 30:
                    s aVar5;
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.network.IWorkerCallback_AIDL");
                        aVar5 = (queryLocalInterface == null || !(queryLocalInterface instanceof s)) ? new a(readStrongBinder) : (s) queryLocalInterface;
                    }
                    a(aVar5);
                    parcel2.writeNoException();
                    return true;
                case 31:
                    g aVar6;
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.network.IIpxxCallback_AIDL");
                        aVar6 = (queryLocalInterface == null || !(queryLocalInterface instanceof g)) ? new a(readStrongBinder) : (g) queryLocalInterface;
                    }
                    a(aVar6);
                    parcel2.writeNoException();
                    return true;
                case 32:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    kh(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 33:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    bD(z);
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    bE(z);
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    bF(z);
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    Lu();
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface("com.tencent.mm.network.IDispatcher_AIDL");
                    readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        queryLocalInterface = readStrongBinder.queryLocalInterface("com.tencent.mm.network.INetworkDiagnoseCallback_AIDL");
                        hVar = (queryLocalInterface == null || !(queryLocalInterface instanceof h)) ? new a(readStrongBinder) : (h) queryLocalInterface;
                    }
                    a(hVar);
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString("com.tencent.mm.network.IDispatcher_AIDL");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    boolean Lh();

    void Lt();

    void Lu();

    d Ux();

    void Uy();

    i Uz();

    int a(r rVar, l lVar);

    int a(String str, boolean z, List<String> list);

    int a(boolean z, List<String> list);

    void a(int i, String str, int i2, boolean z);

    void a(b bVar);

    void a(g gVar);

    void a(h hVar);

    void a(o oVar);

    void a(s sVar);

    void a(x xVar);

    void a(boolean z, String str, String str2, int[] iArr, int[] iArr2, int i, int i2, String str3, String str4);

    void bC(boolean z);

    void bD(boolean z);

    void bE(boolean z);

    void bF(boolean z);

    void cancel(int i);

    void d(String str, String str2, String str3, String str4);

    int getHostByName(String str, List<String> list);

    String[] getIPsString(boolean z);

    String getIspId();

    String getNetworkServerIp();

    int h(int i, byte[] bArr);

    void keepSignalling();

    void kg(String str);

    void kh(String str);

    void reportFailIp(String str);

    void reset();

    void setHostInfo(String[] strArr, String[] strArr2, int[] iArr);

    void setNewDnsDebugHost(String str, String str2);

    void setSignallingStrategy(long j, long j2);

    void stopSignalling();
}
