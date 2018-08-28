package com.tencent.mm.plugin.wallet_core.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Orders$DiscountInfo implements Parcelable {
    public static final Creator<Orders$DiscountInfo> CREATOR = new 1();
    public String mwP;
    public double ppR;

    public Orders$DiscountInfo(Parcel parcel) {
        this.ppR = parcel.readDouble();
        this.mwP = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.ppR);
        parcel.writeString(this.mwP);
    }
}
