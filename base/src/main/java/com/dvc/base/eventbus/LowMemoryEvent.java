package com.dvc.base.eventbus;

public class LowMemoryEvent {
    private String tag;

    public LowMemoryEvent(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
