package com.tencent.mm.protocal.c;

import f.a.a.c.a;
import java.util.LinkedList;

public final class bpv extends bhd {
    public int hbF;
    public LinkedList<bhz> hbG = new LinkedList();
    public String jSt;
    public int otY;
    public int qZc;
    public long snO;

    protected final int a(int i, Object... objArr) {
        int fS;
        byte[] bArr;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.shX != null) {
                aVar.fV(1, this.shX.boi());
                this.shX.a(aVar);
            }
            aVar.fT(2, this.qZc);
            aVar.T(3, this.snO);
            if (this.jSt != null) {
                aVar.g(4, this.jSt);
            }
            aVar.fT(5, this.hbF);
            aVar.d(6, 8, this.hbG);
            aVar.fT(7, this.otY);
            return 0;
        } else if (i == 1) {
            if (this.shX != null) {
                fS = f.a.a.a.fS(1, this.shX.boi()) + 0;
            } else {
                fS = 0;
            }
            fS = (fS + f.a.a.a.fQ(2, this.qZc)) + f.a.a.a.S(3, this.snO);
            if (this.jSt != null) {
                fS += f.a.a.b.b.a.h(4, this.jSt);
            }
            return ((fS + f.a.a.a.fQ(5, this.hbF)) + f.a.a.a.c(6, 8, this.hbG)) + f.a.a.a.fQ(7, this.otY);
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.hbG.clear();
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
            bpv bpv = (bpv) objArr[1];
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
                        bpv.shX = fkVar;
                    }
                    return 0;
                case 2:
                    bpv.qZc = aVar3.vHC.rY();
                    return 0;
                case 3:
                    bpv.snO = aVar3.vHC.rZ();
                    return 0;
                case 4:
                    bpv.jSt = aVar3.vHC.readString();
                    return 0;
                case 5:
                    bpv.hbF = aVar3.vHC.rY();
                    return 0;
                case 6:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        bhz bhz = new bhz();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bhz.a(aVar4, bhz, bhd.a(aVar4))) {
                        }
                        bpv.hbG.add(bhz);
                    }
                    return 0;
                case 7:
                    bpv.otY = aVar3.vHC.rY();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
