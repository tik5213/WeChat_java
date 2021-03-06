package com.google.android.exoplayer2.f.e;

import com.google.android.exoplayer2.f.b;
import com.google.android.exoplayer2.f.f;
import com.google.android.exoplayer2.i.t;
import com.google.android.exoplayer2.i.u;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public final class a extends b {
    private static final Pattern ayC = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern ayD = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern ayE = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    private static final Pattern ayF = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final a ayG = new a(30.0f, 1, 1);
    private final XmlPullParserFactory ayH;

    public a() {
        super("TtmlDecoder");
        try {
            this.ayH = XmlPullParserFactory.newInstance();
            this.ayH.setNamespaceAware(true);
        } catch (Throwable e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    private e h(byte[] bArr, int i) {
        try {
            XmlPullParser newPullParser = this.ayH.newPullParser();
            Map hashMap = new HashMap();
            Map hashMap2 = new HashMap();
            hashMap2.put("", new c());
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            e eVar = null;
            LinkedList linkedList = new LinkedList();
            int eventType = newPullParser.getEventType();
            a aVar = ayG;
            int i2 = eventType;
            int i3 = 0;
            while (i2 != 1) {
                int parseInt;
                b bVar = (b) linkedList.peekLast();
                if (i3 == 0) {
                    String name = newPullParser.getName();
                    if (i2 == 2) {
                        a aVar2;
                        if ("tt".equals(name)) {
                            int parseInt2;
                            float parseInt3;
                            int parseInt4;
                            String attributeValue = newPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
                            if (attributeValue != null) {
                                parseInt2 = Integer.parseInt(attributeValue);
                            } else {
                                parseInt2 = 30;
                            }
                            attributeValue = newPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
                            if (attributeValue != null) {
                                String[] split = attributeValue.split(" ");
                                if (split.length != 2) {
                                    throw new f("frameRateMultiplier doesn't have 2 parts");
                                }
                                parseInt3 = ((float) Integer.parseInt(split[0])) / ((float) Integer.parseInt(split[1]));
                            } else {
                                parseInt3 = 1.0f;
                            }
                            i2 = ayG.ayJ;
                            attributeValue = newPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
                            if (attributeValue != null) {
                                parseInt = Integer.parseInt(attributeValue);
                            } else {
                                parseInt = i2;
                            }
                            i2 = ayG.ayK;
                            attributeValue = newPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
                            if (attributeValue != null) {
                                parseInt4 = Integer.parseInt(attributeValue);
                            } else {
                                parseInt4 = i2;
                            }
                            aVar2 = new a(parseInt3 * ((float) parseInt2), parseInt, parseInt4);
                        } else {
                            aVar2 = aVar;
                        }
                        Object obj = (name.equals("tt") || name.equals("head") || name.equals("body") || name.equals("div") || name.equals("p") || name.equals("span") || name.equals("br") || name.equals("style") || name.equals("styling") || name.equals("layout") || name.equals("region") || name.equals("metadata") || name.equals("smpte:image") || name.equals("smpte:data") || name.equals("smpte:information")) ? 1 : null;
                        if (obj == null) {
                            new StringBuilder("Ignoring unsupported tag: ").append(newPullParser.getName());
                            aVar = aVar2;
                            parseInt = i3 + 1;
                        } else if ("head".equals(name)) {
                            a(newPullParser, hashMap, hashMap2);
                            aVar = aVar2;
                            parseInt = i3;
                        } else {
                            try {
                                b a = a(newPullParser, bVar, hashMap2, aVar2);
                                linkedList.addLast(a);
                                if (bVar != null) {
                                    bVar.a(a);
                                }
                                aVar = aVar2;
                                parseInt = i3;
                            } catch (f e) {
                                aVar = aVar2;
                                parseInt = i3 + 1;
                            }
                        }
                    } else if (i2 == 4) {
                        bVar.a(new b(null, newPullParser.getText().replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, ""));
                        parseInt = i3;
                    } else {
                        e eVar2;
                        if (i2 == 3) {
                            if (newPullParser.getName().equals("tt")) {
                                eVar2 = new e((b) linkedList.getLast(), hashMap, hashMap2);
                            } else {
                                eVar2 = eVar;
                            }
                            linkedList.removeLast();
                        } else {
                            eVar2 = eVar;
                        }
                        parseInt = i3;
                        eVar = eVar2;
                    }
                } else if (i2 == 2) {
                    parseInt = i3 + 1;
                } else if (i2 == 3) {
                    parseInt = i3 - 1;
                } else {
                    parseInt = i3;
                }
                newPullParser.next();
                i2 = newPullParser.getEventType();
                i3 = parseInt;
            }
            return eVar;
        } catch (Throwable e2) {
            throw new f("Unable to decode source", e2);
        } catch (Throwable e22) {
            throw new IllegalStateException("Unexpected error when reading input.", e22);
        }
    }

    private static Map<String, d> a(XmlPullParser xmlPullParser, Map<String, d> map, Map<String, c> map2) {
        Object obj;
        do {
            xmlPullParser.next();
            if (u.b(xmlPullParser, "style")) {
                String c = u.c(xmlPullParser, "style");
                d a = a(xmlPullParser, new d());
                if (c != null) {
                    for (Object obj2 : c.split("\\s+")) {
                        a.b((d) map.get(obj2));
                    }
                }
                if (a.id != null) {
                    map.put(a.id, a);
                }
            } else if (u.b(xmlPullParser, "region")) {
                c a2 = a(xmlPullParser);
                if (a2 != null) {
                    map2.put(a2.id, a2);
                }
            }
            String str = "head";
            if (xmlPullParser.getEventType() == 3) {
                obj2 = 1;
            } else {
                obj2 = null;
            }
            if (obj2 == null || !xmlPullParser.getName().equals(str)) {
                obj2 = null;
                continue;
            } else {
                obj2 = 1;
                continue;
            }
        } while (obj2 == null);
        return map;
    }

    private static c a(XmlPullParser xmlPullParser) {
        int i = 1;
        c cVar = null;
        String c = u.c(xmlPullParser, "id");
        if (c == null) {
            return cVar;
        }
        CharSequence c2 = u.c(xmlPullParser, "origin");
        if (c2 == null) {
            return cVar;
        }
        Matcher matcher = ayF.matcher(c2);
        if (!matcher.matches()) {
            return cVar;
        }
        try {
            float parseFloat = Float.parseFloat(matcher.group(1)) / 100.0f;
            float parseFloat2 = Float.parseFloat(matcher.group(2)) / 100.0f;
            CharSequence c3 = u.c(xmlPullParser, "extent");
            if (c3 == null) {
                return cVar;
            }
            Matcher matcher2 = ayF.matcher(c3);
            if (!matcher2.matches()) {
                return cVar;
            }
            try {
                float parseFloat3 = Float.parseFloat(matcher2.group(1)) / 100.0f;
                float parseFloat4 = Float.parseFloat(matcher2.group(2)) / 100.0f;
                String c4 = u.c(xmlPullParser, "displayAlign");
                if (c4 != null) {
                    String aC = t.aC(c4);
                    int i2 = -1;
                    switch (aC.hashCode()) {
                        case -1364013995:
                            if (aC.equals("center")) {
                                i2 = 0;
                                break;
                            }
                            break;
                        case 92734940:
                            if (aC.equals("after")) {
                                i2 = 1;
                                break;
                            }
                            break;
                    }
                    switch (i2) {
                        case 0:
                            parseFloat2 += parseFloat4 / 2.0f;
                            break;
                        case 1:
                            parseFloat2 += parseFloat4;
                            i = 2;
                            break;
                    }
                }
                i = 0;
                return new c(c, parseFloat, parseFloat2, 0, i, parseFloat3);
            } catch (NumberFormatException e) {
                return cVar;
            }
        } catch (NumberFormatException e2) {
            return cVar;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.exoplayer2.f.e.d a(org.xmlpull.v1.XmlPullParser r12, com.google.android.exoplayer2.f.e.d r13) {
        /*
        r4 = -1;
        r6 = 3;
        r5 = 2;
        r2 = 0;
        r1 = 1;
        r9 = r12.getAttributeCount();
        r8 = r2;
        r0 = r13;
    L_0x000b:
        if (r8 >= r9) goto L_0x02bd;
    L_0x000d:
        r10 = r12.getAttributeValue(r8);
        r3 = r12.getAttributeName(r8);
        r7 = r3.hashCode();
        switch(r7) {
            case -1550943582: goto L_0x0066;
            case -1224696685: goto L_0x0045;
            case -1065511464: goto L_0x0071;
            case -879295043: goto L_0x007c;
            case -734428249: goto L_0x005b;
            case 3355: goto L_0x0024;
            case 94842723: goto L_0x003a;
            case 365601008: goto L_0x0050;
            case 1287124693: goto L_0x002f;
            default: goto L_0x001c;
        };
    L_0x001c:
        r3 = r4;
    L_0x001d:
        switch(r3) {
            case 0: goto L_0x0088;
            case 1: goto L_0x009c;
            case 2: goto L_0x00ac;
            case 3: goto L_0x00bc;
            case 4: goto L_0x00cf;
            case 5: goto L_0x01a0;
            case 6: goto L_0x01bf;
            case 7: goto L_0x01de;
            case 8: goto L_0x0258;
            default: goto L_0x0020;
        };
    L_0x0020:
        r3 = r8 + 1;
        r8 = r3;
        goto L_0x000b;
    L_0x0024:
        r7 = "id";
        r3 = r3.equals(r7);
        if (r3 == 0) goto L_0x001c;
    L_0x002d:
        r3 = r2;
        goto L_0x001d;
    L_0x002f:
        r7 = "backgroundColor";
        r3 = r3.equals(r7);
        if (r3 == 0) goto L_0x001c;
    L_0x0038:
        r3 = r1;
        goto L_0x001d;
    L_0x003a:
        r7 = "color";
        r3 = r3.equals(r7);
        if (r3 == 0) goto L_0x001c;
    L_0x0043:
        r3 = r5;
        goto L_0x001d;
    L_0x0045:
        r7 = "fontFamily";
        r3 = r3.equals(r7);
        if (r3 == 0) goto L_0x001c;
    L_0x004e:
        r3 = r6;
        goto L_0x001d;
    L_0x0050:
        r7 = "fontSize";
        r3 = r3.equals(r7);
        if (r3 == 0) goto L_0x001c;
    L_0x0059:
        r3 = 4;
        goto L_0x001d;
    L_0x005b:
        r7 = "fontWeight";
        r3 = r3.equals(r7);
        if (r3 == 0) goto L_0x001c;
    L_0x0064:
        r3 = 5;
        goto L_0x001d;
    L_0x0066:
        r7 = "fontStyle";
        r3 = r3.equals(r7);
        if (r3 == 0) goto L_0x001c;
    L_0x006f:
        r3 = 6;
        goto L_0x001d;
    L_0x0071:
        r7 = "textAlign";
        r3 = r3.equals(r7);
        if (r3 == 0) goto L_0x001c;
    L_0x007a:
        r3 = 7;
        goto L_0x001d;
    L_0x007c:
        r7 = "textDecoration";
        r3 = r3.equals(r7);
        if (r3 == 0) goto L_0x001c;
    L_0x0085:
        r3 = 8;
        goto L_0x001d;
    L_0x0088:
        r3 = "style";
        r7 = r12.getName();
        r3 = r3.equals(r7);
        if (r3 == 0) goto L_0x0020;
    L_0x0095:
        r0 = a(r0);
        r0.id = r10;
        goto L_0x0020;
    L_0x009c:
        r0 = a(r0);
        r3 = com.google.android.exoplayer2.i.d.ar(r10);	 Catch:{ IllegalArgumentException -> 0x00a9 }
        r0.cR(r3);	 Catch:{ IllegalArgumentException -> 0x00a9 }
        goto L_0x0020;
    L_0x00a9:
        r3 = move-exception;
        goto L_0x0020;
    L_0x00ac:
        r0 = a(r0);
        r3 = com.google.android.exoplayer2.i.d.ar(r10);	 Catch:{ IllegalArgumentException -> 0x00b9 }
        r0.cQ(r3);	 Catch:{ IllegalArgumentException -> 0x00b9 }
        goto L_0x0020;
    L_0x00b9:
        r3 = move-exception;
        goto L_0x0020;
    L_0x00bc:
        r3 = a(r0);
        r0 = r3.azc;
        if (r0 != 0) goto L_0x00cd;
    L_0x00c4:
        r0 = r1;
    L_0x00c5:
        com.google.android.exoplayer2.i.a.ap(r0);
        r3.ayS = r10;
        r0 = r3;
        goto L_0x0020;
    L_0x00cd:
        r0 = r2;
        goto L_0x00c5;
    L_0x00cf:
        r0 = a(r0);	 Catch:{ f -> 0x0117 }
        r3 = "\\s+";
        r3 = r10.split(r3);	 Catch:{ f -> 0x0117 }
        r7 = r3.length;	 Catch:{ f -> 0x0117 }
        if (r7 != r1) goto L_0x011a;
    L_0x00dd:
        r3 = ayE;	 Catch:{ f -> 0x0117 }
        r3 = r3.matcher(r10);	 Catch:{ f -> 0x0117 }
        r7 = r3;
    L_0x00e4:
        r3 = r7.matches();	 Catch:{ f -> 0x0117 }
        if (r3 == 0) goto L_0x0183;
    L_0x00ea:
        r3 = 3;
        r10 = r7.group(r3);	 Catch:{ f -> 0x0117 }
        r3 = r10.hashCode();	 Catch:{ f -> 0x0117 }
        switch(r3) {
            case 37: goto L_0x015c;
            case 3240: goto L_0x0151;
            case 3592: goto L_0x0146;
            default: goto L_0x00f6;
        };	 Catch:{ f -> 0x0117 }
    L_0x00f6:
        r3 = r4;
    L_0x00f7:
        switch(r3) {
            case 0: goto L_0x0167;
            case 1: goto L_0x017b;
            case 2: goto L_0x017f;
            default: goto L_0x00fa;
        };	 Catch:{ f -> 0x0117 }
    L_0x00fa:
        r3 = new com.google.android.exoplayer2.f.f;	 Catch:{ f -> 0x0117 }
        r7 = new java.lang.StringBuilder;	 Catch:{ f -> 0x0117 }
        r11 = "Invalid unit for fontSize: '";
        r7.<init>(r11);	 Catch:{ f -> 0x0117 }
        r7 = r7.append(r10);	 Catch:{ f -> 0x0117 }
        r10 = "'.";
        r7 = r7.append(r10);	 Catch:{ f -> 0x0117 }
        r7 = r7.toString();	 Catch:{ f -> 0x0117 }
        r3.<init>(r7);	 Catch:{ f -> 0x0117 }
        throw r3;	 Catch:{ f -> 0x0117 }
    L_0x0117:
        r3 = move-exception;
        goto L_0x0020;
    L_0x011a:
        r7 = r3.length;	 Catch:{ f -> 0x0117 }
        if (r7 != r5) goto L_0x0128;
    L_0x011d:
        r7 = ayE;	 Catch:{ f -> 0x0117 }
        r11 = 1;
        r3 = r3[r11];	 Catch:{ f -> 0x0117 }
        r3 = r7.matcher(r3);	 Catch:{ f -> 0x0117 }
        r7 = r3;
        goto L_0x00e4;
    L_0x0128:
        r7 = new com.google.android.exoplayer2.f.f;	 Catch:{ f -> 0x0117 }
        r10 = new java.lang.StringBuilder;	 Catch:{ f -> 0x0117 }
        r11 = "Invalid number of entries for fontSize: ";
        r10.<init>(r11);	 Catch:{ f -> 0x0117 }
        r3 = r3.length;	 Catch:{ f -> 0x0117 }
        r3 = r10.append(r3);	 Catch:{ f -> 0x0117 }
        r10 = ".";
        r3 = r3.append(r10);	 Catch:{ f -> 0x0117 }
        r3 = r3.toString();	 Catch:{ f -> 0x0117 }
        r7.<init>(r3);	 Catch:{ f -> 0x0117 }
        throw r7;	 Catch:{ f -> 0x0117 }
    L_0x0146:
        r3 = "px";
        r3 = r10.equals(r3);	 Catch:{ f -> 0x0117 }
        if (r3 == 0) goto L_0x00f6;
    L_0x014f:
        r3 = r2;
        goto L_0x00f7;
    L_0x0151:
        r3 = "em";
        r3 = r10.equals(r3);	 Catch:{ f -> 0x0117 }
        if (r3 == 0) goto L_0x00f6;
    L_0x015a:
        r3 = r1;
        goto L_0x00f7;
    L_0x015c:
        r3 = "%";
        r3 = r10.equals(r3);	 Catch:{ f -> 0x0117 }
        if (r3 == 0) goto L_0x00f6;
    L_0x0165:
        r3 = r5;
        goto L_0x00f7;
    L_0x0167:
        r3 = 1;
        r0.aza = r3;	 Catch:{ f -> 0x0117 }
    L_0x016a:
        r3 = 1;
        r3 = r7.group(r3);	 Catch:{ f -> 0x0117 }
        r3 = java.lang.Float.valueOf(r3);	 Catch:{ f -> 0x0117 }
        r3 = r3.floatValue();	 Catch:{ f -> 0x0117 }
        r0.azb = r3;	 Catch:{ f -> 0x0117 }
        goto L_0x0020;
    L_0x017b:
        r3 = 2;
        r0.aza = r3;	 Catch:{ f -> 0x0117 }
        goto L_0x016a;
    L_0x017f:
        r3 = 3;
        r0.aza = r3;	 Catch:{ f -> 0x0117 }
        goto L_0x016a;
    L_0x0183:
        r3 = new com.google.android.exoplayer2.f.f;	 Catch:{ f -> 0x0117 }
        r7 = new java.lang.StringBuilder;	 Catch:{ f -> 0x0117 }
        r11 = "Invalid expression for fontSize: '";
        r7.<init>(r11);	 Catch:{ f -> 0x0117 }
        r7 = r7.append(r10);	 Catch:{ f -> 0x0117 }
        r10 = "'.";
        r7 = r7.append(r10);	 Catch:{ f -> 0x0117 }
        r7 = r7.toString();	 Catch:{ f -> 0x0117 }
        r3.<init>(r7);	 Catch:{ f -> 0x0117 }
        throw r3;	 Catch:{ f -> 0x0117 }
    L_0x01a0:
        r3 = a(r0);
        r0 = "bold";
        r7 = r0.equalsIgnoreCase(r10);
        r0 = r3.azc;
        if (r0 != 0) goto L_0x01bb;
    L_0x01af:
        r0 = r1;
    L_0x01b0:
        com.google.android.exoplayer2.i.a.ap(r0);
        if (r7 == 0) goto L_0x01bd;
    L_0x01b5:
        r0 = r1;
    L_0x01b6:
        r3.ayY = r0;
        r0 = r3;
        goto L_0x0020;
    L_0x01bb:
        r0 = r2;
        goto L_0x01b0;
    L_0x01bd:
        r0 = r2;
        goto L_0x01b6;
    L_0x01bf:
        r3 = a(r0);
        r0 = "italic";
        r7 = r0.equalsIgnoreCase(r10);
        r0 = r3.azc;
        if (r0 != 0) goto L_0x01da;
    L_0x01ce:
        r0 = r1;
    L_0x01cf:
        com.google.android.exoplayer2.i.a.ap(r0);
        if (r7 == 0) goto L_0x01dc;
    L_0x01d4:
        r0 = r1;
    L_0x01d5:
        r3.ayZ = r0;
        r0 = r3;
        goto L_0x0020;
    L_0x01da:
        r0 = r2;
        goto L_0x01cf;
    L_0x01dc:
        r0 = r2;
        goto L_0x01d5;
    L_0x01de:
        r3 = com.google.android.exoplayer2.i.t.aC(r10);
        r7 = r3.hashCode();
        switch(r7) {
            case -1364013995: goto L_0x0225;
            case 100571: goto L_0x021a;
            case 3317767: goto L_0x01f9;
            case 108511772: goto L_0x020f;
            case 109757538: goto L_0x0204;
            default: goto L_0x01e9;
        };
    L_0x01e9:
        r3 = r4;
    L_0x01ea:
        switch(r3) {
            case 0: goto L_0x01ef;
            case 1: goto L_0x0230;
            case 2: goto L_0x023a;
            case 3: goto L_0x0244;
            case 4: goto L_0x024e;
            default: goto L_0x01ed;
        };
    L_0x01ed:
        goto L_0x0020;
    L_0x01ef:
        r0 = a(r0);
        r3 = android.text.Layout.Alignment.ALIGN_NORMAL;
        r0.azd = r3;
        goto L_0x0020;
    L_0x01f9:
        r7 = "left";
        r3 = r3.equals(r7);
        if (r3 == 0) goto L_0x01e9;
    L_0x0202:
        r3 = r2;
        goto L_0x01ea;
    L_0x0204:
        r7 = "start";
        r3 = r3.equals(r7);
        if (r3 == 0) goto L_0x01e9;
    L_0x020d:
        r3 = r1;
        goto L_0x01ea;
    L_0x020f:
        r7 = "right";
        r3 = r3.equals(r7);
        if (r3 == 0) goto L_0x01e9;
    L_0x0218:
        r3 = r5;
        goto L_0x01ea;
    L_0x021a:
        r7 = "end";
        r3 = r3.equals(r7);
        if (r3 == 0) goto L_0x01e9;
    L_0x0223:
        r3 = r6;
        goto L_0x01ea;
    L_0x0225:
        r7 = "center";
        r3 = r3.equals(r7);
        if (r3 == 0) goto L_0x01e9;
    L_0x022e:
        r3 = 4;
        goto L_0x01ea;
    L_0x0230:
        r0 = a(r0);
        r3 = android.text.Layout.Alignment.ALIGN_NORMAL;
        r0.azd = r3;
        goto L_0x0020;
    L_0x023a:
        r0 = a(r0);
        r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE;
        r0.azd = r3;
        goto L_0x0020;
    L_0x0244:
        r0 = a(r0);
        r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE;
        r0.azd = r3;
        goto L_0x0020;
    L_0x024e:
        r0 = a(r0);
        r3 = android.text.Layout.Alignment.ALIGN_CENTER;
        r0.azd = r3;
        goto L_0x0020;
    L_0x0258:
        r3 = com.google.android.exoplayer2.i.t.aC(r10);
        r7 = r3.hashCode();
        switch(r7) {
            case -1461280213: goto L_0x0294;
            case -1026963764: goto L_0x0289;
            case 913457136: goto L_0x027e;
            case 1679736913: goto L_0x0273;
            default: goto L_0x0263;
        };
    L_0x0263:
        r3 = r4;
    L_0x0264:
        switch(r3) {
            case 0: goto L_0x0269;
            case 1: goto L_0x029f;
            case 2: goto L_0x02a9;
            case 3: goto L_0x02b3;
            default: goto L_0x0267;
        };
    L_0x0267:
        goto L_0x0020;
    L_0x0269:
        r0 = a(r0);
        r0 = r0.al(r1);
        goto L_0x0020;
    L_0x0273:
        r7 = "linethrough";
        r3 = r3.equals(r7);
        if (r3 == 0) goto L_0x0263;
    L_0x027c:
        r3 = r2;
        goto L_0x0264;
    L_0x027e:
        r7 = "nolinethrough";
        r3 = r3.equals(r7);
        if (r3 == 0) goto L_0x0263;
    L_0x0287:
        r3 = r1;
        goto L_0x0264;
    L_0x0289:
        r7 = "underline";
        r3 = r3.equals(r7);
        if (r3 == 0) goto L_0x0263;
    L_0x0292:
        r3 = r5;
        goto L_0x0264;
    L_0x0294:
        r7 = "nounderline";
        r3 = r3.equals(r7);
        if (r3 == 0) goto L_0x0263;
    L_0x029d:
        r3 = r6;
        goto L_0x0264;
    L_0x029f:
        r0 = a(r0);
        r0 = r0.al(r2);
        goto L_0x0020;
    L_0x02a9:
        r0 = a(r0);
        r0 = r0.am(r1);
        goto L_0x0020;
    L_0x02b3:
        r0 = a(r0);
        r0 = r0.am(r2);
        goto L_0x0020;
    L_0x02bd:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.f.e.a.a(org.xmlpull.v1.XmlPullParser, com.google.android.exoplayer2.f.e.d):com.google.android.exoplayer2.f.e.d");
    }

    private static d a(d dVar) {
        return dVar == null ? new d() : dVar;
    }

    private static b a(XmlPullParser xmlPullParser, b bVar, Map<String, c> map, a aVar) {
        long j;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        String str = "";
        String[] strArr = null;
        int attributeCount = xmlPullParser.getAttributeCount();
        d a = a(xmlPullParser, null);
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            Object obj = -1;
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        obj = 4;
                        break;
                    }
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        obj = 2;
                        break;
                    }
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        obj = 1;
                        break;
                    }
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        obj = null;
                        break;
                    }
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        obj = 3;
                        break;
                    }
                    break;
            }
            switch (obj) {
                case null:
                    j3 = a(attributeValue, aVar);
                    break;
                case 1:
                    j4 = a(attributeValue, aVar);
                    break;
                case 2:
                    j2 = a(attributeValue, aVar);
                    break;
                case 3:
                    String[] split = attributeValue.split("\\s+");
                    if (split.length <= 0) {
                        break;
                    }
                    strArr = split;
                    break;
                case 4:
                    if (!map.containsKey(attributeValue)) {
                        break;
                    }
                    str = attributeValue;
                    break;
                default:
                    break;
            }
        }
        if (!(bVar == null || bVar.asN == -9223372036854775807L)) {
            if (j3 != -9223372036854775807L) {
                j3 += bVar.asN;
            }
            if (j4 != -9223372036854775807L) {
                j = j4 + bVar.asN;
                if (j == -9223372036854775807L) {
                    if (j2 != -9223372036854775807L) {
                        j2 += j3;
                    } else if (!(bVar == null || bVar.asO == -9223372036854775807L)) {
                        j2 = bVar.asO;
                    }
                    return new b(xmlPullParser.getName(), null, j3, j2, a, strArr, str);
                }
                j2 = j;
                return new b(xmlPullParser.getName(), null, j3, j2, a, strArr, str);
            }
        }
        j = j4;
        if (j == -9223372036854775807L) {
            if (j2 != -9223372036854775807L) {
                j2 += j3;
            } else if (!(bVar == null || bVar.asO == -9223372036854775807L)) {
                j2 = bVar.asO;
            }
            return new b(xmlPullParser.getName(), null, j3, j2, a, strArr, str);
        }
        j2 = j;
        return new b(xmlPullParser.getName(), null, j3, j2, a, strArr, str);
    }

    private static long a(String str, a aVar) {
        double d = 0.0d;
        Matcher matcher = ayC.matcher(str);
        double parseLong;
        if (matcher.matches()) {
            double parseLong2 = ((double) Long.parseLong(matcher.group(3))) + (((double) (Long.parseLong(matcher.group(1)) * 3600)) + ((double) (Long.parseLong(matcher.group(2)) * 60)));
            String group = matcher.group(4);
            parseLong2 += group != null ? Double.parseDouble(group) : 0.0d;
            group = matcher.group(5);
            if (group != null) {
                parseLong = (double) (((float) Long.parseLong(group)) / aVar.ayI);
            } else {
                parseLong = 0.0d;
            }
            parseLong += parseLong2;
            String group2 = matcher.group(6);
            if (group2 != null) {
                d = (((double) Long.parseLong(group2)) / ((double) aVar.ayJ)) / ((double) aVar.ayI);
            }
            return (long) ((parseLong + d) * 1000000.0d);
        }
        Matcher matcher2 = ayD.matcher(str);
        if (matcher2.matches()) {
            parseLong = Double.parseDouble(matcher2.group(1));
            String group3 = matcher2.group(2);
            int i = -1;
            switch (group3.hashCode()) {
                case 102:
                    if (group3.equals("f")) {
                        i = 4;
                        break;
                    }
                    break;
                case 104:
                    if (group3.equals("h")) {
                        i = 0;
                        break;
                    }
                    break;
                case 109:
                    if (group3.equals("m")) {
                        i = 1;
                        break;
                    }
                    break;
                case 115:
                    if (group3.equals("s")) {
                        i = 2;
                        break;
                    }
                    break;
                case 116:
                    if (group3.equals("t")) {
                        i = 5;
                        break;
                    }
                    break;
                case 3494:
                    if (group3.equals("ms")) {
                        i = 3;
                        break;
                    }
                    break;
            }
            switch (i) {
                case 0:
                    parseLong *= 3600.0d;
                    break;
                case 1:
                    parseLong *= 60.0d;
                    break;
                case 3:
                    parseLong /= 1000.0d;
                    break;
                case 4:
                    parseLong /= (double) aVar.ayI;
                    break;
                case 5:
                    parseLong /= (double) aVar.ayK;
                    break;
            }
            return (long) (parseLong * 1000000.0d);
        }
        throw new f("Malformed time expression: " + str);
    }
}
