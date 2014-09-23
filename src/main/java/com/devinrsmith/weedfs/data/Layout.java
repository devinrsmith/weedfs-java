package com.devinrsmith.weedfs.data;

import java.util.List;

/**
 * Created by dsmith on 9/22/14.
 */
public class Layout {
    private String collection;
    private String replication;
    private String ttl;
    private List<Integer> writables;

    public Layout() {
    }

    public String getCollection() {
        return collection;
    }

    public String getReplication() {
        return replication;
    }

    public String getTtl() {
        return ttl;
    }

    public List<Integer> getWritables() {
        return writables;
    }

    @Override
    public String toString() {
        return "Layout{" +
                "collection='" + collection + '\'' +
                ", replication='" + replication + '\'' +
                ", ttl='" + ttl + '\'' +
                ", writables=" + writables +
                '}';
    }
}


