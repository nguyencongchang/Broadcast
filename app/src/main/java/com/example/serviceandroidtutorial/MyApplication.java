package com.example.serviceandroidtutorial;

import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

public class MyApplication extends Application {
    public static final String channel_id = "chang";
    @Override
    public void onCreate() {
        createNotification();
        super.onCreate();
    }

    private void createNotification() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel channel = new
                    NotificationChannel(channel_id,"Channel Service Ex", NotificationManager.IMPORTANCE_DEFAULT);
            channel.setSound(null,null);
            NotificationManager manager = getSystemService(NotificationManager.class);
            if(manager!=null){
                manager.createNotificationChannel(channel);
            }
        }
    }
}
