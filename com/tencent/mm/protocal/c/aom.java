package com.tencent.mm.protocal.c;

import f.a.a.b;
import f.a.a.c.a;
import java.util.LinkedList;

public final class aom extends bhp {
    public aof rQI;
    public LinkedList<bxq> rQW = new LinkedList();
    public LinkedList<String> rQX = new LinkedList();

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
            if (this.rQI != null) {
                aVar.fV(2, this.rQI.boi());
                this.rQI.a(aVar);
            }
            aVar.d(3, 8, this.rQW);
            aVar.d(4, 1, this.rQX);
            return 0;
        } else if (i == 1) {
            if (this.six != null) {
                fS = f.a.a.a.fS(1, this.six.boi()) + 0;
            } else {
                fS = 0;
            }
            if (this.rQI != null) {
                fS += f.a.a.a.fS(2, this.rQI.boi());
            }
            return (fS + f.a.a.a.c(3, 8, this.rQW)) + f.a.a.a.c(4, 1, this.rQX);
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.rQW.clear();
            this.rQX.clear();
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
            aom aom = (aom) objArr[1];
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
                        fl flVar = new fl();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = flVar.a(aVar4, flVar, bhp.a(aVar4))) {
                        }
                        aom.six = flVar;
                    }
                    return 0;
                case 2:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        aof aof = new aof();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = aof.a(aVar4, aof, bhp.a(aVar4))) {
                        }
                        aom.rQI = aof;
                    }
                    return 0;
                case 3:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        bxq bxq = new bxq();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bxq.a(aVar4, bxq, bhp.a(aVar4))) {
                        }
                        aom.rQW.add(bxq);
                    }
                    return 0;
                case 4:
                    aom.rQX.add(aVar3.vHC.readString());
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
