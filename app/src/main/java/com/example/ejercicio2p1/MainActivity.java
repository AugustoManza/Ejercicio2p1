package com.example.ejercicio2p1;

import static com.example.ejercicio2p1.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombre, apellidos, edad, correo;
    Button btnEnv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        nombre= (EditText) findViewById(R.id.nombre);
        apellidos= (EditText) findViewById(R.id.apellidos);
        edad= (EditText) findViewById(R.id.edad);
        correo= (EditText) findViewById(R.id.correo);

        btnEnv = (Button) findViewById(R.id.btnEnv);

        btnEnv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nom=nombre.getText().toString();
                String apel=apellidos.getText().toString();
                String ed=edad.getText().toString();
                String email=correo.getText().toString();

                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("nombre",nom);
                intent.putExtra("apellidos",apel);
                intent.putExtra("edad",ed);
                intent.putExtra("correo",email);
                startActivity(intent);

            }
        });

    }
}