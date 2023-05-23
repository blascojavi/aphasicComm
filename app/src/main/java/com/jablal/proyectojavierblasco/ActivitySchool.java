package com.jablal.proyectojavierblasco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ActivitySchool extends AppCompatActivity {


    private ImageButton imageButtonAgenda, imageButtonAlmuerzo, imageButtonComedor, imageButtonContar, imageButtonRecreo, imageButtonTrabajoEnGrupo, imageButtonNoSeLeer, imageButtonEscribir, imageButtonOrdenar, imageButtonEstudiar, imageButtonLeer, imageButtonPonerGomets, imageButtonBRotuladorPizarra, imageButtonPegar, imageButtonTijeras2, imageButtonLavarseLasManos, imageButtonJugar2, imageButtonMeGusta2, imageButtonNoMeGusta2, imageButtonVamonosACasa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();//ocultamos la barra superior, dejando mas pantalla libre
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school);

        ImageButton boton = findViewById(R.id.imageButtonHome5);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivitySchool.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Obtiene la configuración actual
        Configuration configuration = getResources().getConfiguration();
        String idioma = configuration.getLocales().get(0).getLanguage();



        imageButtonAgenda = findViewById(R.id.imageButtonAgenda);
        imageButtonAlmuerzo = findViewById(R.id.imageButtonAlmuerzo);
        imageButtonComedor = findViewById(R.id.imageButtonComedor);
        imageButtonContar = findViewById(R.id.imageButtonContar);
        imageButtonRecreo = findViewById(R.id.imageButtonRecreo);
        imageButtonTrabajoEnGrupo = findViewById(R.id.imageButtonTrabajoEnGrupo);
        imageButtonNoSeLeer = findViewById(R.id.imageButtonNoSeLeer);
        imageButtonEscribir = findViewById(R.id.imageButtonEscribir);
        imageButtonOrdenar = findViewById(R.id.imageButtonOrdenar);
        imageButtonEstudiar = findViewById(R.id.imageButtonEstudiar);
        imageButtonLeer = findViewById(R.id.imageButtonLeer);
        imageButtonPonerGomets = findViewById(R.id.imageButtonPonerGomets);
        imageButtonBRotuladorPizarra = findViewById(R.id.imageButtonRotuladorPizarra);
        imageButtonPegar = findViewById(R.id.imageButtonPegar);
        imageButtonTijeras2 = findViewById(R.id.imageButtonTijeras2);
        imageButtonLavarseLasManos = findViewById(R.id.imageButtonLavarseLasManos);
        imageButtonJugar2 = findViewById(R.id.imageButtonJugar2);
        imageButtonMeGusta2 = findViewById(R.id.imageButtonMeGusta2);
        imageButtonNoMeGusta2 = findViewById(R.id.imageButtonNoMeGusta2);
        imageButtonVamonosACasa = findViewById(R.id.imageButtonVamonosACasa);



        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudio_Agenda;
        if (idioma.equals("es")) {
            nombreAudio_Agenda = "es_agenda";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Agenda = "en_agenda";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Agenda = getResources().getIdentifier(nombreAudio_Agenda, "raw", getPackageName());

        MediaPlayer mediaPlayer = MediaPlayer.create(this, resourceId_Agenda);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonAgenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer == null) {
                    Toast.makeText(ActivitySchool.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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