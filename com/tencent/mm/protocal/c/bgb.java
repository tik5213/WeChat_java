package com.tencent.mm.protocal.c;

import f.a.a.b;
import f.a.a.c.a;
import java.util.LinkedList;

public final class bgb extends bhd {
    public int hcC;
    public int shg;
    public byp shh;
    public int shi;

    protected final int a(int i, Object... objArr) {
        int fS;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.shh == null) {
                throw new b("Not all required fields were included: PieceData");
            }
            if (this.shX != null) {
                aVar.fV(1, this.shX.boi());
                this.shX.a(aVar);
            }
            aVar.fT(2, this.hcC);
            aVar.fT(3, this.shg);
            if (this.shh != null) {
                aVar.fV(4, this.shh.boi());
                this.shh.a(aVar);
            }
            aVar.fT(5, this.shi);
            return 0;
        } else if (i == 1) {
            if (this.shX != null) {
                fS = f.a.a.a.fS(1, this.shX.boi()) + 0;
            } else {
                fS = 0;
            }
            fS = (fS + f.a.a.a.fQ(2, this.hcC)) + f.a.a.a.fQ(3, this.shg);
            if (this.shh != null) {
                fS += f.a.a.a.fS(4, this.shh.boi());
            }
            return fS + f.a.a.a.fQ(5, this.shi);
        } else if (i == 2) {
            f.a.a.a.a aVar2 = new f.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (fS = bhd.a(aVar2); fS > 0; fS = bhd.a(aVar2)) {
                if (!super.a(aVar2, this, fS)) {
                    aVar2.cJS();
                }
            }
            if (this.shh != null) {
                return 0;
            }
            throw new b("Not all required fields were included: PieceData");
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            bgb bgb = (bgb) objArr[1];
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
                        bgb.shX = fkVar;
                    }
                    return 0;
                case 2:
                    bgb.hcC = aVar3.vHC.rY();
                    return 0;
                case 3:
                    bgb.shg = aVar3.vHC.rY();
                    return 0;
                case 4:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        byp byp = new byp();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = byp.a(aVar4, byp, bhd.a(aVar4))) {
                        }
                        bgb.shh = byp;
                    }
                    return 0;
                case 5:
                    bgb.shi = aVar3.vHC.rY();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
