package com.example.suyashkumar.bitsandpizzas;


import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class PizzaMaterialFragment extends Fragment {


    public PizzaMaterialFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        RecyclerView pizzaRecycler = (RecyclerView)inflater.inflate(R.layout.fragment_pizza_material, container, false);

        String[] pizzaNames = new String[Pizza.pizzas.length];
        int[] pizzaIds = new int[Pizza.pizzas.length];

        for(int i=0;i<Pizza.pizzas.length;i++)
        {
            pizzaNames[i] = Pizza.pizzas[i].getName();
            pizzaIds[i] = Pizza.pizzas[i].getImgResourceId();
        }

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(pizzaNames, pizzaIds);
        pizzaRecycler.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        pizzaRecycler.setLayoutManager(layoutManager);

        return pizzaRecycler;
    }

}
