package com.tencent.mm.plugin.exdevice.ui;

import com.tencent.mm.plugin.exdevice.jni.Java2CExDevice;

class ExdeviceBindDeviceUI$6 implements Runnable {
    final /* synthetic */ ExdeviceBindDeviceUI iBf;

    ExdeviceBindDeviceUI$6(ExdeviceBindDeviceUI exdeviceBindDeviceUI) {
        this.iBf = exdeviceBindDeviceUI;
    }

    public final void run() {
        Java2CExDevice.stopScanWCLanDevice();
        Java2CExDevice.releaseWCLanDeviceLib();
    }
}
