# LoadMoreDemo 下拉刷新，上拉加载


        maven { url "https://jitpack.io" }

    implementation 'com.github.Aspsine:SwipeToLoadLayout:v1.0.2'

1 SwipeToLoadLayout 子view headview view footerview id必须固定为 swipe_refresh_header swipe_target swipe_load_more_footer

com.aspsine.swipetoloadlayout.SwipeToLoadLayout
        android:id="@+id/swipe_loadMore"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:refresh_enabled="true"
        app:load_more_enabled="true"
        app:swipe_style="blew">
        <obe.killua.loadmoredemo.view.MyHeaderView
            android:id="@id/swipe_refresh_header"
            android:layout_width="match_parent"
            android:layout_height="100dp">
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_centerInParent="true"
                android:text="下拉刷新"/>
        </obe.killua.loadmoredemo.view.MyHeaderView>
        <android.support.v7.widget.RecyclerView
            android:id="@+id/swipe_target"
            android:layout_width="match_parent"
            android:layout_height="match_parent"/>
        <obe.killua.loadmoredemo.view.MyFooterView
            android:id="@id/swipe_load_more_footer"
            android:layout_width="match_parent"
            android:layout_height="100dp">
            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_centerInParent="true"
                android:text="上拉加载"/>
        </obe.killua.loadmoredemo.view.MyFooterView>
    </com.aspsine.swipetoloadlayout.SwipeToLoadLayout>
2 
viewDataBinding.swipeLoadMore.setOnRefreshListener(() -> {
            viewDataBinding.swipeLoadMore.setRefreshing(false);
        });
viewDataBinding.swipeLoadMore.setOnLoadMoreListener(() -> {
    viewDataBinding.swipeLoadMore.setLoadingMore(false);
});

3 自定义下拉刷新 上拉加载 

 implements SwipeRefreshTrigger,SwipeTrigger
 implements SwipeLoadMoreTrigger,SwipeTrigger
 
    @Override
    public void onRefresh() {//刷新中
        Log.i(TAG, "onRefresh: ");
    }

    @Override
    public void onPrepare() {//开始 准备
        Log.i(TAG, "onPrepare: ");
    }

    @Override
    public void onSwipe(int i, boolean b) {//拖动过程
        Log.i(TAG, "onSwipe: "+i+b);
    }

    @Override
    public void onRelease() {//释放
        Log.i(TAG, "onRelease: ");
    }

    @Override
    public void complete() {//完成
        Log.i(TAG, "complete: ");
    }

    @Override
    public void onReset() {//重置
        Log.i(TAG, "onReset: ");
    }
}
