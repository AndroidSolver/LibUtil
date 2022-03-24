package com.denovo.libutil;

import android.util.Log;

public class LogDebug {

    private static final String TAG = "Super Awesome app made:";

    public static void d(String message) {
        Log.d(TAG, message);
    }
}
