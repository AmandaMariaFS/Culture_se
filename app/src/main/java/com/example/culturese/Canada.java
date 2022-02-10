package com.example.culturese;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class Canada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canada);

        final Integer[] ptOn = {0, 0, 0, 0, 0};
        LinearLayout festivais = findViewById(R.id.Festivais);
        LinearLayout idiomas = findViewById(R.id.idiomas);
        LinearLayout religiao = findViewById(R.id.religiao);
        LinearLayout culinaria = findViewById(R.id.culinaria);
        LinearLayout pontosTuristicos = findViewById(R.id.pontosTuristicos);

        ImageButton bttBack = findViewById(R.id.bttBackAmerica);
        bttBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Canada.this, America.class);
                startActivity(it);
            }
        });

        Button bttFes = findViewById(R.id.bttFes);
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

        Button closeFes = findViewById(R.id.bttCloseFes);
        closeFes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ptOn[0] = 0;
                festivais.setVisibility(View.GONE);
                bttFes.setText("Festivais +");
            }
        });

        Button bttid = findViewById(R.id.bttid);
        bttid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(ptOn[1] == 0){
                    ptOn[1] = 1;
                    idiomas.setVisibility(View.VISIBLE);
                    bttid.setText("Idioma -");
                }else{
                    ptOn[1] = 0;
                    idiomas.setVisibility(View.GONE);
                    bttid.setText("Idioma +");
                }
            }
        });

        Button closeId = findViewById(R.id.bttCloseId);
        closeId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ptOn[1] = 0;
                idiomas.setVisibility(View.GONE);
                bttid.setText("Idioma +");
            }
        });

        Button bttReligiao = findViewById(R.id.bttRel);
        bttReligiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(ptOn[2] == 0){
                    ptOn[2] = 1;
                    religiao.setVisibility(View.VISIBLE);
                    bttReligiao.setText("Religião -");
                }else{
                    ptOn[2] = 0;
                    religiao.setVisibility(View.GONE);
                    bttReligiao.setText("Religião +");
                }
            }
        });

        Button closeReligiao = findViewById(R.id.bttCloseRel);
        closeReligiao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ptOn[2] = 0;
                religiao.setVisibility(View.GONE);
                bttReligiao.setText("Religião +");
            }
        });

        Button bttCul = findViewById(R.id.bttCul);
        bttCul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(ptOn[3]==0){
                    ptOn[3] = 1;
                    culinaria.setVisibility(View.VISIBLE);
                    bttCul.setText("Culinária -");
                }else {
                    ptOn[3] = 0;
                    culinaria.setVisibility(View.GONE);
                    bttCul.setText("Culinária +");
                }
            }
        });

        Button closeCul = findViewById(R.id.bttCloseCul);
        closeCul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                ptOn[3] = 0;
                culinaria.setVisibility(View.GONE);
                bttCul.setText("Culinária +");
            }
        });

        Button bttPt = findViewById(R.id.bttPT);
        bttPt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(ptOn[4]==0){
                    ptOn[4] = 1;
                    pontosTuristicos.setVisibility(View.VISIBLE);
                    bttPt.setText("Pontos turísticos -");
                }else {
                    ptOn[4] = 0;
                    pontosTuristicos.setVisibility(View.GONE);
                    bttPt.setText("Pontos turísticos +");
                }
            }
        });

        Button closePt = findViewById(R.id.bttClosePT);
        closePt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ptOn[4] = 0;
                pontosTuristicos.setVisibility(View.GONE);
                bttPt.setText("Pontos turísticos +");
            }
        });
    }
}