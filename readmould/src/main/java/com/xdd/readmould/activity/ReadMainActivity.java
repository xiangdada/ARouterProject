package com.xdd.readmould.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.xdd.readmould.R;

/**
 * Created by xdd on 2019/3/25
 */
@Route(path = "/read/homeActivity")
public class ReadMainActivity extends Activity {
    @Autowired
    public long key1;

    @Autowired
    public String key2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_main);
        Log.e("测试", "key1 = " + key1 + ",key2 = " + key2);
    }

    public void toMediaMould(View view){
        ARouter.getInstance().build("/media/mainActivity")
                .withLong("key1",100)
                .withString("key2","hello")
                .navigation();
    }

}
