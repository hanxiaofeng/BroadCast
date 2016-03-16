package com.example.wangkeke.broadcastdemo.bootcomplete;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class BootCompleteReceiver extends BroadcastReceiver {

    private static final String TAG = BootCompleteReceiver.class.getSimpleName();

    public BootCompleteReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) {
//          Intent service = new Intent(context, MsgPushService.class);
//          context.startService(service);

            Toast.makeText(context, "开机自启动", Toast.LENGTH_SHORT).show();

            Log.i(TAG, "Boot Complete. Starting MsgPushService...");
        }


    }
}
