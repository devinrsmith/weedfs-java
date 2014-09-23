package com.devinrsmith.weedfs.data;

/**
 * Created by dsmith on 9/22/14.
 */
public class DirectoryStatus {
    private Topology Topology;
    private String Version;

    public DirectoryStatus() {
    }

    public Topology getTopology() {
        return Topology;
    }

    public String getVersion() {
        return Version;
    }

    @Override
    public String toString() {
        return "DirectoryStatus{" +
                "Topology=" + Topology +
                ", Version='" + Version + '\'' +
                '}';
    }
}
