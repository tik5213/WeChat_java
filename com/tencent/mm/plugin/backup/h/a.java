package com.tencent.mm.plugin.backup.h;

import f.a.a.b;

public final class a extends com.tencent.mm.bk.a {
    public String ID;

    protected final int a(int i, Object... objArr) {
        int h;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.ID == null) {
                throw new b("Not all required fields were included: ID");
            } else if (this.ID == null) {
                return 0;
            } else {
                aVar.g(1, this.ID);
                return 0;
            }
        } else if (i == 1) {
            if (this.ID != null) {
                h = f.a.a.b.b.a.h(1, this.ID) + 0;
            } else {
                h = 0;
            }
            return h;
        } else if (i == 2) {
            f.a.a.a.a aVar2 = new f.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (h = com.tencent.mm.bk.a.a(aVar2); h > 0; h = com.tencent.mm.bk.a.a(aVar2)) {
                if (!super.a(aVar2, this, h)) {
                    aVar2.cJS();
                }
            }
            if (this.ID != null) {
                return 0;
            }
            throw new b("Not all required fields were included: ID");
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            a aVar4 = (a) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    aVar4.ID = aVar3.vHC.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
