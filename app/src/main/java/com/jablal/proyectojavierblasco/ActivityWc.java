package com.jablal.proyectojavierblasco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityWc extends AppCompatActivity {

    private ImageButton imageButtonNoQuedaPapel,imageButtondameLaToalla,imageButtoncortarLasUnyas,imageButtonLimpiarElCulo,imageButtonQuieroJuguetesDeBanyo,imageButtonHaceCaca,imageButtonLavarmeLosDientes,
    imageButtonNecesitoIntimidad,imageButtonCepillarmeElPelo,imageButtonEscobilla,imageButtonMeHeHechoPipi,imageButtonSecarmeElCuerpo,imageButtonLavarLaCara,imageButtonSecarseElPelo,
    imageButtonTengoGanas,imageButtonLimpiarElPis,imageButtonPeinarme,imageButtonLavarseLasManos2,imageButtonQuieroDucharme,imageButtonquieroBanyarme,imageButtonacerPis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();//ocultamos la barra superior, dejando mas pantalla libre
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wc);

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







    }
}