package com.tencent.mm.protocal.c;

import com.tencent.mm.bk.a;

public final class asw extends a {
    public String bIQ;
    public int bMF;
    public String bssid;
    public int jie;
    public int rVe;
    public String rVf;
    public String ssid;

    protected final int a(int i, Object... objArr) {
        int h;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.ssid != null) {
                aVar.g(1, this.ssid);
            }
            if (this.bssid != null) {
                aVar.g(2, this.bssid);
            }
            aVar.fT(3, this.bMF);
            aVar.fT(4, this.rVe);
            if (this.rVf != null) {
                aVar.g(5, this.rVf);
            }
            if (this.bIQ != null) {
                aVar.g(6, this.bIQ);
            }
            aVar.fT(7, this.jie);
            return 0;
        } else if (i == 1) {
            if (this.ssid != null) {
                h = f.a.a.b.b.a.h(1, this.ssid) + 0;
            } else {
                h = 0;
            }
            if (this.bssid != null) {
                h += f.a.a.b.b.a.h(2, this.bssid);
            }
            h = (h + f.a.a.a.fQ(3, this.bMF)) + f.a.a.a.fQ(4, this.rVe);
            if (this.rVf != null) {
                h += f.a.a.b.b.a.h(5, this.rVf);
            }
            if (this.bIQ != null) {
                h += f.a.a.b.b.a.h(6, this.bIQ);
            }
            return h + f.a.a.a.fQ(7, this.jie);
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
            asw asw = (asw) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    asw.ssid = aVar3.vHC.readString();
                    return 0;
                case 2:
                    asw.bssid = aVar3.vHC.readString();
                    return 0;
                case 3:
                    asw.bMF = aVar3.vHC.rY();
                    return 0;
                case 4:
                    asw.rVe = aVar3.vHC.rY();
                    return 0;
                case 5:
                    asw.rVf = aVar3.vHC.readString();
                    return 0;
                case 6:
                    asw.bIQ = aVar3.vHC.readString();
                    return 0;
                case 7:
                    asw.jie = aVar3.vHC.rY();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
