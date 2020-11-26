package com.sanju.bottomsheetdummysk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class PantryAdapter extends RecyclerView.Adapter<PantryAdapter.MYViewHolder> {


    private Context context;
    List<String> pantryListData;


    public PantryAdapter(Context context, List<String> pantryListData) {
        this.context = context;
        this.pantryListData = pantryListData;


    }

    @Override
    public MYViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
       // View view = inflater.inflate(R.layout.pantry_single_row, parent, false);
        View view = inflater.inflate(R.layout.item_row, parent, false);
        return new MYViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MYViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return pantryListData.size();
    }




    public class MYViewHolder extends RecyclerView.ViewHolder {

        TextView itemNameTextView;
        TextView itemQuantityTextView, addToCartTextView;
        ImageView itemImageView;

        public MYViewHolder(View itemView) {
            super(itemView);

            itemNameTextView = (TextView) itemView.findViewById(R.id.itemNameTextView);
            itemQuantityTextView = (TextView) itemView.findViewById(R.id.itemQuantityTextView);
            addToCartTextView = (TextView) itemView.findViewById(R.id.addToCartTextView);
            itemImageView = (ImageView) itemView.findViewById(R.id.itemImageView);

        }
    }

}