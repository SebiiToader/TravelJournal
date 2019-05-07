package com.example.traveljournal;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class TravelJournalActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.travel_journal);

        RecyclerView mRecyclerView;
        RecyclerView.Adapter mAdapter;
        RecyclerView.LayoutManager mLayoutManager;

        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.islands, "Holiday 2017", "Islands"));
        exampleList.add(new ExampleItem(R.drawable.rome, "Fall 2017", "Rome"));
        exampleList.add(new ExampleItem(R.drawable.london, "Summer 2017", "London"));
        exampleList.add(new ExampleItem(R.drawable.paris, "Winter 2017", "Paris"));
        exampleList.add(new ExampleItem(R.drawable.brasov, "Summer 2018", "Brasov"));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
