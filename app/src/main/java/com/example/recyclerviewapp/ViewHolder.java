package com.example.recyclerviewapp;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder{
    private TextView title;
    private TextView genre;
    private TextView year;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        this.title = itemView.findViewById(R.id.title);
        this.genre = itemView.findViewById(R.id.genre);
        this.year = itemView.findViewById(R.id.year);
    }

    public TextView getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title.setText(title);
    }

    public TextView getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre.setText(genre);
    }

    public TextView getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year.setText(String.valueOf(year));
    }
}
