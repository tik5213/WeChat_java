package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.a;

public final class fc extends a {
    public int paB;
    public String paC;
    public String paD;
    public String paE;
    public String title;

    protected final int a(int i, Object... objArr) {
        int h;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.title != null) {
                aVar.g(1, this.title);
            }
            aVar.fT(2, this.paB);
            if (this.paC != null) {
                aVar.g(3, this.paC);
            }
            if (this.paD != null) {
                aVar.g(4, this.paD);
            }
            if (this.paE == null) {
                return 0;
            }
            aVar.g(5, this.paE);
            return 0;
        } else if (i == 1) {
            if (this.title != null) {
                h = f.a.a.b.b.a.h(1, this.title) + 0;
            } else {
                h = 0;
            }
            h += f.a.a.a.fQ(2, this.paB);
            if (this.paC != null) {
                h += f.a.a.b.b.a.h(3, this.paC);
            }
            if (this.paD != null) {
                h += f.a.a.b.b.a.h(4, this.paD);
            }
            if (this.paE != null) {
                h += f.a.a.b.b.a.h(5, this.paE);
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
            fc fcVar = (fc) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    fcVar.title = aVar3.vHC.readString();
                    return 0;
                case 2:
                    fcVar.paB = aVar3.vHC.rY();
                    return 0;
                case 3:
                    fcVar.paC = aVar3.vHC.readString();
                    return 0;
                case 4:
                    fcVar.paD = aVar3.vHC.readString();
                    return 0;
                case 5:
                    fcVar.paE = aVar3.vHC.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
