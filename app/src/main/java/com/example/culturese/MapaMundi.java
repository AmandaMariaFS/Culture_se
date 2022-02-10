package com.example.culturese;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MapaMundi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_mundi);

        Button bttAmerica = findViewById(R.id.bttAmerica);
        bttAmerica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MapaMundi.this, America.class);
                startActivity(intent);
            }
        });

        Button bttAfrica = findViewById(R.id.bttAfrica);
        bttAfrica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MapaMundi.this, Africa.class);
                startActivity(intent);
            }
        });

        Button bttAsia = findViewById(R.id.bttAsia);
        bttAsia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MapaMundi.this, Asia.class);
                startActivity(it);
            }
        });

        Button bttEuropa = findViewById(R.id.bttEuropa);
        bttEuropa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MapaMundi.this, Europa.class);
                startActivity(it);
            }
        });

        Button bttOceania = findViewById(R.id.bttOceania);
        bttOceania.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MapaMundi.this, Oceania.class);
                startActivity(it);
            }
        });
    }
}