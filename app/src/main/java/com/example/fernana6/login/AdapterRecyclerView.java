package com.example.fernana6.login;

import android.content.Context;
import android.graphics.Movie;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by FernanA6 on 11-Apr-18.
 */

public class AdapterRecyclerView extends ArrayAdapter<Persona>{

    private List<Persona> moviesList;

    public AdapterRecyclerView(@NonNull Context context, int resource, @NonNull List<Persona> objects) {
        super(context, resource, objects);
    }

    /*public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, surname, email;

        public MyViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.tvName);
            surname = view.findViewById(R.id.tvSurname);
            email = view.findViewById(R.id.tvEmail);



        }
    }*/

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if(view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.item_person, parent,false);
        }
        Persona persona = getItem(position);

        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvSurname = view.findViewById(R.id.tvSurname);
        TextView tvEmail = view.findViewById(R.id.tvEmail);

        tvName.setText(persona.getName());
        tvSurname.setText(persona.getSurname());
        tvEmail.setText(persona.getEmail());

        return view;
    }

    /*@Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_person, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Movie movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }*/
}

