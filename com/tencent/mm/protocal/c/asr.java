package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.a;
import f.a.a.b;
import java.util.LinkedList;

public final class asr extends a {
    public ass rUY;
    public asq rUZ;

    protected final int a(int i, Object... objArr) {
        int fS;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.rUY == null) {
                throw new b("Not all required fields were included: RsaReqData");
            } else if (this.rUZ == null) {
                throw new b("Not all required fields were included: AesReqData");
            } else {
                if (this.rUY != null) {
                    aVar.fV(1, this.rUY.boi());
                    this.rUY.a(aVar);
                }
                if (this.rUZ == null) {
                    return 0;
                }
                aVar.fV(2, this.rUZ.boi());
                this.rUZ.a(aVar);
                return 0;
            }
        } else if (i == 1) {
            if (this.rUY != null) {
                fS = f.a.a.a.fS(1, this.rUY.boi()) + 0;
            } else {
                fS = 0;
            }
            if (this.rUZ != null) {
                fS += f.a.a.a.fS(2, this.rUZ.boi());
            }
            return fS;
        } else if (i == 2) {
            f.a.a.a.a aVar2 = new f.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (fS = a.a(aVar2); fS > 0; fS = a.a(aVar2)) {
                if (!super.a(aVar2, this, fS)) {
                    aVar2.cJS();
                }
            }
            if (this.rUY == null) {
                throw new b("Not all required fields were included: RsaReqData");
            } else if (this.rUZ != null) {
                return 0;
            } else {
                throw new b("Not all required fields were included: AesReqData");
            }
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            asr asr = (asr) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList IC;
            int size;
            byte[] bArr;
            a ass;
            f.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        ass = new ass();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = ass.a(aVar4, ass, a.a(aVar4))) {
                        }
                        asr.rUY = ass;
                    }
                    return 0;
                case 2:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        ass = new asq();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = ass.a(aVar4, ass, a.a(aVar4))) {
                        }
                        asr.rUZ = ass;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
