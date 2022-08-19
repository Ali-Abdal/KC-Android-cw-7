package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Plants> plants = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Plants plant1 = new Plants("Cactus", R.drawable.cactus, 1.5, "Indoor");
        Plants plant2 = new Plants("Palm", R.drawable.palm3, 500, "Outdoor");
        Plants plant3 = new Plants("Sunflower", R.drawable.sunflower, 0.5, "Outdoor");
        Plants plant4 = new Plants("Rose", R.drawable.rose, 0.3, "Both");
        Plants plant5 = new Plants("Bamboo", R.drawable.bamboo, 1.75, "Indoor");

        plants.add(plant1);
        plants.add(plant2);
        plants.add(plant3);
        plants.add(plant4);
        plants.add(plant5);

        PlantsAdapter plantsAdapter = new PlantsAdapter(this, 0, plants);
        ListView listView = findViewById(R.id.lstview);
        listView.setAdapter(plantsAdapter);
    }
}