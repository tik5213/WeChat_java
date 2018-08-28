package com.tencent.mm.plugin.appbrand;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.mm.plugin.report.service.h;

public class ReportStorageSizeTask extends MainProcessTask {
    public static final Creator<ReportStorageSizeTask> CREATOR = new 1();
    public String appId;

    public final void aai() {
        if (e.aaZ() != null) {
            h.mEJ.h(14073, new Object[]{this.appId, "", "", r0.rc(this.appId)[1], Long.valueOf(AppBrandLocalMediaObjectManager.getTmpFilesOccupation(this.appId)), Long.valueOf(AppBrandLocalMediaObjectManager.getStoredFilesOccupation(this.appId))});
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.appId);
    }

    public final void g(Parcel parcel) {
        this.appId = parcel.readString();
    }
}
