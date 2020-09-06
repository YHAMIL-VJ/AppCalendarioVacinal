package com.example.calendariovacinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner diademes = (Spinner) findViewById(R.id.spdia);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.listadias,
                                                        android.R.layout.simple_spinner_item);

        diademes.setAdapter(adapter);

        Spinner mesdoano = (Spinner) findViewById(R.id.spmes);
        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this,R.array.listames,
                android.R.layout.simple_spinner_item);

        mesdoano.setAdapter(adapter1);

        Spinner anodenasc = (Spinner) findViewById(R.id.spano);
        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this,R.array.listaano,
                android.R.layout.simple_spinner_item);

        anodenasc.setAdapter(adapter2);

    }
}