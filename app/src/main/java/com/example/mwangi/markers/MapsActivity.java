package com.example.mwangi.markers;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class MapsActivity extends FragmentActivity implements
        OnMapReadyCallback
        //Lo


{


    private static final int MY_REQUEST_INT = 177;
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
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //Enable Current location
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.
                PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.
                ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

                requestPermissions(new String[]{Manifest.permission.ACCESS_COARSE_LOCATION,
                        Manifest.permission.ACCESS_FINE_LOCATION}, MY_REQUEST_INT);

            }


            return;

        } else {
            mMap.setMyLocationEnabled(true);


        }


        // Add a marker in Sydney and move the camera
        //LatLng sydney = new LatLng(-34, 151);
        //mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney")
        // .icon(BitmapDescriptorFactory.fromResource(R.drawable.blackspot))
        //      );
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        //mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sydney,16),5000,null);
        //new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.drawable.blackspot));

        //LatLng latLng = new LatLng(-1.2652560778411037, 36.81265354156495);
        //mMap.addMarker(new MarkerOptions().position(latLng).title("Marker in Parklands"));
        //mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,16),5000,null);
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        //BitmapDescriptor icon = BitmapDescriptorFactory.fromResource(R.drawable.blackspot);
        ////LatLng harmbug = new LatLng(-37, 120);
        //mMap.addMarker(new MarkerOptions().position(harmbug).title("Marker in Harmbug")
        //.icon(icon));
        //mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(harmbug,16),5000,null);
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(harmbug));

        //LatLng kenya = new LatLng(-2.456, 37);
        //mMap.addMarker(new MarkerOptions().position(kenya).title("Marker in Kenya"));
        //mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(kenya,16),5000,null);
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(kenya));

        LatLng sydney = new LatLng(-0.8041213212075744, 36.53117179870606);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Blackspot at Kinungi"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sydney, 18), 5000, null);

        LatLng gilgil = new LatLng(-0.2167, 36.2667);
        mMap.addMarker(new MarkerOptions().position(gilgil).title("Blackspot at Gilgil"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gilgil));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(gilgil, 18), 5000, null);

        LatLng njoro = new LatLng(-0.3290, 35.9440);
        mMap.addMarker(new MarkerOptions().position(njoro).title("Blackspot at Njoro"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(njoro));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(njoro, 18), 5000, null);

        LatLng bluepost = new LatLng(-1.0226988092777693, 37.06806957721711);
        mMap.addMarker(new MarkerOptions().position(bluepost).title("Blackspot at Bluepost Bridge"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bluepost));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(bluepost, 18), 5000, null);

        LatLng Nithi = new LatLng(-0.26649259802107667, 37.66248464584351);
        mMap.addMarker(new MarkerOptions().position(Nithi).title("Blackspot at Nithi Bridge"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Nithi));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(bluepost, 18), 5000, null);

        LatLng Maungu = new LatLng(-3.558353542362671, 38.74993801116944);
        mMap.addMarker(new MarkerOptions().position(Maungu).title("Blackspot at Maungu Area"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Maungu));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Maungu, 18), 5000, null);

        LatLng Misikhu = new LatLng(0.6662027919912484, 34.75215911865235);
        mMap.addMarker(new MarkerOptions().position(Misikhu).title("Blackspot at Misikhu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Misikhu));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Maungu, 18), 5000, null);

        LatLng Muthaiga = new LatLng(-1.2614375406469367, 36.840720176696784);
        mMap.addMarker(new MarkerOptions().position(Muthaiga).title("Blackspot at Muthaiga Road"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Muthaiga));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Maungu, 18), 5000, null);

        LatLng Pangani = new LatLng(-1.2665003190843396, 36.834239959716804);
        mMap.addMarker(new MarkerOptions().position(Muthaiga).title("Blackspot at Pangani"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Pangani));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(Pangani, 18), 5000, null);

        LatLng KU = new LatLng(-1.1823303731373749, 36.93703293800355);
        mMap.addMarker(new MarkerOptions().position(KU).title("Blackspot at KU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KU));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(KU, 18), 5000, null);


    }

    public void onMapSearch(View view) {
        EditText locationSearch = (EditText) findViewById(R.id.editText);
        String location = locationSearch.getText().toString();
        List<Address> addressList = null;

        if (location != null || !location.equals("")) {
            Geocoder geocoder = new Geocoder(this);
            try {
                addressList = geocoder.getFromLocationName(location, 1);

            } catch (IOException e) {
                e.printStackTrace();
            }
            Address address = addressList.get(0);
            LatLng latLng = new LatLng(address.getLatitude(), address.getLongitude());
            mMap.addMarker(new MarkerOptions().position(latLng).title("Marker"));
            mMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));
        }


    }
}
