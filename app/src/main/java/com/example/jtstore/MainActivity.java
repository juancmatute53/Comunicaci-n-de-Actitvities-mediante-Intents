package com.example.jtstore;


import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void irInicio(View view){
        Intent i = new Intent(this, IniciarSesionActivity.class);
        startActivity(i);
    }

    public void irRegistro (View view){
        Intent i = new Intent(this, RegistrarseActivity.class);
        startActivity(i);
    }

}