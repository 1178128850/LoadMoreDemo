package obe.killua.loadmoredemo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.aspsine.swipetoloadlayout.SwipeRefreshTrigger;
import com.aspsine.swipetoloadlayout.SwipeTrigger;

import org.w3c.dom.Text;

import static android.content.ContentValues.TAG;

/**
 * Created by Administrator on 2018/6/22.
 */

public class MyHeaderView extends RelativeLayout implements SwipeRefreshTrigger,SwipeTrigger{

    private TextView textView;

    public MyHeaderView(Context context) {
        super(context);
    }

    public MyHeaderView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyHeaderView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        textView = new TextView(context);
        addView(textView);
    }

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
