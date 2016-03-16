package com.example.wangkeke.broadcastdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MySecondReceiver extends BroadcastReceiver {

    private final String TAG = MySecondReceiver.class.getSimpleName();

    public MySecondReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
//        String value = intent.getStringExtra("msg");
        String value = getResultExtras(true).getString("msg");
        Log.i(TAG, "MySecondReceiver---value = " + value);


        Bundle bundle = new Bundle();
        bundle.putString("msg", value + "@SecondReceiver");
        setResultExtras(bundle);

    }
}
