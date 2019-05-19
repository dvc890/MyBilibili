package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.review;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

/* compiled from: BL */
public class ReviewIndex implements Parcelable {
    public static final Creator<ReviewIndex> CREATOR = new C18531();
    @JSONField(name = "guess_media")
    /* renamed from: a */
    public UnreviewedMedia f5676a;
    @JSONField(name = "banners")
    /* renamed from: b */
    public List<ReviewBanner> f5677b;
    @JSONField(name = "medias")
    /* renamed from: c */
    public List<IndexMedia> f5678c;
    @JSONField(name = "topics")
    /* renamed from: d */
    public List<ReviewEditorTopic> f5679d;
    @JSONField(name = "reviews")
    /* renamed from: e */
    public List<RecommendReview> f5680e;

    /* compiled from: BL */
    public static class IndexMedia implements Parcelable {
        public static final Creator<IndexMedia> CREATOR = new C18491();
        @JSONField(name = "media_id")
        /* renamed from: a */
        public int f5661a;
        @JSONField(name = "title")
        /* renamed from: b */
        public String f5662b;
        @JSONField(name = "cover")
        /* renamed from: c */
        public String f5663c;
        @JSONField(name = "score")
        /* renamed from: d */
        public float f5664d;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.review.ReviewIndex$IndexMedia$1 */
        static class C18491 implements Creator<IndexMedia> {
            C18491() {
            }

            /* renamed from: a */
            public IndexMedia createFromParcel(Parcel parcel) {
                return new IndexMedia(parcel);
            }

            /* renamed from: a */
            public IndexMedia[] newArray(int i) {
                return new IndexMedia[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f5661a);
            parcel.writeString(this.f5662b);
            parcel.writeString(this.f5663c);
            parcel.writeFloat(this.f5664d);
        }

        protected IndexMedia(Parcel parcel) {
            this.f5661a = parcel.readInt();
            this.f5662b = parcel.readString();
            this.f5663c = parcel.readString();
            this.f5664d = parcel.readFloat();
        }
    }

    /* compiled from: BL */
    public static class ReviewBanner implements Parcelable {
        public static final Creator<ReviewBanner> CREATOR = new C18501();
        @JSONField(name = "img")
        /* renamed from: a */
        public String f5665a;
        @JSONField(name = "link")
        /* renamed from: b */
        public String f5666b;
        @JSONField(name = "title")
        /* renamed from: c */
        public String f5667c;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.review.ReviewIndex$ReviewBanner$1 */
        static class C18501 implements Creator<ReviewBanner> {
            C18501() {
            }

            /* renamed from: a */
            public ReviewBanner createFromParcel(Parcel parcel) {
                return new ReviewBanner(parcel);
            }

            /* renamed from: a */
            public ReviewBanner[] newArray(int i) {
                return new ReviewBanner[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f5665a);
            parcel.writeString(this.f5666b);
            parcel.writeString(this.f5667c);
        }

        protected ReviewBanner(Parcel parcel) {
            this.f5665a = parcel.readString();
            this.f5666b = parcel.readString();
            this.f5667c = parcel.readString();
        }
    }

    /* compiled from: BL */
    public static class ReviewEditorTopic implements Parcelable {
        public static final Creator<ReviewEditorTopic> CREATOR = new C18511();
        @JSONField(name = "title")
        /* renamed from: a */
        public String f5668a;
        @JSONField(name = "cover")
        /* renamed from: b */
        public String f5669b;
        @JSONField(name = "link")
        /* renamed from: c */
        public String f5670c;
        @JSONField(name = "desc")
        /* renamed from: d */
        public String f5671d;
        @JSONField(name = "simg")
        /* renamed from: e */
        public String f5672e;
        @JSONField(name = "cursor")
        /* renamed from: f */
        public String f5673f;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.review.ReviewIndex$ReviewEditorTopic$1 */
        static class C18511 implements Creator<ReviewEditorTopic> {
            C18511() {
            }

            /* renamed from: a */
            public ReviewEditorTopic createFromParcel(Parcel parcel) {
                return new ReviewEditorTopic(parcel);
            }

            /* renamed from: a */
            public ReviewEditorTopic[] newArray(int i) {
                return new ReviewEditorTopic[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f5668a);
            parcel.writeString(this.f5669b);
            parcel.writeString(this.f5670c);
            parcel.writeString(this.f5671d);
            parcel.writeString(this.f5672e);
            parcel.writeString(this.f5673f);
        }

        protected ReviewEditorTopic(Parcel parcel) {
            this.f5668a = parcel.readString();
            this.f5669b = parcel.readString();
            this.f5670c = parcel.readString();
            this.f5671d = parcel.readString();
            this.f5672e = parcel.readString();
            this.f5673f = parcel.readString();
        }

        /* renamed from: a */
        public String mo7834a() {
            return TextUtils.isEmpty(this.f5672e) ? this.f5669b : this.f5672e;
        }
    }

    /* compiled from: BL */
    public static class UnreviewedMedia implements Parcelable {
        public static final Creator<UnreviewedMedia> CREATOR = new C18521();
        @JSONField(name = "tip")
        /* renamed from: a */
        public String f5674a;
        @JSONField(name = "medias")
        /* renamed from: b */
        public List<ReviewMediaBase> f5675b;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.review.ReviewIndex$UnreviewedMedia$1 */
        static class C18521 implements Creator<UnreviewedMedia> {
            C18521() {
            }

            /* renamed from: a */
            public UnreviewedMedia createFromParcel(Parcel parcel) {
                return new UnreviewedMedia(parcel);
            }

            /* renamed from: a */
            public UnreviewedMedia[] newArray(int i) {
                return new UnreviewedMedia[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f5674a);
            parcel.writeTypedList(this.f5675b);
        }

        protected UnreviewedMedia(Parcel parcel) {
            this.f5674a = parcel.readString();
            this.f5675b = parcel.createTypedArrayList(ReviewMediaBase.CREATOR);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.review.ReviewIndex$1 */
    static class C18531 implements Creator<ReviewIndex> {
        C18531() {
        }

        /* renamed from: a */
        public ReviewIndex createFromParcel(Parcel parcel) {
            return new ReviewIndex(parcel);
        }

        /* renamed from: a */
        public ReviewIndex[] newArray(int i) {
            return new ReviewIndex[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f5676a, i);
        parcel.writeTypedList(this.f5677b);
        parcel.writeTypedList(this.f5678c);
        parcel.writeTypedList(this.f5679d);
        parcel.writeTypedList(this.f5680e);
    }

    protected ReviewIndex(Parcel parcel) {
        this.f5676a = (UnreviewedMedia) parcel.readParcelable(UnreviewedMedia.class.getClassLoader());
        this.f5677b = parcel.createTypedArrayList(ReviewBanner.CREATOR);
        this.f5678c = parcel.createTypedArrayList(IndexMedia.CREATOR);
        this.f5679d = parcel.createTypedArrayList(ReviewEditorTopic.CREATOR);
        this.f5680e = parcel.createTypedArrayList(RecommendReview.CREATOR);
    }
}
