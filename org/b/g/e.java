package org.b.g;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public final class e {
    public static String D(InputStream inputStream) {
        d.j(inputStream, "Cannot get String from a null object");
        try {
            char[] cArr = new char[65536];
            StringBuilder stringBuilder = new StringBuilder();
            Reader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            int read;
            do {
                read = inputStreamReader.read(cArr, 0, 65536);
                if (read > 0) {
                    stringBuilder.append(cArr, 0, read);
                    continue;
                }
            } while (read >= 0);
            inputStreamReader.close();
            return stringBuilder.toString();
        } catch (Throwable e) {
            throw new IllegalStateException("Error while reading response body", e);
        }
    }
}
