package com.tencent.mm.protocal.c;

import f.a.a.b;
import f.a.a.c.a;
import java.util.LinkedList;

public final class ahp extends bhp {
    public boolean rKP;
    public LinkedList<bll> rKQ = new LinkedList();
    public boolean rgU;
    public LinkedList<bll> rgV = new LinkedList();

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
            aVar.av(2, this.rgU);
            aVar.d(3, 8, this.rgV);
            aVar.av(4, this.rKP);
            aVar.d(5, 8, this.rKQ);
            return 0;
        } else if (i == 1) {
            if (this.six != null) {
                fS = f.a.a.a.fS(1, this.six.boi()) + 0;
            } else {
                fS = 0;
            }
            return (((fS + (f.a.a.b.b.a.ec(2) + 1)) + f.a.a.a.c(3, 8, this.rgV)) + (f.a.a.b.b.a.ec(4) + 1)) + f.a.a.a.c(5, 8, this.rKQ);
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.rgV.clear();
            this.rKQ.clear();
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
            ahp ahp = (ahp) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList IC;
            int size;
            f.a.a.a.a aVar4;
            boolean z;
            bll bll;
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
                        ahp.six = flVar;
                    }
                    return 0;
                case 2:
                    ahp.rgU = aVar3.cJQ();
                    return 0;
                case 3:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        bll = new bll();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bll.a(aVar4, bll, bhp.a(aVar4))) {
                        }
                        ahp.rgV.add(bll);
                    }
                    return 0;
                case 4:
                    ahp.rKP = aVar3.cJQ();
                    return 0;
                case 5:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        bll = new bll();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bll.a(aVar4, bll, bhp.a(aVar4))) {
                        }
                        ahp.rKQ.add(bll);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
