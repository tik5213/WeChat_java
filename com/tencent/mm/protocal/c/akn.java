package com.tencent.mm.protocal.c;

import f.a.a.c.a;
import java.util.LinkedList;

public final class akn extends bhd {
    public double rNe;
    public double rNf;
    public String rNg;
    public boolean rNh;

    protected final int a(int i, Object... objArr) {
        int fS;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.shX != null) {
                aVar.fV(1, this.shX.boi());
                this.shX.a(aVar);
            }
            aVar.c(2, this.rNe);
            aVar.c(3, this.rNf);
            if (this.rNg != null) {
                aVar.g(4, this.rNg);
            }
            aVar.av(5, this.rNh);
            return 0;
        } else if (i == 1) {
            if (this.shX != null) {
                fS = f.a.a.a.fS(1, this.shX.boi()) + 0;
            } else {
                fS = 0;
            }
            fS = (fS + (f.a.a.b.b.a.ec(2) + 8)) + (f.a.a.b.b.a.ec(3) + 8);
            if (this.rNg != null) {
                fS += f.a.a.b.b.a.h(4, this.rNg);
            }
            return fS + (f.a.a.b.b.a.ec(5) + 1);
        } else if (i == 2) {
            f.a.a.a.a aVar2 = new f.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (fS = com.tencent.mm.bk.a.a(aVar2); fS > 0; fS = com.tencent.mm.bk.a.a(aVar2)) {
                if (!super.a(aVar2, this, fS)) {
                    aVar2.cJS();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            akn akn = (akn) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList IC = aVar3.IC(intValue);
                    int size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) IC.get(intValue);
                        com.tencent.mm.bk.a fkVar = new fk();
                        f.a.a.a.a aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = fkVar.a(aVar4, fkVar, com.tencent.mm.bk.a.a(aVar4))) {
                        }
                        akn.shX = fkVar;
                    }
                    return 0;
                case 2:
                    akn.rNe = aVar3.vHC.readDouble();
                    return 0;
                case 3:
                    akn.rNf = aVar3.vHC.readDouble();
                    return 0;
                case 4:
                    akn.rNg = aVar3.vHC.readString();
                    return 0;
                case 5:
                    akn.rNh = aVar3.cJQ();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
