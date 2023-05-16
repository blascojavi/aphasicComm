package com.jablal.proyectojavierblasco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class HouseActivity2 extends AppCompatActivity {



    private ImageButton imageButtonbanyo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house2);


        getSupportActionBar().hide();//ocultamos la barra superior, dejando mas pantalla libre

        ImageButton boton = findViewById(R.id.imageButtonHome3);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HouseActivity2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Obtiene la configuración actual
        Configuration configuration = getResources().getConfiguration();
        String idioma = configuration.getLocales().get(0).getLanguage();



        imageButtonbanyo = findViewById(R.id.imageButtonbanyo);


        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudio;
        if (idioma.equals("es")) {
            nombreAudio = "es_quiero_hacer_pipi";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio = "en_quiero_hacer_pipi";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId = getResources().getIdentifier(nombreAudio, "raw", getPackageName());

        MediaPlayer mediaPlayer = MediaPlayer.create(this, resourceId);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonbanyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer == null) {
                    Toast.makeText(HouseActivity2.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer.start();
                }
            }
        });








    }








}