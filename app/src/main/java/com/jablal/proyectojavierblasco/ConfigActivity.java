package com.jablal.proyectojavierblasco;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
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
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ConfigActivity extends AppCompatActivity {
    private Spinner spinner;
    private String idiomaSeleccionadoAnteriormente = "";
    private String idiomaActual = "";
    private int selectedIdiomaIndex = 0;
    private AutoCompleteTextView textViewNameUser;
    private TextView textViewUser;
    public String newName = "";
    SharedPreferences sharedPref;
    private static final int REQUEST_CAMERA = 1;
    private static final int SELECT_FILE = 2;
    private static final int REQUEST_IMAGE_CAPTURE = 1;
    private static final int REQUEST_IMAGE_PICK = 2;
    private ImageView imageView;
    private ImageView imageView2;
    private String imagePath;
    public static final int GALLERY_REQUEST_CODE = 1001;
    public static final int CAMERA_REQUEST_CODE = 1002;
    private static final int REQUEST_IMAGE_GALLERY = 1001;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();//ocultamos la barra superior, dejando mas pantalla libre
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);
        textViewNameUser = findViewById(R.id.textViewNameUser);
        textViewUser = findViewById(R.id.textViewUser);
        imageView2 = findViewById(R.id.imageView2);


        ImageButton boton = findViewById(R.id.imageButtonHome2);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfigActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        ImageView imageView2 = findViewById(R.id.imageView2);
        imageView2.setImageResource(R.drawable.femaleyoung);


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





        Button buttonTakePicture = findViewById(R.id.button_take_picture);
        buttonTakePicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPictureDialog();
            }
        });

// Lee la ruta de la imagen almacenada
        SharedPreferences prefs = getPreferences(MODE_PRIVATE);
        imagePath = prefs.getString("image_path", null);

// Establece la imagen en el ImageView si la ruta existe
        if (imagePath != null) {
            Bitmap bitmap = BitmapFactory.decodeFile(imagePath);
            imageView2.setImageBitmap(bitmap);
        }

        String imagePath = prefs.getString("image_path", null);
        if (imagePath != null) {
            Glide.with(this).load(new File(imagePath)).into(imageView2);
        }



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

    private void showPictureDialog() {
        AlertDialog.Builder pictureDialog = new AlertDialog.Builder(this);
        pictureDialog.setTitle("Selecciona la acción");
        String[] pictureDialogItems = {
                "Tomar foto",
                "Seleccionar de la galería"};
        pictureDialog.setItems(pictureDialogItems,
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which) {
                            case 0:
                                takePicture();
                                break;
                            case 1:
                                choosePicture();
                                break;
                        }
                    }
                });
        pictureDialog.show();
    }

    private void takePicture() {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, REQUEST_CAMERA);
    }

    private void choosePicture() {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, SELECT_FILE);
    }



    private static final int REQUEST_GALLERY_IMAGE = 100;

    private void pickImageFromGallery() {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, REQUEST_GALLERY_IMAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK) {
            if (requestCode == REQUEST_IMAGE_CAPTURE) {
                // Se ha tomado una foto, establecer la imagen en el ImageView
                Bundle extras = data.getExtras();
                Bitmap imageBitmap = (Bitmap) extras.get("data");
                imageView2.setImageBitmap(imageBitmap);
            } else if (requestCode == REQUEST_IMAGE_GALLERY) {
                // Se ha seleccionado una imagen de la galería, establecer la imagen en el ImageView
                Uri selectedImageUri = data.getData();
                imageView2.setImageURI(selectedImageUri);
            }
        }
    }




    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case CAMERA_REQUEST_CODE: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // Permiso concedido para acceder a la cámara
                    Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivityForResult(intent, CAMERA_REQUEST_CODE);
                } else {
                    // Permiso denegado para acceder a la cámara
                    Toast.makeText(ConfigActivity.this, "Permiso denegado para acceder a la cámara", Toast.LENGTH_SHORT).show();
                }
                return;
            }
            case GALLERY_REQUEST_CODE: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // Permiso concedido para acceder a la galería de imágenes
                    Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                    startActivityForResult(Intent.createChooser(intent, "Selecciona una imagen"), GALLERY_REQUEST_CODE);
                } else {
                    // Permiso denegado para acceder a la galería de imágenes
                    Toast.makeText(ConfigActivity.this, "Permiso denegado para acceder a la galería de imágenes", Toast.LENGTH_SHORT).show();
                }
                return;
            }
        }
    }






}
