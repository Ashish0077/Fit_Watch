package com.fitwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvSplash, tvSubSplash;
    Button btnget;
    ImageView ivSplash;
    Animation atg, btgOne, btgTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivSplash = findViewById(R.id.ivSplash);
        tvSplash = findViewById(R.id.tvSplash);
        tvSubSplash = findViewById(R.id.tvSubSplash);
        btnget = findViewById(R.id.btnget);

        atg = AnimationUtils.loadAnimation(this, R.anim.atg);
        btgOne = AnimationUtils.loadAnimation(this, R.anim.btgone);
        btgTwo = AnimationUtils.loadAnimation(this, R.anim.btgtwo);

        // passing time
        ivSplash.startAnimation(atg);
        tvSplash.startAnimation(btgOne);
        tvSubSplash.startAnimation(btgOne);
        btnget.startAnimation(btgTwo);
        // import font
        Typeface MLight = Typeface.createFromAsset(getAssets(), "fonts/MLight.ttf");
        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/MMedium.ttf");
        Typeface MRegular = Typeface.createFromAsset(getAssets(), "fonts/MRegular.ttf");

        btnget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent stopWatchActivity = new Intent(MainActivity.this, StopWatchActivity.class);
                stopWatchActivity.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(stopWatchActivity);
            }
        });

        // customize font
        tvSplash.setTypeface(MRegular);
        tvSubSplash.setTypeface(MLight);
        btnget.setTypeface(MMedium);
    }
}