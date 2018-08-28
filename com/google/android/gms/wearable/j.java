package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Base64;
import com.google.android.gms.c.au;
import com.google.android.gms.c.au.a;
import com.google.android.gms.c.av;
import com.google.android.gms.c.bd;
import com.google.android.gms.c.be;
import java.util.ArrayList;
import java.util.List;

public final class j {
    private final Uri aMJ;
    public final i bdp;

    public j(f fVar) {
        this.aMJ = fVar.getUri();
        this.bdp = a((f) fVar.freeze());
    }

    private static i a(f fVar) {
        Throwable e;
        if (fVar.getData() == null && fVar.rQ().size() > 0) {
            throw new IllegalArgumentException("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
        } else if (fVar.getData() == null) {
            return new i();
        } else {
            try {
                List arrayList = new ArrayList();
                int size = fVar.rQ().size();
                for (int i = 0; i < size; i++) {
                    g gVar = (g) fVar.rQ().get(Integer.toString(i));
                    if (gVar == null) {
                        throw new IllegalStateException("Cannot find DataItemAsset referenced in data at " + i + " for " + fVar);
                    }
                    arrayList.add(Asset.bB(gVar.getId()));
                }
                byte[] data = fVar.getData();
                return au.a(new a((av) be.a(new av(), data, data.length), arrayList));
            } catch (bd e2) {
                e = e2;
                new StringBuilder("Unable to parse datamap from dataItem. uri=").append(fVar.getUri()).append(", data=").append(Base64.encodeToString(fVar.getData(), 0));
                throw new IllegalStateException("Unable to parse datamap from dataItem.  uri=" + fVar.getUri(), e);
            } catch (NullPointerException e3) {
                e = e3;
                new StringBuilder("Unable to parse datamap from dataItem. uri=").append(fVar.getUri()).append(", data=").append(Base64.encodeToString(fVar.getData(), 0));
                throw new IllegalStateException("Unable to parse datamap from dataItem.  uri=" + fVar.getUri(), e);
            }
        }
    }
}
