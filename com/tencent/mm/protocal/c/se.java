package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.a;
import java.util.LinkedList;

public final class se extends a {
    public String huX;
    public int rvB;
    public LinkedList<pr> rvC = new LinkedList();
    public String title;

    protected final int a(int i, Object... objArr) {
        int h;
        byte[] bArr;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.title != null) {
                aVar.g(1, this.title);
            }
            if (this.huX != null) {
                aVar.g(2, this.huX);
            }
            aVar.fT(3, this.rvB);
            aVar.d(4, 8, this.rvC);
            return 0;
        } else if (i == 1) {
            if (this.title != null) {
                h = f.a.a.b.b.a.h(1, this.title) + 0;
            } else {
                h = 0;
            }
            if (this.huX != null) {
                h += f.a.a.b.b.a.h(2, this.huX);
            }
            return (h + f.a.a.a.fQ(3, this.rvB)) + f.a.a.a.c(4, 8, this.rvC);
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.rvC.clear();
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
            se seVar = (se) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    seVar.title = aVar3.vHC.readString();
                    return 0;
                case 2:
                    seVar.huX = aVar3.vHC.readString();
                    return 0;
                case 3:
                    seVar.rvB = aVar3.vHC.rY();
                    return 0;
                case 4:
                    LinkedList IC = aVar3.IC(intValue);
                    int size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        pr prVar = new pr();
                        f.a.a.a.a aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = prVar.a(aVar4, prVar, a.a(aVar4))) {
                        }
                        seVar.rvC.add(prVar);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
