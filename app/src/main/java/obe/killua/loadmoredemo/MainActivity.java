package obe.killua.loadmoredemo;

import android.database.DatabaseUtils;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;

import com.aspsine.swipetoloadlayout.OnLoadMoreListener;
import com.aspsine.swipetoloadlayout.OnRefreshListener;
import com.aspsine.swipetoloadlayout.SwipeToLoadLayout;

import obe.killua.loadmoredemo.adapter.MyRecyclerAdapter;
import obe.killua.loadmoredemo.controller.DataController;
import obe.killua.loadmoredemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding viewDataBinding;
    private MyRecyclerAdapter myRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 12, LinearLayoutManager.VERTICAL, false);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                return myRecyclerAdapter.getSpanSize(position);
            }
        });
        viewDataBinding.swipeTarget.setLayoutManager(gridLayoutManager);
        myRecyclerAdapter = new MyRecyclerAdapter(this);
        viewDataBinding.swipeTarget.setAdapter(myRecyclerAdapter);
        viewDataBinding.swipeLoadMore.setOnRefreshListener(() -> {
            viewDataBinding.swipeLoadMore.setRefreshing(false);
        });
        viewDataBinding.swipeLoadMore.setOnLoadMoreListener(() -> {
            viewDataBinding.swipeLoadMore.setLoadingMore(false);
        });
    }

    private void initData() {
        myRecyclerAdapter.setmDatas(DataController.upData(myRecyclerAdapter.getmDatas()));
        myRecyclerAdapter.notifyDataSetChanged();
    }
}
