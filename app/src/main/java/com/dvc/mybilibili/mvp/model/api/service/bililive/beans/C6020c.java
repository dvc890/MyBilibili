package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

/* compiled from: BL */
/* renamed from: com.bilibili.bililive.videoliveplayer.net.c */
public class C6020c {
    /* renamed from: a */
    public static boolean m23832a(okhttp3.HttpUrl r3) {
        /*
        r3 = r3.mo79603i();
        r0 = r3.hashCode();
        r1 = 1;
        r2 = 0;
        switch(r0) {
            case -1966211932: goto L_0x01ae;
            case -1734854063: goto L_0x01a3;
            case -1565983563: goto L_0x0199;
            case -1414348734: goto L_0x018e;
            case -1286298343: goto L_0x0184;
            case -1242829368: goto L_0x017a;
            case -1033982659: goto L_0x016f;
            case -935421207: goto L_0x0164;
            case -873474080: goto L_0x0159;
            case -807039015: goto L_0x014e;
            case -793142966: goto L_0x0143;
            case -778542284: goto L_0x0137;
            case -737403984: goto L_0x012b;
            case -659877943: goto L_0x011f;
            case -619858318: goto L_0x0113;
            case -488635443: goto L_0x0108;
            case -59794751: goto L_0x00fc;
            case 390191631: goto L_0x00f0;
            case 489715455: goto L_0x00e4;
            case 657761723: goto L_0x00d8;
            case 799588337: goto L_0x00cd;
            case 802858518: goto L_0x00c1;
            case 827086515: goto L_0x00b5;
            case 965605334: goto L_0x00a9;
            case 1153371731: goto L_0x009d;
            case 1179267458: goto L_0x0091;
            case 1216646303: goto L_0x0085;
            case 1265951118: goto L_0x0079;
            case 1693424711: goto L_0x006d;
            case 1707872788: goto L_0x0062;
            case 1724708547: goto L_0x0056;
            case 1762097071: goto L_0x004a;
            case 1856894446: goto L_0x003e;
            case 1905955472: goto L_0x0032;
            case 1916908453: goto L_0x0027;
            case 1938246067: goto L_0x001b;
            case 2073696961: goto L_0x000f;
            default: goto L_0x000d;
        };
    L_0x000d:
        goto L_0x01b9;
    L_0x000f:
        r0 = "/AppBag/send";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x0017:
        r3 = 15;
        goto L_0x01ba;
    L_0x001b:
        r0 = "/AppUser/capsuleInfoOpen";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x0023:
        r3 = 10;
        goto L_0x01ba;
    L_0x0027:
        r0 = "/mhand/assistant/updateRoomInfo";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x002f:
        r3 = 0;
        goto L_0x01ba;
    L_0x0032:
        r0 = "/lottery/v1/Award/award_receive";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x003a:
        r3 = 28;
        goto L_0x01ba;
    L_0x003e:
        r0 = "/assistant/updateCover";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x0046:
        r3 = 21;
        goto L_0x01ba;
    L_0x004a:
        r0 = "/live_user/v1/UserSetting/set_vip_status";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x0052:
        r3 = 11;
        goto L_0x01ba;
    L_0x0056:
        r0 = "/clip/v1/video/delete";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x005e:
        r3 = 19;
        goto L_0x01ba;
    L_0x0062:
        r0 = "/clip/v1/video/create";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x006a:
        r3 = 4;
        goto L_0x01ba;
    L_0x006d:
        r0 = "/mhand/assistant/changePic";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x0075:
        r3 = 20;
        goto L_0x01ba;
    L_0x0079:
        r0 = "/fans_medal/v1/medal/open";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x0081:
        r3 = 31;
        goto L_0x01ba;
    L_0x0085:
        r0 = "/heartbeat/v1/OnLine/mobileOnline";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x008d:
        r3 = 14;
        goto L_0x01ba;
    L_0x0091:
        r0 = "/fans_medal/v1/medal/rename";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x0099:
        r3 = 32;
        goto L_0x01ba;
    L_0x009d:
        r0 = "/fans_medal/v2/medal/get";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x00a5:
        r3 = 30;
        goto L_0x01ba;
    L_0x00a9:
        r0 = "/appRoom/stormBeats";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x00b1:
        r3 = 13;
        goto L_0x01ba;
    L_0x00b5:
        r0 = "/activity/v1/lol/vote";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x00bd:
        r3 = 35;
        goto L_0x01ba;
    L_0x00c1:
        r0 = "/AppRoom/report";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x00c9:
        r3 = 16;
        goto L_0x01ba;
    L_0x00cd:
        r0 = "/mhand/Assistant/setShieldKeyword";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x00d5:
        r3 = 1;
        goto L_0x01ba;
    L_0x00d8:
        r0 = "/mhand/assistant/updateCover";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x00e0:
        r3 = 18;
        goto L_0x01ba;
    L_0x00e4:
        r0 = "/gift/v2/live/bag_send";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x00ec:
        r3 = 27;
        goto L_0x01ba;
    L_0x00f0:
        r0 = "/push/v1/PushSwitch/setTotalPush";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x00f8:
        r3 = 33;
        goto L_0x01ba;
    L_0x00fc:
        r0 = "/captcha/v1/Captcha/create";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x0104:
        r3 = 29;
        goto L_0x01ba;
    L_0x0108:
        r0 = "/danmu/v1/danmu/send";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x0110:
        r3 = 6;
        goto L_0x01ba;
    L_0x0113:
        r0 = "/rc/v1/UserTitle/wearTitle";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x011b:
        r3 = 9;
        goto L_0x01ba;
    L_0x011f:
        r0 = "/feed/v1/feed/unfollow";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x0127:
        r3 = 24;
        goto L_0x01ba;
    L_0x012b:
        r0 = "/feed/v1/feed/follow";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x0133:
        r3 = 25;
        goto L_0x01ba;
    L_0x0137:
        r0 = "/lottery/v1/Storm/setMyBeats";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x013f:
        r3 = 12;
        goto L_0x01ba;
    L_0x0143:
        r0 = "/mhand/Assistant/roomBlockUser";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x014b:
        r3 = 2;
        goto L_0x01ba;
    L_0x014e:
        r0 = "/feed/v1/feed/isFollowed";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x0156:
        r3 = 26;
        goto L_0x01ba;
    L_0x0159:
        r0 = "/api/identify/upload";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x0161:
        r3 = 17;
        goto L_0x01ba;
    L_0x0164:
        r0 = "/push/v1/PushSwitch/setPush";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x016c:
        r3 = 34;
        goto L_0x01ba;
    L_0x016f:
        r0 = "/x/feedback/add";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x0177:
        r3 = 22;
        goto L_0x01ba;
    L_0x017a:
        r0 = "/x/v2/reply/action";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x0182:
        r3 = 5;
        goto L_0x01ba;
    L_0x0184:
        r0 = "/xlive/app-room/v1/dM/sendmsg";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x018c:
        r3 = 7;
        goto L_0x01ba;
    L_0x018e:
        r0 = "/fans_medal/v1/fans_medal/wear_medal";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x0196:
        r3 = 8;
        goto L_0x01ba;
    L_0x0199:
        r0 = "/clip/v1/video/playNotify";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x01a1:
        r3 = 3;
        goto L_0x01ba;
    L_0x01a3:
        r0 = "/user/v2/TitleStuff/upgradeTitle";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x01ab:
        r3 = 23;
        goto L_0x01ba;
    L_0x01ae:
        r0 = "/activity/v1/lol/joinGuess";
        r3 = r3.equals(r0);
        if (r3 == 0) goto L_0x01b9;
    L_0x01b6:
        r3 = 36;
        goto L_0x01ba;
    L_0x01b9:
        r3 = -1;
    L_0x01ba:
        switch(r3) {
            case 0: goto L_0x01be;
            case 1: goto L_0x01be;
            case 2: goto L_0x01be;
            case 3: goto L_0x01be;
            case 4: goto L_0x01be;
            case 5: goto L_0x01be;
            case 6: goto L_0x01be;
            case 7: goto L_0x01be;
            case 8: goto L_0x01be;
            case 9: goto L_0x01be;
            case 10: goto L_0x01be;
            case 11: goto L_0x01be;
            case 12: goto L_0x01be;
            case 13: goto L_0x01be;
            case 14: goto L_0x01be;
            case 15: goto L_0x01be;
            case 16: goto L_0x01be;
            case 17: goto L_0x01be;
            case 18: goto L_0x01be;
            case 19: goto L_0x01be;
            case 20: goto L_0x01be;
            case 21: goto L_0x01be;
            case 22: goto L_0x01be;
            case 23: goto L_0x01be;
            case 24: goto L_0x01be;
            case 25: goto L_0x01be;
            case 26: goto L_0x01be;
            case 27: goto L_0x01be;
            case 28: goto L_0x01be;
            case 29: goto L_0x01be;
            case 30: goto L_0x01be;
            case 31: goto L_0x01be;
            case 32: goto L_0x01be;
            case 33: goto L_0x01be;
            case 34: goto L_0x01be;
            case 35: goto L_0x01be;
            case 36: goto L_0x01be;
            default: goto L_0x01bd;
        };
    L_0x01bd:
        return r2;
    L_0x01be:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.bililive.videoliveplayer.net.C6020c.m23832a(okhttp3.HttpUrl):boolean");
    }
}
