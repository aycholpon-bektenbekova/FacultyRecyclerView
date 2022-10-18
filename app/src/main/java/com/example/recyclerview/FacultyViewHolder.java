package com.example.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FacultyViewHolder extends RecyclerView.ViewHolder {
    private TextView tvFaculty;


    public FacultyViewHolder(@NonNull View itemView) {
        super(itemView);
        tvFaculty = itemView.findViewById(R.id.tv_faculty);
    }

     public void bind (String faculty){
        tvFaculty.setText(faculty);
     }
}
