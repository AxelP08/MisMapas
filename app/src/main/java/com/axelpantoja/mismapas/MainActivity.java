package com.axelpantoja.mismapas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private double bellasArtes1 = 19.434385;
    private double bellasArtes2 = -99.141434;
    private double zocalo1 = 19.432558;
    private double zocalo2 = -99.133264;
    private double bosque1 = 19.419552;
    private double bosque2 = -99.189445;
    private double angel1 = 19.427036;
    private double angel2 = -99.167707;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i = new Intent(MainActivity.this, MapsActivity.class);
    }


    public void bellasArtes(View view) {
        i.putExtra("nombre", "Palacio de Bellas Artes");
        i.putExtra("1", bellasArtes1);
        i.putExtra("2", bellasArtes2);
        startActivity(i);
    }

    public void zocalo(View view) {
        i.putExtra("nombre", "Zócalo CDMX");
        i.putExtra("1", zocalo1);
        i.putExtra("2", zocalo2);
        startActivity(i);
    }

    public void bosque(View view) {
        i.putExtra("nombre", "Bosque de Chapultepec");
        i.putExtra("1", bosque1);
        i.putExtra("2", bosque2);
        startActivity(i);
    }

    public void angel(View view) {
        i.putExtra("nombre", "Ángel de la independencia");
        i.putExtra("1", angel1);
        i.putExtra("2", angel2);
        startActivity(i);
    }
}
