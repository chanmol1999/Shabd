package com.dsciitp.shabd;

import android.app.Application;

import com.google.firebase.analytics.FirebaseAnalytics;

import io.realm.Realm;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
        FirebaseAnalytics mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
    }
}
