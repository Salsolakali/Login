package com.example.fernana6.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    RecyclerView rvContainer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recicle_view);
        rvContainer = (RecyclerView) findViewById(R.id.rvContainer);


        ArrayList<Persona> personas = new ArrayList<>();

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

        rvContainer.setLayoutManager(new LinearLayoutManager(this));

        Adapter adapter = new Adapter(this,0, personas);
        rvContainer.setAdapter(adapter);
    }
}
