package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.a;

public final class arf extends a {
    public String hbL;
    public String hcS;
    public int hcd;
    public String mEl;
    public String rEJ;
    public String rqZ;
    public String rra;

    protected final int a(int i, Object... objArr) {
        int h;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.mEl != null) {
                aVar.g(1, this.mEl);
            }
            if (this.hbL != null) {
                aVar.g(2, this.hbL);
            }
            aVar.fT(3, this.hcd);
            if (this.rqZ != null) {
                aVar.g(4, this.rqZ);
            }
            if (this.rra != null) {
                aVar.g(5, this.rra);
            }
            if (this.hcS != null) {
                aVar.g(6, this.hcS);
            }
            if (this.rEJ == null) {
                return 0;
            }
            aVar.g(7, this.rEJ);
            return 0;
        } else if (i == 1) {
            if (this.mEl != null) {
                h = f.a.a.b.b.a.h(1, this.mEl) + 0;
            } else {
                h = 0;
            }
            if (this.hbL != null) {
                h += f.a.a.b.b.a.h(2, this.hbL);
            }
            h += f.a.a.a.fQ(3, this.hcd);
            if (this.rqZ != null) {
                h += f.a.a.b.b.a.h(4, this.rqZ);
            }
            if (this.rra != null) {
                h += f.a.a.b.b.a.h(5, this.rra);
            }
            if (this.hcS != null) {
                h += f.a.a.b.b.a.h(6, this.hcS);
            }
            if (this.rEJ != null) {
                h += f.a.a.b.b.a.h(7, this.rEJ);
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
            arf arf = (arf) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    arf.mEl = aVar3.vHC.readString();
                    return 0;
                case 2:
                    arf.hbL = aVar3.vHC.readString();
                    return 0;
                case 3:
                    arf.hcd = aVar3.vHC.rY();
                    return 0;
                case 4:
                    arf.rqZ = aVar3.vHC.readString();
                    return 0;
                case 5:
                    arf.rra = aVar3.vHC.readString();
                    return 0;
                case 6:
                    arf.hcS = aVar3.vHC.readString();
                    return 0;
                case 7:
                    arf.rEJ = aVar3.vHC.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
