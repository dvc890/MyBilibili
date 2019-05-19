package com.dvc.base;

import java.util.List;


public interface BaseLoadMoreView<T> extends BaseView {
    void loadMoreFailed();

    void noMoreData();

    void setMoreData(List<T> moreData);

    void loadData(boolean pullToRefresh, boolean cleanCache);

    void setData(List<T> data);
}
