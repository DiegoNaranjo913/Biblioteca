package com.example.diegonaranjo.biblioteca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleItem extends AppCompatActivity {

    private ImageView imagen;
    private EditText nombre,tiempo,disponibilidad,paginas,editorial,autor;
    private Entidad item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_item);

        item = (Entidad) getIntent().getSerializableExtra("objectdata");
        imagen =(ImageView) findViewById(R.id.imagendes);
        nombre = (EditText) findViewById(R.id.detnombre);
        tiempo = (EditText) findViewById(R.id.dettiempo);
        disponibilidad = (EditText) findViewById(R.id.detdisponi);
        paginas = (EditText) findViewById(R.id.detpaginas);
        editorial = (EditText) findViewById(R.id.deteditorial);
        autor = (EditText) findViewById(R.id.detautor);

        nombre.setText(item.getNombre());
        tiempo.setText(item.getTiempo());
        disponibilidad.setText(item.getDisponibilidad());
        paginas.setText(item.getPaginas());
        editorial.setText(item.getEditorial());
        autor.setText(item.getAutor());
        imagen.setImageResource(item.getImagen());

    }
}
