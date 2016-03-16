package com.example.wangkeke.broadcastdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        sendMyBroadcast();

        sendOrderBroadcast();

    }

    /**
     * 发送普通广播
     */
    private void sendMyBroadcast() {
        Intent intent = new Intent("com.wangkeke.broadcast.demo");
        intent.putExtra("msg", "this is a broadcast.");
        sendBroadcast(intent);
    }


    /**
     * 发送有序广播
     */
    private void sendOrderBroadcast() {
        Intent intent = new Intent("com.wangkeke.broadcast.demo");
        intent.putExtra("msg", "hello receiver.");
        sendOrderedBroadcast(intent, "scott.permission.MY_BROADCAST_PERMISSION");
    }

}
