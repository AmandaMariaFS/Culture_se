package com.example.culturese;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Integer[] ptOn = {0, 0, 0, 0, 0};
        LinearLayout festivais = findViewById(R.id.festivaisM);
        LinearLayout idiomas = findViewById(R.id.idiomasM);
        LinearLayout religiao = findViewById(R.id.rreligiaoM);
        LinearLayout culinaria = findViewById(R.id.culinariaM);
        LinearLayout PontosTu = findViewById(R.id.PTM);

        ImageButton bttBackAfrica = findViewById(R.id.bttBackM);
        bttBackAfrica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity2.this, Africa.class);
                startActivity(it);
            }
        });

        Button bttFestivais = findViewById(R.id.bttFes2);
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

        Button closeFes = findViewById(R.id.bttCloseFesM);
        closeFes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ptOn[0] = 0;
                festivais.setVisibility(View.GONE);
                bttFestivais.setText("Festivais +");
            }
        });

        Button bttIdiomas = findViewById(R.id.bttIdM);
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

        Button closeId = findViewById(R.id.bttCloseIdM);
        closeId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ptOn[1] = 0;
                idiomas.setVisibility(View.GONE);
                bttIdiomas.setText("Idiomas +");
            }
        });

        Button bttRel = findViewById(R.id.bttRelM);
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

        Button closeRel = findViewById(R.id.bttCloseRelM);
        closeRel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ptOn[2] = 0;
                religiao.setVisibility(View.GONE);
                bttRel.setText("Religião +");
            }
        });

        Button bttPT = findViewById(R.id.bttPT2);
        bttPT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ptOn[4] == 0){
                    ptOn[4] = 1;
                    PontosTu.setVisibility(View.VISIBLE);
                    bttPT.setText("Pontos Turísticos -");
                }else{
                    ptOn[4] = 0;
                    PontosTu.setVisibility(View.GONE);
                    bttPT.setText("Pontos Turísticos +");
                }
            }
        });

        Button closePT = findViewById(R.id.bttClosePTM);
        closePT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ptOn[4] = 0;
                PontosTu.setVisibility(View.GONE);
                bttPT.setText("Pontos Turísticos +");
            }
        });

        Button bttCulinaria = findViewById(R.id.bttCulM);
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

        Button closeCulinaria = findViewById(R.id.bttCloseCulM2);
        closeCulinaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ptOn[3] = 0;
                culinaria.setVisibility(View.GONE);
                bttCulinaria.setText("Culinária +");
            }
        });

    }
}