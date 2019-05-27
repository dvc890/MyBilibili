package com.dvc.mybilibili.mvp.model.api.service.video.entity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.VipExtraUserInfo;
import com.dvc.mybilibili.mvp.model.api.service.charge.entity.ChargeRankResult;

import java.util.ArrayList;
import java.util.List;

@Keep
/* compiled from: BL */
/* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail */
public class BiliVideoDetail implements Parcelable {
    public static final Creator<BiliVideoDetail> CREATOR = new C24731();
    @JSONField(name = "ad_cb")
    public String adCb;
    @JSONField(name = "ad_index")
    public long adIndex;
    public Audio audio;
    @JSONField(name = "card_index")
    public long cardIndex = -1;
    @JSONField(name = "client_ip")
    public String clientIp;
    @JSONField(name = "cm_config")
    public JSONObject cmConfig;
    @JSONField(name = "cm_mark")
    public long cmMark;
    @JSONField(name = "cms")
    public JSONArray cms;
    @JSONField(name = "creative_id")
    public long creativeId;
    @JSONField(name = "creative_type")
    public long creativeType;
    @Nullable
    @JSONField(name = "dislike_reasons_v2")
    public DislikeReasonV2 dislikeReasonV2;
    @Nullable
    @JSONField(name = "dislike_reasons")
    public List<DislikeReason> dislikeReasons;
    @JSONField(name = "extra")
    public JSONObject extra;
    @JSONField(name = "id")
    /* renamed from: id */
    public long f6658id;
    @JSONField(name = "is_ad")
    public boolean isAd;
    @JSONField(name = "is_ad_loc")
    public boolean isAdLoc;
    @JSONField(name = "mission_id")
    public int mActivityId;
    @JSONField(name = "copyright")
    public int mArcType;
    @JSONField(name = "argue_msg")
    public String mArgueMsg;
    @JSONField(name = "aid")
    public int mAvid;
    @JSONField(name = "badge")
    public String mBadge;
    @JSONField(name = "season")
    public BangumiInfo mBangumiInfo;
    @JSONField(name = "bgm")
    public List<Bgm> mBgms;
    @JSONField(name = "button")
    public Button mButton;
    @JSONField(name = "play_param")
    public int mCanShowRelatedVideoAutoNext;
    @JSONField(name = "elec")
    public ChargeRankResult mChargeResult;
    @JSONField(name = "contributions")
    public List<Contribute> mContributions;
    @JSONField(name = "pic")
    public String mCover;
    @JSONField(name = "pubdate")
    public long mCreatedTimestamp;
    @JSONField(name = "desc")
    public String mDescription;
    @JSONField(name = "downloadable_detail")
    public String mDownloadableInfo;
    @JSONField(name = "duration")
    public int mDuration;
    @JSONField(name = "from")
    public String mFrom;
    @JSONField(name = "goto")
    public String mGoTo;
    @JSONField(name = "history")
    public History mHistory;
    @JSONField(name = "jump_aid")
    public int mJumpAid;
    @Nullable
    @JSONField(name = "label")
    public Label mLabel;
    @JSONField(name = "owner")
    public Owner mOwner;
    @JSONField(name = "pages")
    public List<Page> mPageList;
    @JSONField(name = "param")
    public String mParam;
    @JSONField(name = "rating")
    public float mRating;
    @JSONField(name = "rating_count")
    public int mRatingCount;
    @JSONField(name = "rcmd_reason")
    public String mRcmdReason;
    @JSONField(name = "relates")
    public List<BiliVideoDetail> mRelatedList;
    @JSONField(name = "req_user")
    public RequestUser mRequestUser;
    @JSONField(name = "reserve")
    public String mReserve;
    @JSONField(name = "rights")
    public Rights mRights;
    @JSONField(name = "short_link")
    public String mShortLink;
    @JSONField(name = "stat")
    public Stat mStat;
    @JSONField(name = "tag")
    public List<Tag> mTags;
    @JSONField(name = "tid")
    public int mTid;
    @JSONField(name = "title")
    public String mTitle;
    @JSONField(name = "tname")
    public String mTypeName;
    @JSONField(name = "uri")
    public String mUri;
    @JSONField(name = "view_at")
    public long mViewAt;
    @JSONField(name = "owner_ext")
    public OwnerExt ownerExt;
    @JSONField(name = "player_icon")
    public VideoPlayerIcon playerIcon;
    @JSONField(name = "request_id")
    public String requestId;
    @JSONField(name = "resource_id")
    public long resourceId;
    @JSONField(name = "season_type")
    public int seasonType;
    @JSONField(name = "server_type")
    public long serverType = -1;
    @JSONField(name = "src_id")
    public long srcId;
    @JSONField(name = "staff")
    public List<Staff> staffs;
    @JSONField(name = "asset")
    public UgcPayInfo ugcPayInfo;
    @JSONField(name = "vip_active")
    public String vipActive;

    public BiliVideoDetail() {

    }

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$Audio */
    public static class Audio implements Parcelable {
        public static final Creator<Audio> CREATOR = new C24511();
        @JSONField(name = "cover_url")
        public String cover;
        @JSONField(name = "entrance")
        public String entranceName;
        @JSONField(name = "play_count")
        public int play;
        @JSONField(name = "reply_count")
        public int reply;
        @JSONField(name = "song_attr")
        public int songAttr;
        @JSONField(name = "song_id")
        public int songId;
        @JSONField(name = "title")
        public String title;
        @JSONField(name = "upper_id")
        public int upperId;

        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$Audio$1 */
        static class C24511 implements Creator<Audio> {
            C24511() {
            }

            /* renamed from: a */
            public Audio createFromParcel(Parcel parcel) {
                return new Audio(parcel);
            }

            /* renamed from: a */
            public Audio[] newArray(int i) {
                return new Audio[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            parcel.writeString(this.cover);
            parcel.writeInt(this.songId);
            parcel.writeInt(this.play);
            parcel.writeInt(this.reply);
            parcel.writeInt(this.songAttr);
            parcel.writeString(this.entranceName);
            parcel.writeInt(this.upperId);
        }

        protected Audio(Parcel parcel) {
            this.title = parcel.readString();
            this.cover = parcel.readString();
            this.songId = parcel.readInt();
            this.play = parcel.readInt();
            this.reply = parcel.readInt();
            this.songAttr = parcel.readInt();
            this.entranceName = parcel.readString();
            this.upperId = parcel.readInt();
        }
    }

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$BangumiInfo */
    public static class BangumiInfo implements Parcelable {
        public static final Creator<BangumiInfo> CREATOR = new C24521();
        @JSONField(name = "is_jump")
        public int isJump;
        @JSONField(name = "cover")
        public String mCover;
        @JSONField(name = "is_finish")
        public int mIsFinish;
        @JSONField(name = "season_id")
        public String mSeasonId;
        @JSONField(name = "title")
        public String mTitle;
        @JSONField(name = "total_count")
        public String mTotalCount;
        @JSONField(name = "weekday")
        public int mWeekday;

        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$BangumiInfo$1 */
        static class C24521 implements Creator<BangumiInfo> {
            C24521() {
            }

            /* renamed from: a */
            public BangumiInfo createFromParcel(Parcel parcel) {
                return new BangumiInfo(parcel);
            }

            /* renamed from: a */
            public BangumiInfo[] newArray(int i) {
                return new BangumiInfo[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mSeasonId);
            parcel.writeString(this.mTitle);
        }

        protected BangumiInfo(Parcel parcel) {
            this.mSeasonId = parcel.readString();
            this.mTitle = parcel.readString();
        }

        public boolean isFinish() {
            return this.mIsFinish == 1;
        }
    }

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$Bgm */
    public static class Bgm implements Parcelable {
        public static final Creator<Bgm> CREATOR = new C24531();
        @JSONField(name = "author")
        public String author;
        @JSONField(name = "jump_url")
        public String jumpUrl;
        @JSONField(name = "sid")
        public int sid;
        @JSONField(name = "title")
        public String title;

        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$Bgm$1 */
        static class C24531 implements Creator<Bgm> {
            C24531() {
            }

            /* renamed from: a */
            public Bgm createFromParcel(Parcel parcel) {
                return new Bgm(parcel);
            }

            /* renamed from: a */
            public Bgm[] newArray(int i) {
                return new Bgm[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.sid);
            parcel.writeString(this.title);
            parcel.writeString(this.author);
            parcel.writeString(this.jumpUrl);
        }

        public Bgm(Parcel parcel) {
            this.sid = parcel.readInt();
            this.title = parcel.readString();
            this.author = parcel.readString();
            this.jumpUrl = parcel.readString();
        }
    }

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$Button */
    public static class Button implements Parcelable {
        public static final Creator<Button> CREATOR = new C24541();
        @JSONField(name = "title")
        public String title;
        @JSONField(name = "uri")
        public String uri;

        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$Button$1 */
        static class C24541 implements Creator<Button> {
            C24541() {
            }

            /* renamed from: a */
            public Button createFromParcel(Parcel parcel) {
                return new Button(parcel);
            }

            /* renamed from: a */
            public Button[] newArray(int i) {
                return new Button[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected Button(Parcel parcel) {
            this.title = parcel.readString();
            this.uri = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            parcel.writeString(this.uri);
        }
    }

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$Contribute */
    public static class Contribute implements Parcelable {
        public static final Creator<Contribute> CREATOR = new C24551();
        @JSONField(name = "aid")
        public long aid;
        @JSONField(name = "pic")
        public String cover;
        @JSONField(name = "ctime")
        public long ctime;
        @JSONField(name = "title")
        public String title;

        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$Contribute$1 */
        static class C24551 implements Creator<Contribute> {
            C24551() {
            }

            /* renamed from: a */
            public Contribute createFromParcel(Parcel parcel) {
                return new Contribute(parcel);
            }

            /* renamed from: a */
            public Contribute[] newArray(int i) {
                return new Contribute[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.aid);
            parcel.writeString(this.cover);
            parcel.writeString(this.title);
            parcel.writeLong(this.ctime);
        }

        protected Contribute(Parcel parcel) {
            this.aid = parcel.readLong();
            this.cover = parcel.readString();
            this.title = parcel.readString();
            this.ctime = parcel.readLong();
        }
    }

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$DM */
    public static class C2456DM implements Parcelable {
        public static final Creator<C2456DM> CREATOR = new C24571();
        @JSONField(name = "closed")
        public boolean closed;
        @JSONField(name = "real_name")
        public boolean realName;

        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$DM$1 */
        static class C24571 implements Creator<C2456DM> {
            C24571() {
            }

            /* renamed from: a */
            public C2456DM createFromParcel(Parcel parcel) {
                return new C2456DM(parcel);
            }

            /* renamed from: a */
            public C2456DM[] newArray(int i) {
                return new C2456DM[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte((byte) (this.closed?1:0));
            parcel.writeByte((byte) (this.realName?1:0));
        }

        protected C2456DM(Parcel parcel) {
            boolean z = false;
            this.closed = parcel.readByte() != (byte) 0;
            if (parcel.readByte() != (byte) 0) {
                z = true;
            }
            this.realName = z;
        }
    }

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$Dimension */
    public static class Dimension implements Parcelable {
        public static final Creator<Dimension> CREATOR = new C24581();
        @JSONField(name = "height")
        public int height;
        @JSONField(name = "rotate")
        public int rotate;
        @JSONField(name = "width")
        public int width;

        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$Dimension$1 */
        static class C24581 implements Creator<Dimension> {
            C24581() {
            }

            /* renamed from: a */
            public Dimension createFromParcel(Parcel parcel) {
                return new Dimension(parcel);
            }

            /* renamed from: a */
            public Dimension[] newArray(int i) {
                return new Dimension[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public Dimension(Parcel parcel) {
            this.width = parcel.readInt();
            this.height = parcel.readInt();
            this.rotate = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.width);
            parcel.writeInt(this.height);
            parcel.writeInt(this.rotate);
        }
    }

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$DislikeReason */
    public static class DislikeReason implements Parcelable {
        public static final Creator<DislikeReason> CREATOR = new C24591();
        @JSONField(name = "reason_id")
        /* renamed from: id */
        public int f6651id;
        @JSONField(name = "reason_name")
        public String name;

        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$DislikeReason$1 */
        static class C24591 implements Creator<DislikeReason> {
            C24591() {
            }

            /* renamed from: a */
            public DislikeReason createFromParcel(Parcel parcel) {
                return new DislikeReason(parcel);
            }

            /* renamed from: a */
            public DislikeReason[] newArray(int i) {
                return new DislikeReason[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f6651id);
            parcel.writeString(this.name);
        }

        protected DislikeReason(Parcel parcel) {
            this.f6651id = parcel.readInt();
            this.name = parcel.readString();
        }
    }

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$DislikeReasonV2 */
    public static class DislikeReasonV2 implements Parcelable {
        public static final Creator<DislikeReasonV2> CREATOR = new C24611();
        @Nullable
        @JSONField(name = "reasons")
        public List<ReasonItem> reasons;
        @Nullable
        @JSONField(name = "subtitle")
        public String subtitle;
        @Nullable
        @JSONField(name = "title")
        public String title;

        @Keep
        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$DislikeReasonV2$ReasonItem */
        public static class ReasonItem implements Parcelable {
            public static final Creator<ReasonItem> CREATOR = new C24601();
            @JSONField(name = "id")
            /* renamed from: id */
            public int f6652id;
            @JSONField(name = "mid")
            public int mid;
            @Nullable
            @JSONField(name = "name")
            public String name;
            @JSONField(name = "rid")
            public int rid;
            @JSONField(name = "tag_id")
            public int tagTd;

            /* compiled from: BL */
            /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$DislikeReasonV2$ReasonItem$1 */
            static class C24601 implements Creator<ReasonItem> {
                C24601() {
                }

                /* renamed from: a */
                public ReasonItem createFromParcel(Parcel parcel) {
                    return new ReasonItem(parcel);
                }

                /* renamed from: a */
                public ReasonItem[] newArray(int i) {
                    return new ReasonItem[i];
                }
            }

            public int describeContents() {
                return 0;
            }

            protected ReasonItem(Parcel parcel) {
                this.f6652id = parcel.readInt();
                this.mid = parcel.readInt();
                this.rid = parcel.readInt();
                this.tagTd = parcel.readInt();
                this.name = parcel.readString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f6652id);
                parcel.writeInt(this.mid);
                parcel.writeInt(this.rid);
                parcel.writeInt(this.tagTd);
                parcel.writeString(this.name);
            }
        }

        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$DislikeReasonV2$1 */
        static class C24611 implements Creator<DislikeReasonV2> {
            C24611() {
            }

            /* renamed from: a */
            public DislikeReasonV2 createFromParcel(Parcel parcel) {
                return new DislikeReasonV2(parcel);
            }

            /* renamed from: a */
            public DislikeReasonV2[] newArray(int i) {
                return new DislikeReasonV2[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected DislikeReasonV2(Parcel parcel) {
            this.title = parcel.readString();
            this.subtitle = parcel.readString();
            this.reasons = parcel.createTypedArrayList(ReasonItem.CREATOR);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeTypedList(this.reasons);
        }
    }

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$History */
    public static class History implements Parcelable {
        public static final Creator<History> CREATOR = new C24621();
        @JSONField(name = "cid")
        public long cid;
        @JSONField(name = "progress")
        public long progress;

        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$History$1 */
        static class C24621 implements Creator<History> {
            C24621() {
            }

            /* renamed from: a */
            public History createFromParcel(Parcel parcel) {
                return new History(parcel);
            }

            /* renamed from: a */
            public History[] newArray(int i) {
                return new History[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.cid);
            parcel.writeLong(this.progress);
        }

        protected History(Parcel parcel) {
            this.cid = parcel.readLong();
            this.progress = parcel.readLong();
        }
    }

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$Label */
    public static class Label implements Parcelable {
        public static final Creator<Label> CREATOR = new C24631();
        @JSONField(name = "type")
        public int type;
        @Nullable
        @JSONField(name = "uri")
        public String uri;

        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$Label$1 */
        static class C24631 implements Creator<Label> {
            C24631() {
            }

            /* renamed from: a */
            public Label createFromParcel(Parcel parcel) {
                return new Label(parcel);
            }

            /* renamed from: a */
            public Label[] newArray(int i) {
                return new Label[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected Label(Parcel parcel) {
            this.type = parcel.readInt();
            this.uri = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.type);
            parcel.writeString(this.uri);
        }
    }

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$OfficialVerify */
    public static class OfficialVerify implements Parcelable {
        public static final Creator<OfficialVerify> CREATOR = new C24641();
        @JSONField(name = "desc")
        public String desc;
        @JSONField(name = "type")
        public String type;

        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$OfficialVerify$1 */
        static class C24641 implements Creator<OfficialVerify> {
            C24641() {
            }

            /* renamed from: a */
            public OfficialVerify createFromParcel(Parcel parcel) {
                return new OfficialVerify(parcel);
            }

            /* renamed from: a */
            public OfficialVerify[] newArray(int i) {
                return new OfficialVerify[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected OfficialVerify(Parcel parcel) {
            this.type = parcel.readString();
            this.desc = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.type);
            parcel.writeString(this.desc);
        }
    }

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$Owner */
    public static class Owner implements Parcelable {
        public static final Creator<Owner> CREATOR = new C24651();
        @JSONField(name = "face")
        public String face;
        @JSONField(name = "mid")
        public long mid;
        @JSONField(name = "name")
        public String name;

        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$Owner$1 */
        static class C24651 implements Creator<Owner> {
            C24651() {
            }

            /* renamed from: a */
            public Owner createFromParcel(Parcel parcel) {
                return new Owner(parcel, null);
            }

            /* renamed from: a */
            public Owner[] newArray(int i) {
                return new Owner[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        /* synthetic */ Owner(Parcel parcel, C24731 c24731) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.mid);
            parcel.writeString(this.name);
            parcel.writeString(this.face);
        }

        public Owner() {
            this.face = "";
        }

        private Owner(Parcel parcel) {
            this.face = "";
            this.mid = parcel.readLong();
            this.name = parcel.readString();
            this.face = parcel.readString();
        }
    }

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$Page */
    public static class Page implements Parcelable, Cloneable {
        public static final Creator<Page> CREATOR = new C24671();
        @JSONField(name = "dm")
        /* renamed from: dm */
        public C2456DM f6656dm;
        @JSONField(deserialize = false, serialize = false)
        public boolean mAlreadyPlayed;
        @JSONField(name = "audio")
        public Audio mAudio;
        @JSONField(name = "cid")
        public int mCid;
        @JSONField(name = "dimension")
        public Dimension mDimension;
        @JSONField(name = "from")
        public String mFrom;
        @JSONField(name = "has_alias")
        public boolean mHasAlias;
        @JSONField(name = "link")
        public String mLink;
        @JSONField(name = "metas")
        public List<Meta> mMetas;
        @JSONField(name = "offsite")
        public String mOffsite;
        @JSONField(name = "page")
        public int mPage;
        @JSONField(name = "rich_vid")
        public String mRawVid;
        @JSONField(name = "tid")
        public int mTid;
        @JSONField(name = "part")
        public String mTitle;
        @JSONField(name = "vid")
        public String mVid;
        @JSONField(name = "weblink")
        public String mWebLink;

        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$Page$Meta */
        public static class Meta implements Parcelable, Cloneable {
            public static final Creator<Meta> CREATOR = new C24661();
            @JSONField(name = "quality")
            /* renamed from: a */
            public int f6653a;
            @JSONField(name = "format")
            /* renamed from: b */
            public String f6654b;
            @JSONField(name = "size")
            /* renamed from: c */
            public long f6655c;

            /* compiled from: BL */
            /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$Page$Meta$1 */
            static class C24661 implements Creator<Meta> {
                C24661() {
                }

                /* renamed from: a */
                public Meta createFromParcel(Parcel parcel) {
                    return new Meta(parcel);
                }

                /* renamed from: a */
                public Meta[] newArray(int i) {
                    return new Meta[i];
                }
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f6653a);
                parcel.writeString(this.f6654b);
                parcel.writeLong(this.f6655c);
            }

            protected Meta(Parcel parcel) {
                this.f6653a = parcel.readInt();
                this.f6654b = parcel.readString();
                this.f6655c = parcel.readLong();
            }
        }

        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$Page$1 */
        static class C24671 implements Creator<Page> {
            C24671() {
            }

            /* renamed from: a */
            public Page createFromParcel(Parcel parcel) {
                return new Page(parcel);
            }

            /* renamed from: a */
            public Page[] newArray(int i) {
                return new Page[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void setType(String str) {
            this.mFrom = str;
        }

        public String getType() {
            return this.mFrom;
        }

        public long getSize(int i) {
            if (this.mMetas == null || this.mMetas.isEmpty()) {
                return 0;
            }
            for (Meta meta : this.mMetas) {
                if (meta.f6653a == i) {
                    return meta.f6655c;
                }
            }
            return 0;
        }

        public Page clone() throws CloneNotSupportedException {
            return (Page) super.clone();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mCid);
            parcel.writeInt(this.mPage);
            parcel.writeString(this.mFrom);
            parcel.writeString(this.mTitle);
            parcel.writeString(this.mLink);
            parcel.writeString(this.mRawVid);
            parcel.writeString(this.mVid);
            parcel.writeByte((byte) (this.mHasAlias?1:0));
            parcel.writeString(this.mWebLink);
            parcel.writeString(this.mOffsite);
            parcel.writeByte((byte) (this.mAlreadyPlayed?1:0));
            parcel.writeParcelable(this.mAudio, i);
            parcel.writeParcelable(this.f6656dm, i);
            parcel.writeParcelable(this.mDimension, i);
        }

        protected Page(Parcel parcel) {
            this.mCid = parcel.readInt();
            this.mPage = parcel.readInt();
            this.mFrom = parcel.readString();
            this.mTitle = parcel.readString();
            this.mLink = parcel.readString();
            this.mRawVid = parcel.readString();
            this.mVid = parcel.readString();
            boolean z = false;
            this.mHasAlias = parcel.readByte() != (byte) 0;
            this.mWebLink = parcel.readString();
            this.mOffsite = parcel.readString();
            if (parcel.readByte() != (byte) 0) {
                z = true;
            }
            this.mAlreadyPlayed = z;
            this.mAudio = (Audio) parcel.readParcelable(Audio.class.getClassLoader());
            this.f6656dm = (C2456DM) parcel.readParcelable(C2456DM.class.getClassLoader());
            this.mDimension = (Dimension) parcel.readParcelable(Dimension.class.getClassLoader());
        }
    }

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$RequestUser */
    public static class RequestUser implements Parcelable {
        public static final Creator<RequestUser> CREATOR = new C24681();
        public int coin;
        @JSONField(name = "attention")
        public int mAttention;
        @JSONField(name = "dislike")
        public int mDislike;
        @JSONField(name = "favorite")
        public boolean mFavorite;
        @JSONField(name = "like")
        public int mLike;

        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$RequestUser$1 */
        static class C24681 implements Creator<RequestUser> {
            C24681() {
            }

            /* renamed from: a */
            public RequestUser createFromParcel(Parcel parcel) {
                return new RequestUser(parcel);
            }

            /* renamed from: a */
            public RequestUser[] newArray(int i) {
                return new RequestUser[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public boolean isAttention() {
            return this.mAttention != -999;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mAttention);
            parcel.writeByte((byte) (this.mFavorite?1:0));
            parcel.writeInt(this.mLike);
            parcel.writeInt(this.mDislike);
            parcel.writeInt(this.coin);
        }

        protected RequestUser(Parcel parcel) {
            this.mAttention = parcel.readInt();
            this.mFavorite = parcel.readByte() != (byte) 0;
            this.mLike = parcel.readInt();
            this.mDislike = parcel.readInt();
            this.coin = parcel.readInt();
        }
    }

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$Rights */
    public static class Rights implements Parcelable {
        public static final Creator<Rights> CREATOR = new C24691();
        @JSONField(name = "ugc_pay_preview")
        public boolean isPreview;
        @JSONField(name = "bp")
        public boolean mCanBp;
        @JSONField(name = "elec")
        public boolean mCanCharge;
        @JSONField(name = "download")
        public boolean mCanDownload;
        @JSONField(name = "movie")
        public boolean mCanMovie;
        @JSONField(name = "no_reprint")
        public boolean noReprint;

        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$Rights$1 */
        static class C24691 implements Creator<Rights> {
            C24691() {
            }

            /* renamed from: a */
            public Rights createFromParcel(Parcel parcel) {
                return new Rights(parcel);
            }

            /* renamed from: a */
            public Rights[] newArray(int i) {
                return new Rights[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte((byte) (this.mCanBp?1:0));
            parcel.writeByte((byte) (this.mCanCharge?1:0));
            parcel.writeByte((byte) (this.mCanDownload?1:0));
            parcel.writeByte((byte) (this.mCanMovie?1:0));
            parcel.writeByte((byte) (this.isPreview?1:0));
        }

        protected Rights(Parcel parcel) {
            boolean z = false;
            this.mCanBp = parcel.readByte() != (byte) 0;
            this.mCanCharge = parcel.readByte() != (byte) 0;
            this.mCanDownload = parcel.readByte() != (byte) 0;
            this.mCanMovie = parcel.readByte() != (byte) 0;
            if (parcel.readByte() != (byte) 0) {
                z = true;
            }
            this.isPreview = z;
        }
    }

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$Staff */
    public static class Staff implements Parcelable {
        public static final Creator<Staff> CREATOR = new C24701();
        @JSONField(name = "attention")
        public int attention;
        @JSONField(name = "face")
        public String face;
        @JSONField(name = "mid")
        public String mid;
        @JSONField(name = "name")
        public String name;
        @JSONField(name = "official_verify")
        public OfficialVerify officialVerify;
        @JSONField(name = "title")
        public String title;
        @JSONField(name = "vip")
        public VipExtraUserInfo vipInfo;

        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$Staff$1 */
        static class C24701 implements Creator<Staff> {
            C24701() {
            }

            /* renamed from: a */
            public Staff createFromParcel(Parcel parcel) {
                return new Staff(parcel);
            }

            /* renamed from: a */
            public Staff[] newArray(int i) {
                return new Staff[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected Staff(Parcel parcel) {
            this.mid = parcel.readString();
            this.title = parcel.readString();
            this.name = parcel.readString();
            this.attention = parcel.readInt();
            this.officialVerify = (OfficialVerify) parcel.readParcelable(OfficialVerify.class.getClassLoader());
            this.face = parcel.readString();
            this.vipInfo = (VipExtraUserInfo) parcel.readParcelable(VipExtraUserInfo.class.getClassLoader());
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mid);
            parcel.writeString(this.title);
            parcel.writeString(this.name);
            parcel.writeInt(this.attention);
            parcel.writeParcelable(this.officialVerify, i);
            parcel.writeString(this.face);
            parcel.writeParcelable(this.vipInfo, i);
        }
    }

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$Stat */
    public static class Stat implements Parcelable {
        public static final Creator<Stat> CREATOR = new C24711();
        @JSONField(name = "coin")
        public int mCoins;
        @JSONField(name = "reply")
        public String mComments;
        @JSONField(name = "danmaku")
        public String mDanmakus;
        @JSONField(name = "dislike")
        public int mDislikes;
        @JSONField(name = "favorite")
        public int mFavorites;
        @JSONField(name = "his_rank")
        public int mHistoryRank;
        @JSONField(name = "like")
        public int mLikes;
        @JSONField(name = "view")
        public String mPlays;
        @JSONField(name = "share")
        public int mShares;

        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$Stat$1 */
        static class C24711 implements Creator<Stat> {
            C24711() {
            }

            /* renamed from: a */
            public Stat createFromParcel(Parcel parcel) {
                return new Stat(parcel);
            }

            /* renamed from: a */
            public Stat[] newArray(int i) {
                return new Stat[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mPlays);
            parcel.writeString(this.mDanmakus);
            parcel.writeString(this.mComments);
            parcel.writeInt(this.mFavorites);
            parcel.writeInt(this.mCoins);
            parcel.writeInt(this.mShares);
            parcel.writeInt(this.mLikes);
            parcel.writeInt(this.mDislikes);
            parcel.writeInt(this.mHistoryRank);
        }

        protected Stat(Parcel parcel) {
            this.mPlays = parcel.readString();
            this.mDanmakus = parcel.readString();
            this.mComments = parcel.readString();
            this.mFavorites = parcel.readInt();
            this.mCoins = parcel.readInt();
            this.mShares = parcel.readInt();
            this.mLikes = parcel.readInt();
            this.mDislikes = parcel.readInt();
            this.mHistoryRank = parcel.readInt();
        }
    }

    @Keep
    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$Tag */
    public static class Tag implements Parcelable {
        public static final Creator<Tag> CREATOR = new C24721();
        @JSONField(name = "hated")
        public boolean hasHate;
        @JSONField(name = "liked")
        public boolean hasLike;
        @JSONField(deserialize = false, serialize = false)
        public boolean hasReport = false;
        @JSONField(name = "hates")
        public int hateNum;
        @JSONField(name = "tag_id")
        /* renamed from: id */
        public int f6657id;
        @JSONField(name = "is_activity")
        public int isActivity;
        @JSONField(name = "likes")
        public int likeNum;
        @JSONField(name = "tag_name")
        public String name;

        /* compiled from: BL */
        /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$Tag$1 */
        static class C24721 implements Creator<Tag> {
            C24721() {
            }

            /* renamed from: a */
            public Tag createFromParcel(Parcel parcel) {
                return new Tag(parcel);
            }

            /* renamed from: a */
            public Tag[] newArray(int i) {
                return new Tag[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f6657id);
            parcel.writeString(this.name);
            parcel.writeInt(this.likeNum);
            parcel.writeInt(this.hateNum);
        }

        protected Tag(Parcel parcel) {
            this.f6657id = parcel.readInt();
            this.name = parcel.readString();
            this.likeNum = parcel.readInt();
            this.hateNum = parcel.readInt();
        }
    }

    /* compiled from: BL */
    /* renamed from: tv.danmaku.bili.ui.video.api.BiliVideoDetail$1 */
    static class C24731 implements Creator<BiliVideoDetail> {
        C24731() {
        }

        /* renamed from: a */
        public BiliVideoDetail createFromParcel(Parcel parcel) {
            return new BiliVideoDetail(parcel);
        }

        /* renamed from: a */
        public BiliVideoDetail[] newArray(int i) {
            return new BiliVideoDetail[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    @Deprecated
    public int getSpid() {
        return 0;
    }

    protected BiliVideoDetail(Parcel parcel) {
        this.mAvid = parcel.readInt();
        this.mTid = parcel.readInt();
        this.mTypeName = parcel.readString();
        this.mTitle = parcel.readString();
        this.mArcType = parcel.readInt();
        this.mCover = parcel.readString();
        this.mCreatedTimestamp = parcel.readLong();
        this.mDescription = parcel.readString();
        this.mRights = (Rights) parcel.readParcelable(Rights.class.getClassLoader());
        this.mOwner = (Owner) parcel.readParcelable(Owner.class.getClassLoader());
        this.mStat = (Stat) parcel.readParcelable(Stat.class.getClassLoader());
        this.mDuration = parcel.readInt();
        this.mTags = parcel.createTypedArrayList(Tag.CREATOR);
        this.mPageList = parcel.createTypedArrayList(Page.CREATOR);
        this.mRequestUser = (RequestUser) parcel.readParcelable(RequestUser.class.getClassLoader());
        this.mBangumiInfo = (BangumiInfo) parcel.readParcelable(BangumiInfo.class.getClassLoader());
        this.mChargeResult = (ChargeRankResult) parcel.readParcelable(ChargeRankResult.class.getClassLoader());
        this.mContributions = parcel.createTypedArrayList(Contribute.CREATOR);
        this.mRelatedList = parcel.createTypedArrayList(CREATOR);
        this.mDownloadableInfo = parcel.readString();
        this.mJumpAid = parcel.readInt();
        this.mViewAt = parcel.readLong();
        this.mHistory = (History) parcel.readParcelable(History.class.getClassLoader());
        this.ownerExt = (OwnerExt) parcel.readParcelable(OwnerExt.class.getClassLoader());
        this.dislikeReasons = parcel.createTypedArrayList(DislikeReason.CREATOR);
        this.dislikeReasonV2 = (DislikeReasonV2) parcel.readParcelable(DislikeReasonV2.class.getClassLoader());
        this.audio = (Audio) parcel.readParcelable(Audio.class.getClassLoader());
        this.playerIcon = (VideoPlayerIcon) parcel.readParcelable(VideoPlayerIcon.class.getClassLoader());
        this.mRating = parcel.readFloat();
        this.mRatingCount = parcel.readInt();
        this.mReserve = parcel.readString();
        this.mFrom = parcel.readString();
        this.mUri = parcel.readString();
        this.mGoTo = parcel.readString();
        this.mParam = parcel.readString();
        this.mBadge = parcel.readString();
        this.mRcmdReason = parcel.readString();
        this.vipActive = parcel.readString();
        this.cmMark = parcel.readLong();
        this.srcId = parcel.readLong();
        this.requestId = parcel.readString();
        this.creativeId = parcel.readLong();
        this.creativeType = parcel.readLong();
        boolean z = false;
        this.isAd = parcel.readByte() != (byte) 0;
        if (parcel.readByte() != (byte) 0) {
            z = true;
        }
        this.isAdLoc = z;
        this.adCb = parcel.readString();
        this.clientIp = parcel.readString();
        this.serverType = parcel.readLong();
        this.resourceId = parcel.readLong();
        this.f6658id = parcel.readLong();
        this.adIndex = parcel.readLong();
        this.cardIndex = parcel.readLong();
        this.mButton = (Button) parcel.readParcelable(Button.class.getClassLoader());
        this.seasonType = parcel.readInt();
        this.ugcPayInfo = (UgcPayInfo) parcel.readParcelable(UgcPayInfo.class.getClassLoader());
        this.mActivityId = parcel.readInt();
        this.mBgms = parcel.createTypedArrayList(Bgm.CREATOR);
        this.mArgueMsg = parcel.readString();
        this.mShortLink = parcel.readString();
        this.staffs = parcel.createTypedArrayList(Staff.CREATOR);
        this.mCanShowRelatedVideoAutoNext = parcel.readInt();
        this.mLabel = (Label) parcel.readParcelable(Label.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mAvid);
        parcel.writeInt(this.mTid);
        parcel.writeString(this.mTypeName);
        parcel.writeString(this.mTitle);
        parcel.writeInt(this.mArcType);
        parcel.writeString(this.mCover);
        parcel.writeLong(this.mCreatedTimestamp);
        parcel.writeString(this.mDescription);
        parcel.writeParcelable(this.mRights, i);
        parcel.writeParcelable(this.mOwner, i);
        parcel.writeParcelable(this.mStat, i);
        parcel.writeInt(this.mDuration);
        parcel.writeTypedList(this.mTags);
        parcel.writeTypedList(this.mPageList);
        parcel.writeParcelable(this.mRequestUser, i);
        parcel.writeParcelable(this.mBangumiInfo, i);
        parcel.writeParcelable(this.mChargeResult, i);
        parcel.writeTypedList(this.mContributions);
        parcel.writeTypedList(this.mRelatedList);
        parcel.writeString(this.mDownloadableInfo);
        parcel.writeInt(this.mJumpAid);
        parcel.writeLong(this.mViewAt);
        parcel.writeParcelable(this.mHistory, i);
        parcel.writeParcelable(this.ownerExt, i);
        parcel.writeTypedList(this.dislikeReasons);
        parcel.writeParcelable(this.dislikeReasonV2, i);
        parcel.writeParcelable(this.audio, i);
        parcel.writeParcelable(this.playerIcon, i);
        parcel.writeFloat(this.mRating);
        parcel.writeInt(this.mRatingCount);
        parcel.writeString(this.mReserve);
        parcel.writeString(this.mFrom);
        parcel.writeString(this.mUri);
        parcel.writeString(this.mGoTo);
        parcel.writeString(this.mParam);
        parcel.writeString(this.mBadge);
        parcel.writeString(this.mRcmdReason);
        parcel.writeString(this.vipActive);
        parcel.writeLong(this.cmMark);
        parcel.writeLong(this.srcId);
        parcel.writeString(this.requestId);
        parcel.writeLong(this.creativeId);
        parcel.writeLong(this.creativeType);
        parcel.writeByte((byte) (this.isAd?1:0));
        parcel.writeByte((byte) (this.isAdLoc?1:0));
        parcel.writeString(this.adCb);
        parcel.writeString(this.clientIp);
        parcel.writeLong(this.serverType);
        parcel.writeLong(this.resourceId);
        parcel.writeLong(this.f6658id);
        parcel.writeLong(this.adIndex);
        parcel.writeLong(this.cardIndex);
        parcel.writeParcelable(this.mButton, i);
        parcel.writeInt(this.seasonType);
        parcel.writeParcelable(this.ugcPayInfo, i);
        parcel.writeInt(this.mActivityId);
        parcel.writeTypedList(this.mBgms);
        parcel.writeString(this.mArgueMsg);
        parcel.writeString(this.mShortLink);
        parcel.writeTypedList(this.staffs);
        parcel.writeInt(this.mCanShowRelatedVideoAutoNext);
        parcel.writeParcelable(this.mLabel, i);
    }

    public boolean isPageListEmpty() {
        return this.mPageList == null || this.mPageList.isEmpty();
    }

    public boolean isOriginalVideo() {
        return this.mArcType == 1;
    }

    public boolean canDownload() {
        return this.mRights != null && this.mRights.mCanDownload;
    }

    public boolean canCharge() {
        return (this.mRights == null || !this.mRights.mCanCharge || this.mRights.mCanMovie || this.mRights.mCanBp || this.mChargeResult == null || !this.mChargeResult.show) ? false : true;
    }

    public boolean isForbidReprint() {
        return this.mArcType == 1 && this.mRights != null && this.mRights.noReprint;
    }

    public boolean isLive() {
        return this.ownerExt != null && this.ownerExt.hasLive();
    }

    public boolean hasDislikeReasons() {
        return (this.dislikeReasonV2 == null || TextUtils.isEmpty(this.dislikeReasonV2.title)) ? false : true;
    }

    public List<BiliVideoDetail> getPlayableRelatedVideo() {
        if (this.mRelatedList == null || this.mRelatedList.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (BiliVideoDetail biliVideoDetail : this.mRelatedList) {
            if ("av".equals(biliVideoDetail.mGoTo) && !"operation".equals(biliVideoDetail.mFrom)) {
                arrayList.add(biliVideoDetail);
            }
        }
        return arrayList;
    }

    public String getPlays() {
        return this.mStat != null ? this.mStat.mPlays : "0";
    }

    public String getDanmakus() {
        return this.mStat != null ? this.mStat.mDanmakus : "0";
    }

    public int getFavorites() {
        return this.mStat != null ? this.mStat.mFavorites : 0;
    }

    public String getAvatar() {
        return this.mOwner != null ? this.mOwner.face : "";
    }

    public String getAuthor() {
        return this.mOwner != null ? this.mOwner.name : "";
    }

    public long getMid() {
        return this.mOwner != null ? this.mOwner.mid : 0;
    }

    public String getSeasonId() {
        return this.mBangumiInfo != null ? this.mBangumiInfo.mSeasonId : "0";
    }

    public int getSeasonIdInt() {
        if (this.mBangumiInfo != null) {
            try {
                return Integer.parseInt(this.mBangumiInfo.mSeasonId);
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public int getHistoryRank() {
        return this.mStat != null ? this.mStat.mHistoryRank : 0;
    }

    public void increaseShares(int i) {
        if (this.mStat != null) {
            Stat stat = this.mStat;
            stat.mShares += i;
        }
    }

    public void setFavoriteStatus(boolean z) {
        if (this.mRequestUser != null) {
            this.mRequestUser.mFavorite = z;
            if (this.mStat != null) {
                Stat stat;
                if (z) {
                    stat = this.mStat;
                    stat.mFavorites++;
                } else {
                    stat = this.mStat;
                    stat.mFavorites--;
                }
            }
        }
    }

    public boolean isAttention() {
        return this.mRequestUser != null && this.mRequestUser.isAttention();
    }

    public boolean isMangoVideo() {
        boolean z = false;
        if (this.mPageList == null || this.mPageList.size() <= 0) {
            return false;
        }
        Page page = (Page) this.mPageList.get(0);
        if (page != null && "hunan".equalsIgnoreCase(page.mFrom)) {
            z = true;
        }
        return z;
    }

    public boolean is3rdVideo() {
        boolean z = false;
        if (this.mPageList == null || this.mPageList.size() <= 0) {
            return false;
        }
        Page page = (Page) this.mPageList.get(0);
        if (page == null) {
            return false;
        }
        String str = page.mFrom;
        if (!("vupload".equals(str) || "bangumi".equals(str) || "movie".equals(str) || "bili".equals(str))) {
            z = true;
        }
        return z;
    }

    @Nullable
    public Page findPageByCid(int i) {
        if (isPageListEmpty()) {
            return null;
        }
        for (Page page : this.mPageList) {
            if (page.mCid == i) {
                return page;
            }
        }
        return (Page) this.mPageList.get(0);
    }

    @Nullable
    public Page findPageByIndex(int i) {
        if (isPageListEmpty()) {
            return null;
        }
        if (i < 0 || i >= this.mPageList.size()) {
            i = 0;
        }
        return (Page) this.mPageList.get(i);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{BiliVideo: ");
        stringBuilder.append(this.mAvid);
        stringBuilder.append(", ");
        stringBuilder.append(this.mTitle);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiliVideoDetail)) {
            return false;
        }
        if (this.mAvid != ((BiliVideoDetail) obj).mAvid) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.mAvid;
    }

    @NonNull
    public static BiliVideoDetail create(int i, String str, String str2) {
        BiliVideoDetail biliVideoDetail = new BiliVideoDetail();
        biliVideoDetail.mAvid = i;
        biliVideoDetail.mCover = str2;
        biliVideoDetail.mTitle = str;
        return biliVideoDetail;
    }

    public void clone(BiliVideoDetail biliVideoDetail) {
        if (biliVideoDetail != this) {
            this.mAvid = biliVideoDetail.mAvid;
            if (TextUtils.isEmpty(this.mCover)) {
                this.mCover = biliVideoDetail.mCover;
            }
            this.mTid = biliVideoDetail.mTid;
            this.mTypeName = biliVideoDetail.mTypeName;
            this.mTitle = biliVideoDetail.mTitle;
            this.mArcType = biliVideoDetail.mArcType;
            this.mCreatedTimestamp = biliVideoDetail.mCreatedTimestamp;
            this.mDescription = biliVideoDetail.mDescription;
            this.mDownloadableInfo = biliVideoDetail.mDownloadableInfo;
            this.mRights = biliVideoDetail.mRights;
            this.mOwner = biliVideoDetail.mOwner;
            this.mStat = biliVideoDetail.mStat;
            this.mTags = biliVideoDetail.mTags;
            this.mPageList = biliVideoDetail.mPageList;
            this.mRequestUser = biliVideoDetail.mRequestUser;
            this.mBangumiInfo = biliVideoDetail.mBangumiInfo;
            this.mChargeResult = biliVideoDetail.mChargeResult;
            this.mContributions = biliVideoDetail.mContributions;
            this.mRelatedList = biliVideoDetail.mRelatedList;
            this.ownerExt = biliVideoDetail.ownerExt;
            this.dislikeReasons = biliVideoDetail.dislikeReasons;
            this.dislikeReasonV2 = biliVideoDetail.dislikeReasonV2;
            this.mHistory = biliVideoDetail.mHistory;
            this.playerIcon = biliVideoDetail.playerIcon;
            this.mDuration = biliVideoDetail.mDuration;
            this.mUri = biliVideoDetail.mUri;
            this.mGoTo = biliVideoDetail.mGoTo;
            this.mParam = biliVideoDetail.mParam;
            this.mRating = biliVideoDetail.mRating;
            this.mRatingCount = biliVideoDetail.mRatingCount;
            this.mReserve = biliVideoDetail.mReserve;
            this.mFrom = biliVideoDetail.mFrom;
            this.mBadge = biliVideoDetail.mBadge;
            this.mRcmdReason = biliVideoDetail.mRcmdReason;
            this.vipActive = biliVideoDetail.vipActive;
            this.mButton = biliVideoDetail.mButton;
            this.cms = biliVideoDetail.cms;
            this.cmConfig = biliVideoDetail.cmConfig;
            this.ugcPayInfo = biliVideoDetail.ugcPayInfo;
            this.mActivityId = biliVideoDetail.mActivityId;
            this.mBgms = biliVideoDetail.mBgms;
            this.staffs = biliVideoDetail.staffs;
            this.mArgueMsg = biliVideoDetail.mArgueMsg;
            this.mShortLink = biliVideoDetail.mShortLink;
            this.mCanShowRelatedVideoAutoNext = biliVideoDetail.mCanShowRelatedVideoAutoNext;
            this.mLabel = biliVideoDetail.mLabel;
        }
    }

    public long getHistoryCid() {
        return this.mHistory == null ? 0 : this.mHistory.cid;
    }

    public long getHistoryTime() {
        return this.mHistory == null ? 0 : this.mHistory.progress * 1000;
    }

    public String getTrackId() {
        try {
            return !TextUtils.isEmpty(this.mUri) ? Uri.parse(this.mUri).getQueryParameter("trackid") : "";
        } catch (Exception unused) {
            return "";
        }
    }
}
