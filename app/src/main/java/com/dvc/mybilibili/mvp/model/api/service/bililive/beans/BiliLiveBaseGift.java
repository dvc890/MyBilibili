package com.dvc.mybilibili.mvp.model.api.service.bililive.beans;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.Feature;

import java.util.HashMap;
import java.util.Map;

@Keep
/* compiled from: BL */
public class BiliLiveBaseGift implements Parcelable {
    public static final Creator<BiliLiveBaseGift> CREATOR = new C20002();
    public boolean isSelected;
    private Map<String, String> mCountMap;
    @JSONField(name = "count_map")
    public JSONObject mCountMapObject;
    @JSONField(name = "gif_url")
    public String mGifUrl;
    @JSONField(name = "id")
    public int mId;
    @JSONField(name = "name")
    public String mName;
    @JSONField(name = "img")
    public String mThumb;

    public BiliLiveBaseGift() {

    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveBaseGift$2 */
    static class C20002 implements Creator<BiliLiveBaseGift> {
        C20002() {
        }

        public BiliLiveBaseGift createFromParcel(Parcel parcel) {
            return new BiliLiveBaseGift(parcel);
        }

        public BiliLiveBaseGift[] newArray(int i) {
            return new BiliLiveBaseGift[i];
        }
    }

    /* compiled from: BL */
    /* renamed from: com.bilibili.bililive.videoliveplayer.net.beans.BiliLiveBaseGift$1 */
    class C20011 extends TypeReference<Map<String, String>> {
        C20011() {
        }
    }

    public int describeContents() {
        return 0;
    }

    public Map<String, String> getCountMap() {
        if (this.mCountMap == null && this.mCountMapObject != null) {
            try {
                this.mCountMap = (Map) JSON.parseObject(JSON.toJSONString(this.mCountMapObject), new C20011(), new Feature[0]);
            } catch (Exception unused) {
                this.mCountMap = new HashMap();
            }
        }
        return this.mCountMap;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mId);
        parcel.writeString(this.mName);
        parcel.writeString(this.mThumb);
        parcel.writeString(this.mGifUrl);
        parcel.writeByte(this.isSelected?(byte) 1:(byte) 0);
    }

    protected BiliLiveBaseGift(Parcel parcel) {
        this.mId = parcel.readInt();
        this.mName = parcel.readString();
        this.mThumb = parcel.readString();
        this.mGifUrl = parcel.readString();
        this.isSelected = parcel.readByte() != (byte) 0;
    }
}
