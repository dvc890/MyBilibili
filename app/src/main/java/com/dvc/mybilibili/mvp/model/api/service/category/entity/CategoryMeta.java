package com.dvc.mybilibili.mvp.model.api.service.category.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;
import java.util.List;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.category.CategoryMeta */
public class CategoryMeta implements Parcelable, Cloneable {
    public static final Creator<CategoryMeta> CREATOR = new C24181();
    public static final int TYPE_NORMAL = 0;
    public static final int TYPE_SPECIAL = 1;
    @Nullable
    @JSONField(name = "children")
    public List<CategoryMeta> mChildren;
    @Nullable
    @JSONField(name = "config")
    public List<CategorySense> mConfig;
    @Nullable
    @JSONField(name = "logo")
    public String mCoverUrl;
    @JSONField(name = "is_bangumi")
    public int mIsBangumi;
    @JSONField(name = "reid")
    public int mParentTid;
    @JSONField(name = "tid")
    public int mTid;
    @JSONField(name = "type")
    public int mType;
    @Nullable
    @JSONField(name = "name")
    public String mTypeName;
    @Nullable
    @JSONField(name = "uri")
    public String mUri;

    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.category.CategoryMeta$1 */
    static class C24181 implements Creator<CategoryMeta> {
        C24181() {
        }

        /* renamed from: a */
        public CategoryMeta createFromParcel(Parcel parcel) {
            return new CategoryMeta(parcel, null);
        }

        /* renamed from: a */
        public CategoryMeta[] newArray(int i) {
            return new CategoryMeta[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    /* synthetic */ CategoryMeta(Parcel parcel, C24181 c24181) {
        this(parcel);
    }

    public CategoryMeta() {
        this.mType = 0;
    }

    public CategoryMeta(int i, @Nullable String str, int i2) {
        this(i, str, i2, 0);
    }

    public CategoryMeta(int i, @Nullable String str, int i2, int i3) {
        this.mType = 0;
        this.mTid = i;
        this.mTypeName = str;
        this.mParentTid = i2;
        this.mType = i3;
    }

    private CategoryMeta(CategoryMeta categoryMeta) {
        this.mType = 0;
        this.mTid = categoryMeta.mTid;
        this.mParentTid = categoryMeta.mParentTid;
        this.mTypeName = categoryMeta.mTypeName;
        this.mCoverUrl = categoryMeta.mCoverUrl;
        this.mType = categoryMeta.mType;
        this.mUri = categoryMeta.mUri;
        this.mIsBangumi = categoryMeta.mIsBangumi;
        if (!(categoryMeta.mChildren == null || categoryMeta.mChildren.isEmpty())) {
            this.mChildren = new ArrayList(categoryMeta.mChildren);
        }
        if (categoryMeta.hasConfig()) {
            this.mConfig = new ArrayList(categoryMeta.mConfig);
        }
    }

    public void addChild(@NonNull CategoryMeta categoryMeta) {
        getChildren().add(categoryMeta);
    }

    public List<CategoryMeta> getChildren() {
        if (this.mChildren == null) {
            this.mChildren = new ArrayList(15);
        }
        return this.mChildren;
    }

    public boolean hasChild() {
        return (this.mChildren == null || this.mChildren.isEmpty()) ? false : true;
    }

    public boolean hasConfig() {
        return (this.mConfig == null || this.mConfig.isEmpty()) ? false : true;
    }

    public void remove(int... iArr) {
        if (iArr.length > 0 && this.mChildren != null && !this.mChildren.isEmpty()) {
            for (int child : iArr) {
                this.mChildren.remove(getChild(child));
            }
        }
    }

    @Nullable
    public CategoryMeta getChild(int i) {
        if (this.mTid == i) {
            return this;
        }
        if (!(this.mChildren == null || this.mChildren.isEmpty())) {
            for (CategoryMeta categoryMeta : this.mChildren) {
                if (categoryMeta.mTid == i) {
                    return categoryMeta;
                }
            }
        }
        return null;
    }

    public int size() {
        return (this.mChildren == null || this.mChildren.isEmpty()) ? 0 : this.mChildren.size();
    }

    public CategoryMeta clone() {
        return new CategoryMeta(this);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Category{");
        stringBuilder.append(this.mTid);
        stringBuilder.append(":");
        stringBuilder.append(this.mTypeName);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryMeta)) {
            return false;
        }
        if (this.mTid != ((CategoryMeta) obj).mTid) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.mTid;
    }

    private CategoryMeta(Parcel parcel) {
        this.mType = 0;
        this.mParentTid = parcel.readInt();
        this.mTid = parcel.readInt();
        this.mTypeName = parcel.readString();
        this.mChildren = parcel.createTypedArrayList(CREATOR);
        this.mCoverUrl = parcel.readString();
        this.mType = parcel.readInt();
        this.mUri = parcel.readString();
        this.mIsBangumi = parcel.readInt();
        this.mConfig = parcel.createTypedArrayList(CategorySense.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mParentTid);
        parcel.writeInt(this.mTid);
        parcel.writeString(this.mTypeName);
        parcel.writeTypedList(this.mChildren);
        parcel.writeString(this.mCoverUrl);
        parcel.writeInt(this.mType);
        parcel.writeString(this.mUri);
        parcel.writeInt(this.mIsBangumi);
        parcel.writeTypedList(this.mConfig);
    }
}
