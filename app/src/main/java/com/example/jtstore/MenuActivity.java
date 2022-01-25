package com.example.jtstore;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public  void irComentario (View view){
        Intent i = new Intent(this, ComentarioActivity.class);
        startActivity(i);
    }

    public  void irGuitarras (View view){
        Intent i = new Intent(this, GuitarraActivity.class);
        startActivity(i);
    }
}