package com.security.basics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MaliciousReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Intent detailsIntent = new Intent(context, DetailsActivity.class);
        detailsIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(detailsIntent);
    }
}
