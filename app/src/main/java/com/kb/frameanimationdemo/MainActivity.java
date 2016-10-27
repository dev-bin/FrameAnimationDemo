package com.kb.frameanimationdemo;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageView;
    private AnimationDrawable mAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = (ImageView) findViewById(R.id.imageView);
        mAnim = (AnimationDrawable) mImageView.getBackground();
    }

    public void start(View view) {
        mAnim.start();
    }

    public void stop(View view) {
        mAnim.stop();
    }
}
