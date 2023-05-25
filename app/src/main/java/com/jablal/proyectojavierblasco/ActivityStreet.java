package com.jablal.proyectojavierblasco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ActivityStreet extends AppCompatActivity {


    private ImageButton imageButtonVamosAlCine,imageButtonVamosAlParque,imageButtonColumpio,imageButtonCamaElastica,imageButtonTobogan,
            imageButtonLudoteca,imageButtonMeDueleLaCabeza, imageButtonTengoFrio, imageButtonTengoCalor, imageButtonJardin,  imageButtonPlaya, imageButtonNadar2,
            imageButtonPiscina, imageButtonTienda, imageButtonRestaurante, imageButtonBeber2, imageButtonQuieroComer2, imageButtonTengoHambre2,imageButtonAutobus,
            imageButtonTranvia, imageButtonHospital;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();//ocultamos la barra superior, dejando mas pantalla libre
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_street);


        // Obtiene la configuración actual
        Configuration configuration = getResources().getConfiguration();
        String idioma = configuration.getLocales().get(0).getLanguage();

        imageButtonVamosAlCine = findViewById(R.id.imageButtonVamosAlCine);
        imageButtonVamosAlParque = findViewById(R.id.imageButtonVamosAlParque);
        imageButtonColumpio = findViewById(R.id.imageButtonColumpio);
        imageButtonCamaElastica = findViewById(R.id.imageButtonCamaElastica);
        imageButtonTobogan = findViewById(R.id.imageButtonTobogan);
        imageButtonLudoteca = findViewById(R.id.imageButtonLudoteca);
        imageButtonMeDueleLaCabeza = findViewById(R.id.imageButtonMeDueleLaCabeza);
        imageButtonTengoFrio = findViewById(R.id.imageButtonTengoFrio);
        imageButtonTengoCalor = findViewById(R.id.imageButtonTengoCalor);
        imageButtonJardin = findViewById(R.id.imageButtonJardin);
        imageButtonPlaya = findViewById(R.id.imageButtonPlaya);
        imageButtonNadar2 = findViewById(R.id.imageButtonNadar2);
        imageButtonPiscina = findViewById(R.id.imageButtonPiscina);
        imageButtonTienda = findViewById(R.id.imageButtonTienda);
        imageButtonRestaurante = findViewById(R.id.imageButtonRestaurante);
        imageButtonBeber2 = findViewById(R.id.imageButtonBeber2);
        imageButtonQuieroComer2 = findViewById(R.id.imageButtonQuieroComer2);
        imageButtonTengoHambre2 = findViewById(R.id.imageButtonTengoHambre2);
        imageButtonAutobus = findViewById(R.id.imageButtonAutobus);
        imageButtonTranvia = findViewById(R.id.imageButtonTranvia);
        imageButtonHospital = findViewById(R.id.imageButtonHospital);

        ImageButton boton = findViewById(R.id.imageButtonHome7);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityStreet.this, MainActivity.class);
                startActivity(intent);
            }
        });



        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudio_VamosAlCine;
        if (idioma.equals("es")) {
            nombreAudio_VamosAlCine = "es_vamos_al_cine";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_VamosAlCine = "en_vamos_al_cine";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_VamosAlCine = getResources().getIdentifier(nombreAudio_VamosAlCine, "raw", getPackageName());

        MediaPlayer mediaPlayer = MediaPlayer.create(this, resourceId_VamosAlCine);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonVamosAlCine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer == null) {
                    Toast.makeText(ActivityStreet.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_VamosAlParque;
        if (idioma.equals("es")) {
            nombreAudio_VamosAlParque = "es_quiero_ir_al_parque";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_VamosAlParque = "en_quiero_ir_al_parque";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_VamosAlParque = getResources().getIdentifier(nombreAudio_VamosAlParque, "raw", getPackageName());

        MediaPlayer mediaPlayer2 = MediaPlayer.create(this, resourceId_VamosAlParque);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonVamosAlParque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer2 == null) {
                    Toast.makeText(ActivityStreet.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Columpio;
        if (idioma.equals("es")) {
            nombreAudio_Columpio = "es_vamos_a_los_columpios";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Columpio = "en_vamos_a_los_columpios";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Columpio = getResources().getIdentifier(nombreAudio_Columpio, "raw", getPackageName());

        MediaPlayer mediaPlayer3 = MediaPlayer.create(this, resourceId_Columpio);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonColumpio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer3 es nulo o no se ha inicializado correctamente
                if (mediaPlayer3 == null) {
                    Toast.makeText(ActivityStreet.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_CamaElastica;
        if (idioma.equals("es")) {
            nombreAudio_CamaElastica = "es_quiero_ir_a_la_cama_elastica";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_CamaElastica = "en_quiero_ir_a_la_cama_elastica";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_CamaElastica = getResources().getIdentifier(nombreAudio_CamaElastica, "raw", getPackageName());

        MediaPlayer mediaPlayer4 = MediaPlayer.create(this, resourceId_CamaElastica);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonCamaElastica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer3 es nulo o no se ha inicializado correctamente
                if (mediaPlayer4 == null) {
                    Toast.makeText(ActivityStreet.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Tobogan;
        if (idioma.equals("es")) {
            nombreAudio_Tobogan = "es_vamos_al_tobogan";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Tobogan = "en_vamos_al_tobogan";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Tobogan = getResources().getIdentifier(nombreAudio_Tobogan, "raw", getPackageName());

        MediaPlayer mediaPlayer5 = MediaPlayer.create(this, resourceId_Tobogan);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonTobogan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer5 es nulo o no se ha inicializado correctamente
                if (mediaPlayer5 == null) {
                    Toast.makeText(ActivityStreet.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Ludoteca;
        if (idioma.equals("es")) {
            nombreAudio_Ludoteca = "es_quiero_ir_a_la_ludoteca";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Ludoteca = "en_quiero_ir_a_la_ludoteca";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Ludoteca = getResources().getIdentifier(nombreAudio_Ludoteca, "raw", getPackageName());

        MediaPlayer mediaPlayer6 = MediaPlayer.create(this, resourceId_Ludoteca);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonLudoteca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer3 es nulo o no se ha inicializado correctamente
                if (mediaPlayer6 == null) {
                    Toast.makeText(ActivityStreet.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_MeDueleLaCabeza;
        if (idioma.equals("es")) {
            nombreAudio_MeDueleLaCabeza = "es_me_duele_la_cabeza";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_MeDueleLaCabeza = "en_me_duele_la_cabeza";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_MeDueleLaCabeza = getResources().getIdentifier(nombreAudio_MeDueleLaCabeza, "raw", getPackageName());

        MediaPlayer mediaPlayer7 = MediaPlayer.create(this, resourceId_MeDueleLaCabeza);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonMeDueleLaCabeza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer7 es nulo o no se ha inicializado correctamente
                if (mediaPlayer7 == null) {
                    Toast.makeText(ActivityStreet.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_TengoFrio;
        if (idioma.equals("es")) {
            nombreAudio_TengoFrio = "es_tengo_frio";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_TengoFrio = "en_tengo_frio";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_TengoFrio = getResources().getIdentifier(nombreAudio_TengoFrio, "raw", getPackageName());

        MediaPlayer mediaPlayer8 = MediaPlayer.create(this, resourceId_TengoFrio);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonTengoFrio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer7 es nulo o no se ha inicializado correctamente
                if (mediaPlayer8 == null) {
                    Toast.makeText(ActivityStreet.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_TengoCalor;
        if (idioma.equals("es")) {
            nombreAudio_TengoCalor = "es_tengo_calor";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_TengoCalor = "en_tengo_calor";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_TengoCalor = getResources().getIdentifier(nombreAudio_TengoCalor, "raw", getPackageName());

        MediaPlayer mediaPlayer9 = MediaPlayer.create(this, resourceId_TengoCalor);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonTengoCalor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer9 es nulo o no se ha inicializado correctamente
                if (mediaPlayer9 == null) {
                    Toast.makeText(ActivityStreet.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Jardin;
        if (idioma.equals("es")) {
            nombreAudio_Jardin = "es_podemos_ir_a_pasear_al_bosque";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Jardin = "en_podemos_ir_a_pasear_al_bosque";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Jardin = getResources().getIdentifier(nombreAudio_Jardin, "raw", getPackageName());

        MediaPlayer mediaPlayer10 = MediaPlayer.create(this, resourceId_Jardin);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonJardin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer10 es nulo o no se ha inicializado correctamente
                if (mediaPlayer10 == null) {
                    Toast.makeText(ActivityStreet.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Playa;
        if (idioma.equals("es")) {
            nombreAudio_Playa = "es_quiero_ir_a_la_playa";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Playa = "en_quiero_ir_a_la_playa";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Playa = getResources().getIdentifier(nombreAudio_Playa, "raw", getPackageName());

        MediaPlayer mediaPlayer11 = MediaPlayer.create(this, resourceId_Playa);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonPlaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer11 es nulo o no se ha inicializado correctamente
                if (mediaPlayer11 == null) {
                    Toast.makeText(ActivityStreet.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String inombreAudio_Nadar2;
        if (idioma.equals("es")) {
            inombreAudio_Nadar2 = "es_quiero_nadar";
        } else {
            // Idioma por defecto (inglés)
            inombreAudio_Nadar2 = "en_quiero_nadar";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Nadar2 = getResources().getIdentifier(inombreAudio_Nadar2, "raw", getPackageName());

        MediaPlayer mediaPlayer12 = MediaPlayer.create(this, resourceId_Nadar2);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonNadar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer11 es nulo o no se ha inicializado correctamente
                if (mediaPlayer12 == null) {
                    Toast.makeText(ActivityStreet.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_Piscina;
        if (idioma.equals("es")) {
            idnombreAudio_Piscina = "es_vamos_a_la_piscina";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_Piscina = "en_vamos_a_la_piscina";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Piscina = getResources().getIdentifier(idnombreAudio_Piscina, "raw", getPackageName());

        MediaPlayer mediaPlayer13 = MediaPlayer.create(this, resourceId_Piscina);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonPiscina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer13 es nulo o no se ha inicializado correctamente
                if (mediaPlayer13 == null) {
                    Toast.makeText(ActivityStreet.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_Tienda;
        if (idioma.equals("es")) {
            idnombreAudio_Tienda = "es_podemos_entrar_a_la_tienda";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_Tienda = "en_podemos_entrar_a_la_tienda";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Tienda = getResources().getIdentifier(idnombreAudio_Tienda, "raw", getPackageName());

        MediaPlayer mediaPlayer14 = MediaPlayer.create(this, resourceId_Tienda);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonTienda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer14 es nulo o no se ha inicializado correctamente
                if (mediaPlayer14 == null) {
                    Toast.makeText(ActivityStreet.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_Restaurante;
        if (idioma.equals("es")) {
            idnombreAudio_Restaurante = "es_quiero_ir_al_restaurante_a_comer";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_Restaurante = "en_quiero_ir_al_resturante_a_comer";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Restaurante = getResources().getIdentifier(idnombreAudio_Restaurante, "raw", getPackageName());

        MediaPlayer mediaPlayer15 = MediaPlayer.create(this, resourceId_Restaurante);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonRestaurante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer14 es nulo o no se ha inicializado correctamente
                if (mediaPlayer15 == null) {
                    Toast.makeText(ActivityStreet.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_Beber2;
        if (idioma.equals("es")) {
            idnombreAudio_Beber2 = "es_quiero_beber";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_Beber2 = "en_quiero_beber";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Beber2 = getResources().getIdentifier(idnombreAudio_Beber2, "raw", getPackageName());

        MediaPlayer mediaPlayer16 = MediaPlayer.create(this, resourceId_Beber2);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonBeber2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer16 es nulo o no se ha inicializado correctamente
                if (mediaPlayer16 == null) {
                    Toast.makeText(ActivityStreet.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_QuieroComer2;
        if (idioma.equals("es")) {
            idnombreAudio_QuieroComer2 = "es_quiero_comer";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_QuieroComer2 = "en_quiero_comer";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_QuieroComer2 = getResources().getIdentifier(idnombreAudio_QuieroComer2, "raw", getPackageName());

        MediaPlayer mediaPlayer17 = MediaPlayer.create(this, resourceId_QuieroComer2);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonQuieroComer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer17 es nulo o no se ha inicializado correctamente
                if (mediaPlayer17 == null) {
                    Toast.makeText(ActivityStreet.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_TengoHambre2;
        if (idioma.equals("es")) {
            idnombreAudio_TengoHambre2 = "es_tengo_hambre";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_TengoHambre2 = "en_tengo_hambre";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_TengoHambre2 = getResources().getIdentifier(idnombreAudio_TengoHambre2, "raw", getPackageName());

        MediaPlayer mediaPlayer18 = MediaPlayer.create(this, resourceId_TengoHambre2);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonTengoHambre2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer18 es nulo o no se ha inicializado correctamente
                if (mediaPlayer18 == null) {
                    Toast.makeText(ActivityStreet.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_Autobus;
        if (idioma.equals("es")) {
            idnombreAudio_Autobus = "es_vamos_a_coger_el_autobus";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_Autobus = "en_vamos_a_coger_el_autobus";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Autobus = getResources().getIdentifier(idnombreAudio_Autobus, "raw", getPackageName());

        MediaPlayer mediaPlayer19 = MediaPlayer.create(this, resourceId_Autobus);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonAutobus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer19 es nulo o no se ha inicializado correctamente
                if (mediaPlayer19 == null) {
                    Toast.makeText(ActivityStreet.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_Tranvia;
        if (idioma.equals("es")) {
            idnombreAudio_Tranvia = "es_vamos_a_coger_el_tranvia";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_Tranvia = "en_vamos_a_coger_el_tranvia";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Tranvia = getResources().getIdentifier(idnombreAudio_Tranvia, "raw", getPackageName());

        MediaPlayer mediaPlayer20 = MediaPlayer.create(this, resourceId_Tranvia);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonTranvia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer20 es nulo o no se ha inicializado correctamente
                if (mediaPlayer20 == null) {
                    Toast.makeText(ActivityStreet.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_Hospital;
        if (idioma.equals("es")) {
            idnombreAudio_Hospital = "es_necesito_ir_al_medico";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_Hospital = "en_necesito_ir_al_medico";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Hospital = getResources().getIdentifier(idnombreAudio_Hospital, "raw", getPackageName());

        MediaPlayer mediaPlayer21 = MediaPlayer.create(this, resourceId_Hospital);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer21 es nulo o no se ha inicializado correctamente
                if (mediaPlayer21 == null) {
                    Toast.makeText(ActivityStreet.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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