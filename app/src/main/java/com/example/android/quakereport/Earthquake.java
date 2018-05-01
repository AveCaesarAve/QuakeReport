package com.example.android.quakereport;

public class Earthquake {


    /**
     * Default magnitude of the earthquake
     */
    private String mDefaultMagnitude;
    /**
     * Default city location of the earthquake
     */
    private String mDefaultCity;
    /**
     * Default timestamp of the earthquake
     */
    private String mDefaultTime;


    /**
     * Create a new com.example.android.quakereport.Earthquake object.
     *
     * @param defaultMagnitude is the magnitude of the quake
     *
     * @param defaultCity is the city near which the quake occured
     *
     * @param defaultTime is the time of the quake occurence
     */
    public Earthquake(String defaultMagnitude, String defaultCity, String defaultTime) {
        mDefaultMagnitude = defaultMagnitude;
        mDefaultCity = defaultCity;
        mDefaultTime = defaultTime;
    }

    /**
     * Get the default magnitude of the quake.
     */
    public String getDefaultMagnitude() {
        return mDefaultMagnitude;
    }

    /**
     * Get the default city of the quake
     */
    public String getDefaultCity() {
        return mDefaultCity;
    }

    /**
     * Get the default timestamp of the quake.
     */
    public String getDefaultTime() {
        return mDefaultTime;
    }


}