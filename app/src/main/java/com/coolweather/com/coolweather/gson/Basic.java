package com.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Done.L on 2017/1/6.
 */

public class Basic {

    @SerializedName("city")
    public String cityname;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
