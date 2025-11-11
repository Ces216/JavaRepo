package com.example.controlesbasicos;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity53Java extends AppCompatActivity implements View.OnClickListener{
    private TextView tvMensaje;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5_3_java);


        //Añadimos los listeners
        Button btn1 = findViewById(R.id.btnBoton1);
        btn1.setOnClickListener(this);

        Button btn2 = findViewById(R.id.btnBoton2);
        btn2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        tvMensaje = findViewById(R.id.tvMensaje);

        if (id == R.id.btnBoton1) {
            //lógica a ejecutar cuando se pulse el boton 1
            tvMensaje.setText(R.string.boton_1_pulsado);
            tvMensaje.setTextColor(Color.CYAN);
        }

        if (id == R.id.btnBoton2) {
            //lógica a ejecutar cuando se pulse el boton 1
            tvMensaje.setText(R.string.boton_2_pulsado);
            tvMensaje.setTextColor(Color.GREEN);
        }
    }
}
