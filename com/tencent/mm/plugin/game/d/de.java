package com.tencent.mm.plugin.game.d;

import com.tencent.mm.bk.a;

public final class de extends a {
    public String jOT;
    public String jOU;
    public String jPA;
    public int jTt;

    protected final int a(int i, Object... objArr) {
        int h;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.jOT != null) {
                aVar.g(1, this.jOT);
            }
            if (this.jOU != null) {
                aVar.g(2, this.jOU);
            }
            aVar.fT(3, this.jTt);
            if (this.jPA == null) {
                return 0;
            }
            aVar.g(4, this.jPA);
            return 0;
        } else if (i == 1) {
            if (this.jOT != null) {
                h = f.a.a.b.b.a.h(1, this.jOT) + 0;
            } else {
                h = 0;
            }
            if (this.jOU != null) {
                h += f.a.a.b.b.a.h(2, this.jOU);
            }
            h += f.a.a.a.fQ(3, this.jTt);
            if (this.jPA != null) {
                h += f.a.a.b.b.a.h(4, this.jPA);
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
            de deVar = (de) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    deVar.jOT = aVar3.vHC.readString();
                    return 0;
                case 2:
                    deVar.jOU = aVar3.vHC.readString();
                    return 0;
                case 3:
                    deVar.jTt = aVar3.vHC.rY();
                    return 0;
                case 4:
                    deVar.jPA = aVar3.vHC.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
