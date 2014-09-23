package com.devinrsmith.weedfs.data;

/**
 * Created by dsmith on 9/22/14.
 */
public class Volume {
    private String Id;
    private Integer Size;
    private ReplicaPlacement ReplicaPlacement;
    private String Ttl;
    private String Collection;
    private Integer Version;
    private Integer FileCount;
    private Integer DeleteCount;
    private Integer DeletedByteCount;
    private Boolean ReadOnly;

    public Volume() {
    }

    public String getId() {
        return Id;
    }

    public Integer getSize() {
        return Size;
    }


    public ReplicaPlacement getReplicaPlacement() {
        return ReplicaPlacement;
    }

    public String getTtl() {
        return Ttl;
    }

    public String getCollection() {
        return Collection;
    }

    public Integer getVersion() {
        return Version;
    }

    public Integer getFileCount() {
        return FileCount;
    }

    public Integer getDeleteCount() {
        return DeleteCount;
    }

    public Integer getDeletedByteCount() {
        return DeletedByteCount;
    }

    public Boolean getReadOnly() {
        return ReadOnly;
    }

    @Override
    public String toString() {
        return "Volume{" +
                "Id='" + Id + '\'' +
                ", Size=" + Size +
                ", ReplicaPlacement=" + ReplicaPlacement +
                ", Ttl='" + Ttl + '\'' +
                ", Collection='" + Collection + '\'' +
                ", Version=" + Version +
                ", FileCount=" + FileCount +
                ", DeleteCount=" + DeleteCount +
                ", DeletedByteCount=" + DeletedByteCount +
                ", ReadOnly=" + ReadOnly +
                '}';
    }
}

