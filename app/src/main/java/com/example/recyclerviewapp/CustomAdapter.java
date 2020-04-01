package com.example.recyclerviewapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<Movie> movies;
    private Context context;

    public CustomAdapter(ArrayList<Movie> movies) {
        this.movies = movies;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View movie = inflater.inflate(R.layout.rowlayout, parent, false);
        ViewHolder viewHolder = new ViewHolder((movie));
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Movie film = movies.get(position);

        holder.setTitle(film.getTitle());
        holder.setGenre(film.getGenre());
        holder.setYear(film.getYear());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Toast.makeText(context,film.getTitle() , Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public int getItemCount() {
        return movies.size();
    }
}
