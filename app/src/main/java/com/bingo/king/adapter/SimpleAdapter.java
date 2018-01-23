package com.bingo.king.adapter;

import android.support.annotation.Nullable;

import com.bingo.king.MainItem;
import com.bingo.king.R;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * <请描述这个类是干什么的>
 * Created by wwb on 2018/1/23 11:01.
 */

public class SimpleAdapter extends BaseQuickAdapter<MainItem, BaseViewHolder>
{
    public SimpleAdapter(@Nullable List<MainItem> data)
    {
        super(R.layout.item_main, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MainItem item)
    {
        helper.setText(R.id.tv_title, item.getTitle());
    }
}
