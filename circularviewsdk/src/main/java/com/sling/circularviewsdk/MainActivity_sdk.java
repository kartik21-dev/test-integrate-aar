package com.sling.circularviewsdk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.squareup.picasso.Picasso;
import de.hdodenhof.circleimageview.CircleImageView;


public class MainActivity_sdk extends AppCompatActivity {
    Button button;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sdk);
        button = findViewById(R.id.bid);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callimage();
            }
        });
    }

    public void callimage() {
        String str = "https://source.unsplash.com/random";
        CircleImageView circleImageView = findViewById(R.id.profile_image1);
        Picasso.get().load(str).into(circleImageView);
    }


}