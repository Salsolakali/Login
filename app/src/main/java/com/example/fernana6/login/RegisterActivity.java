package com.example.fernana6.login;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class RegisterActivity extends AppCompatActivity {

    private EditText name, surname, password, repeatPassword, email;
    private Button btnSaveIntoSharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name = findViewById(R.id.inputName);
        surname = findViewById(R.id.inputSurname);
        password = findViewById(R.id.inputRegisterPassword);
        repeatPassword = findViewById(R.id.inputRegisterRepeatPassword);
        email = findViewById(R.id.inputEmail);

        btnSaveIntoSharedPreferences = findViewById(R.id.btnSaveIntoSharedPreferences);


        btnSaveIntoSharedPreferences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compruebaLaPassword(password.getText().toString(),repeatPassword.getText().toString());
            }
        });

    }
    private void compruebaLaPassword(String p1, String p2){
        if(!p1.equals(p2)){
            Toast.makeText(this, "Please, check your password", Toast.LENGTH_LONG).show();
        }
        else{
            guardaLosDatos(name.getText().toString(),surname.getText().toString(),password.getText().toString(),email.getText().toString());

        }
    }
    private void guardaLosDatos(String name, String surname, String password, String email){
        String nameToSave = name;
        String surnameToSave = surname;
        String passwordToSave = password;
        String emailToSave = email;

        SharedPreferences sharedPref = getSharedPreferences("Login", Context.MODE_PRIVATE);//getPreferences(Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = sharedPref.edit();

        editor.putString("name", nameToSave);
        editor.putString("surname",surnameToSave);
        editor.putString("password",passwordToSave);
        editor.putString("email",emailToSave);
        editor.commit();

        editor.apply();

        Toast.makeText(RegisterActivity.this, "You have been registered correctly!", Toast.LENGTH_SHORT).show();

        Intent volverAInicio= new Intent(RegisterActivity.this, MainActivity.class);
        startActivity(volverAInicio);
    }
}
