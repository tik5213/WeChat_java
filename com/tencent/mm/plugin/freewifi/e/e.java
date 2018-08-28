package com.tencent.mm.plugin.freewifi.e;

import android.content.Intent;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI;
import com.tencent.mm.sdk.platformtools.x;

public class e {
    protected String appId = this.intent.getStringExtra("free_wifi_appid");
    protected String bIQ = this.intent.getStringExtra("free_wifi_ap_key");
    protected int bxk = this.intent.getIntExtra("free_wifi_channel_id", 0);
    protected final Intent intent;
    protected FreeWifiFrontPageUI jkG;
    protected String jkH = this.intent.getStringExtra("free_wifi_url");
    protected int jkI = this.intent.getIntExtra("ConstantsFreeWifi.FREE_WIFI_PROTOCOL_NUMBER", 0);
    protected String jkJ = this.intent.getStringExtra("free_wifi_app_nickname");
    protected int source = this.intent.getIntExtra("free_wifi_source", 1);
    protected String ssid = this.intent.getStringExtra("free_wifi_ssid");

    public e(FreeWifiFrontPageUI freeWifiFrontPageUI) {
        this.jkG = freeWifiFrontPageUI;
        this.intent = freeWifiFrontPageUI.getIntent();
        x.i("MicroMsg.FreeWifi.ProtocolBase", "sessionKey=%s, step=%d, desc=Data retrieved. ssid=%s, fullUrl=%s, apKey=%s, source=%s, channelId=%d, appid=%s, appNickName=%s, protocolNumber=%d", new Object[]{m.E(this.intent), Integer.valueOf(m.F(this.intent)), this.ssid, this.jkH, this.bIQ, Integer.valueOf(this.source), Integer.valueOf(this.bxk), this.appId, this.jkJ, Integer.valueOf(this.jkI)});
    }
}
