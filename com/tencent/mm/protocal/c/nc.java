package com.tencent.mm.protocal.c;

import f.a.a.b;
import f.a.a.c.a;
import java.util.LinkedList;

public final class nc extends bhp {
    public int hUm;
    public String hUn;
    public String muA;
    public String muB;
    public String muC;
    public String ref;

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
            aVar.fT(2, this.hUm);
            if (this.hUn != null) {
                aVar.g(3, this.hUn);
            }
            if (this.muA != null) {
                aVar.g(4, this.muA);
            }
            if (this.muB != null) {
                aVar.g(5, this.muB);
            }
            if (this.muC != null) {
                aVar.g(6, this.muC);
            }
            if (this.ref == null) {
                return 0;
            }
            aVar.g(7, this.ref);
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
            if (this.muA != null) {
                fS += f.a.a.b.b.a.h(4, this.muA);
            }
            if (this.muB != null) {
                fS += f.a.a.b.b.a.h(5, this.muB);
            }
            if (this.muC != null) {
                fS += f.a.a.b.b.a.h(6, this.muC);
            }
            if (this.ref != null) {
                fS += f.a.a.b.b.a.h(7, this.ref);
            }
            return fS;
        } else if (i == 2) {
            f.a.a.a.a aVar2 = new f.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
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
            nc ncVar = (nc) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList IC = aVar3.IC(intValue);
                    int size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) IC.get(intValue);
                        fl flVar = new fl();
                        f.a.a.a.a aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = flVar.a(aVar4, flVar, bhp.a(aVar4))) {
                        }
                        ncVar.six = flVar;
                    }
                    return 0;
                case 2:
                    ncVar.hUm = aVar3.vHC.rY();
                    return 0;
                case 3:
                    ncVar.hUn = aVar3.vHC.readString();
                    return 0;
                case 4:
                    ncVar.muA = aVar3.vHC.readString();
                    return 0;
                case 5:
                    ncVar.muB = aVar3.vHC.readString();
                    return 0;
                case 6:
                    ncVar.muC = aVar3.vHC.readString();
                    return 0;
                case 7:
                    ncVar.ref = aVar3.vHC.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
