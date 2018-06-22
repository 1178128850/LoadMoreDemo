package obe.killua.loadmoredemo.controller;


import java.util.List;

import obe.killua.loadmoredemo.R;
import obe.killua.loadmoredemo.bean.BaseRecyclerBean;
import obe.killua.loadmoredemo.bean.GameBean;

/**
 * Created by Administrator on 2018/6/13.
 */

public class DataController {

    public static List<BaseRecyclerBean> upData(List<BaseRecyclerBean> datas){
        for (int i=0;i<100;i++){
            datas.add(new GameBean("com.youjoy.strugglelandlord","5350d7059c5251b92900000a",R.mipmap.ic_launcher,3));//欢乐斗地主
        }
        return datas;
    }
}





/*
datas.add(new GameBean("com.youjoy.strugglelandlord","5350d7059c5251b92900000a",R.drawable.game_1,8));//欢乐斗地主
datas.add(new GameBean("com.hihex.game.angrybirds.android","5541e2f3d63b40d2778d3357",R.drawable.game_2,4));//愤怒的小鸟
datas.add(new GameBean("com.carrot.carrotfantasy","51b0424f27ff96e03893718b",R.drawable.game_3,4));//保卫萝卜
datas.add(new GameBean("com.xm.ddz.shafatv","540ebb64f4d8c2f7385ff076",R.drawable.game_4,4));//家有德扑
datas.add(new GameBean("com.minicliphr.subwaysurfing","534bb0923bf55d6451000033",R.drawable.game_5,4));//开心酷跑

datas.add(new GameBean("com.appleseed.thunder2015","555adfd576437caf7777f967",R.drawable.game_leidian,4));
datas.add(new GameBean("air.TimerMan","53d62e4f726e096d3c3e5891",R.drawable.game_fm,4));
datas.add(new GameBean("com.fangchenggame.FishingJoyExpandTV","5562d565726e091d6b835b58",R.drawable.game_py,4));
datas.add(new GameBean("com.holyblade.aoteman.game","569f3aaa396392d1232398c1",R.drawable.game_atm,4));

datas.add(new GameBean("com.fingersoft.hillclimb.noncmcc.tv","56601ffaba681cff3d487f72",R.drawable.game_dssc,4));
datas.add(new GameBean("com.stvgame.sango2","59f15caed26aa2d714537d73",R.drawable.game_hlsg,4));
datas.add(new GameBean("com.meiriq.game.androidtv.matchstickmen","56397307b693a9c13838a7ea",R.drawable.game_hcr,4));
datas.add(new GameBean("gameengine.jvhe.unifyplatform.ndk.stg2tv","5372e49e9c5251cc1d000001",R.drawable.game_ld,4));


datas.add(new GameBean("","",R.drawable.game_6,4));//镇魂曲
datas.add(new GameBean("","",R.drawable.game_7,4));//大话西游
datas.add(new GameBean("","",R.drawable.game_8,4));//玩具大乱斗
datas.add(new GameBean("","",R.drawable.game_9,4));//孤岛先锋
GameBean gameBean = new GameBean();
gameBean.setViewType(R.layout.item_recycle_gengduo);
gameBean.setItem_SpanSize(4);
datas.add(gameBean);*/
