package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.a;
import f.a.a.b;
import java.util.LinkedList;

public final class cg extends a {
    public boc rcB;
    public bhz rcC;

    protected final int a(int i, Object... objArr) {
        int fS;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.rcB == null) {
                throw new b("Not all required fields were included: SnsADObject");
            }
            if (this.rcB != null) {
                aVar.fV(1, this.rcB.boi());
                this.rcB.a(aVar);
            }
            if (this.rcC == null) {
                return 0;
            }
            aVar.fV(2, this.rcC.boi());
            this.rcC.a(aVar);
            return 0;
        } else if (i == 1) {
            if (this.rcB != null) {
                fS = f.a.a.a.fS(1, this.rcB.boi()) + 0;
            } else {
                fS = 0;
            }
            if (this.rcC != null) {
                fS += f.a.a.a.fS(2, this.rcC.boi());
            }
            return fS;
        } else if (i == 2) {
            f.a.a.a.a aVar2 = new f.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (fS = a.a(aVar2); fS > 0; fS = a.a(aVar2)) {
                if (!super.a(aVar2, this, fS)) {
                    aVar2.cJS();
                }
            }
            if (this.rcB != null) {
                return 0;
            }
            throw new b("Not all required fields were included: SnsADObject");
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            cg cgVar = (cg) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList IC;
            int size;
            byte[] bArr;
            f.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        boc boc = new boc();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = boc.a(aVar4, boc, a.a(aVar4))) {
                        }
                        cgVar.rcB = boc;
                    }
                    return 0;
                case 2:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        a bhz = new bhz();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bhz.a(aVar4, bhz, a.a(aVar4))) {
                        }
                        cgVar.rcC = bhz;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
