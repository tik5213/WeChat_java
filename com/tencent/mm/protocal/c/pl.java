package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.a;

public final class pl extends a {
    public String kQE;
    public String rtL;

    protected final int a(int i, Object... objArr) {
        int h;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.rtL != null) {
                aVar.g(1, this.rtL);
            }
            if (this.kQE == null) {
                return 0;
            }
            aVar.g(2, this.kQE);
            return 0;
        } else if (i == 1) {
            if (this.rtL != null) {
                h = f.a.a.b.b.a.h(1, this.rtL) + 0;
            } else {
                h = 0;
            }
            if (this.kQE != null) {
                h += f.a.a.b.b.a.h(2, this.kQE);
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
            pl plVar = (pl) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    plVar.rtL = aVar3.vHC.readString();
                    return 0;
                case 2:
                    plVar.kQE = aVar3.vHC.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
