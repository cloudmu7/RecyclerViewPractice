package com.cloud7mu7.recyclerviewpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> items = new ArrayList<>();

    RecyclerView recyclerView;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items.add(new String("aaa"));
        items.add(new String("sss"));
        items.add(new String("ddd"));
        items.add(new String("aff"));
        items.add(new String("gg"));
        items.add(new String("ahhh"));

        recyclerView = findViewById(R.id.recycler1);
        adapter = new MyAdapter(this, items);
        recyclerView.setAdapter(adapter);
    }
}