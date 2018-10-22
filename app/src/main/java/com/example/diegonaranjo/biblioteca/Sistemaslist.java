package com.example.diegonaranjo.biblioteca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Sistemaslist extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Entidad> listaobject;
    private Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistemaslist);
        listView = (ListView) findViewById(R.id.listasis);
        listaobject = getarraylist();
        adapter = new Adapter(this,listaobject);

        listView.setAdapter(adapter);

    }

    private ArrayList<Entidad> getarraylist(){
        ArrayList<Entidad> listaobj = new ArrayList<>();

        listaobj.add(new Entidad(R.drawable.androidstudio,"Android Studio","Jesus Tomas , Vicente Carbonell","Marcombo","300","5","0 Dias"));
        listaobj.add(new Entidad(R.drawable.jqueryjavascript,"Jquery & Javascript","Christophe AUBRY","Eni","1000","7","0 Dias"));
        listaobj.add(new Entidad(R.drawable.html5,"Fundamentos Html 5","Luc VAN LANCKER","Eni","500","0","5 Dias"));
        listaobj.add(new Entidad(R.drawable.php,"PHP 7","Oliver HEURTEL","Eni","500","4","0 Dias"));
        listaobj.add(new Entidad(R.drawable.progrmacionc,"Curso de Programación C/C++","Javier Ceballos","","400","4","0 Dias"));

        return listaobj;
    }
}
