package com.ifanybug.tools;

import android.content.Context;

/**
 * 初始化上下文信息
 */
public class Kudo {
    public static Context context;

    public static void setContext(Context _context){
        context = _context;
    }

    public static Context getContext()
    {
        return context;
    }
}
