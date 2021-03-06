package com.example.culturese;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class Tailandia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tailandia);

        final Integer[] ptOn = {0, 0, 0, 0, 0};
        LinearLayout festivais = findViewById(R.id.FestivaisTai);
        LinearLayout idiomas = findViewById(R.id.IdiomasTai);
        LinearLayout religiao = findViewById(R.id.ReligiaoTai);
        LinearLayout culinaria = findViewById(R.id.CulinariaTai);
        LinearLayout pontosT = findViewById(R.id.PTTai);

        ImageButton voltar = findViewById(R.id.bttBackR2);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Tailandia.this, Asia.class);
                startActivity(it);
            }
        });

        Button bttFestivais = findViewById(R.id.bttFesTai);
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

        Button closeFes = findViewById(R.id.bttCloseFesTai);
        closeFes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ptOn[0] = 0;
                festivais.setVisibility(View.GONE);
                bttFestivais.setText("Festivais +");
            }
        });

        Button bttIdiomas = findViewById(R.id.bttIdTai);
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

        Button closeIdi = findViewById(R.id.bttCloseIdTai);
        closeIdi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ptOn[1] = 0;
                idiomas.setVisibility(View.GONE);
                bttIdiomas.setText("Idiomas +");
            }
        });

        Button bttRel = findViewById(R.id.bttRelTai);
        bttRel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ptOn[2] == 0){
                    ptOn[2] = 1;
                    religiao.setVisibility(View.VISIBLE);
                    bttRel.setText("Religi??o -");
                }else{
                    ptOn[2] = 0;
                    religiao.setVisibility(View.GONE);
                    bttRel.setText("Religi??o +");
                }
            }
        });

        Button closeRel = findViewById(R.id.bttCloseRelTai);
        closeRel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ptOn[2] = 0;
                religiao.setVisibility(View.GONE);
                bttRel.setText("Religi??o +");
            }
        });

        Button bttCulinaria = findViewById(R.id.bttCulTai);
        bttCulinaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ptOn[3] == 0){
                    ptOn[3] = 1;
                    culinaria.setVisibility(View.VISIBLE);
                    bttCulinaria.setText("Culin??ria -");
                }else{
                    ptOn[3] = 0;
                    culinaria.setVisibility(View.GONE);
                    bttCulinaria.setText("Culin??ria +");
                }
            }
        });

        Button closeCulinaria = findViewById(R.id.bttCloseCulTai);
        closeCulinaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ptOn[3] = 0;
                culinaria.setVisibility(View.GONE);
                bttCulinaria.setText("Culin??ria +");
            }
        });

        Button bttPt = findViewById(R.id.bttPTTai);
        bttPt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ptOn[4] == 0){
                    ptOn[4] = 1;
                    pontosT.setVisibility(View.VISIBLE);
                    bttPt.setText("Pontos tur??sticos -");
                }else{
                    ptOn[4] = 0;
                    pontosT.setVisibility(View.GONE);
                    bttPt.setText("Pontos tur??sticos +");
                }
            }
        });

        Button closePT = findViewById(R.id.bttClosePTTai);
        closePT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ptOn[4] = 0;
                pontosT.setVisibility(View.GONE);
                bttPt.setText("Pontos tur??sticos +");
            }
        });
    }
}