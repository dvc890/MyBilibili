package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.app.constants.TbsListener;
import com.dvc.mybilibili.app.utils.Intrinsics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;




@Keep
////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ\t\u0010'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\rH\u00c6\u0003Jc\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rH\u00c6\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00104\u001a\u00020\u0003H\u00d6\u0001J\t\u00105\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010\u0012\u00a8\u00066"}, d2 = {"Lcom/bilibili/bangumi/api/uniform/Relation;", "", "type", "", "typeName", "", "name", "pic", "title", "desc1", "desc2", "url", "itemId", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getDesc1", "()Ljava/lang/String;", "setDesc1", "(Ljava/lang/String;)V", "getDesc2", "setDesc2", "getItemId", "()J", "setItemId", "(J)V", "getName", "setName", "getPic", "setPic", "getTitle", "setTitle", "getType", "()I", "setType", "(I)V", "getTypeName", "setTypeName", "getUrl", "setUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class Relation {
    @NotNull
    private String desc1;
    @NotNull
    private String desc2;
    @JSONField(name = "item_id")
    private long itemId;
    @NotNull
    private String name;
    @NotNull
    private String pic;
    @NotNull
    private String title;
    private int type;
    @JSONField(name = "type_name")
    @NotNull
    private String typeName;
    @NotNull
    private String url;

    public Relation() {
        this(0, null, null, null, null, null, null, null, 0, TbsListener.ErrorCode.INFO_CODE_FILEREADER_OPENFILEREADER_MINIQBFAILED);
    }

    @NotNull
    public static /* synthetic */ Relation copy$default(Relation relation, int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, int i2, Object obj) {
        Relation relation2 = relation;
        int i3 = i2;
        return relation2.copy((i3 & 1) != 0 ? relation2.type : i, (i3 & 2) != 0 ? relation2.typeName : str, (i3 & 4) != 0 ? relation2.name : str2, (i3 & 8) != 0 ? relation2.pic : str3, (i3 & 16) != 0 ? relation2.title : str4, (i3 & 32) != 0 ? relation2.desc1 : str5, (i3 & 64) != 0 ? relation2.desc2 : str6, (i3 & 128) != 0 ? relation2.url : str7, (i3 & 256) != 0 ? relation2.itemId : j);
    }

    public final int component1() {
        return this.type;
    }

    @NotNull
    public final String component2() {
        return this.typeName;
    }

    @NotNull
    public final String component3() {
        return this.name;
    }

    @NotNull
    public final String component4() {
        return this.pic;
    }

    @NotNull
    public final String component5() {
        return this.title;
    }

    @NotNull
    public final String component6() {
        return this.desc1;
    }

    @NotNull
    public final String component7() {
        return this.desc2;
    }

    @NotNull
    public final String component8() {
        return this.url;
    }

    public final long component9() {
        return this.itemId;
    }

    @NotNull
    public final Relation copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, long j) {
        String str8 = str;
       //Intrinsics.checkParameterIsNotNull(str8, "typeName");
        String str9 = str2;
       //Intrinsics.checkParameterIsNotNull(str9, "name");
        String str10 = str3;
       //Intrinsics.checkParameterIsNotNull(str10, "pic");
        String str11 = str4;
       //Intrinsics.checkParameterIsNotNull(str11, "title");
        String str12 = str5;
       //Intrinsics.checkParameterIsNotNull(str12, "desc1");
        String str13 = str6;
       //Intrinsics.checkParameterIsNotNull(str13, "desc2");
        String str14 = str7;
       //Intrinsics.checkParameterIsNotNull(str14, "url");
        return new Relation(i, str8, str9, str10, str11, str12, str13, str14, j);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Relation) {
            Relation relation = (Relation) obj;
            if ((this.type == relation.type ? 1 : null) != null && Intrinsics.areEqual(this.typeName, relation.typeName) &&Intrinsics.areEqual(this.name, relation.name) &&Intrinsics.areEqual(this.pic, relation.pic) &&Intrinsics.areEqual(this.title, relation.title) &&Intrinsics.areEqual(this.desc1, relation.desc1) &&Intrinsics.areEqual(this.desc2, relation.desc2) &&Intrinsics.areEqual(this.url, relation.url)) {
                if ((this.itemId == relation.itemId ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.type * 31;
        String str = this.typeName;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.name;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.pic;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.title;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.desc1;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.desc2;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.url;
        if (str != null) {
            i2 = str.hashCode();
        }
        i = (i + i2) * 31;
        long j = this.itemId;
        return i + ((int) (j ^ (j >>> 32)));
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Relation(type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", typeName=");
        stringBuilder.append(this.typeName);
        stringBuilder.append(", name=");
        stringBuilder.append(this.name);
        stringBuilder.append(", pic=");
        stringBuilder.append(this.pic);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", desc1=");
        stringBuilder.append(this.desc1);
        stringBuilder.append(", desc2=");
        stringBuilder.append(this.desc2);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", itemId=");
        stringBuilder.append(this.itemId);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Relation(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, long j) {
       //Intrinsics.checkParameterIsNotNull(str, "typeName");
       //Intrinsics.checkParameterIsNotNull(str2, "name");
       //Intrinsics.checkParameterIsNotNull(str3, "pic");
       //Intrinsics.checkParameterIsNotNull(str4, "title");
       //Intrinsics.checkParameterIsNotNull(str5, "desc1");
       //Intrinsics.checkParameterIsNotNull(str6, "desc2");
       //Intrinsics.checkParameterIsNotNull(str7, "url");
        this.type = i;
        this.typeName = str;
        this.name = str2;
        this.pic = str3;
        this.title = str4;
        this.desc1 = str5;
        this.desc2 = str6;
        this.url = str7;
        this.itemId = j;
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public final String getTypeName() {
        return this.typeName;
    }

    public final void setTypeName(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.typeName = str;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final void setName(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.name = str;
    }

    @NotNull
    public final String getPic() {
        return this.pic;
    }

    public final void setPic(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.pic = str;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.title = str;
    }

    @NotNull
    public final String getDesc1() {
        return this.desc1;
    }

    public final void setDesc1(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.desc1 = str;
    }

    @NotNull
    public final String getDesc2() {
        return this.desc2;
    }

    public final void setDesc2(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.desc2 = str;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(@NotNull String str) {
       //Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.url = str;
    }

    public /* synthetic */ Relation(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? "" : str5, (i3 & 64) != 0 ? "" : str6, (i3 & 128) != 0 ? "" : str7, (i3 & 256) != 0 ? 0 : j);
    }

    public final long getItemId() {
        return this.itemId;
    }

    public final void setItemId(long j) {
        this.itemId = j;
    }
}
