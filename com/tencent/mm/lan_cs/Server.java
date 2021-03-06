package com.tencent.mm.lan_cs;

public final class Server {
    public static a duG;

    public static class C2Java {
        public static void onSend(String str, int i, int i2) {
            if (Server.duG != null) {
                Server.duG.gO(i2);
            }
        }

        public static void onRecv(String str, int i, byte[] bArr) {
            if (Server.duG != null) {
                Server.duG.onRecv(str, i, bArr);
            }
        }

        public static void onConnect(String str, int i) {
            if (Server.duG != null) {
                Server.duG.onConnect(str, i);
            }
        }

        public static void onDisconnect(String str, int i) {
            if (Server.duG != null) {
                Server.duG.Fh();
            }
        }
    }

    public static class Java2C {
        public static native int send(String str, int i, byte[] bArr);

        private static native Object[] start();

        public static native void stop();
    }

    public interface a {
        void Fh();

        void gO(int i);

        void onConnect(String str, int i);

        void onRecv(String str, int i, byte[] bArr);
    }
}
