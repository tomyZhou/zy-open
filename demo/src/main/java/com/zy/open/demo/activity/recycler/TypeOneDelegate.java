package com.zy.open.demo.activity.recycler;

import android.util.Log;

import com.zy.open.demo.R;
import com.zy.open.lib.adapter.recycler.AdapterDelegate;
import com.zy.open.lib.adapter.recycler.RecyclerViewHolder;
import com.zy.open.lib.util.ToastUtil;

/**
 * Created by zhangll on 16/8/16.
 */
public class TypeOneDelegate implements AdapterDelegate<RecyclerActivity.Item> {
    @Override
    public int getLayoutId() {
        return R.layout.item_multi_type_one;
    }

    @Override
    public void bind(RecyclerViewHolder holder, RecyclerActivity.Item data, int position) {
        holder.setText(R.id.tv_item, data.content)
                .setImageResource(R.id.iv_item, R.mipmap.ic_launcher);
    }
}