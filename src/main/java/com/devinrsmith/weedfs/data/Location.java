package com.devinrsmith.weedfs.data;

/**
 * Created by dsmith on 9/22/14.
 */
public class Location {
    private String publicUrl;
    private String url;

    public Location() {
    }

    public String getPublicUrl() {
        return publicUrl;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Lookup{" +
                "publicUrl='" + publicUrl + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
