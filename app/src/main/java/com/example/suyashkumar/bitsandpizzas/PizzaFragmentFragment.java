package com.example.suyashkumar.bitsandpizzas;

import android.app.ListActivity;
import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.suyashkumar.bitsandpizzas.dummy.DummyContent;
import com.example.suyashkumar.bitsandpizzas.dummy.DummyContent.DummyItem;

import java.util.List;

public class PizzaFragmentFragment extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                inflater.getContext(),
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.pizzas)
        );

        setListAdapter(adapter);
        return super.onCreateView(inflater,container, savedInstanceState);
    }

}
