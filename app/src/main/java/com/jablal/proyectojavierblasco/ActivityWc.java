package com.jablal.proyectojavierblasco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class ActivityWc extends AppCompatActivity {

    private ImageButton imageButtonNoQuedaPapel,imageButtondameLaToalla,imageButtoncortarLasUnyas,imageButtonLimpiarElCulo,imageButtonQuieroJuguetesDeBanyo,imageButtonHaceCaca,imageButtonLavarmeLosDientes,
    imageButtonNecesitoIntimidad,imageButtonCepillarmeElPelo,imageButtonEscobilla,imageButtonMeHeHechoPipi,imageButtonSecarmeElCuerpo,imageButtonLavarLaCara,imageButtonSecarseElPelo,
    imageButtonTengoGanas,imageButtonLimpiarElPis,imageButtonPeinarme,imageButtonLavarseLasManos2,imageButtonQuieroDucharme,imageButtonquieroBanyarme,imageButtonacerPis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();//ocultamos la barra superior, dejando mas pantalla libre
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wc);

        // Obtiene la configuración actual
        Configuration configuration = getResources().getConfiguration();
        String idioma = configuration.getLocales().get(0).getLanguage();


        imageButtonNoQuedaPapel = findViewById(R.id.imageButtonNoQuedaPapel);
        imageButtondameLaToalla = findViewById(R.id.imageButtondameLaToalla);
        imageButtoncortarLasUnyas = findViewById(R.id.imageButtoncortarLasUnyas);
        imageButtonLimpiarElCulo = findViewById(R.id.imageButtonLimpiarElCulo);
        imageButtonQuieroJuguetesDeBanyo = findViewById(R.id.imageButtonQuieroJuguetesDeBanyo);
        imageButtonHaceCaca = findViewById(R.id.imageButtonHaceCaca);
        imageButtonLavarmeLosDientes = findViewById(R.id.imageButtonLavarmeLosDientes);
        imageButtonNecesitoIntimidad = findViewById(R.id.imageButtonNecesitoIntimidad);
        imageButtonCepillarmeElPelo = findViewById(R.id.imageButtonCepillarmeElPelo);
        imageButtonEscobilla = findViewById(R.id.imageButtonEscobilla);
        imageButtonMeHeHechoPipi = findViewById(R.id.imageButtonMeHeHechoPipi);
        imageButtonSecarmeElCuerpo = findViewById(R.id.imageButtonSecarmeElCuerpo);
        imageButtonLavarLaCara = findViewById(R.id.imageButtonLavarLaCara);
        imageButtonSecarseElPelo = findViewById(R.id.imageButtonSecarseElPelo);
        imageButtonTengoGanas = findViewById(R.id.imageButtonTengoGanas);
        imageButtonLimpiarElPis = findViewById(R.id.imageButtonLimpiarElPis);
        imageButtonPeinarme = findViewById(R.id.imageButtonPeinarme);
        imageButtonLavarseLasManos2 = findViewById(R.id.imageButtonLavarseLasManos2);
        imageButtonQuieroDucharme = findViewById(R.id.imageButtonQuieroDucharme);
        imageButtonquieroBanyarme = findViewById(R.id.imageButtonquieroBanyarme);
        imageButtonacerPis = findViewById(R.id.imageButtonacerPis);



        ImageButton boton = findViewById(R.id.imageButtonHome6);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityWc.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Comprueba el idioma y asigna el nombre del archivo correspondiente
        String nombreAudio_NoQuedaPapel;
        if (idioma.equals("es")) {
            nombreAudio_NoQuedaPapel = "es_no_queda_papel";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_NoQuedaPapel = "en_no_queda_papel";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_NoQuedaPapel = getResources().getIdentifier(nombreAudio_NoQuedaPapel, "raw", getPackageName());

        MediaPlayer mediaPlayer = MediaPlayer.create(this, resourceId_NoQuedaPapel);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonNoQuedaPapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer es nulo o no se ha inicializado correctamente
                if (mediaPlayer == null) {
                    Toast.makeText(ActivityWc.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_DameLaToalla;
        if (idioma.equals("es")) {
            nombreAudio_DameLaToalla = "es_dame_la_toalla";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_DameLaToalla = "en_dame_la_toalla";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_DameLaToalla = getResources().getIdentifier(nombreAudio_DameLaToalla, "raw", getPackageName());

        MediaPlayer mediaPlayer2 = MediaPlayer.create(this, resourceId_DameLaToalla);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtondameLaToalla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer2 es nulo o no se ha inicializado correctamente
                if (mediaPlayer2 == null) {
                    Toast.makeText(ActivityWc.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_cortarLasUnyas;
        if (idioma.equals("es")) {
            nombreAudio_cortarLasUnyas = "es_cortame_las_unyas";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_cortarLasUnyas = "en_cortame_las_unyas";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_cortarLasUnyas = getResources().getIdentifier(nombreAudio_cortarLasUnyas, "raw", getPackageName());

        MediaPlayer mediaPlayer3 = MediaPlayer.create(this, resourceId_cortarLasUnyas);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtoncortarLasUnyas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer3 es nulo o no se ha inicializado correctamente
                if (mediaPlayer3 == null) {
                    Toast.makeText(ActivityWc.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_LimpiarElCulo;
        if (idioma.equals("es")) {
            nombreAudio_LimpiarElCulo = "es_limpiame_el_culo";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_LimpiarElCulo = "en_limpiame_el_culo";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_LimpiarElCulo = getResources().getIdentifier(nombreAudio_LimpiarElCulo, "raw", getPackageName());

        MediaPlayer mediaPlayer4 = MediaPlayer.create(this, resourceId_LimpiarElCulo);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonLimpiarElCulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer4 es nulo o no se ha inicializado correctamente
                if (mediaPlayer4 == null) {
                    Toast.makeText(ActivityWc.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_QuieroJuguetesDeBanyo;
        if (idioma.equals("es")) {
            nombreAudio_QuieroJuguetesDeBanyo = "es_quiero_los_juguetes_de_la_banyera";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_QuieroJuguetesDeBanyo = "en_quiero_los_juguetes_de_la_banyera";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_QuieroJuguetesDeBanyo = getResources().getIdentifier(nombreAudio_QuieroJuguetesDeBanyo, "raw", getPackageName());

        MediaPlayer mediaPlayer5 = MediaPlayer.create(this, resourceId_QuieroJuguetesDeBanyo);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonQuieroJuguetesDeBanyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer5 es nulo o no se ha inicializado correctamente
                if (mediaPlayer5 == null) {
                    Toast.makeText(ActivityWc.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_HaceCaca;
        if (idioma.equals("es")) {
            nombreAudio_HaceCaca = "es_quiero_hacer_caca";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_HaceCaca = "en_quiero_hacer_caca";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_HaceCaca = getResources().getIdentifier(nombreAudio_HaceCaca, "raw", getPackageName());

        MediaPlayer mediaPlayer6 = MediaPlayer.create(this, resourceId_HaceCaca);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonHaceCaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer6 es nulo o no se ha inicializado correctamente
                if (mediaPlayer6 == null) {
                    Toast.makeText(ActivityWc.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_LavarmeLosDientes;
        if (idioma.equals("es")) {
            nombreAudio_LavarmeLosDientes = "es_voy_a_lavarme_los_dientes";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_LavarmeLosDientes = "en_voy_a_lavarme_los_dientes";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_LavarmeLosDientes = getResources().getIdentifier(nombreAudio_LavarmeLosDientes, "raw", getPackageName());

        MediaPlayer mediaPlayer7 = MediaPlayer.create(this, resourceId_LavarmeLosDientes);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonLavarmeLosDientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer7 es nulo o no se ha inicializado correctamente
                if (mediaPlayer7 == null) {
                    Toast.makeText(ActivityWc.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_NecesitoIntimidad;
        if (idioma.equals("es")) {
            nombreAudio_NecesitoIntimidad = "es_necesito_estar_a_solas";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_NecesitoIntimidad = "en_necesito_estar_a_solas";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_NecesitoIntimidad = getResources().getIdentifier(nombreAudio_NecesitoIntimidad, "raw", getPackageName());

        MediaPlayer mediaPlayer8 = MediaPlayer.create(this, resourceId_NecesitoIntimidad);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonNecesitoIntimidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer8 es nulo o no se ha inicializado correctamente
                if (mediaPlayer8 == null) {
                    Toast.makeText(ActivityWc.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_CepillarmeElPelo;
        if (idioma.equals("es")) {
            nombreAudio_CepillarmeElPelo = "es_ayudame_a_cepillarme_el_pelo";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_CepillarmeElPelo = "en_ayudame_a_cepillarme_el_pelo";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_CepillarmeElPelo = getResources().getIdentifier(nombreAudio_CepillarmeElPelo, "raw", getPackageName());

        MediaPlayer mediaPlayer9 = MediaPlayer.create(this, resourceId_CepillarmeElPelo);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonCepillarmeElPelo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer9 es nulo o no se ha inicializado correctamente
                if (mediaPlayer9 == null) {
                    Toast.makeText(ActivityWc.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Escobilla;
        if (idioma.equals("es")) {
            nombreAudio_Escobilla = "es_vamos_a_pasar_la_escobilla_en_el_banyo";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Escobilla = "en_vamos_a_pasar_la_escobilla_en_el_banyo";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Escobilla = getResources().getIdentifier(nombreAudio_Escobilla, "raw", getPackageName());

        MediaPlayer mediaPlayer10 = MediaPlayer.create(this, resourceId_Escobilla);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonEscobilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer10 es nulo o no se ha inicializado correctamente
                if (mediaPlayer10 == null) {
                    Toast.makeText(ActivityWc.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_MeHeHechoPipi;
        if (idioma.equals("es")) {
            nombreAudio_MeHeHechoPipi = "es_me_he_hecho_pipi";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_MeHeHechoPipi = "en_me_he_hecho_pipi";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_MeHeHechoPipi = getResources().getIdentifier(nombreAudio_MeHeHechoPipi, "raw", getPackageName());

        MediaPlayer mediaPlayer11 = MediaPlayer.create(this, resourceId_MeHeHechoPipi);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonMeHeHechoPipi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer11 es nulo o no se ha inicializado correctamente
                if (mediaPlayer11 == null) {
                    Toast.makeText(ActivityWc.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_SecarmeElCuerpo;
        if (idioma.equals("es")) {
            nombreAudio_SecarmeElCuerpo = "es_ayudame_a_secarme_el_cuerpo";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_SecarmeElCuerpo = "en_ayudame_a_secarme_el_cuerpo";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_SecarmeElCuerpo = getResources().getIdentifier(nombreAudio_SecarmeElCuerpo, "raw", getPackageName());

        MediaPlayer mediaPlayer12 = MediaPlayer.create(this, resourceId_SecarmeElCuerpo);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonSecarmeElCuerpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer12 es nulo o no se ha inicializado correctamente
                if (mediaPlayer12 == null) {
                    Toast.makeText(ActivityWc.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_LavarLaCara;
        if (idioma.equals("es")) {
            nombreAudio_LavarLaCara = "es_voy_a_lavarme_la_cara";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_LavarLaCara = "en_voy_a_lavarme_la_cara";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_LavarLaCara = getResources().getIdentifier(nombreAudio_LavarLaCara, "raw", getPackageName());

        MediaPlayer mediaPlayer13 = MediaPlayer.create(this, resourceId_LavarLaCara);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonLavarLaCara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer13 es nulo o no se ha inicializado correctamente
                if (mediaPlayer13 == null) {
                    Toast.makeText(ActivityWc.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_SecarseElPelo;
        if (idioma.equals("es")) {
            nombreAudio_SecarseElPelo = "es_puedes_secarme_el_pelo";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_SecarseElPelo = "en_puedes_secarme_el_pelo";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_SecarseElPeloa = getResources().getIdentifier(nombreAudio_SecarseElPelo, "raw", getPackageName());

        MediaPlayer mediaPlayer14 = MediaPlayer.create(this, resourceId_SecarseElPeloa);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonSecarseElPelo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer14 es nulo o no se ha inicializado correctamente
                if (mediaPlayer14 == null) {
                    Toast.makeText(ActivityWc.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_TengoGanas;
        if (idioma.equals("es")) {
            nombreAudio_TengoGanas = "es_tengo_ganas_de_ir_al_banyo";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_TengoGanas = "en_tengo_ganas_de_ir_al_banyo";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_TengoGanas = getResources().getIdentifier(nombreAudio_TengoGanas, "raw", getPackageName());

        MediaPlayer mediaPlayer15 = MediaPlayer.create(this, resourceId_TengoGanas);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonTengoGanas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer15 es nulo o no se ha inicializado correctamente
                if (mediaPlayer15 == null) {
                    Toast.makeText(ActivityWc.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_LimpiarElPis;
        if (idioma.equals("es")) {
            nombreAudio_LimpiarElPis = "es_puedes_limpiarme_el_pipi";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_LimpiarElPis = "en_puedes_limpiarme_el_pipi";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_LimpiarElPis = getResources().getIdentifier(nombreAudio_LimpiarElPis, "raw", getPackageName());

        MediaPlayer mediaPlayer16 = MediaPlayer.create(this, resourceId_LimpiarElPis);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonLimpiarElPis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer16 es nulo o no se ha inicializado correctamente
                if (mediaPlayer16 == null) {
                    Toast.makeText(ActivityWc.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_Peinarme;
        if (idioma.equals("es")) {
            nombreAudio_Peinarme = "es_puedes_peinarme";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_Peinarme = "en_puedes_peinarme";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_Peinarme = getResources().getIdentifier(nombreAudio_Peinarme, "raw", getPackageName());

        MediaPlayer mediaPlayer17 = MediaPlayer.create(this, resourceId_Peinarme);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonPeinarme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer17 es nulo o no se ha inicializado correctamente
                if (mediaPlayer17 == null) {
                    Toast.makeText(ActivityWc.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_LavarseLasManos2;
        if (idioma.equals("es")) {
            nombreAudio_LavarseLasManos2 = "es_lavarme_las_manos";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_LavarseLasManos2 = "en_lavarme_las_manos";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_LavarseLasManos2 = getResources().getIdentifier(nombreAudio_LavarseLasManos2, "raw", getPackageName());

        MediaPlayer mediaPlayer18 = MediaPlayer.create(this, resourceId_LavarseLasManos2);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonLavarseLasManos2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer18 es nulo o no se ha inicializado correctamente
                if (mediaPlayer18 == null) {
                    Toast.makeText(ActivityWc.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_QuieroDucharme;
        if (idioma.equals("es")) {
            nombreAudio_QuieroDucharme = "es_vamos_a_la_ducha";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_QuieroDucharme = "en_vamos_a_la_ducha";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_QuieroDucharme = getResources().getIdentifier(nombreAudio_QuieroDucharme, "raw", getPackageName());

        MediaPlayer mediaPlayer19 = MediaPlayer.create(this, resourceId_QuieroDucharme);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonQuieroDucharme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer19 es nulo o no se ha inicializado correctamente
                if (mediaPlayer19 == null) {
                    Toast.makeText(ActivityWc.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_quieroBanyarme;
        if (idioma.equals("es")) {
            nombreAudio_quieroBanyarme = "es_vamos_a_la_banyera";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_quieroBanyarme = "en_vamos_a_la_banyera";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_quieroBanyarme = getResources().getIdentifier(nombreAudio_quieroBanyarme, "raw", getPackageName());

        MediaPlayer mediaPlayer20 = MediaPlayer.create(this, resourceId_quieroBanyarme);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonquieroBanyarme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer20 es nulo o no se ha inicializado correctamente
                if (mediaPlayer20 == null) {
                    Toast.makeText(ActivityWc.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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
        String nombreAudio_nacerPis;
        if (idioma.equals("es")) {
            nombreAudio_nacerPis = "es_voy_ha_hacer_pis";
        } else {
            // Idioma por defecto (inglés)
            nombreAudio_nacerPis = "en_voy_a_hacer_pis";
        }

        // Obtiene el identificador del recurso de audio
        int resourceId_nacerPis = getResources().getIdentifier(nombreAudio_nacerPis, "raw", getPackageName());

        MediaPlayer mediaPlayer21 = MediaPlayer.create(this, resourceId_nacerPis);

        // Asigna un listener al botón de imagen para controlar su comportamiento cuando se hace clic en él
        imageButtonacerPis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Verifica si mediaPlayer21 es nulo o no se ha inicializado correctamente
                if (mediaPlayer21 == null) {
                    Toast.makeText(ActivityWc.this, "Error al reproducir el audio", Toast.LENGTH_SHORT).show();
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