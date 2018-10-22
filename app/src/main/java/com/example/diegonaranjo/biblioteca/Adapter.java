package com.example.diegonaranjo.biblioteca;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    private Context context;
    private ArrayList<Entidad> listItem;

    public Adapter(Context context, ArrayList<Entidad> listItem) {
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
        convertView = LayoutInflater.from(context).inflate(R.layout.listview_item,null);
        ImageView imagen= (ImageView) convertView.findViewById(R.id.imagen_list);
        TextView nombre = (TextView) convertView.findViewById(R.id.nombre_list);


        imagen.setImageResource(item.getImagen());
        nombre.setText(item.getNombre());

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
