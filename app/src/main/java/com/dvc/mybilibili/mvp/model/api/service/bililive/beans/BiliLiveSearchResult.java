package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
/* compiled from: BL */
public class BiliLiveSearchResult implements C2064d {
    @JSONField(name = "page")
    public int mPage;
    @JSONField(name = "pagesize")
    public int mPagesize;
    @JSONField(name = "room")
    public RoomResult mRooms;
    @JSONField(name = "type")
    public String mType;
    @JSONField(name = "user")
    public UserResult mUsers;

    @Keep
    /* compiled from: BL */
    public static class Room {
        @JSONField(name = "cover")
        public String mCover;
        @JSONField(name = "face")
        public String mFace;
        @JSONField(name = "name")
        public String mName;
        @JSONField(name = "online")
        public int mOnline;
        @JSONField(name = "roomid")
        public int mRoomid;
        @JSONField(name = "title")
        public String mTitle;
    }

    @Keep
    /* compiled from: BL */
    public static class RoomResult implements C2064d {
        @JSONField(name = "list")
        public List<Room> mList;
        @JSONField(name = "total_page")
        public int mTotalPage;
        @JSONField(name = "total_room")
        public int mTotalRoom;

        public int getTotalPage() {
            return this.mTotalPage;
        }
    }

    @Keep
    /* compiled from: BL */
    public static class UserResult implements C2064d {
        @JSONField(name = "list")
        public List<BiliLiveAnchor> mList;
        @JSONField(name = "total_page")
        public int mTotalPage;
        @JSONField(name = "total_user")
        public int mTotalUser;

        public int getTotalPage() {
            return this.mTotalPage;
        }
    }

    public int getTotalPage() {
        return -1;
    }

    public boolean isRoomEmpty() {
        return this.mRooms == null || this.mRooms.mList == null || this.mRooms.mList.isEmpty();
    }

    public boolean isUserEmpty() {
        return this.mUsers == null || this.mUsers.mList == null || this.mUsers.mList.isEmpty();
    }
}
