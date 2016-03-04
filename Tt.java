package com.ifanybug.skipify.where.tools;

/**
 * Created by admin on 2015/12/19.
 */

import android.content.Context;
import android.widget.Toast;

import com.ifanybug.skipify.where.MyApplication;

/**
 * Toast统一管理类
 *
 */
public class Tt
{

    private Tt()
    {
		/* cannot be instantiated */
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    public static boolean isShow = true;

    /**
     * 短时间显示Toast
     *
     * @param message
     */
    public static void showShort(CharSequence message)
    {
        Context context = MyApplication.getContext();
        if (isShow)
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    /**
     * 短时间显示Toast
     *
     * @param message
     */
    public static void showShort( int message)
    {
        Context context = MyApplication.getContext();
        if (isShow)
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    /**
     * 长时间显示Toast
     *
     * @param message
     */
    public static void showLong( CharSequence message)
    {
        Context context = MyApplication.getContext();
        if (isShow)
            Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    /**
     * 长时间显示Toast
     *
     * @param message
     */
    public static void showLong( int message)
    {
        Context context = MyApplication.getContext();
        if (isShow)
            Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    /**
     * 自定义显示Toast时间
     *
     * @param message
     * @param duration
     */
    public static void show(CharSequence message, int duration)
    {
        Context context = MyApplication.getContext();
        if (isShow)
            Toast.makeText(context, message, duration).show();
    }

    /**
     * 自定义显示Toast时间
     *
     * @param message
     * @param duration
     */
    public static void show( int message, int duration)
    {
        Context context = MyApplication.getContext();
        if (isShow)
            Toast.makeText(context, message, duration).show();
    }

}