package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.a;
import com.tencent.mm.bk.b;

public final class bj extends a {
    public int rbJ;
    public b rbK;
    public long rbL;

    protected final int a(int i, Object... objArr) {
        int fQ;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            aVar.fT(1, this.rbJ);
            if (this.rbK != null) {
                aVar.b(2, this.rbK);
            }
            aVar.T(3, this.rbL);
            return 0;
        } else if (i == 1) {
            fQ = f.a.a.a.fQ(1, this.rbJ) + 0;
            if (this.rbK != null) {
                fQ += f.a.a.a.a(2, this.rbK);
            }
            return fQ + f.a.a.a.S(3, this.rbL);
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
            bj bjVar = (bj) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    bjVar.rbJ = aVar3.vHC.rY();
                    return 0;
                case 2:
                    bjVar.rbK = aVar3.cJR();
                    return 0;
                case 3:
                    bjVar.rbL = aVar3.vHC.rZ();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
