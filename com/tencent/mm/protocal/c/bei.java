package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.a;
import f.a.a.b;
import java.util.LinkedList;

public final class bei extends a {
    public bhz rbR;
    public bhz rvi;

    protected final int a(int i, Object... objArr) {
        int fS;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.rbR == null) {
                throw new b("Not all required fields were included: ChatRoomName");
            } else if (this.rvi == null) {
                throw new b("Not all required fields were included: UserName");
            } else {
                if (this.rbR != null) {
                    aVar.fV(1, this.rbR.boi());
                    this.rbR.a(aVar);
                }
                if (this.rvi == null) {
                    return 0;
                }
                aVar.fV(2, this.rvi.boi());
                this.rvi.a(aVar);
                return 0;
            }
        } else if (i == 1) {
            if (this.rbR != null) {
                fS = f.a.a.a.fS(1, this.rbR.boi()) + 0;
            } else {
                fS = 0;
            }
            if (this.rvi != null) {
                fS += f.a.a.a.fS(2, this.rvi.boi());
            }
            return fS;
        } else if (i == 2) {
            f.a.a.a.a aVar2 = new f.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (fS = a.a(aVar2); fS > 0; fS = a.a(aVar2)) {
                if (!super.a(aVar2, this, fS)) {
                    aVar2.cJS();
                }
            }
            if (this.rbR == null) {
                throw new b("Not all required fields were included: ChatRoomName");
            } else if (this.rvi != null) {
                return 0;
            } else {
                throw new b("Not all required fields were included: UserName");
            }
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            bei bei = (bei) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList IC;
            int size;
            byte[] bArr;
            bhz bhz;
            f.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        bhz = new bhz();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bhz.a(aVar4, bhz, a.a(aVar4))) {
                        }
                        bei.rbR = bhz;
                    }
                    return 0;
                case 2:
                    IC = aVar3.IC(intValue);
                    size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        bhz = new bhz();
                        aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = bhz.a(aVar4, bhz, a.a(aVar4))) {
                        }
                        bei.rvi = bhz;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
