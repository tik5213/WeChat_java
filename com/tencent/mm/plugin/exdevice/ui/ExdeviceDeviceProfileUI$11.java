package com.tencent.mm.plugin.exdevice.ui;

class ExdeviceDeviceProfileUI$11 implements Runnable {
    final /* synthetic */ ExdeviceDeviceProfileUI iCP;

    ExdeviceDeviceProfileUI$11(ExdeviceDeviceProfileUI exdeviceDeviceProfileUI) {
        this.iCP = exdeviceDeviceProfileUI;
    }

    public final void run() {
        ExdeviceDeviceProfileUI.a(this.iCP, true);
        ExdeviceDeviceProfileUI.f(this.iCP);
        this.iCP.tCL.notifyDataSetChanged();
    }
}
