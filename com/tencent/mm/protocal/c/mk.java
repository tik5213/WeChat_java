package com.tencent.mm.protocal.c;

import f.a.a.b;
import f.a.a.c.a;
import java.util.LinkedList;

public final class mk extends bhp {
    public String desc;
    public int hUm;
    public String hUn;
    public String mxM;
    public String rqB;
    public LinkedList<Integer> rqc = new LinkedList();
    public int rqe;
    public String rqp;
    public String rqs;
    public String rqv;
    public String rqx;
    public String rqy;

    protected final int a(int i, Object... objArr) {
        int fS;
        byte[] bArr;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.six == null) {
                throw new b("Not all required fields were included: BaseResponse");
            }
            if (this.six != null) {
                aVar.fV(1, this.six.boi());
                this.six.a(aVar);
            }
            aVar.fT(2, this.hUm);
            if (this.hUn != null) {
                aVar.g(3, this.hUn);
            }
            if (this.rqs != null) {
                aVar.g(4, this.rqs);
            }
            aVar.d(5, 2, this.rqc);
            if (this.desc != null) {
                aVar.g(6, this.desc);
            }
            if (this.rqB != null) {
                aVar.g(7, this.rqB);
            }
            if (this.mxM != null) {
                aVar.g(8, this.mxM);
            }
            if (this.rqv != null) {
                aVar.g(9, this.rqv);
            }
            if (this.rqx != null) {
                aVar.g(10, this.rqx);
            }
            if (this.rqy != null) {
                aVar.g(11, this.rqy);
            }
            aVar.fT(12, this.rqe);
            if (this.rqp == null) {
                return 0;
            }
            aVar.g(13, this.rqp);
            return 0;
        } else if (i == 1) {
            if (this.six != null) {
                fS = f.a.a.a.fS(1, this.six.boi()) + 0;
            } else {
                fS = 0;
            }
            fS += f.a.a.a.fQ(2, this.hUm);
            if (this.hUn != null) {
                fS += f.a.a.b.b.a.h(3, this.hUn);
            }
            if (this.rqs != null) {
                fS += f.a.a.b.b.a.h(4, this.rqs);
            }
            fS += f.a.a.a.c(5, 2, this.rqc);
            if (this.desc != null) {
                fS += f.a.a.b.b.a.h(6, this.desc);
            }
            if (this.rqB != null) {
                fS += f.a.a.b.b.a.h(7, this.rqB);
            }
            if (this.mxM != null) {
                fS += f.a.a.b.b.a.h(8, this.mxM);
            }
            if (this.rqv != null) {
                fS += f.a.a.b.b.a.h(9, this.rqv);
            }
            if (this.rqx != null) {
                fS += f.a.a.b.b.a.h(10, this.rqx);
            }
            if (this.rqy != null) {
                fS += f.a.a.b.b.a.h(11, this.rqy);
            }
            fS += f.a.a.a.fQ(12, this.rqe);
            if (this.rqp != null) {
                fS += f.a.a.b.b.a.h(13, this.rqp);
            }
            return fS;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.rqc.clear();
            f.a.a.a.a aVar2 = new f.a.a.a.a(bArr, unknownTagHandler);
            for (fS = bhp.a(aVar2); fS > 0; fS = bhp.a(aVar2)) {
                if (!super.a(aVar2, this, fS)) {
                    aVar2.cJS();
                }
            }
            if (this.six != null) {
                return 0;
            }
            throw new b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            mk mkVar = (mk) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList IC = aVar3.IC(intValue);
                    int size = IC.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) IC.get(intValue);
                        fl flVar = new fl();
                        f.a.a.a.a aVar4 = new f.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = flVar.a(aVar4, flVar, bhp.a(aVar4))) {
                        }
                        mkVar.six = flVar;
                    }
                    return 0;
                case 2:
                    mkVar.hUm = aVar3.vHC.rY();
                    return 0;
                case 3:
                    mkVar.hUn = aVar3.vHC.readString();
                    return 0;
                case 4:
                    mkVar.rqs = aVar3.vHC.readString();
                    return 0;
                case 5:
                    mkVar.rqc.add(Integer.valueOf(aVar3.vHC.rY()));
                    return 0;
                case 6:
                    mkVar.desc = aVar3.vHC.readString();
                    return 0;
                case 7:
                    mkVar.rqB = aVar3.vHC.readString();
                    return 0;
                case 8:
                    mkVar.mxM = aVar3.vHC.readString();
                    return 0;
                case 9:
                    mkVar.rqv = aVar3.vHC.readString();
                    return 0;
                case 10:
                    mkVar.rqx = aVar3.vHC.readString();
                    return 0;
                case 11:
                    mkVar.rqy = aVar3.vHC.readString();
                    return 0;
                case 12:
                    mkVar.rqe = aVar3.vHC.rY();
                    return 0;
                case 13:
                    mkVar.rqp = aVar3.vHC.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}