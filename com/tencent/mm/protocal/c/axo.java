package com.tencent.mm.protocal.c;

import f.a.a.c.a;
import java.util.LinkedList;

public final class axo extends bhd {
    public int bVB;
    public String lMV;
    public String pjw;
    public String rhb;
    public String rhc;
    public boolean saG;
    public String saH;
    public String saI;
    public int saJ;

    protected final int a(int i, Object... objArr) {
        int fS;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.shX != null) {
                aVar.fV(1, this.shX.boi());
                this.shX.a(aVar);
            }
            if (this.rhb != null) {
                aVar.g(2, this.rhb);
            }
            if (this.rhc != null) {
                aVar.g(3, this.rhc);
            }
            if (this.saH != null) {
                aVar.g(4, this.saH);
            }
            if (this.saI != null) {
                aVar.g(5, this.saI);
            }
            if (this.pjw != null) {
                aVar.g(6, this.pjw);
            }
            if (this.lMV != null) {
                aVar.g(7, this.lMV);
            }
            aVar.fT(8, this.bVB);
            aVar.fT(9, this.saJ);
            aVar.av(10, this.saG);
            return 0;
        } else if (i == 1) {
            if (this.shX != null) {
                fS = f.a.a.a.fS(1, this.shX.boi()) + 0;
            } else {
                fS = 0;
            }
            if (this.rhb != null) {
                fS += f.a.a.b.b.a.h(2, this.rhb);
            }
            if (this.rhc != null) {
                fS += f.a.a.b.b.a.h(3, this.rhc);
            }
            if (this.saH != null) {
                fS += f.a.a.b.b.a.h(4, this.saH);
            }
            if (this.saI != null) {
                fS += f.a.a.b.b.a.h(5, this.saI);
            }
            if (this.pjw != null) {
                fS += f.a.a.b.b.a.h(6, this.pjw);
            }
            if (this.lMV != null) {
                fS += f.a.a.b.b.a.h(7, this.lMV);
            }
            return ((fS + f.a.a.a.fQ(8, this.bVB)) + f.a.a.a.fQ(9, this.saJ)) + (f.a.a.b.b.a.ec(10) + 1);
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
            axo axo = (axo) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList IC = aVar3.IC(intValue);
                    int size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) IC.get(intValue);
                        fk fkVar = new fk();
                        f.a.a.a.a aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = fkVar.a(aVar4, fkVar, bhd.a(aVar4))) {
                        }
                        axo.shX = fkVar;
                    }
                    return 0;
                case 2:
                    axo.rhb = aVar3.vHC.readString();
                    return 0;
                case 3:
                    axo.rhc = aVar3.vHC.readString();
                    return 0;
                case 4:
                    axo.saH = aVar3.vHC.readString();
                    return 0;
                case 5:
                    axo.saI = aVar3.vHC.readString();
                    return 0;
                case 6:
                    axo.pjw = aVar3.vHC.readString();
                    return 0;
                case 7:
                    axo.lMV = aVar3.vHC.readString();
                    return 0;
                case 8:
                    axo.bVB = aVar3.vHC.rY();
                    return 0;
                case 9:
                    axo.saJ = aVar3.vHC.rY();
                    return 0;
                case 10:
                    axo.saG = aVar3.cJQ();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
