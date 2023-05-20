package com.jablal.proyectojavierblasco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ActivityLunch extends AppCompatActivity {


    ImageButton imageButtonQuiero, imageButtonNoQuiero, imageButtonLavarseLasmamos,imageButtonComer2, imageButtonBeber, imageButtonListoComer, imageButtonMeGusta, imageButtonAgua,
            imageButtonLecheYGalletas, imageButtongalletas, imageButtonNuggets, imageButtonNoMeGusta, imageButtonJamon, imageButtonFideos, imageButtonCepilloYpasta,
            imageButtonPatatasFritas, imageButtonCarne, imageButtonPostre, imageButtonPescado, imageButtonMacarrones, imageButtonBocadillo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();//ocultamos la barra superior, dejando mas pantalla libre
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);

        ImageButton boton = findViewById(R.id.imageButtonHome4);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityLunch.this, MainActivity.class);
                startActivity(intent);
            }
        });
        // Obtiene la configuración actual
        Configuration configuration = getResources().getConfiguration();
        String idioma = configuration.getLocales().get(0).getLanguage();


        imageButtonQuiero = findViewById(R.id.imageButtonQuiero);
        imageButtonNoQuiero = findViewById(R.id.imageButtonNoQuiero);
        imageButtonLavarseLasmamos = findViewById(R.id.imageButtonLavarseLasmamos);
        imageButtonListoComer = findViewById(R.id.imageButtonListoComer);;
        imageButtonComer2 = findViewById(R.id.imageButtonComer2);
        imageButtonBeber = findViewById(R.id.imageButtonBeber);
        imageButtonListoComer = findViewById(R.id.imageButtonListoComer);
        imageButtonMeGusta = findViewById(R.id.imageButtonMeGusta);
        imageButtonAgua = findViewById(R.id.imageButtonAgua);
        imageButtonLecheYGalletas = findViewById(R.id.imageButtonLecheYGalletas);
        imageButtongalletas = findViewById(R.id.imageButtongalletas);
        imageButtonNuggets = findViewById(R.id.imageButtonNuggets);
        imageButtonNoMeGusta = findViewById(R.id.imageButtonNoMeGusta);
        imageButtonJamon = findViewById(R.id.imageButtonJamon);
        imageButtonFideos = findViewById(R.id.imageButtonFideos);
        imageButtonCepilloYpasta = findViewById(R.id.imageButtonCepilloYpasta);
        imageButtonPatatasFritas = findViewById(R.id.imageButtonPatatasFritas);
        imageButtonCarne = findViewById(R.id.imageButtonCarne);
        imageButtonPostre = findViewById(R.id.imageButtonPostre);
        imageButtonPescado = findViewById(R.id.imageButtonPescado);
        imageButtonMacarrones = findViewById(R.id.imageButtonMacarrones);
        imageButtonBocadillo = findViewById(R.id.imageButtonBocadillo);


        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudio;
        if (idioma.equals("es")) {
            nombreAudio = "es_quiero";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio = "en_quiero";
        }

        // Obtiene el identificador del recurso de audio
        int resourceIdQuiero = getResources().getIdentifier(nombreAudio, "raw", getPackageName());

        MediaPlayer mediaPlayer = MediaPlayer.create(this, resourceIdQuiero);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonQuiero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer == null) {
                    Toast.makeText(ActivityLunch.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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



        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudioNoQuiero;
        if (idioma.equals("es")) {
            nombreAudioNoQuiero = "es_no_quiero";
        } else {
            // Idioma por defecto (inglés)
            nombreAudioNoQuiero = "en_no_quiero";
        }

        // Obtiene el identificador del recurso de audio
        int resourceIdNoQuiero = getResources().getIdentifier(nombreAudioNoQuiero, "raw", getPackageName());

        MediaPlayer mediaPlayer2 = MediaPlayer.create(this, resourceIdNoQuiero);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonNoQuiero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer2 == null) {
                    Toast.makeText(ActivityLunch.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer2.isPlaying()) {
                    mediaPlayer2.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer2.start();
                }
            }
        });


        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudiolavarme_las_manos;
        if (idioma.equals("es")) {
            nombreAudiolavarme_las_manos = "es_lavarme_las_manos";
        } else {
            // Idioma por defecto (inglés)
            nombreAudiolavarme_las_manos = "en_lavarme_las_manos";
        }

        // Obtiene el identificador del recurso de audio
        int resourceIdlavarme_las_manos = getResources().getIdentifier(nombreAudiolavarme_las_manos, "raw", getPackageName());

        MediaPlayer mediaPlayer3 = MediaPlayer.create(this, resourceIdlavarme_las_manos);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonLavarseLasmamos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer3 == null) {
                    Toast.makeText(ActivityLunch.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer3.isPlaying()) {
                    mediaPlayer3.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer3.start();
                }
            }
        });

        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudioComer2;
        if (idioma.equals("es")) {
            nombreAudioComer2 = "es_comer";
        } else {
            // Idioma por defecto (inglés)
            nombreAudioComer2 = "en_comer";
        }

        // Obtiene el identificador del recurso de audio
        int resourceIdcomer2= getResources().getIdentifier(nombreAudioComer2, "raw", getPackageName());

        MediaPlayer mediaPlayer4 = MediaPlayer.create(this, resourceIdcomer2);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonComer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer4 == null) {
                    Toast.makeText(ActivityLunch.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer4.isPlaying()) {
                    mediaPlayer4.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer4.start();
                }
            }
        });



        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudio_estoy_listo;
        if (idioma.equals("es")) {
            nombreAudio_estoy_listo = "es_ya_estoy_listo_para_comer";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_estoy_listo = "en_ya_estoy_listo_para_comer";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_estoy_listo= getResources().getIdentifier(nombreAudio_estoy_listo, "raw", getPackageName());

        MediaPlayer mediaPlayer5 = MediaPlayer.create(this, resourceId_estoy_listo);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonListoComer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer5 == null) {
                    Toast.makeText(ActivityLunch.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer5.isPlaying()) {
                    mediaPlayer5.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer5.start();
                }
            }
        });



        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudio_LecheYGalletas;
        if (idioma.equals("es")) {
            nombreAudio_LecheYGalletas = "es_leche_con_galletas";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_LecheYGalletas = "es_leche_con_galletas";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_LecheYGalletas= getResources().getIdentifier(nombreAudio_LecheYGalletas, "raw", getPackageName());

        MediaPlayer mediaPlayer6 = MediaPlayer.create(this, resourceId_LecheYGalletas);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonLecheYGalletas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer6 == null) {
                    Toast.makeText(ActivityLunch.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer6.isPlaying()) {
                    mediaPlayer6.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer6.start();
                }
            }
        });


    }
}