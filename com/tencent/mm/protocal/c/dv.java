package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.a;
import f.a.a.b;
import java.util.LinkedList;

public final class dv extends a {
    public String bLe;
    public String ebR;
    public String reg;
    public LinkedList<String> reh = new LinkedList();

    protected final int a(int i, Object... objArr) {
        int h;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.reg == null) {
                throw new b("Not all required fields were included: roomname");
            }
            if (this.reg != null) {
                aVar.g(1, this.reg);
            }
            if (this.bLe != null) {
                aVar.g(2, this.bLe);
            }
            if (this.ebR != null) {
                aVar.g(3, this.ebR);
            }
            aVar.d(4, 1, this.reh);
            return 0;
        } else if (i == 1) {
            if (this.reg != null) {
                h = f.a.a.b.b.a.h(1, this.reg) + 0;
            } else {
                h = 0;
            }
            if (this.bLe != null) {
                h += f.a.a.b.b.a.h(2, this.bLe);
            }
            if (this.ebR != null) {
                h += f.a.a.b.b.a.h(3, this.ebR);
            }
            return h + f.a.a.a.c(4, 1, this.reh);
        } else if (i == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.reh.clear();
            f.a.a.a.a aVar2 = new f.a.a.a.a(bArr, unknownTagHandler);
            for (h = a.a(aVar2); h > 0; h = a.a(aVar2)) {
                if (!super.a(aVar2, this, h)) {
                    aVar2.cJS();
                }
            }
            if (this.reg != null) {
                return 0;
            }
            throw new b("Not all required fields were included: roomname");
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            dv dvVar = (dv) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    dvVar.reg = aVar3.vHC.readString();
                    return 0;
                case 2:
                    dvVar.bLe = aVar3.vHC.readString();
                    return 0;
                case 3:
                    dvVar.ebR = aVar3.vHC.readString();
                    return 0;
                case 4:
                    dvVar.reh.add(aVar3.vHC.readString());
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
