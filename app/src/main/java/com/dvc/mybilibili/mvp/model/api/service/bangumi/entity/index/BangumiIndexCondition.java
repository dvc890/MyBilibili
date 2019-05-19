package com.dvc.mybilibili.mvp.model.api.service.bangumi.entity.index;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.ArrayList;
import java.util.List;

@Keep
/* compiled from: BL */
public class BangumiIndexCondition {
    @JSONField(name = "filter")
    public List<Filter> filterList;
    public Order order;

    @Keep
    /* compiled from: BL */
    public static class Filter {
        /* renamed from: id */
        public String f5653id;
        @JSONField(deserialize = false, serialize = false)
        public boolean isExpand;
        public String name;
        public List<Item> value;

//        public PreSelectedFilter toSelectedFilter() {
//            ArrayList arrayList = new ArrayList(1);
//            if (this.value != null && this.value.size() >= 1) {
//                arrayList.add(((Item) this.value.get(0)).toSelectedItem());
//            }
//            return new PreSelectedFilter(this.f5653id, this.name, arrayList);
//        }
//
//        @Nullable
//        public Item select(PreSelectedFilter preSelectedFilter) {
//            if (this.f5653id.equals(preSelectedFilter.f15663a)) {
//                Item item = null;
//                for (Item item2 : this.value) {
//                    PreselectedFilterItem a = preSelectedFilter.mo26676a(item2.f5654id);
//                    item2.isSelect = a != null;
//                    if (a != null) {
//                        item = item2;
//                    }
//                }
//                if (item != null) {
//                    return item;
//                }
//            }
//            return null;
//        }
    }

    @Keep
    /* compiled from: BL */
    public static class Item {
        /* renamed from: id */
        public String f5654id;
        @JSONField(deserialize = false, serialize = false)
        public boolean isSelect;
        public String name;
        public String sort;

//        public PreselectedFilterItem toSelectedItem() {
//            return new PreselectedFilterItem(this.f5654id, this.name);
//        }
    }

    @Keep
    /* compiled from: BL */
    public static class Order {
        public String name;
        public List<Item> value;
    }
}
