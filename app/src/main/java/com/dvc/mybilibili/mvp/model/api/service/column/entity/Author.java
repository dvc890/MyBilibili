package com.dvc.mybilibili.mvp.model.api.service.column.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;
import com.dvc.mybilibili.mvp.model.api.service.column.entity.Column.NamePlate;
import com.dvc.mybilibili.mvp.model.api.service.column.entity.Column.OfficialVerify;
import com.dvc.mybilibili.mvp.model.api.service.column.entity.Column.Pendant;
import com.dvc.mybilibili.mvp.model.api.service.column.entity.Column.Vip;

import java.io.Serializable;

@Keep
/* compiled from: BL */
public class Author implements Serializable {
    @JSONField(name = "attention")
    public boolean attention;
    @JSONField(name = "face")
    public String face;
    @JSONField(name = "mid")
    public long mid;
    @JSONField(name = "name")
    public String name;
    @JSONField(name = "nameplate")
    public NamePlate namePlate;
    @JSONField(name = "official_verify")
    public OfficialVerify officialVerify;
    @JSONField(name = "pendant")
    public Pendant pendant;
    @JSONField(name = "vip")
    public Vip vip;

    public NamePlate getNamePlate() {
        return this.namePlate;
    }

    public void setNamePlate(NamePlate namePlate) {
        this.namePlate = namePlate;
    }

    public Pendant getPendant() {
        return this.pendant;
    }

    public void setPendant(Pendant pendant) {
        this.pendant = pendant;
    }

    public OfficialVerify getOfficialVerify() {
        return this.officialVerify;
    }

    public void setOfficialVerify(OfficialVerify officialVerify) {
        this.officialVerify = officialVerify;
    }

    public long getMid() {
        return this.mid;
    }

    public void setMid(long j) {
        this.mid = j;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getFace() {
        return this.face;
    }

    public void setFace(String str) {
        this.face = str;
    }

    public boolean isAttention() {
        return this.attention;
    }

    public void setAttention(boolean z) {
        this.attention = z;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Author{mid=");
        stringBuilder.append(this.mid);
        stringBuilder.append(", name='");
        stringBuilder.append(this.name);
        stringBuilder.append('\'');
        stringBuilder.append(", face='");
        stringBuilder.append(this.face);
        stringBuilder.append('\'');
//            stringBuilder.append(JsonParserKt.END_OBJ);
        return stringBuilder.toString();
    }
}
