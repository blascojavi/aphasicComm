package com.jablal.proyectojavierblasco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer,mediaPlayer2,mediaPlayer3,mediaPlayer4,mediaPlayer5,mediaPlayer6, mediaPlayer7,mediaPlayer8,mediaPlayer9,
            mediaPlayer10,mediaPlayer11,mediaPlayer12;
     ImageButton imageButtonHomeDormir,imageButtonComer,imageButtonTelevision,imageButtonNoMeGusta,imageButtonPintar,
            imageButtonTijeras,imageButtonBanyera,imageButtonWC,imageButtonFrio,imageButtonParaguas,imageButtonTriste,imageButtonAlegre;

    String nombreAudio="";
    public ImageButton boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();//ocultamos la barra superior, dejando mas pantalla libre
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtiene la configuración actual
        Configuration configuration = getResources().getConfiguration();
        String idioma = configuration.getLocales().get(0).getLanguage();

        imageButtonHomeDormir = findViewById(R.id.imageButtonHomeDormir);

        imageButtonComer = findViewById(R.id.imageButtonComer);

        imageButtonTelevision = findViewById(R.id.imageButtonTelevision);

        imageButtonNoMeGusta = findViewById(R.id.imageButtonNoMeGusta);

        imageButtonPintar = findViewById(R.id.imageButtonPintar);

        imageButtonTijeras = findViewById(R.id.imageButtonTijeras);

        imageButtonBanyera = findViewById(R.id.imageButtonBanyera);

        imageButtonWC = findViewById(R.id.imageButtonWC);

        imageButtonFrio = findViewById(R.id.imageButtonFrio);

        imageButtonParaguas = findViewById(R.id.imageButtonParaguas);


        imageButtonTriste = findViewById(R.id.imageButtonTriste);

        imageButtonAlegre = findViewById(R.id.imageButtonAlegre);


         boton = findViewById(R.id.imageButtonHome);

        ImageButton boton2 = findViewById(R.id.imageButtonCasa);
        ImageButton boton3 = findViewById(R.id.imageButtonLaunch);
        ImageButton boton4 = findViewById(R.id.imageButtonSchool);
        ImageButton boton5 = findViewById(R.id.imageButtonWc);
        ImageButton boton6 = findViewById(R.id.imageButtonStreet);
        ImageButton boton7 = findViewById(R.id.imageButtonMind);



        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudio;
        if (idioma.equals("es")) {
            nombreAudio = "es_quiero_dormir";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio = "en_quiero_dormir";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId = getResources().getIdentifier(nombreAudio, "raw", getPackageName());

        mediaPlayer = MediaPlayer.create(this, resourceId);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonHomeDormir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer == null) {
                    Toast.makeText(MainActivity.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudioComer;
        if (idioma.equals("es")) {
            nombreAudioComer = "es_tengo_hambre";
        } else {
            // Idioma por defecto (inglés)
            nombreAudioComer = "en_tengo_hambre";
        }

// Obtiene el identificador del recurso de audio
        int resourceIdComer = getResources().getIdentifier(nombreAudioComer, "raw", getPackageName());

        mediaPlayer2 = MediaPlayer.create(this, resourceIdComer);

// Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonComer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer2 es nulo o no se ha inicializado correctamente
                if (mediaPlayer2 == null) {
                    Toast.makeText(MainActivity.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudioTelevision;
        if (idioma.equals("es")) {
            nombreAudioTelevision = "es_quiero_ver_la_television";
        } else {
            // Idioma por defecto (inglés)
            nombreAudioTelevision = "en_quiero_ver_la_television";
        }

// Obtiene el identificador del recurso de audio
        int resourceIdTelevision = getResources().getIdentifier(nombreAudioTelevision, "raw", getPackageName());

        mediaPlayer3 = MediaPlayer.create(this, resourceIdTelevision);

// Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonTelevision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer3 es nulo o no se ha inicializado correctamente
                if (mediaPlayer3 == null) {
                    Toast.makeText(MainActivity.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudioNoMeGusta;
        if (idioma.equals("es")) {
            nombreAudioNoMeGusta = "es_no_me_gusta";
        } else {
            // Idioma por defecto (inglés)
            nombreAudioNoMeGusta = "en_no_me_gusta";
        }

// Obtiene el identificador del recurso de audio
        int resourceIdNoMeGusta = getResources().getIdentifier(nombreAudioNoMeGusta, "raw", getPackageName());

        mediaPlayer4 = MediaPlayer.create(this, resourceIdNoMeGusta);

// Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonNoMeGusta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer4 es nulo o no se ha inicializado correctamente
                if (mediaPlayer4 == null) {
                    Toast.makeText(MainActivity.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudioPintar;
        if (idioma.equals("es")) {
            nombreAudioPintar = "es_quiero_pintar";
        } else {
            // Idioma por defecto (inglés)
            nombreAudioPintar = "en_quiero_pintar";
        }

// Obtiene el identificador del recurso de audio
        int resourceIdPintar = getResources().getIdentifier(nombreAudioPintar, "raw", getPackageName());

        mediaPlayer5 = MediaPlayer.create(this, resourceIdPintar);

// Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonPintar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer5 es nulo o no se ha inicializado correctamente
                if (mediaPlayer5 == null) {
                    Toast.makeText(MainActivity.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudioTijeras;
        if (idioma.equals("es")) {
            nombreAudioTijeras = "es_ayudame_a_cortar";
        } else {
            // Idioma por defecto (inglés)
            nombreAudioTijeras = "en_ayudame_a_cortar";
        }

// Obtiene el identificador del recurso de audio
        int resourceIdTijeras = getResources().getIdentifier(nombreAudioTijeras, "raw", getPackageName());

        mediaPlayer6 = MediaPlayer.create(this, resourceIdTijeras);

// Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonTijeras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer6 es nulo o no se ha inicializado correctamente
                if (mediaPlayer6 == null) {
                    Toast.makeText(MainActivity.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudioBanyera;
        if (idioma.equals("es")) {
            nombreAudioBanyera = "es_quiero_banarme";
        } else {
            // Idioma por defecto (inglés)
            nombreAudioBanyera = "en_quiero_banarme";
        }

// Obtiene el identificador del recurso de audio
        int resourceIdBanyera = getResources().getIdentifier(nombreAudioBanyera, "raw", getPackageName());

        mediaPlayer7 = MediaPlayer.create(this, resourceIdBanyera);

// Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonBanyera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer7 es nulo o no se ha inicializado correctamente
                if (mediaPlayer7 == null) {
                    Toast.makeText(MainActivity.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudioWC;
        if (idioma.equals("es")) {
            nombreAudioWC = "es_quiero_hacer_pipi";
        } else {
            // Idioma por defecto (inglés)
            nombreAudioWC = "en_quiero_hacer_pipi";
        }

// Obtiene el identificador del recurso de audio
        int resourceIdWC = getResources().getIdentifier(nombreAudioWC, "raw", getPackageName());

        mediaPlayer8 = MediaPlayer.create(this, resourceIdWC);

// Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonWC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer8 es nulo o no se ha inicializado correctamente
                if (mediaPlayer8 == null) {
                    Toast.makeText(MainActivity.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudioFrio;
        if (idioma.equals("es")) {
            nombreAudioFrio = "es_tengo_frio";
        } else {
            // Idioma por defecto (inglés)
            nombreAudioFrio = "en_tengo_frio";
        }

// Obtiene el identificador del recurso de audio
        int resourceIdFrio = getResources().getIdentifier(nombreAudioFrio, "raw", getPackageName());

        mediaPlayer9 = MediaPlayer.create(this, resourceIdFrio);

// Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonFrio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer9 es nulo o no se ha inicializado correctamente
                if (mediaPlayer9 == null) {
                    Toast.makeText(MainActivity.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudioParaguas;
        if (idioma.equals("es")) {
            nombreAudioParaguas = "es_coge_el_paraguas";
        } else {
            // Idioma por defecto (inglés)
            nombreAudioParaguas = "en_coge_el_paraguas";
        }

// Obtiene el identificador del recurso de audio
        int resourceIdParaguas = getResources().getIdentifier(nombreAudioParaguas, "raw", getPackageName());

        mediaPlayer10 = MediaPlayer.create(this, resourceIdParaguas);

// Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonParaguas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer10 es nulo o no se ha inicializado correctamente
                if (mediaPlayer10 == null) {
                    Toast.makeText(MainActivity.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudioTriste;
        if (idioma.equals("es")) {
            nombreAudioTriste = "es_estoy_triste";
        } else {
            // Idioma por defecto (inglés)
            nombreAudioTriste = "en_estoy_triste";
        }

// Obtiene el identificador del recurso de audio
        int resourceIdTriste = getResources().getIdentifier(nombreAudioTriste, "raw", getPackageName());

        mediaPlayer11 = MediaPlayer.create(this, resourceIdTriste);

// Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonTriste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer11 es nulo o no se ha inicializado correctamente
                if (mediaPlayer11 == null) {
                    Toast.makeText(MainActivity.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudioAlegre;
        if (idioma.equals("es")) {
            nombreAudioAlegre = "es_estoy_alegre";
        } else {
            // Idioma por defecto (inglés)
            nombreAudioAlegre = "en_estoy_alegre";
        }

// Obtiene el identificador del recurso de audio
        int resourceIdAlegre = getResources().getIdentifier(nombreAudioAlegre, "raw", getPackageName());

        mediaPlayer12 = MediaPlayer.create(this, resourceIdAlegre);

// Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonAlegre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer12 es nulo o no se ha inicializado correctamente
                if (mediaPlayer12 == null) {
                    Toast.makeText(MainActivity.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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








// Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un nuevo Intent para lanzar la actividad ConfigActivity
                Intent intent = new Intent(MainActivity.this, ConfigActivity.class);
                // Inicia la actividad ConfigActivity
                startActivity(intent);
            }
        });




// Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un nuevo Intent para lanzar la actividad ConfigActivity
                Intent intent = new Intent(MainActivity.this, HouseActivity2.class);
                // Inicia la actividad HouseActivity2
                startActivity(intent);
            }
        });


// Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un nuevo Intent para lanzar la actividad
                Intent intent = new Intent(MainActivity.this, ActivityLunch.class);
                // Inicia la actividad
                startActivity(intent);
            }
        });


        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un nuevo Intent para lanzar la actividad
                Intent intent = new Intent(MainActivity.this, ActivitySchool.class);
                // Inicia la actividad
                startActivity(intent);
            }
        });

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un nuevo Intent para lanzar la actividad
                Intent intent = new Intent(MainActivity.this, ActivityWc.class);
                // Inicia la actividad
                startActivity(intent);
            }
        });

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un nuevo Intent para lanzar la actividad
                Intent intent = new Intent(MainActivity.this, ActivityStreet.class);
                // Inicia la actividad
                startActivity(intent);
            }
        });


        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crea un nuevo Intent para lanzar la actividad
                Intent intent = new Intent(MainActivity.this, ActivityMind.class);
                // Inicia la actividad
                startActivity(intent);
            }
        });


    }


}
