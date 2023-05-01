package com.jablal.proyectojavierblasco;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ConfigActivity extends AppCompatActivity {
    private Spinner spinner;
    private AutoCompleteTextView textViewNameUser;
    private TextView textViewUser;
    public String newName = "";
    SharedPreferences sharedPref;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();//ocultamos la barra superior, dejando mas pantalla libre
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);
        textViewNameUser = findViewById(R.id.textViewNameUser);
        textViewUser = findViewById(R.id.textViewUser);


        ImageButton boton = findViewById(R.id.imageButtonHome2);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfigActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
            //indicamos la imagen por defecto del usuario
        ImageView imageView2 = findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.image_user);



        // Inicializar sharedPref dentro del método onCreate()
        sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE);

        Button botonIdioma = findViewById(R.id.buttonSelectedIdiom);
        botonIdioma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recreate();
            }
        });


        // Obtener una referencia al Spinner en tu layout XML
        spinner = findViewById(R.id.spinner_idiomas);

        // Crear una lista de idiomas
        List<String> idiomas = new ArrayList<>();
        idiomas.add(getString(R.string.idioma_espanol));
        idiomas.add(getString(R.string.idioma_ingles));

        spinner.setBackgroundColor(getResources().getColor(R.color.teal_200));

        // Crear un ArrayAdapter que se encargará de vincular los datos con la vista de cada elemento
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ConfigActivity.this, android.R.layout.simple_spinner_item, idiomas);

        // Especificar la apariencia del Spinner cuando se muestra la lista de opciones
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Asignar el adaptador al Spinner
        spinner.setAdapter(adapter);
        // Agregar un Listener al Spinner para detectar cuando se selecciona un idioma
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedLanguage = (String) parent.getItemAtPosition(position);
                selectedLanguage=spinner.getSelectedItem().toString();

                if (selectedLanguage.equals(getString(R.string.idioma_espanol))) {
                    cambiarIdioma("es");
                } else if (selectedLanguage.equals(getString(R.string.idioma_ingles))) {
                    cambiarIdioma("en");
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spinner.setSelection(0);
        // Obtener el texto del elemento seleccionado
        String selectedText = spinner.getSelectedItem().toString();

        // Crear un SpannableString para el texto seleccionado y establecer su color a rojo
        //SpannableString spannableString = new SpannableString(selectedText);
        //spannableString.setSpan(new ForegroundColorSpan(Color.RED), 0, selectedText.length(), 0);
        // Obtiene la vista del elemento seleccionado en el Spinner
        View selectedItemView = spinner.getSelectedView();

        // Si la vista es un TextView, establece el color del texto a negro
        if (selectedItemView instanceof TextView) {
            ((TextView) selectedItemView).setTextColor(Color.BLACK);
        }




        String defaultValue = getResources().getString(R.string.name_user);
        String nameUser = sharedPref.getString("name_user", defaultValue);


        textViewNameUser.setText(nameUser);
        textViewUser.setText(nameUser);

        /////
















        /////

    }

    private void cambiarIdioma(String codigoIdioma) {
        // Obtener la referencia a la configuración actual de la aplicación
        Configuration config = getResources().getConfiguration();

        // Crear un objeto Locale para el idioma seleccionado
        Locale newLocale = new Locale(codigoIdioma);

        // Establecer el nuevo idioma en la configuración de la aplicación
        config.setLocale(newLocale);

        // Actualizar la configuración de la aplicación sin reiniciar la actividad
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());



    }


    @Override
    protected void onResume() {
        super.onResume();
        // Obtener el texto del TextView y guardarlo en la variable newName
        newName = textViewNameUser.getText().toString();

        // Obtener una referencia al EditText
        EditText editText = findViewById(R.id.pruebaText);

        // Sobrescribir el texto del EditText con el valor de la variable newName
        editText.setText(newName);
    }


    @Override
    protected  void onPause() {
        super.onPause();
        SharedPreferences.Editor editor = sharedPref.edit();

        String nameUser = textViewNameUser.getText().toString();
        editor.putString("name_user", nameUser);
        editor.apply();


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        SharedPreferences sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        String nameUser = textViewNameUser.getText().toString();
        editor.putString("name_user", nameUser);
        editor.apply();

    }





}
