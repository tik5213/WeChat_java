package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.a;

public final class bbt extends a {
    public String bSc;
    public String seb;
    public int sec;
    public String url;

    protected final int a(int i, Object... objArr) {
        int h;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.bSc != null) {
                aVar.g(1, this.bSc);
            }
            if (this.url != null) {
                aVar.g(2, this.url);
            }
            if (this.seb != null) {
                aVar.g(3, this.seb);
            }
            aVar.fT(4, this.sec);
            return 0;
        } else if (i == 1) {
            if (this.bSc != null) {
                h = f.a.a.b.b.a.h(1, this.bSc) + 0;
            } else {
                h = 0;
            }
            if (this.url != null) {
                h += f.a.a.b.b.a.h(2, this.url);
            }
            if (this.seb != null) {
                h += f.a.a.b.b.a.h(3, this.seb);
            }
            return h + f.a.a.a.fQ(4, this.sec);
        } else if (i == 2) {
            f.a.a.a.a aVar2 = new f.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
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
            bbt bbt = (bbt) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    bbt.bSc = aVar3.vHC.readString();
                    return 0;
                case 2:
                    bbt.url = aVar3.vHC.readString();
                    return 0;
                case 3:
                    bbt.seb = aVar3.vHC.readString();
                    return 0;
                case 4:
                    bbt.sec = aVar3.vHC.rY();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
