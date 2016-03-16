package com.example.wangkeke.broadcastdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyThirdReceiver extends BroadcastReceiver {

    private final String TAG = MyThirdReceiver.class.getSimpleName();

    public MyThirdReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
//        String value = intent.getStringExtra("msg");
        String value = getResultExtras(true).getString("msg");
        Log.i(TAG, "MyThirdReceiver---value = " + value);

    }
}
