package com.devinrsmith.weedfs.data;

import java.util.List;

/**
 * Created by dsmith on 9/22/14.
 */
public class Topology {
    private List<DataCenter> DataCenters;
    private Integer Free;
    private Integer Max;
    private List<Layout> layouts;

    public Topology() {
    }

    public List<DataCenter> getDataCenters() {
        return DataCenters;
    }

    public Integer getFree() {
        return Free;
    }

    public Integer getMax() {
        return Max;
    }

    public List<Layout> getLayouts() {
        return layouts;
    }

    @Override
    public String toString() {
        return "Topology{" +
                "DataCenters=" + DataCenters +
                ", Free=" + Free +
                ", Max=" + Max +
                ", layouts=" + layouts +
                '}';
    }
}
