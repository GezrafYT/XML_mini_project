package com.example.my_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app);
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

        int[] bg_arr = {
                R.drawable.galaxy1,
                R.drawable.galaxy2,
                R.drawable.galaxy3,
                R.drawable.galaxy4
        };

        Random rand = new Random();
        layout.setBackgroundResource(bg_arr[currentIndex]);

        currentIndex = (currentIndex + 1) % bg_arr.length;
    }


    public void quitApp(View view)
    {
        System.exit(0);
    }

    public void moveToScreen(View view)
    {
        Intent i1 = new Intent(this, MainActivity2.class);
        startActivity(i1);
    }
}
