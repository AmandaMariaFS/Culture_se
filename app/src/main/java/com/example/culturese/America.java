package com.example.culturese;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class America extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_america);

        ImageButton bttBack = findViewById(R.id.bttBackMundi);
        bttBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(America.this, MapaMundi.class);
                startActivity(it);
            }
        });

        Button bttCanada = findViewById(R.id.bttCanada);
        bttCanada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(America.this, Canada.class);
                startActivity(intent);
            }
        });

        Button bttColombia = findViewById(R.id.button11);
        bttColombia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(America.this, Colombia.class);
                startActivity(it);
            }
        });
    }
}