package com.jablal.proyectojavierblasco;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Camera;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;


public class ConfigActivity extends AppCompatActivity {
    private Spinner spinner;
    private AutoCompleteTextView textViewNameUser;
    private TextView textViewUser;
    public String newName = "";
    SharedPreferences sharedPref;
    private static final int REQUEST_IMAGE_CAPTURE = 1;
    private int currentPosition = 0;
    private List<String> imageNames = Arrays.asList("female", "female_young_2", "men_young", "men", "female_young");
    private String nextImageName;
    private SharedPreferences sharedPreferencesAvatar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);
        textViewNameUser = findViewById(R.id.textViewNameUser);
        textViewUser = findViewById(R.id.textViewUser);
        sharedPreferencesAvatar = getSharedPreferences("sharedPrefAvatar", MODE_PRIVATE);
        nextImageName = sharedPreferencesAvatar.getString("name_user", imageNames.get(0));
        Log.d("PRUEBA", nextImageName);
            ///

            ///
        ImageButton boton = findViewById(R.id.imageButtonHome2);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfigActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        ImageView imageView2 = findViewById(R.id.image_View);
        //imageView2.setImageResource(R.drawable.image_user);

        int resourceId = getResources().getIdentifier(nextImageName, "drawable", getPackageName());
        imageView2.setImageResource(resourceId);

        sharedPref = getSharedPreferences("myPref", Context.MODE_PRIVATE);

        Button botonIdioma = findViewById(R.id.buttonSelectedIdiom);
        botonIdioma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recreate();
            }
        });

        spinner = findViewById(R.id.spinner_idiomas);

        List<String> idiomas = new ArrayList<>();
        idiomas.add(getString(R.string.idioma_espanol));
        idiomas.add(getString(R.string.idioma_ingles));

        spinner.setBackgroundColor(getResources().getColor(R.color.teal_200));

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ConfigActivity.this, android.R.layout.simple_spinner_item, idiomas);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
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

        View selectedItemView = spinner.getSelectedView();
        if (selectedItemView instanceof TextView) {
            ((TextView) selectedItemView).setTextColor(Color.BLACK);
        }

        //String defaultValue = getResources().getString(R.string.name_user);
       // String nameUser = sharedPref.getString("name_user", defaultValue);
        String defaultValue = getResources().getString(R.string.name_user); // Obtener el valor predeterminado del nombre de usuario desde los recursos
        String nameUser = sharedPref.getString("name_user", defaultValue); // Obtener el valor actual del nombre de usuario desde SharedPreferences

        // Establece el nombre de usuario en el TextView textViewNameUser
        textViewNameUser.setText(nameUser);
      //  textViewUser.setText(nameUser);




/////////////////////////////////
        Button buttonChangePicture = findViewById(R.id.button_change_picture);
        ImageView imageView = findViewById(R.id.image_View);

        buttonChangePicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                // int currentPosition = sharedPreferences.getInt("position", 0);

                currentPosition = (currentPosition + 1) % imageNames.size();

                nextImageName = imageNames.get(currentPosition);
                int resourceId = getResources().getIdentifier(nextImageName, "drawable", getPackageName());
                imageView.setImageResource(resourceId);

                // Guardar la posición actual y el nombre de la imagen en SharedPreferences
                // SharedPreferences.Editor editor = sharedPreferencesAvatar.edit();
                //editor.putInt("position", currentPosition);
                //editor.putString("image_user", nextImageName); // Guardar el nombre de la imagen en las preferencias compartidas
                //editor.apply();

            }
        });


        TextView textContact = findViewById(R.id.textContact);
        String email = "blascojavi@hotmail.com";
        String subject = "AphasicComm";
        String emailLink = "mailto:" + email + "?subject=" + Uri.encode(subject, "UTF-8").toUpperCase();
        SpannableString spannableString = new SpannableString("Contacto: " + email);
        Linkify.TransformFilter transformFilter = (match, url) -> "";
        Linkify.addLinks(spannableString, Pattern.compile(email), emailLink, null, transformFilter);
        textContact.setText(spannableString);
        textContact.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textViewLanguageSelected = findViewById(R.id.LanguageSelected);

        // Obtener la configuración actual de la aplicación
        Configuration config = getResources().getConfiguration();

        // Obtener el objeto Locale del idioma actual
        Locale currentLocale = config.locale;

        // Obtener el nombre del idioma en uso
        String currentLanguage = currentLocale.getDisplayName();

        // Mostrar el nombre del idioma en el TextView
        textViewLanguageSelected.setText(currentLanguage);


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




    }


    @Override
    protected  void onPause() {

        // SharedPreferences.Editor editor = sharedPref.edit();

        // String nameUser = textViewNameUser.getText().toString();
        // editor.putString("name_user", nameUser);
        // editor.apply();

        SharedPreferences.Editor editor = sharedPreferencesAvatar.edit();
        // String nameUser = textViewNameUser.getText().toString();
        editor.putString("name_user", nextImageName);
        editor.apply();
        String test = sharedPreferencesAvatar.getString("name_user", "test");
        Log.d("onPause", test);
        // super.onDestroy();

        SharedPreferences.Editor editor2 = sharedPref.edit();
        String nameUser = textViewNameUser.getText().toString();
        editor2.putString("name_user", nameUser);
        editor2.apply();


        super.onPause();


    }

    @Override
    protected void onDestroy() {
        SharedPreferences.Editor editor = sharedPreferencesAvatar.edit();
        // String nameUser = textViewNameUser.getText().toString();
        editor.putString("name_user", nextImageName);
        editor.apply();
        String test = sharedPreferencesAvatar.getString("name_user", "test");
        Log.d("onDestroy", test);
        super.onDestroy();
    }



/////











/////
}
