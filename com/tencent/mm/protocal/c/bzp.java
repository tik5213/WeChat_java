package com.tencent.mm.protocal.c;

import f.a.a.c.a;
import java.util.LinkedList;

public final class bzp extends bhd {
    public long rxH;
    public long see;
    public int svC;
    public long svs;

    protected final int a(int i, Object... objArr) {
        int fS;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.shX != null) {
                aVar.fV(1, this.shX.boi());
                this.shX.a(aVar);
            }
            aVar.T(2, this.svs);
            aVar.T(3, this.rxH);
            aVar.T(4, this.see);
            aVar.fT(5, this.svC);
            return 0;
        } else if (i == 1) {
            if (this.shX != null) {
                fS = f.a.a.a.fS(1, this.shX.boi()) + 0;
            } else {
                fS = 0;
            }
            return (((fS + f.a.a.a.S(2, this.svs)) + f.a.a.a.S(3, this.rxH)) + f.a.a.a.S(4, this.see)) + f.a.a.a.fQ(5, this.svC);
        } else if (i == 2) {
            f.a.a.a.a aVar2 = new f.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
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
            bzp bzp = (bzp) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList IC = aVar3.IC(intValue);
                    int size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) IC.get(intValue);
                        fk fkVar = new fk();
                        f.a.a.a.a aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = fkVar.a(aVar4, fkVar, bhd.a(aVar4))) {
                        }
                        bzp.shX = fkVar;
                    }
                    return 0;
                case 2:
                    bzp.svs = aVar3.vHC.rZ();
                    return 0;
                case 3:
                    bzp.rxH = aVar3.vHC.rZ();
                    return 0;
                case 4:
                    bzp.see = aVar3.vHC.rZ();
                    return 0;
                case 5:
                    bzp.svC = aVar3.vHC.rY();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
