//package com.dvc.mybilibili.mvp.model.api.service.net.beans;
//
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
//////////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0011\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u00d6\u0001J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0010"}, d2 = {"com/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRecommendList.$serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/bilibili/bililive/videoliveplayer/net/beans/BiliLiveRecommendList;", "()V", "serialClassDesc", "Lkotlinx/serialization/KSerialClassDesc;", "getSerialClassDesc", "()Lkotlinx/serialization/KSerialClassDesc;", "load", "input", "Lkotlinx/serialization/KInput;", "save", "", "output", "Lkotlinx/serialization/KOutput;", "obj", "bililiveLiveVideoPlayer_release"}, k = 1, mv = {1, 1, 11})
///* compiled from: BL */
//public final class BiliLiveRecommendList$$serializer implements KSerializer<BiliLiveRecommendList> {
//    private static final /* synthetic */ KSerialClassDesc $$serialDesc;
//    public static final BiliLiveRecommendList$$serializer INSTANCE = new BiliLiveRecommendList$$serializer();
//
//    @NotNull
//    public KSerialClassDesc getSerialClassDesc() {
//        return $$serialDesc;
//    }
//
//    /* JADX WARNING: Missing block: B:6:0x0024, code skipped:
//            r6 = r11.readStringElementValue(r0, 0);
//            r3 = r3 | 1;
//     */
//    /* JADX WARNING: Missing block: B:7:0x002a, code skipped:
//            if (r4 == null) goto L_0x0013;
//     */
//    /* JADX WARNING: Missing block: B:20:0x0013, code skipped:
//            continue;
//     */
//    @org.jetbrains.annotations.NotNull
//    public com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRecommendList load(@org.jetbrains.annotations.NotNull kotlinx.serialization.KInput r11) {
//        /*
//        r10 = this;
//        r0 = "input";
//        kotlin.jvm.internal.//Intrinsics.checkParameterIsNotNull(r11, r0);
//        r0 = $$serialDesc;
//        r1 = 0;
//        r2 = new kotlinx.serialization.KSerializer[r1];
//        r11 = r11.readBegin(r0, r2);
//        r2 = 0;
//        r5 = r2;
//        r6 = r5;
//        r3 = 0;
//        r4 = 0;
//    L_0x0013:
//        r7 = r11.readElement(r0);
//        r8 = 1;
//        switch(r7) {
//            case -2: goto L_0x0023;
//            case -1: goto L_0x0048;
//            case 0: goto L_0x0024;
//            case 1: goto L_0x002c;
//            default: goto L_0x001b;
//        };
//    L_0x001b:
//        r11 = new kotlinx.serialization.UnknownFieldException;
//        r11.<init>(r7);
//        r11 = (java.lang.Throwable) r11;
//        throw r11;
//    L_0x0023:
//        r4 = 1;
//    L_0x0024:
//        r6 = r11.readStringElementValue(r0, r1);
//        r3 = r3 | 1;
//        if (r4 == 0) goto L_0x0013;
//    L_0x002c:
//        r7 = new kotlinx.serialization.internal.ArrayListSerializer;
//        r9 = com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRecommendList$RecommendItem$$serializer.INSTANCE;
//        r9 = (kotlinx.serialization.KSerializer) r9;
//        r7.<init>(r9);
//        r9 = r3 & 2;
//        if (r9 == 0) goto L_0x003e;
//    L_0x0039:
//        r5 = r11.updateSerializableElementValue(r0, r8, r7, r5);
//        goto L_0x0042;
//    L_0x003e:
//        r5 = r11.readSerializableElementValue(r0, r8, r7);
//    L_0x0042:
//        r5 = (java.util.ArrayList) r5;
//        r3 = r3 | 2;
//        if (r4 == 0) goto L_0x0013;
//    L_0x0048:
//        r11.readEnd(r0);
//        r11 = new com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRecommendList;
//        r11.<init>(r3, r6, r5, r2);
//        return r11;
//        */
//        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRecommendList$$serializer.load(kotlinx.serialization.KInput):com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRecommendList");
//    }
//
//    public void save(@NotNull KOutput kOutput, @NotNull BiliLiveRecommendList biliLiveRecommendList) {
//        //Intrinsics.checkParameterIsNotNull(kOutput, "output");
//        //Intrinsics.checkParameterIsNotNull(biliLiveRecommendList, "obj");
//        KSerialClassDesc kSerialClassDesc = $$serialDesc;
//        kOutput = kOutput.writeBegin(kSerialClassDesc, new KSerializer[0]);
//        biliLiveRecommendList.write$Self(kOutput, kSerialClassDesc);
//        kOutput.writeEnd(kSerialClassDesc);
//    }
//
//    static {
//        SerialClassDescImpl serialClassDescImpl = new SerialClassDescImpl("com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveRecommendList");
//        serialClassDescImpl.addElement("title");
//        serialClassDescImpl.addElement("list");
//        $$serialDesc = serialClassDescImpl;
//    }
//
//    private BiliLiveRecommendList$$serializer() {
//    }
//
//    @NotNull
//    public BiliLiveRecommendList update(@NotNull KInput kInput, @NotNull BiliLiveRecommendList biliLiveRecommendList) {
//        //Intrinsics.checkParameterIsNotNull(kInput, WidgetAction.COMPONENT_NAME_INPUT);
//        //Intrinsics.checkParameterIsNotNull(biliLiveRecommendList, "old");
//        return (BiliLiveRecommendList) DefaultImpls.update(this, kInput, biliLiveRecommendList);
//    }
//}
