package com.tencent.mm.protocal.c;

import f.a.a.b;
import f.a.a.c.a;
import java.util.LinkedList;

public final class acd extends bhp {
    public int hbC;
    public String rGL;
    public mx rGM;

    protected final int a(int i, Object... objArr) {
        int fS;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.six == null) {
                throw new b("Not all required fields were included: BaseResponse");
            } else if (this.rGM == null) {
                throw new b("Not all required fields were included: NewChatroomData");
            } else {
                if (this.six != null) {
                    aVar.fV(1, this.six.boi());
                    this.six.a(aVar);
                }
                if (this.rGL != null) {
                    aVar.g(2, this.rGL);
                }
                aVar.fT(3, this.hbC);
                if (this.rGM == null) {
                    return 0;
                }
                aVar.fV(4, this.rGM.boi());
                this.rGM.a(aVar);
                return 0;
            }
        } else if (i == 1) {
            if (this.six != null) {
                fS = f.a.a.a.fS(1, this.six.boi()) + 0;
            } else {
                fS = 0;
            }
            if (this.rGL != null) {
                fS += f.a.a.b.b.a.h(2, this.rGL);
            }
            fS += f.a.a.a.fQ(3, this.hbC);
            if (this.rGM != null) {
                fS += f.a.a.a.fS(4, this.rGM.boi());
            }
            return fS;
        } else if (i == 2) {
            f.a.a.a.a aVar2 = new f.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (fS = bhp.a(aVar2); fS > 0; fS = bhp.a(aVar2)) {
                if (!super.a(aVar2, this, fS)) {
                    aVar2.cJS();
                }
            }
            if (this.six == null) {
                throw new b("Not all required fields were included: BaseResponse");
            } else if (this.rGM != null) {
                return 0;
            } else {
                throw new b("Not all required fields were included: NewChatroomData");
            }
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            acd acd = (acd) objArr[1];
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
                        acd.six = flVar;
                    }
                    return 0;
                case 2:
                    acd.rGL = aVar3.vHC.readString();
                    return 0;
                case 3:
                    acd.hbC = aVar3.vHC.rY();
                    return 0;
                case 4:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        mx mxVar = new mx();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = mxVar.a(aVar4, mxVar, bhp.a(aVar4))) {
                        }
                        acd.rGM = mxVar;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
