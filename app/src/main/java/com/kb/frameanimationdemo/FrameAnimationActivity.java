package com.kb.frameanimationdemo;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FrameAnimationActivity extends AppCompatActivity {
    private ImageView mImageView;
    private AnimationDrawable mAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_animation);

        mImageView = (ImageView) findViewById(R.id.iv1);
    }

    public void start(View view) {
        mImageView.setBackground(getResources().getDrawable(R.drawable.anim_frame));
        mAnim = (AnimationDrawable) mImageView.getBackground();
        mAnim.start();
    }

    public void start2(View view) {
        mImageView.setBackground(getResources().getDrawable(R.drawable.anim_frame2));
        mAnim = (AnimationDrawable) mImageView.getBackground();
        mAnim.start();
    }

    public void stop(View view) {
        mAnim.stop();
    }

}
