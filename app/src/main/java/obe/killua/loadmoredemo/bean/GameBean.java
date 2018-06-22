package obe.killua.loadmoredemo.bean;


import obe.killua.loadmoredemo.BR;
import obe.killua.loadmoredemo.R;

/**
 * Created by Administrator on 2018/5/10.
 */

public class GameBean extends BaseRecyclerBean {

    String id;
    String packageName;
    int imgResource;
    String imgSrc;

    public GameBean(String packageName,String id,int imgResource, int spanSize) {
        this.packageName = packageName;
        this.id = id;
        this.imgResource = imgResource;
        setViewType(R.layout.item_recycle_game);
        setItem_bindingkey(BR.gameBean);
        this.setItem_SpanSize(spanSize);
    }

    public GameBean(){
        setViewType(R.layout.item_recycle_game);
        setItem_bindingkey(BR.gameBean);
        setItem_SpanSize(3);
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public int getImgResource() {
        return imgResource;
    }

    public void setImgResource(int imgResource) {
        this.imgResource = imgResource;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }
}
