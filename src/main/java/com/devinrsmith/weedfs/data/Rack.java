package com.devinrsmith.weedfs.data;

import java.util.List;

/**
 * Created by dsmith on 9/22/14.
 */
public class Rack {
    private List<DataNode> DataNodes;
    private Integer Free;
    private String Id;
    private Integer Max;

    public Rack() {
    }

    public List<DataNode> getDataNodes() {
        return DataNodes;
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

    @Override
    public String toString() {
        return "Rack{" +
                "DataNodes=" + DataNodes +
                ", Free=" + Free +
                ", Id=" + Id +
                ", Max=" + Max +
                '}';
    }
}
