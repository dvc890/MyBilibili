//package com.dvc.mybilibili.mvp.model.api.service.net.beans;
//
//import com.dvc.mybilibili.mvp.model.api.service.net.beans.BiliLiveRecommendList.RecommendItem;
//import com.bilibili.lib.fasthybrid.uimodule.bean.WidgetAction;
//
//import org.jetbrains.annotations.NotNull;
//
//
//
//import kotlinx.serialization.KInput;
//import kotlinx.serialization.KOutput;
//import kotlinx.serialization.KSerialClassDesc;
//import kotlinx.serialization.KSerializer;
//import kotlinx.serialization.KSerializer.DefaultImpls;
//import kotlinx.serialization.internal.SerialClassDescImpl;
//
//////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0011\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0010"}, d2 = {"com/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRecommendList.RecommendItem.$serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRecommendList$RecommendItem;", "()V", "serialClassDesc", "Lkotlinx/serialization/KSerialClassDesc;", "getSerialClassDesc", "()Lkotlinx/serialization/KSerialClassDesc;", "load", "input", "Lkotlinx/serialization/KInput;", "save", "", "output", "Lkotlinx/serialization/KOutput;", "obj", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
///* compiled from: BL */
//public final class BiliLiveRecommendList$RecommendItem$$serializer implements KSerializer<RecommendItem> {
//    private static final /* synthetic */ KSerialClassDesc $$serialDesc;
//    public static final BiliLiveRecommendList$RecommendItem$$serializer INSTANCE = new BiliLiveRecommendList$RecommendItem$$serializer();
//
//    @NotNull
//    public KSerialClassDesc getSerialClassDesc() {
//        return $$serialDesc;
//    }
//
//    /* JADX WARNING: Missing block: B:24:0x009a, code skipped:
//            r19 = r0.readIntElementValue(r1, r2);
//            r3 = r3 | 1;
//     */
//    /* JADX WARNING: Missing block: B:25:0x00a0, code skipped:
//            if (r22 == null) goto L_0x0171;
//     */
//    /* JADX WARNING: Missing block: B:26:0x00a2, code skipped:
//            r7 = r0.readStringElementValue(r1, 1);
//            r4 = 2;
//            r3 = r3 | 2;
//     */
//    /* JADX WARNING: Missing block: B:27:0x00a8, code skipped:
//            if (r22 == null) goto L_0x0171;
//     */
//    /* JADX WARNING: Missing block: B:28:0x00aa, code skipped:
//            r8 = r0.readStringElementValue(r1, r4);
//            r4 = 4;
//            r3 = r3 | 4;
//     */
//    /* JADX WARNING: Missing block: B:29:0x00b0, code skipped:
//            if (r22 == null) goto L_0x0171;
//     */
//    /* JADX WARNING: Missing block: B:30:0x00b2, code skipped:
//            r20 = r0.readIntElementValue(r1, 3);
//            r3 = r3 | 8;
//     */
//    /* JADX WARNING: Missing block: B:31:0x00ba, code skipped:
//            if (r22 == null) goto L_0x0171;
//     */
//    /* JADX WARNING: Missing block: B:32:0x00bc, code skipped:
//            r10 = r0.readStringElementValue(r1, r4);
//            r3 = r3 | 16;
//     */
//    /* JADX WARNING: Missing block: B:33:0x00c2, code skipped:
//            if (r22 == null) goto L_0x0171;
//     */
//    /* JADX WARNING: Missing block: B:35:0x00cc, code skipped:
//            if (r4 != null) goto L_0x00ce;
//     */
//    /* JADX WARNING: Missing block: B:37:0x00d5, code skipped:
//            if (r4 != null) goto L_0x00d7;
//     */
//    /* JADX WARNING: Missing block: B:38:0x00d7, code skipped:
//            r5 = r0.readIntElementValue(r1, 7);
//            r3 = r3 | 128;
//     */
//    /* JADX WARNING: Missing block: B:39:0x00de, code skipped:
//            if (r4 == null) goto L_0x016d;
//     */
//    /* JADX WARNING: Missing block: B:40:0x00e2, code skipped:
//            r15 = r0.readStringElementValue(r1, 8);
//            r3 = r3 | 256;
//     */
//    /* JADX WARNING: Missing block: B:41:0x00e8, code skipped:
//            if (r4 == null) goto L_0x016d;
//     */
//    /* JADX WARNING: Missing block: B:42:0x00ea, code skipped:
//            r6 = r0.readIntElementValue(r1, 9);
//            r3 = r3 | 512;
//     */
//    /* JADX WARNING: Missing block: B:43:0x00f2, code skipped:
//            if (r4 == null) goto L_0x016d;
//     */
//    /* JADX WARNING: Missing block: B:44:0x00f4, code skipped:
//            r16 = r0.readStringElementValue(r1, 10);
//            r3 = r3 | com.tencent.p170mm.opensdk.modelmsg.1024;
//     */
//    /* JADX WARNING: Missing block: B:45:0x00fc, code skipped:
//            if (r4 == null) goto L_0x016d;
//     */
//    /* JADX WARNING: Missing block: B:46:0x00fe, code skipped:
//            r17 = r0.readStringElementValue(r1, 11);
//            r3 = r3 | 2048;
//     */
//    /* JADX WARNING: Missing block: B:47:0x0106, code skipped:
//            if (r4 == null) goto L_0x016d;
//     */
//    /* JADX WARNING: Missing block: B:48:0x0108, code skipped:
//            r9 = r0.readIntElementValue(r1, 12);
//            r3 = r3 | 4096;
//     */
//    /* JADX WARNING: Missing block: B:49:0x0110, code skipped:
//            if (r4 == null) goto L_0x016d;
//     */
//    /* JADX WARNING: Missing block: B:50:0x0112, code skipped:
//            r24 = r5;
//            r2 = new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.IntSerializer.INSTANCE);
//     */
//    /* JADX WARNING: Missing block: B:51:0x0121, code skipped:
//            if ((r3 & 8192) == 0) goto L_0x012e;
//     */
//    /* JADX WARNING: Missing block: B:52:0x0123, code skipped:
//            r25 = r6;
//            r2 = r0.updateSerializableElementValue(r1, 13, r2, r18);
//     */
//    /* JADX WARNING: Missing block: B:53:0x012e, code skipped:
//            r25 = r6;
//            r2 = r0.readSerializableElementValue(r1, 13, r2);
//     */
//    /* JADX WARNING: Missing block: B:54:0x0136, code skipped:
//            r18 = (java.util.ArrayList) r2;
//            r3 = r3 | 8192;
//     */
//    /* JADX WARNING: Missing block: B:55:0x013c, code skipped:
//            if (r4 == null) goto L_0x0167;
//     */
//    /* JADX WARNING: Missing block: B:56:0x013e, code skipped:
//            r5 = r24;
//            r6 = r25;
//     */
//    /* JADX WARNING: Missing block: B:57:0x0142, code skipped:
//            r11 = r0.readIntElementValue(r1, 14);
//            r3 = r3 | 16384;
//     */
//    /* JADX WARNING: Missing block: B:58:0x014a, code skipped:
//            if (r4 == null) goto L_0x0028;
//     */
//    /* JADX WARNING: Missing block: B:59:0x014c, code skipped:
//            r13 = r0.readIntElementValue(r1, 15);
//            r3 = r3 | com.tencent.p170mm.opensdk.modelmsg.32768;
//     */
//    /* JADX WARNING: Missing block: B:60:0x0156, code skipped:
//            if (r4 == null) goto L_0x0028;
//     */
//    /* JADX WARNING: Missing block: B:63:0x0167, code skipped:
//            r5 = r24;
//            r6 = r25;
//     */
//    /* JADX WARNING: Missing block: B:64:0x016d, code skipped:
//            r2 = r6;
//            r6 = r18;
//     */
//    /* JADX WARNING: Missing block: B:65:0x0171, code skipped:
//            r2 = r6;
//            r6 = r18;
//            r4 = r22;
//     */
//    /* JADX WARNING: Missing block: B:66:0x0176, code skipped:
//            r6 = r2;
//     */
//    /* JADX WARNING: Missing block: B:71:0x0028, code skipped:
//            continue;
//     */
//    @org.jetbrains.annotations.NotNull
//    public com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRecommendList.RecommendItem load(@org.jetbrains.annotations.NotNull kotlinx.serialization.KInput r43) {
//        /*
//        r42 = this;
//        r0 = r43;
//        r1 = "input";
//        kotlin.jvm.internal.//Intrinsics.checkParameterIsNotNull(r0, r1);
//        r1 = $$serialDesc;
//        r2 = 0;
//        r3 = new kotlinx.serialization.KSerializer[r2];
//        r0 = r0.readBegin(r1, r3);
//        r3 = 0;
//        r7 = r3;
//        r8 = r7;
//        r10 = r8;
//        r12 = r10;
//        r14 = r12;
//        r15 = r14;
//        r16 = r15;
//        r17 = r16;
//        r18 = r17;
//        r3 = 0;
//        r4 = 0;
//        r5 = 0;
//        r6 = 0;
//        r9 = 0;
//        r11 = 0;
//        r13 = 0;
//        r19 = 0;
//        r20 = 0;
//    L_0x0028:
//        r2 = r0.readElement(r1);
//        r22 = r4;
//        r4 = 1;
//        switch(r2) {
//            case -2: goto L_0x0097;
//            case -1: goto L_0x0073;
//            case 0: goto L_0x0071;
//            case 1: goto L_0x006f;
//            case 2: goto L_0x006c;
//            case 3: goto L_0x006a;
//            case 4: goto L_0x0068;
//            case 5: goto L_0x0064;
//            case 6: goto L_0x0060;
//            case 7: goto L_0x005c;
//            case 8: goto L_0x0056;
//            case 9: goto L_0x0052;
//            case 10: goto L_0x004e;
//            case 11: goto L_0x004a;
//            case 12: goto L_0x0046;
//            case 13: goto L_0x0042;
//            case 14: goto L_0x003e;
//            case 15: goto L_0x003a;
//            default: goto L_0x0032;
//        };
//    L_0x0032:
//        r0 = new kotlinx.serialization.UnknownFieldException;
//        r0.<init>(r2);
//        r0 = (java.lang.Throwable) r0;
//        throw r0;
//    L_0x003a:
//        r4 = r22;
//        goto L_0x014c;
//    L_0x003e:
//        r4 = r22;
//        goto L_0x0142;
//    L_0x0042:
//        r4 = r22;
//        goto L_0x0112;
//    L_0x0046:
//        r4 = r22;
//        goto L_0x0108;
//    L_0x004a:
//        r4 = r22;
//        goto L_0x00fe;
//    L_0x004e:
//        r4 = r22;
//        goto L_0x00f4;
//    L_0x0052:
//        r4 = r22;
//        goto L_0x00ea;
//    L_0x0056:
//        r4 = r22;
//    L_0x0058:
//        r2 = 8;
//        goto L_0x00e2;
//    L_0x005c:
//        r4 = r22;
//        goto L_0x00d7;
//    L_0x0060:
//        r4 = r22;
//        goto L_0x00ce;
//    L_0x0064:
//        r4 = r22;
//        goto L_0x00c5;
//    L_0x0068:
//        r4 = 4;
//        goto L_0x00bc;
//    L_0x006a:
//        r4 = 4;
//        goto L_0x00b2;
//    L_0x006c:
//        r2 = 0;
//        r4 = 2;
//        goto L_0x00aa;
//    L_0x006f:
//        r2 = 0;
//        goto L_0x00a2;
//    L_0x0071:
//        r2 = 0;
//        goto L_0x009a;
//    L_0x0073:
//        r24 = r3;
//        r32 = r5;
//        r34 = r6;
//        r26 = r7;
//        r27 = r8;
//        r37 = r9;
//        r29 = r10;
//        r39 = r11;
//        r30 = r12;
//        r40 = r13;
//        r31 = r14;
//        r33 = r15;
//        r35 = r16;
//        r36 = r17;
//        r38 = r18;
//        r25 = r19;
//        r28 = r20;
//        goto L_0x015a;
//    L_0x0097:
//        r2 = 0;
//        r22 = 1;
//    L_0x009a:
//        r19 = r0.readIntElementValue(r1, r2);
//        r3 = r3 | 1;
//        if (r22 == 0) goto L_0x0171;
//    L_0x00a2:
//        r7 = r0.readStringElementValue(r1, r4);
//        r4 = 2;
//        r3 = r3 | r4;
//        if (r22 == 0) goto L_0x0171;
//    L_0x00aa:
//        r8 = r0.readStringElementValue(r1, r4);
//        r4 = 4;
//        r3 = r3 | r4;
//        if (r22 == 0) goto L_0x0171;
//    L_0x00b2:
//        r2 = 3;
//        r20 = r0.readIntElementValue(r1, r2);
//        r2 = 8;
//        r3 = r3 | r2;
//        if (r22 == 0) goto L_0x0171;
//    L_0x00bc:
//        r10 = r0.readStringElementValue(r1, r4);
//        r3 = r3 | 16;
//        if (r22 == 0) goto L_0x0171;
//    L_0x00c4:
//        goto L_0x0064;
//    L_0x00c5:
//        r2 = 5;
//        r12 = r0.readStringElementValue(r1, r2);
//        r3 = r3 | 32;
//        if (r4 == 0) goto L_0x016d;
//    L_0x00ce:
//        r2 = 6;
//        r14 = r0.readStringElementValue(r1, r2);
//        r3 = r3 | 64;
//        if (r4 == 0) goto L_0x016d;
//    L_0x00d7:
//        r2 = 7;
//        r5 = r0.readIntElementValue(r1, r2);
//        r3 = r3 | 128;
//        if (r4 == 0) goto L_0x016d;
//    L_0x00e0:
//        goto L_0x0058;
//    L_0x00e2:
//        r15 = r0.readStringElementValue(r1, r2);
//        r3 = r3 | 256;
//        if (r4 == 0) goto L_0x016d;
//    L_0x00ea:
//        r2 = 9;
//        r6 = r0.readIntElementValue(r1, r2);
//        r3 = r3 | 512;
//        if (r4 == 0) goto L_0x016d;
//    L_0x00f4:
//        r2 = 10;
//        r16 = r0.readStringElementValue(r1, r2);
//        r3 = r3 | 1024;
//        if (r4 == 0) goto L_0x016d;
//    L_0x00fe:
//        r2 = 11;
//        r17 = r0.readStringElementValue(r1, r2);
//        r3 = r3 | 2048;
//        if (r4 == 0) goto L_0x016d;
//    L_0x0108:
//        r2 = 12;
//        r9 = r0.readIntElementValue(r1, r2);
//        r3 = r3 | 4096;
//        if (r4 == 0) goto L_0x016d;
//    L_0x0112:
//        r2 = new kotlinx.serialization.internal.ArrayListSerializer;
//        r21 = kotlinx.serialization.internal.IntSerializer.INSTANCE;
//        r24 = r5;
//        r5 = r21;
//        r5 = (kotlinx.serialization.KSerializer) r5;
//        r2.<init>(r5);
//        r5 = r3 & 8192;
//        if (r5 == 0) goto L_0x012e;
//    L_0x0123:
//        r25 = r6;
//        r6 = r18;
//        r5 = 13;
//        r2 = r0.updateSerializableElementValue(r1, r5, r2, r6);
//        goto L_0x0136;
//    L_0x012e:
//        r25 = r6;
//        r5 = 13;
//        r2 = r0.readSerializableElementValue(r1, r5, r2);
//    L_0x0136:
//        r18 = r2;
//        r18 = (java.util.ArrayList) r18;
//        r3 = r3 | 8192;
//        if (r4 == 0) goto L_0x0167;
//    L_0x013e:
//        r5 = r24;
//        r6 = r25;
//    L_0x0142:
//        r2 = 14;
//        r11 = r0.readIntElementValue(r1, r2);
//        r3 = r3 | 16384;
//        if (r4 == 0) goto L_0x0028;
//    L_0x014c:
//        r2 = 15;
//        r13 = r0.readIntElementValue(r1, r2);
//        r2 = 32768; // 0x8000 float:4.5918E-41 double:1.61895E-319;
//        r3 = r3 | r2;
//        if (r4 == 0) goto L_0x0028;
//    L_0x0158:
//        goto L_0x0073;
//    L_0x015a:
//        r0.readEnd(r1);
//        r0 = new com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRecommendList$RecommendItem;
//        r41 = 0;
//        r23 = r0;
//        r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41);
//        return r0;
//    L_0x0167:
//        r5 = r24;
//        r6 = r25;
//        goto L_0x0028;
//    L_0x016d:
//        r2 = r6;
//        r6 = r18;
//        goto L_0x0176;
//    L_0x0171:
//        r2 = r6;
//        r6 = r18;
//        r4 = r22;
//    L_0x0176:
//        r6 = r2;
//        goto L_0x0028;
//        */
//        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRecommendList$RecommendItem$$serializer.load(kotlinx.serialization.KInput):com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRecommendList$RecommendItem");
//    }
//
//    public void save(@NotNull KOutput kOutput, @NotNull RecommendItem recommendItem) {
//        //Intrinsics.checkParameterIsNotNull(kOutput, "output");
//        //Intrinsics.checkParameterIsNotNull(recommendItem, "obj");
//        KSerialClassDesc kSerialClassDesc = $$serialDesc;
//        kOutput = kOutput.writeBegin(kSerialClassDesc, new KSerializer[0]);
//        recommendItem.write$Self(kOutput, kSerialClassDesc);
//        kOutput.writeEnd(kSerialClassDesc);
//    }
//
//    static {
//        SerialClassDescImpl serialClassDescImpl = new SerialClassDescImpl("com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRecommendList.RecommendItem");
//        serialClassDescImpl.addElement("roomid");
//        serialClassDescImpl.addElement("title");
//        serialClassDescImpl.addElement("uname");
//        serialClassDescImpl.addElement("online");
//        serialClassDescImpl.addElement("cover");
//        serialClassDescImpl.addElement("link");
//        serialClassDescImpl.addElement("face");
//        serialClassDescImpl.addElement("area_v2_parent_id");
//        serialClassDescImpl.addElement("area_v2_parent_name");
//        serialClassDescImpl.addElement("area_v2_id");
//        serialClassDescImpl.addElement("area_v2_name");
//        serialClassDescImpl.addElement("play_url");
//        serialClassDescImpl.addElement("current_quality");
//        serialClassDescImpl.addElement("accept_quality");
//        serialClassDescImpl.addElement("broadcast_type");
//        serialClassDescImpl.addElement("is_focus");
//        $$serialDesc = serialClassDescImpl;
//    }
//
//    private BiliLiveRecommendList$RecommendItem$$serializer() {
//    }
//
//    @NotNull
//    public RecommendItem update(@NotNull KInput kInput, @NotNull RecommendItem recommendItem) {
//        //Intrinsics.checkParameterIsNotNull(kInput, WidgetAction.COMPONENT_NAME_INPUT);
//        //Intrinsics.checkParameterIsNotNull(recommendItem, "old");
//        return (RecommendItem) DefaultImpls.update(this, kInput, recommendItem);
//    }
//}
