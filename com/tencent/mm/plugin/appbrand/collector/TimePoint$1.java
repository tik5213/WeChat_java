package com.tencent.mm.plugin.appbrand.collector;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class TimePoint$1 implements Creator<TimePoint> {
    TimePoint$1() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        TimePoint timePoint = new TimePoint();
        timePoint.name = parcel.readString();
        timePoint.fok.set(parcel.readLong());
        timePoint.foj.set(parcel.readInt());
        timePoint.fol.set((TimePoint) parcel.readParcelable(TimePoint.class.getClassLoader()));
        return timePoint;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TimePoint[i];
    }
}
