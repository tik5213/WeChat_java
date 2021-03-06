package com.google.android.exoplayer2.f.e;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan.Standard;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.i.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

final class b {
    public final long asN;
    public final long asO;
    public final boolean ayL;
    public final d ayM;
    public final String ayN;
    private final String[] ayO;
    private final HashMap<String, Integer> ayP;
    private final HashMap<String, Integer> ayQ;
    private List<b> ayR;
    public final String tag;
    public final String text;

    b(String str, String str2, long j, long j2, d dVar, String[] strArr, String str3) {
        this.tag = str;
        this.text = str2;
        this.ayM = dVar;
        this.ayO = strArr;
        this.ayL = str2 != null;
        this.asN = j;
        this.asO = j2;
        this.ayN = (String) a.Z(str3);
        this.ayP = new HashMap();
        this.ayQ = new HashMap();
    }

    public final void a(b bVar) {
        if (this.ayR == null) {
            this.ayR = new ArrayList();
        }
        this.ayR.add(bVar);
    }

    private b cP(int i) {
        if (this.ayR != null) {
            return (b) this.ayR.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    private int getChildCount() {
        return this.ayR == null ? 0 : this.ayR.size();
    }

    public final long[] lD() {
        boolean z = false;
        TreeSet treeSet = new TreeSet();
        a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (true) {
            boolean z2 = z;
            if (!it.hasNext()) {
                return jArr;
            }
            z = z2 + 1;
            jArr[z2] = ((Long) it.next()).longValue();
        }
    }

    private void a(TreeSet<Long> treeSet, boolean z) {
        boolean equals = "p".equals(this.tag);
        if (z || equals) {
            if (this.asN != -9223372036854775807L) {
                treeSet.add(Long.valueOf(this.asN));
            }
            if (this.asO != -9223372036854775807L) {
                treeSet.add(Long.valueOf(this.asO));
            }
        }
        if (this.ayR != null) {
            for (int i = 0; i < this.ayR.size(); i++) {
                boolean z2;
                b bVar = (b) this.ayR.get(i);
                if (z || equals) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                bVar.a((TreeSet) treeSet, z2);
            }
        }
    }

    final void a(long j, boolean z, String str, Map<String, SpannableStringBuilder> map) {
        this.ayP.clear();
        this.ayQ.clear();
        String str2 = this.ayN;
        if ("".equals(str2)) {
            str2 = str;
        }
        if (this.ayL && z) {
            b(str2, map).append(this.text);
        } else if ("br".equals(this.tag) && z) {
            b(str2, map).append(10);
        } else if (!"metadata".equals(this.tag)) {
            Object obj = (!(this.asN == -9223372036854775807L && this.asO == -9223372036854775807L) && ((this.asN > j || this.asO != -9223372036854775807L) && ((this.asN != -9223372036854775807L || j >= this.asO) && (this.asN > j || j >= this.asO)))) ? null : 1;
            if (obj != null) {
                int i;
                boolean equals = "p".equals(this.tag);
                for (Entry entry : map.entrySet()) {
                    this.ayP.put(entry.getKey(), Integer.valueOf(((SpannableStringBuilder) entry.getValue()).length()));
                }
                for (i = 0; i < getChildCount(); i++) {
                    b cP = cP(i);
                    boolean z2 = z || equals;
                    cP.a(j, z2, str2, map);
                }
                if (equals) {
                    SpannableStringBuilder b = b(str2, map);
                    i = b.length() - 1;
                    while (i >= 0 && b.charAt(i) == ' ') {
                        i--;
                    }
                    if (i >= 0 && b.charAt(i) != 10) {
                        b.append(10);
                    }
                }
                for (Entry entry2 : map.entrySet()) {
                    this.ayQ.put(entry2.getKey(), Integer.valueOf(((SpannableStringBuilder) entry2.getValue()).length()));
                }
            }
        }
    }

    private static SpannableStringBuilder b(String str, Map<String, SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return (SpannableStringBuilder) map.get(str);
    }

    final void a(Map<String, d> map, Map<String, SpannableStringBuilder> map2) {
        for (Entry entry : this.ayQ.entrySet()) {
            int intValue;
            String str = (String) entry.getKey();
            if (this.ayP.containsKey(str)) {
                intValue = ((Integer) this.ayP.get(str)).intValue();
            } else {
                intValue = 0;
            }
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) map2.get(str);
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if (intValue != intValue2) {
                d dVar = this.ayM;
                String[] strArr = this.ayO;
                if (dVar == null && strArr == null) {
                    dVar = null;
                } else if (dVar == null && strArr.length == 1) {
                    dVar = (d) map.get(strArr[0]);
                } else if (dVar == null && strArr.length > 1) {
                    dVar = new d();
                    for (Object obj : strArr) {
                        dVar.b((d) map.get(obj));
                    }
                } else if (dVar != null && strArr != null && strArr.length == 1) {
                    dVar = dVar.b((d) map.get(strArr[0]));
                } else if (!(dVar == null || strArr == null || strArr.length <= 1)) {
                    for (Object obj2 : strArr) {
                        dVar.b((d) map.get(obj2));
                    }
                }
                if (dVar != null) {
                    if (dVar.getStyle() != -1) {
                        spannableStringBuilder.setSpan(new StyleSpan(dVar.getStyle()), intValue, intValue2, 33);
                    }
                    if (dVar.ayW == 1) {
                        spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, 33);
                    }
                    if (dVar.ayX == 1) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, 33);
                    }
                    if (dVar.ayU) {
                        if (dVar.ayU) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(dVar.ayT), intValue, intValue2, 33);
                        } else {
                            throw new IllegalStateException("Font color has not been defined.");
                        }
                    }
                    if (dVar.ayV) {
                        if (dVar.ayV) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(dVar.backgroundColor), intValue, intValue2, 33);
                        } else {
                            throw new IllegalStateException("Background color has not been defined.");
                        }
                    }
                    if (dVar.ayS != null) {
                        spannableStringBuilder.setSpan(new TypefaceSpan(dVar.ayS), intValue, intValue2, 33);
                    }
                    if (dVar.azd != null) {
                        spannableStringBuilder.setSpan(new Standard(dVar.azd), intValue, intValue2, 33);
                    }
                    switch (dVar.aza) {
                        case 1:
                            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) dVar.azb, true), intValue, intValue2, 33);
                            break;
                        case 2:
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(dVar.azb), intValue, intValue2, 33);
                            break;
                        case 3:
                            spannableStringBuilder.setSpan(new RelativeSizeSpan(dVar.azb / 100.0f), intValue, intValue2, 33);
                            break;
                    }
                }
            }
            for (int i = 0; i < getChildCount(); i++) {
                cP(i).a((Map) map, (Map) map2);
            }
        }
    }

    static SpannableStringBuilder a(SpannableStringBuilder spannableStringBuilder) {
        int i;
        int length = spannableStringBuilder.length();
        int i2 = 0;
        while (i2 < length) {
            if (spannableStringBuilder.charAt(i2) == ' ') {
                i = i2 + 1;
                while (i < spannableStringBuilder.length() && spannableStringBuilder.charAt(i) == ' ') {
                    i++;
                }
                i -= i2 + 1;
                if (i > 0) {
                    spannableStringBuilder.delete(i2, i2 + i);
                    i = length - i;
                    i2++;
                    length = i;
                }
            }
            i = length;
            i2++;
            length = i;
        }
        if (length > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
            length--;
        }
        i2 = 0;
        while (true) {
            i = length;
            if (i2 >= i - 1) {
                break;
            }
            if (spannableStringBuilder.charAt(i2) == 10 && spannableStringBuilder.charAt(i2 + 1) == ' ') {
                spannableStringBuilder.delete(i2 + 1, i2 + 2);
                i--;
            }
            length = i2 + 1;
        }
        if (i > 0 && spannableStringBuilder.charAt(i - 1) == ' ') {
            spannableStringBuilder.delete(i - 1, i);
            i--;
        }
        length = 0;
        while (length < i - 1) {
            if (spannableStringBuilder.charAt(length) == ' ' && spannableStringBuilder.charAt(length + 1) == 10) {
                spannableStringBuilder.delete(length, length + 1);
                i--;
            }
            length++;
        }
        if (i > 0 && spannableStringBuilder.charAt(i - 1) == 10) {
            spannableStringBuilder.delete(i - 1, i);
        }
        return spannableStringBuilder;
    }
}
