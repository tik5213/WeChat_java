package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class BinaryFrame$1 implements Creator<BinaryFrame> {
    BinaryFrame$1() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BinaryFrame(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BinaryFrame[i];
    }
}
