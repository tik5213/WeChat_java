package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.b;
import f.a.a.c.a;
import java.util.LinkedList;

public final class aoz extends bhd {
    public b hbs;
    public String jQb;
    public int rRa;
    public int rRb;
    public chf rRc;
    public String rRj;

    protected final int a(int i, Object... objArr) {
        int fS;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.shX != null) {
                aVar.fV(1, this.shX.boi());
                this.shX.a(aVar);
            }
            if (this.jQb != null) {
                aVar.g(2, this.jQb);
            }
            if (this.hbs != null) {
                aVar.b(3, this.hbs);
            }
            if (this.rRj != null) {
                aVar.g(4, this.rRj);
            }
            aVar.fT(5, this.rRa);
            aVar.fT(6, this.rRb);
            if (this.rRc == null) {
                return 0;
            }
            aVar.fV(7, this.rRc.boi());
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
            if (this.hbs != null) {
                fS += f.a.a.a.a(3, this.hbs);
            }
            if (this.rRj != null) {
                fS += f.a.a.b.b.a.h(4, this.rRj);
            }
            fS = (fS + f.a.a.a.fQ(5, this.rRa)) + f.a.a.a.fQ(6, this.rRb);
            if (this.rRc != null) {
                fS += f.a.a.a.fS(7, this.rRc.boi());
            }
            return fS;
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
            aoz aoz = (aoz) objArr[1];
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
                        fk fkVar = new fk();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = fkVar.a(aVar4, fkVar, bhd.a(aVar4))) {
                        }
                        aoz.shX = fkVar;
                    }
                    return 0;
                case 2:
                    aoz.jQb = aVar3.vHC.readString();
                    return 0;
                case 3:
                    aoz.hbs = aVar3.cJR();
                    return 0;
                case 4:
                    aoz.rRj = aVar3.vHC.readString();
                    return 0;
                case 5:
                    aoz.rRa = aVar3.vHC.rY();
                    return 0;
                case 6:
                    aoz.rRb = aVar3.vHC.rY();
                    return 0;
                case 7:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        chf chf = new chf();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = chf.a(aVar4, chf, bhd.a(aVar4))) {
                        }
                        aoz.rRc = chf;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
