package com.tencent.mm.protocal.c;

import f.a.a.b;
import f.a.a.c.a;
import java.util.LinkedList;

public final class abo extends bhp {
    public LinkedList<String> htD = new LinkedList();
    public int htF;
    public int htG;
    public int htH;

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
            aVar.d(2, 1, this.htD);
            aVar.fT(3, this.htF);
            aVar.fT(4, this.htG);
            aVar.fT(5, this.htH);
            return 0;
        } else if (i == 1) {
            if (this.six != null) {
                fS = f.a.a.a.fS(1, this.six.boi()) + 0;
            } else {
                fS = 0;
            }
            return (((fS + f.a.a.a.c(2, 1, this.htD)) + f.a.a.a.fQ(3, this.htF)) + f.a.a.a.fQ(4, this.htG)) + f.a.a.a.fQ(5, this.htH);
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.htD.clear();
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
            abo abo = (abo) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList IC = aVar3.IC(intValue);
                    int size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        fl flVar = new fl();
                        f.a.a.a.a aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = flVar.a(aVar4, flVar, bhp.a(aVar4))) {
                        }
                        abo.six = flVar;
                    }
                    return 0;
                case 2:
                    abo.htD.add(aVar3.vHC.readString());
                    return 0;
                case 3:
                    abo.htF = aVar3.vHC.rY();
                    return 0;
                case 4:
                    abo.htG = aVar3.vHC.rY();
                    return 0;
                case 5:
                    abo.htH = aVar3.vHC.rY();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
