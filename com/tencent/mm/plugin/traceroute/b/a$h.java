package com.tencent.mm.plugin.traceroute.b;

import com.tencent.mm.plugin.traceroute.b.a.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;

class a$h implements Runnable {
    private String ip;
    final /* synthetic */ a oDo;
    private int oDw;

    public a$h(a aVar, String str, int i) {
        this.oDo = aVar;
        this.ip = str;
        this.oDw = i;
    }

    public final void run() {
        boolean z = true;
        x.i("MicroMsg.MMTraceRoute", "ttl= " + this.oDw);
        a aVar = this.oDo;
        String str = this.ip;
        int i = this.oDw;
        List A = b.A(new String[]{"ping", "-c 1", "-t " + String.valueOf(i), str});
        if (A.size() != 2) {
            aVar.a(str, String.format("%d : can not get roupter ip\n", new Object[]{Integer.valueOf(i)}), Integer.valueOf(i + 1));
        } else {
            String str2 = (String) A.get(0);
            if (str2.length() == 0) {
                x.e("MicroMsg.MMTraceRoute", "runcommand err");
            } else {
                String str3;
                int indexOf = str2.indexOf("From ");
                if (indexOf < 0) {
                    indexOf = str2.indexOf("from ");
                    if (indexOf < 0) {
                        str3 = null;
                        if (bi.oW(str3)) {
                            if (b.OA(str2) <= 0) {
                                str2 = String.format("%d : can not get roupter ip\n", new Object[]{Integer.valueOf(i)});
                                x.e("MicroMsg.MMTraceRoute", "can not get route ip and ttl" + str);
                                aVar.a(str, str2, Integer.valueOf(i + 1));
                            }
                            if (!z) {
                            }
                        }
                        if (str.equals(str3)) {
                            aVar.a(str, String.format("%d : FIN %s\n\n", new Object[]{Integer.valueOf(i), str3}), Integer.valueOf(i + 1));
                        } else if (b.OA(str2) > 0) {
                            aVar.a(str, String.format("%d : FIN %s\n\n ", new Object[]{Integer.valueOf(i), str3}), Integer.valueOf(i + 1));
                            if (a.oDe != null) {
                                a.oDe.execute(new g(aVar, str3, str, true, Integer.valueOf(i + 1)));
                            }
                        } else {
                            aVar.a(str, String.format("%d : %s", new Object[]{Integer.valueOf(i), str3}), Integer.valueOf(i + 1));
                            if (a.oDe != null) {
                                a.oDe.execute(new g(aVar, str3, str, false, Integer.valueOf(i + 1)));
                            }
                        }
                        if (!z) {
                        }
                    }
                }
                int indexOf2 = str2.indexOf(" ", indexOf);
                if (indexOf2 < 0) {
                    indexOf = str2.indexOf(":", indexOf);
                    if (indexOf < 0) {
                        str3 = null;
                        if (bi.oW(str3)) {
                            if (str.equals(str3)) {
                                aVar.a(str, String.format("%d : FIN %s\n\n", new Object[]{Integer.valueOf(i), str3}), Integer.valueOf(i + 1));
                            } else if (b.OA(str2) > 0) {
                                aVar.a(str, String.format("%d : FIN %s\n\n ", new Object[]{Integer.valueOf(i), str3}), Integer.valueOf(i + 1));
                                if (a.oDe != null) {
                                    a.oDe.execute(new g(aVar, str3, str, true, Integer.valueOf(i + 1)));
                                }
                            } else {
                                aVar.a(str, String.format("%d : %s", new Object[]{Integer.valueOf(i), str3}), Integer.valueOf(i + 1));
                                if (a.oDe != null) {
                                    a.oDe.execute(new g(aVar, str3, str, false, Integer.valueOf(i + 1)));
                                }
                            }
                            if (!z) {
                            }
                        }
                        if (b.OA(str2) <= 0) {
                            str2 = String.format("%d : can not get roupter ip\n", new Object[]{Integer.valueOf(i)});
                            x.e("MicroMsg.MMTraceRoute", "can not get route ip and ttl" + str);
                            aVar.a(str, str2, Integer.valueOf(i + 1));
                        }
                        if (!z) {
                        }
                    }
                }
                indexOf = indexOf2;
                indexOf++;
                indexOf2 = str2.indexOf(" ", indexOf);
                str3 = indexOf2 < 0 ? null : str2.substring(indexOf, indexOf2).replace(":", "");
                if (bi.oW(str3)) {
                    if (b.OA(str2) <= 0) {
                        str2 = String.format("%d : can not get roupter ip\n", new Object[]{Integer.valueOf(i)});
                        x.e("MicroMsg.MMTraceRoute", "can not get route ip and ttl" + str);
                        aVar.a(str, str2, Integer.valueOf(i + 1));
                    }
                    if (!z) {
                    }
                }
                if (str.equals(str3)) {
                    aVar.a(str, String.format("%d : FIN %s\n\n", new Object[]{Integer.valueOf(i), str3}), Integer.valueOf(i + 1));
                } else if (b.OA(str2) > 0) {
                    aVar.a(str, String.format("%d : FIN %s\n\n ", new Object[]{Integer.valueOf(i), str3}), Integer.valueOf(i + 1));
                    if (a.oDe != null) {
                        a.oDe.execute(new g(aVar, str3, str, true, Integer.valueOf(i + 1)));
                    }
                } else {
                    aVar.a(str, String.format("%d : %s", new Object[]{Integer.valueOf(i), str3}), Integer.valueOf(i + 1));
                    if (a.oDe != null) {
                        a.oDe.execute(new g(aVar, str3, str, false, Integer.valueOf(i + 1)));
                    }
                }
                if (!z) {
                }
            }
        }
        z = false;
        if (!z) {
        }
    }
}
