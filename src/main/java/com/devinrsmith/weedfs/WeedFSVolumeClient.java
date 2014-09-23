package com.devinrsmith.weedfs;

import com.devinrsmith.weedfs.data.Upload;
import com.devinrsmith.weedfs.data.VolumeStatus;
import retrofit.client.Response;
import retrofit.http.*;
import retrofit.mime.TypedInput;

/**
 * Created by dsmith on 9/22/14.
 */
public interface WeedFSVolumeClient {
    @Multipart
    @POST("/{id}")
    Upload upload(
            @Path("id") String id,
            @Part("file") TypedInput input);

    /**
     * caller responsible for calling Response.getBody().in() (and closing it I assume...?)
     * @param id
     * @return
     */
    @GET("/{id}")
    @Streaming
    Response get(
            @Path("id") String id);

    @DELETE("/{id}")
    Response delete(
            @Path("id") String id);

    @GET("/status")
    VolumeStatus status();

}
