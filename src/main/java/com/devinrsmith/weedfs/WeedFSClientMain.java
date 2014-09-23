package com.devinrsmith.weedfs;

import com.devinrsmith.weedfs.data.Assignment;
import com.devinrsmith.weedfs.data.Lookup;
import retrofit.RestAdapter;
import retrofit.mime.TypedFile;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by dsmith on 9/22/14.
 */
public class WeedFSClientMain {





    public static void main(String[] args) {
        final RestAdapter mainAdapter = new RestAdapter.Builder().setEndpoint("http://localhost:9333").build();

        final WeedFSMasterClient master = mainAdapter.create(WeedFSMasterClient.class);


        final Map<String, WeedFSVolumeClient> endpointToClient = new HashMap<>();

//        master.growVolume("pictures", "001", null, 16);

        for (int i = 0; i < 1000; ++i) {
            System.out.println(i);

            final Assignment assignment = master.directoryAssignment("pictures", null, null, null, null);
            final Integer volume = assignment.getVolume();
            final Lookup lookup = master.directoryLookup(volume, null);
            final String endpoint = lookup.getLocations().get(0).getPublicUrl();

            WeedFSVolumeClient vc = endpointToClient.get(endpoint);
            if (vc == null) {
                vc = new RestAdapter.Builder().setEndpoint("http://" + endpoint).build().create(WeedFSVolumeClient.class);
                endpointToClient.put(endpoint, vc);
            }

            vc.upload(assignment.getFid(), new TypedFile("image/png", Paths.get("/Users/dsmith/Downloads/textOnText.png").toFile()));


            //System.out.println(upload);

            //System.out.println(volumeClient.status());
        }


    }
}
