package com.tencent.mm.plugin.game.d;

import com.tencent.mm.bk.a;
import f.a.a.b;

public final class dj extends a {
    public String jTv;
    public String jTw;

    protected final int a(int i, Object... objArr) {
        int h;
        if (i == 0) {
            f.a.a.c.a aVar = (f.a.a.c.a) objArr[0];
            if (this.jTv == null) {
                throw new b("Not all required fields were included: FromUserName");
            } else if (this.jTw == null) {
                throw new b("Not all required fields were included: TimeDesc");
            } else {
                if (this.jTv != null) {
                    aVar.g(1, this.jTv);
                }
                if (this.jTw == null) {
                    return 0;
                }
                aVar.g(2, this.jTw);
                return 0;
            }
        } else if (i == 1) {
            if (this.jTv != null) {
                h = f.a.a.b.b.a.h(1, this.jTv) + 0;
            } else {
                h = 0;
            }
            if (this.jTw != null) {
                h += f.a.a.b.b.a.h(2, this.jTw);
            }
            return h;
        } else if (i == 2) {
            f.a.a.a.a aVar2 = new f.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (h = a.a(aVar2); h > 0; h = a.a(aVar2)) {
                if (!super.a(aVar2, this, h)) {
                    aVar2.cJS();
                }
            }
            if (this.jTv == null) {
                throw new b("Not all required fields were included: FromUserName");
            } else if (this.jTw != null) {
                return 0;
            } else {
                throw new b("Not all required fields were included: TimeDesc");
            }
        } else if (i != 3) {
            return -1;
        } else {
            f.a.a.a.a aVar3 = (f.a.a.a.a) objArr[0];
            dj djVar = (dj) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    djVar.jTv = aVar3.vHC.readString();
                    return 0;
                case 2:
                    djVar.jTw = aVar3.vHC.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
