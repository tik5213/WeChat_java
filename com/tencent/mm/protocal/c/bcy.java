package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.a;
import java.util.LinkedList;

public final class bcy extends a {
    public int hbF;
    public LinkedList<bcx> sfe = new LinkedList();

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            aVar.fT(1, this.hbF);
            aVar.d(2, 8, this.sfe);
            return 0;
        } else if (i == 1) {
            return (f.a.a.a.fQ(1, this.hbF) + 0) + f.a.a.a.c(2, 8, this.sfe);
        } else {
            byte[] bArr;
            if (i == 2) {
                bArr = (byte[]) objArr[0];
                this.sfe.clear();
                f.a.a.a.a aVar2 = new f.a.a.a.a(bArr, unknownTagHandler);
                for (int a = a.a(aVar2); a > 0; a = a.a(aVar2)) {
                    if (!super.a(aVar2, this, a)) {
                        aVar2.cJS();
                    }
                }
                return 0;
            } else if (i != 3) {
                return -1;
            } else {
                f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
                bcy bcy = (bcy) objArr[1];
                int intValue = ((Integer) objArr[2]).intValue();
                switch (intValue) {
                    case 1:
                        bcy.hbF = aVar3.vHC.rY();
                        return 0;
                    case 2:
                        LinkedList IC = aVar3.IC(intValue);
                        int size = IC.size();
                        for (intValue = 0; intValue < size; intValue++) {
                            bArr = (byte[]) IC.get(intValue);
                            bcx bcx = new bcx();
                            f.a.a.a.a aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                            for (boolean z = true; z; z = bcx.a(aVar4, bcx, a.a(aVar4))) {
                            }
                            bcy.sfe.add(bcx);
                        }
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
