package com.example.diegonaranjo.biblioteca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Industriallist extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Entidad> listaobject;
    private Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_industriallist);
        listView = (ListView) findViewById(R.id.listaind);
        listaobject = getarraylist();
        adapter = new Adapter(this,listaobject);

        listView.setAdapter(adapter);
    }

    private ArrayList<Entidad> getarraylist(){
        ArrayList<Entidad> listaobj = new ArrayList<>();

        listaobj.add(new Entidad(R.drawable.industrial1,"Expresión Gráfica en Ingeniería Industrial","Jesus Chacón, Javier Reyes","Donostiarra","700","5","0 Dias"));
        listaobj.add(new Entidad(R.drawable.industrial2,"Introducción a la Ingenieria Industrial","Richard C. Vaughn","Reverté","450","0","3 Dias"));
        listaobj.add(new Entidad(R.drawable.industrial3,"Ingeniería Industrial","Gabriel Salvendy","Limusa","500","2","0 Dias"));

        return listaobj;
    }
}
