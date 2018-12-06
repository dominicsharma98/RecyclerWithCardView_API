package com.example.akash.recyclerwithcardview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.viewHolder> {



    private List<person> persons;



    public MyAdapter(List<person> persons){

        this.persons=persons;

    }


    public  class viewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView info;
        ImageView photo;


        public viewHolder(@NonNull View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.heading);
            info=itemView.findViewById(R.id.subheading);
            photo=itemView.findViewById(R.id.photo);
        }

    }


    @NonNull
    @Override
    public MyAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.cardlayout,viewGroup,false);

        return new viewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.viewHolder viewHolder, int i) {

        person p1 = persons.get(i);
        viewHolder.name.setText(p1.getName());
        viewHolder.info.setText(p1.getInfo());
        viewHolder.photo.setImageResource(R.drawable.ic_launcher_background);


    }

    @Override
    public int getItemCount() {
        return persons.size();
    }
}
