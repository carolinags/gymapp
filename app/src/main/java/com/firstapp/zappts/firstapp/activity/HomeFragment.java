package com.firstapp.zappts.firstapp.activity;

/**
 * Created by zappts on 3/9/16.
 */

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
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
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        final FragmentActivity c = getActivity();
        final RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(c);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        initializeData();

        RecycleViewAdapter adapter = new RecycleViewAdapter(persons);
        recyclerView.setAdapter(adapter);

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
        persons.add(new Person("Stiff", "Treino A", R.drawable.cross1));
        persons.add(new Person("Stiff 2", "Treino A", R.drawable.cross2));
        persons.add(new Person("NoLembroNome", "Treino B", R.drawable.cross3));
        persons.add(new Person("Terra", "Treino B", R.drawable.cross4));
        persons.add(new Person("Puxada", "Treino B", R.drawable.cross5));
        persons.add(new Person("Supino", "Treino A", R.drawable.cross6));
        persons.add(new Person("Agachamento", "Treino A", R.drawable.cross7));
        persons.add(new Person("Remada", "Treino B", R.drawable.cross8));
    }
}