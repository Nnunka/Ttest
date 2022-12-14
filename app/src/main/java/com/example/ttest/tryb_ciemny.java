package com.example.ttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.SwitchCompat;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class tryb_ciemny extends AppCompatActivity {

    private ImageButton toggle_tryb_ciemny;
    private ImageView logo;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tryb_ciemny);

        toggle_tryb_ciemny = findViewById(R.id.toggle_tryb_ciemny);
        logo = findViewById(R.id.logo);

        SharedPreferences sharedPreferences = getSharedPreferences("sharedPrefs", MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        final boolean isDarkModeOn = sharedPreferences.getBoolean("isDarkModeOn", false);

        if(isDarkModeOn){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            toggle_tryb_ciemny.setImageResource(R.drawable.tryb_ciemny_on);
            logo.setImageResource(R.drawable.logo_black);
        }
        else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            toggle_tryb_ciemny.setImageResource(R.drawable.tryb_ciemny_off);
            logo.setImageResource(R.drawable.logo_white);

        }

        toggle_tryb_ciemny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isDarkModeOn){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    editor.putBoolean("isDarkModeOn", false);
                    editor.apply();
                    toggle_tryb_ciemny.setImageResource(R.drawable.tryb_ciemny_off);
                    logo.setImageResource(R.drawable.logo_white);
                    Toast.makeText(tryb_ciemny.this, "Tryb ciemny wy????czony", Toast.LENGTH_SHORT).show();
                }
                else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    editor.putBoolean("isDarkModeOn", true);
                    editor.apply();
                    toggle_tryb_ciemny.setImageResource(R.drawable.tryb_ciemny_on);
                    logo.setImageResource(R.drawable.logo_black);
                    Toast.makeText(tryb_ciemny.this, "Tryb ciemny w????czony", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}