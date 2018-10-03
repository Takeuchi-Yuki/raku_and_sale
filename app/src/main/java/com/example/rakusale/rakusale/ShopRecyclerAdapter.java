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

public class ShopRecyclerAdapter extends RecyclerView.Adapter<ShopRecyclerAdapter.ViewHolder> {
    private List<Shop> itemList = new ArrayList<>();

    public ShopRecyclerAdapter(){
        for(int i = 0;i < 100;i++){
            itemList.add(new Shop("お店" + i,"","渋谷区"));
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_shop_recycler_view,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        String shopName = itemList.get(position).getName();
        String shopLocation = itemList.get(position).getLocation();
        viewHolder.shopNameTextView.setText(shopName);
        viewHolder.shopLocationTextView.setText(shopLocation);
    }

    public int getItemCount(){
        return itemList.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView shopNameTextView;
        public ImageView shopImageView;
        public TextView shopLocationTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            shopNameTextView = itemView.findViewById(R.id.shop_name_text_view);
            shopLocationTextView = itemView.findViewById(R.id.shop_location_text_view);

        }
    }
}
