package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.a;

public final class alp extends a {
    public String bWP;
    public String rOd;
    public String rOe;
    public String url;

    protected final int a(int i, Object... objArr) {
        int h;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.rOd != null) {
                aVar.g(1, this.rOd);
            }
            if (this.rOe != null) {
                aVar.g(2, this.rOe);
            }
            if (this.url != null) {
                aVar.g(3, this.url);
            }
            if (this.bWP == null) {
                return 0;
            }
            aVar.g(4, this.bWP);
            return 0;
        } else if (i == 1) {
            if (this.rOd != null) {
                h = f.a.a.b.b.a.h(1, this.rOd) + 0;
            } else {
                h = 0;
            }
            if (this.rOe != null) {
                h += f.a.a.b.b.a.h(2, this.rOe);
            }
            if (this.url != null) {
                h += f.a.a.b.b.a.h(3, this.url);
            }
            if (this.bWP != null) {
                h += f.a.a.b.b.a.h(4, this.bWP);
            }
            return h;
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
            alp alp = (alp) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    alp.rOd = aVar3.vHC.readString();
                    return 0;
                case 2:
                    alp.rOe = aVar3.vHC.readString();
                    return 0;
                case 3:
                    alp.url = aVar3.vHC.readString();
                    return 0;
                case 4:
                    alp.bWP = aVar3.vHC.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}