package com.devinrsmith.weedfs;

import com.devinrsmith.weedfs.data.Assignment;
import com.devinrsmith.weedfs.data.ClusterStatus;
import com.devinrsmith.weedfs.data.DirectoryStatus;
import com.devinrsmith.weedfs.data.Lookup;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Maps;
import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.Query;

import java.util.Map;

/**
* Created by dsmith on 9/22/14.
*/
public class WeedFSMasterClientCacheLookup implements WeedFSMasterClient {
    private final WeedFSMasterClient delegate;
    private final LoadingCache<Map.Entry<Integer, String>, Lookup> cache;

    public WeedFSMasterClientCacheLookup(final WeedFSMasterClient delegate, CacheBuilder<Object, Object> cacheBuilder) {
        this.delegate = delegate;
        cache = cacheBuilder.build(new CacheLoader<Map.Entry<Integer, String>, Lookup>() {
            @Override
            public Lookup load(Map.Entry<Integer, String> pair) throws Exception {
                return delegate.directoryLookup(pair.getKey(), pair.getValue());
            }
        });
    }

    @Override
    @GET("/dir/assign")
    public Assignment directoryAssignment(@Query("collection") String collection, @Query("replication") String replication, @Query("dataCenter") String dataCenter, @Query("ttl") String ttl, @Query("count") Integer count) {
        return delegate.directoryAssignment(collection, replication, dataCenter, ttl, count);
    }

    @Override
    @GET("/dir/lookup")
    public Lookup directoryLookup(@Query("volumeId") Integer volumeId, @Query("collection") String collection) {
        return cache.getUnchecked(Maps.immutableEntry(volumeId, collection));
    }

    @Override
    @GET("/vol/grow")
    public Response growVolume(@Query("collection") String collection, @Query("replication") String replication, @Query("dataCenter") String dataCenter, @Query("count") Integer count) {
        return delegate.growVolume(collection, replication, dataCenter, count);
    }

    @Override
    @GET("/vol/vacuum")
    public Response vacuum(@Query("garbageThreshold") Double garbageThreshold) {
        return delegate.vacuum(garbageThreshold);
    }

    @Override
    @GET("/cluster/status")
    public ClusterStatus clusterStatus() {
        return delegate.clusterStatus();
    }

    @Override
    @GET("/dir/status")
    public DirectoryStatus directoryStatus() {
        return delegate.directoryStatus();
    }
}
