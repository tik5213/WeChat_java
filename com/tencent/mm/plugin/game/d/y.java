package com.tencent.mm.plugin.game.d;

import com.tencent.mm.bk.b;
import com.tencent.mm.protocal.c.bhd;
import com.tencent.mm.protocal.c.fk;
import f.a.a.c.a;
import java.util.LinkedList;

public final class y extends bhd {
    public String jPc;
    public String jQk;
    public b jQl;
    public b jQm;

    protected final int a(int i, Object... objArr) {
        int fS;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.jPc == null) {
                throw new f.a.a.b("Not all required fields were included: AppID");
            } else if (this.jQk == null) {
                throw new f.a.a.b("Not all required fields were included: GroupID");
            } else {
                if (this.shX != null) {
                    aVar.fV(1, this.shX.boi());
                    this.shX.a(aVar);
                }
                if (this.jPc != null) {
                    aVar.g(2, this.jPc);
                }
                if (this.jQk != null) {
                    aVar.g(3, this.jQk);
                }
                if (this.jQl != null) {
                    aVar.b(4, this.jQl);
                }
                if (this.jQm == null) {
                    return 0;
                }
                aVar.b(5, this.jQm);
                return 0;
            }
        } else if (i == 1) {
            if (this.shX != null) {
                fS = f.a.a.a.fS(1, this.shX.boi()) + 0;
            } else {
                fS = 0;
            }
            if (this.jPc != null) {
                fS += f.a.a.b.b.a.h(2, this.jPc);
            }
            if (this.jQk != null) {
                fS += f.a.a.b.b.a.h(3, this.jQk);
            }
            if (this.jQl != null) {
                fS += f.a.a.a.a(4, this.jQl);
            }
            if (this.jQm != null) {
                fS += f.a.a.a.a(5, this.jQm);
            }
            return fS;
        } else if (i == 2) {
            f.a.a.a.a aVar2 = new f.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (fS = bhd.a(aVar2); fS > 0; fS = bhd.a(aVar2)) {
                if (!super.a(aVar2, this, fS)) {
                    aVar2.cJS();
                }
            }
            if (this.jPc == null) {
                throw new f.a.a.b("Not all required fields were included: AppID");
            } else if (this.jQk != null) {
                return 0;
            } else {
                throw new f.a.a.b("Not all required fields were included: GroupID");
            }
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            y yVar = (y) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList IC = aVar3.IC(intValue);
                    int size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) IC.get(intValue);
                        fk fkVar = new fk();
                        f.a.a.a.a aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = fkVar.a(aVar4, fkVar, bhd.a(aVar4))) {
                        }
                        yVar.shX = fkVar;
                    }
                    return 0;
                case 2:
                    yVar.jPc = aVar3.vHC.readString();
                    return 0;
                case 3:
                    yVar.jQk = aVar3.vHC.readString();
                    return 0;
                case 4:
                    yVar.jQl = aVar3.cJR();
                    return 0;
                case 5:
                    yVar.jQm = aVar3.cJR();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
