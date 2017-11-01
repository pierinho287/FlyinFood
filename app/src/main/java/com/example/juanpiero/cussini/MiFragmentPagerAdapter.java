package com.example.juanpiero.cussini;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import Variables.Plato;

/**
 * Created by Juan Piero on 09/10/2017.
 */

public class MiFragmentPagerAdapter extends FragmentPagerAdapter {

    private int PAGE_COUNT;
    private String tabTitles[];

    public MiFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void settabTitles(String[] tabTitles) {
        this.tabTitles = tabTitles;
    }

    public void setPAGE_COUNT(int PAGE_COUNT) {
        this.PAGE_COUNT = PAGE_COUNT;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        // Fragment f = null;
        OfertasFragment f = new OfertasFragment();
        List items = new ArrayList();


        switch(position) {
            case 0:
                items.add(new Plato(1, R.drawable.plato, "Pollo Estofado",4.2,12));
                items.add(new Plato(2, R.drawable.plato1, "Tallarines",2.7,10));
                items.add(new Plato(3, R.drawable.plato2, "Arroz con Ensalada y Menestra",3.5,15));
                items.add(new Plato(4, R.drawable.plato3, "Carne Estofada",2.7,20));
                items.add(new Plato(5, R.drawable.plato4, "Ceviche",1.7,18));

                f.setItems(items);
                break;
            case 2:
            case 4:
                // f = RestaurantesFragment.newInstance(0);
                // f = OfertasFragment.newInstance();

                items.add(new Plato(2, R.drawable.plato1, "Tallarines",2.7,10));
                items.add(new Plato(3, R.drawable.plato2, "Arroz con Ensalada y Menestra",3.5,15));
                items.add(new Plato(4, R.drawable.plato3, "Carne Estofada",2.7,20));
                items.add(new Plato(5, R.drawable.plato4, "Ceviche",1.7,18));

                f.setItems(items);
                //f.newInstance();
                break;
            case 1:
                items.add(new Plato(4, R.drawable.plato3, "Carne Estofada",2.7,20));

                f.setItems(items);
                break;
            case 3:
            case 5:
                items.add(new Plato(3, R.drawable.plato2, "Arroz con Ensalada y Menestra",3.5,15));
                items.add(new Plato(4, R.drawable.plato3, "Carne Estofada",2.7,20));
                items.add(new Plato(5, R.drawable.plato4, "Ceviche",1.7,18));

                f.setItems(items);
                break;
        }

        return f;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

}