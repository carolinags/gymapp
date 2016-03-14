package com.firstapp.zappts.firstapp.activity;

/**
 * Created by zappts on 3/9/16.
 */

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.firstapp.zappts.firstapp.R;
import com.firstapp.zappts.firstapp.adapter.RecycleViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private List<Person> persons;
    private RecyclerView rv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        rv=(RecyclerView)getView().findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(getContext());
        rv.setLayoutManager(llm);
        rv.setHasFixedSize(true);

        initializeData();
        initializeAdapter();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.recycle_view, container, false);


        // Inflate the layout for this fragment
        return rootView;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    private void initializeData(){
        persons = new ArrayList<>();
        persons.add(new Person("Emma Wilson", "23 years old", R.drawable.cross1));
        persons.add(new Person("Lavery Maiss", "25 years old", R.drawable.cross2));
        persons.add(new Person("Lillie Watts", "35 years old", R.drawable.cross3));
    }

    private void initializeAdapter(){
        RecycleViewAdapter adapter = new RecycleViewAdapter(persons);
        rv.setAdapter(adapter);
    }
}