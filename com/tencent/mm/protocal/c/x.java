package com.tencent.mm.protocal.c;

import f.a.a.b;
import f.a.a.c.a;
import java.util.LinkedList;

public final class x extends bhp {
    public int hUm = 268513600;
    public String hUn = "请求不成功，请稍候再试";
    public String qYQ;
    public int qYR;
    public int qYS;
    public String qYT;
    public LinkedList<k> qYU = new LinkedList();
    public String qYV;

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
            aVar.fT(2, this.hUm);
            if (this.hUn != null) {
                aVar.g(3, this.hUn);
            }
            aVar.d(4, 8, this.qYU);
            if (this.qYV != null) {
                aVar.g(5, this.qYV);
            }
            if (this.qYQ != null) {
                aVar.g(6, this.qYQ);
            }
            aVar.fT(7, this.qYR);
            aVar.fT(8, this.qYS);
            if (this.qYT == null) {
                return 0;
            }
            aVar.g(9, this.qYT);
            return 0;
        } else if (i == 1) {
            if (this.six != null) {
                fS = f.a.a.a.fS(1, this.six.boi()) + 0;
            } else {
                fS = 0;
            }
            fS += f.a.a.a.fQ(2, this.hUm);
            if (this.hUn != null) {
                fS += f.a.a.b.b.a.h(3, this.hUn);
            }
            fS += f.a.a.a.c(4, 8, this.qYU);
            if (this.qYV != null) {
                fS += f.a.a.b.b.a.h(5, this.qYV);
            }
            if (this.qYQ != null) {
                fS += f.a.a.b.b.a.h(6, this.qYQ);
            }
            fS = (fS + f.a.a.a.fQ(7, this.qYR)) + f.a.a.a.fQ(8, this.qYS);
            if (this.qYT != null) {
                fS += f.a.a.b.b.a.h(9, this.qYT);
            }
            return fS;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.qYU.clear();
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
            x xVar = (x) objArr[1];
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
                        xVar.six = flVar;
                    }
                    return 0;
                case 2:
                    xVar.hUm = aVar3.vHC.rY();
                    return 0;
                case 3:
                    xVar.hUn = aVar3.vHC.readString();
                    return 0;
                case 4:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        k kVar = new k();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = kVar.a(aVar4, kVar, bhp.a(aVar4))) {
                        }
                        xVar.qYU.add(kVar);
                    }
                    return 0;
                case 5:
                    xVar.qYV = aVar3.vHC.readString();
                    return 0;
                case 6:
                    xVar.qYQ = aVar3.vHC.readString();
                    return 0;
                case 7:
                    xVar.qYR = aVar3.vHC.rY();
                    return 0;
                case 8:
                    xVar.qYS = aVar3.vHC.rY();
                    return 0;
                case 9:
                    xVar.qYT = aVar3.vHC.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
