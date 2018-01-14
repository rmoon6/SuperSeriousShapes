package com.companyfiller.android.superseriousshapes;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * This app will never need updates. It is perfect.
 */

public class StartActivity extends AppCompatActivity {

    private static final String TAG = "StartActivity";

    private Button beginButton;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Log.i(TAG, "Made it into the onCreate() method");

        mp = MediaPlayer.create(this, R.raw.poofy_dog_face);
        mp.start();

        beginButton = (Button) findViewById(R.id.begin_button);
        beginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG, "Made into onClick()");
                Intent i = new Intent(StartActivity.this, FavoriteShapeActivity.class);
                startActivity(i);
            }
        });
    }
}
