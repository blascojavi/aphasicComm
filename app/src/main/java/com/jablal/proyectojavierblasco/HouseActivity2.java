package com.jablal.proyectojavierblasco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HouseActivity2 extends AppCompatActivity {





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


    }

}