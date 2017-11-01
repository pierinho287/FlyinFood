package com.example.juanpiero.cussini;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import Variables.Plato;


public class OfertasFragment extends Fragment {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private List<Plato> Items;
    //Context context;

    public static OfertasFragment newInstance(){
        OfertasFragment ofertasFragment = new OfertasFragment();
        return ofertasFragment;
    }

    public void setRecycler(RecyclerView recycler) {
        this.recycler = recycler;
    }

    public OfertasFragment(){

    }

    public List<Plato> getItems() {
        return Items;
    }

    public void setItems(List<Plato> items) {
        Items = items;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_ofertas, container, false);

    // Obtener el Recycler
            recycler = (RecyclerView) v.findViewById(R.id.reciclador);
            recycler.setHasFixedSize(true);

    // Usar un administrador para LinearLayout
            LinearLayoutManager lManager = new LinearLayoutManager(v.getContext());
            recycler.setLayoutManager(lManager);

    // Crear un nuevo adaptador
            adapter = new PlatoAdapter(this.Items);
            recycler.setAdapter(adapter);

        return v;
    }

}
