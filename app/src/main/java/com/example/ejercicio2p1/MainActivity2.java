package com.example.ejercicio2p1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText txtnombre, txtapellidos, txtedad, txtcorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtnombre= (EditText) findViewById(R.id.txtnom);
        txtapellidos= (EditText) findViewById(R.id.txtapel);
        txtedad= (EditText) findViewById(R.id.txtedad);
        txtcorreo= (EditText) findViewById(R.id.txtcorreo);

        txtnombre.setText(getIntent().getExtras().getString("nombre"));
        txtapellidos.setText(getIntent().getExtras().getString("apellidos"));
        txtedad.setText(getIntent().getExtras().getString("edad"));
        txtcorreo.setText(getIntent().getExtras().getString("correo"));



    }
}