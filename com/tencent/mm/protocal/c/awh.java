package com.tencent.mm.protocal.c;

import f.a.a.b;
import f.a.a.c.a;
import java.util.LinkedList;

public final class awh extends bhd {
    public String rZC;
    public String rZD;
    public bhy rjA;
    public int rjD;
    public int rjE;
    public int rjz;

    protected final int a(int i, Object... objArr) {
        int fS;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.rjA == null) {
                throw new b("Not all required fields were included: ImageBuffer");
            }
            if (this.shX != null) {
                aVar.fV(1, this.shX.boi());
                this.shX.a(aVar);
            }
            aVar.fT(2, this.rjz);
            if (this.rjA != null) {
                aVar.fV(3, this.rjA.boi());
                this.rjA.a(aVar);
            }
            aVar.fT(4, this.rjD);
            if (this.rZC != null) {
                aVar.g(5, this.rZC);
            }
            if (this.rZD != null) {
                aVar.g(6, this.rZD);
            }
            aVar.fT(7, this.rjE);
            return 0;
        } else if (i == 1) {
            if (this.shX != null) {
                fS = f.a.a.a.fS(1, this.shX.boi()) + 0;
            } else {
                fS = 0;
            }
            fS += f.a.a.a.fQ(2, this.rjz);
            if (this.rjA != null) {
                fS += f.a.a.a.fS(3, this.rjA.boi());
            }
            fS += f.a.a.a.fQ(4, this.rjD);
            if (this.rZC != null) {
                fS += f.a.a.b.b.a.h(5, this.rZC);
            }
            if (this.rZD != null) {
                fS += f.a.a.b.b.a.h(6, this.rZD);
            }
            return fS + f.a.a.a.fQ(7, this.rjE);
        } else if (i == 2) {
            f.a.a.a.a aVar2 = new f.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (fS = bhd.a(aVar2); fS > 0; fS = bhd.a(aVar2)) {
                if (!super.a(aVar2, this, fS)) {
                    aVar2.cJS();
                }
            }
            if (this.rjA != null) {
                return 0;
            }
            throw new b("Not all required fields were included: ImageBuffer");
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            awh awh = (awh) objArr[1];
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
                        fk fkVar = new fk();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = fkVar.a(aVar4, fkVar, bhd.a(aVar4))) {
                        }
                        awh.shX = fkVar;
                    }
                    return 0;
                case 2:
                    awh.rjz = aVar3.vHC.rY();
                    return 0;
                case 3:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        bhy bhy = new bhy();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bhy.a(aVar4, bhy, bhd.a(aVar4))) {
                        }
                        awh.rjA = bhy;
                    }
                    return 0;
                case 4:
                    awh.rjD = aVar3.vHC.rY();
                    return 0;
                case 5:
                    awh.rZC = aVar3.vHC.readString();
                    return 0;
                case 6:
                    awh.rZD = aVar3.vHC.readString();
                    return 0;
                case 7:
                    awh.rjE = aVar3.vHC.rY();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
