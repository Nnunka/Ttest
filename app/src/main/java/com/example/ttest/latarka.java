package com.example.ttest;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class latarka extends AppCompatActivity {

    private ImageButton toggle_latarka;

    boolean hasCameraFlash = false;
    boolean flashOn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latarka);

        toggle_latarka = findViewById(R.id.toggle_latarka);

        hasCameraFlash = getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH);

        toggle_latarka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(hasCameraFlash){
                    if(flashOn){
                        flashOn = false;
                        toggle_latarka.setImageResource(R.drawable.latarka_off);
                        flashLightOff();
                    }
                    else
                    {
                        flashOn = true;
                        toggle_latarka.setImageResource(R.drawable.latarka_on);
                        flashLightOn();
                    }
                }
                else
                {
                    Toast.makeText(latarka.this, "No flash available on your device", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
        private void flashLightOn(){
            CameraManager cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
            try{
                assert cameraManager != null;
                String cameraId = cameraManager.getCameraIdList()[0];
                cameraManager.setTorchMode(cameraId, true);
                Toast.makeText(latarka.this, "Latarka włączona", Toast.LENGTH_SHORT).show();
            }
            catch(CameraAccessException e){
                Log.e("Camera Problem", "Nie można uruchomić latarki");
            }
        }

    private void flashLightOff(){
        CameraManager cameraManager = (CameraManager) getSystemService(Context.CAMERA_SERVICE);
        try{
            assert cameraManager != null;
            String cameraId = cameraManager.getCameraIdList()[0];
            cameraManager.setTorchMode(cameraId, false);
            Toast.makeText(latarka.this, "Latarka wyłączona", Toast.LENGTH_SHORT).show();
        }
        catch(CameraAccessException e){
            Log.e("Camera Problem", "Nie można uruchomić latarki");
        }
    }
}