package com.google.android.search.verification.client;

import android.app.IntentService;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Base64;
import com.google.android.search.verification.a.a;

public abstract class SearchActionVerificationClientService extends IntentService {
    private final boolean bfA = rV();
    private final long bfB = 1000;
    private final Intent bfC = new Intent("com.google.android.googlequicksearchbox.SEARCH_ACTION_VERIFICATION_SERVICE").setPackage("com.google.android.googlequicksearchbox");
    private a bfD;
    private a bfE = null;

    public abstract boolean a(Intent intent, boolean z);

    private static boolean rV() {
        return !"user".equals(Build.TYPE);
    }

    public SearchActionVerificationClientService() {
        super("SearchActionVerificationClientService");
    }

    private boolean isConnected() {
        return this.bfE != null;
    }

    protected final void onHandleIntent(Intent intent) {
        String valueOf;
        boolean z = true;
        if (intent != null) {
            boolean z2 = rV() || rW();
            long nanoTime = System.nanoTime();
            while (!isConnected() && System.nanoTime() - nanoTime < this.bfB * 1000000) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    if (this.bfA) {
                        valueOf = String.valueOf(e);
                        new StringBuilder(String.valueOf(valueOf).length() + 33).append("Unexpected InterruptedException: ").append(valueOf);
                    }
                }
            }
            if (!isConnected()) {
                valueOf = String.valueOf(intent);
                new StringBuilder(String.valueOf(valueOf).length() + 62).append("VerificationService is not connected, unable to check intent: ").append(valueOf);
            } else if (intent.hasExtra("SearchActionVerificationClientExtraIntent")) {
                Intent intent2 = (Intent) intent.getParcelableExtra("SearchActionVerificationClientExtraIntent");
                if (this.bfA) {
                    i(intent2);
                }
                try {
                    new StringBuilder(24).append("API version: ").append(this.bfE.getVersion());
                    Bundle bundle = new Bundle();
                    if (!(z2 && this.bfE.a(intent2, bundle))) {
                        z = false;
                    }
                    a(intent2, z);
                } catch (RemoteException e2) {
                    String str = "Remote exception: ";
                    valueOf = String.valueOf(e2.getMessage());
                    if (valueOf.length() != 0) {
                        str.concat(valueOf);
                    } else {
                        valueOf = new String(str);
                    }
                }
            } else if (this.bfA) {
                valueOf = String.valueOf(intent);
                new StringBuilder(String.valueOf(valueOf).length() + 28).append("No extra, nothing to check: ").append(valueOf);
            }
        }
    }

    public final void onCreate() {
        super.onCreate();
        this.bfD = new a(this);
        bindService(this.bfC, this.bfD, 1);
    }

    public final void onDestroy() {
        super.onDestroy();
        unbindService(this.bfD);
    }

    private boolean rW() {
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo("com.google.android.googlequicksearchbox", 64);
            if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                return false;
            }
            return Base64.encodeToString(packageInfo.signatures[0].toByteArray(), 2).equals("MIIEQzCCAyugAwIBAgIJAMLgh0ZkSjCNMA0GCSqGSIb3DQEBBAUAMHQxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKEwtHb29nbGUgSW5jLjEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDAeFw0wODA4MjEyMzEzMzRaFw0zNjAxMDcyMzEzMzRaMHQxCzAJBgNVBAYTAlVTMRMwEQYDVQQIEwpDYWxpZm9ybmlhMRYwFAYDVQQHEw1Nb3VudGFpbiBWaWV3MRQwEgYDVQQKEwtHb29nbGUgSW5jLjEQMA4GA1UECxMHQW5kcm9pZDEQMA4GA1UEAxMHQW5kcm9pZDCCASAwDQYJKoZIhvcNAQEBBQADggENADCCAQgCggEBAKtWLgDYO6IIrgqWbxJOKdoR8qtW0I9Y4sypEwPpt1TTcvZApxsdyxMJZ2JORland2qSGT2y5b+3JKkedxiLDmpHpDsz2WCbdxgxRczfey5YZnTJ4VZbH0xqWVW/8lGmPav5xVwnIiJS6HXk+BVKZF+JcWjAsb/GEuq/eFdpuzSqeYTcfi6idkyugwfYwXFU1+5fZKUaRKYCwkkFQVfcAs1fXA5V+++FGfvjJ/CxURaSxaBvGdGDhfXE28LWuT9ozCl5xw4Yq5OGazvV24mZVSoOO0yZ31j7kYvtwYK6NeADwbSxDdJEqO4k//0zOHKrUiGYXtqw/A0LFFtqoZKFjnkCAQOjgdkwgdYwHQYDVR0OBBYEFMd9jMIhF1Ylmn/Tgt9r45jk14alMIGmBgNVHSMEgZ4wgZuAFMd9jMIhF1Ylmn/Tgt9r45jk14aloXikdjB0MQswCQYDVQQGEwJVUzETMBEGA1UECBMKQ2FsaWZvcm5pYTEWMBQGA1UEBxMNTW91bnRhaW4gVmlldzEUMBIGA1UEChMLR29vZ2xlIEluYy4xEDAOBgNVBAsTB0FuZHJvaWQxEDAOBgNVBAMTB0FuZHJvaWSCCQDC4IdGZEowjTAMBgNVHRMEBTADAQH/MA0GCSqGSIb3DQEBBAUAA4IBAQBt0lLO74UwLDYKqs6Tm8/yzKkEu116FmH4rkaymUIE0P9KaMftGlMexFlaYjzmB2OxZyl6euNXEsQH8gjwyxCUKRJNexBiGcCEyj6z+a1fuHHvkiaai+KL8W1EyNmgjmyy8AW7P+LLlkR+ho5zEHatRbM/YAnqGcFh5iZBqpknHf1SKMXFh4dd239FJ1jWYfbMDMy3NS5CTMQ2XFI1MvcyUTdZPErjQfTbQe3aDQsQcafEQPD+nqActifKZ0Np0IS9L9kR/wbNvyz6ENwPiTrjV2KRkEjH78ZMcUQXg0L3BYHJ3lc69Vs5Ddf9uUGGMYldX3WfMBEmh/9iFBDAaTCK");
        } catch (NameNotFoundException e) {
            if (!this.bfA) {
                return false;
            }
            String valueOf = String.valueOf(e);
            new StringBuilder(String.valueOf(valueOf).length() + 34).append("Unexpected NameNotFoundException: ").append(valueOf);
            return false;
        }
    }

    private static void i(Intent intent) {
        String valueOf = String.valueOf(intent);
        new StringBuilder(String.valueOf(valueOf).length() + 1).append("\t").append(valueOf);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String valueOf2 : extras.keySet()) {
                String.format("\t%s: %s", new Object[]{valueOf2, extras.get(valueOf2)});
            }
        }
    }
}
