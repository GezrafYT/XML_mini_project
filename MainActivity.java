package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getMessage(View view) {
        Toast.makeText(this, "לחצת על הכפתור!", Toast.LENGTH_SHORT).show(); // pops up a message as a response to clicking the button
    }
}
