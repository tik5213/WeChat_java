package com.tencent.mm.plugin.downloader.c;

import com.tencent.mm.g.c.bj;
import java.lang.reflect.Field;

public final class a extends bj {
    protected static com.tencent.mm.sdk.e.c.a dhO;

    static {
        com.tencent.mm.sdk.e.c.a aVar = new com.tencent.mm.sdk.e.c.a();
        aVar.sKy = new Field[28];
        aVar.columns = new String[29];
        StringBuilder stringBuilder = new StringBuilder();
        aVar.columns[0] = "downloadId";
        aVar.sKA.put("downloadId", "LONG default '-1'  PRIMARY KEY ");
        stringBuilder.append(" downloadId LONG default '-1'  PRIMARY KEY ");
        stringBuilder.append(", ");
        aVar.sKz = "downloadId";
        aVar.columns[1] = "downloadUrl";
        aVar.sKA.put("downloadUrl", "TEXT default '' ");
        stringBuilder.append(" downloadUrl TEXT default '' ");
        stringBuilder.append(", ");
        aVar.columns[2] = "secondaryUrl";
        aVar.sKA.put("secondaryUrl", "TEXT default '' ");
        stringBuilder.append(" secondaryUrl TEXT default '' ");
        stringBuilder.append(", ");
        aVar.columns[3] = "fileSize";
        aVar.sKA.put("fileSize", "LONG default '0' ");
        stringBuilder.append(" fileSize LONG default '0' ");
        stringBuilder.append(", ");
        aVar.columns[4] = "fileName";
        aVar.sKA.put("fileName", "TEXT default '' ");
        stringBuilder.append(" fileName TEXT default '' ");
        stringBuilder.append(", ");
        aVar.columns[5] = "filePath";
        aVar.sKA.put("filePath", "TEXT default '' ");
        stringBuilder.append(" filePath TEXT default '' ");
        stringBuilder.append(", ");
        aVar.columns[6] = "fileType";
        aVar.sKA.put("fileType", "INTEGER default '0' ");
        stringBuilder.append(" fileType INTEGER default '0' ");
        stringBuilder.append(", ");
        aVar.columns[7] = "status";
        aVar.sKA.put("status", "INTEGER default '0' ");
        stringBuilder.append(" status INTEGER default '0' ");
        stringBuilder.append(", ");
        aVar.columns[8] = "md5";
        aVar.sKA.put("md5", "TEXT default '' ");
        stringBuilder.append(" md5 TEXT default '' ");
        stringBuilder.append(", ");
        aVar.columns[9] = "autoInstall";
        aVar.sKA.put("autoInstall", "INTEGER default 'false' ");
        stringBuilder.append(" autoInstall INTEGER default 'false' ");
        stringBuilder.append(", ");
        aVar.columns[10] = "showNotification";
        aVar.sKA.put("showNotification", "INTEGER default 'false' ");
        stringBuilder.append(" showNotification INTEGER default 'false' ");
        stringBuilder.append(", ");
        aVar.columns[11] = "sysDownloadId";
        aVar.sKA.put("sysDownloadId", "LONG default '-1' ");
        stringBuilder.append(" sysDownloadId LONG default '-1' ");
        stringBuilder.append(", ");
        aVar.columns[12] = "downloaderType";
        aVar.sKA.put("downloaderType", "INTEGER default '0' ");
        stringBuilder.append(" downloaderType INTEGER default '0' ");
        stringBuilder.append(", ");
        aVar.columns[13] = "appId";
        aVar.sKA.put("appId", "TEXT default '' ");
        stringBuilder.append(" appId TEXT default '' ");
        stringBuilder.append(", ");
        aVar.columns[14] = "downloadUrlHashCode";
        aVar.sKA.put("downloadUrlHashCode", "INTEGER default '0' ");
        stringBuilder.append(" downloadUrlHashCode INTEGER default '0' ");
        stringBuilder.append(", ");
        aVar.columns[15] = "packageName";
        aVar.sKA.put("packageName", "TEXT default '' ");
        stringBuilder.append(" packageName TEXT default '' ");
        stringBuilder.append(", ");
        aVar.columns[16] = "downloadedSize";
        aVar.sKA.put("downloadedSize", "LONG default '0' ");
        stringBuilder.append(" downloadedSize LONG default '0' ");
        stringBuilder.append(", ");
        aVar.columns[17] = "totalSize";
        aVar.sKA.put("totalSize", "LONG default '0' ");
        stringBuilder.append(" totalSize LONG default '0' ");
        stringBuilder.append(", ");
        aVar.columns[18] = "autoDownload";
        aVar.sKA.put("autoDownload", "INTEGER default 'false' ");
        stringBuilder.append(" autoDownload INTEGER default 'false' ");
        stringBuilder.append(", ");
        aVar.columns[19] = "channelId";
        aVar.sKA.put("channelId", "TEXT default '' ");
        stringBuilder.append(" channelId TEXT default '' ");
        stringBuilder.append(", ");
        aVar.columns[20] = "scene";
        aVar.sKA.put("scene", "INTEGER default '0' ");
        stringBuilder.append(" scene INTEGER default '0' ");
        stringBuilder.append(", ");
        aVar.columns[21] = "errCode";
        aVar.sKA.put("errCode", "INTEGER default '0' ");
        stringBuilder.append(" errCode INTEGER default '0' ");
        stringBuilder.append(", ");
        aVar.columns[22] = "startTime";
        aVar.sKA.put("startTime", "LONG default '0' ");
        stringBuilder.append(" startTime LONG default '0' ");
        stringBuilder.append(", ");
        aVar.columns[23] = "startSize";
        aVar.sKA.put("startSize", "LONG default '0' ");
        stringBuilder.append(" startSize LONG default '0' ");
        stringBuilder.append(", ");
        aVar.columns[24] = "startState";
        aVar.sKA.put("startState", "INTEGER default '0' ");
        stringBuilder.append(" startState INTEGER default '0' ");
        stringBuilder.append(", ");
        aVar.columns[25] = "fromWeApp";
        aVar.sKA.put("fromWeApp", "INTEGER default 'false' ");
        stringBuilder.append(" fromWeApp INTEGER default 'false' ");
        stringBuilder.append(", ");
        aVar.columns[26] = "downloadInWifi";
        aVar.sKA.put("downloadInWifi", "INTEGER default 'false' ");
        stringBuilder.append(" downloadInWifi INTEGER default 'false' ");
        stringBuilder.append(", ");
        aVar.columns[27] = "extInfo";
        aVar.sKA.put("extInfo", "TEXT default '' ");
        stringBuilder.append(" extInfo TEXT default '' ");
        aVar.columns[28] = "rowid";
        aVar.sql = stringBuilder.toString();
        dhO = aVar;
    }

    protected final com.tencent.mm.sdk.e.c.a AX() {
        return dhO;
    }
}
