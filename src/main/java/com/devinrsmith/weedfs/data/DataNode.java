package com.devinrsmith.weedfs.data;

/**
 * Created by dsmith on 9/22/14.
 */
public class DataNode {
    private Integer Free;
    private Integer Max;
    private String PublicUrl;
    private String Url;
    private Integer Volumes;

    public DataNode() {
    }

    public Integer getFree() {
        return Free;
    }

    public Integer getMax() {
        return Max;
    }

    public String getPublicUrl() {
        return PublicUrl;
    }

    public String getUrl() {
        return Url;
    }

    public Integer getVolumes() {
        return Volumes;
    }

    @Override
    public String toString() {
        return "DataNode{" +
                "Free=" + Free +
                ", Max=" + Max +
                ", PublicUrl='" + PublicUrl + '\'' +
                ", Url='" + Url + '\'' +
                ", Volumes=" + Volumes +
                '}';
    }
}
