package com.example.culturese;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Oceania extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oceania);

        ImageButton voltar = findViewById(R.id.bttBackMundi5);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Oceania.this, MapaMundi.class);
                startActivity(it);
            }
        });

        Button australia = findViewById(R.id.bttAustralia);
        australia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Oceania.this, Australia.class);
                startActivity(it);
            }
        });

        Button bttNZ = findViewById(R.id.bttNovaZ);
        bttNZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Oceania.this, NovaZ.class);
                startActivity(it);
            }
        });
    }
}