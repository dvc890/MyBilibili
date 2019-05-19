package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.uniform;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.BangumiSponsorRankSummary;

import java.util.List;

@Keep
/* compiled from: BL */
public class BangumiUniformSeason implements Parcelable {
    public static final Creator<BangumiUniformSeason> CREATOR = new C18891();
    public String cover;
    public List<BangumiUniformEpisode> episodes;
    public String evaluate;
    @JSONField(name = "is_new")
    public boolean isNew;
    public String link;
    @JSONField(name = "media_id")
    public String mediaId;
    public int mode = 2;
    @JSONField(name = "music_menu")
    public List<MusicMenu> musicMenus;
    @JSONField(name = "new_ep")
    public NewestEp newestEp;
    public Notice notice;
    @JSONField(name = "activity")
    public BangumiOperationActivities operationActivities;
    public Paster paster;
    public Payment payment;
    @JSONField(name = "player_icon")
    public VideoPlayerIcon playerIcon;
    @JSONField(name = "section")
    public List<BangumiUniformPrevueSection> prevueSection;
    public Publish publish;
    public Rating rating;
    @JSONField(name = "record")
    public String record;
    public Right rights;
    @JSONField(name = "season_id")
    public String seasonId;
    @JSONField(name = "limit")
    public BangumiSeasonLimit seasonLimit;
    @JSONField(name = "season_title")
    public String seasonTitle;
    @JSONField(name = "type")
    public int seasonType;
    public List<BangumiUniformSeason> seasons;
    @JSONField(name = "series")
    public Series series;
    @JSONField(name = "share_copy")
    public String shareCopy;
    @JSONField(name = "share_url")
    public String shareUrl;
    @JSONField(name = "short_link")
    public String shortLink;
    @JSONField(name = "sponsor")
    public BangumiSponsorRankSummary sponsorRank;
    @JSONField(name = "square_cover")
    public String squareCover;
    public Stat stat;
    @JSONField(name = "status")
    public int status = 2;
    public String subtitle;
    public String title;
    @JSONField(name = "total")
    public int totalEp;
    @JSONField(name = "up_info")
    public UpInfo upInfo;
    @JSONField(name = "user_rating")
    public BangumiUserRating userRating;
    @JSONField(name = "user_status")
    public BangumiUserStatus userStatus;

    @Keep
    /* compiled from: BL */
    public static class MusicMenu implements Parcelable {
        public static final Creator<MusicMenu> CREATOR = new C18771();
        @JSONField(name = "cover_url")
        public String cover;
        @JSONField(name = "menu_id")
        /* renamed from: id */
        public String f5747id;
        public String intro;
        @JSONField(name = "is_pay")
        public boolean isPay;
        @JSONField(name = "play_num")
        public int playNum;
        public String title;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.uniform.BangumiUniformSeason$MusicMenu$1 */
        static class C18771 implements Creator<MusicMenu> {
            C18771() {
            }

            /* renamed from: a */
            public MusicMenu createFromParcel(Parcel parcel) {
                return new MusicMenu(parcel);
            }

            /* renamed from: a */
            public MusicMenu[] newArray(int i) {
                return new MusicMenu[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected MusicMenu(Parcel parcel) {
            this.f5747id = parcel.readString();
            this.title = parcel.readString();
            this.cover = parcel.readString();
            this.playNum = parcel.readInt();
            this.isPay = parcel.readByte() != (byte) 0;
            this.intro = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f5747id);
            parcel.writeString(this.title);
            parcel.writeString(this.cover);
            parcel.writeInt(this.playNum);
            parcel.writeByte((byte) (this.isPay?1:0));
            parcel.writeString(this.intro);
        }
    }

    @Keep
    /* compiled from: BL */
    public static class OperationActivity {
        @JSONField(name = "ab")
        public String abTest;
        @JSONField(name = "app_cover")
        public String cover;
        /* renamed from: id */
        public String f5748id;
        @JSONField(name = "app_link")
        public String link;
        public List<BangumiPendant> pendants;
        @JSONField(name = "threshold")
        public List<BangumiThreshold> thresholds;
        public String title;
        @JSONField(name = "type")
        public int type;
    }

    @Keep
    /* compiled from: BL */
    public static class Paster implements Parcelable {
        public static final Creator<Paster> CREATOR = new C18781();
        public int aid;
        @JSONField(name = "allow_jump")
        public boolean allowJump;
        public int cid;
        public int duration;
        public int type;
        public int url;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.uniform.BangumiUniformSeason$Paster$1 */
        static class C18781 implements Creator<Paster> {
            C18781() {
            }

            /* renamed from: a */
            public Paster createFromParcel(Parcel parcel) {
                return new Paster(parcel);
            }

            /* renamed from: a */
            public Paster[] newArray(int i) {
                return new Paster[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected Paster(Parcel parcel) {
            this.cid = parcel.readInt();
            this.duration = parcel.readInt();
            this.type = parcel.readInt();
            this.allowJump = parcel.readByte() != (byte) 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.cid);
            parcel.writeInt(this.duration);
            parcel.writeInt(this.type);
            parcel.writeByte((byte) (this.allowJump?1:0));
        }
    }

    @Keep
    /* compiled from: BL */
    public static class PayDialog implements Parcelable {
        public static final Creator<PayDialog> CREATOR = new C18791();
        @Nullable
        @JSONField(name = "bottom")
        public PayDialogButton bottom;
        @Nullable
        @JSONField(name = "btn_left")
        public PayDialogButton btnLeft;
        @Nullable
        @JSONField(name = "btn_right")
        public PayDialogButton btnRight;
        @JSONField(name = "desc")
        public String desc;
        @JSONField(name = "title")
        public String title;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.uniform.BangumiUniformSeason$PayDialog$1 */
        static class C18791 implements Creator<PayDialog> {
            C18791() {
            }

            /* renamed from: a */
            public PayDialog createFromParcel(Parcel parcel) {
                return new PayDialog(parcel);
            }

            /* renamed from: a */
            public PayDialog[] newArray(int i) {
                return new PayDialog[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        private PayDialog() {
        }

        protected PayDialog(Parcel parcel) {
            this.title = parcel.readString();
            this.desc = parcel.readString();
            this.btnLeft = (PayDialogButton) parcel.readParcelable(PayDialogButton.class.getClassLoader());
            this.btnRight = (PayDialogButton) parcel.readParcelable(PayDialogButton.class.getClassLoader());
            this.bottom = (PayDialogButton) parcel.readParcelable(PayDialogButton.class.getClassLoader());
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            parcel.writeString(this.desc);
            parcel.writeParcelable(this.btnLeft, i);
            parcel.writeParcelable(this.btnRight, i);
            parcel.writeParcelable(this.bottom, i);
        }
    }

    @Keep
    /* compiled from: BL */
    public static class PayDialogButton implements Parcelable {
        public static final Creator<PayDialogButton> CREATOR = new C18801();
        @JSONField(name = "link")
        public String link;
        @JSONField(name = "title")
        public String title;
        @JSONField(name = "type")
        public String type;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.uniform.BangumiUniformSeason$PayDialogButton$1 */
        static class C18801 implements Creator<PayDialogButton> {
            C18801() {
            }

            /* renamed from: a */
            public PayDialogButton createFromParcel(Parcel parcel) {
                return new PayDialogButton(parcel);
            }

            /* renamed from: a */
            public PayDialogButton[] newArray(int i) {
                return new PayDialogButton[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected PayDialogButton(Parcel parcel) {
            this.title = parcel.readString();
            this.type = parcel.readString();
            this.link = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            parcel.writeString(this.type);
            parcel.writeString(this.link);
        }
    }

    @Keep
    /* compiled from: BL */
    public static class PayPack {
        @JSONField(name = "id")
        /* renamed from: id */
        public String f5749id;
        @JSONField(name = "not_paid_text_for_app")
        public String nonPaidDesc;
        @JSONField(name = "paid_text_for_app")
        public String paidDesc;
        @JSONField(name = "pay_pack_url")
        public String payPackUrl;
        @JSONField(name = "title")
        public String title;
    }

    @Keep
    /* compiled from: BL */
    public static class Payment implements Parcelable {
        public static final Creator<Payment> CREATOR = new C18811();
        @Nullable
        @JSONField(name = "dialog")
        public PayDialog payDialog;
        @JSONField(name = "pay_tip")
        public PayTip payTip = new PayTip();
        @Nullable
        @JSONField(name = "pay_type")
        public PaymentType payType;
        @JSONField(name = "vip_promotion")
        public String vipPromotionBadge;
        public boolean vipSwitchOpen = true;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.uniform.BangumiUniformSeason$Payment$1 */
        static class C18811 implements Creator<Payment> {
            C18811() {
            }

            /* renamed from: a */
            public Payment createFromParcel(Parcel parcel) {
                return new Payment(parcel);
            }

            /* renamed from: a */
            public Payment[] newArray(int i) {
                return new Payment[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected Payment(Parcel parcel) {
            boolean z = true;
            this.payType = (PaymentType) parcel.readParcelable(PaymentType.class.getClassLoader());
            if (parcel.readByte() == (byte) 0) {
                z = false;
            }
            this.vipSwitchOpen = z;
            this.payTip = (PayTip) parcel.readParcelable(PayTip.class.getClassLoader());
            this.vipPromotionBadge = parcel.readString();
            this.payDialog = (PayDialog) parcel.readParcelable(PayDialog.class.getClassLoader());
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.payType, i);
            parcel.writeByte((byte) (this.vipSwitchOpen?1:0));
            parcel.writeParcelable(this.payTip, i);
            parcel.writeString(this.vipPromotionBadge);
            parcel.writeParcelable(this.payDialog, i);
        }
    }

    @Keep
    /* compiled from: BL */
    public static class PaymentType implements Parcelable {
        public static final Creator<PaymentType> CREATOR = new C18821();
        @JSONField(name = "allow_discount")
        public boolean allowDiscount;
        @JSONField(name = "allow_ticket")
        public boolean allowTicket;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.uniform.BangumiUniformSeason$PaymentType$1 */
        static class C18821 implements Creator<PaymentType> {
            C18821() {
            }

            /* renamed from: a */
            public PaymentType createFromParcel(Parcel parcel) {
                return new PaymentType(parcel);
            }

            /* renamed from: a */
            public PaymentType[] newArray(int i) {
                return new PaymentType[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected PaymentType(Parcel parcel) {
            boolean z = false;
            this.allowTicket = parcel.readByte() != (byte) 0;
            if (parcel.readByte() != (byte) 0) {
                z = true;
            }
            this.allowDiscount = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte((byte) (this.allowTicket?1:0));
            parcel.writeByte((byte) (this.allowDiscount?1:0));
        }
    }

    @Keep
    /* compiled from: BL */
    public static class Publish implements Parcelable {
        public static final Creator<Publish> CREATOR = new C18831();
        @JSONField(name = "is_finish")
        public boolean isFinish;
        @JSONField(name = "is_started")
        public boolean isStarted;
        @JSONField(name = "pub_time")
        public String pubTime;
        @JSONField(name = "pub_time_show")
        public String pubTimeShow;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.uniform.BangumiUniformSeason$Publish$1 */
        static class C18831 implements Creator<Publish> {
            C18831() {
            }

            /* renamed from: a */
            public Publish createFromParcel(Parcel parcel) {
                return new Publish(parcel);
            }

            /* renamed from: a */
            public Publish[] newArray(int i) {
                return new Publish[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected Publish(Parcel parcel) {
            this.pubTime = parcel.readString();
            this.pubTimeShow = parcel.readString();
            boolean z = false;
            this.isStarted = parcel.readByte() != (byte) 0;
            if (parcel.readByte() != (byte) 0) {
                z = true;
            }
            this.isFinish = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.pubTime);
            parcel.writeString(this.pubTimeShow);
            parcel.writeByte((byte) (this.isStarted?1:0));
            parcel.writeByte((byte) (this.isFinish?1:0));
        }
    }

    @Keep
    /* compiled from: BL */
    public static class Right implements Parcelable {
        public static final Creator<Right> CREATOR = new C18841();
        @JSONField(name = "allow_bp")
        public boolean allowBp;
        @JSONField(name = "allow_download")
        public boolean allowDownload;
        @JSONField(name = "allow_review")
        public boolean allowReview;
        @JSONField(name = "area_limit")
        public boolean areaLimit;
        public String copyright;
        @JSONField(name = "is_preview")
        public boolean isPreview;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.uniform.BangumiUniformSeason$Right$1 */
        static class C18841 implements Creator<Right> {
            C18841() {
            }

            /* renamed from: a */
            public Right createFromParcel(Parcel parcel) {
                return new Right(parcel);
            }

            /* renamed from: a */
            public Right[] newArray(int i) {
                return new Right[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected Right(Parcel parcel) {
            this.copyright = parcel.readString();
            boolean z = false;
            this.allowBp = parcel.readByte() != (byte) 0;
            this.allowDownload = parcel.readByte() != (byte) 0;
            this.areaLimit = parcel.readByte() != (byte) 0;
            this.isPreview = parcel.readByte() != (byte) 0;
            if (parcel.readByte() != (byte) 0) {
                z = true;
            }
            this.allowReview = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.copyright);
            parcel.writeByte((byte) (this.allowBp?1:0));
            parcel.writeByte((byte) (this.allowDownload?1:0));
            parcel.writeByte((byte) (this.areaLimit?1:0));
            parcel.writeByte((byte) (this.isPreview?1:0));
            parcel.writeByte((byte) (this.allowReview?1:0));
        }
    }

    @Keep
    /* compiled from: BL */
    public static class Series implements Parcelable {
        public static final Creator<Series> CREATOR = new C18851();
        @JSONField(name = "series_id")
        /* renamed from: id */
        public int f5750id;
        @JSONField(name = "series_title")
        public String title;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.uniform.BangumiUniformSeason$Series$1 */
        static class C18851 implements Creator<Series> {
            C18851() {
            }

            /* renamed from: a */
            public Series createFromParcel(Parcel parcel) {
                return new Series(parcel);
            }

            /* renamed from: a */
            public Series[] newArray(int i) {
                return new Series[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected Series(Parcel parcel) {
            this.f5750id = parcel.readInt();
            this.title = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f5750id);
            parcel.writeString(this.title);
        }
    }

    @Keep
    /* compiled from: BL */
    public static class Stat implements Parcelable {
        public static final Creator<Stat> CREATOR = new C18861();
        @JSONField(name = "coins")
        public long coins;
        @JSONField(name = "danmakus")
        public long danmakus;
        @JSONField(name = "favorites")
        public long favorites;
        @JSONField(name = "hot")
        public long hots = -1;
        @JSONField(name = "reply")
        public int reply;
        @JSONField(name = "share")
        public long share;
        @JSONField(name = "views")
        public long views;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.uniform.BangumiUniformSeason$Stat$1 */
        static class C18861 implements Creator<Stat> {
            C18861() {
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

        protected Stat(Parcel parcel) {
            this.favorites = parcel.readLong();
            this.views = parcel.readLong();
            this.hots = parcel.readLong();
            this.danmakus = parcel.readLong();
            this.coins = parcel.readLong();
            this.reply = parcel.readInt();
            this.share = parcel.readLong();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.favorites);
            parcel.writeLong(this.views);
            parcel.writeLong(this.hots);
            parcel.writeLong(this.danmakus);
            parcel.writeLong(this.coins);
            parcel.writeInt(this.reply);
            parcel.writeLong(this.share);
        }
    }

    @Keep
    /* compiled from: BL */
    public static class UpInfo implements Parcelable {
        public static final Creator<UpInfo> CREATOR = new C18871();
        public String avatar;
        @JSONField(name = "follower")
        public int followeCount;
        @JSONField(name = "is_follow")
        public boolean isFollow;
        public BangumiPendant pendant;
        @JSONField(name = "mid")
        public long uperMid;
        @JSONField(name = "uname")
        public String upperName;
        @JSONField(name = "verify_type")
        public int verifyType;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.uniform.BangumiUniformSeason$UpInfo$1 */
        static class C18871 implements Creator<UpInfo> {
            C18871() {
            }

            /* renamed from: a */
            public UpInfo createFromParcel(Parcel parcel) {
                return new UpInfo(parcel);
            }

            /* renamed from: a */
            public UpInfo[] newArray(int i) {
                return new UpInfo[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected UpInfo(Parcel parcel) {
            this.uperMid = parcel.readLong();
            this.avatar = parcel.readString();
            this.upperName = parcel.readString();
            this.verifyType = parcel.readInt();
            this.followeCount = parcel.readInt();
            this.isFollow = parcel.readByte() != (byte) 0;
            this.pendant = (BangumiPendant) parcel.readParcelable(BangumiPendant.class.getClassLoader());
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.uperMid);
            parcel.writeString(this.avatar);
            parcel.writeString(this.upperName);
            parcel.writeInt(this.verifyType);
            parcel.writeInt(this.followeCount);
            parcel.writeByte((byte) (this.isFollow?1:0));
            parcel.writeParcelable(this.pendant, i);
        }
    }

    @Keep
    /* compiled from: BL */
    public static class VideoPlayerIcon implements Parcelable {
        public static final Creator<VideoPlayerIcon> CREATOR = new C18881();
        @JSONField(name = "ctime")
        public long ctime;
        @JSONField(name = "url1")
        public String url1;
        @JSONField(name = "url2")
        public String url2;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.uniform.BangumiUniformSeason$VideoPlayerIcon$1 */
        static class C18881 implements Creator<VideoPlayerIcon> {
            C18881() {
            }

            /* renamed from: a */
            public VideoPlayerIcon createFromParcel(Parcel parcel) {
                return new VideoPlayerIcon(parcel);
            }

            /* renamed from: a */
            public VideoPlayerIcon[] newArray(int i) {
                return new VideoPlayerIcon[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected VideoPlayerIcon(Parcel parcel) {
            this.url1 = parcel.readString();
            this.url2 = parcel.readString();
            this.ctime = parcel.readLong();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.url1);
            parcel.writeString(this.url2);
            parcel.writeLong(this.ctime);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.uniform.BangumiUniformSeason$1 */
    static class C18891 implements Creator<BangumiUniformSeason> {
        C18891() {
        }

        /* renamed from: a */
        public BangumiUniformSeason createFromParcel(Parcel parcel) {
            return new BangumiUniformSeason(parcel);
        }

        /* renamed from: a */
        public BangumiUniformSeason[] newArray(int i) {
            return new BangumiUniformSeason[i];
        }
    }

    @Keep
    /* compiled from: BL */
    public static class BangumiSeasonLimit implements Parcelable {
        public static final Creator<BangumiSeasonLimit> CREATOR = new C18901();
        public LimitButton button = null;
        public String content = "";
        public String image = "";

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.uniform.BangumiUniformSeason$BangumiSeasonLimit$1 */
        static class C18901 implements Creator<BangumiSeasonLimit> {
            C18901() {
            }

            /* renamed from: a */
            public BangumiSeasonLimit createFromParcel(Parcel parcel) {
                return new BangumiSeasonLimit(parcel);
            }

            /* renamed from: a */
            public BangumiSeasonLimit[] newArray(int i) {
                return new BangumiSeasonLimit[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected BangumiSeasonLimit(Parcel parcel) {
            this.content = parcel.readString();
            this.image = parcel.readString();
            this.button = (LimitButton) parcel.readParcelable(LimitButton.class.getClassLoader());
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.content);
            parcel.writeString(this.image);
            parcel.writeParcelable(this.button, i);
        }
    }

    @Keep
    /* compiled from: BL */
    public static class LimitButton implements Parcelable {
        public static final Creator<LimitButton> CREATOR = new C18911();
        public String link;
        public String title = "";
        public String type = "";

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.uniform.BangumiUniformSeason$LimitButton$1 */
        static class C18911 implements Creator<LimitButton> {
            C18911() {
            }

            /* renamed from: a */
            public LimitButton createFromParcel(Parcel parcel) {
                return new LimitButton(parcel);
            }

            /* renamed from: a */
            public LimitButton[] newArray(int i) {
                return new LimitButton[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected LimitButton(Parcel parcel) {
            this.title = parcel.readString();
            this.type = parcel.readString();
            this.link = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.title);
            parcel.writeString(this.type);
            parcel.writeString(this.link);
        }
    }

    @Keep
    /* compiled from: BL */
    public static class NewestEp implements Parcelable {
        public static final Creator<NewestEp> CREATOR = new C18921();
        public String desc;
        /* renamed from: id */
        public long f5751id;
        public String title;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.uniform.BangumiUniformSeason$NewestEp$1 */
        static class C18921 implements Creator<NewestEp> {
            C18921() {
            }

            /* renamed from: a */
            public NewestEp createFromParcel(Parcel parcel) {
                return new NewestEp(parcel);
            }

            /* renamed from: a */
            public NewestEp[] newArray(int i) {
                return new NewestEp[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected NewestEp(Parcel parcel) {
            this.f5751id = parcel.readLong();
            this.title = parcel.readString();
            this.desc = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f5751id);
            parcel.writeString(this.title);
            parcel.writeString(this.desc);
        }
    }

    @Keep
    /* compiled from: BL */
    public static class Notice implements Parcelable {
        public static final Creator<Notice> CREATOR = new C18931();
        public String desc;
        public String url;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.uniform.BangumiUniformSeason$Notice$1 */
        static class C18931 implements Creator<Notice> {
            C18931() {
            }

            /* renamed from: a */
            public Notice createFromParcel(Parcel parcel) {
                return new Notice(parcel);
            }

            /* renamed from: a */
            public Notice[] newArray(int i) {
                return new Notice[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected Notice(Parcel parcel) {
            this.url = parcel.readString();
            this.desc = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.url);
            parcel.writeString(this.desc);
        }
    }

    @Keep
    /* compiled from: BL */
    public static class Rating implements Parcelable {
        public static final Creator<Rating> CREATOR = new C18941();
        public String count;
        public float score;

        /* compiled from: BL */
        /* renamed from: com.bilibili.bangumi.api.uniform.BangumiUniformSeason$Rating$1 */
        static class C18941 implements Creator<Rating> {
            C18941() {
            }

            /* renamed from: a */
            public Rating createFromParcel(Parcel parcel) {
                return new Rating(parcel);
            }

            /* renamed from: a */
            public Rating[] newArray(int i) {
                return new Rating[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected Rating(Parcel parcel) {
            this.score = parcel.readFloat();
            this.count = parcel.readString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.score);
            parcel.writeString(this.count);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bangumi.api.uniform.BangumiUniformSeason$a */
    public static class C1895a {
        /* renamed from: a */
        public static final Integer f5752a = Integer.valueOf(0);
        /* renamed from: b */
        public static final Integer f5753b = Integer.valueOf(1);
        /* renamed from: c */
        public static final Integer f5754c = Integer.valueOf(2);
        /* renamed from: d */
        public static final Integer f5755d = Integer.valueOf(3);
        /* renamed from: e */
        public static final Integer f5756e = Integer.valueOf(4);
        /* renamed from: f */
        public static final Integer f5757f = Integer.valueOf(5);
        /* renamed from: g */
        public static final Integer f5758g = Integer.valueOf(6);
    }

    public int describeContents() {
        return 0;
    }

    protected BangumiUniformSeason(Parcel parcel) {
        this.seasonId = parcel.readString();
        this.mediaId = parcel.readString();
        this.title = parcel.readString();
        this.seasonTitle = parcel.readString();
        this.cover = parcel.readString();
        this.squareCover = parcel.readString();
        this.shareUrl = parcel.readString();
        this.shareCopy = parcel.readString();
        this.subtitle = parcel.readString();
        this.shortLink = parcel.readString();
        this.evaluate = parcel.readString();
        this.link = parcel.readString();
        this.seasonType = parcel.readInt();
        this.status = parcel.readInt();
        this.totalEp = parcel.readInt();
        this.mode = parcel.readInt();
        this.record = parcel.readString();
        this.series = (Series) parcel.readParcelable(Series.class.getClassLoader());
        this.stat = (Stat) parcel.readParcelable(Stat.class.getClassLoader());
        this.rights = (Right) parcel.readParcelable(Right.class.getClassLoader());
        this.newestEp = (NewestEp) parcel.readParcelable(NewestEp.class.getClassLoader());
        this.publish = (Publish) parcel.readParcelable(Publish.class.getClassLoader());
        this.rating = (Rating) parcel.readParcelable(Rating.class.getClassLoader());
        this.seasons = parcel.createTypedArrayList(CREATOR);
        this.playerIcon = (VideoPlayerIcon) parcel.readParcelable(VideoPlayerIcon.class.getClassLoader());
        this.userStatus = (BangumiUserStatus) parcel.readParcelable(BangumiUserStatus.class.getClassLoader());
        this.payment = (Payment) parcel.readParcelable(Payment.class.getClassLoader());
        this.upInfo = (UpInfo) parcel.readParcelable(UpInfo.class.getClassLoader());
        this.paster = (Paster) parcel.readParcelable(Paster.class.getClassLoader());
        this.musicMenus = parcel.createTypedArrayList(MusicMenu.CREATOR);
        this.sponsorRank = (BangumiSponsorRankSummary) parcel.readParcelable(BangumiSponsorRankSummary.class.getClassLoader());
        this.operationActivities = (BangumiOperationActivities) parcel.readParcelable(BangumiOperationActivities.class.getClassLoader());
        this.notice = (Notice) parcel.readParcelable(Notice.class.getClassLoader());
        this.isNew = parcel.readByte() != (byte) 0;
        this.prevueSection = parcel.createTypedArrayList(BangumiUniformPrevueSection.CREATOR);
        this.userRating = (BangumiUserRating) parcel.readParcelable(BangumiUserRating.class.getClassLoader());
        this.episodes = parcel.createTypedArrayList(BangumiUniformEpisode.CREATOR);
        this.seasonLimit = (BangumiSeasonLimit) parcel.readParcelable(BangumiSeasonLimit.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.seasonId);
        parcel.writeString(this.mediaId);
        parcel.writeString(this.title);
        parcel.writeString(this.seasonTitle);
        parcel.writeString(this.cover);
        parcel.writeString(this.squareCover);
        parcel.writeString(this.shareUrl);
        parcel.writeString(this.shareCopy);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.shortLink);
        parcel.writeString(this.evaluate);
        parcel.writeString(this.link);
        parcel.writeInt(this.seasonType);
        parcel.writeInt(this.status);
        parcel.writeInt(this.totalEp);
        parcel.writeInt(this.mode);
        parcel.writeString(this.record);
        parcel.writeParcelable(this.series, i);
        parcel.writeParcelable(this.stat, i);
        parcel.writeParcelable(this.rights, i);
        parcel.writeParcelable(this.newestEp, i);
        parcel.writeParcelable(this.publish, i);
        parcel.writeParcelable(this.rating, i);
        parcel.writeTypedList(this.seasons);
        parcel.writeParcelable(this.playerIcon, i);
        parcel.writeParcelable(this.userStatus, i);
        parcel.writeParcelable(this.payment, i);
        parcel.writeParcelable(this.upInfo, i);
        parcel.writeParcelable(this.paster, i);
        parcel.writeTypedList(this.musicMenus);
        parcel.writeParcelable(this.sponsorRank, i);
        parcel.writeParcelable(this.operationActivities, i);
        parcel.writeParcelable(this.notice, i);
        parcel.writeByte((byte) (this.isNew?1:0));
        parcel.writeTypedList(this.prevueSection);
        parcel.writeParcelable(this.userRating, i);
        parcel.writeTypedList(this.episodes);
        parcel.writeParcelable(this.seasonLimit, i);
    }

    public void increaseCoin(long j) {
        if (this.stat != null) {
            Stat stat = this.stat;
            stat.coins += j;
        }
    }

    public void increaseShare() {
        if (this.stat != null) {
            Stat stat = this.stat;
            stat.share++;
        }
    }

    public void increaseComment() {
        if (this.stat != null) {
            Stat stat = this.stat;
            stat.reply++;
        }
    }

    public long getCoinCount() {
        return this.stat != null ? this.stat.coins : 0;
    }

    public long getShareCount() {
        return this.stat != null ? this.stat.share : 0;
    }
}
