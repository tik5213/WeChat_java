package com.tencent.mm.protocal.c;

import f.a.a.b;
import f.a.a.c.a;
import java.util.LinkedList;

public final class bep extends bhp {
    public int hLg;
    public LinkedList<ben> rbQ = new LinkedList();
    public String rwj;

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
            if (this.rwj != null) {
                aVar.g(2, this.rwj);
            }
            aVar.fT(3, this.hLg);
            aVar.d(4, 8, this.rbQ);
            return 0;
        } else if (i == 1) {
            if (this.six != null) {
                fS = f.a.a.a.fS(1, this.six.boi()) + 0;
            } else {
                fS = 0;
            }
            if (this.rwj != null) {
                fS += f.a.a.b.b.a.h(2, this.rwj);
            }
            return (fS + f.a.a.a.fQ(3, this.hLg)) + f.a.a.a.c(4, 8, this.rbQ);
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.rbQ.clear();
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
            bep bep = (bep) objArr[1];
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
                        bep.six = flVar;
                    }
                    return 0;
                case 2:
                    bep.rwj = aVar3.vHC.readString();
                    return 0;
                case 3:
                    bep.hLg = aVar3.vHC.rY();
                    return 0;
                case 4:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        ben ben = new ben();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = ben.a(aVar4, ben, bhp.a(aVar4))) {
                        }
                        bep.rbQ.add(ben);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
