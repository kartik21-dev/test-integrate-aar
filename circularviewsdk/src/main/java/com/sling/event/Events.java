package com.sling.event;

import android.content.Context;
import android.widget.Toast;

public class Events implements BotStatusListener{

    public static void onBotStartEvent(Context context){
        BotStatusListener.onBotStartEvent(context);
    }

    @Override
    public void onBotStartEvents(Context context) {

    }
}
