package com.tencent.mm.protocal.c;

import f.a.a.b;
import f.a.a.c.a;
import java.util.LinkedList;

public final class yi extends bhp {
    public int iwS;
    public String iwT;
    public String rEf;
    public String rEg;

    protected final int a(int i, Object... objArr) {
        int fS;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.six == null) {
                throw new b("Not all required fields were included: BaseResponse");
            }
            if (this.six != null) {
                aVar.fV(1, this.six.boi());
                this.six.a(aVar);
            }
            if (this.rEf != null) {
                aVar.g(2, this.rEf);
            }
            if (this.rEg != null) {
                aVar.g(3, this.rEg);
            }
            aVar.fT(4, this.iwS);
            if (this.iwT == null) {
                return 0;
            }
            aVar.g(5, this.iwT);
            return 0;
        } else if (i == 1) {
            if (this.six != null) {
                fS = f.a.a.a.fS(1, this.six.boi()) + 0;
            } else {
                fS = 0;
            }
            if (this.rEf != null) {
                fS += f.a.a.b.b.a.h(2, this.rEf);
            }
            if (this.rEg != null) {
                fS += f.a.a.b.b.a.h(3, this.rEg);
            }
            fS += f.a.a.a.fQ(4, this.iwS);
            if (this.iwT != null) {
                fS += f.a.a.b.b.a.h(5, this.iwT);
            }
            return fS;
        } else if (i == 2) {
            f.a.a.a.a aVar2 = new f.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (fS = com.tencent.mm.bk.a.a(aVar2); fS > 0; fS = com.tencent.mm.bk.a.a(aVar2)) {
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
            yi yiVar = (yi) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList IC = aVar3.IC(intValue);
                    int size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) IC.get(intValue);
                        com.tencent.mm.bk.a flVar = new fl();
                        f.a.a.a.a aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = flVar.a(aVar4, flVar, com.tencent.mm.bk.a.a(aVar4))) {
                        }
                        yiVar.six = flVar;
                    }
                    return 0;
                case 2:
                    yiVar.rEf = aVar3.vHC.readString();
                    return 0;
                case 3:
                    yiVar.rEg = aVar3.vHC.readString();
                    return 0;
                case 4:
                    yiVar.iwS = aVar3.vHC.rY();
                    return 0;
                case 5:
                    yiVar.iwT = aVar3.vHC.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
