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



    private ImageButton imageButtonbanyo,imageButtonAbrirLaPuerta,imageButtonPlegarLaRopa,imageButtonComer,imageButtonCerrarLaPuerta,imageButtonRopaSucia,
            imageButtonDormir,imageButtonLlamarALaPuerta,imageButtonMirarPorLaVentana, imageButtonVerTelevision,imageButtonSillon,imageButtonAbrirVentana,
            imageButtonBeber,imageButtonLavarLaRopa,imageButtonCerrarVentana,imageButtonEnciendeLaLuz,imageButtonCestaDeLaRopa,imageButtonApagaLaLuz,
            imageButtonEnRopaInterior,imageButtonJugar,imageButtonJugarALaVideoconsola;


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
        imageButtonAbrirLaPuerta= findViewById(R.id.imageButtonAbrirLaPuerta);
        imageButtonPlegarLaRopa = findViewById(R.id.imageButtonPlegarLaRopa);
        imageButtonComer = findViewById(R.id.imageButtonComer);
        imageButtonCerrarLaPuerta = findViewById(R.id.imageButtonCerrarLaPuerta);
        imageButtonRopaSucia = findViewById(R.id.imageButtonRopaSucia);
        imageButtonDormir = findViewById(R.id.imageButtonDormir);
        imageButtonLlamarALaPuerta = findViewById(R.id.imageButtonLlamarALaPuerta);
        imageButtonMirarPorLaVentana = findViewById(R.id.imageButtonMirarPorLaVentana);
        imageButtonVerTelevision = findViewById(R.id.imageButtonVerTelevision);
        imageButtonSillon = findViewById(R.id.imageButtonSillon);
        imageButtonAbrirVentana = findViewById(R.id.imageButtonAbrirVentana);
        imageButtonBeber = findViewById(R.id.imageButtonBeber);
        imageButtonLavarLaRopa = findViewById(R.id.imageButtonLavarLaRopa);
        imageButtonCerrarVentana = findViewById(R.id.imageButtonCerrarVentana);
        imageButtonEnciendeLaLuz = findViewById(R.id.imageButtonEnciendeLaLuz);
        imageButtonCestaDeLaRopa = findViewById(R.id.imageButtonCestaDeLaRopa);
        imageButtonApagaLaLuz = findViewById(R.id.imageButtonApagaLaLuz);
        imageButtonEnRopaInterior = findViewById(R.id.imageButtonEnRopaInterior);
        imageButtonJugar = findViewById(R.id.imageButtonJugar);
        imageButtonJugarALaVideoconsola = findViewById(R.id.imageButtonJugarALaVideoconsola);


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



        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudio_AbrirLaPuerta;
        if (idioma.equals("es")) {
            nombreAudio_AbrirLaPuerta = "es_abre_la_puerta";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_AbrirLaPuerta = "en_abre_la_puerta";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_abre_la_puerta= getResources().getIdentifier(nombreAudio_AbrirLaPuerta, "raw", getPackageName());

        MediaPlayer mediaPlayer2 = MediaPlayer.create(this, resourceId_abre_la_puerta);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonAbrirLaPuerta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer2 == null) {
                    Toast.makeText(HouseActivity2.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_PlegarLaRopa;
        if (idioma.equals("es")) {
            nombreAudio_PlegarLaRopa = "es_vamos_a_plegar_la_ropa";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_PlegarLaRopa = "en_vamos_a_plegar_la_ropa";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_PlegarLaRopa= getResources().getIdentifier(nombreAudio_PlegarLaRopa, "raw", getPackageName());

        MediaPlayer mediaPlayer3 = MediaPlayer.create(this, resourceId_PlegarLaRopa);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonPlegarLaRopa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer3 == null) {
                    Toast.makeText(HouseActivity2.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Comer;
        if (idioma.equals("es")) {
            nombreAudio_Comer = "es_quiero_comer";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Comer = "en_quiero_comer";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Comer= getResources().getIdentifier(nombreAudio_Comer, "raw", getPackageName());

        MediaPlayer mediaPlayer4 = MediaPlayer.create(this, resourceId_Comer);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonComer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer4 == null) {
                    Toast.makeText(HouseActivity2.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_CerrarLaPuerta;
        if (idioma.equals("es")) {
            nombreAudio_CerrarLaPuerta = "es_cierra_la_puerta";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_CerrarLaPuerta = "en_cierra_la_puerta";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_CerrarLaPuerta= getResources().getIdentifier(nombreAudio_CerrarLaPuerta, "raw", getPackageName());

        MediaPlayer mediaPlayer5 = MediaPlayer.create(this, resourceId_CerrarLaPuerta);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonCerrarLaPuerta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer5 == null) {
                    Toast.makeText(HouseActivity2.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_RopaSucia;
        if (idioma.equals("es")) {
            nombreAudio_RopaSucia = "es_llevo_la_ropa_sucia";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_RopaSucia = "en_llevo_la_ropa_sucia";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_RopaSucia = getResources().getIdentifier(nombreAudio_RopaSucia, "raw", getPackageName());

        MediaPlayer mediaPlayer6 = MediaPlayer.create(this, resourceId_RopaSucia);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonRopaSucia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer6 == null) {
                    Toast.makeText(HouseActivity2.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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



        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudio_Dormir;
        if (idioma.equals("es")) {
            nombreAudio_Dormir = "es_quiero_dormir";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Dormir = "en_quiero_dormir";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Dormir = getResources().getIdentifier(nombreAudio_Dormir, "raw", getPackageName());

        MediaPlayer mediaPlayer7 = MediaPlayer.create(this, resourceId_Dormir);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonDormir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer7 == null) {
                    Toast.makeText(HouseActivity2.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer7.isPlaying()) {
                    mediaPlayer7.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer7.start();
                }
            }
        });


        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudio_LlamarALaPuerta;
        if (idioma.equals("es")) {
            nombreAudio_LlamarALaPuerta = "es_estan_llamando_a_la_puerta";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_LlamarALaPuerta = "en_estan_llamando_a_la_puerta";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_LlamarALaPuertar = getResources().getIdentifier(nombreAudio_LlamarALaPuerta, "raw", getPackageName());

        MediaPlayer mediaPlayer8 = MediaPlayer.create(this, resourceId_LlamarALaPuertar);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonLlamarALaPuerta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer8 == null) {
                    Toast.makeText(HouseActivity2.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer8.isPlaying()) {
                    mediaPlayer8.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer8.start();
                }
            }
        });

        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudio_MirarPorLaVentana;
        if (idioma.equals("es")) {
            nombreAudio_MirarPorLaVentana = "es_ven_a_mirar_lo_que_veo_por_la_ventana";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_MirarPorLaVentana = "en_ven_a_mirar_lo_que_veo_por_la_ventana";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_MirarPorLaVentana = getResources().getIdentifier(nombreAudio_MirarPorLaVentana, "raw", getPackageName());

        MediaPlayer mediaPlayer9 = MediaPlayer.create(this, resourceId_MirarPorLaVentana);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonMirarPorLaVentana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer9 == null) {
                    Toast.makeText(HouseActivity2.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer9.isPlaying()) {
                    mediaPlayer9.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer9.start();
                }
            }
        });

        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudio_VerTelevision;
        if (idioma.equals("es")) {
            nombreAudio_VerTelevision = "es_quiero_ver_la_television";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_VerTelevision = "en_quiero_ver_la_television";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_VerTelevision = getResources().getIdentifier(nombreAudio_VerTelevision, "raw", getPackageName());

        MediaPlayer mediaPlayer10 = MediaPlayer.create(this, resourceId_VerTelevision);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonVerTelevision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer10 == null) {
                    Toast.makeText(HouseActivity2.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer10.isPlaying()) {
                    mediaPlayer10.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer10.start();
                }
            }
        });


        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudio_Sillon;
        if (idioma.equals("es")) {
            nombreAudio_Sillon = "es_vamos_a_sentarnos_al_sillon";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Sillon = "en_vamos_a_sentarnos_al_sillon";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Sillon = getResources().getIdentifier(nombreAudio_Sillon, "raw", getPackageName());

        MediaPlayer mediaPlayer11 = MediaPlayer.create(this, resourceId_Sillon);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonSillon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer11 == null) {
                    Toast.makeText(HouseActivity2.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer11.isPlaying()) {
                    mediaPlayer11.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer11.start();
                }
            }
        });

        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudio_AbrirVentana;
        if (idioma.equals("es")) {
            nombreAudio_AbrirVentana = "es_abre_la_ventana";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_AbrirVentana = "en_abre_la_ventana";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_AbrirVentana = getResources().getIdentifier(nombreAudio_AbrirVentana, "raw", getPackageName());

        MediaPlayer mediaPlayer12 = MediaPlayer.create(this, resourceId_AbrirVentana);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonAbrirVentana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer12 == null) {
                    Toast.makeText(HouseActivity2.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer12.isPlaying()) {
                    mediaPlayer12.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer12.start();
                }
            }
        });


        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudio_Beber;
        if (idioma.equals("es")) {
            nombreAudio_Beber = "es_beber";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Beber = "en_beber";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Beber = getResources().getIdentifier(nombreAudio_Beber, "raw", getPackageName());

        MediaPlayer mediaPlayer13 = MediaPlayer.create(this, resourceId_Beber);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonBeber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer13 == null) {
                    Toast.makeText(HouseActivity2.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer13.isPlaying()) {
                    mediaPlayer13.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer13.start();
                }
            }
        });

        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudio_LavarLaRopa;
        if (idioma.equals("es")) {
            nombreAudio_LavarLaRopa = "es_vamos_a_poner_la_lavadora";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_LavarLaRopa = "en_vamos_a_poner_la_lavadora";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_LavarLaRopa = getResources().getIdentifier(nombreAudio_LavarLaRopa, "raw", getPackageName());

        MediaPlayer mediaPlayer14 = MediaPlayer.create(this, resourceId_LavarLaRopa);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonLavarLaRopa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer14 == null) {
                    Toast.makeText(HouseActivity2.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer14.isPlaying()) {
                    mediaPlayer14.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer14.start();
                }
            }
        });


        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudio_CerrarVentana;
        if (idioma.equals("es")) {
            nombreAudio_CerrarVentana = "es_cierra_la_ventana";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_CerrarVentana = "en_cierra_la_ventana";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_CerrarVentana = getResources().getIdentifier(nombreAudio_CerrarVentana, "raw", getPackageName());

        MediaPlayer mediaPlayer15 = MediaPlayer.create(this, resourceId_CerrarVentana);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonCerrarVentana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer15 == null) {
                    Toast.makeText(HouseActivity2.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer15.isPlaying()) {
                    mediaPlayer15.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer15.start();
                }
            }
        });

        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudio_EnciendeLaLuz;
        if (idioma.equals("es")) {
            nombreAudio_EnciendeLaLuz = "es_enciende_la_luz";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_EnciendeLaLuz = "en_enciende_la_luz";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_EnciendeLaLuz = getResources().getIdentifier(nombreAudio_EnciendeLaLuz, "raw", getPackageName());

        MediaPlayer mediaPlayer16 = MediaPlayer.create(this, resourceId_EnciendeLaLuz);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonEnciendeLaLuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer16 == null) {
                    Toast.makeText(HouseActivity2.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer16.isPlaying()) {
                    mediaPlayer16.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer16.start();
                }
            }
        });

        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudio_CestaDeLaRopa;
        if (idioma.equals("es")) {
            nombreAudio_CestaDeLaRopa = "es_el_cesto_de_la_ropa_esta_lleno";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_CestaDeLaRopa = "en_el_cesto_de_la_ropa_esta_lleno";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_CestaDeLaRopa = getResources().getIdentifier(nombreAudio_CestaDeLaRopa, "raw", getPackageName());

        MediaPlayer mediaPlayer17 = MediaPlayer.create(this, resourceId_CestaDeLaRopa);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonCestaDeLaRopa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer17 == null) {
                    Toast.makeText(HouseActivity2.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer17.isPlaying()) {
                    mediaPlayer17.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer17.start();
                }
            }
        });

        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudio_ApagaLaLuz;
        if (idioma.equals("es")) {
            nombreAudio_ApagaLaLuz = "es_apaga_la_luz";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_ApagaLaLuz = "en_apaga_la_luz";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_ApagaLaLuz = getResources().getIdentifier(nombreAudio_ApagaLaLuz, "raw", getPackageName());

        MediaPlayer mediaPlayer18 = MediaPlayer.create(this, resourceId_ApagaLaLuz);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonApagaLaLuz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer18 == null) {
                    Toast.makeText(HouseActivity2.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer18.isPlaying()) {
                    mediaPlayer18.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer18.start();
                }
            }
        });


        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudio_EnRopaInterior;
        if (idioma.equals("es")) {
            nombreAudio_EnRopaInterior = "es_ayudame_a_vestirme";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_EnRopaInterior = "en_ayudame_a_vestirme";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_EnRopaInterior = getResources().getIdentifier(nombreAudio_EnRopaInterior, "raw", getPackageName());

        MediaPlayer mediaPlayer19 = MediaPlayer.create(this, resourceId_EnRopaInterior);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonEnRopaInterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer19 == null) {
                    Toast.makeText(HouseActivity2.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer19.isPlaying()) {
                    mediaPlayer19.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer19.start();
                }
            }
        });


        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudio_Jugar;
        if (idioma.equals("es")) {
            nombreAudio_Jugar = "es_vamos_a_jugar";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Jugar = "en_vamos_a_jugar";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Jugar = getResources().getIdentifier(nombreAudio_Jugar, "raw", getPackageName());

        MediaPlayer mediaPlayer20 = MediaPlayer.create(this, resourceId_Jugar);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer20 == null) {
                    Toast.makeText(HouseActivity2.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer20.isPlaying()) {
                    mediaPlayer20.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer20.start();
                }
            }
        });

        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudio_JugarALaVideoconsola;
        if (idioma.equals("es")) {
            nombreAudio_JugarALaVideoconsola = "es_vamos_a_jugar_a_la_consola";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_JugarALaVideoconsola = "en_vamos_a_jugar_a_la_consola";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_JugarALaVideoconsola = getResources().getIdentifier(nombreAudio_JugarALaVideoconsola, "raw", getPackageName());

        MediaPlayer mediaPlayer21 = MediaPlayer.create(this, resourceId_JugarALaVideoconsola);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonJugarALaVideoconsola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer21 == null) {
                    Toast.makeText(HouseActivity2.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer21.isPlaying()) {
                    mediaPlayer21.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer21.start();
                }
            }
        });







    }








}