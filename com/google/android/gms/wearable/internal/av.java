package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;

public final class av implements Creator<AncsNotificationParcelable> {
    static void a(AncsNotificationParcelable ancsNotificationParcelable, Parcel parcel) {
        int t = b.t(parcel, 20293);
        b.c(parcel, 1, ancsNotificationParcelable.mVersionCode);
        b.c(parcel, 2, ancsNotificationParcelable.mId);
        b.a(parcel, 3, ancsNotificationParcelable.aYu);
        b.a(parcel, 4, ancsNotificationParcelable.bdZ);
        b.a(parcel, 5, ancsNotificationParcelable.bea);
        b.a(parcel, 6, ancsNotificationParcelable.beb);
        b.a(parcel, 7, ancsNotificationParcelable.bec);
        b.a(parcel, 8, ancsNotificationParcelable.baG == null ? ancsNotificationParcelable.aYu : ancsNotificationParcelable.baG);
        b.a(parcel, 9, ancsNotificationParcelable.bed);
        b.a(parcel, 10, ancsNotificationParcelable.bee);
        b.a(parcel, 11, ancsNotificationParcelable.bef);
        b.a(parcel, 12, ancsNotificationParcelable.beg);
        b.u(parcel, t);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int c = a.c(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        byte b = (byte) 0;
        byte b2 = (byte) 0;
        byte b3 = (byte) 0;
        byte b4 = (byte) 0;
        while (parcel.dataPosition() < c) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = a.e(parcel, readInt);
                    break;
                case 2:
                    i2 = a.e(parcel, readInt);
                    break;
                case 3:
                    str = a.k(parcel, readInt);
                    break;
                case 4:
                    str2 = a.k(parcel, readInt);
                    break;
                case 5:
                    str3 = a.k(parcel, readInt);
                    break;
                case 6:
                    str4 = a.k(parcel, readInt);
                    break;
                case 7:
                    str5 = a.k(parcel, readInt);
                    break;
                case 8:
                    str6 = a.k(parcel, readInt);
                    break;
                case 9:
                    b = a.d(parcel, readInt);
                    break;
                case 10:
                    b2 = a.d(parcel, readInt);
                    break;
                case 11:
                    b3 = a.d(parcel, readInt);
                    break;
                case 12:
                    b4 = a.d(parcel, readInt);
                    break;
                default:
                    a.b(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == c) {
            return new AncsNotificationParcelable(i, i2, str, str2, str3, str4, str5, str6, b, b2, b3, b4);
        }
        throw new a.a("Overread allowed size end=" + c, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AncsNotificationParcelable[i];
    }
}
