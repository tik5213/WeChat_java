package com.tencent.mm.plugin.game.d;

import com.tencent.mm.bk.a;
import f.a.a.b;

public final class ck extends a {
    public int jSO;
    public String jSP;
    public String jSQ;
    public boolean jSR;

    protected final int a(int i, Object... objArr) {
        int fQ;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.jSQ == null) {
                throw new b("Not all required fields were included: MediaURL");
            }
            aVar.fT(1, this.jSO);
            if (this.jSP != null) {
                aVar.g(2, this.jSP);
            }
            if (this.jSQ != null) {
                aVar.g(3, this.jSQ);
            }
            aVar.av(4, this.jSR);
            return 0;
        } else if (i == 1) {
            fQ = f.a.a.a.fQ(1, this.jSO) + 0;
            if (this.jSP != null) {
                fQ += f.a.a.b.b.a.h(2, this.jSP);
            }
            if (this.jSQ != null) {
                fQ += f.a.a.b.b.a.h(3, this.jSQ);
            }
            return fQ + (f.a.a.b.b.a.ec(4) + 1);
        } else if (i == 2) {
            f.a.a.a.a aVar2 = new f.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (fQ = a.a(aVar2); fQ > 0; fQ = a.a(aVar2)) {
                if (!super.a(aVar2, this, fQ)) {
                    aVar2.cJS();
                }
            }
            if (this.jSQ != null) {
                return 0;
            }
            throw new b("Not all required fields were included: MediaURL");
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            ck ckVar = (ck) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    ckVar.jSO = aVar3.vHC.rY();
                    return 0;
                case 2:
                    ckVar.jSP = aVar3.vHC.readString();
                    return 0;
                case 3:
                    ckVar.jSQ = aVar3.vHC.readString();
                    return 0;
                case 4:
                    ckVar.jSR = aVar3.cJQ();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
