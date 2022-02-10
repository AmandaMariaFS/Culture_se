package com.example.culturese;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class Espanha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espanha);

        final Integer[] ptOn = {0,0,0,0,0};
        LinearLayout festivais = findViewById(R.id.festivaisEs);
        LinearLayout idiomas = findViewById(R.id.idiomasEs);
        LinearLayout religiao = findViewById(R.id.religiaoEs);
        LinearLayout culinaria = findViewById(R.id.culinariaEs);
        LinearLayout pontosT = findViewById(R.id.PTEs);

        ImageButton voltar = findViewById(R.id.bttBackEs);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Espanha.this, Europa.class);
                startActivity(it);
            }
        });

        Button bttFestivais = findViewById(R.id.bttFesEs);
        bttFestivais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ptOn[0] == 0){
                    ptOn[0] = 1;
                    festivais.setVisibility(View.VISIBLE);
                    bttFestivais.setText("Festivais -");
                }else{
                    ptOn[0] = 0;
                    festivais.setVisibility(View.GONE);
                    bttFestivais.setText("Festivais +");
                }
            }
        });

        Button closeFes = findViewById(R.id.bttCloseFesEs);
        closeFes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ptOn[0] = 0;
                festivais.setVisibility(View.GONE);
                bttFestivais.setText("Festivais +");
            }
        });

        Button bttIdiomas = findViewById(R.id.bttIdEs);
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

        Button closeIdiomas = findViewById(R.id.bttCloseIdEs);
        closeIdiomas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ptOn[1] = 0;
                idiomas.setVisibility(View.GONE);
                bttIdiomas.setText("Idiomas +");
            }
        });

        Button bttRel = findViewById(R.id.bttRelEs);
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

        Button closeRel = findViewById(R.id.bttCloseRelEs);
        closeRel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ptOn[2] = 0;
                religiao.setVisibility(View.GONE);
                bttRel.setText("Religião +");
            }
        });

        Button bttCulinaria = findViewById(R.id.bttCulEs);
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

        Button closeCulinaria = findViewById(R.id.bttCloseICulEs);
        closeCulinaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ptOn[3] = 0;
                culinaria.setVisibility(View.GONE);
                bttCulinaria.setText("Culinária +");
            }
        });

        Button bttPontosT = findViewById(R.id.bttPTEs);
        bttPontosT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ptOn[4] == 0){
                    ptOn[4] = 1;
                    pontosT.setVisibility(View.VISIBLE);
                    bttPontosT.setText("Pontos turísticos -");
                }else{
                    ptOn[4] = 0;
                    pontosT.setVisibility(View.GONE);
                    bttPontosT.setText("Pontos turísticos +");
                }
            }
        });

        Button closePT = findViewById(R.id.bttClosePtEs);
        closePT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ptOn[4] = 0;
                pontosT.setVisibility(View.GONE);
                bttPontosT.setText("Pontos turísticos +");
            }
        });

    }
}