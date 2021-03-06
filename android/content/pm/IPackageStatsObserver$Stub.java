package android.content.pm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class IPackageStatsObserver$Stub extends Binder implements IPackageStatsObserver {
    private static final String DESCRIPTOR = "IPackageStatsObserver";
    static final int TRANSACTION_onGetStatsCompleted = 1;

    public IPackageStatsObserver$Stub() {
        attachInterface(this, DESCRIPTOR);
    }

    public static IPackageStatsObserver asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
        if (queryLocalInterface == null || !(queryLocalInterface instanceof IPackageStatsObserver)) {
            return new Proxy(iBinder);
        }
        return (IPackageStatsObserver) queryLocalInterface;
    }

    public IBinder asBinder() {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                PackageStats packageStats;
                parcel.enforceInterface(DESCRIPTOR);
                if (parcel.readInt() != 0) {
                    packageStats = (PackageStats) PackageStats.CREATOR.createFromParcel(parcel);
                } else {
                    packageStats = null;
                }
                onGetStatsCompleted(packageStats, parcel.readInt() != 0);
                return true;
            case 1598968902:
                parcel2.writeString(DESCRIPTOR);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}
