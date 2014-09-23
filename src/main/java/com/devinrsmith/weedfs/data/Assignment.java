package com.devinrsmith.weedfs.data;

/**
 * Created by dsmith on 9/22/14.
 */
public class Assignment {

    private String fid;
    private String url;
    private String publicUrl;
    private Integer count;

    public Assignment() {
    }

    public String getFid() {
        return fid;
    }

    public Integer getVolume() {
        return fid == null ? null : Integer.parseInt(fid.substring(0, fid.indexOf(",")));
    }

    public String getUrl() {
        return url;
    }

    public String getPublicUrl() {
        return publicUrl;
    }

    public Integer getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "AssignResult{" +
                "fid='" + fid + '\'' +
                ", url='" + url + '\'' +
                ", publicUrl='" + publicUrl + '\'' +
                ", count=" + count +
                '}';
    }
}
