package com.dvc.base;

import java.util.List;

public interface BaseLoadMoreView<T> extends BaseView {

    void loadData(boolean pullToRefresh, boolean cleanCache);

    void loadMoreDataComplete(List<T> moreData);

    void loadDataCompleted(List<T> data);

    void loadFailed(int code, String msg);

    void loadMoreFailed(int code, String msg);

    void noMoreData();
}
