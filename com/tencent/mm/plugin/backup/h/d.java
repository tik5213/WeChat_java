package com.tencent.mm.plugin.backup.h;

import com.tencent.mm.bk.a;
import f.a.a.b;
import java.util.LinkedList;

public final class d extends a {
    public String ID;
    public int hbA;
    public int hbB;
    public int hbC;
    public h hbt;
    public int hbu;
    public int hbv;
    public int hbw;
    public int hbx;
    public int hby;
    public int hbz;

    protected final int a(int i, Object... objArr) {
        int h;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.ID == null) {
                throw new b("Not all required fields were included: ID");
            }
            if (this.ID != null) {
                aVar.g(1, this.ID);
            }
            if (this.hbt != null) {
                aVar.fV(2, this.hbt.boi());
                this.hbt.a(aVar);
            }
            aVar.fT(3, this.hbu);
            aVar.fT(4, this.hbv);
            aVar.fT(5, this.hbw);
            aVar.fT(6, this.hbx);
            aVar.fT(7, this.hby);
            aVar.fT(8, this.hbz);
            aVar.fT(9, this.hbA);
            aVar.fT(10, this.hbB);
            aVar.fT(11, this.hbC);
            return 0;
        } else if (i == 1) {
            if (this.ID != null) {
                h = f.a.a.b.b.a.h(1, this.ID) + 0;
            } else {
                h = 0;
            }
            if (this.hbt != null) {
                h += f.a.a.a.fS(2, this.hbt.boi());
            }
            return ((((((((h + f.a.a.a.fQ(3, this.hbu)) + f.a.a.a.fQ(4, this.hbv)) + f.a.a.a.fQ(5, this.hbw)) + f.a.a.a.fQ(6, this.hbx)) + f.a.a.a.fQ(7, this.hby)) + f.a.a.a.fQ(8, this.hbz)) + f.a.a.a.fQ(9, this.hbA)) + f.a.a.a.fQ(10, this.hbB)) + f.a.a.a.fQ(11, this.hbC);
        } else if (i == 2) {
            f.a.a.a.a aVar2 = new f.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (h = a.a(aVar2); h > 0; h = a.a(aVar2)) {
                if (!super.a(aVar2, this, h)) {
                    aVar2.cJS();
                }
            }
            if (this.ID != null) {
                return 0;
            }
            throw new b("Not all required fields were included: ID");
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            d dVar = (d) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    dVar.ID = aVar3.vHC.readString();
                    return 0;
                case 2:
                    LinkedList IC = aVar3.IC(intValue);
                    int size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) IC.get(intValue);
                        h hVar = new h();
                        f.a.a.a.a aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = hVar.a(aVar4, hVar, a.a(aVar4))) {
                        }
                        dVar.hbt = hVar;
                    }
                    return 0;
                case 3:
                    dVar.hbu = aVar3.vHC.rY();
                    return 0;
                case 4:
                    dVar.hbv = aVar3.vHC.rY();
                    return 0;
                case 5:
                    dVar.hbw = aVar3.vHC.rY();
                    return 0;
                case 6:
                    dVar.hbx = aVar3.vHC.rY();
                    return 0;
                case 7:
                    dVar.hby = aVar3.vHC.rY();
                    return 0;
                case 8:
                    dVar.hbz = aVar3.vHC.rY();
                    return 0;
                case 9:
                    dVar.hbA = aVar3.vHC.rY();
                    return 0;
                case 10:
                    dVar.hbB = aVar3.vHC.rY();
                    return 0;
                case 11:
                    dVar.hbC = aVar3.vHC.rY();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
