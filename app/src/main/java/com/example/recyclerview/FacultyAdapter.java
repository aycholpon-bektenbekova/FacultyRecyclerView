package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FacultyAdapter extends RecyclerView.Adapter<FacultyViewHolder> {

    private ArrayList<String> facultyList;

    public FacultyAdapter(ArrayList<String> facultyList) {
        this.facultyList = facultyList;
    }


    @NonNull
    @Override
    public FacultyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FacultyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_faculty, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull FacultyViewHolder holder, int position) {
        holder.bind(facultyList.get(position));

    }

    @Override
    public int getItemCount() {
        return facultyList.size();
    }
}
