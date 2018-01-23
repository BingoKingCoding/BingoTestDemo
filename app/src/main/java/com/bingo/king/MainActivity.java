package com.bingo.king;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.bingo.king.viewevent.ViewEventActivity;
import com.bingo.king.adapter.SimpleAdapter;
import com.chad.library.adapter.base.BaseQuickAdapter;

import java.util.ArrayList;
import java.util.List;

import static android.widget.LinearLayout.VERTICAL;

public class MainActivity extends BaseActivity
{
    private RecyclerView mRecyclerView;
    private List<MainItem> mItemList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init()
    {
        initData();
        initView();
    }

    private void initData()
    {
        mItemList.add(new MainItem("View事件分发", ViewEventActivity.class));
        mItemList.add(new MainItem("View事件分发", ViewEventActivity.class));
        mItemList.add(new MainItem("View事件分发", ViewEventActivity.class));
    }

    private void initView()
    {
        mRecyclerView = findViewById(R.id.rv);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, VERTICAL));

        SimpleAdapter adapter = new SimpleAdapter(mItemList);
        mRecyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener()
        {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view,final int position)
            {
                mRecyclerView.postDelayed(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        MainActivity.this.startActivity(new Intent(MainActivity.this,mItemList.get(position).getClazz()));
                    }
                },500);

            }
        });
    }
}
