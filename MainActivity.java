package com.example.test; // replace with your package name

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;
import android.widget.LinearLayout;
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
//        Random rand = new Random();
//        int R = rand.nextInt(255);
//        int G = rand.nextInt(255);
//        int B = rand.nextInt(255);
//        button.setBackgroundColor(Color.rgb(R, G, B));

        button.setBackgroundColor(Color.RED);
    }

    public void changeTextColor(View view)
    {
        Button button = (Button) view;
//        Random rand = new Random();
//        int R = rand.nextInt(255);
//        int G = rand.nextInt(255);
//        int B = rand.nextInt(255);
//        button.setTextColor(Color.rgb(R, G, B));

        button.setTextColor(Color.GREEN);
    }

    public void changeBGColor(View view)
    {
        View layout = findViewById(R.id.mainLayout);
        Random rand = new Random();
        int R = rand.nextInt(255);
        int G = rand.nextInt(255);
        int B = rand.nextInt(255);
        layout.setBackgroundColor(Color.rgb(R, G, B));
    }


    public void quitApp(View view)
    {
        System.exit(0);
    }
}
