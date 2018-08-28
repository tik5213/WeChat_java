package com.tencent.smtt.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.sdk.TbsDownloader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.Enumeration;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

@SuppressLint({"NewApi"})
public class j {
    public static String a = null;
    public static final a b = new l();
    private static final int c = 4;
    private static RandomAccessFile d = null;

    public static File a(Context context, boolean z, String str) {
        String d = z ? d(context) : c(context);
        if (d == null) {
            return null;
        }
        File file = new File(d);
        if (!file.exists()) {
            file.mkdirs();
        }
        if (!file.canWrite()) {
            return null;
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException e) {
                return null;
            }
        }
        return file2;
    }

    public static String a(Context context, int i) {
        return a(context, context.getApplicationInfo().packageName, i, true);
    }

    private static String a(Context context, String str) {
        String str2 = "";
        if (context == null) {
            return str2;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        try {
            return context.getExternalFilesDir(str).getAbsolutePath();
        } catch (Throwable th) {
            try {
                return Environment.getExternalStorageDirectory() + File.separator + "Android" + File.separator + "data" + File.separator + context.getApplicationInfo().packageName + File.separator + "files" + File.separator + str;
            } catch (Exception e) {
                return "";
            }
        }
    }

    public static String a(Context context, String str, int i, boolean z) {
        if (context == null) {
            return "";
        }
        String str2 = "";
        try {
            str2 = Environment.getExternalStorageDirectory() + File.separator;
        } catch (Exception e) {
        }
        switch (i) {
            case 1:
                return !str2.equals("") ? str2 + "tencent" + File.separator + "tbs" + File.separator + str : str2;
            case 2:
                return !str2.equals("") ? str2 + "tbs" + File.separator + "backup" + File.separator + str : str2;
            case 3:
                return !str2.equals("") ? str2 + "tencent" + File.separator + "tbs" + File.separator + "backup" + File.separator + str : str2;
            case 4:
                if (str2.equals("")) {
                    return a(context, "backup");
                }
                str2 = str2 + "tencent" + File.separator + "tbs" + File.separator + "backup" + File.separator + str;
                if (!z) {
                    return str2;
                }
                File file = new File(str2);
                if (file.exists() && file.canWrite()) {
                    return str2;
                }
                if (file.exists()) {
                    return a(context, "backup");
                }
                file.mkdirs();
                return !file.canWrite() ? a(context, "backup") : str2;
            case 5:
                return !str2.equals("") ? str2 + "tencent" + File.separator + "tbs" + File.separator + str : str2;
            case 6:
                if (a != null) {
                    return a;
                }
                str2 = a(context, "tbslog");
                a = str2;
                return str2;
            default:
                return "";
        }
    }

    public static FileLock a(Context context, FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return null;
        }
        try {
            FileLock tryLock = fileOutputStream.getChannel().tryLock();
            return tryLock.isValid() ? tryLock : null;
        } catch (OverlappingFileLockException e) {
            return null;
        } catch (Exception e2) {
            return null;
        }
    }

    public static synchronized void a(Context context, FileLock fileLock) {
        synchronized (j.class) {
            FileChannel channel = fileLock.channel();
            if (channel != null && channel.isOpen()) {
                try {
                    fileLock.release();
                } catch (IOException e) {
                }
            }
        }
    }

    public static void a(File file, boolean z) {
        if (file != null && file.exists()) {
            if (file.isFile()) {
                file.delete();
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File a : listFiles) {
                    a(a, z);
                }
                if (!z) {
                    file.delete();
                }
            }
        }
    }

    public static void a(File file, boolean z, String str) {
        if (file != null && file.exists()) {
            if (file.isFile()) {
                file.delete();
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (!file2.getName().equals(str)) {
                        a(file2, z);
                    }
                }
                if (!z) {
                    file.delete();
                }
            }
        }
    }

    public static void a(FileLock fileLock, FileOutputStream fileOutputStream) {
        if (fileLock != null) {
            try {
                FileChannel channel = fileLock.channel();
                if (channel != null && channel.isOpen()) {
                    fileLock.release();
                }
            } catch (Exception e) {
            }
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (Exception e2) {
            }
        }
    }

    public static boolean a(Context context) {
        return VERSION.SDK_INT < 23 ? true : context != null ? context.getApplicationContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0 : false;
    }

    public static boolean a(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists() && file.isDirectory()) {
            return true;
        }
        b(file);
        return file.mkdirs();
    }

    public static boolean a(File file, File file2) {
        return a(file.getPath(), file2.getPath());
    }

    public static boolean a(File file, File file2, FileFilter fileFilter) {
        return a(file, file2, fileFilter, b);
    }

    public static boolean a(File file, File file2, FileFilter fileFilter, a aVar) {
        if (file == null || file2 == null || !file.exists()) {
            return false;
        }
        if (file.isFile()) {
            return b(file, file2, fileFilter, aVar);
        }
        File[] listFiles = file.listFiles(fileFilter);
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file3 : listFiles) {
            if (!a(file3, new File(file2, file3.getName()), fileFilter)) {
                z = false;
            }
        }
        return z;
    }

    private static boolean a(String str, long j, long j2, long j3) {
        Throwable th;
        FileInputStream fileInputStream;
        File file = new File(str);
        if (file.length() != j) {
            TbsLog.e("FileHelper", "file size doesn't match: " + file.length() + " vs " + j);
            return true;
        }
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                CRC32 crc32 = new CRC32();
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = fileInputStream2.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    crc32.update(bArr, 0, read);
                }
                long value = crc32.getValue();
                TbsLog.i("FileHelper", file.getName() + ": crc = " + value + ", zipCrc = " + j3);
                if (value == j3) {
                    if (fileInputStream2 != null) {
                        fileInputStream2.close();
                    }
                    return false;
                } else if (fileInputStream2 == null) {
                    return true;
                } else {
                    fileInputStream2.close();
                    return true;
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
    }

    @SuppressLint({"InlinedApi"})
    public static boolean a(String str, String str2) {
        return a(str, str2, Build.CPU_ABI, VERSION.SDK_INT >= 8 ? Build.CPU_ABI2 : null, p.a("ro.product.cpu.upgradeabi", "armeabi"));
    }

    private static boolean a(String str, String str2, String str3, String str4, b bVar) {
        Throwable th;
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(str);
            Object obj = null;
            Object obj2 = null;
            InputStream inputStream;
            try {
                Enumeration entries = zipFile.entries();
                while (entries.hasMoreElements()) {
                    ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                    String name = zipEntry.getName();
                    if (!(name == null || name.contains("../"))) {
                        if (name.startsWith("lib/") || name.startsWith("assets/")) {
                            String substring = name.substring(name.lastIndexOf(47));
                            if (substring.endsWith(".so")) {
                                if (name.regionMatches(c, str2, 0, str2.length()) && name.charAt(c + str2.length()) == '/') {
                                    obj = 1;
                                } else {
                                    if (str3 != null) {
                                        if (name.regionMatches(c, str3, 0, str3.length()) && name.charAt(c + str3.length()) == '/') {
                                            obj2 = 1;
                                            if (obj != null) {
                                            }
                                        }
                                    }
                                    if (str4 == null) {
                                        continue;
                                    } else if (!name.regionMatches(c, str4, 0, str4.length())) {
                                        continue;
                                    } else if (name.charAt(c + str4.length()) != '/') {
                                        continue;
                                    } else if (obj != null) {
                                        continue;
                                    } else if (obj2 != null) {
                                        continue;
                                    }
                                }
                            }
                            inputStream = zipFile.getInputStream(zipEntry);
                            if (!bVar.a(inputStream, zipEntry, substring.substring(1))) {
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (zipFile != null) {
                                    zipFile.close();
                                }
                                return false;
                            } else if (inputStream != null) {
                                inputStream.close();
                            } else {
                                continue;
                            }
                        }
                    }
                }
                if (zipFile != null) {
                    zipFile.close();
                }
                return true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            zipFile = null;
            if (zipFile != null) {
                zipFile.close();
            }
            throw th;
        }
    }

    private static boolean a(String str, String str2, String str3, String str4, String str5) {
        return a(str, str3, str4, str5, new k(str2));
    }

    public static FileOutputStream b(Context context, boolean z, String str) {
        File a = a(context, z, str);
        if (a != null) {
            try {
                return new FileOutputStream(a);
            } catch (FileNotFoundException e) {
            }
        }
        return null;
    }

    public static void b(File file) {
        a(file, false);
    }

    public static boolean b(Context context) {
        long a = v.a();
        boolean z = a >= TbsDownloadConfig.getInstance(context).getDownloadMinFreeSpace();
        if (!z) {
            TbsLog.e(TbsDownloader.LOGTAG, "[TbsApkDwonloader.hasEnoughFreeSpace] freeSpace too small,  freeSpace = " + a);
        }
        return z;
    }

    public static boolean b(File file, File file2) {
        return a(file, file2, null);
    }

    private static boolean b(File file, File file2, FileFilter fileFilter, a aVar) {
        Throwable th;
        FileChannel fileChannel;
        FileChannel fileChannel2 = null;
        if (file == null || file2 == null) {
            return false;
        }
        if (fileFilter != null && !fileFilter.accept(file)) {
            return false;
        }
        FileChannel channel;
        try {
            if (file.exists() && file.isFile()) {
                if (file2.exists()) {
                    if (aVar == null || !aVar.a(file, file2)) {
                        b(file2);
                    } else {
                        if (fileChannel2 != null) {
                            fileChannel2.close();
                        }
                        if (fileChannel2 != null) {
                            fileChannel2.close();
                        }
                        return true;
                    }
                }
                File parentFile = file2.getParentFile();
                if (parentFile.isFile()) {
                    b(parentFile);
                }
                if (parentFile.exists() || parentFile.mkdirs()) {
                    channel = new FileInputStream(file).getChannel();
                    try {
                        FileChannel channel2 = new FileOutputStream(file2).getChannel();
                        try {
                            long size = channel.size();
                            if (channel2.transferFrom(channel, 0, size) != size) {
                                b(file2);
                                if (channel != null) {
                                    channel.close();
                                }
                                if (channel2 != null) {
                                    channel2.close();
                                }
                                return false;
                            }
                            if (channel != null) {
                                channel.close();
                            }
                            if (channel2 != null) {
                                channel2.close();
                            }
                            return true;
                        } catch (Throwable th2) {
                            th = th2;
                            fileChannel = channel2;
                            if (channel != null) {
                                channel.close();
                            }
                            if (fileChannel != null) {
                                fileChannel.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        fileChannel = fileChannel2;
                    }
                } else {
                    if (fileChannel2 != null) {
                        fileChannel2.close();
                    }
                    if (fileChannel2 != null) {
                        fileChannel2.close();
                    }
                    return false;
                }
            }
            if (fileChannel2 != null) {
                fileChannel2.close();
            }
            if (fileChannel2 != null) {
                fileChannel2.close();
            }
            return false;
        } catch (Throwable th32) {
            th = th32;
            fileChannel = fileChannel2;
            channel = fileChannel2;
        }
    }

    @SuppressLint({"NewApi"})
    private static boolean b(InputStream inputStream, ZipEntry zipEntry, String str, String str2) {
        Throwable e;
        FileOutputStream fileOutputStream;
        a(new File(str));
        String str3 = str + File.separator + str2;
        File file = new File(str3);
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    fileOutputStream2.write(bArr, 0, read);
                }
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
                if (a(str3, zipEntry.getSize(), zipEntry.getTime(), zipEntry.getCrc())) {
                    TbsLog.e("FileHelper", "file is different: " + str3);
                    return false;
                }
                if (!file.setLastModified(zipEntry.getTime())) {
                    TbsLog.e("FileHelper", "Couldn't set time for dst file " + file);
                }
                return true;
            } catch (IOException e2) {
                e = e2;
                fileOutputStream = fileOutputStream2;
                try {
                    b(file);
                    throw new IOException("Couldn't write dst file " + file, e);
                } catch (Throwable th) {
                    e = th;
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw e;
                }
            } catch (Throwable th2) {
                e = th2;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                throw e;
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream = null;
            b(file);
            throw new IOException("Couldn't write dst file " + file, e);
        } catch (Throwable th3) {
            e = th3;
            fileOutputStream = null;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw e;
        }
    }

    public static String c(Context context) {
        return Environment.getExternalStorageDirectory() + File.separator + "tbs" + File.separator + "file_locks";
    }

    public static boolean c(File file) {
        return file != null && file.exists() && file.isFile() && file.length() > 0;
    }

    public static FileOutputStream d(File file) {
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (!(parentFile == null || parentFile.exists() || parentFile.mkdirs())) {
                throw new IOException("File '" + file + "' could not be created");
            }
        } else if (file.isDirectory()) {
            throw new IOException("File '" + file + "' exists but is a directory");
        } else if (!file.canWrite()) {
            throw new IOException("File '" + file + "' cannot be written to");
        }
        return new FileOutputStream(file);
    }

    static String d(Context context) {
        File file = new File(context.getDir("tbs", 0), "core_private");
        return (file.isDirectory() || file.mkdir()) ? file.getAbsolutePath() : null;
    }

    public static FileLock e(Context context) {
        boolean tbsCoreLoadRenameFileLockEnable;
        FileLock fileLock = null;
        try {
            tbsCoreLoadRenameFileLockEnable = TbsDownloadConfig.getInstance().getTbsCoreLoadRenameFileLockEnable();
        } catch (Throwable th) {
            tbsCoreLoadRenameFileLockEnable = true;
        }
        if (tbsCoreLoadRenameFileLockEnable) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(a(context, true, "tbs_rename_lock").getAbsolutePath(), "r");
                d = randomAccessFile;
                return randomAccessFile.getChannel().tryLock(0, Long.MAX_VALUE, true);
            } catch (Throwable th2) {
                return fileLock;
            }
        }
        FileOutputStream b = b(context, true, "tbs_rename_lock");
        return b != null ? a(context, b) : fileLock;
    }

    public static FileLock f(Context context) {
        FileLock fileLock = null;
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(a(context, true, "tbs_rename_lock").getAbsolutePath(), "rw");
            d = randomAccessFile;
            return randomAccessFile.getChannel().tryLock(0, Long.MAX_VALUE, false);
        } catch (Throwable th) {
            return fileLock;
        }
    }
}
