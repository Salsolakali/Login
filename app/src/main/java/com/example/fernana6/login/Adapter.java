package com.example.fernana6.login;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by FernanA6 on 11-Apr-18.
 */

public class Adapter extends ArrayAdapter <Persona>{
    public Adapter(@NonNull Context context, int resource, @NonNull List<Persona> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
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
}
