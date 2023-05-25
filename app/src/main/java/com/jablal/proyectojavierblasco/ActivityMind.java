package com.jablal.proyectojavierblasco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ActivityMind extends AppCompatActivity {


    private ImageButton  imageButtonEstoyBien,imageButtonEstoyAlegre,imageButtonEstoyDistraida,imageButtonAsco,imageButtoncansada,
            imageButtonDesanimada,imageButtonEnferma,imageButtonEstoyEnfadada,imageButtonSorprendida,imageButtonEstoyMal,
            imageButtonEstoyTriste,imageButtonNerviosa,imageButtonEstoy_listo,imageButtonEstoyRegular,imageButtonEstoyFurioso,
            imageButtonAcurrucar,imageButtonAgradecer,imageButtonMorderLasUnyas,imageButtonReir,imageButtonTumbado,imageButtonOrgulloso;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();//ocultamos la barra superior, dejando mas pantalla libre
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mind);

        ImageButton boton = findViewById(R.id.imageButtonHome8);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityMind.this, MainActivity.class);
                startActivity(intent);
            }
        });


        // Obtiene la configuración actual
        Configuration configuration = getResources().getConfiguration();
        String idioma = configuration.getLocales().get(0).getLanguage();

        imageButtonEstoyBien = findViewById(R.id.imageButtonEstoyBien);
        imageButtonEstoyAlegre = findViewById(R.id.imageButtonEstoyAlegre);
        imageButtonEstoyDistraida = findViewById(R.id.imageButtonEstoyDistraida);
        imageButtonAsco = findViewById(R.id.imageButtonAsco);
        imageButtoncansada = findViewById(R.id.imageButtoncansada);
        imageButtonDesanimada = findViewById(R.id.imageButtonDesanimada);
        imageButtonEnferma = findViewById(R.id.imageButtonEnferma);
        imageButtonEstoyEnfadada = findViewById(R.id.imageButtonEstoyEnfadada);
        imageButtonSorprendida = findViewById(R.id.imageButtonSorprendida);
        imageButtonEstoyMal = findViewById(R.id.imageButtonEstoyMal);
        imageButtonEstoyTriste = findViewById(R.id.imageButtonEstoyTriste);
        imageButtonNerviosa = findViewById(R.id.imageButtonNerviosa);
        imageButtonEstoy_listo = findViewById(R.id.imageButtonEstoy_listo);
        imageButtonEstoyRegular = findViewById(R.id.imageButtonEstoyRegular);
        imageButtonEstoyFurioso = findViewById(R.id.imageButtonEstoyFurioso);
        imageButtonAcurrucar = findViewById(R.id.imageButtonAcurrucar);
        imageButtonAgradecer = findViewById(R.id.imageButtonAgradecer);
        imageButtonMorderLasUnyas = findViewById(R.id.imageButtonMorderLasUnyas);
        imageButtonReir = findViewById(R.id.imageButtonReir);
        imageButtonTumbado = findViewById(R.id.imageButtonTumbado);
        imageButtonOrgulloso = findViewById(R.id.imageButtonOrgulloso);


        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String idnombreAudio_EstoyBien;
        if (idioma.equals("es")) {
            idnombreAudio_EstoyBien = "es_estoy_bien";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_EstoyBien = "en_estoy_bien";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_EstoyBien = getResources().getIdentifier(idnombreAudio_EstoyBien, "raw", getPackageName());

        MediaPlayer mediaPlayer = MediaPlayer.create(this, resourceId_EstoyBien);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonEstoyBien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer == null) {
                    Toast.makeText(ActivityMind.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_EstoyAlegre;
        if (idioma.equals("es")) {
            idnombreAudio_EstoyAlegre = "es_estoy_alegre";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_EstoyAlegre = "en_estoy_alegre";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_EstoyAlegre = getResources().getIdentifier(idnombreAudio_EstoyAlegre, "raw", getPackageName());

        MediaPlayer mediaPlayer2 = MediaPlayer.create(this, resourceId_EstoyAlegre);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonEstoyAlegre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer2 es nulo o no se ha inicializado correctamente
                if (mediaPlayer2 == null) {
                    Toast.makeText(ActivityMind.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_EstoyDistraida;
        if (idioma.equals("es")) {
            idnombreAudio_EstoyDistraida = "es_estoy_distraida";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_EstoyDistraida = "en_estoy_distraida";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_EstoyDistraida = getResources().getIdentifier(idnombreAudio_EstoyDistraida, "raw", getPackageName());

        MediaPlayer mediaPlayer3 = MediaPlayer.create(this, resourceId_EstoyDistraida);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonEstoyDistraida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer3 es nulo o no se ha inicializado correctamente
                if (mediaPlayer3 == null) {
                    Toast.makeText(ActivityMind.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_Asco;
        if (idioma.equals("es")) {
            idnombreAudio_Asco = "es_siento_asco";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_Asco = "en_siento_asco";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Asco = getResources().getIdentifier(idnombreAudio_Asco, "raw", getPackageName());

        MediaPlayer mediaPlayer4 = MediaPlayer.create(this, resourceId_Asco);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonAsco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer3 es nulo o no se ha inicializado correctamente
                if (mediaPlayer4 == null) {
                    Toast.makeText(ActivityMind.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_cansada;
        if (idioma.equals("es")) {
            idnombreAudio_cansada = "es_estoy_cansado";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_cansada = "en_estoy_cansado";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_cansada = getResources().getIdentifier(idnombreAudio_cansada, "raw", getPackageName());

        MediaPlayer mediaPlayer5 = MediaPlayer.create(this, resourceId_cansada);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtoncansada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer5 es nulo o no se ha inicializado correctamente
                if (mediaPlayer5 == null) {
                    Toast.makeText(ActivityMind.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_Desanimada;
        if (idioma.equals("es")) {
            idnombreAudio_Desanimada = "es_estoy_desanimado";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_Desanimada = "en_estoy_desanimado";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Desanimada = getResources().getIdentifier(idnombreAudio_Desanimada, "raw", getPackageName());

        MediaPlayer mediaPlayer6 = MediaPlayer.create(this, resourceId_Desanimada);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonDesanimada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si (mediaPlayer6 es nulo o no se ha inicializado correctamente
                if (mediaPlayer6 == null) {
                    Toast.makeText(ActivityMind.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_Enferma;
        if (idioma.equals("es")) {
            idnombreAudio_Enferma = "es_me_noto_enfermo";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_Enferma = "en_me_noto_enfermo";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Enferma = getResources().getIdentifier(idnombreAudio_Enferma, "raw", getPackageName());

        MediaPlayer mediaPlayer7 = MediaPlayer.create(this, resourceId_Enferma);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonEnferma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si (mediaPlayer7 es nulo o no se ha inicializado correctamente
                if (mediaPlayer7 == null) {
                    Toast.makeText(ActivityMind.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_EstoyEnfadada;
        if (idioma.equals("es")) {
            idnombreAudio_EstoyEnfadada = "es_estoy_enfadado";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_EstoyEnfadada = "en_estoy_enfadado";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_EstoyEnfadada = getResources().getIdentifier(idnombreAudio_EstoyEnfadada, "raw", getPackageName());

        MediaPlayer mediaPlayer8 = MediaPlayer.create(this, resourceId_EstoyEnfadada);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonEstoyEnfadada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si (mediaPlayer8 es nulo o no se ha inicializado correctamente
                if (mediaPlayer8 == null) {
                    Toast.makeText(ActivityMind.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_Sorprendida;
        if (idioma.equals("es")) {
            idnombreAudio_Sorprendida = "es_estoy_sorprendido";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_Sorprendida = "en_estoy_sorprendido";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Sorprendida = getResources().getIdentifier(idnombreAudio_Sorprendida, "raw", getPackageName());

        MediaPlayer mediaPlayer9 = MediaPlayer.create(this, resourceId_Sorprendida);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonSorprendida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si (mediaPlayer9 es nulo o no se ha inicializado correctamente
                if (mediaPlayer9 == null) {
                    Toast.makeText(ActivityMind.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_EstoyMal;
        if (idioma.equals("es")) {
            idnombreAudio_EstoyMal = "es_me_encuentro_mal";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_EstoyMal = "en_me_encuentro_mal";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_EstoyMal = getResources().getIdentifier(idnombreAudio_EstoyMal, "raw", getPackageName());

        MediaPlayer mediaPlayer10 = MediaPlayer.create(this, resourceId_EstoyMal);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonEstoyMal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si (mediaPlayer10 es nulo o no se ha inicializado correctamente
                if (mediaPlayer10 == null) {
                    Toast.makeText(ActivityMind.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_EstoyTriste;
        if (idioma.equals("es")) {
            idnombreAudio_EstoyTriste = "es_estoy_triste";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_EstoyTriste = "en_estoy_triste";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_EstoyTriste = getResources().getIdentifier(idnombreAudio_EstoyTriste, "raw", getPackageName());

        MediaPlayer mediaPlayer11 = MediaPlayer.create(this, resourceId_EstoyTriste);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonEstoyTriste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si (mediaPlayer11 es nulo o no se ha inicializado correctamente
                if (mediaPlayer11 == null) {
                    Toast.makeText(ActivityMind.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_Nerviosa;
        if (idioma.equals("es")) {
            idnombreAudio_Nerviosa = "es_estoy_nervioso";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_Nerviosa = "en_estoy_nervioso";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Nerviosa = getResources().getIdentifier(idnombreAudio_Nerviosa, "raw", getPackageName());

        MediaPlayer mediaPlayer12 = MediaPlayer.create(this, resourceId_Nerviosa);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonNerviosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si (mediaPlayer12 es nulo o no se ha inicializado correctamente
                if (mediaPlayer12 == null) {
                    Toast.makeText(ActivityMind.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_Estoy_listo;
        if (idioma.equals("es")) {
            idnombreAudio_Estoy_listo = "es_estoy_listo";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_Estoy_listo = "en_estoy_listo";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Estoy_listo = getResources().getIdentifier(idnombreAudio_Estoy_listo, "raw", getPackageName());

        MediaPlayer mediaPlayer13 = MediaPlayer.create(this, resourceId_Estoy_listo);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonEstoy_listo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si (mediaPlayer13 es nulo o no se ha inicializado correctamente
                if (mediaPlayer13 == null) {
                    Toast.makeText(ActivityMind.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_EstoyRegular;
        if (idioma.equals("es")) {
            idnombreAudio_EstoyRegular = "es_estoy_regular";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_EstoyRegular = "en_estoy_regular";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_EstoyRegular = getResources().getIdentifier(idnombreAudio_EstoyRegular, "raw", getPackageName());

        MediaPlayer mediaPlayer14 = MediaPlayer.create(this, resourceId_EstoyRegular);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonEstoyRegular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si (mediaPlayer14 es nulo o no se ha inicializado correctamente
                if (mediaPlayer14 == null) {
                    Toast.makeText(ActivityMind.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_EstoyFurioso;
        if (idioma.equals("es")) {
            idnombreAudio_EstoyFurioso = "es_estoy_furioso";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_EstoyFurioso = "en_estoy_furioso";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_EstoyFurioso = getResources().getIdentifier(idnombreAudio_EstoyFurioso, "raw", getPackageName());

        MediaPlayer mediaPlayer15 = MediaPlayer.create(this, resourceId_EstoyFurioso);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonEstoyFurioso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si (mediaPlayer15 es nulo o no se ha inicializado correctamente
                if (mediaPlayer15 == null) {
                    Toast.makeText(ActivityMind.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_Acurrucar;
        if (idioma.equals("es")) {
            idnombreAudio_Acurrucar = "es_acurrucar";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_Acurrucar = "en_acurrucar";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Acurrucar = getResources().getIdentifier(idnombreAudio_Acurrucar, "raw", getPackageName());

        MediaPlayer mediaPlayer16 = MediaPlayer.create(this, resourceId_Acurrucar);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonAcurrucar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si (mediaPlayer16 es nulo o no se ha inicializado correctamente
                if (mediaPlayer16 == null) {
                    Toast.makeText(ActivityMind.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_Agradecer;
        if (idioma.equals("es")) {
            idnombreAudio_Agradecer = "es_muchas_gracias";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_Agradecer = "en_muchas_gracias";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Agradecer= getResources().getIdentifier(idnombreAudio_Agradecer, "raw", getPackageName());

        MediaPlayer mediaPlayer17 = MediaPlayer.create(this, resourceId_Agradecer);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonAgradecer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si (mediaPlayer17 es nulo o no se ha inicializado correctamente
                if (mediaPlayer17 == null) {
                    Toast.makeText(ActivityMind.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreMorderLasUnyas;
        if (idioma.equals("es")) {
            idnombreMorderLasUnyas = "es_morder_unyas";
        } else {
            // Idioma por defecto (inglés)
            idnombreMorderLasUnyas = "en_morder_unyas";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_MorderLasUnyas = getResources().getIdentifier(idnombreMorderLasUnyas, "raw", getPackageName());

        MediaPlayer mediaPlayer18 = MediaPlayer.create(this, resourceId_MorderLasUnyas);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonMorderLasUnyas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si (mediaPlayer18 es nulo o no se ha inicializado correctamente
                if (mediaPlayer18 == null) {
                    Toast.makeText(ActivityMind.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_Reir;
        if (idioma.equals("es")) {
            idnombreAudio_Reir = "es_jajaja_que_risa";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_Reir = "en_jajaja_que_risa";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Reir = getResources().getIdentifier(idnombreAudio_Reir, "raw", getPackageName());

        MediaPlayer mediaPlayer19 = MediaPlayer.create(this, resourceId_Reir);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonReir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si (mediaPlayer19 es nulo o no se ha inicializado correctamente
                if (mediaPlayer19 == null) {
                    Toast.makeText(ActivityMind.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_Tumbado;
        if (idioma.equals("es")) {
            idnombreAudio_Tumbado = "es_necesito_tumbarme";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_Tumbado = "en_necesito_tumbarme";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Tumbado = getResources().getIdentifier(idnombreAudio_Tumbado, "raw", getPackageName());

        MediaPlayer mediaPlayer20= MediaPlayer.create(this, resourceId_Tumbado);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonTumbado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si (mediaPlayer20es nulo o no se ha inicializado correctamente
                if (mediaPlayer20== null) {
                    Toast.makeText(ActivityMind.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String idnombreAudio_Orgulloso;
        if (idioma.equals("es")) {
            idnombreAudio_Orgulloso = "es_orgulloso";
        } else {
            // Idioma por defecto (inglés)
            idnombreAudio_Orgulloso = "en_orgulloso";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Orgulloso = getResources().getIdentifier(idnombreAudio_Orgulloso, "raw", getPackageName());

        MediaPlayer mediaPlayer21= MediaPlayer.create(this, resourceId_Orgulloso );

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonOrgulloso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si (mediaPlayer21es nulo o no se ha inicializado correctamente
                if (mediaPlayer21== null) {
                    Toast.makeText(ActivityMind.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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