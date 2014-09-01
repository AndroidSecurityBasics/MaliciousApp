package com.booking_example;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MaliciousReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Intent detailsIntent = new Intent(context, DetailsActivity.class);
        detailsIntent.setClassName("com.booking_example", "com.booking_example.DetailsActivity");
        detailsIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(detailsIntent);
    }
}
