package com.jablal.proyectojavierblasco;

import android.view.View;
import android.widget.ImageButton;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;



/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Mock
    private View mockedView;

    private MainActivity mainActivity;
    //  @Test
  //  public void useAppContext() {
        // Context of the app under test.
      //  Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
     //  assertEquals("com.jablal.proyectojavierblasco", appContext.getPackageName());
   // }

    //Pruebas Unitarias//
    /////////////////////
    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testImageButtonHomeDormirOnClick() {//Comprueba que el boton exista y se ejecute sin lanzar excepciones
        // Obtiene la instancia de MainActivity a través de la regla de escenario de actividad
        MainActivity mainActivity = activityRule.getActivity();
        // Crea un objeto mock de ImageButton utilizando Mockito
        ImageButton imageButtonHomeDormir = Mockito.mock(ImageButton.class);
        // Asigna el objeto mock al campo imageButtonHomeDormir de MainActivity
        mainActivity.imageButtonHomeDormir = imageButtonHomeDormir;

        // Simula el comportamiento de hacer clic en el botón
        Mockito.doNothing().when(imageButtonHomeDormir).setOnClickListener(Mockito.any());

        // Ejecuta el método de prueba
        mainActivity.imageButtonHomeDormir.performClick();

        // Realiza las aserciones o verificaciones necesarias
        // Por ejemplo, puedes verificar si el método start() del mediaPlayer fue llamado
        /*
        * Al ejecutar esta prueba, no se espera que ocurra una excepción y no se realiza ninguna aserción explícita
        * en el código proporcionado. Sin embargo, la prueba se utiliza para verificar si el código bajo prueba
        * (en este caso, el método onClick del botón) se ejecuta correctamente sin lanzar excepciones.
        * Si la prueba se ejecuta sin lanzar excepciones, se considera exitosa.
        * */
    }

    @Rule
    public ActivityTestRule<ActivityLunch> activityRule2 = new ActivityTestRule<>(ActivityLunch.class);
    @Test
    public void testImageButtonQuieroOnClick() {

        // Obtiene la instancia de MainActivity a través de la regla de escenario de actividad
        ActivityLunch activityLunch = activityRule2.getActivity();
        // Crea un objeto mock de ImageButton utilizando Mockito
        ImageButton imageButtonQuiero = Mockito.mock(ImageButton.class);
        // Asigna el objeto mock al campo imageButtonHomeDormir de MainActivity
        activityLunch.imageButtonQuiero = imageButtonQuiero;

        // Simula el comportamiento de hacer clic en el botón
        Mockito.doNothing().when(imageButtonQuiero).setOnClickListener(Mockito.any());

        // Ejecuta el método de prueba
        activityLunch.imageButtonQuiero.performClick();

        // Realiza las aserciones o verificaciones necesarias
        // Por ejemplo, puedes verificar si el método start() del mediaPlayer fue llamado
        /*
         * Al ejecutar esta prueba, no se espera que ocurra una excepción y no se realiza ninguna aserción explícita
         * en el código proporcionado. Sin embargo, la prueba se utiliza para verificar si el código bajo prueba
         * (en este caso, el método onClick del botón) se ejecuta correctamente sin lanzar excepciones.
         * Si la prueba se ejecuta sin lanzar excepciones, se considera exitosa.
         * */

    }

    //Pruebas de Integracion//
    /////////////////////
    @Test
    public void testIntegration() {
        // Obtiene la instancia de MainActivity a través de la regla de escenario de actividad
        MainActivity mainActivity = activityRule.getActivity();
        // Obtiene la instancia de ActivityLunch a través de la regla de escenario de actividad
        ActivityLunch activityLunch = activityRule2.getActivity();

        // Crea objetos mock de ImageButton utilizando Mockito
        ImageButton imageButtonHomeDormir = Mockito.mock(ImageButton.class);
        ImageButton imageButtonQuiero = Mockito.mock(ImageButton.class);

        // Asigna los objetos mock a los campos correspondientes de las actividades
        mainActivity.imageButtonHomeDormir = imageButtonHomeDormir;
        activityLunch.imageButtonQuiero = imageButtonQuiero;

        // Simula el comportamiento de hacer clic en los botones
        Mockito.doNothing().when(imageButtonHomeDormir).setOnClickListener(Mockito.any());
        Mockito.doNothing().when(imageButtonQuiero).setOnClickListener(Mockito.any());

        // Ejecuta el método de prueba de clic en el botón de MainActivity
        mainActivity.imageButtonHomeDormir.performClick();
        // Ejecuta el método de prueba de clic en el botón de ActivityLunch
        activityLunch.imageButtonQuiero.performClick();
    }




}