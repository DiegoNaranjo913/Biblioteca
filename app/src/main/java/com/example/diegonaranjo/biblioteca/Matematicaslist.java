package com.example.diegonaranjo.biblioteca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Matematicaslist extends AppCompatActivity {
    private ListView listView;
    private ArrayList<Entidad> listaobject;
    private Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matematicaslist);

        listView = (ListView) findViewById(R.id.listamat);
        listaobject = getarraylist();
        adapter = new Adapter(this,listaobject);

        listView.setAdapter(adapter);
    }

    private ArrayList<Entidad> getarraylist(){
        ArrayList<Entidad> listaobj = new ArrayList<>();

        listaobj.add(new Entidad(R.drawable.ecuacionesdi,"Ecuaciones Diferenciales","Dennis G. Zill","Iberoamérica","1250","3","0 Dias"));
        listaobj.add(new Entidad(R.drawable.algebralineal,"Algebra Lineal","Stanley I. Grossman","Mc Graw Hill","700","3","0 Dias"));
        listaobj.add(new Entidad(R.drawable.matematicasdiscre,"Matematicas Discretas","Richard Johnsonbaugh","Pearson","1300","0","1 Dias"));
        listaobj.add(new Entidad(R.drawable.calculointegral,"Calculo Integral","Germán Rojas","Escuela Politécnica","1200","0","2 Dias"));

        return listaobj;
    }
}
