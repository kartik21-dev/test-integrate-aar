package com.sling.jitpackdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.sling.circularviewsdk.*;

 public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { showimage(); }
        });
    }

    private void showimage() {
       Intent i = new Intent(getBaseContext(),MainActivity_sdk.class);
       startActivity(i);
    }

}
