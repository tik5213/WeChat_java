package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.a;
import com.tencent.mm.bk.b;
import java.util.LinkedList;

public final class chb extends a {
    public b riB;
    public LinkedList<cgy> riC = new LinkedList();
    public String spJ;

    protected final int a(int i, Object... objArr) {
        int h;
        byte[] bArr;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.spJ == null) {
                throw new f.a.a.b("Not all required fields were included: WxaUserName");
            }
            if (this.spJ != null) {
                aVar.g(1, this.spJ);
            }
            if (this.riB != null) {
                aVar.b(2, this.riB);
            }
            aVar.d(3, 8, this.riC);
            return 0;
        } else if (i == 1) {
            if (this.spJ != null) {
                h = f.a.a.b.b.a.h(1, this.spJ) + 0;
            } else {
                h = 0;
            }
            if (this.riB != null) {
                h += f.a.a.a.a(2, this.riB);
            }
            return h + f.a.a.a.c(3, 8, this.riC);
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.riC.clear();
            f.a.a.a.a aVar2 = new f.a.a.a.a(bArr, unknownTagHandler);
            for (h = a.a(aVar2); h > 0; h = a.a(aVar2)) {
                if (!super.a(aVar2, this, h)) {
                    aVar2.cJS();
                }
            }
            if (this.spJ != null) {
                return 0;
            }
            throw new f.a.a.b("Not all required fields were included: WxaUserName");
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            chb chb = (chb) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    chb.spJ = aVar3.vHC.readString();
                    return 0;
                case 2:
                    chb.riB = aVar3.cJR();
                    return 0;
                case 3:
                    LinkedList IC = aVar3.IC(intValue);
                    int size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        cgy cgy = new cgy();
                        f.a.a.a.a aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = cgy.a(aVar4, cgy, a.a(aVar4))) {
                        }
                        chb.riC.add(cgy);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
