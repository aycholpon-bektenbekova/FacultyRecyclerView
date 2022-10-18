package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> facultyList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_faculty);
        facultyList.add("Design");
        facultyList.add("Art");
        facultyList.add("History");
        facultyList.add("IT");
        facultyList.add("Music");
        facultyList.add("Films");
        facultyList.add("Philosophia");
        facultyList.add("Botanika");
        FacultyAdapter adapter = new FacultyAdapter(facultyList);
        recyclerView.setAdapter(adapter);
    }
}