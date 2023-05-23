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


    private ImageButton imageButtonAgenda, imageButtonAlmuerzo, imageButtonComedor, imageButtonContar, imageButtonRecreo, imageButtonTrabajoEnGrupo, imageButtonNoSeLeer, imageButtonEscribir, imageButtonOrdenar, imageButtonEstudiar, imageButtonLeer, imageButtonPonerGomets, imageButtonRotuladorPizarra, imageButtonPegar, imageButtonTijeras2, imageButtonLavarseLasManos, imageButtonJugar2, imageButtonMeGusta2, imageButtonNoMeGusta2, imageButtonVamonosACasa, imageButtonBorrar;

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
        imageButtonRotuladorPizarra = findViewById(R.id.imageButtonRotuladorPizarra);
        imageButtonPegar = findViewById(R.id.imageButtonPegar);
        imageButtonTijeras2 = findViewById(R.id.imageButtonTijeras2);
        imageButtonLavarseLasManos = findViewById(R.id.imageButtonLavarseLasManos);
        imageButtonJugar2 = findViewById(R.id.imageButtonJugar2);
        imageButtonMeGusta2 = findViewById(R.id.imageButtonMeGusta2);
        imageButtonNoMeGusta2 = findViewById(R.id.imageButtonNoMeGusta2);
        imageButtonVamonosACasa = findViewById(R.id.imageButtonVamonosACasa);
        imageButtonBorrar = findViewById(R.id.imageButtonBorrar);


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

        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudio_Almuerzo;
        if (idioma.equals("es")) {
            nombreAudio_Almuerzo = "es_es_la_hora_del_almuerzo";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Almuerzo = "en_es_la_hora_del_almuerzo";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Almuerzo = getResources().getIdentifier(nombreAudio_Almuerzo, "raw", getPackageName());

        MediaPlayer mediaPlayer2 = MediaPlayer.create(this, resourceId_Almuerzo);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonAlmuerzo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer2 es nulo o no se ha inicializado correctamente
                if (mediaPlayer2 == null) {
                    Toast.makeText(ActivitySchool.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Comedor;
        if (idioma.equals("es")) {
            nombreAudio_Comedor = "es_es_la_hora_de_comer_vamos_al_comedor";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Comedor = "en_es_la_hora_de_comer_vamos_al_comedor";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Comedor = getResources().getIdentifier(nombreAudio_Comedor, "raw", getPackageName());

        MediaPlayer mediaPlayer3 = MediaPlayer.create(this, resourceId_Comedor);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonComedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer3 es nulo o no se ha inicializado correctamente
                if (mediaPlayer3 == null) {
                    Toast.makeText(ActivitySchool.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Contar;
        if (idioma.equals("es")) {
            nombreAudio_Contar = "es_vamos_a_contar";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Contar = "en_vamos_a_contar";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Contar = getResources().getIdentifier(nombreAudio_Contar, "raw", getPackageName());

        MediaPlayer mediaPlayer4 = MediaPlayer.create(this, resourceId_Contar);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer4 es nulo o no se ha inicializado correctamente
                if (mediaPlayer4 == null) {
                    Toast.makeText(ActivitySchool.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Recreo;
        if (idioma.equals("es")) {
            nombreAudio_Recreo = "es_es_la_hora_del_recreo_vamos_al_patio";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Recreo = "en_es_la_hora_del_recreo_vamos_al_patio";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Recreo = getResources().getIdentifier(nombreAudio_Recreo, "raw", getPackageName());

        MediaPlayer mediaPlayer5 = MediaPlayer.create(this, resourceId_Recreo);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonRecreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer4 es nulo o no se ha inicializado correctamente
                if (mediaPlayer5 == null) {
                    Toast.makeText(ActivitySchool.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_TrabajoEnGrupo;
        if (idioma.equals("es")) {
            nombreAudio_TrabajoEnGrupo = "es_vamos_a_sentarnos_a_trabajar_en_grupo";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_TrabajoEnGrupo = "en_vamos_a_sentarnos_a_trabajar_en_grupo";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_TrabajoEnGrupo = getResources().getIdentifier(nombreAudio_TrabajoEnGrupo, "raw", getPackageName());

        MediaPlayer mediaPlayer6 = MediaPlayer.create(this, resourceId_TrabajoEnGrupo);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonTrabajoEnGrupo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer6 es nulo o no se ha inicializado correctamente
                if (mediaPlayer6 == null) {
                    Toast.makeText(ActivitySchool.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_NoSeLeer;
        if (idioma.equals("es")) {
            nombreAudio_NoSeLeer = "es_no_lo_entiendo";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_NoSeLeer = "en_no_lo_entiendo";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_NoSeLeer = getResources().getIdentifier(nombreAudio_NoSeLeer, "raw", getPackageName());

        MediaPlayer mediaPlayer7 = MediaPlayer.create(this, resourceId_NoSeLeer);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonNoSeLeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer7 es nulo o no se ha inicializado correctamente
                if (mediaPlayer7 == null) {
                    Toast.makeText(ActivitySchool.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Escribir;
        if (idioma.equals("es")) {
            nombreAudio_Escribir = "es_quiero_salir_a_la_pizarra";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Escribir = "en_quiero_salir_a_la_pizarra";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Escribir = getResources().getIdentifier(nombreAudio_Escribir, "raw", getPackageName());

        MediaPlayer mediaPlayer8 = MediaPlayer.create(this, resourceId_Escribir);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonEscribir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer8 es nulo o no se ha inicializado correctamente
                if (mediaPlayer8 == null) {
                    Toast.makeText(ActivitySchool.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Ordenar;
        if (idioma.equals("es")) {
            nombreAudio_Ordenar = "es_vamos_a_ordenar";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Ordenar = "en_vamos_a_ordenar";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Ordenar = getResources().getIdentifier(nombreAudio_Ordenar, "raw", getPackageName());

        MediaPlayer mediaPlayer9 = MediaPlayer.create(this, resourceId_Ordenar);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonOrdenar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer9 es nulo o no se ha inicializado correctamente
                if (mediaPlayer9 == null) {
                    Toast.makeText(ActivitySchool.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Estudiar;
        if (idioma.equals("es")) {
            nombreAudio_Estudiar = "es_vamos_a_estudiar";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Estudiar = "en_vamos_a_estudiar";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Estudiar = getResources().getIdentifier(nombreAudio_Estudiar, "raw", getPackageName());

        MediaPlayer mediaPlayer10 = MediaPlayer.create(this, resourceId_Estudiar);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonEstudiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer10 es nulo o no se ha inicializado correctamente
                if (mediaPlayer10 == null) {
                    Toast.makeText(ActivitySchool.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Leer;
        if (idioma.equals("es")) {
            nombreAudio_Leer = "es_quiero_leer_este_libro";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Leer = "en_quiero_leer_este_libro";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Leer = getResources().getIdentifier(nombreAudio_Leer, "raw", getPackageName());

        MediaPlayer mediaPlayer11 = MediaPlayer.create(this, resourceId_Leer);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonLeer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer11 es nulo o no se ha inicializado correctamente
                if (mediaPlayer11 == null) {
                    Toast.makeText(ActivitySchool.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_PonerGomets;
        if (idioma.equals("es")) {
            nombreAudio_PonerGomets = "es_ponme_gomets";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_PonerGomets = "en_ponme_gomets";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_PonerGomets = getResources().getIdentifier(nombreAudio_PonerGomets, "raw", getPackageName());

        MediaPlayer mediaPlayer12 = MediaPlayer.create(this, resourceId_PonerGomets);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonPonerGomets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer12 es nulo o no se ha inicializado correctamente
                if (mediaPlayer12 == null) {
                    Toast.makeText(ActivitySchool.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_RotuladorPizarra;
        if (idioma.equals("es")) {
            nombreAudio_RotuladorPizarra = "es_dejame_el_rotulador_de_la_pizarra";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_RotuladorPizarra = "en_dejame_el_rotulador_de_la_pizarra";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_RotuladorPizarra = getResources().getIdentifier(nombreAudio_RotuladorPizarra, "raw", getPackageName());

        MediaPlayer mediaPlayer13 = MediaPlayer.create(this, resourceId_RotuladorPizarra);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonRotuladorPizarra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer13 es nulo o no se ha inicializado correctamente
                if (mediaPlayer13 == null) {
                    Toast.makeText(ActivitySchool.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_imageButtonPegar;
        if (idioma.equals("es")) {
            nombreAudio_imageButtonPegar = "es_dejame_el_pegamento_por_favor";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_imageButtonPegar = "en_dejame_el_pegamento_por_favor";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_imageButtonPegar = getResources().getIdentifier(nombreAudio_imageButtonPegar, "raw", getPackageName());

        MediaPlayer mediaPlayer14 = MediaPlayer.create(this, resourceId_imageButtonPegar);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonPegar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer14 es nulo o no se ha inicializado correctamente
                if (mediaPlayer14 == null) {
                    Toast.makeText(ActivitySchool.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Tijeras2;
        if (idioma.equals("es")) {
            nombreAudio_Tijeras2 = "es_ayudame_a_cortar";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Tijeras2 = "en_ayudame_a_cortar";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Tijeras2 = getResources().getIdentifier(nombreAudio_Tijeras2, "raw", getPackageName());

        MediaPlayer mediaPlayer15 = MediaPlayer.create(this, resourceId_Tijeras2);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonTijeras2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer15 es nulo o no se ha inicializado correctamente
                if (mediaPlayer15 == null) {
                    Toast.makeText(ActivitySchool.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_LavarseLasManos;
        if (idioma.equals("es")) {
            nombreAudio_LavarseLasManos = "es_voy_a_lavarme_las_manos";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_LavarseLasManos = "en_voy_a_lavarme_las_manos";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_LavarseLasManos = getResources().getIdentifier(nombreAudio_LavarseLasManos, "raw", getPackageName());

        MediaPlayer mediaPlayer16 = MediaPlayer.create(this, resourceId_LavarseLasManos);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonLavarseLasManos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer16 es nulo o no se ha inicializado correctamente
                if (mediaPlayer16 == null) {
                    Toast.makeText(ActivitySchool.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Jugar2;
        if (idioma.equals("es")) {
            nombreAudio_Jugar2 = "es_vamos_a_jugar";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Jugar2 = "en_vamos_a_jugar";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Jugar2 = getResources().getIdentifier(nombreAudio_Jugar2, "raw", getPackageName());

        MediaPlayer mediaPlayer17 = MediaPlayer.create(this, resourceId_Jugar2);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonJugar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer17 es nulo o no se ha inicializado correctamente
                if (mediaPlayer17 == null) {
                    Toast.makeText(ActivitySchool.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_MeGusta2;
        if (idioma.equals("es")) {
            nombreAudio_MeGusta2 = "es_me_gusta";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_MeGusta2 = "en_me_gusta";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_MeGusta2 = getResources().getIdentifier(nombreAudio_MeGusta2, "raw", getPackageName());

        MediaPlayer mediaPlayer18 = MediaPlayer.create(this, resourceId_MeGusta2);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonMeGusta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer18 es nulo o no se ha inicializado correctamente
                if (mediaPlayer18 == null) {
                    Toast.makeText(ActivitySchool.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_NoMeGusta2;
        if (idioma.equals("es")) {
            nombreAudio_NoMeGusta2 = "es_no_me_gusta";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_NoMeGusta2 = "en_no_me_gusta";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_NoMeGusta2 = getResources().getIdentifier(nombreAudio_NoMeGusta2, "raw", getPackageName());

        MediaPlayer mediaPlayer19 = MediaPlayer.create(this, resourceId_NoMeGusta2);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonNoMeGusta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer19 es nulo o no se ha inicializado correctamente
                if (mediaPlayer19 == null) {
                    Toast.makeText(ActivitySchool.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_VamonosACasa;
        if (idioma.equals("es")) {
            nombreAudio_VamonosACasa = "es_vamonos_a_casa";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_VamonosACasa = "en_vamonos_a_casa";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_VamonosACasa = getResources().getIdentifier(nombreAudio_VamonosACasa, "raw", getPackageName());

        MediaPlayer mediaPlayer20 = MediaPlayer.create(this, resourceId_VamonosACasa);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonVamonosACasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer20 es nulo o no se ha inicializado correctamente
                if (mediaPlayer20 == null) {
                    Toast.makeText(ActivitySchool.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Borrar;
        if (idioma.equals("es")) {
            nombreAudio_Borrar = "es_vamos_a_borrar";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Borrar = "en_vamos_a_borrar";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Borrar = getResources().getIdentifier(nombreAudio_Borrar, "raw", getPackageName());

        MediaPlayer mediaPlayer21 = MediaPlayer.create(this, resourceId_Borrar);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer21 es nulo o no se ha inicializado correctamente
                if (mediaPlayer21 == null) {
                    Toast.makeText(ActivitySchool.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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