package com.example.juanpiero.cussini;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import Variables.Plato;

public class DetallePlatoActivity extends AppCompatActivity {

    private TextView TxtNombre;
    public ImageView ImgPlato;
    public RatingBar ratingBar;
    private TextView TxtCosto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_plato);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        TxtNombre = (TextView) findViewById(R.id.txtNombrePlato);
        ImgPlato = (ImageView) findViewById(R.id.imgPlato);
        ratingBar = (RatingBar) findViewById(R.id.ratingBar2);
        TxtCosto = (TextView) findViewById(R.id.txtCostoPlato);

        Plato plato = (Plato) this.getIntent().getSerializableExtra("Plato");

        TxtNombre.setText(plato.getNombre());
        ImgPlato.setImageResource(plato.getImagen());
        ratingBar.setRating(Float.parseFloat(Double.toString(plato.getRate())));
        TxtCosto.setText("S/. "+Double.toString(plato.getCosto())+"0");

    }

}
