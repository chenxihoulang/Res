package com.example.chaihongwei.jvmtest;

import android.util.Log;

/**
 * @author chaihongwei 2017/11/2 14:52
 */
public class SuperClass {
    static {
        Log.d("jvmtest1","SuperClass");
    }

    public static int value=123;

    public SuperClass() throws BaseException{

    }
    protected void dodd() throws BaseException{

    }
}
