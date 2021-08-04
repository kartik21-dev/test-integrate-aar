package com.sling.jitpackdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.sling.circularviewsdk.*;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "ho raha hy", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, ""+button, Toast.LENGTH_SHORT).show();
                ShowImage.img(MainActivity.this);
            }
        });

    }



}