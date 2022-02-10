package com.example.culturese;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Europa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_europa);

        ImageButton voltar = findViewById(R.id.bttBackMundi4);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Europa.this, MapaMundi.class);
                startActivity(it);
            }
        });

        Button bttEspanha = findViewById(R.id.bttEspanha);
        bttEspanha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Europa.this, Espanha.class);
                startActivity(it);
            }
        });

        Button bttItalia = findViewById(R.id.bttItalia);
        bttItalia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Europa.this, Italia.class);
                startActivity(it);
            }
        });
    }
}