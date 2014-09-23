package com.devinrsmith.weedfs.data;

/**
 * Created by dsmith on 9/22/14.
 */
public class ReplicaPlacement {
    private Integer SameRackCount;
    private Integer DiffRackCount;
    private Integer DiffDataCenterCount;

    public ReplicaPlacement() {
    }

    public Integer getSameRackCount() {
        return SameRackCount;
    }

    public Integer getDiffRackCount() {
        return DiffRackCount;
    }

    public Integer getDiffDataCenterCount() {
        return DiffDataCenterCount;
    }

    @Override
    public String toString() {
        return "ReplicaPlacement{" +
                "SameRackCount=" + SameRackCount +
                ", DiffRackCount=" + DiffRackCount +
                ", DiffDataCenterCount=" + DiffDataCenterCount +
                '}';
    }
}
