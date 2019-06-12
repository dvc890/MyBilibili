package com.dvc.mybilibili.mvp.model.api.entity;

import android.support.annotation.Keep;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.List;

@Keep
public class DashMediaIndex {
    @JSONField(name = "id")
    public int id;
    @JSONField(name = "base_url")
    public String base_url;
    @JSONField(name = "bandwidth")
    public long bandwidth;
    @JSONField(name = "codecid")
    public int codecid;
    @JSONField(name = "backup_url")
    private List<String> backupUrl;
    @JSONField(name = "backupUrl")
    private List<String> backupUrl2;

    public DashMediaIndex() {}

    public List<String> getBackupUrl() {
        return this.backupUrl;
    }
}
