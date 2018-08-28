package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTask;
import com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTaskStraight;
import com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiCancelDownloadTask;
import com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiGetInstallState;
import com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiInstallDownloadTask;
import com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiPauseDownloadTask;
import com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiQueryDownloadTask;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetBackgroundAudioState;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiGetMusicPlayerState;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateBackgroundAudio;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiOperateMusicPlayer;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiPausePlayVoice;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiSetBackgroundAudioState;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartPlayVoice;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopPlayVoice;
import com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStopRecordVoice;
import com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiAuthorize;
import com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin;
import com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiOperateWXData;
import com.tencent.mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckBioEnrollment;
import com.tencent.mm.plugin.appbrand.jsapi.bio.soter.JsApiCheckIsSupportSoterAuthentication;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.k;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.l;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.n;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.o;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.p;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.q;
import com.tencent.mm.plugin.appbrand.jsapi.contact.JsApiChooseWeChatContact;
import com.tencent.mm.plugin.appbrand.jsapi.f.m;
import com.tencent.mm.plugin.appbrand.jsapi.file.JsApiOpenDocument;
import com.tencent.mm.plugin.appbrand.jsapi.file.aa;
import com.tencent.mm.plugin.appbrand.jsapi.file.ab;
import com.tencent.mm.plugin.appbrand.jsapi.file.ac;
import com.tencent.mm.plugin.appbrand.jsapi.file.ad;
import com.tencent.mm.plugin.appbrand.jsapi.file.ae;
import com.tencent.mm.plugin.appbrand.jsapi.file.af;
import com.tencent.mm.plugin.appbrand.jsapi.file.ag;
import com.tencent.mm.plugin.appbrand.jsapi.file.ah;
import com.tencent.mm.plugin.appbrand.jsapi.file.ai;
import com.tencent.mm.plugin.appbrand.jsapi.file.aj;
import com.tencent.mm.plugin.appbrand.jsapi.file.ak;
import com.tencent.mm.plugin.appbrand.jsapi.file.r;
import com.tencent.mm.plugin.appbrand.jsapi.file.s;
import com.tencent.mm.plugin.appbrand.jsapi.file.t;
import com.tencent.mm.plugin.appbrand.jsapi.file.u;
import com.tencent.mm.plugin.appbrand.jsapi.file.v;
import com.tencent.mm.plugin.appbrand.jsapi.file.w;
import com.tencent.mm.plugin.appbrand.jsapi.file.x;
import com.tencent.mm.plugin.appbrand.jsapi.file.y;
import com.tencent.mm.plugin.appbrand.jsapi.file.z;
import com.tencent.mm.plugin.appbrand.jsapi.lbs.JsApiGetLocation;
import com.tencent.mm.plugin.appbrand.jsapi.lbs.e;
import com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage;
import com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia;
import com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseVideo;
import com.tencent.mm.plugin.appbrand.jsapi.media.JsApiUploadEncryptedFileToCDN;
import com.tencent.mm.plugin.appbrand.jsapi.media.d;
import com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiLaunchMiniProgram;
import com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.JsApiNavigateToDevMiniProgram;
import com.tencent.mm.plugin.appbrand.jsapi.share.JsApiShowUpdatableMessageSubscribeButton;
import com.tencent.mm.plugin.appbrand.jsapi.storage.a;
import com.tencent.mm.plugin.appbrand.jsapi.storage.b;
import com.tencent.mm.plugin.appbrand.jsapi.storage.c;
import com.tencent.mm.plugin.appbrand.jsapi.storage.f;
import com.tencent.mm.plugin.appbrand.jsapi.storage.g;
import com.tencent.mm.plugin.appbrand.jsapi.storage.h;
import com.tencent.mm.plugin.appbrand.jsapi.storage.j;
import com.tencent.mm.plugin.appbrand.jsapi.version.JsApiUpdateApp;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.HashMap;
import java.util.Map;

public final class i {
    private static Map<String, e> fFg;
    private static Map<String, e> fFh;

    public static Map<String, e> ahN() {
        fFg = new HashMap();
        a(new a());
        a(new c());
        a(new com.tencent.mm.plugin.appbrand.jsapi.storage.i());
        a(new b());
        a(new f());
        a(new j());
        a(new JsApiLogin());
        a(new JsApiAuthorize());
        a(new JsApiOperateWXData());
        a(new bi());
        a(new an());
        a(new ba());
        a(new am());
        a(new aw());
        a(new JsApiChooseImage());
        a(new d());
        a(new JsApiChooseVideo());
        a(new JsApiStartRecordVoice());
        a(new JsApiStopRecordVoice());
        a(new JsApiStartPlayVoice());
        a(new JsApiPausePlayVoice());
        a(new JsApiStopPlayVoice());
        a(new JsApiGetLocation());
        a(new e());
        a(new ad());
        a(new JsApiGetMusicPlayerState());
        a(new JsApiOperateMusicPlayer());
        a(new JsApiScanCode());
        a(new at());
        a(new com.tencent.mm.plugin.appbrand.jsapi.i.e());
        a(new ao());
        a(new com.tencent.mm.plugin.appbrand.jsapi.l.a());
        a(new com.tencent.mm.plugin.appbrand.jsapi.i.i());
        a(new com.tencent.mm.plugin.appbrand.jsapi.i.c());
        a(new com.tencent.mm.plugin.appbrand.jsapi.contact.b());
        a(new com.tencent.mm.plugin.appbrand.jsapi.contact.e());
        a(new bq());
        a(new bn());
        a(new ah());
        a(new com.tencent.mm.plugin.appbrand.jsapi.b.b());
        a(new com.tencent.mm.plugin.appbrand.jsapi.share.c());
        a(new com.tencent.mm.plugin.appbrand.jsapi.share.e());
        a(new ag());
        a(new com.tencent.mm.plugin.appbrand.jsapi.l.b());
        a(new com.tencent.mm.plugin.appbrand.jsapi.l.d());
        a(new com.tencent.mm.plugin.appbrand.jsapi.l.c());
        a(new bs());
        a(new com.tencent.mm.plugin.appbrand.jsapi.d.e());
        a(new ae());
        a(new com.tencent.mm.plugin.appbrand.jsapi.d.b());
        a(new com.tencent.mm.plugin.appbrand.jsapi.m.a());
        a(new com.tencent.mm.plugin.appbrand.jsapi.m.b());
        a(new g());
        a(new h());
        a(new com.tencent.mm.plugin.appbrand.jsapi.b.a());
        a(new u());
        a(new com.tencent.mm.plugin.appbrand.jsapi.k.c());
        a(new com.tencent.mm.plugin.appbrand.jsapi.k.b());
        a(new com.tencent.mm.plugin.appbrand.jsapi.k.d());
        a(new com.tencent.mm.plugin.appbrand.jsapi.k.a());
        a(new y());
        a(new al());
        a(new com.tencent.mm.plugin.appbrand.jsapi.storage.d());
        a(new com.tencent.mm.plugin.appbrand.jsapi.storage.e());
        a(new com.tencent.mm.plugin.appbrand.jsapi.lbs.c());
        a(new com.tencent.mm.plugin.appbrand.jsapi.media.c());
        a(new JsApiRefreshSession());
        a(new br());
        a(new com.tencent.mm.plugin.appbrand.jsapi.f.e());
        a(new com.tencent.mm.plugin.appbrand.jsapi.f.j());
        a(new m());
        a(new com.tencent.mm.plugin.appbrand.jsapi.i.f());
        a(new com.tencent.mm.plugin.appbrand.jsapi.share.f());
        a(new q());
        a(new ap());
        a(new JsApiMakeVoIPCall());
        a(new aa());
        a(new JsApiSetClipboardData());
        a(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.m());
        a(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.e());
        a(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.i());
        a(new o());
        a(new p());
        a(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.j());
        a(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.f());
        a(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.d());
        a(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.h());
        a(new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.g());
        a(new n());
        a(new q());
        a(new l());
        a(new k());
        a(new JsApiLaunchMiniProgram());
        a(new az());
        a(new JsApiChooseWeChatContact());
        a(new JsApiChooseMedia());
        a(new JsApiUploadEncryptedFileToCDN());
        a(new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b());
        a(new au());
        a(new bu());
        a(new JsApiGetBackgroundAudioState());
        a(new JsApiSetBackgroundAudioState());
        a(new JsApiOperateBackgroundAudio());
        a(new com.tencent.mm.plugin.appbrand.jsapi.share.g());
        a(new com.tencent.mm.plugin.appbrand.jsapi.share.b());
        a(new av());
        a(new com.tencent.mm.plugin.appbrand.jsapi.i.h());
        a(new com.tencent.mm.plugin.appbrand.jsapi.contact.a());
        a(new JsApiOpenWeRunSetting());
        a(new JsApiUploadWeRunData());
        a(new r());
        a(new af());
        a(new bj());
        a(new bw());
        a(new bx());
        a(new com.tencent.mm.plugin.appbrand.jsapi.share.i());
        a(new com.tencent.mm.plugin.appbrand.jsapi.share.h());
        a(new com.tencent.mm.plugin.appbrand.jsapi.share.j());
        a(new JsApiShowUpdatableMessageSubscribeButton());
        a(new com.tencent.mm.plugin.appbrand.jsapi.c.b());
        a(new com.tencent.mm.plugin.appbrand.jsapi.c.c());
        a(new com.tencent.mm.plugin.appbrand.jsapi.c.d());
        a(new JsApiCheckIsSupportFaceDetect());
        a(new com.tencent.mm.plugin.appbrand.jsapi.bio.face.b());
        a(new com.tencent.mm.plugin.appbrand.jsapi.bio.face.c());
        a(new com.tencent.mm.plugin.appbrand.jsapi.video.b());
        a(new com.tencent.mm.plugin.appbrand.jsapi.live.e());
        a(new com.tencent.mm.plugin.appbrand.jsapi.live.d());
        a(new com.tencent.mm.plugin.appbrand.jsapi.media.e());
        a(new com.tencent.mm.plugin.appbrand.jsapi.media.f());
        a(new JsApiGetSetting());
        a(new aq());
        a(new com.tencent.mm.plugin.appbrand.jsapi.share.d());
        a(new com.tencent.mm.plugin.appbrand.jsapi.n.f());
        a(new bf());
        a(new v());
        a(new com.tencent.mm.plugin.appbrand.jsapi.b.d());
        a(new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.d());
        a(new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.c());
        a(new com.tencent.mm.plugin.appbrand.jsapi.f.g());
        a(new com.tencent.mm.plugin.appbrand.jsapi.f.f());
        a(new com.tencent.mm.plugin.appbrand.jsapi.op_report.b());
        a(new com.tencent.mm.plugin.appbrand.jsapi.n.d());
        a(new be());
        a(new com.tencent.mm.plugin.appbrand.jsapi.n.e());
        a(new bt());
        a(new bh());
        a(new JsApiCheckIsSupportSoterAuthentication());
        a(new com.tencent.mm.plugin.appbrand.jsapi.bio.soter.b());
        a(new w());
        a(new com.tencent.mm.plugin.appbrand.jsapi.h.c());
        a(new com.tencent.mm.plugin.appbrand.jsapi.h.g());
        a(new com.tencent.mm.plugin.appbrand.jsapi.h.b());
        a(new com.tencent.mm.plugin.appbrand.jsapi.h.f());
        a(new com.tencent.mm.plugin.appbrand.jsapi.h.e());
        a(new com.tencent.mm.plugin.appbrand.jsapi.h.i());
        a(new bv());
        a(new JsApiBatchGetContact());
        a(new com.tencent.mm.plugin.appbrand.jsapi.camera.i());
        a(new bp());
        a(new com.tencent.mm.plugin.appbrand.jsapi.audio.i());
        a(new com.tencent.mm.plugin.appbrand.jsapi.audio.g());
        a(new com.tencent.mm.plugin.appbrand.jsapi.audio.d());
        a(new com.tencent.mm.plugin.appbrand.jsapi.audio.j());
        a(new com.tencent.mm.plugin.appbrand.jsapi.audio.f());
        a(new com.tencent.mm.plugin.appbrand.jsapi.audio.h());
        a(new com.tencent.mm.plugin.appbrand.jsapi.audio.e());
        a(new JsApiNavigateBackApplication());
        a(new com.tencent.mm.plugin.appbrand.jsapi.lbs.d());
        a(new JsApiCheckBioEnrollment());
        a(new com.tencent.mm.plugin.appbrand.jsapi.wifi.d());
        a(new com.tencent.mm.plugin.appbrand.jsapi.wifi.e());
        a(new com.tencent.mm.plugin.appbrand.jsapi.wifi.c());
        a(new com.tencent.mm.plugin.appbrand.jsapi.wifi.b());
        a(new com.tencent.mm.plugin.appbrand.jsapi.wifi.a());
        a(new JsApiNavigateToDevMiniProgram());
        a(new com.tencent.mm.plugin.appbrand.jsapi.nfc.d());
        a(new com.tencent.mm.plugin.appbrand.jsapi.nfc.e());
        a(new com.tencent.mm.plugin.appbrand.jsapi.nfc.c());
        a(new com.tencent.mm.plugin.appbrand.jsapi.nfc.b());
        a(new bk());
        a(new bm());
        a(new bl());
        a(new ai());
        a(new bo());
        a(new com.tencent.mm.plugin.appbrand.jsapi.n.g());
        a(new com.tencent.mm.plugin.appbrand.jsapi.n.b());
        a(new com.tencent.mm.plugin.appbrand.jsapi.h.d());
        a(new com.tencent.mm.plugin.appbrand.jsapi.h.h());
        a(new com.tencent.mm.plugin.appbrand.jsapi.i.g());
        a(new bg());
        a(new ae());
        a(new af());
        a(new com.tencent.mm.plugin.appbrand.jsapi.file.o());
        a(new com.tencent.mm.plugin.appbrand.jsapi.file.p());
        a(new com.tencent.mm.plugin.appbrand.jsapi.file.q());
        a(new z());
        a(new y());
        a(new ak());
        a(new u());
        a(new w());
        a(new ad());
        a(new com.tencent.mm.plugin.appbrand.jsapi.file.h());
        a(new ah());
        a(new s());
        a(new com.tencent.mm.plugin.appbrand.jsapi.file.n());
        a(new JsApiOpenDocument());
        a(new x());
        a(new aj());
        a(new t());
        a(new v());
        a(new ac());
        a(new com.tencent.mm.plugin.appbrand.jsapi.file.g());
        a(new ag());
        a(new r());
        a(new com.tencent.mm.plugin.appbrand.jsapi.file.m());
        a(new ai());
        a(new com.tencent.mm.plugin.appbrand.jsapi.file.k());
        a(new com.tencent.mm.plugin.appbrand.jsapi.file.l());
        a(new aa());
        a(new ab());
        a(new com.tencent.mm.plugin.appbrand.jsapi.file.i());
        a(new com.tencent.mm.plugin.appbrand.jsapi.file.j());
        a(new JsApiUpdateApp());
        a(new s());
        a(new t());
        a(new as());
        a(new z());
        a(new JsApiLaunchApplication());
        a(new JsApiAddNativeDownloadTask());
        a(new com.tencent.mm.plugin.appbrand.jsapi.i.d());
        a(new JsApiAddDownloadTask());
        a(new JsApiAddDownloadTaskStraight());
        a(new JsApiQueryDownloadTask());
        a(new JsApiInstallDownloadTask());
        a(new JsApiPauseDownloadTask());
        a(new JsApiResumeDownloadTask());
        a(new JsApiGetInstallState());
        a(new JsApiCancelDownloadTask());
        a(new JsApiWriteCommData());
        a(new ac());
        a(new bc());
        a(new bd());
        a(new com.tencent.mm.plugin.appbrand.jsapi.e.a());
        a(new com.tencent.mm.plugin.appbrand.jsapi.e.b());
        a(new com.tencent.mm.plugin.appbrand.jsapi.m.c());
        a(new com.tencent.mm.plugin.appbrand.jsapi.h5_interact.b());
        return fFg;
    }

    public static Map<String, e> ahO() {
        fFh = new HashMap();
        b(new ar());
        b(new com.tencent.mm.plugin.appbrand.jsapi.f.i());
        b(new com.tencent.mm.plugin.appbrand.jsapi.f.k());
        b(new com.tencent.mm.plugin.appbrand.jsapi.f.n());
        b(new com.tencent.mm.plugin.appbrand.jsapi.d.f());
        b(new com.tencent.mm.plugin.appbrand.jsapi.d.b());
        b(new com.tencent.mm.plugin.appbrand.jsapi.d.g());
        b(new com.tencent.mm.plugin.appbrand.jsapi.d.c());
        b(new com.tencent.mm.plugin.appbrand.jsapi.d.h());
        b(new com.tencent.mm.plugin.appbrand.jsapi.d.d());
        b(new aj());
        b(new com.tencent.mm.plugin.appbrand.jsapi.l.a());
        b(new com.tencent.mm.plugin.appbrand.jsapi.l.b());
        b(new com.tencent.mm.plugin.appbrand.jsapi.l.d());
        b(new com.tencent.mm.plugin.appbrand.jsapi.l.c());
        b(new bb());
        b(new bs());
        b(new com.tencent.mm.plugin.appbrand.jsapi.j.d());
        b(new com.tencent.mm.plugin.appbrand.jsapi.j.f());
        b(new ab());
        b(new ae());
        b(new com.tencent.mm.plugin.appbrand.jsapi.video.a());
        b(new com.tencent.mm.plugin.appbrand.jsapi.video.d());
        b(new com.tencent.mm.plugin.appbrand.jsapi.video.c());
        b(new com.tencent.mm.plugin.appbrand.jsapi.video.b());
        b(new com.tencent.mm.plugin.appbrand.jsapi.live.c());
        b(new com.tencent.mm.plugin.appbrand.jsapi.live.i());
        b(new com.tencent.mm.plugin.appbrand.jsapi.live.g());
        b(new com.tencent.mm.plugin.appbrand.jsapi.live.e());
        b(new com.tencent.mm.plugin.appbrand.jsapi.live.b());
        b(new com.tencent.mm.plugin.appbrand.jsapi.live.h());
        b(new com.tencent.mm.plugin.appbrand.jsapi.live.f());
        b(new com.tencent.mm.plugin.appbrand.jsapi.live.d());
        b(new com.tencent.mm.plugin.appbrand.jsapi.b.b());
        b(new com.tencent.mm.plugin.appbrand.jsapi.b.c());
        b(new com.tencent.mm.plugin.appbrand.jsapi.b.e());
        b(new com.tencent.mm.plugin.appbrand.jsapi.b.f());
        b(new com.tencent.mm.plugin.appbrand.jsapi.f.a());
        b(new com.tencent.mm.plugin.appbrand.jsapi.f.d());
        b(new com.tencent.mm.plugin.appbrand.jsapi.f.l());
        b(new com.tencent.mm.plugin.appbrand.jsapi.f.c());
        b(new com.tencent.mm.plugin.appbrand.jsapi.f.h());
        b(new com.tencent.mm.plugin.appbrand.jsapi.f.b());
        b(new com.tencent.mm.plugin.appbrand.jsapi.contact.c());
        b(new JsApiPrivateAddContact());
        b(new ay());
        b(new x());
        b(new com.tencent.mm.plugin.appbrand.jsapi.a.d());
        b(new com.tencent.mm.plugin.appbrand.jsapi.a.g());
        b(new com.tencent.mm.plugin.appbrand.jsapi.a.b());
        b(new com.tencent.mm.plugin.appbrand.jsapi.a.f());
        b(new bu());
        b(new bx());
        b(new com.tencent.mm.plugin.appbrand.jsapi.container.a());
        b(new com.tencent.mm.plugin.appbrand.jsapi.container.c());
        b(new com.tencent.mm.plugin.appbrand.jsapi.container.b());
        b(new com.tencent.mm.plugin.appbrand.jsapi.a.c());
        b(new com.tencent.mm.plugin.appbrand.jsapi.a.e());
        b(new com.tencent.mm.plugin.appbrand.jsapi.j.e());
        b(new com.tencent.mm.plugin.appbrand.jsapi.j.b());
        b(new com.tencent.mm.plugin.appbrand.jsapi.j.g());
        b(new bt());
        b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.e());
        b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.k());
        b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.h());
        b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.c());
        b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.i());
        b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.f());
        b(new com.tencent.mm.plugin.appbrand.jsapi.camera.g());
        b(new com.tencent.mm.plugin.appbrand.jsapi.camera.k());
        b(new com.tencent.mm.plugin.appbrand.jsapi.camera.j());
        b(new com.tencent.mm.plugin.appbrand.debugger.d());
        b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.b());
        b(new com.tencent.mm.plugin.appbrand.jsapi.p.f());
        b(new com.tencent.mm.plugin.appbrand.jsapi.p.h());
        b(new com.tencent.mm.plugin.appbrand.jsapi.p.g());
        b(new com.tencent.mm.plugin.appbrand.jsapi.n.c());
        b(new ax());
        b(new JsApiAdDataReport());
        b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.d());
        b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.j());
        b(new com.tencent.mm.plugin.appbrand.jsapi.coverview.g());
        b(new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.d());
        b(new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.c());
        b(new com.tencent.mm.plugin.appbrand.jsapi.i.e());
        b(new com.tencent.mm.plugin.appbrand.jsapi.n.d());
        b(new JsApiOperateWXData());
        b(new JsApiLogin());
        b(new JsApiAuthorize());
        b(new com.tencent.mm.plugin.appbrand.jsapi.n.g());
        b(new com.tencent.mm.plugin.appbrand.jsapi.n.b());
        return fFh;
    }

    private static void a(e eVar) {
        if (!bi.oW(eVar.getName())) {
            fFg.put(eVar.getName(), eVar);
        }
    }

    private static void b(e eVar) {
        if (!bi.oW(eVar.getName())) {
            fFh.put(eVar.getName(), eVar);
        }
    }
}
