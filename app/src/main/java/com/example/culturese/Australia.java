package com.example.culturese;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class Australia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_australia);

        final Integer[] ptOn = {0,0,0,0,0};
        LinearLayout festivais = findViewById(R.id.festivaisAu);
        LinearLayout idiomas = findViewById(R.id.idiomasAu);
        LinearLayout religiao =findViewById(R.id.religiaoAu);
        LinearLayout culinaria = findViewById(R.id.culinariaAu);
        LinearLayout pontosT = findViewById(R.id.pontosTAu);

        ImageButton voltar = findViewById(R.id.bttBackAu);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Australia.this, Oceania.class);
                startActivity(it);
            }
        });

        Button bttFes = findViewById(R.id.bttFesAu);
        bttFes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ptOn[0] == 0){
                    ptOn[0] = 1;
                    festivais.setVisibility(View.VISIBLE);
                    bttFes.setText("Festivais -");
                }else{
                    ptOn[0] = 0;
                    festivais.setVisibility(View.GONE);
                    bttFes.setText("Festivais +");
                }
            }
        });

        Button closeFes = findViewById(R.id.bttCloseFesAu);
        closeFes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ptOn[0] = 0;
                festivais.setVisibility(View.GONE);
                bttFes.setText("Festivais +");
            }
        });

        Button bttIdiomas = findViewById(R.id.bttIdAu);
        bttIdiomas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ptOn[1] == 0){
                    ptOn[1] = 1;
                    idiomas.setVisibility(View.VISIBLE);
                    bttIdiomas.setText("Idiomas -");
                }else{
                    ptOn[1] = 0;
                    idiomas.setVisibility(View.GONE);
                    bttIdiomas.setText("Idiomas +");
                }
            }
        });

        Button closeId = findViewById(R.id.bttCloseIdAu);
        closeId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ptOn[1] = 0;
                idiomas.setVisibility(View.GONE);
                bttIdiomas.setText("Idiomas +");
            }
        });

        Button bttRel = findViewById(R.id.bttRelAu);
        bttRel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ptOn[2] == 0){
                    ptOn[2] = 1;
                    religiao.setVisibility(View.VISIBLE);
                    bttRel.setText("Religião -");
                }else{
                    ptOn[2] = 0;
                    religiao.setVisibility(View.GONE);
                    bttRel.setText("Religião +");
                }
            }
        });

        Button closeRel = findViewById(R.id.bttCloseRelAu);
        closeRel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ptOn[2] = 0;
                religiao.setVisibility(View.GONE);
                bttRel.setText("Religião +");
            }
        });

        Button bttCulinaria = findViewById(R.id.bttCulAu);
        bttCulinaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ptOn[3] == 0){
                    ptOn[3] = 1;
                    culinaria.setVisibility(View.VISIBLE);
                    bttCulinaria.setText("Culinária -");
                }else{
                    ptOn[3] = 0;
                    culinaria.setVisibility(View.GONE);
                    bttCulinaria.setText("Culinária +");
                }
            }
        });

        Button closeCulinaria = findViewById(R.id.bttCloseCulAu);
        closeCulinaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ptOn[3] = 0;
                culinaria.setVisibility(View.GONE);
                bttCulinaria.setText("Culinária +");
            }
        });

        Button bttPT = findViewById(R.id.bttPTAu);
        bttPT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ptOn[4] == 0){
                    ptOn[4] = 1;
                    pontosT.setVisibility(View.VISIBLE);
                    bttPT.setText("Pontos Turísticos -");
                }else{
                    ptOn[4] = 0;
                    pontosT.setVisibility(View.GONE);
                    bttPT.setText("Pontos Turísticos +");
                }
            }
        });

        Button closePt = findViewById(R.id.bttClosePtAu);
        closePt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ptOn[4] = 0;
                pontosT.setVisibility(View.GONE);
                bttPT.setText("Pontos Turísticos +");
            }
        });
    }
}