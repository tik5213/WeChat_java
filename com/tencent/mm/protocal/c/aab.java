package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.a;
import java.util.LinkedList;

public final class aab extends a {
    public LinkedList<String> rFF = new LinkedList();
    public aw rmQ;
    public String rqE;

    protected final int a(int i, Object... objArr) {
        int c;
        byte[] bArr;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            aVar.d(1, 1, this.rFF);
            if (this.rmQ != null) {
                aVar.fV(2, this.rmQ.boi());
                this.rmQ.a(aVar);
            }
            if (this.rqE != null) {
                aVar.g(3, this.rqE);
            }
            return 0;
        } else if (i == 1) {
            c = f.a.a.a.c(1, 1, this.rFF) + 0;
            if (this.rmQ != null) {
                c += f.a.a.a.fS(2, this.rmQ.boi());
            }
            if (this.rqE != null) {
                return c + f.a.a.b.b.a.h(3, this.rqE);
            }
            return c;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.rFF.clear();
            f.a.a.a.a aVar2 = new f.a.a.a.a(bArr, unknownTagHandler);
            for (c = a.a(aVar2); c > 0; c = a.a(aVar2)) {
                if (!super.a(aVar2, this, c)) {
                    aVar2.cJS();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            aab aab = (aab) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    aab.rFF.add(aVar3.vHC.readString());
                    return 0;
                case 2:
                    LinkedList IC = aVar3.IC(intValue);
                    int size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        aw awVar = new aw();
                        f.a.a.a.a aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = awVar.a(aVar4, awVar, a.a(aVar4))) {
                        }
                        aab.rmQ = awVar;
                    }
                    return 0;
                case 3:
                    aab.rqE = aVar3.vHC.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
