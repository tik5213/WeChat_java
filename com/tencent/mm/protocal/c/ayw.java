package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.a;

public final class ayw extends a {
    public String hFk;
    public String hFm;
    public String hva;
    public String pnl;
    public String sbE;

    protected final int a(int i, Object... objArr) {
        int h;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.hva != null) {
                aVar.g(1, this.hva);
            }
            if (this.pnl != null) {
                aVar.g(2, this.pnl);
            }
            if (this.hFm != null) {
                aVar.g(3, this.hFm);
            }
            if (this.hFk != null) {
                aVar.g(4, this.hFk);
            }
            if (this.sbE == null) {
                return 0;
            }
            aVar.g(5, this.sbE);
            return 0;
        } else if (i == 1) {
            if (this.hva != null) {
                h = f.a.a.b.b.a.h(1, this.hva) + 0;
            } else {
                h = 0;
            }
            if (this.pnl != null) {
                h += f.a.a.b.b.a.h(2, this.pnl);
            }
            if (this.hFm != null) {
                h += f.a.a.b.b.a.h(3, this.hFm);
            }
            if (this.hFk != null) {
                h += f.a.a.b.b.a.h(4, this.hFk);
            }
            if (this.sbE != null) {
                h += f.a.a.b.b.a.h(5, this.sbE);
            }
            return h;
        } else if (i == 2) {
            f.a.a.a.a aVar2 = new f.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (h = a.a(aVar2); h > 0; h = a.a(aVar2)) {
                if (!super.a(aVar2, this, h)) {
                    aVar2.cJS();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            ayw ayw = (ayw) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    ayw.hva = aVar3.vHC.readString();
                    return 0;
                case 2:
                    ayw.pnl = aVar3.vHC.readString();
                    return 0;
                case 3:
                    ayw.hFm = aVar3.vHC.readString();
                    return 0;
                case 4:
                    ayw.hFk = aVar3.vHC.readString();
                    return 0;
                case 5:
                    ayw.sbE = aVar3.vHC.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
