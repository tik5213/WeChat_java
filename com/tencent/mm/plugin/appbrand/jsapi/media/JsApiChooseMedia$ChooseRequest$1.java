package com.tencent.mm.plugin.appbrand.jsapi.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia.ChooseRequest;

class JsApiChooseMedia$ChooseRequest$1 implements Creator<ChooseRequest> {
    JsApiChooseMedia$ChooseRequest$1() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ChooseRequest(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ChooseRequest[i];
    }
}
