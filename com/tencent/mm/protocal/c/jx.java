package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.a;
import f.a.a.b;

public final class jx extends a {
    public String bHD;
    public String jPK;
    public String rlr;
    public String rls;
    public int rlt;
    public String rlu;
    public int rlv;

    protected final int a(int i, Object... objArr) {
        int h;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.bHD == null) {
                throw new b("Not all required fields were included: Title");
            } else if (this.jPK == null) {
                throw new b("Not all required fields were included: Url");
            } else if (this.rlr == null) {
                throw new b("Not all required fields were included: Position");
            } else if (this.rls == null) {
                throw new b("Not all required fields were included: DetailInfo");
            } else {
                if (this.bHD != null) {
                    aVar.g(1, this.bHD);
                }
                if (this.jPK != null) {
                    aVar.g(2, this.jPK);
                }
                if (this.rlr != null) {
                    aVar.g(3, this.rlr);
                }
                if (this.rls != null) {
                    aVar.g(4, this.rls);
                }
                aVar.fT(5, this.rlt);
                if (this.rlu != null) {
                    aVar.g(6, this.rlu);
                }
                aVar.fT(7, this.rlv);
                return 0;
            }
        } else if (i == 1) {
            if (this.bHD != null) {
                h = f.a.a.b.b.a.h(1, this.bHD) + 0;
            } else {
                h = 0;
            }
            if (this.jPK != null) {
                h += f.a.a.b.b.a.h(2, this.jPK);
            }
            if (this.rlr != null) {
                h += f.a.a.b.b.a.h(3, this.rlr);
            }
            if (this.rls != null) {
                h += f.a.a.b.b.a.h(4, this.rls);
            }
            h += f.a.a.a.fQ(5, this.rlt);
            if (this.rlu != null) {
                h += f.a.a.b.b.a.h(6, this.rlu);
            }
            return h + f.a.a.a.fQ(7, this.rlv);
        } else if (i == 2) {
            f.a.a.a.a aVar2 = new f.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (h = a.a(aVar2); h > 0; h = a.a(aVar2)) {
                if (!super.a(aVar2, this, h)) {
                    aVar2.cJS();
                }
            }
            if (this.bHD == null) {
                throw new b("Not all required fields were included: Title");
            } else if (this.jPK == null) {
                throw new b("Not all required fields were included: Url");
            } else if (this.rlr == null) {
                throw new b("Not all required fields were included: Position");
            } else if (this.rls != null) {
                return 0;
            } else {
                throw new b("Not all required fields were included: DetailInfo");
            }
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            jx jxVar = (jx) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    jxVar.bHD = aVar3.vHC.readString();
                    return 0;
                case 2:
                    jxVar.jPK = aVar3.vHC.readString();
                    return 0;
                case 3:
                    jxVar.rlr = aVar3.vHC.readString();
                    return 0;
                case 4:
                    jxVar.rls = aVar3.vHC.readString();
                    return 0;
                case 5:
                    jxVar.rlt = aVar3.vHC.rY();
                    return 0;
                case 6:
                    jxVar.rlu = aVar3.vHC.readString();
                    return 0;
                case 7:
                    jxVar.rlv = aVar3.vHC.rY();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
