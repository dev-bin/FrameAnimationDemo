package com.kb.frameanimationdemo;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * 属性动画
 * Android开发艺术探索
 *
 * User: kanbin
 * Date: 2016/10/28
 */
public class AnimatorActivity extends AppCompatActivity {

    private ImageView mImageView1;
    private ImageView mImageView2;
    private ObjectAnimator mBackgroundColorAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animator);

        mImageView1 = (ImageView) findViewById(R.id.iv1);
        mImageView2 = (ImageView) findViewById(R.id.iv2);
    }

    /**
     * 实际开发中建议采用代码来实现属性动画，通过代码比较简单，并且很多时候一个属性的起始值无法提前确定，比如屏幕宽度
     */

    /**
     * 属性动画
     * @param view
     */
    public void changeY(View view) {
        ObjectAnimator.ofFloat(mImageView1, "translationY", mImageView1.getHeight()).start(); // 这里没有传递初始值，只提供了结束值
    }

    public void changeBackgroundColor(View view) {
        mBackgroundColorAnim = ObjectAnimator.ofInt(mImageView2, "backgroundColor", 0xffff8080, 0xff8080ff);
        mBackgroundColorAnim.setDuration(3000);
        mBackgroundColorAnim.setEvaluator(new ArgbEvaluator());
        mBackgroundColorAnim.setRepeatCount(ValueAnimator.INFINITE);
        mBackgroundColorAnim.setRepeatMode(ValueAnimator.REVERSE);
        mBackgroundColorAnim.start();
    }

    public void changeSet(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(
                ObjectAnimator.ofFloat(mImageView2, "translationY", 0, 90),
                ObjectAnimator.ofFloat(mImageView2, "translationX", 0, 90),
                ObjectAnimator.ofFloat(mImageView2, "alpha", 1, 0.25f, 1),
                ObjectAnimator.ofFloat(mImageView2, "rotationX", 0, 360),
                ObjectAnimator.ofFloat(mImageView2, "rotationY", 0, 180),
                ObjectAnimator.ofFloat(mImageView2, "rotation", 0, -90),
                ObjectAnimator.ofFloat(mImageView2, "scaleX", 1, 1.5f),
                ObjectAnimator.ofFloat(mImageView2, "scaleY", 1, 0.5f)
        );
        animatorSet.setDuration(5 * 1000).start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mBackgroundColorAnim.end();
    }
}
