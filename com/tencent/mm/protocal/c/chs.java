package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.a;
import java.util.LinkedList;

public final class chs extends a {
    public String sBJ;
    public int sBK;
    public int sBL;
    public chl sBu;
    public LinkedList<Integer> sum = new LinkedList();

    protected final int a(int i, Object... objArr) {
        int fS;
        byte[] bArr;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.sBu != null) {
                aVar.fV(1, this.sBu.boi());
                this.sBu.a(aVar);
            }
            if (this.sBJ != null) {
                aVar.g(2, this.sBJ);
            }
            aVar.d(3, 2, this.sum);
            aVar.fT(4, this.sBK);
            aVar.fT(5, this.sBL);
            return 0;
        } else if (i == 1) {
            if (this.sBu != null) {
                fS = f.a.a.a.fS(1, this.sBu.boi()) + 0;
            } else {
                fS = 0;
            }
            if (this.sBJ != null) {
                fS += f.a.a.b.b.a.h(2, this.sBJ);
            }
            return ((fS + f.a.a.a.c(3, 2, this.sum)) + f.a.a.a.fQ(4, this.sBK)) + f.a.a.a.fQ(5, this.sBL);
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.sum.clear();
            f.a.a.a.a aVar2 = new f.a.a.a.a(bArr, unknownTagHandler);
            for (fS = a.a(aVar2); fS > 0; fS = a.a(aVar2)) {
                if (!super.a(aVar2, this, fS)) {
                    aVar2.cJS();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            chs chs = (chs) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList IC = aVar3.IC(intValue);
                    int size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        chl chl = new chl();
                        f.a.a.a.a aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = chl.a(aVar4, chl, a.a(aVar4))) {
                        }
                        chs.sBu = chl;
                    }
                    return 0;
                case 2:
                    chs.sBJ = aVar3.vHC.readString();
                    return 0;
                case 3:
                    chs.sum.add(Integer.valueOf(aVar3.vHC.rY()));
                    return 0;
                case 4:
                    chs.sBK = aVar3.vHC.rY();
                    return 0;
                case 5:
                    chs.sBL = aVar3.vHC.rY();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
