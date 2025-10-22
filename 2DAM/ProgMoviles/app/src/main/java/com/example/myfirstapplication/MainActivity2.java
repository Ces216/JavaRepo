package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("EJEMPLO", "Estoy onStart, en la MainActivity2");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("EJEMPLO", "Estoy onPause, en la MainActivity2");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i("EJEMPLO", "Estoy onResume, en la MainActivity2");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("EJEMPLO", "Estoy onStart,en la MainActivity2");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("EJEMPLO", "Estoy onDestoy, en la MainActivity2");
    }


}