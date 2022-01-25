package com.example.jtstore;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.view.View;
import android.widget.*;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class recibeComentario extends AppCompatActivity {

    Button btnenviarC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibe_comentario);

        //enlace de texto
        Intent intent = getIntent();
        String mensajeRecibido=intent.getStringExtra("msje");
        TextView textView = findViewById(R.id.textViewMensaje);
        textView.setText(mensajeRecibido);

        //uso de la camara
        Button buttonCamara = findViewById(R.id.buttonCamara);
        buttonCamara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCamara = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if(intentCamara.resolveActivity(getPackageManager())!=null){
                    startActivityForResult(intentCamara,1);
                }
            }
        });

        btnenviarC = findViewById(R.id.btnEnviarCon);

        btnenviarC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    startActivity(new Intent(recibeComentario.this, MenuActivity.class));
                    Toast.makeText(recibeComentario.this, "Comentario Enviado",Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==1 && resultCode==RESULT_OK){
            Bundle bundle=data.getExtras();
            Bitmap imagen=(Bitmap) bundle.get("data");

            ImageView imageView=findViewById(R.id.imageViewCaptura);
            imageView.setImageBitmap(imagen);
        }
    }
}