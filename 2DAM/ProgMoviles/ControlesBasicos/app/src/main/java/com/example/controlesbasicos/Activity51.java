package com.example.controlesbasicos;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

public class Activity51 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Ej1
        //setContentView(R.layout.activity_5_1);

        //Ej 2
        //setContentView(R.layout.activity_5_1);
        //TextView tvContenido = findViewById(R.id.tvContenido);
        //tvContenido.setText("Texto construido desde java \n Tamaño 20dp, italic y color Blue");
        //tvContenido.setTextSize(20); //tamaño en sp por defecto
        //tvContenido.setTextColor(Color.BLUE); //color azul
        //tvContenido.setTypeface(null, Typeface.ITALIC); // el primer parametro puede ser una fuente y el segundo es el estilo

        //Ej 3
        setContentView(R.layout.activity_5_1);
        TextView tvContenido = findViewById(R.id.tvContenido);
        tvContenido.setText("Texto construido desde el XML.");

        Spannable textoAppend = new SpannableString("\nTexto añadido con append desde Java, por César");
        textoAppend.setSpan( //aplica caracteristicas solo el textoAppend
                new ForegroundColorSpan(Color.BLUE), //color azul
                0, //desde el primer carácter
                textoAppend.length(), //hasta el final
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        );
        textoAppend.setSpan(new StyleSpan(Typeface.ITALIC),0,textoAppend.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        tvContenido.append(textoAppend); //usar append

        //Ej 4
        Typeface fuente = ResourcesCompat.getFont(this, R.font.milky_candy);
        tvContenido.setTypeface(fuente);




    }

}
