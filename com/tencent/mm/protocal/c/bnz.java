package com.tencent.mm.protocal.c;

import f.a.a.b;
import f.a.a.c.a;
import java.util.LinkedList;

public final class bnz extends bhd {
    public String rcc;
    public int rdq;
    public bhz slT;
    public boi slU;
    public bhz slV;

    protected final int a(int i, Object... objArr) {
        int fS;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.slU == null) {
                throw new b("Not all required fields were included: Action");
            }
            if (this.shX != null) {
                aVar.fV(1, this.shX.boi());
                this.shX.a(aVar);
            }
            if (this.slU != null) {
                aVar.fV(2, this.slU.boi());
                this.slU.a(aVar);
            }
            if (this.rcc != null) {
                aVar.g(3, this.rcc);
            }
            if (this.slT != null) {
                aVar.fV(4, this.slT.boi());
                this.slT.a(aVar);
            }
            aVar.fT(5, this.rdq);
            if (this.slV == null) {
                return 0;
            }
            aVar.fV(6, this.slV.boi());
            this.slV.a(aVar);
            return 0;
        } else if (i == 1) {
            if (this.shX != null) {
                fS = f.a.a.a.fS(1, this.shX.boi()) + 0;
            } else {
                fS = 0;
            }
            if (this.slU != null) {
                fS += f.a.a.a.fS(2, this.slU.boi());
            }
            if (this.rcc != null) {
                fS += f.a.a.b.b.a.h(3, this.rcc);
            }
            if (this.slT != null) {
                fS += f.a.a.a.fS(4, this.slT.boi());
            }
            fS += f.a.a.a.fQ(5, this.rdq);
            if (this.slV != null) {
                fS += f.a.a.a.fS(6, this.slV.boi());
            }
            return fS;
        } else if (i == 2) {
            f.a.a.a.a aVar2 = new f.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (fS = bhd.a(aVar2); fS > 0; fS = bhd.a(aVar2)) {
                if (!super.a(aVar2, this, fS)) {
                    aVar2.cJS();
                }
            }
            if (this.slU != null) {
                return 0;
            }
            throw new b("Not all required fields were included: Action");
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            bnz bnz = (bnz) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList IC;
            int size;
            byte[] bArr;
            f.a.a.a.a aVar4;
            boolean z;
            bhz bhz;
            switch (intValue) {
                case 1:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        fk fkVar = new fk();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = fkVar.a(aVar4, fkVar, bhd.a(aVar4))) {
                        }
                        bnz.shX = fkVar;
                    }
                    return 0;
                case 2:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        boi boi = new boi();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = boi.a(aVar4, boi, bhd.a(aVar4))) {
                        }
                        bnz.slU = boi;
                    }
                    return 0;
                case 3:
                    bnz.rcc = aVar3.vHC.readString();
                    return 0;
                case 4:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        bhz = new bhz();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bhz.a(aVar4, bhz, bhd.a(aVar4))) {
                        }
                        bnz.slT = bhz;
                    }
                    return 0;
                case 5:
                    bnz.rdq = aVar3.vHC.rY();
                    return 0;
                case 6:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        bhz = new bhz();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bhz.a(aVar4, bhz, bhd.a(aVar4))) {
                        }
                        bnz.slV = bhz;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
