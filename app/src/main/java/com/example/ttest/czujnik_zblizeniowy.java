package com.example.ttest;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

public class czujnik_zblizeniowy extends AppCompatActivity implements SensorEventListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_czujnik_zblizeniowy);

        SensorManager sensorManager;
        sensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        if(sensorManager!=null) {
            Sensor proximitySensor = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
            if(proximitySensor!=null) {
                sensorManager.registerListener(this, proximitySensor, sensorManager.SENSOR_DELAY_NORMAL);
            }
        }
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if(sensorEvent.sensor.getType()==Sensor.TYPE_PROXIMITY) {
            if(sensorEvent.values[0]==0) {
                ((TextView)findViewById(R.id.sensor)).setText("Przy czujniku jest obiekt");
            } else {
                ((TextView)findViewById(R.id.sensor)).setText("Przyłóż obiekt do czujnika");
            }
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}