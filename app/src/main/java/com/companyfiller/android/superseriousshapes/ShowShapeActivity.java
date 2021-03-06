package com.companyfiller.android.superseriousshapes;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Chase on 8/3/2017.
 */

public class ShowShapeActivity extends AppCompatActivity {

    private static final int CIRCLE = 0;
    private static final int SQUARE = 1;
    private static final int TRIANGLE = 2;

    private static final int RED = 0;
    private static final int GREEN = 1;
    private static final int BLUE = 2;

    private MediaPlayer mp;

    private ImageView shapeImageView;
    private Button restartButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_shape);

        mp = MediaPlayer.create(this, R.raw.here_it_is);

        shapeImageView = (ImageView) findViewById(R.id.shape_image_view);

        restartButton = (Button) findViewById(R.id.restart_button);
        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShowShapeActivity.this, StartActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            }
        });

        setImage();
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

    private void setImage() {

        int colorCode = ShapeInfoHolder.getInstance().getColorCode();
        int shapeCode = ShapeInfoHolder.getInstance().getShapeCode();

        if (colorCode == RED) {

            if (shapeCode == SQUARE) {
                shapeImageView
                        .setImageDrawable(getResources().getDrawable(R.drawable.red_square));
            } else if (shapeCode == CIRCLE) {
                shapeImageView
                        .setImageDrawable(getResources().getDrawable(R.drawable.red_circle));
            } else if (shapeCode == TRIANGLE) {
                shapeImageView
                        .setImageDrawable(getResources().getDrawable(R.drawable.red_triangle));
            }

        } else if (colorCode == GREEN) {

            if (shapeCode == SQUARE) {
                shapeImageView
                        .setImageDrawable(getResources().getDrawable(R.drawable.green_square));
            } else if (shapeCode == CIRCLE) {
                shapeImageView
                        .setImageDrawable(getResources().getDrawable(R.drawable.green_circle));
            } else if (shapeCode == TRIANGLE) {
                shapeImageView
                        .setImageDrawable(getResources().getDrawable(R.drawable.green_triangle));
            }

        } else if (colorCode == BLUE) {

            if (shapeCode == SQUARE) {
                shapeImageView
                        .setImageDrawable(getResources().getDrawable(R.drawable.blue_square));
            } else if (shapeCode == CIRCLE) {
                shapeImageView
                        .setImageDrawable(getResources().getDrawable(R.drawable.blue_circle));
            } else if (shapeCode == TRIANGLE) {
                shapeImageView
                        .setImageDrawable(getResources().getDrawable(R.drawable.blue_triangle));
            }

        }

    }
}





























