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
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tryb_ciemny);

        toggle_tryb_ciemny = findViewById(R.id.toggle_tryb_ciemny);

        SharedPreferences sharedPreferences = getSharedPreferences("sharedPrefs", MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();
        final boolean isDarkModeOn = sharedPreferences.getBoolean("isDarkModeOn", false);

        if(isDarkModeOn){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            toggle_tryb_ciemny.setImageResource(R.drawable.tryb_ciemny_on);
        }
        else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            toggle_tryb_ciemny.setImageResource(R.drawable.tryb_ciemny_off);
        }

        toggle_tryb_ciemny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isDarkModeOn){
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                    editor.putBoolean("isDarkModeOn", false);
                    editor.apply();
                    toggle_tryb_ciemny.setImageResource(R.drawable.tryb_ciemny_off);
                    Toast.makeText(tryb_ciemny.this, "Tryb ciemny wyłączony", Toast.LENGTH_SHORT).show();
                }
                else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                    editor.putBoolean("isDarkModeOn", true);
                    editor.apply();
                    toggle_tryb_ciemny.setImageResource(R.drawable.tryb_ciemny_on);
                    Toast.makeText(tryb_ciemny.this, "Tryb ciemny włączony", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}