package com.tencent.mm.modelsimple;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class BindWordingContent implements Parcelable {
    public static final Creator<BindWordingContent> CREATOR = new 1();
    public Integer brl = Integer.valueOf(0);
    public String content = "";
    public String title = "";

    public BindWordingContent(String str, String str2) {
        this.title = str;
        this.content = str2;
    }

    public BindWordingContent(Parcel parcel) {
        String[] strArr = new String[2];
        parcel.readStringArray(strArr);
        this.title = strArr[0];
        this.content = strArr[1];
        this.brl = Integer.valueOf(parcel.readInt());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringArray(new String[]{this.title, this.content});
        parcel.writeInt(this.brl.intValue());
    }
}
