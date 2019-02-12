package com.myz.heightlightguidedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.samlss.lighter.Lighter;
import me.samlss.lighter.parameter.Direction;
import me.samlss.lighter.parameter.LighterParameter;
import me.samlss.lighter.parameter.MarginOffset;
import me.samlss.lighter.shape.OvalShape;
import me.samlss.lighter.shape.RectShape;

/**
 * @author myz
 * email:1024625196@qq.com
 * des:高亮引导demo
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initMultipleLight();
    }

    /**
     * 多次点击高亮
     */
    private void initMultipleLight(){
        Lighter.with(this).addHighlight(
                new LighterParameter.Builder()
                        .setHighlightedViewId(R.id.btn1)
                        .setTipLayoutId(R.layout.layout_tip_1)
                        .setLighterShape(new RectShape(5, 5, 30))
                        .setTipViewRelativeDirection(Direction.BOTTOM)
                        .setTipViewRelativeOffset(new MarginOffset(150, 0, 30, 0))
                        .build())
                .addHighlight(new LighterParameter.Builder()
                        .setHighlightedViewId(R.id.btn2)
                        .setTipLayoutId(R.layout.layout_tip_2)
                        .setLighterShape(new RectShape(5, 5, 30))
                        .setTipViewRelativeDirection(Direction.BOTTOM)
                        .setTipViewRelativeOffset(new MarginOffset(150, 0, 30, 0))
                        .build())
                .show();
    }

    /**
     * 一次多个高亮
     */
    private void initContinuousLight(){
        Lighter.with(this).addHighlight(
                new LighterParameter.Builder()
                        .setHighlightedViewId(R.id.btn1)
                        .setTipLayoutId(R.layout.layout_tip_1)
                        .setLighterShape(new RectShape(5, 5, 30))
                        .setTipViewRelativeDirection(Direction.BOTTOM)
                        .setTipViewRelativeOffset(new MarginOffset(150, 0, 30, 0))
                        .build(),
                new LighterParameter.Builder()
                        .setHighlightedViewId(R.id.btn2)
                        .setTipLayoutId(R.layout.layout_tip_2)
                        .setLighterShape(new RectShape(5, 5, 30))
                        .setTipViewRelativeDirection(Direction.BOTTOM)
                        .setTipViewRelativeOffset(new MarginOffset(150, 0, 30, 0))
                        .build()
        ).show();
    }

    /*第三方库git:https://github.com/samlss/Lighter/blob/master/README_CN.md*/
}
