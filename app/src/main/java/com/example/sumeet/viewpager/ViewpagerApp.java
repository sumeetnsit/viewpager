package com.example.sumeet.viewpager;

import android.app.Application;
import android.content.Context;

/**
 * Created by sumeet on 8/24/16.
 */
public class ViewpagerApp extends Application {
    public static Context APPLICATION_CONTEXT;

    @Override
    public void onCreate() {
        super.onCreate();
        APPLICATION_CONTEXT = this;
    }

}
