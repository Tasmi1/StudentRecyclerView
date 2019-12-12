package com.example.studentrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleview);

        // create list of students to displayin recyclerview

        List<students> studentsList = new ArrayList<>();
        studentsList.add(new students("Tasmiya",20,"ktm","Female",R.drawable.aa,R.drawable.ddd));
        studentsList.add(new students("hjh", 20,"ktm","male",R.drawable.bb,R.drawable.ddd));
        studentsList.add(new students("dfhg",20,"hgbj","others",R.drawable.cc,R.drawable.ddd));

       studentadapter studentadapter=new studentadapter(this,studentsList);
       recyclerView.setAdapter(studentadapter);
       recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
}
