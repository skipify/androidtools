package com.ifanybug.tools;

import org.xutils.common.Callback;

/**
 * Created by skipify on 16/1/5.
 */
public abstract class MyCallback<String> implements Callback.CommonCallback<String> {

    @Override
    public void onError(Throwable throwable, boolean b) {

    }

    @Override
    public void onCancelled(CancelledException e) {

    }

    @Override
    public void onFinished() {

    }
}
