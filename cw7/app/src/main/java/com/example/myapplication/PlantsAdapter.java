package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class PlantsAdapter extends ArrayAdapter {
    List<Plants> plantslist;
    public PlantsAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        plantslist = objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.item_row, parent, false);
        Plants currentplant = plantslist.get(position);

        TextView nametxt = view.findViewById(R.id.txtname);
        TextView pricetxt = view.findViewById(R.id.txtprice);
        TextView typetxt = view.findViewById(R.id.txttype);
        ImageView plantimg = view.findViewById(R.id.img);

        nametxt.setText(currentplant.getPlantName());
        typetxt.setText(currentplant.getPlantType());
        plantimg.setImageResource(currentplant.getPlantPhoto());
        pricetxt.setText(currentplant.getPlantPrice() + " KD");

        return view;
    }

}
