package com.devinrsmith.weedfs.data;

/**
 * Created by dsmith on 9/22/14.
 */
public class Upload {
    private String name;
    private Integer size;

    public Upload() {
    }

    public String getName() {
        return name;
    }

    public Integer getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "UploadResult{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
