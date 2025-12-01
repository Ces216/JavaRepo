package com.example.listadosymenus;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActividad1 extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad1_layout);

        String[] planetas = {"Mercurio","Venus","Jupiter","Tierra","Marte","Saturno","Urano","Neptuno"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, planetas);


        ListView listViewPlanetas = findViewById(R.id.listViewPlanetas);
        listViewPlanetas.setAdapter(adapter);
    }


}
