package com.example.chaihongwei.jvmtest;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @author chaihongwei 2017/11/2 10:12
 */
public class MemoryLeakActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_memory_leak);

        new Thread(new Runnable() {
            @Override
            public void run() {
                SystemClock.sleep(10 * 10000);
            }
        }).start();
    }
}
