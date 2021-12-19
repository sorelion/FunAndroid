package com.study.funandroid;

import android.app.Application;

/**
 * @Description: 作用描述
 * @Author: lion 571135591
 * @CreateDate: 2021/12/19 9:35 下午
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        PluginUtil.loadClass(this);
    }
}
