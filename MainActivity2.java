package com.example.my_app;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;

import java.util.Random;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app2);

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.jeff_sound);

        mediaPlayer.start();


        hideSystemUI();
        final View layout = findViewById(R.id.mainLayout2);
        final int[] jeffArr = {R.drawable.jeff1, R.drawable.jeff2};
        final int delay = 80;

        layout.post(new Runnable() {
            int currentIndex = 0;

            @Override
            public void run() {
                layout.setBackgroundResource(jeffArr[currentIndex]);
                currentIndex = (currentIndex + 1) % jeffArr.length;
                layout.postDelayed(this, delay);
            }
        });
    }


    private void hideSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE);
    }



}
