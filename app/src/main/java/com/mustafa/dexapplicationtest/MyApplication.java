package com.mustafa.dexapplicationtest;

import android.support.multidex.MultiDexApplication;

/**
 * Created by mustafa on 10/20/14.
 */
public class MyApplication extends MultiDexApplication {

    /* To enable Multi-Dex, you have 3 options -
        1. Declare android.support.multidex.MultiDexApplication as your application class in AndroidManifest.xml
        2. Extend MultiDexApplication like we are doing here
        3. Override attachBaseContext() in your application class as shown below
    /*

     */
    /*
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
    */
}
