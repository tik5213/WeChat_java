package com.tencent.mm.protocal.c;

import d.a.a.c;
import f.a.a.c.a;
import java.util.LinkedList;

public final class afe extends bhp {
    public int hwV;
    public String hwW;
    public c pqb;
    public String rFx;

    protected final int a(int i, Object... objArr) {
        int fS;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.six != null) {
                aVar.fV(1, this.six.boi());
                this.six.a(aVar);
            }
            aVar.fT(2, this.hwV);
            if (this.hwW != null) {
                aVar.g(3, this.hwW);
            }
            if (this.pqb != null) {
                aVar.fV(4, this.pqb.boi());
                this.pqb.a(aVar);
            }
            if (this.rFx == null) {
                return 0;
            }
            aVar.g(5, this.rFx);
            return 0;
        } else if (i == 1) {
            if (this.six != null) {
                fS = f.a.a.a.fS(1, this.six.boi()) + 0;
            } else {
                fS = 0;
            }
            fS += f.a.a.a.fQ(2, this.hwV);
            if (this.hwW != null) {
                fS += f.a.a.b.b.a.h(3, this.hwW);
            }
            if (this.pqb != null) {
                fS += f.a.a.a.fS(4, this.pqb.boi());
            }
            if (this.rFx != null) {
                fS += f.a.a.b.b.a.h(5, this.rFx);
            }
            return fS;
        } else if (i == 2) {
            f.a.a.a.a aVar2 = new f.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (fS = bhp.a(aVar2); fS > 0; fS = bhp.a(aVar2)) {
                if (!super.a(aVar2, this, fS)) {
                    aVar2.cJS();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            afe afe = (afe) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList IC;
            int size;
            byte[] bArr;
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
                        afe.six = flVar;
                    }
                    return 0;
                case 2:
                    afe.hwV = aVar3.vHC.rY();
                    return 0;
                case 3:
                    afe.hwW = aVar3.vHC.readString();
                    return 0;
                case 4:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        c cVar = new c();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = cVar.a(aVar4, cVar, bhp.a(aVar4))) {
                        }
                        afe.pqb = cVar;
                    }
                    return 0;
                case 5:
                    afe.rFx = aVar3.vHC.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
