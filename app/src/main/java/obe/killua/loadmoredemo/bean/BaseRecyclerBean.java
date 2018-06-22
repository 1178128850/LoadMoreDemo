package obe.killua.loadmoredemo.bean;

import java.io.Serializable;

/**
 * Created by wangtao on 2017/12/12.
 */

public class BaseRecyclerBean implements Serializable {

    /**
     * 动态item多样式
     * */
    private int viewType = -1;

    /**
     * binding 数据与item进行绑定的key 通过BD.itemname设置
     * */
    private int item_bindingkey = -1;

    /**
     * 控制item跨行 跨列
     * */
    private int item_SpanSize = 1;

    public int getViewType() {
        return viewType;
    }

    public void setViewType(int viewType) {
        this.viewType = viewType;
    }

    public int getItem_bindingkey() {
        return item_bindingkey;
    }

    public void setItem_bindingkey(int item_bindingkey) {
        this.item_bindingkey = item_bindingkey;
    }

    public int getItem_SpanSize() {
        return item_SpanSize;
    }

    public void setItem_SpanSize(int item_SpanSize) {
        this.item_SpanSize = item_SpanSize;
    }
}
