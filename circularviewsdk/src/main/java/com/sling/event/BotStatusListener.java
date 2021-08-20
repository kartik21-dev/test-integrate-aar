package com.sling.event;

import android.content.Context;
import android.widget.Toast;

public interface BotStatusListener {
    public static void onBotStartEvent(Context context) {
        Toast.makeText(context, "this is from interface", Toast.LENGTH_SHORT).show();
    }

    public void onBotStartEvents(Context context);
}
