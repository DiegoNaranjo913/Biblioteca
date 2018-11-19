package com.example.diegonaranjo.biblioteca;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {

private Context context;
private List<Carrera> carrera;

    public RecycleViewAdapter(Context context, List<Carrera> carrera) {
        this.context = context;
        this.carrera = carrera;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view ;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        view = layoutInflater.inflate(R.layout.item_facultad,null);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int i) {

        myViewHolder.titulo.setText(carrera.get(i).getNombre());
        myViewHolder.imagen.setImageResource(carrera.get(i).getImagen());
        myViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(carrera.get(i).getNombre().equals("Sistemas")){
                    Intent intent = new Intent(context,Sistemaslist.class);
                    context.startActivity(intent);
                }else if(carrera.get(i).getNombre().equals("Psicologia")){
                    Intent intent = new Intent(context,Psicologialist.class);
                    context.startActivity(intent);
                }else if(carrera.get(i).getNombre().equals("Industrial")){
                    Intent intent = new Intent(context,Industriallist.class);
                    context.startActivity(intent);
                }else if(carrera.get(i).getNombre().equals("Matematicas")){
                    Intent intent = new Intent(context,Matematicaslist.class);
                    context.startActivity(intent);
                }else if(carrera.get(i).getNombre().equals("Negocios")){
                    Intent intent = new Intent(context,Negocioslist.class);
                    context.startActivity(intent);
                }else if(carrera.get(i).getNombre().equals("Mercadeo")){
                    Intent intent = new Intent(context,Mercadeolist.class);
                    context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return carrera.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView titulo;
        ImageView imagen;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo = (TextView) itemView.findViewById(R.id.titulocard);
            imagen = (ImageView) itemView.findViewById(R.id.imagencard);
            cardView = (CardView) itemView.findViewById(R.id.cardview);

        }
    }

}
