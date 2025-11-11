package com.example.controlesbasicos;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity53OnClick extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5_3_on_click);

//        Button Java = findViewById(R.id.btnPulsar);
//        btnPulsar.setOnClickListener(this);
    }

    //Caso 1
    public void onBotonPulsado(View v) {
        int id = v.getId(); // Obtenemos el ID una vez
        TextView miTexto = findViewById(R.id.tvMensaje);
        if(miTexto.getText()=="BOTÓN SIN PULSAR") {
            miTexto.setText("BOTÓN PULSADO");
            miTexto.setTextColor(Color.RED);
        } else {
            miTexto.setText("BOTÓN SIN PULSAR");
            miTexto.setTextColor(Color.BLUE);
        }
    }
}
