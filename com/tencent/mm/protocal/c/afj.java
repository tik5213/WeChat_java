package com.tencent.mm.protocal.c;

import f.a.a.b;
import f.a.a.c.a;
import java.util.LinkedList;

public final class afj extends bhd {
    public int rJr;
    public int rci;
    public bhz rcj;
    public bhz rck;
    public long rcq;
    public int rdV;
    public int rdW;
    public int rdX;

    protected final int a(int i, Object... objArr) {
        int fS;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.rcj == null) {
                throw new b("Not all required fields were included: FromUserName");
            } else if (this.rck == null) {
                throw new b("Not all required fields were included: ToUserName");
            } else {
                if (this.shX != null) {
                    aVar.fV(1, this.shX.boi());
                    this.shX.a(aVar);
                }
                aVar.fT(2, this.rci);
                if (this.rcj != null) {
                    aVar.fV(3, this.rcj.boi());
                    this.rcj.a(aVar);
                }
                if (this.rck != null) {
                    aVar.fV(4, this.rck.boi());
                    this.rck.a(aVar);
                }
                aVar.fT(5, this.rdV);
                aVar.fT(6, this.rdW);
                aVar.fT(7, this.rdX);
                aVar.fT(8, this.rJr);
                aVar.T(9, this.rcq);
                return 0;
            }
        } else if (i == 1) {
            if (this.shX != null) {
                fS = f.a.a.a.fS(1, this.shX.boi()) + 0;
            } else {
                fS = 0;
            }
            fS += f.a.a.a.fQ(2, this.rci);
            if (this.rcj != null) {
                fS += f.a.a.a.fS(3, this.rcj.boi());
            }
            if (this.rck != null) {
                fS += f.a.a.a.fS(4, this.rck.boi());
            }
            return ((((fS + f.a.a.a.fQ(5, this.rdV)) + f.a.a.a.fQ(6, this.rdW)) + f.a.a.a.fQ(7, this.rdX)) + f.a.a.a.fQ(8, this.rJr)) + f.a.a.a.S(9, this.rcq);
        } else if (i == 2) {
            f.a.a.a.a aVar2 = new f.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (fS = bhd.a(aVar2); fS > 0; fS = bhd.a(aVar2)) {
                if (!super.a(aVar2, this, fS)) {
                    aVar2.cJS();
                }
            }
            if (this.rcj == null) {
                throw new b("Not all required fields were included: FromUserName");
            } else if (this.rck != null) {
                return 0;
            } else {
                throw new b("Not all required fields were included: ToUserName");
            }
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            afj afj = (afj) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList IC;
            int size;
            byte[] bArr;
            f.a.a.a.a aVar4;
            boolean z;
            bhz bhz;
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
                        afj.shX = fkVar;
                    }
                    return 0;
                case 2:
                    afj.rci = aVar3.vHC.rY();
                    return 0;
                case 3:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        bhz = new bhz();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bhz.a(aVar4, bhz, bhd.a(aVar4))) {
                        }
                        afj.rcj = bhz;
                    }
                    return 0;
                case 4:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        bhz = new bhz();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bhz.a(aVar4, bhz, bhd.a(aVar4))) {
                        }
                        afj.rck = bhz;
                    }
                    return 0;
                case 5:
                    afj.rdV = aVar3.vHC.rY();
                    return 0;
                case 6:
                    afj.rdW = aVar3.vHC.rY();
                    return 0;
                case 7:
                    afj.rdX = aVar3.vHC.rY();
                    return 0;
                case 8:
                    afj.rJr = aVar3.vHC.rY();
                    return 0;
                case 9:
                    afj.rcq = aVar3.vHC.rZ();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
