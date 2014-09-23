package com.devinrsmith.weedfs;

import com.devinrsmith.weedfs.data.Assignment;
import com.devinrsmith.weedfs.data.ClusterStatus;
import com.devinrsmith.weedfs.data.DirectoryStatus;
import com.devinrsmith.weedfs.data.Lookup;
import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by dsmith on 9/22/14.
 */
public interface WeedFSMasterClient {
    @GET("/dir/assign")
    Assignment directoryAssignment(
            @Query("collection") String collection,
            @Query("replication") String replication,
            @Query("dataCenter") String dataCenter,
            @Query("ttl") String ttl,
            @Query("count") Integer count);

    @GET("/dir/lookup")
    Lookup directoryLookup(
            @Query("volumeId") Integer volumeId,
            @Query("collection") String collection);

    @GET("/vol/grow")
    Response growVolume(
            @Query("collection") String collection,
            @Query("replication") String replication,
            @Query("dataCenter") String dataCenter,
            @Query("count") Integer count);

    @GET("/vol/vacuum")
    Response vacuum(
            @Query("garbageThreshold") Double garbageThreshold);


    @GET("/cluster/status")
    ClusterStatus clusterStatus();

    @GET("/dir/status")
    DirectoryStatus directoryStatus();

}
