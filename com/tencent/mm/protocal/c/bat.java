package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.a;
import java.util.LinkedList;

public final class bat extends a {
    public aqr rva;
    public int rxy;

    protected final int a(int i, Object... objArr) {
        int fS;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.rva != null) {
                aVar.fV(1, this.rva.boi());
                this.rva.a(aVar);
            }
            aVar.fT(2, this.rxy);
            return 0;
        } else if (i == 1) {
            if (this.rva != null) {
                fS = f.a.a.a.fS(1, this.rva.boi()) + 0;
            } else {
                fS = 0;
            }
            return fS + f.a.a.a.fQ(2, this.rxy);
        } else if (i == 2) {
            f.a.a.a.a aVar2 = new f.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
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
            bat bat = (bat) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList IC = aVar3.IC(intValue);
                    int size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) IC.get(intValue);
                        aqr aqr = new aqr();
                        f.a.a.a.a aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = aqr.a(aVar4, aqr, a.a(aVar4))) {
                        }
                        bat.rva = aqr;
                    }
                    return 0;
                case 2:
                    bat.rxy = aVar3.vHC.rY();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
