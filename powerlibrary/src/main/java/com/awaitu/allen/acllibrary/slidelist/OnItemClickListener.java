package com.awaitu.allen.acllibrary.slidelist;

import android.support.v7.widget.RecyclerView;

/**
 * Created by Administrator on 2018/7/13.
 */

public abstract class OnItemClickListener {

    public void onItemLongClick(RecyclerView.ViewHolder vh, int position){}
    abstract public void onItemClick(RecyclerView.ViewHolder vh,int position);
}
