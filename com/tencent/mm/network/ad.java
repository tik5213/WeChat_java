package com.tencent.mm.network;

import android.content.SharedPreferences;
import com.tencent.mm.compatible.util.e;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public final class ad {
    public static final String etE = (e.bnC + "/tencent/noop.dat");
    private static long etF;
    private static long lastUpdateTime;

    static {
        long j;
        lastUpdateTime = 0;
        SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.ad.getContext().getSharedPreferences("noop_prefs", 0);
        int i = sharedPreferences.getInt("noop_strategy", 1);
        if (1 == i) {
            etF = 270;
            new StringBuilder("getNoopIntervalInMs use hard code noop:").append(etF);
            j = etF * 1000;
        } else if (3 == i) {
            j = sharedPreferences.getLong("noop_min_interval", 270);
            if (j < 180 || j > 3600) {
                etF = 270;
                new StringBuilder("getNoopIntervalInMs use wx noop:").append(etF);
                j = etF * 1000;
            } else {
                etF = j;
                j *= 1000;
            }
        } else {
            j = System.currentTimeMillis() / 1000;
            if (j - lastUpdateTime > 3600) {
                long[] Vf = Vf();
                if (Vf[0] < 180 || Vf[0] > 3600) {
                    etF = 270;
                } else {
                    etF = Vf[0];
                }
                lastUpdateTime = j;
            }
            new StringBuilder("getNoopIntervalInMs use sync noop:").append(etF);
            j = etF * 1000;
        }
        etF = j / 1000;
    }

    public static void m(long j, long j2) {
        Exception e;
        Throwable th;
        new StringBuilder("setNoopInterval interval:").append(j).append(", svr:").append(j2);
        if (j2 > 0) {
            com.tencent.mm.sdk.platformtools.ad.getContext().getSharedPreferences("noop_prefs", 0).edit().putInt("noop_strategy", 2).commit();
            if (j >= 180 && j <= 3600 && System.currentTimeMillis() / 1000 >= j2) {
                try {
                    File file = new File(etE);
                    if (file.exists()) {
                        long[] Vf = Vf();
                        if (Vf[1] > 0 && Vf[1] >= j2) {
                            return;
                        }
                    } else if (!file.createNewFile()) {
                        return;
                    }
                    DataOutputStream dataOutputStream = null;
                    try {
                        file = new File(etE);
                        if (file.exists() || file.createNewFile()) {
                            DataOutputStream dataOutputStream2 = new DataOutputStream(new FileOutputStream(file));
                            try {
                                dataOutputStream2.writeInt((int) j);
                                dataOutputStream2.writeInt((int) j2);
                                dataOutputStream2.flush();
                                dataOutputStream2.close();
                                try {
                                    dataOutputStream2.close();
                                } catch (Exception e2) {
                                }
                            } catch (Exception e3) {
                                e = e3;
                                dataOutputStream = dataOutputStream2;
                                try {
                                    new StringBuilder("writeFile Exception:").append(e.getStackTrace());
                                    if (dataOutputStream != null) {
                                        try {
                                            dataOutputStream.close();
                                        } catch (Exception e4) {
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (dataOutputStream != null) {
                                        try {
                                            dataOutputStream.close();
                                        } catch (Exception e5) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                dataOutputStream = dataOutputStream2;
                                if (dataOutputStream != null) {
                                    try {
                                        dataOutputStream.close();
                                    } catch (Exception e52) {
                                    }
                                }
                                throw th;
                            }
                        }
                    } catch (Exception e6) {
                        e = e6;
                        new StringBuilder("writeFile Exception:").append(e.getStackTrace());
                        if (dataOutputStream != null) {
                            try {
                                dataOutputStream.close();
                            } catch (Exception e42) {
                            }
                        }
                    }
                } catch (Exception e7) {
                    new StringBuilder("setNoopInterval Exception:").append(e7.getStackTrace());
                }
            }
        } else if (j <= 0) {
            com.tencent.mm.sdk.platformtools.ad.getContext().getSharedPreferences("noop_prefs", 0).edit().putInt("noop_strategy", 1).commit();
        } else if (j < 180 || j > 3600) {
            new StringBuilder("setNoopInterval value invalid interval:").append(j).append(", _svrTime:").append(j2);
        } else {
            com.tencent.mm.sdk.platformtools.ad.getContext().getSharedPreferences("noop_prefs", 0).edit().putInt("noop_strategy", 3).putLong("noop_min_interval", j).commit();
        }
    }

    private static long[] Vf() {
        Exception e;
        Throwable th;
        long[] jArr = new long[]{0, 0};
        File file = new File(etE);
        if (file.exists()) {
            DataInputStream dataInputStream;
            try {
                dataInputStream = new DataInputStream(new FileInputStream(file));
                try {
                    int readInt = dataInputStream.readInt();
                    if (((long) readInt) < 180 || ((long) readInt) > 3600) {
                        dataInputStream.close();
                        try {
                            dataInputStream.close();
                        } catch (Exception e2) {
                        }
                    } else {
                        jArr[0] = (long) readInt;
                        readInt = dataInputStream.readInt();
                        if (((long) readInt) > System.currentTimeMillis() / 1000) {
                            dataInputStream.close();
                            try {
                                dataInputStream.close();
                            } catch (Exception e3) {
                            }
                        } else {
                            jArr[1] = (long) readInt;
                            dataInputStream.close();
                            try {
                                dataInputStream.close();
                            } catch (Exception e4) {
                            }
                        }
                    }
                } catch (Exception e5) {
                    e = e5;
                    try {
                        new StringBuilder("getFromFile Exception:").append(e.getStackTrace());
                        if (dataInputStream != null) {
                            try {
                                dataInputStream.close();
                            } catch (Exception e6) {
                            }
                        }
                        return jArr;
                    } catch (Throwable th2) {
                        th = th2;
                        if (dataInputStream != null) {
                            try {
                                dataInputStream.close();
                            } catch (Exception e7) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (Exception e8) {
                e = e8;
                dataInputStream = null;
                new StringBuilder("getFromFile Exception:").append(e.getStackTrace());
                if (dataInputStream != null) {
                    try {
                        dataInputStream.close();
                    } catch (Exception e62) {
                    }
                }
                return jArr;
            } catch (Throwable th3) {
                th = th3;
                dataInputStream = null;
                if (dataInputStream != null) {
                    try {
                        dataInputStream.close();
                    } catch (Exception e72) {
                    }
                }
                throw th;
            }
        }
        return jArr;
    }
}
