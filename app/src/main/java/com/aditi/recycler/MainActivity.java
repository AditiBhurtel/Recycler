package com.aditi.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SimpleRecyclerViewAdapter adapter;
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;


//    ArrayList<String> myApiData = new ArrayList<>();
    ArrayList<AnimalModel> myApiData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Tag","Hello");

//        myApiData.add("Ram");
//        myApiData.add("Shyam");
//        myApiData.add("Hari");
//        myApiData.add("Sita");
//        myApiData.add("Gita");
//        myApiData.add("Rita");
//        myApiData.add("Ria");


        myApiData.add(new AnimalModel(
                "Dog",
                "Richie",
                "Japanese Spitz",
                "white",
                true));

        myApiData.add(new AnimalModel(
                "Cat",
                "Jackie",
                "Persian Cat",
                "white",
                false));

        myApiData.add(new AnimalModel(
                "Dog",
                "Tiger",
                "Golden Retriever",
                "Brown",
                true));


        myApiData.add(new AnimalModel(
                "Dog",
                "Rockie",
                "Husky",
                "white",
                true));

        recyclerView = findViewById(R.id.recycler_view);
//        adapter = new SimpleRecyclerViewAdapter(this, myApiData);
        adapter = new SimpleRecyclerViewAdapter(myApiData, new OnRecyclerItemClick() {
            @Override
            public void onClick(AnimalModel selectedAnimal) {
                Toast.makeText(MainActivity.this,selectedAnimal.getName(), Toast.LENGTH_SHORT).show();

            }
        });
        layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

}

