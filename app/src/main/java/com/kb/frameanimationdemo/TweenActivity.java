package com.kb.frameanimationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class TweenActivity extends AppCompatActivity {
    private ImageView mImageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);

        mImageView2 = (ImageView) findViewById(R.id.iv2);

    }

    /**
     * 补间动画
     * @param view
     */
    public void tween(View view) {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_tween);
        mImageView2.startAnimation(animation);
    }

}
