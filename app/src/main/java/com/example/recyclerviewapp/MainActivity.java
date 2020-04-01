package com.example.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.view);
        Movie firstMovie = new Movie("The notebook","drama",2010);
        Movie secondMovie = new Movie("Home alone","comedy",2013);
        Movie thirdMovie = new Movie("It","horror",2018);
        ArrayList<Movie> mov = new ArrayList<>();
        mov.add(firstMovie);
        mov.add(secondMovie);
        mov.add(thirdMovie);
        CustomAdapter adapter = new CustomAdapter(mov);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
