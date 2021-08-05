package com.sling.circularviewsdk;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

public class Images extends Application {
    private static Context mContext;

    public static void createIntent(Context context) {
        Intent intent = new Intent(context, MainActivity_sdk.class);
        context.startActivity(intent);
    }

    public void onCreate() {
        super.onCreate();
        mContext = this.getApplicationContext();
    }


}
