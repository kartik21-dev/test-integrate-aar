package com.sling.circularviewsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Toast;

import de.hdodenhof.circleimageview.CircleImageView;


public class MainActivity_sdk extends AppCompatActivity {
    CircleImageView circleImageView;
    private static MainActivity_sdk mainActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sdk);
        circleImageView = findViewById(R.id.profile_image1);

    }

    public static MainActivity_sdk getInstance() {

        if (mainActivity == null) {
            mainActivity = new MainActivity_sdk();
        }
        return mainActivity;
    }


    public void showimage(Context context) {
        Toast.makeText(context, "" + circleImageView, Toast.LENGTH_SHORT).show();
    }

}