package com.jablal.proyectojavierblasco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();//ocultamos la barra superior, dejando mas pantalla libre
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        // Espera 3 segundos y luego pasa a la actividad principal
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Evita que el usuario regrese a esta pantalla con el botón Atrás
            }
        }, 3000); // 3000 milisegundos = 3 segundos


    }
}