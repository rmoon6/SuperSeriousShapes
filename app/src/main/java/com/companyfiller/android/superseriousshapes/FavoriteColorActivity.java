package com.companyfiller.android.superseriousshapes;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Chase on 8/3/2017.
 */

public class FavoriteColorActivity extends AppCompatActivity {

    private static final String TAG = "FavoriteColorActivity";

    private static final int RED = 0;
    private static final int GREEN = 1;
    private static final int BLUE = 2;

    private Button redButton;
    private Button greenButton;
    private Button blueButton;

    private MediaPlayer mp;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_color);

        mp = MediaPlayer.create(this, R.raw.pick_color);

        redButton = (Button) findViewById(R.id.red_button);
        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToShowShape(RED);
            }
        });

        greenButton = (Button) findViewById(R.id.green_button);
        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToShowShape(GREEN);
            }
        });

        blueButton = (Button) findViewById(R.id.blue_button);
        blueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToShowShape(BLUE);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        mp.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mp.stop();
    }

    private void goToShowShape(int colorCode) {
        ShapeInfoHolder.getInstance().setColorCode(colorCode);

        Intent i = new Intent(FavoriteColorActivity.this, ShowShapeActivity.class);
        startActivity(i);
    }
}





























