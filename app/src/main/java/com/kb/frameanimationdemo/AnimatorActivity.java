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
 *
 * User: kanbin
 * Date: 2016/10/28
 */
public class AnimatorActivity extends AppCompatActivity {

    private ImageView mImageView1;
    private ImageView mImageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animator);

        mImageView1 = (ImageView) findViewById(R.id.iv1);
        mImageView2 = (ImageView) findViewById(R.id.iv2);
    }


    /**
     * 属性动画
     * @param view
     */
    public void changeY(View view) {
        ObjectAnimator.ofFloat(mImageView1, "translationY", mImageView1.getHeight()).start();
    }

    public void changeBackgroundColor(View view) {
        ObjectAnimator backgroundColor = ObjectAnimator.ofInt(mImageView2, "backgroundColor", 0xffff8080, 0xff8080ff);
        backgroundColor.setDuration(3000);
        backgroundColor.setEvaluator(new ArgbEvaluator());
        backgroundColor.setRepeatCount(ValueAnimator.INFINITE);
        backgroundColor.setRepeatMode(ValueAnimator.REVERSE);
        backgroundColor.start();
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
}
