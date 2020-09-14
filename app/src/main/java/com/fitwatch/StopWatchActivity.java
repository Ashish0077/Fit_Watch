package com.fitwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class StopWatchActivity extends AppCompatActivity {

    Button btnstart;
    ImageView icanchor;
    Animation roundingalone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);

        btnstart = findViewById(R.id.btnstart);
        icanchor = findViewById(R.id.icanchor);

        roundingalone = AnimationUtils.loadAnimation(this, R.anim.roundingalone);

        Typeface MLight = Typeface.createFromAsset(getAssets(), "fonts/MLight.ttf");
        Typeface MMedium = Typeface.createFromAsset(getAssets(), "fonts/MMedium.ttf");
        Typeface MRegular = Typeface.createFromAsset(getAssets(), "fonts/MRegular.ttf");

        btnstart.setTypeface(MMedium);

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                icanchor.startAnimation(roundingalone);
            }
        });
    }
}