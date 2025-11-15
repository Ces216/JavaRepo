package com.example.controlesbasicos;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity55 extends AppCompatActivity {
    private TextView tvResultado;
    private RadioGroup radioGroupDias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5_5);

        //Referencias a los componentes del layout
        tvResultado = findViewById(R.id.tvResultado);
        radioGroupDias = findViewById(R.id.radioGroupDias);

        //Listener que se activa cuando cambia la selección del RadioGroup
        radioGroupDias.setOnCheckedChangeListener((group, checkedId) -> {

            // Identifica qué RadioButton fue pulsado
            RadioButton rbSeleccionado = findViewById(checkedId);

            if (rbSeleccionado != null) {
                String texto = rbSeleccionado.getText().toString();
                tvResultado.setText("PULSADO " + texto.toUpperCase());
            }
        });
    }
}