package com.reactnativeopencv4.opencv;

import android.util.Log;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import org.opencv.android.OpenCVLoader;

import java.util.Map;
import java.util.HashMap;

public class OpenCVModule extends ReactContextBaseJavaModule {
    private final String TAG = "OpenCVModule";
    OpenCVModule(ReactApplicationContext context) {
        super(context);
        Log.d(TAG, "OpenCVModule enabled: " + OpenCVLoader.initDebug());
    }
    @Override
    public String getName() {
        return "OpenCVModule";
    }

}