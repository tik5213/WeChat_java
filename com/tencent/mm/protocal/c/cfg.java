package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.a;
import com.tencent.mm.bk.b;

public final class cfg extends a {
    public String hcS;
    public b szc;
    public String szk;

    protected final int a(int i, Object... objArr) {
        int h;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.szk == null) {
                throw new f.a.a.b("Not all required fields were included: Talker");
            } else if (this.hcS == null) {
                throw new f.a.a.b("Not all required fields were included: NickName");
            } else {
                if (this.szk != null) {
                    aVar.g(1, this.szk);
                }
                if (this.hcS != null) {
                    aVar.g(2, this.hcS);
                }
                if (this.szc == null) {
                    return 0;
                }
                aVar.b(3, this.szc);
                return 0;
            }
        } else if (i == 1) {
            if (this.szk != null) {
                h = f.a.a.b.b.a.h(1, this.szk) + 0;
            } else {
                h = 0;
            }
            if (this.hcS != null) {
                h += f.a.a.b.b.a.h(2, this.hcS);
            }
            if (this.szc != null) {
                h += f.a.a.a.a(3, this.szc);
            }
            return h;
        } else if (i == 2) {
            f.a.a.a.a aVar2 = new f.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (h = a.a(aVar2); h > 0; h = a.a(aVar2)) {
                if (!super.a(aVar2, this, h)) {
                    aVar2.cJS();
                }
            }
            if (this.szk == null) {
                throw new f.a.a.b("Not all required fields were included: Talker");
            } else if (this.hcS != null) {
                return 0;
            } else {
                throw new f.a.a.b("Not all required fields were included: NickName");
            }
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            cfg cfg = (cfg) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    cfg.szk = aVar3.vHC.readString();
                    return 0;
                case 2:
                    cfg.hcS = aVar3.vHC.readString();
                    return 0;
                case 3:
                    cfg.szc = aVar3.cJR();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
