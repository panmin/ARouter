package com.alibaba.android.arouter.demo.module1;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.template.IProvider;

@Route(path = "/module/service1")
public class JavaServiceImpl implements IProvider {
    private static final String TAG = "JavaServiceImpl";
    @Override
    public void init(Context context) {

    }

    public void test1(){
        Log.e(TAG, "test1: ");
    }
    public void test2(){
        Log.e(TAG, "test1: ");
    }
}
