package com.cmput301f16t11.a2b;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by tothd on 11/10/2016.
 */

public class MockUserRequest extends UserRequest {

    public MockUserRequest(LatLng start, LatLng end, Number fare, User user){
        super(start,end,fare,user);
        MockRequestController.addOpenRequest(this);
    }
}
