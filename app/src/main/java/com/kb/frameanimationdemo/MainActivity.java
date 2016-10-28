package com.kb.frameanimationdemo;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void gotoFrameAnimation(View view) {
        Intent intent = new Intent(this, FrameAnimationActivity.class);
        startActivity(intent);
    }

    public void gotoTweenAnimation(View view) {
        Intent intent = new Intent(this, TweenActivity.class);
        startActivity(intent);

    }

    public void gotoAnimator(View view) {
        Intent intent = new Intent(this, AnimatorActivity.class);
        startActivity(intent);

    }
}
