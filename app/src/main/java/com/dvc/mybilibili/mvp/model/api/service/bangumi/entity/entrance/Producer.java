package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.entrance;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.app.utils.Intrinsics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;




@Keep
//////@Metadata(bv = {1, 0, 2}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J7\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000f\u00a8\u0006\u001e"}, d2 = {"Lcom/bilibili/bangumi/data/entrance/Producer;", "", "producerId", "", "mediaType", "logo", "isSelected", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "()Z", "setSelected", "(Z)V", "getLogo", "()Ljava/lang/String;", "setLogo", "(Ljava/lang/String;)V", "getMediaType", "setMediaType", "getProducerId", "setProducerId", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "bangumi_release"}, k = 1, mv = {1, 1, 11})
/* compiled from: BL */
public final class Producer {
    private boolean isSelected;
    @Nullable
    private String logo;
    @Nullable
    private String mediaType;
    @Nullable
    private String producerId;

    public Producer() {
        this(null, null, null, false, 15);
    }

    @NotNull
    public static /* synthetic */ Producer copy$default(Producer producer, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = producer.producerId;
        }
        if ((i & 2) != 0) {
            str2 = producer.mediaType;
        }
        if ((i & 4) != 0) {
            str3 = producer.logo;
        }
        if ((i & 8) != 0) {
            z = producer.isSelected;
        }
        return producer.copy(str, str2, str3, z);
    }

    @Nullable
    public final String component1() {
        return this.producerId;
    }

    @Nullable
    public final String component2() {
        return this.mediaType;
    }

    @Nullable
    public final String component3() {
        return this.logo;
    }

    public final boolean component4() {
        return this.isSelected;
    }

    @NotNull
    public final Producer copy(@JSONField(name = "producer_id") @Nullable String str, @JSONField(name = "media_type") @Nullable String str2, @Nullable String str3, @JSONField(deserialize = false, serialize = false) boolean z) {
        return new Producer(str, str2, str3, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Producer) {
            Producer producer = (Producer) obj;
            if (Intrinsics.areEqual(this.producerId, producer.producerId) && Intrinsics.areEqual(this.mediaType, producer.mediaType) &&Intrinsics.areEqual(this.logo, producer.logo)) {
                if ((this.isSelected == producer.isSelected ? 1 : null) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.producerId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.mediaType;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.logo;
        if (str2 != null) {
            i = str2.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.isSelected?1:0;
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Producer(producerId=");
        stringBuilder.append(this.producerId);
        stringBuilder.append(", mediaType=");
        stringBuilder.append(this.mediaType);
        stringBuilder.append(", logo=");
        stringBuilder.append(this.logo);
        stringBuilder.append(", isSelected=");
        stringBuilder.append(this.isSelected);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public Producer(@JSONField(name = "producer_id") @Nullable String str, @JSONField(name = "media_type") @Nullable String str2, @Nullable String str3, @JSONField(deserialize = false, serialize = false) boolean z) {
        this.producerId = str;
        this.mediaType = str2;
        this.logo = str3;
        this.isSelected = z;
    }

    public /* synthetic */ Producer(String str, String str2, String str3, boolean z, int i) {
        this(str, str2, str3, z);
    }

    @Nullable
    public final String getProducerId() {
        return this.producerId;
    }

    public final void setProducerId(@Nullable String str) {
        this.producerId = str;
    }

    @Nullable
    public final String getMediaType() {
        return this.mediaType;
    }

    public final void setMediaType(@Nullable String str) {
        this.mediaType = str;
    }

    @Nullable
    public final String getLogo() {
        return this.logo;
    }

    public final void setLogo(@Nullable String str) {
        this.logo = str;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }
}
