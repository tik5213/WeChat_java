package com.tencent.mm.plugin.appbrand.appstorage;

import com.tencent.mm.a.e;
import com.tencent.mm.plugin.appbrand.q.h;
import com.tencent.mm.sdk.platformtools.bi;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

public final class a extends g {
    private final String appId;

    public a(String str) {
        this.appId = str;
    }

    public final boolean bV(String str) {
        return bi.oV(str).startsWith("wxfile://");
    }

    public final j ra(String str) {
        AppBrandLocalMediaObject itemByLocalId = AppBrandLocalMediaObjectManager.getItemByLocalId(this.appId, str);
        return (itemByLocalId == null || !e.cn(itemByLocalId.dDG)) ? j.RET_NOT_EXISTS : j.OK;
    }

    public final j a(String str, h<ByteBuffer> hVar) {
        AppBrandLocalMediaObject itemByLocalId = AppBrandLocalMediaObjectManager.getItemByLocalId(this.appId, str);
        if (itemByLocalId == null || !e.cn(itemByLocalId.dDG)) {
            return j.RET_NOT_EXISTS;
        }
        hVar.value = k.x(new File(itemByLocalId.dDG));
        return j.OK;
    }

    public final j a(String str, FileStructStat fileStructStat) {
        AppBrandLocalMediaObject itemByLocalId = AppBrandLocalMediaObjectManager.getItemByLocalId(this.appId, str);
        if (itemByLocalId == null || !e.cn(itemByLocalId.dDG)) {
            return j.RET_NOT_EXISTS;
        }
        if (fileStructStat == null) {
            return j.ERR_OP_FAIL;
        }
        return FileStat.stat(itemByLocalId.dDG, fileStructStat) == 0 ? j.OK : j.ERR_OP_FAIL;
    }

    public final j b(String str, h<List<h>> hVar) {
        List<AppBrandLocalMediaObject> linkedList = new LinkedList();
        com.tencent.mm.plugin.appbrand.q.e.d(linkedList, AppBrandLocalMediaObjectManager.listStoredFiles(this.appId));
        com.tencent.mm.plugin.appbrand.q.e.d(linkedList, AppBrandLocalMediaObjectManager.listTmpFiles(this.appId));
        List linkedList2 = new LinkedList();
        for (AppBrandLocalMediaObject appBrandLocalMediaObject : linkedList) {
            h hVar2 = new h();
            hVar2.fileName = appBrandLocalMediaObject.bNH;
            linkedList2.add(hVar2);
        }
        hVar.value = linkedList2;
        return j.OK;
    }

    public final File rb(String str) {
        AppBrandLocalMediaObject itemByLocalId = AppBrandLocalMediaObjectManager.getItemByLocalId(this.appId, str);
        return itemByLocalId == null ? null : new File(itemByLocalId.dDG);
    }
}
