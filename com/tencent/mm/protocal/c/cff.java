package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.a;
import f.a.a.b;

public final class cff extends a {
    public int qZk;
    public String rBM;
    public boolean szO;
    public String szk;

    protected final int a(int i, Object... objArr) {
        int h;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.szk == null) {
                throw new b("Not all required fields were included: Talker");
            } else if (this.rBM == null) {
                throw new b("Not all required fields were included: Text");
            } else {
                if (this.szk != null) {
                    aVar.g(1, this.szk);
                }
                if (this.rBM != null) {
                    aVar.g(2, this.rBM);
                }
                aVar.av(3, this.szO);
                aVar.fT(4, this.qZk);
                return 0;
            }
        } else if (i == 1) {
            if (this.szk != null) {
                h = f.a.a.b.b.a.h(1, this.szk) + 0;
            } else {
                h = 0;
            }
            if (this.rBM != null) {
                h += f.a.a.b.b.a.h(2, this.rBM);
            }
            return (h + (f.a.a.b.b.a.ec(3) + 1)) + f.a.a.a.fQ(4, this.qZk);
        } else if (i == 2) {
            f.a.a.a.a aVar2 = new f.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (h = a.a(aVar2); h > 0; h = a.a(aVar2)) {
                if (!super.a(aVar2, this, h)) {
                    aVar2.cJS();
                }
            }
            if (this.szk == null) {
                throw new b("Not all required fields were included: Talker");
            } else if (this.rBM != null) {
                return 0;
            } else {
                throw new b("Not all required fields were included: Text");
            }
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            cff cff = (cff) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    cff.szk = aVar3.vHC.readString();
                    return 0;
                case 2:
                    cff.rBM = aVar3.vHC.readString();
                    return 0;
                case 3:
                    cff.szO = aVar3.cJQ();
                    return 0;
                case 4:
                    cff.qZk = aVar3.vHC.rY();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
