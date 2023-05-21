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
            nombreAudio_LecheYGalletas = "en_leche_con_galletas";
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


        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudio_Beber;
        if (idioma.equals("es")) {
            nombreAudio_Beber = "es_beber";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Beber = "en_beber";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_beber= getResources().getIdentifier(nombreAudio_Beber, "raw", getPackageName());

        MediaPlayer mediaPlayer7 = MediaPlayer.create(this, resourceId_beber);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonBeber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer7 == null) {
                    Toast.makeText(ActivityLunch.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_MeGusta;
        if (idioma.equals("es")) {
            nombreAudio_MeGusta = "es_me_gusta_esta_comida";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_MeGusta = "en_me_gusta_esta_comida";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_me_gusta_esta_comida= getResources().getIdentifier(nombreAudio_MeGusta, "raw", getPackageName());

        MediaPlayer mediaPlayer8 = MediaPlayer.create(this, resourceId_me_gusta_esta_comida);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonMeGusta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer8 == null) {
                    Toast.makeText(ActivityLunch.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Agua;
        if (idioma.equals("es")) {
            nombreAudio_Agua = "es_agua";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Agua = "en_agua";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_agua= getResources().getIdentifier(nombreAudio_Agua, "raw", getPackageName());

        MediaPlayer mediaPlayer9 = MediaPlayer.create(this, resourceId_agua);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonAgua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer9 == null) {
                    Toast.makeText(ActivityLunch.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Galletas;
        if (idioma.equals("es")) {
            nombreAudio_Galletas = "es_galletas_de_chocolate";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Galletas = "en_galletas_de_chocolate";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_galletas_de_chocolate= getResources().getIdentifier(nombreAudio_Galletas, "raw", getPackageName());

        MediaPlayer mediaPlayer10 = MediaPlayer.create(this, resourceId_galletas_de_chocolate);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtongalletas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer10 == null) {
                    Toast.makeText(ActivityLunch.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Nuggets;
        if (idioma.equals("es")) {
            nombreAudio_Nuggets = "es_nuggets_de_pollo";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Nuggets = "en_nuggets_de_pollo";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_nuggets_de_pollo= getResources().getIdentifier(nombreAudio_Nuggets, "raw", getPackageName());

        MediaPlayer mediaPlayer11 = MediaPlayer.create(this, resourceId_nuggets_de_pollo);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonNuggets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer11 == null) {
                    Toast.makeText(ActivityLunch.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_NoMeGusta;
        if (idioma.equals("es")) {
            nombreAudio_NoMeGusta = "es_no_me_gusta_esta_comida";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_NoMeGusta = "en_no_me_gusta_esta_comida";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_no_me_gusta_esta_comida= getResources().getIdentifier(nombreAudio_NoMeGusta, "raw", getPackageName());

        MediaPlayer mediaPlayer12 = MediaPlayer.create(this, resourceId_no_me_gusta_esta_comida);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonNoMeGusta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer12 == null) {
                    Toast.makeText(ActivityLunch.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Jamon;
        if (idioma.equals("es")) {
            nombreAudio_Jamon = "es_jamon";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Jamon = "en_jamon";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_jamon= getResources().getIdentifier(nombreAudio_Jamon, "raw", getPackageName());

        MediaPlayer mediaPlayer13 = MediaPlayer.create(this, resourceId_jamon);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonJamon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer13 == null) {
                    Toast.makeText(ActivityLunch.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Fideos;
        if (idioma.equals("es")) {
            nombreAudio_Fideos = "es_caldo_con_fideos";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Fideos = "en_caldo_con_fideos";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Fideos= getResources().getIdentifier(nombreAudio_Fideos, "raw", getPackageName());

        MediaPlayer mediaPlayer14 = MediaPlayer.create(this, resourceId_Fideos);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonFideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer14 == null) {
                    Toast.makeText(ActivityLunch.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_CepilloYpasta;
        if (idioma.equals("es")) {
            nombreAudio_CepilloYpasta = "es_lavarme_los_dientes";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_CepilloYpasta = "en_lavarme_los_dientes";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_CepilloYpasta= getResources().getIdentifier(nombreAudio_CepilloYpasta, "raw", getPackageName());

        MediaPlayer mediaPlayer15 = MediaPlayer.create(this, resourceId_CepilloYpasta);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonCepilloYpasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer15 == null) {
                    Toast.makeText(ActivityLunch.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_PatatasFritas;
        if (idioma.equals("es")) {
            nombreAudio_PatatasFritas = "es_patatas_fritas";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_PatatasFritas = "en_patatas_fritas";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_PatatasFritas= getResources().getIdentifier(nombreAudio_PatatasFritas, "raw", getPackageName());

        MediaPlayer mediaPlayer16 = MediaPlayer.create(this, resourceId_PatatasFritas);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonPatatasFritas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer16 == null) {
                    Toast.makeText(ActivityLunch.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Carne;
        if (idioma.equals("es")) {
            nombreAudio_Carne = "es_filete_de_carne";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Carne = "en_filete_de_carne";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Carne= getResources().getIdentifier(nombreAudio_Carne, "raw", getPackageName());

        MediaPlayer mediaPlayer17 = MediaPlayer.create(this, resourceId_Carne);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonCarne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer17 == null) {
                    Toast.makeText(ActivityLunch.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Postre;
        if (idioma.equals("es")) {
            nombreAudio_Postre = "es_postre";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Postre = "en_postre";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Postre= getResources().getIdentifier(nombreAudio_Postre, "raw", getPackageName());

        MediaPlayer mediaPlayer18 = MediaPlayer.create(this, resourceId_Postre);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonPostre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer18 == null) {
                    Toast.makeText(ActivityLunch.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Pescado;
        if (idioma.equals("es")) {
            nombreAudio_Pescado = "es_varitas_de_pescado";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Pescado = "en_varitas_de_pescado";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Pescado= getResources().getIdentifier(nombreAudio_Pescado, "raw", getPackageName());

        MediaPlayer mediaPlayer19 = MediaPlayer.create(this, resourceId_Pescado);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonPescado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer19 == null) {
                    Toast.makeText(ActivityLunch.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Macarrones;
        if (idioma.equals("es")) {
            nombreAudio_Macarrones = "es_macarrones_con_tomate";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Macarrones = "en_macarrones_con_tomate";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Macarrones= getResources().getIdentifier(nombreAudio_Macarrones, "raw", getPackageName());

        MediaPlayer mediaPlayer20 = MediaPlayer.create(this, resourceId_Macarrones);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonMacarrones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer20 == null) {
                    Toast.makeText(ActivityLunch.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Bocadillo;
        if (idioma.equals("es")) {
            nombreAudio_Bocadillo = "es_un_bocadillo";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Bocadillo = "en_un_bocadillo";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Bocadillo= getResources().getIdentifier(nombreAudio_Bocadillo, "raw", getPackageName());

        MediaPlayer mediaPlayer21 = MediaPlayer.create(this, resourceId_Bocadillo);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonBocadillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer21 == null) {
                    Toast.makeText(ActivityLunch.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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