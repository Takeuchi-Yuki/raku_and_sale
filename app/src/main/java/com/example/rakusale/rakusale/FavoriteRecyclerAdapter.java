package com.example.rakusale.rakusale;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class FavoriteRecyclerAdapter extends RecyclerView.Adapter<FavoriteRecyclerAdapter.ViewHolder> {
    private List<Shop> itemList = new ArrayList<>();

    public FavoriteRecyclerAdapter(){
        for(int i = 0;i < 100;i++){
            itemList.add(new Shop("お店" + i,"",""));
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_favorite_recycler_view,viewGroup,false));
    }

    public int getItemCount(){
        return itemList.size();
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        String shopName = itemList.get(position).getName();
        viewHolder.shopNameTextView.setText(shopName);
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView shopNameTextView;
        public ImageView shopImageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            shopNameTextView = itemView.findViewById(R.id.shop_name_text_view);
        }
    }
}