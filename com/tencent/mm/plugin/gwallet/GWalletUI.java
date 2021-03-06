package com.tencent.mm.plugin.gwallet;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.jg.EType;
import com.jg.JgClassChecked;
import com.tencent.mm.plugin.gwallet.a.b;
import com.tencent.mm.plugin.gwallet.a.b.3;
import com.tencent.mm.plugin.gwallet.a.c;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;

@JgClassChecked(author = 31, fComment = "checked", lastDate = "20140422", reviewer = 20, vComment = {EType.ACTIVITYCHECK, EType.RECEIVERCHECK})
public class GWalletUI extends Activity {
    BroadcastReceiver hiJ = new 3(this);
    private b kiB = null;

    static /* synthetic */ void a(GWalletUI gWalletUI) {
        Intent intent = gWalletUI.getIntent();
        String stringExtra = intent.getStringExtra("product_id");
        String stringExtra2 = intent.getStringExtra("developer_pay_load");
        b bVar = gWalletUI.kiB;
        String str = "inapp";
        2 2 = new 2(gWalletUI);
        bVar.EC("launchPurchaseFlow");
        if (!str.equals("subs") || bVar.kiR) {
            try {
                x.d("MicroMsg.IabHelper", "Constructing buy intent for " + stringExtra + ", item type: " + str + ", extraData: " + stringExtra2);
                Bundle a = bVar.kiO.a(3, bVar.mContext.getPackageName(), stringExtra, str, stringExtra2);
                int D = b.D(a);
                if (D != 0) {
                    2.b(new c(D, "Unable to buy item"), null);
                    return;
                }
                PendingIntent pendingIntent = (PendingIntent) a.getParcelable("BUY_INTENT");
                x.d("MicroMsg.IabHelper", "Launching buy intent for " + stringExtra + ". Request code: 10001");
                bVar.bNZ = 10001;
                bVar.kiS = 2;
                bVar.kiT = str;
                gWalletUI.startIntentSenderForResult(pendingIntent.getIntentSender(), 10001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
                return;
            } catch (Throwable e) {
                b.ED("SendIntentException while launching purchase flow for sku " + stringExtra);
                x.printErrStackTrace("MicroMsg.IabHelper", e, "", new Object[0]);
                2.b(new c(-1004, "Failed to send intent."), null);
                return;
            } catch (Throwable e2) {
                b.ED("RemoteException while launching purchase flow for sku " + stringExtra);
                x.printErrStackTrace("MicroMsg.IabHelper", e2, "", new Object[0]);
                2.b(new c(-1001, "Remote exception while starting purchase flow"), null);
                return;
            }
        }
        2.b(new c(-1009, "Subscriptions are not available."), null);
    }

    static /* synthetic */ void a(GWalletUI gWalletUI, int i, Intent intent) {
        x.d("MicroMsg.GWalletUI", "Finish GWallet. setResult:" + i);
        gWalletUI.setResult(i, intent);
        gWalletUI.finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        x.d("MicroMsg.GWalletUI", "Creating IAB helper.");
        this.kiB = new b(this);
        x.d("MicroMsg.GWalletUI", "Starting setup.");
        this.kiB.a(new 1(this));
    }

    public final void fC(boolean z) {
        b bVar = this.kiB;
        4 4 = new 4(this, z);
        ag agVar = new ag();
        bVar.EC("queryInventory");
        e.post(new 3(bVar, "inapp", agVar, 4), "IabHelper_queryInventoryAsync");
    }

    protected void onNewIntent(Intent intent) {
        if ("com.tencent.mm.gwallet.ACTION_QUERY_REQUEST".equals(intent.getAction())) {
            fC(intent.getBooleanExtra("is_direct", true));
        }
        super.onNewIntent(intent);
    }

    public void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.tencent.mm.gwallet.ACTION_CONSUME_REQUEST");
        registerReceiver(this.hiJ, intentFilter);
    }

    protected void onStop() {
        super.onStop();
        unregisterReceiver(this.hiJ);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        b bVar = this.kiB;
        if (i == bVar.bNZ) {
            bVar.EC("handleActivityResult");
            if (intent == null) {
                b.ED("Null data in IAB activity result.");
                c cVar = new c(-1002, "Null data in IAB result");
                if (bVar.kiS != null) {
                    bVar.kiS.b(cVar, null);
                    return;
                }
                return;
            }
            int i3;
            Object obj = intent.getExtras().get("RESPONSE_CODE");
            if (obj == null) {
                b.ED("Intent with no response code, assuming OK (known issue)");
                i3 = 0;
            } else if (obj instanceof Integer) {
                i3 = ((Integer) obj).intValue();
            } else if (obj instanceof Long) {
                i3 = (int) ((Long) obj).longValue();
            } else {
                b.ED("Unexpected type for intent response code.");
                b.ED(obj.getClass().getName());
                throw new RuntimeException("Unexpected type for intent response code: " + obj.getClass().getName());
            }
            String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
            String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
            x.d("MicroMsg.IabHelper", "Purchase data: " + stringExtra);
            x.d("MicroMsg.IabHelper", "Data signature: " + stringExtra2);
            x.d("MicroMsg.IabHelper", "Extras: " + intent.getExtras());
            x.d("MicroMsg.IabHelper", "Expected item type: " + bVar.kiT);
            c cVar2 = new c(i3, "Null data in IAB result");
            if (bVar.kiS != null) {
                bVar.kiS.b(cVar2, intent);
            }
        }
    }

    protected void onDestroy() {
        x.d("MicroMsg.GWalletUI", "Destroying helper.");
        if (this.kiB != null) {
            this.kiB.dispose();
        }
        this.kiB = null;
        super.onDestroy();
    }
}
