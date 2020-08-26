package com.sahan.mdkair60_61_62;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */

    LatLng bcas = new LatLng(6.871120,79.861624);//6.8534446,76.5492725,6.42z
   // LatLng to = new LatLng(6.8534446,79.8477243);//6.8534446,79.8477243,12.42z

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera

        mMap.addMarker(new MarkerOptions().position(bcas).title("BCAS City Campus"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bcas, 17.0f));


        CameraUpdate cameraUpdateBCAS_B = CameraUpdateFactory.newLatLngZoom(bcas, 7.0f);
        final CameraUpdate cameraUpdateBCAS_E = CameraUpdateFactory.newLatLngZoom(bcas, 17.0f);
        mMap.animateCamera(cameraUpdateBCAS_B, 3000, new GoogleMap.CancelableCallback() {
            @Override
            public void onFinish() {
                mMap.moveCamera(cameraUpdateBCAS_E);
            }

            @Override
            public void onCancel() {

            }
        });
    }
}