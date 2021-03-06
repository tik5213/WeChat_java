package com.tencent.mm.plugin.freewifi.ui;

import android.net.NetworkInfo.State;
import android.os.Bundle;
import com.tencent.mm.R;
import com.tencent.mm.plugin.freewifi.model.d;
import com.tencent.mm.plugin.freewifi.model.j;
import com.tencent.mm.sdk.platformtools.x;

@Deprecated
public class FreeWifiAuthStateUI extends FreeWifiStateUI {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d.a(this.ssid, 4, getIntent());
        x.i("MicroMsg.FreeWifi.FreeWifiAuthStateUI", "now it is from qrcode, try to auth");
    }

    protected final void initView() {
        super.initView();
        setMMTitle(R.l.free_wifi_title);
    }

    protected void onDestroy() {
        super.onDestroy();
    }

    public final void a(State state) {
        x.i("MicroMsg.FreeWifi.FreeWifiAuthStateUI", "now network state : %s", new Object[]{state.toString()});
        if (state == State.CONNECTED && d.BY(this.ssid)) {
            aPu();
            aPw();
        }
    }

    protected final void Yz() {
        j.aOP().a(this.ssid, new 1(this), this.bxk, getIntent());
    }

    protected final void aPp() {
        aPt();
        d.BZ(this.ssid);
    }

    protected final int aPq() {
        j.aOJ();
        return d.BX(this.ssid);
    }
}
