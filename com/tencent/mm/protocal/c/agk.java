package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.a;
import f.a.a.b;
import java.util.LinkedList;

public final class agk extends a {
    public int otY;
    public int rHi;
    public bhy rcT;

    protected final int a(int i, Object... objArr) {
        int fQ;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.rcT == null) {
                throw new b("Not all required fields were included: ReqBuf");
            }
            aVar.fT(1, this.rHi);
            if (this.rcT != null) {
                aVar.fV(2, this.rcT.boi());
                this.rcT.a(aVar);
            }
            aVar.fT(3, this.otY);
            return 0;
        } else if (i == 1) {
            fQ = f.a.a.a.fQ(1, this.rHi) + 0;
            if (this.rcT != null) {
                fQ += f.a.a.a.fS(2, this.rcT.boi());
            }
            return fQ + f.a.a.a.fQ(3, this.otY);
        } else if (i == 2) {
            f.a.a.a.a aVar2 = new f.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (fQ = a.a(aVar2); fQ > 0; fQ = a.a(aVar2)) {
                if (!super.a(aVar2, this, fQ)) {
                    aVar2.cJS();
                }
            }
            if (this.rcT != null) {
                return 0;
            }
            throw new b("Not all required fields were included: ReqBuf");
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            agk agk = (agk) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    agk.rHi = aVar3.vHC.rY();
                    return 0;
                case 2:
                    LinkedList IC = aVar3.IC(intValue);
                    int size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) IC.get(intValue);
                        bhy bhy = new bhy();
                        f.a.a.a.a aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = bhy.a(aVar4, bhy, a.a(aVar4))) {
                        }
                        agk.rcT = bhy;
                    }
                    return 0;
                case 3:
                    agk.otY = aVar3.vHC.rY();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
