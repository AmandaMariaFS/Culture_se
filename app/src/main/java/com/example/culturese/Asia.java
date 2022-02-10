package com.example.culturese;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Asia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asia);

        ImageButton voltar = findViewById(R.id.bttBackMundi2);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Asia.this, MapaMundi.class);
                startActivity(it);
            }
        });

        Button russia = findViewById(R.id.bttRussia);
        russia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Asia.this, Russia.class);
                startActivity(it);
            }
        });

        Button tailandia = findViewById(R.id.bttTailandia);
        tailandia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Asia.this, Tailandia.class);
                startActivity(it);
            }
        });
    }
}