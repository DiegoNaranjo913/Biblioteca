package com.example.diegonaranjo.biblioteca;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterDeseados extends BaseAdapter {
    private Context context;
    private ArrayList<Entidad> listItem;

    public AdapterDeseados(Context context, ArrayList<Entidad> listItem) {
        this.context = context;
        this.listItem = listItem;
    }

    @Override
    public int getCount() {
        return listItem.size();
    }

    @Override
    public Object getItem(int position) {
        return listItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final Entidad item = (Entidad) getItem(position);

        convertView = LayoutInflater.from(context).inflate(R.layout.listview_item_deseados,null);
        ImageView imagen= (ImageView) convertView.findViewById(R.id.imagendes_list);
        TextView nombre = (TextView) convertView.findViewById(R.id.nombredes_list);
        TextView disponibilidad = (TextView) convertView.findViewById(R.id.disponible_list);


        imagen.setImageResource(item.getImagen());
        nombre.setText(item.getNombre());
        disponibilidad.setText(item.getDisponibilidad());

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,DetalleItem.class);
                intent.putExtra("objectdata",item);
                context.startActivity(intent);
            }
        });


        return convertView;
    }
}
