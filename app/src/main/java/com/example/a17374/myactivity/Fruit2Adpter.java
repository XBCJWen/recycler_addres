package com.example.a17374.myactivity;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;
public class Fruit2Adpter extends RecyclerView.Adapter<Fruit2Adpter.ViewHolader> {

    private List<Fruit2> mF2;
    static class ViewHolader extends RecyclerView.ViewHolder{
        ImageView img1;

        public ViewHolader(@NonNull View itemView) {
            super(itemView);
            img1=(ImageView)itemView.findViewById(R.id.imageView);
        }
    }
    public  Fruit2Adpter (List<Fruit2> fruit2s){
        mF2=fruit2s;
    }

    @NonNull
    @Override
    public ViewHolader onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_2,viewGroup,false);
        ViewHolader holder=new ViewHolader(view);
        return  holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolader viewHolader, int i) {
        Fruit2 fruit2=mF2.get(i);
        viewHolader.img1.setImageResource(fruit2.getImage1());

    }

    @Override
    public int getItemCount() {
        return mF2.size();
    }

}
