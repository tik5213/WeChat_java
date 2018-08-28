package android.support.v4.e;

import com.tencent.wcdb.FileUtils;
import java.io.Writer;

public final class d extends Writer {
    private StringBuilder mBuilder = new StringBuilder(FileUtils.S_IWUSR);
    private final String mTag;

    public d(String str) {
        this.mTag = str;
    }

    public final void close() {
        bU();
    }

    public final void flush() {
        bU();
    }

    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                bU();
            } else {
                this.mBuilder.append(c);
            }
        }
    }

    private void bU() {
        if (this.mBuilder.length() > 0) {
            this.mBuilder.delete(0, this.mBuilder.length());
        }
    }
}
