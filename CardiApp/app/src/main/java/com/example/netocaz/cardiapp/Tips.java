package com.example.netocaz.cardiapp;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Tips extends AppCompatActivity {

    private static final int MY_NOTIFICATION_ID = 1;
    NotificationManager notificationManager;
    Notification miNotification;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        Button botonEnviar = (Button) findViewById(R.id.btntipnotify);
        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                Intent miIntent = new Intent();
                miIntent.setClass(context, Tips.class);
               PendingIntent pendingIntent = PendingIntent.getActivity(Tips.this, 0, miIntent, Intent.FLAG_ACTIVITY_NEW_TASK);
                miNotification = new Notification.Builder(context)
                        .setContentTitle(" Tip Semanal... ")
                        .setContentText("Coma Frutas y Verduras =D")
                        .setTicker(" ¡¡¡ NUEVO TIP !!!")
                        .setWhen(System.currentTimeMillis())
                         .setContentIntent(pendingIntent)
                        .setAutoCancel(true)
                        .setSmallIcon(R.drawable.tips_icono_tips)
                        .build();

                //Para que suene cuando llegue
                miNotification.defaults |= Notification.DEFAULT_SOUND;
                //Para que vibre
                miNotification.defaults |= Notification.DEFAULT_VIBRATE;
                //Para que encieda el LED
                miNotification.defaults |= Notification.DEFAULT_LIGHTS;

                miNotification.sound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

                notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                notificationManager.notify(MY_NOTIFICATION_ID, miNotification);
            }
        });
    }
}

