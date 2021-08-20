package com.sling.jitpackdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.sling.circularviewsdk.*;
import com.sling.event.BotStatusListener;

public class MainActivity extends AppCompatActivity implements BotStatusListener {

     Context context;

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
        Images.createIntent(MainActivity.this);
    }

    @Override
    public void onBotStartEvents(Context context) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
