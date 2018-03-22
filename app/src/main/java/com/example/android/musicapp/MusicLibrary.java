package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MusicLibrary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_library);

        Button goBtn1 = findViewById(R.id.go_btn1);
        Button goBtn2 = findViewById(R.id.go_btn2);
        Button goBtn3 = findViewById(R.id.go_btn3);


        goBtn1.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MusicLibrary.this, Album1.class);
                startActivity(numbersIntent);
            }
        });

        goBtn2.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MusicLibrary.this, Album2.class);
                startActivity(numbersIntent);
            }
        });

        goBtn3.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MusicLibrary.this, Album3.class);
                startActivity(numbersIntent);
            }
        });
    }
}
