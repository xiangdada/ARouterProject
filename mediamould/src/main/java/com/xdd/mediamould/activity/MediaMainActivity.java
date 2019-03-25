package com.xdd.mediamould.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.xdd.mediamould.R;

/**
 * Created by xdd on 2019/3/25
 */
@Route(path = "/media/mainActivity")
public class MediaMainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_main);
    }
}
