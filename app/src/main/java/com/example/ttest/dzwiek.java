package com.example.ttest;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dzwiek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dzwiek);

        final MediaPlayer sound = MediaPlayer.create(this, R.raw.dzwiek_audio);

        Button btn_dzwiek = findViewById(R.id.btn_dzwiek);

        btn_dzwiek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               sound.start();
            }
        });
    }
}