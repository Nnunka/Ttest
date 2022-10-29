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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.READ_EXTERNAL_STORAGE},
                PackageManager.PERMISSION_GRANTED);


        //activity_main.xml -> activity_latarka.xml
        button_1 = (Button) findViewById(R.id.button_1);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,latarka.class);
                startActivity(intent);
            }
        }); //koniec activity_main.xml -> activity_latarka.xml


        //activity_main.xml -> activity_tryb_ciemny.xml
        button_2 = (Button) findViewById(R.id.button_2);

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,tryb_ciemny.class);
                startActivity(intent);
            }
        }); //koniec activity_main.xml -> activity_tryb_ciemny.xml


    }
}

