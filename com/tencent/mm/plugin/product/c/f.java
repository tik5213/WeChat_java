package com.tencent.mm.plugin.product.c;

import com.tencent.mm.bk.a;
import java.util.LinkedList;

public final class f extends a {
    public j lRN;
    public String lRO;

    protected final int a(int i, Object... objArr) {
        int fS;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.lRN != null) {
                aVar.fV(1, this.lRN.boi());
                this.lRN.a(aVar);
            }
            if (this.lRO == null) {
                return 0;
            }
            aVar.g(2, this.lRO);
            return 0;
        } else if (i == 1) {
            if (this.lRN != null) {
                fS = f.a.a.a.fS(1, this.lRN.boi()) + 0;
            } else {
                fS = 0;
            }
            if (this.lRO != null) {
                fS += f.a.a.b.b.a.h(2, this.lRO);
            }
            return fS;
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
            f fVar = (f) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList IC = aVar3.IC(intValue);
                    int size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) IC.get(intValue);
                        j jVar = new j();
                        f.a.a.a.a aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = jVar.a(aVar4, jVar, a.a(aVar4))) {
                        }
                        fVar.lRN = jVar;
                    }
                    return 0;
                case 2:
                    fVar.lRO = aVar3.vHC.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
