package com.tencent.mm.protocal.c;

import f.a.a.b;
import f.a.a.c.a;
import java.util.LinkedList;

public final class bra extends bhp {
    public int rci;
    public long rcq;
    public int spj;
    public LinkedList<mw> spk = new LinkedList();

    protected final int a(int i, Object... objArr) {
        int fS;
        byte[] bArr;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.six == null) {
                throw new b("Not all required fields were included: BaseResponse");
            }
            if (this.six != null) {
                aVar.fV(1, this.six.boi());
                this.six.a(aVar);
            }
            aVar.fT(2, this.rci);
            aVar.T(3, this.rcq);
            aVar.fT(4, this.spj);
            aVar.d(5, 8, this.spk);
            return 0;
        } else if (i == 1) {
            if (this.six != null) {
                fS = f.a.a.a.fS(1, this.six.boi()) + 0;
            } else {
                fS = 0;
            }
            return (((fS + f.a.a.a.fQ(2, this.rci)) + f.a.a.a.S(3, this.rcq)) + f.a.a.a.fQ(4, this.spj)) + f.a.a.a.c(5, 8, this.spk);
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.spk.clear();
            f.a.a.a.a aVar2 = new f.a.a.a.a(bArr, unknownTagHandler);
            for (fS = bhp.a(aVar2); fS > 0; fS = bhp.a(aVar2)) {
                if (!super.a(aVar2, this, fS)) {
                    aVar2.cJS();
                }
            }
            if (this.six != null) {
                return 0;
            }
            throw new b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            bra bra = (bra) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList IC;
            int size;
            f.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        fl flVar = new fl();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = flVar.a(aVar4, flVar, bhp.a(aVar4))) {
                        }
                        bra.six = flVar;
                    }
                    return 0;
                case 2:
                    bra.rci = aVar3.vHC.rY();
                    return 0;
                case 3:
                    bra.rcq = aVar3.vHC.rZ();
                    return 0;
                case 4:
                    bra.spj = aVar3.vHC.rY();
                    return 0;
                case 5:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        mw mwVar = new mw();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = mwVar.a(aVar4, mwVar, bhp.a(aVar4))) {
                        }
                        bra.spk.add(mwVar);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
