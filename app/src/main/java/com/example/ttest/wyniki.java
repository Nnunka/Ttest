package com.example.ttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class wyniki extends AppCompatActivity {

    RadioButton tak_latarka, nie_latarka;
    RadioButton tak_tryb_ciemny, nie_tryb_ciemny;

    TextView wynik_latarka, wynik_tryb_ciemny;

    Button podsumuj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wyniki);

        tak_latarka = (RadioButton) findViewById(R.id.tak_latarka);
        nie_latarka = (RadioButton) findViewById(R.id.nie_latarka);
        wynik_latarka = (TextView) findViewById(R.id.wynik_latarka);
        podsumuj = (Button) findViewById(R.id.podsumuj);

        tak_tryb_ciemny = (RadioButton) findViewById(R.id.tak_tryb_ciemny);
        nie_tryb_ciemny = (RadioButton) findViewById(R.id.nie_tryb_ciemny);
        wynik_tryb_ciemny = (TextView) findViewById(R.id.wynik_tryb_ciemny);
        podsumuj = (Button) findViewById(R.id.podsumuj);

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


            }
        });

    }
}