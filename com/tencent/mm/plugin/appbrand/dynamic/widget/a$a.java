package com.tencent.mm.plugin.appbrand.dynamic.widget;

import android.os.Parcel;
import com.tencent.mm.ipcinvoker.extension.f;

public class a$a implements f {
    public int height;
    public String id;
    public int width;

    public final void f(Parcel parcel) {
        parcel.writeString(this.id);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    public final void readFromParcel(Parcel parcel) {
        this.id = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
    }
}
