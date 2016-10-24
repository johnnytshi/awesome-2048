package com.tpcstld.twozerogame;

import android.app.Application;
import com.buddybuild.sdk.BuddyBuild;

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        BuddyBuild.setup(this);
    }
}