package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.a;
import java.util.LinkedList;

public final class po extends a {
    public String rtO;
    public String rtP;
    public LinkedList<atq> rtQ = new LinkedList();

    protected final int a(int i, Object... objArr) {
        int h;
        byte[] bArr;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.rtO != null) {
                aVar.g(1, this.rtO);
            }
            if (this.rtP != null) {
                aVar.g(2, this.rtP);
            }
            aVar.d(3, 8, this.rtQ);
            return 0;
        } else if (i == 1) {
            if (this.rtO != null) {
                h = f.a.a.b.b.a.h(1, this.rtO) + 0;
            } else {
                h = 0;
            }
            if (this.rtP != null) {
                h += f.a.a.b.b.a.h(2, this.rtP);
            }
            return h + f.a.a.a.c(3, 8, this.rtQ);
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.rtQ.clear();
            f.a.a.a.a aVar2 = new f.a.a.a.a(bArr, unknownTagHandler);
            for (h = a.a(aVar2); h > 0; h = a.a(aVar2)) {
                if (!super.a(aVar2, this, h)) {
                    aVar2.cJS();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            po poVar = (po) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    poVar.rtO = aVar3.vHC.readString();
                    return 0;
                case 2:
                    poVar.rtP = aVar3.vHC.readString();
                    return 0;
                case 3:
                    LinkedList IC = aVar3.IC(intValue);
                    int size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        atq atq = new atq();
                        f.a.a.a.a aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = atq.a(aVar4, atq, a.a(aVar4))) {
                        }
                        poVar.rtQ.add(atq);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
