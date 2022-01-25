package com.example.jtstore;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class IniciarSesionActivity extends Activity {

    EditText user,pass;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);

        user = findViewById(R.id.user);
        pass = findViewById(R.id.password);
        btnlogin = findViewById(R.id.btnLoging);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getText().toString().equals("user") && pass.getText().toString().equals("123")){
                    startActivity(new Intent(IniciarSesionActivity.this, MenuActivity.class));
                    Toast.makeText(IniciarSesionActivity.this, "Bienvenido",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(IniciarSesionActivity.this, "Verifique su usuario y contraseña", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public  void irComentario (View view){
        Intent i = new Intent(this, ComentarioActivity.class);
        startActivity(i);
    }
}