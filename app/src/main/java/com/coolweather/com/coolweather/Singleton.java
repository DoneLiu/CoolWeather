package com.coolweather.com.coolweather;

import android.util.Log;

/**
 * Created by Done.L on 2017/1/11.
 */

public class Singleton {

    private static Singleton instance = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
