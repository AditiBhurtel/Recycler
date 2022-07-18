package com.aditi.recycler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        name = findViewById(R.id.detail_name);
        String passedData = getIntent().getStringExtra("name");
        name.setText(passedData);

    }
}