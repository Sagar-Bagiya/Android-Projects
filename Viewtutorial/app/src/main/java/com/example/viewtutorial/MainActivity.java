package com.example.viewtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<String> namesarr = new ArrayList<>();
ListView listView;
ArrayList<String> idproofs = new ArrayList<>();
ArrayList<String> dict = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // ListView //
//        listView = findViewById(R.id.listview);
//        for(int i=0; i<20; i++){
//            namesarr.add("sagar"+i);
//        }
//        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,namesarr);
//        listView.setAdapter(adapter);
//


//        Spinner spinner = findViewById(R.id.spinerview);
//        idproofs.add("adharcard");
//        idproofs.add("pan card");
//        idproofs.add("driving licence");
//        idproofs.add("voter id card");
//        idproofs.add("dummy data");
//
//        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,idproofs);
//        spinner.setAdapter(adapter);


        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompletetextview);

        dict.add("apple");
        dict.add("appleine");
        dict.add("ball");
        dict.add("baling");
        dict.add("cat");
        dict.add("catutching");
        dict.add("catut");
        dict.add("dump");
        dict.add("dumest");
        dict.add("dumy");


        ArrayAdapter adapter =new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dict);
        autoCompleteTextView.setAdapter(adapter);

    }
}