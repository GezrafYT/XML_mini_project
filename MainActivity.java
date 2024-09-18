package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void popMessage(View view) {
        //להקפיץ הודעה
        Toast.makeText(this, "לחצת על הכפתור!", Toast.LENGTH_SHORT).show();
    }
    
    public void changeButtonColor(View view)
    {
        
    }
}
