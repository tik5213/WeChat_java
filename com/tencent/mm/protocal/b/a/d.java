package com.tencent.mm.protocal.b.a;

import com.tencent.mm.bk.a;

public final class d extends a {
    public String bOX;
    public int bXP;
    public String desc;
    public String jap;
    public String title;

    protected final int a(int i, Object... objArr) {
        int h;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.title != null) {
                aVar.g(1, this.title);
            }
            if (this.desc != null) {
                aVar.g(2, this.desc);
            }
            if (this.bOX != null) {
                aVar.g(3, this.bOX);
            }
            aVar.fT(4, this.bXP);
            if (this.jap == null) {
                return 0;
            }
            aVar.g(5, this.jap);
            return 0;
        } else if (i == 1) {
            if (this.title != null) {
                h = f.a.a.b.b.a.h(1, this.title) + 0;
            } else {
                h = 0;
            }
            if (this.desc != null) {
                h += f.a.a.b.b.a.h(2, this.desc);
            }
            if (this.bOX != null) {
                h += f.a.a.b.b.a.h(3, this.bOX);
            }
            h += f.a.a.a.fQ(4, this.bXP);
            if (this.jap != null) {
                h += f.a.a.b.b.a.h(5, this.jap);
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
            d dVar = (d) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    dVar.title = aVar3.vHC.readString();
                    return 0;
                case 2:
                    dVar.desc = aVar3.vHC.readString();
                    return 0;
                case 3:
                    dVar.bOX = aVar3.vHC.readString();
                    return 0;
                case 4:
                    dVar.bXP = aVar3.vHC.rY();
                    return 0;
                case 5:
                    dVar.jap = aVar3.vHC.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
