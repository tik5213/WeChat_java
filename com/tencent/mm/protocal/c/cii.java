package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.a;
import f.a.a.b;

public final class cii extends a {
    public String dxc;
    public int sCd;
    public String title;

    protected final int a(int i, Object... objArr) {
        int h;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.dxc == null) {
                throw new b("Not all required fields were included: rankid");
            } else if (this.title == null) {
                throw new b("Not all required fields were included: title");
            } else {
                if (this.dxc != null) {
                    aVar.g(1, this.dxc);
                }
                if (this.title != null) {
                    aVar.g(2, this.title);
                }
                aVar.fT(3, this.sCd);
                return 0;
            }
        } else if (i == 1) {
            if (this.dxc != null) {
                h = f.a.a.b.b.a.h(1, this.dxc) + 0;
            } else {
                h = 0;
            }
            if (this.title != null) {
                h += f.a.a.b.b.a.h(2, this.title);
            }
            return h + f.a.a.a.fQ(3, this.sCd);
        } else if (i == 2) {
            f.a.a.a.a aVar2 = new f.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (h = a.a(aVar2); h > 0; h = a.a(aVar2)) {
                if (!super.a(aVar2, this, h)) {
                    aVar2.cJS();
                }
            }
            if (this.dxc == null) {
                throw new b("Not all required fields were included: rankid");
            } else if (this.title != null) {
                return 0;
            } else {
                throw new b("Not all required fields were included: title");
            }
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            cii cii = (cii) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    cii.dxc = aVar3.vHC.readString();
                    return 0;
                case 2:
                    cii.title = aVar3.vHC.readString();
                    return 0;
                case 3:
                    cii.sCd = aVar3.vHC.rY();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
