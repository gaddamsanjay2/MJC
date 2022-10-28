package com.example.mjc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ModelClass> modelClassList=new ArrayList<>();

    ModelClass modelClass;
    AdapterClass adapterClass;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.statusbar));

        recyclerView=findViewById(R.id.RecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapterClass = new AdapterClass(this, modelClassList);
        recyclerView.setAdapter(adapterClass);

        loadData();


    }

    private void loadData() {
        modelClass=new ModelClass("1234567890","Hyderabad","123456","NW8 8QN","12-12-22 12:00 Am","12-12-22 12:00 pm"
                ,"the capital and largest city of the Indian state of Telangana.");

        modelClassList.add(modelClass);


        modelClass=new ModelClass("1234567890","Telangana","123456","NW8 8QN","12-12-22 12:00 Am","12-12-22 12:00 pm"
                ,"the capital and largest city of the Indian state of Telangana.");

        modelClassList.add(modelClass);


        modelClass=new ModelClass("1234567890","Delhi","123456","NW8 8QN","12-12-22 12:00 Am","12-12-22 12:00 pm"
                ,"the capital and largest city of the Indian state of Delhi.");

        modelClassList.add(modelClass);


        modelClass=new ModelClass("1234567890","Mumbai","123456","NW8 8QN","12-12-22 12:00 Am","12-12-22 12:00 pm"
                ,"the capital and largest city of the Indian state of Mumbai.");
        modelClassList.add(modelClass);

        modelClass=new ModelClass("1234567890","Pune","123456","NW8 8QN","12-12-22 12:00 Am","12-12-22 12:00 pm"
                ,"the capital and largest city of the Indian state of Pune.");

        modelClassList.add(modelClass);

        modelClass=new ModelClass("1234567890","Goa","123456","NW8 8QN","12-12-22 12:00 Am","12-12-22 12:00 pm"
                ,"the capital and largest city of the Indian state of Goa.");

        modelClassList.add(modelClass);


        modelClass=new ModelClass("1234567890","Bihar","123456","NW8 8QN","12-12-22 12:00 Am","12-12-22 12:00 pm"
                ,"the capital and largest city of the Indian state of Bihar.");

        modelClassList.add(modelClass);


        modelClass=new ModelClass("1234567890","Kerla","123456","NW8 8QN","12-12-22 12:00 Am","12-12-22 12:00 pm"
                ,"the capital and largest city of the Indian state of kerla.");
        modelClassList.add(modelClass);


        modelClass=new ModelClass("1234567890","Hampi","123456","NW8 8QN","12-12-22 12:00 Am","12-12-22 12:00 pm"
                ,"the capital and largest city of the Indian state of Hampi.");
        modelClassList.add(modelClass);

    }

}