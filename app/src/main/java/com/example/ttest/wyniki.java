package com.example.ttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class wyniki extends AppCompatActivity {

    RadioButton tak_latarka, nie_latarka, tak_tryb_ciemny, nie_tryb_ciemny, tak_zblizeniowy, nie_zblizeniowy, tak_gps, nie_gps,
            tak_wifi, nie_wifi, tak_dzwiek, nie_dzwiek, tak_mikrofon, nie_mikrofon, tak_aparat, nie_aparat;

    TextView wynik_latarka, wynik_tryb_ciemny, wynik_zblizeniowy, wynik_gps, wynik_wifi, wynik_dzwiek, wynik_mikrofon, wynik_aparat;

    TextView model;

    Button podsumuj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wyniki);

        tak_latarka = (RadioButton) findViewById(R.id.tak_latarka);
        nie_latarka = (RadioButton) findViewById(R.id.nie_latarka);
        wynik_latarka = (TextView) findViewById(R.id.wynik_latarka);

        tak_tryb_ciemny = (RadioButton) findViewById(R.id.tak_tryb_ciemny);
        nie_tryb_ciemny = (RadioButton) findViewById(R.id.nie_tryb_ciemny);
        wynik_tryb_ciemny = (TextView) findViewById(R.id.wynik_tryb_ciemny);

        tak_zblizeniowy = (RadioButton) findViewById(R.id.tak_zblizeniowy);
        nie_zblizeniowy = (RadioButton) findViewById(R.id.nie_zblizeniowy);
        wynik_zblizeniowy = (TextView) findViewById(R.id.wynik_zblizeniowy);

        tak_gps = (RadioButton) findViewById(R.id.tak_gps);
        nie_gps = (RadioButton) findViewById(R.id.nie_gps);
        wynik_gps = (TextView) findViewById(R.id.wynik_gps);

        tak_wifi = (RadioButton) findViewById(R.id.tak_wifi);
        nie_wifi = (RadioButton) findViewById(R.id.nie_wifi);
        wynik_wifi = (TextView) findViewById(R.id.wynik_wifi);

        tak_dzwiek = (RadioButton) findViewById(R.id.tak_dzwiek);
        nie_dzwiek = (RadioButton) findViewById(R.id.nie_dzwiek);
        wynik_dzwiek = (TextView) findViewById(R.id.wynik_dzwiek);

        tak_mikrofon = (RadioButton) findViewById(R.id.tak_mikrofon);
        nie_mikrofon = (RadioButton) findViewById(R.id.nie_mikrofon);
        wynik_mikrofon = (TextView) findViewById(R.id.wynik_mikrofon);

        tak_aparat = (RadioButton) findViewById(R.id.tak_aparat);
        nie_aparat = (RadioButton) findViewById(R.id.nie_aparat);
        wynik_aparat = (TextView) findViewById(R.id.wynik_aparat);

        podsumuj = (Button) findViewById(R.id.podsumuj);



        model = (TextView) findViewById(R.id.model);
        String stringBuildModel = "Marka i model: " + Build.MANUFACTURER + " " + Build.MODEL;
        model.setText(stringBuildModel);



        podsumuj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(tak_latarka.isChecked()) {
                    ((TextView)findViewById(R.id.wynik_latarka)).setText("Test latarki przebiegł pomyślnie");
                }
                if (nie_latarka.isChecked()) {
                    ((TextView)findViewById(R.id.wynik_latarka)).setText("Test latarki NIE przebiegł pomyślnie");
                }


                if(tak_tryb_ciemny.isChecked()) {
                    ((TextView)findViewById(R.id.wynik_tryb_ciemny)).setText("Test trybu ciemnego przebiegł pomyślnie");
                }
                if (nie_tryb_ciemny.isChecked()) {
                    ((TextView)findViewById(R.id.wynik_tryb_ciemny)).setText("Test trybu ciemnego NIE przebiegł pomyślnie");
                }


                if(tak_zblizeniowy.isChecked()) {
                    ((TextView)findViewById(R.id.wynik_zblizeniowy)).setText("Test czujnika zbliżeniowego przebiegł pomyślnie");
                }
                if (nie_zblizeniowy.isChecked()) {
                    ((TextView)findViewById(R.id.wynik_zblizeniowy)).setText("Test czujnika zbliżeniowego NIE przebiegł pomyślnie");
                }


                if(tak_gps.isChecked()) {
                    ((TextView)findViewById(R.id.wynik_gps)).setText("Test GPS przebiegł pomyślnie");
                }
                if (nie_gps.isChecked()) {
                    ((TextView)findViewById(R.id.wynik_gps)).setText("Test GPS NIE przebiegł pomyślnie");
                }


                if(tak_wifi.isChecked()) {
                    ((TextView)findViewById(R.id.wynik_wifi)).setText("Test Wifi przebiegł pomyślnie");
                }
                if (nie_wifi.isChecked()) {
                    ((TextView)findViewById(R.id.wynik_wifi)).setText("Test Wifi NIE przebiegł pomyślnie");
                }


                if(tak_dzwiek.isChecked()) {
                    ((TextView)findViewById(R.id.wynik_dzwiek)).setText("Test dźwięku przebiegł pomyślnie");
                }
                if (nie_dzwiek.isChecked()) {
                    ((TextView)findViewById(R.id.wynik_dzwiek)).setText("Test dźwięku NIE przebiegł pomyślnie");
                }


                if(tak_mikrofon.isChecked()) {
                    ((TextView)findViewById(R.id.wynik_mikrofon)).setText("Test mikrofonu przebiegł pomyślnie");
                }
                if (nie_mikrofon.isChecked()) {
                    ((TextView)findViewById(R.id.wynik_mikrofon)).setText("Test mikrofonu NIE przebiegł pomyślnie");
                }


                if(tak_aparat.isChecked()) {
                    ((TextView)findViewById(R.id.wynik_aparat)).setText("Test aparatu przebiegł pomyślnie");
                }
                if (nie_aparat.isChecked()) {
                    ((TextView)findViewById(R.id.wynik_aparat)).setText("Test aparatu NIE przebiegł pomyślnie");
                }

            }
        });

    }
}