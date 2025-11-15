package com.example.controlesbasicos;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity56 extends AppCompatActivity {
    private ProgressBar progressBar;
    private Button btnIniciar;
    private TextView tvPorcentaje;
    private boolean cargando = false; // Evita pulsar varias veces

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5_6);

        progressBar = findViewById(R.id.progressBar);
        btnIniciar = findViewById(R.id.btnIniciar);
        tvPorcentaje = findViewById(R.id.tvPorcentaje);

        btnIniciar.setOnClickListener(v -> iniciarCarga());
    }

    private void iniciarCarga() {

        if (cargando) return; // Si ya está cargando no hace nada
        cargando = true;

        new Thread(() -> {
            for (int i = 0; i <= 100; i++) {

                int p = i;

                runOnUiThread(() -> {
                    progressBar.setProgress(p);
                    tvPorcentaje.setText(p + "%");
                });

                try {
                    Thread.sleep(50); // velocidad
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            cargando = false;
        }).start();
    }
}