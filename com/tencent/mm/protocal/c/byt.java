package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.a;

public final class byt extends a {
    public int rgC;
    public int suB;
    public String suF;

    protected final int a(int i, Object... objArr) {
        int fQ;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            aVar.fT(1, this.suB);
            aVar.fT(2, this.rgC);
            if (this.suF != null) {
                aVar.g(3, this.suF);
            }
            return 0;
        } else if (i == 1) {
            fQ = (f.a.a.a.fQ(1, this.suB) + 0) + f.a.a.a.fQ(2, this.rgC);
            if (this.suF != null) {
                return fQ + f.a.a.b.b.a.h(3, this.suF);
            }
            return fQ;
        } else if (i == 2) {
            f.a.a.a.a aVar2 = new f.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (fQ = a.a(aVar2); fQ > 0; fQ = a.a(aVar2)) {
                if (!super.a(aVar2, this, fQ)) {
                    aVar2.cJS();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            byt byt = (byt) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    byt.suB = aVar3.vHC.rY();
                    return 0;
                case 2:
                    byt.rgC = aVar3.vHC.rY();
                    return 0;
                case 3:
                    byt.suF = aVar3.vHC.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
