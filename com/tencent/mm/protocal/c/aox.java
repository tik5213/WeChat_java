package com.tencent.mm.protocal.c;

import f.a.a.c.a;
import java.util.LinkedList;

public final class aox extends bhd {
    public String jPK;
    public String jQb;
    public LinkedList<String> rQZ = new LinkedList();
    public int rRb;
    public chf rRc;
    public int rRe;
    public String rRf;

    protected final int a(int i, Object... objArr) {
        int fS;
        byte[] bArr;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.shX != null) {
                aVar.fV(1, this.shX.boi());
                this.shX.a(aVar);
            }
            if (this.jQb != null) {
                aVar.g(2, this.jQb);
            }
            aVar.d(3, 1, this.rQZ);
            aVar.fT(4, this.rRe);
            if (this.jPK != null) {
                aVar.g(5, this.jPK);
            }
            if (this.rRf != null) {
                aVar.g(6, this.rRf);
            }
            aVar.fT(7, this.rRb);
            if (this.rRc == null) {
                return 0;
            }
            aVar.fV(8, this.rRc.boi());
            this.rRc.a(aVar);
            return 0;
        } else if (i == 1) {
            if (this.shX != null) {
                fS = f.a.a.a.fS(1, this.shX.boi()) + 0;
            } else {
                fS = 0;
            }
            if (this.jQb != null) {
                fS += f.a.a.b.b.a.h(2, this.jQb);
            }
            fS = (fS + f.a.a.a.c(3, 1, this.rQZ)) + f.a.a.a.fQ(4, this.rRe);
            if (this.jPK != null) {
                fS += f.a.a.b.b.a.h(5, this.jPK);
            }
            if (this.rRf != null) {
                fS += f.a.a.b.b.a.h(6, this.rRf);
            }
            fS += f.a.a.a.fQ(7, this.rRb);
            if (this.rRc != null) {
                fS += f.a.a.a.fS(8, this.rRc.boi());
            }
            return fS;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.rQZ.clear();
            f.a.a.a.a aVar2 = new f.a.a.a.a(bArr, unknownTagHandler);
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
            aox aox = (aox) objArr[1];
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
                        fk fkVar = new fk();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = fkVar.a(aVar4, fkVar, bhd.a(aVar4))) {
                        }
                        aox.shX = fkVar;
                    }
                    return 0;
                case 2:
                    aox.jQb = aVar3.vHC.readString();
                    return 0;
                case 3:
                    aox.rQZ.add(aVar3.vHC.readString());
                    return 0;
                case 4:
                    aox.rRe = aVar3.vHC.rY();
                    return 0;
                case 5:
                    aox.jPK = aVar3.vHC.readString();
                    return 0;
                case 6:
                    aox.rRf = aVar3.vHC.readString();
                    return 0;
                case 7:
                    aox.rRb = aVar3.vHC.rY();
                    return 0;
                case 8:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        chf chf = new chf();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = chf.a(aVar4, chf, bhd.a(aVar4))) {
                        }
                        aox.rRc = chf;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
