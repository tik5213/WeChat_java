package com.tencent.mm.ui;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.tencent.mm.model.au;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.ae.b;
import com.tencent.mm.ui.ae.c;
import java.util.ArrayList;

public final class ad {
    private static ad tpC = null;
    private long timestamp = 0;
    int tpD = 0;
    private SparseIntArray tpE = new SparseIntArray();
    private SparseArray<b> tpF = new SparseArray();
    private ArrayList<Integer> tpG = new ArrayList();
    public SparseArray<c> tpH = new SparseArray();
    private boolean tpI = false;

    public static ad cqQ() {
        if (tpC == null) {
            tpC = new ad();
        }
        return tpC;
    }

    public final void DZ(int i) {
        if (this.tpF.size() != 0) {
            b bVar = (b) this.tpF.get(i);
            if (bVar != null && bVar.tpN == 1) {
                this.tpE.put(bVar.id, bVar.egS);
                this.tpD--;
                if (this.tpI) {
                    StringBuffer stringBuffer = new StringBuffer();
                    for (int i2 = 0; i2 < this.tpE.size(); i2++) {
                        int keyAt = this.tpE.keyAt(i2);
                        Integer valueOf = Integer.valueOf(this.tpE.get(keyAt));
                        stringBuffer.append(keyAt);
                        stringBuffer.append(":");
                        stringBuffer.append(valueOf);
                        stringBuffer.append("|");
                    }
                    au.HU();
                    com.tencent.mm.model.c.DT().set(299010, stringBuffer.toString());
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void lG(boolean r15) {
        /*
        r14 = this;
        r13 = 2;
        r5 = 1;
        r3 = 0;
        if (r15 != 0) goto L_0x001e;
    L_0x0005:
        r0 = r14.tpF;	 Catch:{ Exception -> 0x00e2 }
        r0 = r0.size();	 Catch:{ Exception -> 0x00e2 }
        if (r0 == 0) goto L_0x001b;
    L_0x000d:
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x00e2 }
        r6 = r14.timestamp;	 Catch:{ Exception -> 0x00e2 }
        r0 = r0 - r6;
        r6 = 3600000; // 0x36ee80 float:5.044674E-39 double:1.7786363E-317;
        r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));
        if (r0 <= 0) goto L_0x00d1;
    L_0x001b:
        r0 = r5;
    L_0x001c:
        if (r0 == 0) goto L_0x00ee;
    L_0x001e:
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x00e2 }
        r0 = com.tencent.mm.k.g.AT();	 Catch:{ Exception -> 0x00e2 }
        r1 = "TopRightMenu\\d*";
        r0 = r0.fl(r1);	 Catch:{ Exception -> 0x00e2 }
        r1 = "MicroMsg.PlusMenaDataManager";
        r2 = "dynaConfigs size %d";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x00e2 }
        r8 = 0;
        r9 = r0.size();	 Catch:{ Exception -> 0x00e2 }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ Exception -> 0x00e2 }
        r4[r8] = r9;	 Catch:{ Exception -> 0x00e2 }
        com.tencent.mm.sdk.platformtools.x.i(r1, r2, r4);	 Catch:{ Exception -> 0x00e2 }
        monitor-enter(r14);	 Catch:{ Exception -> 0x00e2 }
        r1 = r14.tpF;	 Catch:{ all -> 0x00df }
        r1.clear();	 Catch:{ all -> 0x00df }
        r1 = r14.tpG;	 Catch:{ all -> 0x00df }
        r1.clear();	 Catch:{ all -> 0x00df }
        r2 = r0.iterator();	 Catch:{ all -> 0x00df }
    L_0x0053:
        r0 = r2.hasNext();	 Catch:{ all -> 0x00df }
        if (r0 == 0) goto L_0x0153;
    L_0x0059:
        r0 = r2.next();	 Catch:{ all -> 0x00df }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x00df }
        r1 = "Menu";
        r1 = com.tencent.mm.sdk.platformtools.bl.z(r0, r1);	 Catch:{ all -> 0x00df }
        if (r1 == 0) goto L_0x0053;
    L_0x0068:
        r0 = r1.size();	 Catch:{ all -> 0x00df }
        if (r0 == 0) goto L_0x0053;
    L_0x006e:
        r0 = ".Menu.$id";
        r0 = r1.get(r0);	 Catch:{ all -> 0x00df }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x00df }
        r4 = com.tencent.mm.sdk.platformtools.bi.WU(r0);	 Catch:{ all -> 0x00df }
        r0 = ".Menu.$shownew";
        r0 = r1.get(r0);	 Catch:{ all -> 0x00df }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x00df }
        r8 = com.tencent.mm.sdk.platformtools.bi.WU(r0);	 Catch:{ all -> 0x00df }
        r0 = ".Menu.$seq";
        r0 = r1.get(r0);	 Catch:{ all -> 0x00df }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x00df }
        r9 = com.tencent.mm.sdk.platformtools.bi.WU(r0);	 Catch:{ all -> 0x00df }
        r0 = ".Menu.$order";
        r0 = r1.get(r0);	 Catch:{ all -> 0x00df }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x00df }
        r10 = com.tencent.mm.sdk.platformtools.bi.WU(r0);	 Catch:{ all -> 0x00df }
        r0 = r14.tpF;	 Catch:{ all -> 0x00df }
        r1 = new com.tencent.mm.ui.ae$b;	 Catch:{ all -> 0x00df }
        r1.<init>(r4, r8, r9, r10);	 Catch:{ all -> 0x00df }
        r0.put(r4, r1);	 Catch:{ all -> 0x00df }
        r1 = r3;
    L_0x00ad:
        r0 = r14.tpG;	 Catch:{ all -> 0x00df }
        r0 = r0.size();	 Catch:{ all -> 0x00df }
        if (r1 >= r0) goto L_0x00d4;
    L_0x00b5:
        r8 = r14.tpF;	 Catch:{ all -> 0x00df }
        r0 = r14.tpG;	 Catch:{ all -> 0x00df }
        r0 = r0.get(r1);	 Catch:{ all -> 0x00df }
        r0 = (java.lang.Integer) r0;	 Catch:{ all -> 0x00df }
        r0 = r0.intValue();	 Catch:{ all -> 0x00df }
        r0 = r8.get(r0);	 Catch:{ all -> 0x00df }
        r0 = (com.tencent.mm.ui.ae.b) r0;	 Catch:{ all -> 0x00df }
        r0 = r0.order;	 Catch:{ all -> 0x00df }
        if (r0 > r10) goto L_0x00d4;
    L_0x00cd:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x00ad;
    L_0x00d1:
        r0 = r3;
        goto L_0x001c;
    L_0x00d4:
        r0 = r14.tpG;	 Catch:{ all -> 0x00df }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x00df }
        r0.add(r1, r4);	 Catch:{ all -> 0x00df }
        goto L_0x0053;
    L_0x00df:
        r0 = move-exception;
        monitor-exit(r14);	 Catch:{ all -> 0x00df }
        throw r0;	 Catch:{ Exception -> 0x00e2 }
    L_0x00e2:
        r0 = move-exception;
        r1 = "MicroMsg.PlusMenaDataManager";
        r2 = "";
        r4 = new java.lang.Object[r3];
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace(r1, r0, r2, r4);
    L_0x00ee:
        r0 = r14.tpH;
        r0.clear();
        r14.tpD = r3;
        r1 = r3;
        r2 = r3;
    L_0x00f7:
        r0 = r14.tpG;
        r0 = r0.size();
        if (r1 >= r0) goto L_0x0283;
    L_0x00ff:
        r0 = r14.tpG;
        r0 = r0.get(r1);
        r0 = (java.lang.Integer) r0;
        r4 = r0.intValue();
        r0 = r14.tpF;
        r0 = r0.get(r4);
        r0 = (com.tencent.mm.ui.ae.b) r0;
        r6 = com.tencent.mm.ui.ae.Ea(r4);
        if (r6 == 0) goto L_0x014f;
    L_0x0119:
        r7 = new com.tencent.mm.ui.ae$c;
        r7.<init>(r6);
        r6 = r14.tpH;
        r6.put(r2, r7);
        r6 = r14.tpE;
        r6 = r6.get(r4);
        r8 = r0.tpN;
        if (r8 != r5) goto L_0x0131;
    L_0x012d:
        r0 = r0.egS;
        if (r6 != r0) goto L_0x0145;
    L_0x0131:
        r0 = 20;
        if (r4 != r0) goto L_0x014d;
    L_0x0135:
        r0 = com.tencent.mm.s.c.Cp();
        r4 = 262159; // 0x4000f float:3.67363E-40 double:1.29524E-318;
        r6 = 266248; // 0x41008 float:3.73093E-40 double:1.31544E-318;
        r0 = r0.aU(r4, r6);
        if (r0 == 0) goto L_0x014d;
    L_0x0145:
        r7.tpP = r5;
        r0 = r14.tpD;
        r0 = r0 + 1;
        r14.tpD = r0;
    L_0x014d:
        r2 = r2 + 1;
    L_0x014f:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x00f7;
    L_0x0153:
        r0 = "MicroMsg.PlusMenaDataManager";
        r1 = "dynaMenuOrder size %d";
        r2 = 1;
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x00df }
        r4 = 0;
        r8 = r14.tpG;	 Catch:{ all -> 0x00df }
        r8 = r8.size();	 Catch:{ all -> 0x00df }
        r8 = java.lang.Integer.valueOf(r8);	 Catch:{ all -> 0x00df }
        r2[r4] = r8;	 Catch:{ all -> 0x00df }
        com.tencent.mm.sdk.platformtools.x.i(r0, r1, r2);	 Catch:{ all -> 0x00df }
        r0 = r14.tpG;	 Catch:{ all -> 0x00df }
        r0 = r0.size();	 Catch:{ all -> 0x00df }
        if (r0 != 0) goto L_0x01a1;
    L_0x0174:
        r0 = r14.tpF;	 Catch:{ all -> 0x00df }
        r0.clear();	 Catch:{ all -> 0x00df }
        r0 = r14.tpG;	 Catch:{ all -> 0x00df }
        r0.clear();	 Catch:{ all -> 0x00df }
        r0 = com.tencent.mm.k.g.AT();	 Catch:{ all -> 0x00df }
        r1 = "TopRightMenus";
        r0 = r0.getValue(r1);	 Catch:{ all -> 0x00df }
        r1 = com.tencent.mm.sdk.platformtools.bi.oW(r0);	 Catch:{ all -> 0x00df }
        if (r1 != 0) goto L_0x01a1;
    L_0x018f:
        r1 = "TopRightMenus";
        r8 = com.tencent.mm.sdk.platformtools.bl.z(r0, r1);	 Catch:{ all -> 0x00df }
        if (r8 != 0) goto L_0x01cc;
    L_0x0198:
        r0 = "MicroMsg.PlusMenaDataManager";
        r1 = "TopRightMenus is not right";
        com.tencent.mm.sdk.platformtools.x.e(r0, r1);	 Catch:{ all -> 0x00df }
    L_0x01a1:
        monitor-exit(r14);	 Catch:{ all -> 0x00df }
        r0 = r14.tpF;	 Catch:{ Exception -> 0x00e2 }
        r0 = r0.size();	 Catch:{ Exception -> 0x00e2 }
        if (r0 == 0) goto L_0x01ad;
    L_0x01aa:
        r14.cqR();	 Catch:{ Exception -> 0x00e2 }
    L_0x01ad:
        r0 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x00e2 }
        r14.timestamp = r0;	 Catch:{ Exception -> 0x00e2 }
        r0 = "MicroMsg.PlusMenaDataManager";
        r1 = " plus menu load data spent time : %s";
        r2 = 1;
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x00e2 }
        r4 = 0;
        r8 = r14.timestamp;	 Catch:{ Exception -> 0x00e2 }
        r6 = r8 - r6;
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ Exception -> 0x00e2 }
        r2[r4] = r6;	 Catch:{ Exception -> 0x00e2 }
        com.tencent.mm.sdk.platformtools.x.d(r0, r1, r2);	 Catch:{ Exception -> 0x00e2 }
        goto L_0x00ee;
    L_0x01cc:
        r4 = r3;
    L_0x01cd:
        r0 = 100;
        if (r4 >= r0) goto L_0x01a1;
    L_0x01d1:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00df }
        r0 = ".TopRightMenus.Menu";
        r1.<init>(r0);	 Catch:{ all -> 0x00df }
        if (r4 != 0) goto L_0x027d;
    L_0x01db:
        r0 = "";
    L_0x01de:
        r0 = r1.append(r0);	 Catch:{ all -> 0x00df }
        r2 = r0.toString();	 Catch:{ all -> 0x00df }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00df }
        r0.<init>();	 Catch:{ all -> 0x00df }
        r0 = r0.append(r2);	 Catch:{ all -> 0x00df }
        r1 = ".$id";
        r0 = r0.append(r1);	 Catch:{ all -> 0x00df }
        r0 = r0.toString();	 Catch:{ all -> 0x00df }
        r0 = r8.get(r0);	 Catch:{ all -> 0x00df }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x00df }
        if (r0 == 0) goto L_0x01a1;
    L_0x0202:
        r1 = com.tencent.mm.sdk.platformtools.bi.oW(r0);	 Catch:{ all -> 0x00df }
        if (r1 != 0) goto L_0x01a1;
    L_0x0208:
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00df }
        r1.<init>();	 Catch:{ all -> 0x00df }
        r1 = r1.append(r2);	 Catch:{ all -> 0x00df }
        r9 = ".$shownew";
        r1 = r1.append(r9);	 Catch:{ all -> 0x00df }
        r1 = r1.toString();	 Catch:{ all -> 0x00df }
        r1 = r8.get(r1);	 Catch:{ all -> 0x00df }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x00df }
        r9 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00df }
        r9.<init>();	 Catch:{ all -> 0x00df }
        r2 = r9.append(r2);	 Catch:{ all -> 0x00df }
        r9 = ".$seq";
        r2 = r2.append(r9);	 Catch:{ all -> 0x00df }
        r2 = r2.toString();	 Catch:{ all -> 0x00df }
        r2 = r8.get(r2);	 Catch:{ all -> 0x00df }
        r2 = (java.lang.String) r2;	 Catch:{ all -> 0x00df }
        r9 = "MicroMsg.PlusMenaDataManager";
        r10 = "got plus panel configs : %s %s %s";
        r11 = 3;
        r11 = new java.lang.Object[r11];	 Catch:{ all -> 0x00df }
        r12 = 0;
        r11[r12] = r0;	 Catch:{ all -> 0x00df }
        r12 = 1;
        r11[r12] = r1;	 Catch:{ all -> 0x00df }
        r12 = 2;
        r11[r12] = r2;	 Catch:{ all -> 0x00df }
        com.tencent.mm.sdk.platformtools.x.d(r9, r10, r11);	 Catch:{ all -> 0x00df }
        r9 = r14.tpF;	 Catch:{ all -> 0x00df }
        r10 = com.tencent.mm.sdk.platformtools.bi.WU(r0);	 Catch:{ all -> 0x00df }
        r11 = new com.tencent.mm.ui.ae$b;	 Catch:{ all -> 0x00df }
        r12 = com.tencent.mm.sdk.platformtools.bi.WU(r0);	 Catch:{ all -> 0x00df }
        r1 = com.tencent.mm.sdk.platformtools.bi.WU(r1);	 Catch:{ all -> 0x00df }
        r2 = com.tencent.mm.sdk.platformtools.bi.WU(r2);	 Catch:{ all -> 0x00df }
        r11.<init>(r12, r1, r2);	 Catch:{ all -> 0x00df }
        r9.put(r10, r11);	 Catch:{ all -> 0x00df }
        r1 = r14.tpG;	 Catch:{ all -> 0x00df }
        r0 = com.tencent.mm.sdk.platformtools.bi.WU(r0);	 Catch:{ all -> 0x00df }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x00df }
        r1.add(r0);	 Catch:{ all -> 0x00df }
        r0 = r4 + 1;
        r4 = r0;
        goto L_0x01cd;
    L_0x027d:
        r0 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x00df }
        goto L_0x01de;
    L_0x0283:
        r0 = "MicroMsg.PlusMenaDataManager";
        r1 = "dynaMenuOrder.size() %s menuDataMap.size() %s";
        r4 = new java.lang.Object[r13];
        r6 = r14.tpG;
        r6 = r6.size();
        r6 = java.lang.Integer.valueOf(r6);
        r4[r3] = r6;
        r3 = r14.tpH;
        r3 = r3.size();
        r3 = java.lang.Integer.valueOf(r3);
        r4[r5] = r3;
        com.tencent.mm.sdk.platformtools.x.i(r0, r1, r4);
        r0 = com.tencent.mm.sdk.platformtools.e.chw();
        if (r0 != 0) goto L_0x02be;
    L_0x02ac:
        r0 = r14.tpH;
        r1 = new com.tencent.mm.ui.ae$c;
        r3 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r3 = com.tencent.mm.ui.ae.Ea(r3);
        r1.<init>(r3);
        r0.put(r2, r1);
    L_0x02bd:
        return;
    L_0x02be:
        r0 = r14.tpH;
        r1 = new com.tencent.mm.ui.ae$c;
        r3 = 2147483645; // 0x7ffffffd float:NaN double:1.060997894E-314;
        r3 = com.tencent.mm.ui.ae.Ea(r3);
        r1.<init>(r3);
        r0.put(r2, r1);
        goto L_0x02bd;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.ad.lG(boolean):void");
    }

    private void cqR() {
        this.tpE.clear();
        au.HU();
        String str = (String) com.tencent.mm.model.c.DT().get(299010, null);
        if (!bi.oW(str)) {
            String[] split = str.split("\\|");
            for (String split2 : split) {
                String[] split3 = split2.split("\\:");
                if (split3.length == 2) {
                    this.tpE.put(bi.WU(split3[0]), bi.WU(split3[1]));
                }
            }
        }
        this.tpI = true;
    }
}
