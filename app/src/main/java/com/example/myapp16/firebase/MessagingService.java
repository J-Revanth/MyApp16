package com.example.myapp16.firebase;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MessagingService extends FirebaseMessagingService {

    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);
        Log.d("FCM","Token: "+token);
    }

    @Override
    public void onMessageReceived(@NonNull RemoteMessage message) {
        super.onMessageReceived(message);
        Log.d("Fcm","Message: "+message.getNotification().getBody());
    }
}
//efMe1u8tTQiB9t-gN8G8f6:APA91bH3Sakk_WG2_7uzW1aGUTpn6R9qe5q705CQc5uO8cNCiTw1wkvhAc1nMneoJwzJOJ7Jcd-VjmdYvQQkRygixz9AJGuL_IMhdxT76oAUYQJ6t-hh29rjH6uO3Rjm0QOPVB1_FT4i