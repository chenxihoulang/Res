package com.example.chaihongwei.jvmtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String ss1 = new StringBuilder("计算机").append("软件").toString();

        Log.d("jvmtest1", "" + (ss1.intern() == ss1));

        String ss2 = new StringBuilder("ja").append("va").toString();

        Log.d("jvmtest1", "" + (ss2.intern() == ss2));

        findViewById(R.id.btnMemoryLeak).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MemoryLeakActivity.class));
            }
        });

        //        Log.d("jvmtest1", "子类引用父类静态字段:" + SubClass.value);

        Log.d("jvmtest1", "父类数组:");
        SuperClass[] superClasses = new SuperClass[10];


        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;

        Log.d("chw", "" + (c == d));
        Log.d("chw", "" + (e == f));
        Log.d("chw", "" + (c == (a + b)));
        Log.d("chw", "" + (c.equals(a + b)));
        Log.d("chw", "" + (g == (a + b)));
        Log.d("chw", "" + (g.equals(a + b)));


        try {
            ddddd();
        } catch (BaseException e1) {
            e1.printStackTrace();
        }finally {
            try {
                sds();
            } catch (SubException e1) {
                e1.printStackTrace();
            }
        }
    }

    private void ddddd() throws BaseException {
        throw new BaseException();
    }

    private void sds() throws SubException {
        throw new SubException();
    }
}
