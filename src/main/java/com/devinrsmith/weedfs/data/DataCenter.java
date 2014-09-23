package com.devinrsmith.weedfs.data;

import java.util.List;

/**
 * Created by dsmith on 9/22/14.
 */
public class DataCenter {
    private Integer Free;
    private String Id;
    private Integer Max;
    private List<Rack> Racks;

    public DataCenter() {
    }

    public Integer getFree() {
        return Free;
    }

    public String getId() {
        return Id;
    }

    public Integer getMax() {
        return Max;
    }

    public List<Rack> getRacks() {
        return Racks;
    }

    @Override
    public String toString() {
        return "DataCenter{" +
                "Free=" + Free +
                ", Id='" + Id + '\'' +
                ", Max=" + Max +
                ", Racks=" + Racks +
                '}';
    }
}
