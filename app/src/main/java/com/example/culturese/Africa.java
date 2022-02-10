package com.example.culturese;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Africa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_africa);

        ImageButton bttVoltar = findViewById(R.id.bttBackMundi3);
        bttVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Africa.this, MapaMundi.class);
                startActivity(intent);
            }
        });

        Button marrocos = findViewById(R.id.bttMar);
        marrocos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Africa.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        Button tanzania = findViewById(R.id.bttTanz);
        tanzania.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Africa.this, Tanzania.class);
                startActivity(it);
            }
        });
    }
}