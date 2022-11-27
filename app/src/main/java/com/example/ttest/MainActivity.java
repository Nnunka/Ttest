package com.example.ttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button button_1; //activity_main.xml -> activity_latarka.xml
    Button button_2; //activity_main.xml -> activity_tryb_ciemny.xml
    Button button_3; //activity_main.xml -> activity_czujnik_zblizeniowy.xml
    Button button_4; //activity_main.xml -> activity_gps.xml
    Button button_5; //activity_main.xml -> activity_wifi.xml
    Button button_6; //activity_main.xml -> activity_dzwiek.xml
    Button button_7; //activity_main.xml -> activity_mikrofon.xml
    Button button_8; //activity_main.xml -> activity_aparat.xml
    Button button_9; //activity_main.xml -> activity_wyniki.xml


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


        //activity_main.xml -> activity_zblizeniowy.xml
        button_3 = (Button) findViewById(R.id.button_3);

        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, czujnik_zblizeniowy.class);
                startActivity(intent);
            }
        }); //koniec activity_main.xml -> activity_zblizeniowy.xml


        //activity_main.xml -> activity_gps.xml
        button_4 = (Button) findViewById(R.id.button_4);

        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, gps.class);
                startActivity(intent);
            }
        }); //koniec activity_main.xml -> activity_gps.xml


        //activity_main.xml -> activity_wifi.xml
        button_5 = (Button) findViewById(R.id.button_5);

        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, wifi.class);
                startActivity(intent);
            }
        }); //koniec activity_main.xml -> activity_wifi.xml


        //activity_main.xml -> activity_dzwiek.xml
        button_6 = (Button) findViewById(R.id.button_6);

        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, dzwiek.class);
                startActivity(intent);
            }
        }); //koniec activity_main.xml -> activity_dzwiek.xml


        //activity_main.xml -> activity_mikrofon.xml
        button_7 = (Button) findViewById(R.id.button_7);

        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, mikrofon.class);
                startActivity(intent);
            }
        }); //koniec activity_main.xml -> activity_mikrofon.xml


        //activity_main.xml -> activity_aparat.xml
        button_8 = (Button) findViewById(R.id.button_8);

        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, aparat.class);
                startActivity(intent);
            }
        }); //koniec activity_main.xml -> activity_aparat.xml


        //activity_main.xml -> activity_wyniki.xml
        button_9 = (Button) findViewById(R.id.button_9);

        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, wyniki.class);
                startActivity(intent);
            }
        }); //koniec activity_main.xml -> activity_wyniki.xml


    }
}

