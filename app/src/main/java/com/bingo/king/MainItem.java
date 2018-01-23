package com.bingo.king;

/**
 * <请描述这个类是干什么的>
 * Created by wwb on 2018/1/23 11:22.
 */

public class MainItem
{
    public MainItem(String title, Class<?> clazz)
    {
        this.title = title;
        this.clazz = clazz;
    }

    private String title;
    private Class<?> clazz;

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public Class<?> getClazz()
    {
        return clazz;
    }

    public void setClazz(Class<?> clazz)
    {
        this.clazz = clazz;
    }
}
