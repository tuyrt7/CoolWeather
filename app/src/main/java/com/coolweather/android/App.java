package com.coolweather.android;

import android.app.Application;

import com.facebook.stetho.Stetho;

import org.litepal.LitePal;

public class App extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(getApplicationContext());
        Stetho.initializeWithDefaults(this);

    }
}
