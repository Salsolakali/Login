package com.example.fernana6.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ViewUsersActivity extends AppCompatActivity {

    ListView usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_users);

        usuario = findViewById(R.id.lvUsers);

        ArrayList <Persona> personas = new ArrayList<>();

        personas.add(new Persona("Alberto", "Fernandez", "sucorreo"));
        personas.add(new Persona("Alberto", "Fernandez", "sucorreo"));
        personas.add(new Persona("Alberto", "Fernandez", "sucorreo"));
        personas.add(new Persona("Alberto", "Fernandez", "sucorreo"));
        personas.add(new Persona("Alberto", "Fernandez", "sucorreo"));
        personas.add(new Persona("Alberto", "Fernandez", "sucorreo"));
        personas.add(new Persona("Alberto", "Fernandez", "sucorreo"));
        personas.add(new Persona("Alberto", "Fernandez", "sucorreo"));
        personas.add(new Persona("DAvid", "Fernandez", "sucorreo"));
        personas.add(new Persona("Patri", "Fernandez", "sucorreo"));
        personas.add(new Persona("Luis", "Fernandez", "sucorreo"));
        personas.add(new Persona("Fer", "Fernandez", "sucorreo"));
        personas.add(new Persona("Miguel", "Fernandez", "sucorreo"));
        personas.add(new Persona("Otro david", "Fernandez", "sucorreo"));
        personas.add(new Persona("Señor Tumnus", "Fernandez", "sucorreo"));
        personas.add(new Persona("Cristobal Colon", "Fernandez", "sucorreo"));

        ListAdapter adapter = new Adapter(this, 0, personas);

        usuario.setAdapter(adapter);
    }
}
