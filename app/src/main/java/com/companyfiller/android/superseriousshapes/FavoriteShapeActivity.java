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

public class FavoriteShapeActivity extends AppCompatActivity {

    private static final String TAG = "FavoriteShapeActivity";

    private static final int CIRCLE = 0;
    private static final int SQUARE = 1;
    private static final int TRIANGLE = 2;

    private Button circleButton;
    private Button squareButton;
    private Button triangleButton;

    private MediaPlayer mp;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_shape);

        mp = MediaPlayer.create(this, R.raw.fav_shape);

        circleButton = (Button) findViewById(R.id.circle_button);
        circleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToColorSelect(CIRCLE);
            }
        });

        squareButton = (Button) findViewById(R.id.square_button);
        squareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToColorSelect(SQUARE);
            }
        });

        triangleButton = (Button) findViewById(R.id.triangle_button);
        triangleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToColorSelect(TRIANGLE);
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

    private void goToColorSelect(int code) {
        ShapeInfoHolder.getInstance().setShapeCode(code);
        Intent i = new Intent(FavoriteShapeActivity.this, FavoriteColorActivity.class);
        startActivity(i);
    }
}





























