package com.tencent.mm.protocal.c;

import f.a.a.c.a;
import java.util.LinkedList;

public final class ard extends bhd {
    public int hbF;
    public LinkedList<ale> hbG = new LinkedList();
    public int rTy;
    public int rlm;

    protected final int a(int i, Object... objArr) {
        int fS;
        byte[] bArr;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.shX != null) {
                aVar.fV(1, this.shX.boi());
                this.shX.a(aVar);
            }
            aVar.fT(2, this.hbF);
            aVar.d(3, 8, this.hbG);
            aVar.fT(4, this.rlm);
            aVar.fT(5, this.rTy);
            return 0;
        } else if (i == 1) {
            if (this.shX != null) {
                fS = f.a.a.a.fS(1, this.shX.boi()) + 0;
            } else {
                fS = 0;
            }
            return (((fS + f.a.a.a.fQ(2, this.hbF)) + f.a.a.a.c(3, 8, this.hbG)) + f.a.a.a.fQ(4, this.rlm)) + f.a.a.a.fQ(5, this.rTy);
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.hbG.clear();
            f.a.a.a.a aVar2 = new f.a.a.a.a(bArr, unknownTagHandler);
            for (fS = bhd.a(aVar2); fS > 0; fS = bhd.a(aVar2)) {
                if (!super.a(aVar2, this, fS)) {
                    aVar2.cJS();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            ard ard = (ard) objArr[1];
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
                        fk fkVar = new fk();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = fkVar.a(aVar4, fkVar, bhd.a(aVar4))) {
                        }
                        ard.shX = fkVar;
                    }
                    return 0;
                case 2:
                    ard.hbF = aVar3.vHC.rY();
                    return 0;
                case 3:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        ale ale = new ale();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = ale.a(aVar4, ale, bhd.a(aVar4))) {
                        }
                        ard.hbG.add(ale);
                    }
                    return 0;
                case 4:
                    ard.rlm = aVar3.vHC.rY();
                    return 0;
                case 5:
                    ard.rTy = aVar3.vHC.rY();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}