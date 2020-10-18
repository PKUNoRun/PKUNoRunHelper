package com.pkunorun.pkunorunhelper;

public class LatitudeLongitudeItem {
    public float latitude;
    public float longitude;
    public LatitudeLongitudeItem(float latitude, float longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public LatitudeLongitudeItem(double latitude, double longitude){
        this.latitude = (float) latitude;
        this.longitude = (float)longitude;
    }
}
