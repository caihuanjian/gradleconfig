package com.konka.gradleconfig;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

/**
 * Created by HwanJ.Choi on 2018-5-9.
 */

public class App extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
