package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;
import f.a.a.c.a;
import java.util.LinkedList;

public final class mb extends bhd {
    public int amount;
    public String hUM;
    public b rpU;
    public b rpV;
    public int rpW = 4;

    protected final int a(int i, Object... objArr) {
        int fS;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.shX != null) {
                aVar.fV(1, this.shX.boi());
                this.shX.a(aVar);
            }
            aVar.fT(2, this.amount);
            if (this.rpU != null) {
                aVar.b(3, this.rpU);
            }
            if (this.rpV != null) {
                aVar.b(4, this.rpV);
            }
            if (this.hUM != null) {
                aVar.g(5, this.hUM);
            }
            aVar.fT(6, this.rpW);
            return 0;
        } else if (i == 1) {
            if (this.shX != null) {
                fS = f.a.a.a.fS(1, this.shX.boi()) + 0;
            } else {
                fS = 0;
            }
            fS += f.a.a.a.fQ(2, this.amount);
            if (this.rpU != null) {
                fS += f.a.a.a.a(3, this.rpU);
            }
            if (this.rpV != null) {
                fS += f.a.a.a.a(4, this.rpV);
            }
            if (this.hUM != null) {
                fS += f.a.a.b.b.a.h(5, this.hUM);
            }
            return fS + f.a.a.a.fQ(6, this.rpW);
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
            mb mbVar = (mb) objArr[1];
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
                        mbVar.shX = fkVar;
                    }
                    return 0;
                case 2:
                    mbVar.amount = aVar3.vHC.rY();
                    return 0;
                case 3:
                    mbVar.rpU = aVar3.cJR();
                    return 0;
                case 4:
                    mbVar.rpV = aVar3.cJR();
                    return 0;
                case 5:
                    mbVar.hUM = aVar3.vHC.readString();
                    return 0;
                case 6:
                    mbVar.rpW = aVar3.vHC.rY();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
