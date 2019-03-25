package com.xdd.arouterproject;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by xdd on 2019/3/25
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if(BuildConfig.DEBUG){
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(MyApplication.this);
    }
}
