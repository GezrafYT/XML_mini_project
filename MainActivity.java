package com.example.my_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app);
        hideSystemUI();
    }

    public void popMessage(View view) {
        Toast.makeText(this, "Message Popped 😎", Toast.LENGTH_SHORT).show();
    }

    public void changeButtonColor(View view)
    {
        Button button = (Button) view;
        Random rand = new Random();
        int R = rand.nextInt(255);
        int G = rand.nextInt(255);
        int B = rand.nextInt(255);
        button.setBackgroundColor(Color.rgb(R, G, B));
    }

    public void changeTextColor(View view)
    {
        Button button = (Button) view;
        Random rand = new Random();
        int R = rand.nextInt(255);
        int G = rand.nextInt(255);
        int B = rand.nextInt(255);
        button.setTextColor(Color.rgb(R, G, B));
    }

    int currentIndex = 0;
    public void changeBackground(View view) {
        View layout = findViewById(R.id.mainLayout);

        TransitionDrawable[] transitions = new TransitionDrawable[] {
                (TransitionDrawable) getResources().getDrawable(R.drawable.tr1),
                (TransitionDrawable) getResources().getDrawable(R.drawable.tr2),
                (TransitionDrawable) getResources().getDrawable(R.drawable.tr3),
                (TransitionDrawable) getResources().getDrawable(R.drawable.tr4)
        };

        layout.setBackground(transitions[currentIndex]);
        transitions[currentIndex].startTransition(800);

        currentIndex = (currentIndex + 1) % transitions.length;
    }

    public void hideSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE);
    }

    public void moveToScreen(View view)
    {
        clickCount++;

        if(clickCount == 3)
        {
            Intent i1 = new Intent(this, jeff_screen.class);
            startActivity(i1);
        }
    }


    public void quitApp(View view)
    {
        System.exit(0);
    }

}
