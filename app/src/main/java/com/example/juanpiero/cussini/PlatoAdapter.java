package com.example.juanpiero.cussini;

/**
 * Created by Juan Piero on 10/10/2017.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

import Variables.Plato;

import static com.example.juanpiero.cussini.R.id.nombre;

/**
 * Created by Juan Piero on 10/10/2017.
 */

public class PlatoAdapter extends RecyclerView.Adapter<PlatoAdapter.RestaurantViewHolder>{
    private List<Plato> items;
    private OfertasFragment ofertasFragment;
    public TextView NombrePlato;

    public static class RestaurantViewHolder extends RecyclerView.ViewHolder{
        public ImageView imagen;
        public TextView nombre;
        public RatingBar ratingBar;
        public View view;

        public RestaurantViewHolder (View v) {
            super(v);
            imagen = (ImageView) v.findViewById(R.id.imagen);
            nombre = (TextView) v.findViewById(R.id.nombre);
            ratingBar = (RatingBar) v.findViewById(R.id.ratingBar);
/*
            view = v;

            view.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    // item clicked
                    // ofertasFragment.lanzaActividad();

                    // Bundle bundle = new Bundle();
                    Plato plato = new Plato(4, R.drawable.plato3, "Carne Estofada",2.7,20);
                    // bundle.putString("Nombre",nombre.getText().toString()

                    Context context = view.getContext();

                    Intent intent = new Intent(context, DetallePlatoActivity.class);
                    intent.putExtra("Nombre",nombre.getText().toString());
                    intent.putExtra("Plato",plato);
                    context.startActivity(intent);
                }
            });
*/
        }
    }

    public PlatoAdapter(List<Plato> items) {
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public RestaurantViewHolder onCreateViewHolder(ViewGroup viewGroup, int t) {

        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_restaurant, viewGroup, false);
        return new RestaurantViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final RestaurantViewHolder viewHolder, int i){
        viewHolder.imagen.setImageResource(items.get(i).getImagen());
        viewHolder.nombre.setText(items.get(i).getNombre());
        viewHolder.ratingBar.setRating(Float.parseFloat(String.valueOf(items.get(i).getRate())));
        final int ID = i;

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    NombrePlato = (TextView) v.findViewById(nombre);

                    Plato plato2 = items.get(ID);
                    Context context = viewHolder.itemView.getContext();

                    Intent intent = new Intent(context, DetallePlatoActivity.class);
                    intent.putExtra("Plato",plato2);
                    context.startActivity(intent);
                }
            });
/*
        viewHolder.itemView.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction() == MotionEvent.ACTION_MOVE){
                    ofertasFragment.lanzaActividad();
                }
                return true;
            }
        });
*/
    }

}
