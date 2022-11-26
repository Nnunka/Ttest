package com.example.ttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class wyniki extends AppCompatActivity {

    RadioButton tak_latarka, nie_latarka;
    TextView text_wyniki;
    Button podsumuj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wyniki);

        tak_latarka = findViewById(R.id.tak_latarka);
        nie_latarka = findViewById(R.id.nie_latarka);
        text_wyniki = findViewById(R.id.text_wyniki);
        podsumuj = findViewById(R.id.podsumuj);

        podsumuj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tak_latarka.isChecked()) {
                    ((TextView)findViewById(R.id.text_wyniki)).setText("Test latarki przebiegł pomyślnie");
                }
                else if (nie_latarka.isChecked()) {
                    ((TextView)findViewById(R.id.text_wyniki)).setText("Test latarki NIE przebiegł pomyślnie");
                }
            }
        });


    }
}