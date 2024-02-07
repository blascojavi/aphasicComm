package com.jablal.proyectojavierblasco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

public class SplashActivity extends AppCompatActivity {
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();//ocultamos la barra superior, dejando mas pantalla libre
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        videoView = findViewById(R.id.videoView);

        // Obteniendo la Uri del archivo de video en res/raw
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.logo_dev_video; // Reemplaza 'nombre_del_archivo' con el nombre de tu archivo sin extensión
        Uri videoUri = Uri.parse(videoPath);


        // Configurando el VideoView para reproducir el video
        videoView.setVideoURI(videoUri);
        // Preparando y reproduciendo el video
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                videoView.start();
            }
        });




        // Crea un objeto AdView
        AdView adView = new AdView(this);

        // Establece el tamaño del anuncio
        adView.setAdSize(AdSize.BANNER);

        // Establece la ubicación del anuncio
        adView.setAdUnitId("ca-app-pub-7311257203776178~4249959595");

        // Encuentra el objeto myLayout
        View myLayout = findViewById(R.id.myLayout);

        // Agrega el anuncio a la vista
        ((ViewGroup) myLayout).addView(adView);
        // Carga el anuncio
        adView.loadAd(new AdRequest.Builder().build());

        // Establece el evento de carga del anuncio
        adView.setAdListener(new AdListener() {

            @Override
            public void onAdLoaded() {
                // El anuncio se ha cargado correctamente
            }



        });




        // Espera 3 segundos y luego pasa a la actividad principal
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Evita que el usuario regrese a esta pantalla con el botón Atrás
            }
        }, 5000); // 3000 milisegundos = 3 segundos


    }
}