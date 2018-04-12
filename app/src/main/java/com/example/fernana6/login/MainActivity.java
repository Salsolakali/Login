package com.example.fernana6.login;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText inputName, password;
    private Button btnRegister, btnSignIn, btnRecicleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputName = findViewById(R.id.inputName);
        password = findViewById(R.id.inputPassword);
        btnRegister = findViewById(R.id.btnRegister);
        btnSignIn = findViewById(R.id.btnSignIn);
        btnRecicleView = findViewById(R.id.btnRecicleView);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registro = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(registro);
            }
        });

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compruebaLosDatos(inputName.getText().toString(),password.getText().toString());
            }
        });

        btnRecicleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent veteARecicleView = new Intent(MainActivity.this,RecyclerViewActivity.class);
            }
        });

    }
    private void compruebaLosDatos(String name, String password){
        String nombre = name;
        String contra = password;
        SharedPreferences sharedPref = getSharedPreferences("Login", Context.MODE_PRIVATE);
        String spName = sharedPref.getString("name","No hay dato");
        String spPassword = sharedPref.getString("password", "No hay Password");

        if(spName.equals(name)&& spPassword.equals(password)){
            Toast.makeText(this, "Loggin correcto", Toast.LENGTH_LONG).show();
            Intent viewUser = new Intent(MainActivity.this, ViewUsersActivity.class);
            startActivity(viewUser);
        }
        else{
            Toast.makeText(this, "Usuario o contraseña inválidos", Toast.LENGTH_LONG).show();
        }
        //Toast.makeText(MainActivity.this, spName, Toast.LENGTH_SHORT).show();
        //Toast.makeText(MainActivity.this, datosUsuario, Toast.LENGTH_SHORT).show();

    }
}
