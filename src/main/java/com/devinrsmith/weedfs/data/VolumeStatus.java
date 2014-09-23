package com.devinrsmith.weedfs.data;

import java.util.List;

/**
 * Created by dsmith on 9/22/14.
 */
public class VolumeStatus {
    private String Version;
    private List<Volume> Volumes;

    public VolumeStatus() {
    }

    public String getVersion() {
        return Version;
    }

    public List<Volume> getVolumes() {
        return Volumes;
    }

    @Override
    public String toString() {
        return "VolumeStatus{" +
                "Version='" + Version + '\'' +
                ", Volumes=" + Volumes +
                '}';
    }
}
