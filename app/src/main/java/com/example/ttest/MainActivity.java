package com.example.ttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button button_1; //activity_main.xml -> activity_latarka.xml
    Button button_2; //activity_main.xml -> activity_tryb_ciemny.xml
    Button button_3; //activity_main.xml -> activity_zyroskop.xml
    Button button_4; //activity_main.xml -> activity_gps.xml
    Button button_5; //activity_main.xml -> activity_gps.xml
    Button button_6; //activity_main.xml -> activity_czujnik_swiatla.xml


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //activity_main.xml -> activity_latarka.xml
         button_1 = (Button) findViewById(R.id.button_1);

         button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, latarka.class);
                startActivity(intent);
            }
        }); //koniec activity_main.xml -> activity_latarka.xml


        //activity_main.xml -> activity_tryb_ciemny.xml
        button_2 = (Button) findViewById(R.id.button_2);

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, tryb_ciemny.class);
                startActivity(intent);
            }
        }); //koniec activity_main.xml -> activity_tryb_ciemny.xml


        //activity_main.xml -> activity_zyroskop.xml
        button_3 = (Button) findViewById(R.id.button_3);

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, czujnik_zblizeniowy.class);
                startActivity(intent);
            }
        }); //koniec activity_main.xml -> activity_zyroskop.xml


        //activity_main.xml -> activity_gps.xml
        button_4 = (Button) findViewById(R.id.button_4);

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, gps.class);
                startActivity(intent);
            }
        }); //koniec activity_main.xml -> gps.xml


        //activity_main.xml -> activity_bluetooth.xml
        button_5 = (Button) findViewById(R.id.button_5);

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, bluetooth.class);
                startActivity(intent);
            }
        }); //koniec activity_main.xml -> activity_bluetooth.xml


        //activity_main.xml -> activity_czujnik_swiatla.xml
        button_6 = (Button) findViewById(R.id.button_6);

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, dzwiek.class);
                startActivity(intent);
            }
        }); //koniec activity_main.xml -> activity_czujnik_swiatla.xml


    }
}

