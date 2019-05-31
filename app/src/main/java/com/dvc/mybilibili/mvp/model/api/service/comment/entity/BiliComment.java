package com.dvc.mybilibili.mvp.model.api.service.comment.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.BiliLevelInfo;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.OfficialVerify;
import com.dvc.mybilibili.mvp.model.api.service.account.entity.VipExtraUserInfo;

import java.util.ArrayList;
import java.util.List;

@Keep
/* compiled from: BL */
public final class BiliComment implements Parcelable, MultiItemEntity {
    public static final int ACTION_HATE = 2;
    public static final int ACTION_LIKE = 1;
    public static final int ATTR_TOP_OPERATIONAL = 1;
    public static final int ATTR_TOP_UPPER = 2;
    public static final int ATTR_TOP_VOTE = 64;
    public static final Creator<BiliComment> CREATOR = new C18051();
    @JSONField(name = "action")
    public int isParised;
    @JSONField(name = "assist")
    public int mAssistant;
    @JSONField(name = "attr")
    public int mAttr;
    @JSONField(name = "content")
    public Content mContent;
    @JSONField(name = "dialog")
    public long mDialog;
    @JSONField(name = "fansgrade")
    public int mFansGrade;
    @JSONField(name = "floor")
    public int mFloor;
    @JSONField(name = "folder")
    public BiliCommentFolder mFolder;
    @JSONField(name = "hate")
    public int mHateCount;
    @JSONField(name = "label")
    public Label mLabel;
    @JSONField(name = "member")
    public Member mMember;
    @JSONField(name = "mid")
    public long mMid;
    @JSONField(name = "oid")
    public long mOid;
    @JSONField(name = "parent")
    public long mParentId;
    @JSONField(name = "ctime")
    public long mPubTimeMs;
    @JSONField(name = "like")
    public int mRatingCount;
    @JSONField(name = "replies")
    public List<BiliComment> mReply;
    @JSONField(name = "rcount")
    public int mReplyCount;
    @JSONField(name = "root")
    public long mRootId;
    @JSONField(name = "rpid")
    public long mRpId;
    @JSONField(name = "state")
    public int mState;
    @JSONField(name = "count")
    public int mTotalReplyCount;
    @JSONField(name = "type")
    public int mType;
    @JSONField(name = "up_action")
    public UpperAction mUpperAction;

    public int ItemType = 1;

    public BiliComment() {
    }

    @Override
    public int getItemType() {
        return ItemType;
    }

    @Keep
    /* compiled from: BL */
    public static class Content implements Parcelable {
        public static final Creator<Content> CREATOR = new C17991();
        @JSONField(name = "device")
        public String mDevice;
        @JSONField(name = "members")
        public ArrayList<Member> mMembers;
        @JSONField(name = "message")
        public String mMsg;
        @JSONField(name = "plat")
        public int mPlatform;
        @JSONField(name = "vote")
        public Vote mVote;
        @JSONField(name = "topics")
        public ArrayList<String> topics;

        public Content() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.app.comm.comment2.model.BiliComment$Content$1 */
        static class C17991 implements Creator<Content> {
            C17991() {
            }

            /* renamed from: a */
            public Content createFromParcel(Parcel parcel) {
                return new Content(parcel, null);
            }

            /* renamed from: a */
            public Content[] newArray(int i) {
                return new Content[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        /* synthetic */ Content(Parcel parcel, C18051 c18051) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mMsg);
            parcel.writeParcelable(this.mVote, i);
            parcel.writeString(this.mDevice);
            parcel.writeInt(this.mPlatform);
        }

        private Content(Parcel parcel) {
            this.mMsg = parcel.readString();
            this.mVote = (Vote) parcel.readParcelable(Vote.class.getClassLoader());
            this.mDevice = parcel.readString();
            this.mPlatform = parcel.readInt();
        }
    }

    @Keep
    /* compiled from: BL */
    public static class FansDetail implements Parcelable {
        public static final Creator<FansDetail> CREATOR = new C18001();
        @JSONField(name = "level")
        public int mFansLevel;
        @JSONField(name = "score")
        public int mFansScore;
        @JSONField(name = "intimacy")
        public String mIntimacy;
        @JSONField(name = "is_receive")
        public int mIsReceive;
        @JSONField(name = "master_status")
        public int mMasterStatus;
        @JSONField(name = "uid")
        public long mUid;
        @JSONField(name = "medal_id")
        public long medalId;
        @JSONField(name = "medal_name")
        public String medalName;

        public FansDetail() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.app.comm.comment2.model.BiliComment$FansDetail$1 */
        static class C18001 implements Creator<FansDetail> {
            C18001() {
            }

            /* renamed from: a */
            public FansDetail createFromParcel(Parcel parcel) {
                return new FansDetail(parcel);
            }

            /* renamed from: a */
            public FansDetail[] newArray(int i) {
                return new FansDetail[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected FansDetail(Parcel parcel) {
            this.medalId = parcel.readLong();
            this.medalName = parcel.readString();
            this.mUid = parcel.readLong();
            this.mFansScore = parcel.readInt();
            this.mFansLevel = parcel.readInt();
            this.mIntimacy = parcel.readString();
            this.mMasterStatus = parcel.readInt();
            this.mIsReceive = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.medalId);
            parcel.writeString(this.medalName);
            parcel.writeLong(this.mUid);
            parcel.writeInt(this.mFansScore);
            parcel.writeInt(this.mFansLevel);
            parcel.writeString(this.mIntimacy);
            parcel.writeInt(this.mMasterStatus);
            parcel.writeInt(this.mIsReceive);
        }
    }

    /* compiled from: BL */
    public static class Label implements Parcelable {
        public static final Creator<Label> CREATOR = new C18011();
        @JSONField(name = "rpid")
        /* renamed from: a */
        public long f5596a;
        @JSONField(name = "content")
        /* renamed from: b */
        public String f5597b;
        @JSONField(name = "text_color")
        /* renamed from: c */
        public String f5598c;
        @JSONField(name = "text_color_n")
        /* renamed from: d */
        public String f5599d;
        @JSONField(name = "bg_color")
        /* renamed from: e */
        public String f5600e;
        @JSONField(name = "bg_color_n")
        /* renamed from: f */
        public String f5601f;
        @JSONField(name = "link")
        /* renamed from: g */
        public String f5602g;
        @JSONField(name = "position")
        /* renamed from: h */
        public String f5603h;

        public Label() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.app.comm.comment2.model.BiliComment$Label$1 */
        static class C18011 implements Creator<Label> {
            C18011() {
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

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f5596a);
            parcel.writeString(this.f5597b);
            parcel.writeString(this.f5598c);
            parcel.writeString(this.f5599d);
            parcel.writeString(this.f5600e);
            parcel.writeString(this.f5601f);
            parcel.writeString(this.f5602g);
            parcel.writeString(this.f5603h);
        }

        protected Label(Parcel parcel) {
            this.f5596a = parcel.readLong();
            this.f5597b = parcel.readString();
            this.f5598c = parcel.readString();
            this.f5599d = parcel.readString();
            this.f5600e = parcel.readString();
            this.f5601f = parcel.readString();
            this.f5602g = parcel.readString();
            this.f5603h = parcel.readString();
        }
    }

    @Keep
    /* compiled from: BL */
    public static class Member implements Parcelable {
        public static final Creator<Member> CREATOR = new C18021();
        @JSONField(name = "avatar")
        public String mFace;
        @JSONField(name = "fans_detail")
        public FansDetail mFansDetail;
        @JSONField(name = "following")
        public int mFollowing;
        @JSONField(name = "sex")
        public String mGender;
        @JSONField(name = "level_info")
        public BiliLevelInfo mLevelInfo;
        @JSONField(name = "mid")
        public String mMid;
        @JSONField(name = "uname")
        public String mNick;
        @JSONField(name = "rank")
        public String mRank;
        @JSONField(name = "sign")
        public String mSign;
        @JSONField(name = "nameplate")
        public NamePlate nameplate;
        @JSONField(name = "official_verify")
        public OfficialVerify officialVerify;
        @JSONField(name = "pendant")
        public BiliPendant pendant;
        @JSONField(name = "vip")
        public VipExtraUserInfo vipInfo;

        public Member() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.app.comm.comment2.model.BiliComment$Member$1 */
        static class C18021 implements Creator<Member> {
            C18021() {
            }

            /* renamed from: a */
            public Member createFromParcel(Parcel parcel) {
                return new Member(parcel, null);
            }

            /* renamed from: a */
            public Member[] newArray(int i) {
                return new Member[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        /* synthetic */ Member(Parcel parcel, C18051 c18051) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mMid);
            parcel.writeString(this.mFace);
            parcel.writeString(this.mNick);
            parcel.writeString(this.mGender);
            parcel.writeString(this.mSign);
            parcel.writeString(this.mRank);
            parcel.writeParcelable(this.mLevelInfo, 0);
            parcel.writeParcelable(this.vipInfo, 0);
            parcel.writeParcelable(this.pendant, 0);
            parcel.writeParcelable(this.mFansDetail, 0);
            parcel.writeInt(this.mFollowing);
        }

        private Member(Parcel parcel) {
            this.mMid = parcel.readString();
            this.mFace = parcel.readString();
            this.mNick = parcel.readString();
            this.mGender = parcel.readString();
            this.mSign = parcel.readString();
            this.mRank = parcel.readString();
            this.mLevelInfo = (BiliLevelInfo) parcel.readParcelable(BiliLevelInfo.class.getClassLoader());
            this.vipInfo = (VipExtraUserInfo) parcel.readParcelable(VipExtraUserInfo.class.getClassLoader());
            this.pendant = (BiliPendant) parcel.readParcelable(BiliPendant.class.getClassLoader());
            this.mFansDetail = (FansDetail) parcel.readParcelable(FansDetail.class.getClassLoader());
            this.mFollowing = parcel.readInt();
        }
    }

    @Keep
    /* compiled from: BL */
    public static class NamePlate {
        @JSONField(name = "condition")
        public String condition;
        @JSONField(name = "image")
        public String image;
        @JSONField(name = "level")
        public String level;
        @JSONField(name = "name")
        public String name;
        @JSONField(name = "nid")
        public int nid;
    }

    @Keep
    /* compiled from: BL */
    public static class UpperAction implements Parcelable {
        public static final Creator<UpperAction> CREATOR = new C18031();
        @JSONField(name = "like")
        public boolean mIsLike;
        @JSONField(name = "reply")
        public boolean mIsReply;

        public UpperAction() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.app.comm.comment2.model.BiliComment$UpperAction$1 */
        static class C18031 implements Creator<UpperAction> {
            C18031() {
            }

            /* renamed from: a */
            public UpperAction createFromParcel(Parcel parcel) {
                return new UpperAction(parcel);
            }

            /* renamed from: a */
            public UpperAction[] newArray(int i) {
                return new UpperAction[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        protected UpperAction(Parcel parcel) {
            boolean z = false;
            this.mIsLike = parcel.readByte() != (byte) 0;
            if (parcel.readByte() != (byte) 0) {
                z = true;
            }
            this.mIsReply = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte((byte) (this.mIsLike?1:0));
            parcel.writeByte((byte) (this.mIsReply?1:0));
        }
    }

    @Keep
    /* compiled from: BL */
    public static class Vote implements Parcelable {
        public static final Creator<Vote> CREATOR = new C18041();
        @JSONField(name = "cnt")
        public int cnt;
        @JSONField(name = "id")
        /* renamed from: id */
        public long f5604id;
        @JSONField(name = "title")
        public String title;

        public Vote() {
        }

        /* compiled from: BL */
        /* renamed from: com.bilibili.app.comm.comment2.model.BiliComment$Vote$1 */
        static class C18041 implements Creator<Vote> {
            C18041() {
            }

            /* renamed from: a */
            public Vote createFromParcel(Parcel parcel) {
                return new Vote(parcel, null);
            }

            /* renamed from: a */
            public Vote[] newArray(int i) {
                return new Vote[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        /* synthetic */ Vote(Parcel parcel, C18051 c18051) {
            this(parcel);
        }

        private Vote(Parcel parcel) {
            this.f5604id = parcel.readLong();
            this.title = parcel.readString();
            this.cnt = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f5604id);
            parcel.writeString(this.title);
            parcel.writeInt(this.cnt);
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.app.comm.comment2.model.BiliComment$1 */
    static class C18051 implements Creator<BiliComment> {
        C18051() {
        }

        /* renamed from: a */
        public BiliComment createFromParcel(Parcel parcel) {
            return new BiliComment(parcel, null);
        }

        /* renamed from: a */
        public BiliComment[] newArray(int i) {
            return new BiliComment[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    /* synthetic */ BiliComment(Parcel parcel, C18051 c18051) {
        this(parcel);
    }

    public String getNickName() {
        if (this.mMember == null) {
            return "";
        }
        return this.mMember.mNick;
    }

    public boolean isBlocked() {
        return this.mState == 9;
    }

    public boolean isUserAssistant() {
        return this.mAssistant == 1;
    }

    public boolean isUserFans() {
        return this.mFansGrade > 0;
    }

    public boolean isVip() {
        return this.mMember.vipInfo.isEffectiveVip();
    }

    public String getFace() {
        if (this.mMember == null) {
            return "";
        }
        return this.mMember.mFace;
    }

    public String getMsg() {
        if (this.mContent == null) {
            return "";
        }
        return this.mContent.mMsg;
    }

    public int getCurrentLevel() {
        return (this.mMember == null || this.mMember.mLevelInfo == null) ? 0 : this.mMember.mLevelInfo.current_level;
    }

    public OfficialVerify getOfficialVerify() {
        return this.mMember != null ? this.mMember.officialVerify : null;
    }

    public BiliPendant getPendant() {
        return this.mMember != null ? this.mMember.pendant : null;
    }

    public boolean isRoot() {
        return this.mRootId == 0;
    }

    public boolean isReplyRoot() {
        return this.mRootId == this.mParentId;
    }

    public boolean isTop() {
        return ((this.mAttr & 1) == 0 && (this.mAttr & 2) == 0 && (this.mAttr & 64) == 0) ? false : true;
    }

    public boolean isUpperTop() {
        return (this.mAttr & 2) != 0;
    }

    public boolean isOpTop() {
        return (this.mAttr & 1) != 0;
    }

    public boolean isFollowed() {
        return this.mMember != null && this.mMember.mFollowing == 1;
    }

    public boolean isUpperLiked() {
        return this.mUpperAction != null && this.mUpperAction.mIsLike;
    }

    public boolean isUpperReplied() {
        return this.mUpperAction != null && this.mUpperAction.mIsReply;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BiliComment{, mMid=");
        stringBuilder.append(this.mMid);
        stringBuilder.append(", mFloor=");
        stringBuilder.append(this.mFloor);
        stringBuilder.append(", mRpId=");
        stringBuilder.append(this.mRpId);
        stringBuilder.append(", mRatingCount=");
        stringBuilder.append(this.mRatingCount);
        stringBuilder.append(", mReplyCount=");
        stringBuilder.append(this.mReplyCount);
        stringBuilder.append(", mReply=");
        stringBuilder.append(this.mReply);
        stringBuilder.append(", mPubTimeMs=");
        stringBuilder.append(this.mPubTimeMs);
//        stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mFansGrade);
        parcel.writeInt(this.mAssistant);
        parcel.writeLong(this.mMid);
        parcel.writeLong(this.mDialog);
        parcel.writeLong(this.mOid);
        parcel.writeInt(this.mType);
        parcel.writeLong(this.mRpId);
        parcel.writeLong(this.mRootId);
        parcel.writeLong(this.mParentId);
        parcel.writeInt(this.mTotalReplyCount);
        parcel.writeInt(this.mReplyCount);
        parcel.writeInt(this.mFloor);
        parcel.writeInt(this.mState);
        parcel.writeInt(this.mRatingCount);
        parcel.writeInt(this.mHateCount);
        parcel.writeInt(this.isParised);
        parcel.writeLong(this.mPubTimeMs);
        parcel.writeParcelable(this.mMember, 0);
        parcel.writeParcelable(this.mContent, 0);
        parcel.writeParcelable(this.mUpperAction, 0);
        parcel.writeParcelable(this.mLabel, 0);
    }

    private BiliComment(Parcel parcel) {
        this.mFansGrade = parcel.readInt();
        this.mAssistant = parcel.readInt();
        this.mMid = parcel.readLong();
        this.mDialog = parcel.readLong();
        this.mOid = parcel.readLong();
        this.mType = parcel.readInt();
        this.mRpId = parcel.readLong();
        this.mRootId = parcel.readLong();
        this.mParentId = parcel.readLong();
        this.mTotalReplyCount = parcel.readInt();
        this.mReplyCount = parcel.readInt();
        this.mFloor = parcel.readInt();
        this.mState = parcel.readInt();
        this.mRatingCount = parcel.readInt();
        this.mHateCount = parcel.readInt();
        this.isParised = parcel.readInt();
        this.mPubTimeMs = parcel.readLong();
        this.mMember = (Member) parcel.readParcelable(Member.class.getClassLoader());
        this.mContent = (Content) parcel.readParcelable(Content.class.getClassLoader());
        this.mUpperAction = (UpperAction) parcel.readParcelable(UpperAction.class.getClassLoader());
        this.mLabel = (Label) parcel.readParcelable(Label.class.getClassLoader());
    }
}
