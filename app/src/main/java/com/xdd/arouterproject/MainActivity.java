package com.xdd.arouterproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnMedia)
    public void onBtnMediaClick(View view) {

    }

//    @OnClick(R.id.btnRead)
    public void onBtnReadClick(View view) {
        ARouter.getInstance().build("/read/homeActivity")
                .withLong("key1",100)
                .withString("key2","hello")
                .navigation();
    }
}
