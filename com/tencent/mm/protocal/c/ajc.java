package com.tencent.mm.protocal.c;

import f.a.a.c.a;
import java.util.LinkedList;

public final class ajc extends bhd {
    public String jPc;
    public int otY;
    public int rGU;
    public LinkedList<bhz> rgF = new LinkedList();

    protected final int a(int i, Object... objArr) {
        int fS;
        byte[] bArr;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.shX != null) {
                aVar.fV(1, this.shX.boi());
                this.shX.a(aVar);
            }
            if (this.jPc != null) {
                aVar.g(2, this.jPc);
            }
            aVar.fT(3, this.rGU);
            aVar.d(4, 8, this.rgF);
            aVar.fT(5, this.otY);
            return 0;
        } else if (i == 1) {
            if (this.shX != null) {
                fS = f.a.a.a.fS(1, this.shX.boi()) + 0;
            } else {
                fS = 0;
            }
            if (this.jPc != null) {
                fS += f.a.a.b.b.a.h(2, this.jPc);
            }
            return ((fS + f.a.a.a.fQ(3, this.rGU)) + f.a.a.a.c(4, 8, this.rgF)) + f.a.a.a.fQ(5, this.otY);
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.rgF.clear();
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
            ajc ajc = (ajc) objArr[1];
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
                        ajc.shX = fkVar;
                    }
                    return 0;
                case 2:
                    ajc.jPc = aVar3.vHC.readString();
                    return 0;
                case 3:
                    ajc.rGU = aVar3.vHC.rY();
                    return 0;
                case 4:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        bhz bhz = new bhz();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bhz.a(aVar4, bhz, bhd.a(aVar4))) {
                        }
                        ajc.rgF.add(bhz);
                    }
                    return 0;
                case 5:
                    ajc.otY = aVar3.vHC.rY();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
