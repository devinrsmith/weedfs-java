package com.devinrsmith.weedfs.data;

import java.util.List;

/**
 * Created by dsmith on 9/22/14.
 */
public class Lookup {
    private Integer volumeId;
    private List<Location> locations;

    public Lookup() {
    }

    public Integer getVolumeId() {
        return volumeId;
    }

    public List<Location> getLocations() {
        return locations;
    }

    @Override
    public String toString() {
        return "LookupResult{" +
                "volumeId=" + volumeId +
                ", locations=" + locations +
                '}';
    }
}
