package com.example.viewtutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class recyclerView extends AppCompatActivity {

ArrayList<ContactModel> mydata = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mydata.add(new ContactModel(R.drawable.design_icon2, "sagar bagiya", "9909087054"));
        mydata.add(new ContactModel(R.drawable.design_icon2, "nimesh bgfdx", "9909087054"));
        mydata.add(new ContactModel(R.drawable.design_icon2, "amit guraca", "9909087054"));
        mydata.add(new ContactModel(R.drawable.design_icon2, "amit guraca", "9909087054"));
        mydata.add(new ContactModel(R.drawable.design_icon2, "amit guraca", "9909087054"));
        mydata.add(new ContactModel(R.drawable.design_icon2, "amit guraca", "9909087054"));
        mydata.add(new ContactModel(R.drawable.design_icon2, "amit guraca", "9909087054"));
        mydata.add(new ContactModel(R.drawable.design_icon2, "amit guraca", "9909087054"));
        mydata.add(new ContactModel(R.drawable.design_icon2, "amit guraca", "9909087054"));
        mydata.add(new ContactModel(R.drawable.design_icon2, "amit guraca", "9909087054"));
        mydata.add(new ContactModel(R.drawable.design_icon2, "kamal asdiya", "9909087054"));
        mydata.add(new ContactModel(R.drawable.design_icon2, "kamal asdiya", "9909087054"));
        mydata.add(new ContactModel(R.drawable.design_icon2, "kamal asdiya", "9909087054"));
        mydata.add(new ContactModel(R.drawable.design_icon2, "kamal asdiya", "9909087054"));

        RecycleviewAdapter adapter = new RecycleviewAdapter(this,mydata);
        recyclerView.setAdapter(adapter);
    }
}