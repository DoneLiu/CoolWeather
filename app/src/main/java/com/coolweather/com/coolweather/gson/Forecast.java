package com.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Done.L on 2017/1/6.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt_d")
        public String info;
    }

    public class Temperature {

        public String max;

        public String min;
    }
}
