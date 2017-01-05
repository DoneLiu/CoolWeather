package com.coolweather.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Done.L on 2017/1/5.
 */

public class County extends DataSupport {

    private int id;

    private String countyName;

    private int weatherId;

    private int cityId;

    public int getId() {
        return id;
    }

    public int getCityId() {
        return cityId;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
}
