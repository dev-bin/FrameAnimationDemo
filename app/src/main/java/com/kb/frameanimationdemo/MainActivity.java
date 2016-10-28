package com.kb.frameanimationdemo;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView;
    private AnimationDrawable mAnim;
    private ImageView mImageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = (ImageView) findViewById(R.id.iv1);
        mAnim = (AnimationDrawable) mImageView.getBackground();

        mImageView2 = (ImageView) findViewById(R.id.iv2);
    }

    public void start(View view) {
        mAnim.start();
    }

    public void stop(View view) {
        mAnim.stop();
    }

    public void tween(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_tween);
        mImageView2.startAnimation(animation);
    }
}
