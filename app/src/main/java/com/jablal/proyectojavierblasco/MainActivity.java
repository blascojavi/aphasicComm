package com.jablal.proyectojavierblasco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer,mediaPlayer2,mediaPlayer3,mediaPlayer4,mediaPlayer5,mediaPlayer6, mediaPlayer7,mediaPlayer8,mediaPlayer9,
            mediaPlayer10,mediaPlayer11,mediaPlayer12;
    private ImageButton imageButtonHomeDormir,imageButtonComer,imageButtonTelevision,imageButtonNoMeGusta,imageButtonPintar,
            imageButtonTijeras,imageButtonBanyera,imageButtonWC,imageButtonFrio,imageButtonParaguas,imageButtonTriste,imageButtonAlegre;
    String nombreAudio="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();//ocultamos la barra superior, dejando mas pantalla libre
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtiene la configuración actual
        Configuration configuration = getResources().getConfiguration();
        String idioma = configuration.getLocales().get(0).getLanguage();

        // Obtiene la referencia al botón de imagen de la vista
        imageButtonHomeDormir = findViewById(R.id.imageButtonHomeDormir);

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




        // Obtiene la referencia al botón de imagen de la vista
        imageButtonComer = findViewById(R.id.imageButtonComer);

        // Crea un nuevo objeto MediaPlayer y carga el archivo de audio 'tengohambre' en él.
        mediaPlayer2 = MediaPlayer.create(this, R.raw.tengohambre);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonComer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer2.isPlaying()) {
                    mediaPlayer2.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer2.start();
                }
            }
        });

// Obtiene la referencia al botón de imagen de la vista
        imageButtonTelevision= findViewById(R.id.imageButtonTelevision);

// Crea un nuevo objeto mediaPlayer3 y carga el archivo de audio 'television' en él.
        mediaPlayer3 = MediaPlayer.create(this, R.raw.television);

// Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonTelevision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer3.isPlaying()) {
                    mediaPlayer3.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer3.start();
                }
            }
        });

// Obtiene la referencia al botón de imagen de la vista
        imageButtonNoMeGusta = findViewById(R.id.imageButtonNoMeGusta);

// Crea un nuevo objeto mediaPlayer4 y carga el archivo de audio 'nomegusta' en él.
        mediaPlayer4 = MediaPlayer.create(this,R.raw.nomegusta);

        //mediaPlayer4 = MediaPlayer.create(getApplicationContext(), R.raw.nomegusta);


// Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonNoMeGusta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer4.isPlaying()) {
                    mediaPlayer4.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer4.start();
                }
            }
        });

// Obtiene la referencia al botón de imagen de la vista
        imageButtonPintar = findViewById(R.id.imageButtonPintar);

// Crea un nuevo objeto mediaPlayer5 y carga el archivo de audio 'pintar' en él.
        mediaPlayer5 = MediaPlayer.create(this, R.raw.pintar);

// Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonPintar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer5.isPlaying()) {
                    mediaPlayer5.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer5.start();
                }
            }
        });
// Obtiene la referencia al botón de imagen de la vista
        imageButtonTijeras = findViewById(R.id.imageButtonTijeras);

// Crea un nuevo objeto mediaPlayer6 y carga el archivo de audio 'pintar' en él.
        mediaPlayer6 = MediaPlayer.create(this, R.raw.cortar);

// Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonTijeras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer6.isPlaying()) {
                    mediaPlayer6.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer6.start();
                }
            }
        });

// Obtiene la referencia al botón de imagen de la vista
        imageButtonBanyera = findViewById(R.id.imageButtonBanyera);

// Crea un nuevo objeto mediaPlayer7 y carga el archivo de audio 'quierobanyarme' en él.
        mediaPlayer7 = MediaPlayer.create(this, R.raw.quierobanyarme);

// Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonBanyera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer7.isPlaying()) {
                    mediaPlayer7.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer7.start();
                }
            }
        });
// Obtiene la referencia al botón de imagen de la vista
        imageButtonWC = findViewById(R.id.imageButtonWC);

// Crea un nuevo objeto mediaPlayer8 y carga el archivo de audio 'quieropipi' en él.
        mediaPlayer8 = MediaPlayer.create(this, R.raw.quieropipi);

// Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonWC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer8.isPlaying()) {
                    mediaPlayer8.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer8.start();
                }
            }
        });

        // Obtiene la referencia al botón de imagen de la vista
        imageButtonFrio = findViewById(R.id.imageButtonFrio);

// Crea un nuevo objeto mediaPlayer8 y carga el archivo de audio 'frio' en él.
        mediaPlayer9 = MediaPlayer.create(this, R.raw.frio);

// Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonFrio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer9.isPlaying()) {
                    mediaPlayer9.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer9.start();
                }
            }
        });

// Obtiene la referencia al botón de imagen de la vista
        imageButtonParaguas = findViewById(R.id.imageButtonParaguas);

// Crea un nuevo objeto mediaPlayer10 y carga el archivo de audio 'paraguas' en él.
        mediaPlayer10= MediaPlayer.create(this, R.raw.paraguas);

// Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonParaguas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer10.isPlaying()) {
                    mediaPlayer10.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer10.start();
                }
            }
        });


        // Obtiene la referencia al botón de imagen de la vista
        imageButtonTriste = findViewById(R.id.imageButtonTriste);

// Crea un nuevo objeto mediaPlayer11 y carga el archivo de audio 'estoytriste' en él.
        mediaPlayer11 = MediaPlayer.create(this, R.raw.estoytriste);

// Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonTriste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer11.isPlaying()) {
                    mediaPlayer11.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer11.start();
                }
            }
        });

// Obtiene la referencia al botón de imagen de la vista
        imageButtonAlegre = findViewById(R.id.imageButtonAlegre);

// Crea un nuevo objeto mediaPlayer12 y carga el archivo de audio 'estoyalegre' en él.
        mediaPlayer12 = MediaPlayer.create(this, R.raw.estoyalegre);

// Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonAlegre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Si el archivo de audio ya está reproduciéndose, lo pausa
                if (mediaPlayer12.isPlaying()) {
                    mediaPlayer12.pause();
                } else {
                    // Si el archivo de audio no se está reproduciendo, lo inicia
                    mediaPlayer12.start();
                }
            }
        });







        // Obtiene la referencia al botón de imagen de la vista
        ImageButton boton = findViewById(R.id.imageButtonHome);

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


        // Obtiene la referencia al botón de imagen de la vista
        ImageButton boton2 = findViewById(R.id.imageButtonCasa);

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

        ImageButton botonPrueba = findViewById(R.id.imageButtonPruebaBorrarDespues);
        botonPrueba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un nuevo Intent para lanzar la actividad ConfigActivity
                Intent intent = new Intent(MainActivity.this, MainActivityPrueba.class);
                // Inicia la actividad HouseActivity2
                startActivity(intent);
            }
        });


    }


}
