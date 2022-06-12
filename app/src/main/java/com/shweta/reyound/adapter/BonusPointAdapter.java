package com.shweta.reyound.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shweta.reyound.R;
import com.shweta.reyound.di.module.BonusPointModel;
import com.shweta.reyound.di.module.HomeData;

import java.util.ArrayList;

public class BonusPointAdapter extends RecyclerView.Adapter<BonusPointAdapter.RecyclerViewHolder> {

    private ArrayList<BonusPointModel> bonusDataArrayList;
    private Context mcontext;

    public BonusPointAdapter(ArrayList<BonusPointModel> bonusDataArrayList, Context mcontext) {
        this.bonusDataArrayList = bonusDataArrayList;
        this.mcontext = mcontext;
    }

    @NonNull
    @Override
    public BonusPointAdapter.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflate Layout
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_earn_coin, parent, false);
        return new BonusPointAdapter.RecyclerViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull BonusPointAdapter.RecyclerViewHolder holder, int position) {
        // Set the data to textview and imageview.
        BonusPointModel recyclerData = bonusDataArrayList.get(position);
        holder.txt_name.setText(recyclerData.getName());
        holder.img_image.setImageResource(recyclerData.getImage());
    }

    @Override
    public int getItemCount() {
        // this method returns the size of recyclerview
        return bonusDataArrayList.size();
    }

    // View Holder Class to handle Recycler View.
    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        private TextView txt_name;
        private ImageView img_image;
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_name = itemView.findViewById(R.id.txt_name);
            img_image = itemView.findViewById(R.id.img_image);
        }
    }
}
