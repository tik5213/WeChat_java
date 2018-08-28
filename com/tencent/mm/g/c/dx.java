package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class dx extends c {
    public static final String[] ciG = new String[0];
    private static final int ciP = "rowid".hashCode();
    private static final int cjY = "snsId".hashCode();
    private static final int cjZ = "userName".hashCode();
    private static final int cka = "localFlag".hashCode();
    private static final int ckb = "createTime".hashCode();
    private static final int ckc = "head".hashCode();
    private static final int ckd = "localPrivate".hashCode();
    private static final int cke = "type".hashCode();
    private static final int ckf = "sourceType".hashCode();
    private static final int ckg = "likeFlag".hashCode();
    private static final int ckh = "pravited".hashCode();
    private static final int cki = "stringSeq".hashCode();
    private static final int ckj = "content".hashCode();
    private static final int ckk = "attrBuf".hashCode();
    private static final int ckl = "postBuf".hashCode();
    private static final int cks = "subType".hashCode();
    private boolean cjC = true;
    private boolean cjD = true;
    private boolean cjE = true;
    private boolean cjF = true;
    private boolean cjG = true;
    private boolean cjH = true;
    private boolean cjI = true;
    private boolean cjJ = true;
    private boolean cjK = true;
    private boolean cjL = true;
    private boolean cjM = true;
    private boolean cjN = true;
    private boolean cjO = true;
    private boolean cjP = true;
    private boolean cjW = true;
    public byte[] field_attrBuf;
    public byte[] field_content;
    public int field_createTime;
    public int field_head;
    public int field_likeFlag;
    public int field_localFlag;
    public int field_localPrivate;
    public byte[] field_postBuf;
    public int field_pravited;
    public long field_snsId;
    public int field_sourceType;
    public String field_stringSeq;
    public int field_subType;
    public int field_type;
    public String field_userName;

    public void d(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (cjY == hashCode) {
                    this.field_snsId = cursor.getLong(i);
                } else if (cjZ == hashCode) {
                    this.field_userName = cursor.getString(i);
                } else if (cka == hashCode) {
                    this.field_localFlag = cursor.getInt(i);
                } else if (ckb == hashCode) {
                    this.field_createTime = cursor.getInt(i);
                } else if (ckc == hashCode) {
                    this.field_head = cursor.getInt(i);
                } else if (ckd == hashCode) {
                    this.field_localPrivate = cursor.getInt(i);
                } else if (cke == hashCode) {
                    this.field_type = cursor.getInt(i);
                } else if (ckf == hashCode) {
                    this.field_sourceType = cursor.getInt(i);
                } else if (ckg == hashCode) {
                    this.field_likeFlag = cursor.getInt(i);
                } else if (ckh == hashCode) {
                    this.field_pravited = cursor.getInt(i);
                } else if (cki == hashCode) {
                    this.field_stringSeq = cursor.getString(i);
                } else if (ckj == hashCode) {
                    this.field_content = cursor.getBlob(i);
                } else if (ckk == hashCode) {
                    this.field_attrBuf = cursor.getBlob(i);
                } else if (ckl == hashCode) {
                    this.field_postBuf = cursor.getBlob(i);
                } else if (cks == hashCode) {
                    this.field_subType = cursor.getInt(i);
                } else if (ciP == hashCode) {
                    this.sKx = cursor.getLong(i);
                }
            }
        }
    }

    public final ContentValues wH() {
        ContentValues contentValues = new ContentValues();
        if (this.cjC) {
            contentValues.put("snsId", Long.valueOf(this.field_snsId));
        }
        if (this.cjD) {
            contentValues.put("userName", this.field_userName);
        }
        if (this.cjE) {
            contentValues.put("localFlag", Integer.valueOf(this.field_localFlag));
        }
        if (this.cjF) {
            contentValues.put("createTime", Integer.valueOf(this.field_createTime));
        }
        if (this.cjG) {
            contentValues.put("head", Integer.valueOf(this.field_head));
        }
        if (this.cjH) {
            contentValues.put("localPrivate", Integer.valueOf(this.field_localPrivate));
        }
        if (this.cjI) {
            contentValues.put("type", Integer.valueOf(this.field_type));
        }
        if (this.cjJ) {
            contentValues.put("sourceType", Integer.valueOf(this.field_sourceType));
        }
        if (this.cjK) {
            contentValues.put("likeFlag", Integer.valueOf(this.field_likeFlag));
        }
        if (this.cjL) {
            contentValues.put("pravited", Integer.valueOf(this.field_pravited));
        }
        if (this.cjM) {
            contentValues.put("stringSeq", this.field_stringSeq);
        }
        if (this.cjN) {
            contentValues.put("content", this.field_content);
        }
        if (this.cjO) {
            contentValues.put("attrBuf", this.field_attrBuf);
        }
        if (this.cjP) {
            contentValues.put("postBuf", this.field_postBuf);
        }
        if (this.cjW) {
            contentValues.put("subType", Integer.valueOf(this.field_subType));
        }
        if (this.sKx > 0) {
            contentValues.put("rowid", Long.valueOf(this.sKx));
        }
        return contentValues;
    }
}
