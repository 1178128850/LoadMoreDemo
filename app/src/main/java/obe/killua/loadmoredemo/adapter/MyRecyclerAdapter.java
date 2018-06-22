package obe.killua.loadmoredemo.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import obe.killua.loadmoredemo.bean.BaseRecyclerBean;

/**
 * Created by wangtao on 2017/12/11.
 * //通用recyclerview.adater
 *
 *   databinding list 数组写法
 <data>
 <import type="java.util.List" />
 <import type="com.jyzd.hytrading.adapter."/>

 <!--<variable
 name="datas"
 type="List&lt;BaseRecyclerBean&gt;" />-->

 </data>
 */

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyViewHolder> implements View.OnAttachStateChangeListener {


    private int focu_postion = -1;

    public void setFocu_postion(int focu_postion) {
        this.focu_postion = focu_postion;
    }

    @Override
    public void onViewAttachedToWindow(View v) {
        v.setFocusableInTouchMode(true);
        v.requestFocus();
        v.removeOnAttachStateChangeListener(this);
    }

    @Override
    public void onViewDetachedFromWindow(View v) {
        v.removeOnAttachStateChangeListener(this);
    }

    public interface OnitemListener{
        void onitemClick(View view, int position, BaseRecyclerBean baseRecyclerBean);
        void onitemFocusable(View view, boolean hasFocus, int position, BaseRecyclerBean baseRecyclerBean, int spanSize);
    }

    public interface OnLongClickListener{
        public boolean onLongClick(View v, int position);
    }

    private List<BaseRecyclerBean> mDatas = new ArrayList<>();

    private Context context;


    private OnitemListener onitemListener;

    private OnLongClickListener onLongClickListener;

    public OnLongClickListener getOnLongClickListener() {
        return onLongClickListener;
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        this.onLongClickListener = onLongClickListener;
    }

    public void setOnitemListener(OnitemListener onitemListener) {
        this.onitemListener = onitemListener;
    }

    public OnitemListener getOnitemListener() {
        return onitemListener;
    }

    public void setmDatas(List<BaseRecyclerBean> mDatas) {
        this.mDatas = mDatas;
    }

    public void addmDatas(List<BaseRecyclerBean> mDatas){
        this.mDatas.addAll(mDatas);
    }

    public void cleanDatas(){
        mDatas.clear();
    }

    public List<BaseRecyclerBean> getmDatas() {
        return mDatas;
    }

    public MyRecyclerAdapter(Context context){
        this.context = context;
    }

    public MyRecyclerAdapter(List<BaseRecyclerBean> mDatas, Context context) {
        this.mDatas = mDatas;
        this.context = context;
    }



    public void removedItem(int position){
        mDatas.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater from = LayoutInflater.from(context);
        ViewDataBinding viewDataBinding = DataBindingUtil.inflate(from, viewType, parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(viewDataBinding.getRoot());
        myViewHolder.setBinding(viewDataBinding);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        initFocuPostion(holder.getBinding().getRoot(),position);//init focu position
        holder.setIsRecyclable(false);//close itemview cache
        holder.getBinding().setVariable(mDatas.get(position).getItem_bindingkey(),mDatas.get(position));
        holder.getBinding().executePendingBindings();
        if(onitemListener != null){
            settingListener(holder,position);
        }
    }

    private void settingListener(MyViewHolder holder, int position) {
        holder.getBinding().getRoot().setOnClickListener(v -> {
            onitemListener.onitemClick(v,position,getmDatas().get(position));
        });
        holder.getBinding().getRoot().setOnFocusChangeListener((v, hasFocus) -> {
            onitemListener.onitemFocusable(v,hasFocus,position,getmDatas().get(position),getSpanSize(position));
        });
    }


    @Override
    public int getItemCount() {
        return mDatas == null ? 0 : mDatas.size();
    }

    @Override
    public int getItemViewType(int position) {
        if(mDatas == null){
            return -1;
        }else{
            return mDatas.get(position).getViewType();
        }
    }

    public int getSpanSize(int position) {
        if(mDatas == null){
            return 0;
        }else{
            return mDatas.get(position).getItem_SpanSize();
        }
    }

    private void initFocuPostion(View view,int position){
        if(focu_postion >= getItemCount()){
            focu_postion  = getItemCount()-1;
        }
        if(focu_postion == position){
            view.addOnAttachStateChangeListener(this);
        }
    }
}
