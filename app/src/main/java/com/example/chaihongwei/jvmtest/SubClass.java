package com.example.chaihongwei.jvmtest;

import android.util.Log;

/**
 * @author chaihongwei 2017/11/2 14:53
 */
public class SubClass extends SuperClass {
    static {
        sInt = 101;
        Log.d("jvmtest1", "SubClass:");
    }

    static {

    }

    static int sInt = 100;

    public SubClass() throws BaseException, SubException {

    }

    @Override
    protected void dodd() throws BaseException {
        super.dodd();
    }
}
