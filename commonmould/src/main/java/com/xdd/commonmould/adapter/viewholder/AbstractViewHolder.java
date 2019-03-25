package com.xdd.commonmould.adapter.viewholder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by xdd on 2019/3/20
 */
public abstract class AbstractViewHolder extends RecyclerView.ViewHolder {
    public View mRootView;

    public AbstractViewHolder(@NonNull View itemView) {
        super(itemView);
        mRootView = itemView.getRootView();
    }
}
