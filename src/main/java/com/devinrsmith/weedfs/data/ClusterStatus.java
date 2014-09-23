package com.devinrsmith.weedfs.data;

import java.util.List;

/**
 * Created by dsmith on 9/22/14.
 */
public class ClusterStatus {
    private Boolean IsLeader;
    private String Leader;
    private List<String> Peers;

    public ClusterStatus() {
    }

    public Boolean getIsLeader() {
        return IsLeader;
    }

    public String getLeader() {
        return Leader;
    }

    public List<String> getPeers() {
        return Peers;
    }

    @Override
    public String toString() {
        return "ClusterStatusResult{" +
                "IsLeader=" + IsLeader +
                ", Leader='" + Leader + '\'' +
                ", Peers=" + Peers +
                '}';
    }
}
