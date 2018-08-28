package com.tencent.mm.plugin.exdevice.f.b.b;

import android.database.Cursor;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import junit.framework.Assert;

public final class d extends i<com.tencent.mm.plugin.exdevice.f.b.a.d> {
    public static final String[] diD = new String[]{i.a(com.tencent.mm.plugin.exdevice.f.b.a.d.dhO, "HardDeviceRankInfo")};
    public e diF;

    public d(e eVar) {
        super(eVar, com.tencent.mm.plugin.exdevice.f.b.a.d.dhO, "HardDeviceRankInfo", null);
        this.diF = eVar;
        eVar.fV("HardDeviceRankInfo", "CREATE INDEX IF NOT EXISTS ExdeviceRankInfoRankIdAppNameIndex ON HardDeviceRankInfo ( rankID, appusername )");
    }

    public final com.tencent.mm.plugin.exdevice.f.b.a.d a(com.tencent.mm.plugin.exdevice.f.b.d dVar) {
        com.tencent.mm.plugin.exdevice.f.b.a.d dVar2 = null;
        String format = String.format("select *, rowid from %s where %s = ? and %s = ? limit 1", new Object[]{"HardDeviceRankInfo", "rankID", "username"});
        Cursor b = this.diF.b(format, new String[]{bi.aG(dVar.ixK, ""), bi.aG(dVar.username, "")}, 2);
        if (b == null) {
            x.e("MicroMsg.ExdeviceRankInfoStg", "Get no rank in DB");
        } else {
            if (b.moveToFirst()) {
                dVar2 = new com.tencent.mm.plugin.exdevice.f.b.a.d();
                dVar2.d(b);
            } else {
                x.d("MicroMsg.ExdeviceRankInfoStg", "hy: no record");
            }
            b.close();
        }
        return dVar2;
    }

    public final void e(String str, ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.d> arrayList) {
        if (bi.oW(str) || arrayList == null) {
            x.w("MicroMsg.ExdeviceRankInfoStg", "insertOrUpdateRankInfo failed, rank id is null or nil or data is null.");
            return;
        }
        x.i("MicroMsg.ExdeviceRankInfoStg", "insertOrUpdateRankInfo, rankId(%s) , size(%d).", new Object[]{str, Integer.valueOf(arrayList.size())});
        for (int i = 0; i < arrayList.size(); i++) {
            a((com.tencent.mm.plugin.exdevice.f.b.a.d) arrayList.get(i), false);
        }
        ad.aHn().a("HardDeviceRankInfo", new com.tencent.mm.plugin.exdevice.f.b.d(str, null, null));
    }

    public final boolean a(com.tencent.mm.plugin.exdevice.f.b.a.d dVar, boolean z) {
        if (!b(dVar, z)) {
            Assert.assertTrue(dVar != null);
            b(dVar);
            x.d("MicroMsg.ExdeviceRankInfoStg", "hy: insert success");
            if (z) {
                ad.aHn().a("HardDeviceRankInfo", new com.tencent.mm.plugin.exdevice.f.b.d(dVar.field_rankID, dVar.field_appusername, dVar.field_username));
            }
        }
        return true;
    }

    public final boolean b(com.tencent.mm.plugin.exdevice.f.b.a.d dVar, boolean z) {
        Assert.assertTrue(dVar != null);
        com.tencent.mm.plugin.exdevice.f.b.a.d a = a(new com.tencent.mm.plugin.exdevice.f.b.d(dVar.field_rankID, dVar.field_appusername, dVar.field_username));
        if (a == null) {
            return false;
        }
        a.field_likecount = dVar.field_likecount;
        a.field_selfLikeState = dVar.field_selfLikeState;
        c(a, new String[]{"rankID", "username"});
        x.d("MicroMsg.ExdeviceRankInfoStg", "hy: update success");
        if (!z) {
            return true;
        }
        ad.aHn().a("HardDeviceRankInfo", new com.tencent.mm.plugin.exdevice.f.b.d(dVar.field_rankID, dVar.field_appusername, dVar.field_username));
        return true;
    }
}
