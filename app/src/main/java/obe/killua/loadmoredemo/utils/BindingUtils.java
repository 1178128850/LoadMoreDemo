package obe.killua.loadmoredemo.utils;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import obe.killua.loadmoredemo.R;


/**
 * Created by wangtao on 2017/12/11.
 */

public class BindingUtils {

    @BindingAdapter({"showImg"})
    public static void showImg(ImageView iv, Drawable icon){
        iv.setImageDrawable(icon);
    }

    @BindingAdapter({"showImg"})
    public static void showImg(ImageView iv, int imgResource){
        Picasso.with(iv.getContext()).load(imgResource).transform(new RoundTransform((int) RudenessScreenHelper.pt2px(iv.getContext(),20))).fit().into(iv);
    }

    @BindingAdapter("htmltext")
    public static void htmltext(TextView tv,String html){
        tv.setText(Html.fromHtml(html));
    }

    @BindingAdapter("text")
    public static void text(TextView tv, String content){
        if(content!=null && content.length()>2){
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(content);
            CharacterStyle foregroundColorSpan = new ForegroundColorSpan(0xffF18100);
            spannableStringBuilder.setSpan(foregroundColorSpan,2,content.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            tv.setText(spannableStringBuilder);
        }else{
            tv.setText(content);
        }
    }
}
