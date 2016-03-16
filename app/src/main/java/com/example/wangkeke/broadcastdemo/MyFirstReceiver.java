package com.example.wangkeke.broadcastdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 *
 * 1.普通广播无权终止广播
 *
 *
 *
 *
 *
 */
public class MyFirstReceiver extends BroadcastReceiver {

    private final String TAG = MyFirstReceiver.class.getSimpleName();

    public MyFirstReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        String value = intent.getStringExtra("msg");
        Log.i(TAG, "MyFirstReceiver--value = " + value);

        Bundle bundle = new Bundle();
        bundle.putString("msg", value + "@FirstReceiver");
        setResultExtras(bundle);

        //拦截广播
        abortBroadcast();
    }
}
