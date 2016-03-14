package com.firstapp.zappts.firstapp.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.firstapp.zappts.firstapp.activity.Person;
import com.firstapp.zappts.firstapp.R;

import java.util.List;

/**
 * Created by zappts on 3/14/16.
 */
public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.PersonViewHolder>{

    public static class PersonViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView personName;
        TextView personAge;
        ImageView personPhoto;

        PersonViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            personName = (TextView)itemView.findViewById(R.id.person_name);
            personAge = (TextView)itemView.findViewById(R.id.person_age);
            personPhoto = (ImageView)itemView.findViewById(R.id.person_photo);
        }
    }

    List<Person> persons;

    public RecycleViewAdapter(List<Person> persons){
        this.persons = persons;
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view, viewGroup, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {
        Person person = persons.get(i);
        personViewHolder.personName.setText(person.getName());
        personViewHolder.personAge.setText(person.getAge());
        personViewHolder.personPhoto.setImageResource(person.getPhotoId());
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }
}