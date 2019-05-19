package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity;

import android.graphics.Paint;
import android.support.annotation.Keep;
import android.widget.TextView;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;
import java.util.List;

@Keep
/* compiled from: BL */
public class BangumiFollowMine {
    @JSONField(name = "follow_count")
    public int mFollowCount;
    @JSONField(name = "follows")
    public List<BiliBangumiSeason> mFollowSeasons;
    @JSONField(name = "delay_notice")
    public List<BangumiDelayNotice> mNoticeList;
    @JSONField(name = "update_count")
    public int mUpdateCount;

    @Keep
    /* compiled from: BL */
    public static class BangumiDelayNotice {
        @JSONField(name = "date")
        public Date mDate;
        @JSONField(name = "ep_index")
        public String mDelayEp;
        @JSONField(name = "ep_id")
        public int mEpId;
        @JSONField(name = "id")
        public int mId;
        @JSONField(name = "ontime")
        public String mOntime;
        @JSONField(name = "pub_date")
        public String mPubDate;
        @JSONField(name = "season_id")
        public int mSeasonId;
        @JSONField(name = "season_status")
        public int mSeasonStatus;
        @JSONField(name = "title")
        public String mTitle;
        @JSONField(name = "pub_time")
        public String pubTime;
        @JSONField(name = "pub_ts")
        public long pubTs;

        public String getDelayString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\u300a");
            stringBuilder.append(this.mTitle);
            stringBuilder.append("\u300b");
            stringBuilder.append(this.mDelayEp);
            stringBuilder.append(this.mOntime);
            return stringBuilder.toString();
        }

        public String getDelayString(TextView textView) {
            Paint paint = textView.getPaint();
            float measuredWidth = (float) textView.getMeasuredWidth();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\u300b");
            stringBuilder.append(this.mDelayEp);
            stringBuilder.append(this.mOntime);
            float measureText = paint.measureText(stringBuilder.toString());
            float measureText2 = paint.measureText("\u300a");
            if (measuredWidth == 0.0f) {
                return getDelayString();
            }
            String str;
            String stringBuilder2;
            int breakText;
            if (measureText + measureText2 < measuredWidth) {
                measureText = (measuredWidth - measureText) - measureText2;
                if (paint.measureText(this.mTitle) <= measureText) {
                    return getDelayString();
                }
                StringBuilder stringBuilder3 = new StringBuilder();
                str = "\u2026";
                measureText2 = paint.measureText(str);
                int breakText2 = paint.breakText(this.mTitle.toCharArray(), 0, this.mTitle.length(), measureText - measureText2, null);
                if (breakText2 > 0) {
                    stringBuilder3.append("\u300a");
                    stringBuilder3.append(this.mTitle.substring(0, breakText2));
                    stringBuilder3.append(str);
                    stringBuilder3.append("\u300b");
                    stringBuilder3.append(this.mDelayEp);
                    stringBuilder3.append(this.mOntime);
                    return stringBuilder3.toString();
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("\u300a");
                stringBuilder.append(this.mTitle.charAt(0));
                stringBuilder.append(str);
                stringBuilder.append("\u300b");
                stringBuilder2 = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append(this.mDelayEp);
                stringBuilder.append(this.mOntime);
                str = stringBuilder.toString();
                stringBuilder = new StringBuilder();
                stringBuilder.append(stringBuilder2);
                stringBuilder.append(str);
                breakText = paint.breakText(stringBuilder.toString().toCharArray(), 0, str.length() + stringBuilder2.length(), measuredWidth, null);
                stringBuilder = new StringBuilder();
                stringBuilder.append(stringBuilder2);
                stringBuilder.append(str.substring(0, breakText - stringBuilder2.length()));
                return stringBuilder.toString();
            }
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("\u300a");
            stringBuilder4.append(this.mTitle.charAt(0));
            stringBuilder4.append("\u2026");
            stringBuilder4.append("\u300b");
            stringBuilder2 = stringBuilder4.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.mDelayEp);
            stringBuilder.append(this.mOntime);
            str = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringBuilder2);
            stringBuilder.append(str);
            breakText = paint.breakText(stringBuilder.toString().toCharArray(), 0, str.length() + stringBuilder2.length(), measuredWidth, null);
            stringBuilder = new StringBuilder();
            stringBuilder.append(stringBuilder2);
            stringBuilder.append(str.substring(0, breakText - stringBuilder2.length()));
            return stringBuilder.toString();
        }
    }
}
