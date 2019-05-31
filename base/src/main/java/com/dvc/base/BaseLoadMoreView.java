package com.dvc.base;

public interface BaseLoadMoreView<T> extends BaseView {

    void loadData(boolean pullToRefresh, boolean cleanCache);

    void loadMoreDataComplete(T moreData);

    void loadDataCompleted(T data);

    void loadFailed(int code, String msg);

    void loadMoreFailed(int code, String msg);

    void noMoreData();
}
