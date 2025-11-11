package com.example.controlesbasicos;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity52 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5_1);
        TextView tvContent = findViewById(R.id.tvContenido);
        //Animación 1
//        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.alfa1);
//        animacion.setRepeatMode(Animation.REVERSE);
//        animacion.setRepeatCount(5);  //no hace nada, esta puesto infinito en el xml
//        tvContent.startAnimation(animacion);

        //Animación 2
//        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.alfa2);
//        animacion.setRepeatMode(Animation.RESTART);
//        animacion.setRepeatCount(20);     //no hace nada, no permite repetición
//        tvContent.startAnimation(animacion);

        //Animacion 3
//        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.escala1);
//        tvContent.startAnimation(animacion);

        //Animacion 4
        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.varios2);
        tvContent.startAnimation(animacion);
    }
}
