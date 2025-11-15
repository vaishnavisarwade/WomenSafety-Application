package com.india.womansafety_2024;

import android.app.Application;
import android.content.Context;

import com.google.firebase.FirebaseApp;

public class App extends Application {

    public static final String PRIMARY_CHANNEL = "default";
    public static Context mContext;


    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this.getApplicationContext();
      //  FirebaseApp.initializeApp(this);
    }

}
