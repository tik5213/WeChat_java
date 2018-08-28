package com.tencent.mm.modelvoice;

import android.content.Context;
import android.media.MediaPlayer;
import com.tencent.mm.compatible.b.j;
import com.tencent.mm.compatible.util.b;
import com.tencent.mm.compatible.util.b$a;
import com.tencent.mm.modelvoice.d.a;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class s implements d {
    MediaPlayer epS;
    b epT;
    a epk;
    d.b epl;
    String fileName;
    int status;

    public final int getStatus() {
        return this.status;
    }

    public s() {
        this.fileName = "";
        this.epk = null;
        this.epl = null;
        this.status = 0;
        this.epS = new j();
        TP();
        TQ();
        x.d("MicroMsg.VoicePlayer", "VoicePlayer");
    }

    public s(Context context) {
        this();
        this.epT = new b(context);
        x.d("MicroMsg.VoicePlayer", "VoicePlayer context");
    }

    public final void a(a aVar) {
        this.epk = aVar;
    }

    public final void a(d.b bVar) {
        this.epl = bVar;
    }

    private void TP() {
        this.epS.setOnCompletionListener(new 1(this));
    }

    private void TQ() {
        this.epS.setOnErrorListener(new 2(this));
    }

    public final void aK(boolean z) {
        x.d("MicroMsg.VoicePlayer", "setSpeakerOn=" + z);
        if (this.epS != null) {
            if (ar.vZ()) {
                x.v("MicroMsg.VoicePlayer", "setSpeakOn return when calling");
                return;
            }
            int currentPosition = this.epS.getCurrentPosition();
            wk();
            this.epS = new j();
            TP();
            TQ();
            d(this.fileName, z, currentPosition);
        }
    }

    public final boolean M(String str, boolean z) {
        return d(str, z, 0);
    }

    public final boolean c(String str, boolean z, int i) {
        return d(str, z, i);
    }

    private boolean d(String str, boolean z, int i) {
        if (this.status != 0) {
            x.e("MicroMsg.VoicePlayer", "startPlay error status:" + this.status);
            return false;
        }
        x.i("MicroMsg.VoicePlayer", "startPlay speakerOn:%s,seekTo:%s,", new Object[]{Boolean.valueOf(z), Integer.valueOf(i)});
        this.fileName = str;
        try {
            c(z, i);
        } catch (Throwable e) {
            try {
                c(true, i);
            } catch (Exception e2) {
                x.e("MicroMsg.VoicePlayer", "startPlay File[" + this.fileName + "] failed");
                x.e("MicroMsg.VoicePlayer", "exception:%s", new Object[]{bi.i(e)});
                this.status = -1;
                return false;
            }
        }
        this.status = 1;
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(boolean r10, int r11) {
        /*
        r9 = this;
        r0 = 3;
        r8 = 1;
        r2 = 0;
        r1 = r9.fileName;
        r1 = com.tencent.mm.vfs.d.cn(r1);
        if (r1 != 0) goto L_0x000c;
    L_0x000b:
        return;
    L_0x000c:
        if (r10 == 0) goto L_0x00a8;
    L_0x000e:
        r1 = r0;
    L_0x000f:
        r3 = "MicroMsg.VoicePlayer";
        r4 = "playImp speakerOn:%s,seekTo:%s,type:%s";
        r5 = 3;
        r5 = new java.lang.Object[r5];	 Catch:{ Exception -> 0x0071 }
        r6 = 0;
        r7 = java.lang.Boolean.valueOf(r10);	 Catch:{ Exception -> 0x0071 }
        r5[r6] = r7;	 Catch:{ Exception -> 0x0071 }
        r6 = 1;
        r7 = java.lang.Integer.valueOf(r11);	 Catch:{ Exception -> 0x0071 }
        r5[r6] = r7;	 Catch:{ Exception -> 0x0071 }
        r6 = 2;
        r7 = java.lang.Integer.valueOf(r1);	 Catch:{ Exception -> 0x0071 }
        r5[r6] = r7;	 Catch:{ Exception -> 0x0071 }
        com.tencent.mm.sdk.platformtools.x.d(r3, r4, r5);	 Catch:{ Exception -> 0x0071 }
        r3 = com.tencent.mm.compatible.e.q.deN;	 Catch:{ Exception -> 0x0071 }
        r3 = r3.dby;	 Catch:{ Exception -> 0x0071 }
        if (r3 == 0) goto L_0x00ab;
    L_0x0036:
        r3 = com.tencent.mm.compatible.e.q.deN;	 Catch:{ Exception -> 0x0071 }
        r3.dump();	 Catch:{ Exception -> 0x0071 }
        r3 = com.tencent.mm.compatible.e.q.deN;	 Catch:{ Exception -> 0x0071 }
        r3 = r3.dbF;	 Catch:{ Exception -> 0x0071 }
        if (r3 != r8) goto L_0x00ab;
    L_0x0041:
        r1 = r9.epT;	 Catch:{ Exception -> 0x0071 }
        if (r1 == 0) goto L_0x0053;
    L_0x0045:
        r1 = "MicroMsg.VoicePlayer";
        r3 = "playImp audioFocusHelper.requestFocus";
        com.tencent.mm.sdk.platformtools.x.d(r1, r3);	 Catch:{ Exception -> 0x0071 }
        r1 = r9.epT;	 Catch:{ Exception -> 0x0071 }
        r1.requestFocus();	 Catch:{ Exception -> 0x0071 }
    L_0x0053:
        r1 = r9.epS;	 Catch:{ Exception -> 0x0071 }
        r1.setAudioStreamType(r0);	 Catch:{ Exception -> 0x0071 }
        r0 = r9.epS;	 Catch:{ Exception -> 0x0071 }
        r1 = r9.fileName;	 Catch:{ Exception -> 0x0071 }
        r0.setDataSource(r1);	 Catch:{ Exception -> 0x0071 }
        r0 = r9.epS;	 Catch:{ Exception -> 0x0071 }
        r0.prepare();	 Catch:{ Exception -> 0x0071 }
        if (r11 <= 0) goto L_0x006b;
    L_0x0066:
        r0 = r9.epS;	 Catch:{ Exception -> 0x0071 }
        r0.seekTo(r11);	 Catch:{ Exception -> 0x0071 }
    L_0x006b:
        r0 = r9.epS;	 Catch:{ Exception -> 0x0071 }
        r0.start();	 Catch:{ Exception -> 0x0071 }
        goto L_0x000b;
    L_0x0071:
        r0 = move-exception;
        r1 = "MicroMsg.VoicePlayer";
        r3 = new java.lang.StringBuilder;
        r4 = "playImp : fail, exception = ";
        r3.<init>(r4);
        r4 = r0.getMessage();
        r3 = r3.append(r4);
        r3 = r3.toString();
        com.tencent.mm.sdk.platformtools.x.e(r1, r3);
        r1 = "MicroMsg.VoicePlayer";
        r3 = "exception:%s";
        r4 = new java.lang.Object[r8];
        r0 = com.tencent.mm.sdk.platformtools.bi.i(r0);
        r4[r2] = r0;
        com.tencent.mm.sdk.platformtools.x.e(r1, r3, r4);
        r0 = r9.epT;
        if (r0 == 0) goto L_0x000b;
    L_0x00a1:
        r0 = r9.epT;
        r0.zY();
        goto L_0x000b;
    L_0x00a8:
        r1 = r2;
        goto L_0x000f;
    L_0x00ab:
        r0 = r1;
        goto L_0x0041;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelvoice.s.c(boolean, int):void");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean aI(boolean r6) {
        /*
        r5 = this;
        r1 = 1;
        r0 = 0;
        r2 = r5.status;
        if (r2 == r1) goto L_0x001f;
    L_0x0006:
        r1 = "MicroMsg.VoicePlayer";
        r2 = new java.lang.StringBuilder;
        r3 = "pause not STATUS_PLAYING error status:";
        r2.<init>(r3);
        r3 = r5.status;
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.tencent.mm.sdk.platformtools.x.e(r1, r2);
    L_0x001e:
        return r0;
    L_0x001f:
        r2 = "MicroMsg.VoicePlayer";
        r3 = "pause mediaPlayer.pause()";
        com.tencent.mm.sdk.platformtools.x.d(r2, r3);	 Catch:{ Exception -> 0x0046 }
        r2 = r5.epS;	 Catch:{ Exception -> 0x0046 }
        r2.pause();	 Catch:{ Exception -> 0x0046 }
        r0 = r5.epT;
        if (r0 == 0) goto L_0x0041;
    L_0x0031:
        if (r6 == 0) goto L_0x0041;
    L_0x0033:
        r0 = "MicroMsg.VoicePlayer";
        r2 = "pause audioFocusHelper.abandonFocus()";
        com.tencent.mm.sdk.platformtools.x.d(r0, r2);
        r0 = r5.epT;
        r0.zY();
    L_0x0041:
        r0 = 2;
        r5.status = r0;
        r0 = r1;
        goto L_0x001e;
    L_0x0046:
        r1 = move-exception;
        r2 = "MicroMsg.VoicePlayer";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x008d }
        r4 = "pause File[";
        r3.<init>(r4);	 Catch:{ all -> 0x008d }
        r4 = r5.fileName;	 Catch:{ all -> 0x008d }
        r3 = r3.append(r4);	 Catch:{ all -> 0x008d }
        r4 = "] ErrMsg[";
        r3 = r3.append(r4);	 Catch:{ all -> 0x008d }
        r1 = r1.getStackTrace();	 Catch:{ all -> 0x008d }
        r1 = r3.append(r1);	 Catch:{ all -> 0x008d }
        r3 = "]";
        r1 = r1.append(r3);	 Catch:{ all -> 0x008d }
        r1 = r1.toString();	 Catch:{ all -> 0x008d }
        com.tencent.mm.sdk.platformtools.x.e(r2, r1);	 Catch:{ all -> 0x008d }
        r1 = -1;
        r5.status = r1;	 Catch:{ all -> 0x008d }
        r1 = r5.epT;
        if (r1 == 0) goto L_0x001e;
    L_0x007c:
        if (r6 == 0) goto L_0x001e;
    L_0x007e:
        r1 = "MicroMsg.VoicePlayer";
        r2 = "pause audioFocusHelper.abandonFocus()";
        com.tencent.mm.sdk.platformtools.x.d(r1, r2);
        r1 = r5.epT;
        r1.zY();
        goto L_0x001e;
    L_0x008d:
        r0 = move-exception;
        r1 = r5.epT;
        if (r1 == 0) goto L_0x00a2;
    L_0x0092:
        if (r6 == 0) goto L_0x00a2;
    L_0x0094:
        r1 = "MicroMsg.VoicePlayer";
        r2 = "pause audioFocusHelper.abandonFocus()";
        com.tencent.mm.sdk.platformtools.x.d(r1, r2);
        r1 = r5.epT;
        r1.zY();
    L_0x00a2:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelvoice.s.aI(boolean):boolean");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean vY() {
        /*
        r5 = this;
        r1 = 1;
        r0 = 0;
        r2 = r5.status;
        r3 = 2;
        if (r2 == r3) goto L_0x0020;
    L_0x0007:
        r1 = "MicroMsg.VoicePlayer";
        r2 = new java.lang.StringBuilder;
        r3 = "resume not STATUS_PAUSE error status:";
        r2.<init>(r3);
        r3 = r5.status;
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.tencent.mm.sdk.platformtools.x.e(r1, r2);
    L_0x001f:
        return r0;
    L_0x0020:
        r2 = "MicroMsg.VoicePlayer";
        r3 = "resume mediaPlayer.start()";
        com.tencent.mm.sdk.platformtools.x.d(r2, r3);	 Catch:{ Exception -> 0x0044 }
        r2 = r5.epS;	 Catch:{ Exception -> 0x0044 }
        r2.start();	 Catch:{ Exception -> 0x0044 }
        r0 = r5.epT;
        if (r0 == 0) goto L_0x0040;
    L_0x0032:
        r0 = "MicroMsg.VoicePlayer";
        r2 = "resume audioFocusHelper.requestFocus()";
        com.tencent.mm.sdk.platformtools.x.d(r0, r2);
        r0 = r5.epT;
        r0.requestFocus();
    L_0x0040:
        r5.status = r1;
        r0 = r1;
        goto L_0x001f;
    L_0x0044:
        r1 = move-exception;
        r2 = "MicroMsg.VoicePlayer";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0089 }
        r4 = "resume File[";
        r3.<init>(r4);	 Catch:{ all -> 0x0089 }
        r4 = r5.fileName;	 Catch:{ all -> 0x0089 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0089 }
        r4 = "] ErrMsg[";
        r3 = r3.append(r4);	 Catch:{ all -> 0x0089 }
        r1 = r1.getStackTrace();	 Catch:{ all -> 0x0089 }
        r1 = r3.append(r1);	 Catch:{ all -> 0x0089 }
        r3 = "]";
        r1 = r1.append(r3);	 Catch:{ all -> 0x0089 }
        r1 = r1.toString();	 Catch:{ all -> 0x0089 }
        com.tencent.mm.sdk.platformtools.x.e(r2, r1);	 Catch:{ all -> 0x0089 }
        r1 = -1;
        r5.status = r1;	 Catch:{ all -> 0x0089 }
        r1 = r5.epT;
        if (r1 == 0) goto L_0x001f;
    L_0x007a:
        r1 = "MicroMsg.VoicePlayer";
        r2 = "resume audioFocusHelper.requestFocus()";
        com.tencent.mm.sdk.platformtools.x.d(r1, r2);
        r1 = r5.epT;
        r1.requestFocus();
        goto L_0x001f;
    L_0x0089:
        r0 = move-exception;
        r1 = r5.epT;
        if (r1 == 0) goto L_0x009c;
    L_0x008e:
        r1 = "MicroMsg.VoicePlayer";
        r2 = "resume audioFocusHelper.requestFocus()";
        com.tencent.mm.sdk.platformtools.x.d(r1, r2);
        r1 = r5.epT;
        r1.requestFocus();
    L_0x009c:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelvoice.s.vY():boolean");
    }

    public final boolean isPlaying() {
        return this.status == 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean wk() {
        /*
        r5 = this;
        r1 = 1;
        r0 = 0;
        r2 = r5.status;
        if (r2 == r1) goto L_0x0024;
    L_0x0006:
        r2 = r5.status;
        r3 = 2;
        if (r2 == r3) goto L_0x0024;
    L_0x000b:
        r1 = "MicroMsg.VoicePlayer";
        r2 = new java.lang.StringBuilder;
        r3 = "stop not STATUS_PLAYING or STATUS_PAUSE error status:";
        r2.<init>(r3);
        r3 = r5.status;
        r2 = r2.append(r3);
        r2 = r2.toString();
        com.tencent.mm.sdk.platformtools.x.e(r1, r2);
    L_0x0023:
        return r0;
    L_0x0024:
        r2 = "MicroMsg.VoicePlayer";
        r3 = "stop mediaPlayer.stop()";
        com.tencent.mm.sdk.platformtools.x.d(r2, r3);	 Catch:{ Exception -> 0x004d }
        r2 = r5.epS;	 Catch:{ Exception -> 0x004d }
        r2.stop();	 Catch:{ Exception -> 0x004d }
        r2 = r5.epS;	 Catch:{ Exception -> 0x004d }
        r2.release();	 Catch:{ Exception -> 0x004d }
        r2 = r5.epT;
        if (r2 == 0) goto L_0x0049;
    L_0x003b:
        r2 = "MicroMsg.VoicePlayer";
        r3 = "stop audioFocusHelper.abandonFocus()";
        com.tencent.mm.sdk.platformtools.x.d(r2, r3);
        r2 = r5.epT;
        r2.zY();
    L_0x0049:
        r5.status = r0;
        r0 = r1;
        goto L_0x0023;
    L_0x004d:
        r1 = move-exception;
        r2 = "MicroMsg.VoicePlayer";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0092 }
        r4 = "stop File[";
        r3.<init>(r4);	 Catch:{ all -> 0x0092 }
        r4 = r5.fileName;	 Catch:{ all -> 0x0092 }
        r3 = r3.append(r4);	 Catch:{ all -> 0x0092 }
        r4 = "] ErrMsg[";
        r3 = r3.append(r4);	 Catch:{ all -> 0x0092 }
        r1 = r1.getStackTrace();	 Catch:{ all -> 0x0092 }
        r1 = r3.append(r1);	 Catch:{ all -> 0x0092 }
        r3 = "]";
        r1 = r1.append(r3);	 Catch:{ all -> 0x0092 }
        r1 = r1.toString();	 Catch:{ all -> 0x0092 }
        com.tencent.mm.sdk.platformtools.x.e(r2, r1);	 Catch:{ all -> 0x0092 }
        r1 = -1;
        r5.status = r1;	 Catch:{ all -> 0x0092 }
        r1 = r5.epT;
        if (r1 == 0) goto L_0x0023;
    L_0x0083:
        r1 = "MicroMsg.VoicePlayer";
        r2 = "stop audioFocusHelper.abandonFocus()";
        com.tencent.mm.sdk.platformtools.x.d(r1, r2);
        r1 = r5.epT;
        r1.zY();
        goto L_0x0023;
    L_0x0092:
        r0 = move-exception;
        r1 = r5.epT;
        if (r1 == 0) goto L_0x00a5;
    L_0x0097:
        r1 = "MicroMsg.VoicePlayer";
        r2 = "stop audioFocusHelper.abandonFocus()";
        com.tencent.mm.sdk.platformtools.x.d(r1, r2);
        r1 = r5.epT;
        r1.zY();
    L_0x00a5:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.modelvoice.s.wk():boolean");
    }

    public final double wb() {
        if (this.status != 1 && this.status != 2) {
            return 0.0d;
        }
        try {
            int currentPosition = this.epS.getCurrentPosition();
            int duration = this.epS.getDuration();
            if (duration != 0) {
                return ((double) currentPosition) / ((double) duration);
            }
            x.e("MicroMsg.VoicePlayer", "getDuration File[" + this.fileName + "] Failed");
            return 0.0d;
        } catch (Exception e) {
            x.e("MicroMsg.VoicePlayer", "getNowProgress File[" + this.fileName + "] ErrMsg[" + e.getStackTrace() + "]");
            wk();
            return 0.0d;
        }
    }

    public final void b(b$a b_a) {
        if (this.epT != null && b_a != null) {
            this.epT.a(b_a);
        }
    }
}
