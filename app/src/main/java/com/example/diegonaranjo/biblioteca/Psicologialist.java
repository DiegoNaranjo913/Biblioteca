package com.example.diegonaranjo.biblioteca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Psicologialist extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Entidad> listaobject;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psicologialist);

        listView = (ListView) findViewById(R.id.listapsico);
        listaobject = getarraylist();
        adapter = new Adapter(this,listaobject);

        listView.setAdapter(adapter);
    }

    private ArrayList<Entidad> getarraylist(){
        ArrayList<Entidad> listaobj = new ArrayList<>();

        listaobj.add(new Entidad(R.drawable.dsmcasos,"Dsm-5 Casos Clínicos","John W.Barnhill","Panamericana","400","8","0 Dias"));
        listaobj.add(new Entidad(R.drawable.malestarcultura,"El malestar en la Cultura","Sigmund Freud","","600","3","0 Dias"));
        listaobj.add(new Entidad(R.drawable.trastornos,"Trastornos del Desarrollo Infantil","María Dolores,María Tamara","Pirámide","500","0","7 Dias"));

        return listaobj;
    }
}
