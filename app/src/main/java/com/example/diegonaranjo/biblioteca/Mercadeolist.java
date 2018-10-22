package com.example.diegonaranjo.biblioteca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Mercadeolist extends AppCompatActivity {
    private ListView listView;
    private ArrayList<Entidad> listaobject;
    private Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercadeolist);
        listView = (ListView) findViewById(R.id.listamer);
        listaobject = getarraylist();
        adapter = new Adapter(this,listaobject);

        listView.setAdapter(adapter);
    }

    private ArrayList<Entidad> getarraylist(){
        ArrayList<Entidad> listaobj = new ArrayList<>();

        listaobj.add(new Entidad(R.drawable.mercadeo1,"Comercio y Mercadeo Electrónico","Jorge E. Pereira","Neoediciones","750","1","0 Dias"));
        listaobj.add(new Entidad(R.drawable.mercadeo2,"Cómo Construir Líderes en Redes de Mercadeo","Tom Schreiter","","450","0","1 Dias"));
        listaobj.add(new Entidad(R.drawable.mercadeo3,"Glosario de Términos de Mercadeo y Venta","Jorge E. Pereira","Neoediciones","500","4","0 Dias"));

        return listaobj;
    }
}
