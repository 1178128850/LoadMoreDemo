package obe.killua.loadmoredemo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import com.aspsine.swipetoloadlayout.SwipeLoadMoreTrigger;
import com.aspsine.swipetoloadlayout.SwipeTrigger;

/**
 * Created by Administrator on 2018/6/22.
 */

public class MyFooterView extends RelativeLayout implements SwipeLoadMoreTrigger,SwipeTrigger{

    public MyFooterView(Context context) {
        super(context);
    }

    public MyFooterView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyFooterView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void onLoadMore() {

    }

    @Override
    public void onPrepare() {

    }

    @Override
    public void onSwipe(int i, boolean b) {

    }

    @Override
    public void onRelease() {

    }

    @Override
    public void complete() {

    }

    @Override
    public void onReset() {

    }
}
