package com.example.diegonaranjo.biblioteca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Negocioslist extends AppCompatActivity {
    private ListView listView;
    private ArrayList<Entidad> listaobject;
    private Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_negocioslist);
        listView = (ListView) findViewById(R.id.listaneg);
        listaobject = getarraylist();
        adapter = new Adapter(this,listaobject);

        listView.setAdapter(adapter);
    }

    private ArrayList<Entidad> getarraylist(){
        ArrayList<Entidad> listaobj = new ArrayList<>();

        listaobj.add(new Entidad(R.drawable.negocios1,"Plan de Negocios","Michael Winicott","","200","2","0 Dias"));
        listaobj.add(new Entidad(R.drawable.negocios2,"El Negocio del Siglo 21","Robert T. Kiyosaki","Aguilar","600","0","2 Dias"));
        listaobj.add(new Entidad(R.drawable.negocios3,"El Plan de Negocios","Antonio Borello","Mc Graw Hill","550","2","0 Dias"));

        return listaobj;
    }
}
