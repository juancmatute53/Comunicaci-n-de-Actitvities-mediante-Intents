package com.example.jtstore;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ComentarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comentario);
    }

    public void enviarMensaje (View view){
        Intent intent = new Intent(getApplicationContext(),recibeComentario.class);

        EditText editText= findViewById(R.id.editTextMensaje);//enlazamos comentario
        String mensaje = editText.getText().toString();
        intent.putExtra("msje",mensaje);
        startActivity(intent);
    }
}