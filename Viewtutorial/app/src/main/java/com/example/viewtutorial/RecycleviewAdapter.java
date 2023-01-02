package com.example.viewtutorial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleviewAdapter extends RecyclerView.Adapter<RecycleviewAdapter.Viewholder> {
    Context context;
    ArrayList<ContactModel> mydata;
    public  RecycleviewAdapter(Context context, ArrayList<ContactModel> mydata){
        this.context = context;
        this.mydata = mydata;
    }
    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_card,parent, false);
        Viewholder vh = new Viewholder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
    holder.img.setImageResource(mydata.get(position).img);
    holder.name.setText(mydata.get(position).name);
    holder.number.setText((mydata.get(position)).number);
    }

    @Override
    public int getItemCount() {
        return mydata.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        TextView name, number;
        ImageView img;
        public  Viewholder(View view){
            super(view);
            name = view.findViewById(R.id.name);
            number = view.findViewById(R.id.number);
            img = view.findViewById((R.id.img));
        }
    }
}
